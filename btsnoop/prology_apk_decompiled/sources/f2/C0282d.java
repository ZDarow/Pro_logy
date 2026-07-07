package f2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0282d extends AbstractMap {

    /* renamed from: l, reason: collision with root package name */
    public transient C0280b f5553l;

    /* renamed from: m, reason: collision with root package name */
    public transient C0292n f5554m;

    /* renamed from: n, reason: collision with root package name */
    public final transient Map f5555n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f5556o;

    public C0282d(Z z4, Map map) {
        this.f5556o = z4;
        this.f5555n = map;
    }

    public final C0277E a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        Z z4 = this.f5556o;
        z4.getClass();
        List list = (List) collection;
        return new C0277E(key, list instanceof RandomAccess ? new C0290l(z4, key, list, null) : new C0290l(z4, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Z z4 = this.f5556o;
        if (this.f5555n == z4.f5536o) {
            z4.c();
            return;
        }
        C0281c c0281c = new C0281c(this);
        while (c0281c.hasNext()) {
            c0281c.next();
            c0281c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f5555n;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0280b c0280b = this.f5553l;
        if (c0280b != null) {
            return c0280b;
        }
        C0280b c0280b2 = new C0280b(this);
        this.f5553l = c0280b2;
        return c0280b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f5555n.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f5555n;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        Z z4 = this.f5556o;
        z4.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0290l(z4, obj, list, null) : new C0290l(z4, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f5555n.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Z z4 = this.f5556o;
        Set set = z4.f5601l;
        if (set == null) {
            Map map = z4.f5536o;
            set = map instanceof NavigableMap ? new C0285g(z4, (NavigableMap) map) : map instanceof SortedMap ? new C0288j(z4, (SortedMap) map) : new C0283e(z4, map);
            z4.f5601l = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f5555n.remove(obj);
        if (collection == null) {
            return null;
        }
        Z z4 = this.f5556o;
        Collection d4 = z4.d();
        d4.addAll(collection);
        z4.f5537p -= collection.size();
        collection.clear();
        return d4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5555n.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f5555n.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0292n c0292n = this.f5554m;
        if (c0292n != null) {
            return c0292n;
        }
        C0292n c0292n2 = new C0292n(this);
        this.f5554m = c0292n2;
        return c0292n2;
    }
}
