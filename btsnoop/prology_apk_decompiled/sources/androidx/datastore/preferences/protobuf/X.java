package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class X extends AbstractMap {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f4047q = 0;

    /* renamed from: l, reason: collision with root package name */
    public List f4048l;

    /* renamed from: m, reason: collision with root package name */
    public Map f4049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4050n;

    /* renamed from: o, reason: collision with root package name */
    public volatile a0 f4051o;

    /* renamed from: p, reason: collision with root package name */
    public Map f4052p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.X] */
    public static X f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f4048l = Collections.emptyList();
        abstractMap.f4049m = Collections.emptyMap();
        abstractMap.f4052p = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i4;
        int size = this.f4048l.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((Y) this.f4048l.get(i5)).f4053l);
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((Y) this.f4048l.get(i7)).f4053l);
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    public final void b() {
        if (this.f4050n) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i4) {
        return (Map.Entry) this.f4048l.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4048l.isEmpty()) {
            this.f4048l.clear();
        }
        if (this.f4049m.isEmpty()) {
            return;
        }
        this.f4049m.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4049m.containsKey(comparable);
    }

    public final Set d() {
        return this.f4049m.isEmpty() ? Collections.emptySet() : this.f4049m.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4049m.isEmpty() && !(this.f4049m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4049m = treeMap;
            this.f4052p = treeMap.descendingMap();
        }
        return (SortedMap) this.f4049m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4051o == null) {
            this.f4051o = new a0(this, 0);
        }
        return this.f4051o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x3 = (X) obj;
        int size = size();
        if (size != x3.size()) {
            return false;
        }
        int size2 = this.f4048l.size();
        if (size2 != x3.f4048l.size()) {
            return ((AbstractSet) entrySet()).equals(x3.entrySet());
        }
        for (int i4 = 0; i4 < size2; i4++) {
            if (!c(i4).equals(x3.c(i4))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4049m.equals(x3.f4049m);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a4 = a(comparable);
        if (a4 >= 0) {
            return ((Y) this.f4048l.get(a4)).setValue(obj);
        }
        b();
        if (this.f4048l.isEmpty() && !(this.f4048l instanceof ArrayList)) {
            this.f4048l = new ArrayList(16);
        }
        int i4 = -(a4 + 1);
        if (i4 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4048l.size() == 16) {
            Y y4 = (Y) this.f4048l.remove(15);
            e().put(y4.f4053l, y4.f4054m);
        }
        this.f4048l.add(i4, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        return a4 >= 0 ? ((Y) this.f4048l.get(a4)).f4054m : this.f4049m.get(comparable);
    }

    public final Object h(int i4) {
        b();
        Object obj = ((Y) this.f4048l.remove(i4)).f4054m;
        if (!this.f4049m.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4048l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4048l.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((Y) this.f4048l.get(i5)).hashCode();
        }
        return this.f4049m.size() > 0 ? i4 + this.f4049m.hashCode() : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        if (a4 >= 0) {
            return h(a4);
        }
        if (this.f4049m.isEmpty()) {
            return null;
        }
        return this.f4049m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4049m.size() + this.f4048l.size();
    }
}
