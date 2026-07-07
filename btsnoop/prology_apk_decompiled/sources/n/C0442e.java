package n;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442e extends j implements Map {

    /* renamed from: o, reason: collision with root package name */
    public a0 f7347o;

    /* renamed from: p, reason: collision with root package name */
    public C0439b f7348p;

    /* renamed from: q, reason: collision with root package name */
    public C0441d f7349q;

    @Override // java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.f7347o;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, 1);
        this.f7347o = a0Var2;
        return a0Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i4 = this.f7367n;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.f7367n;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0439b c0439b = this.f7348p;
        if (c0439b != null) {
            return c0439b;
        }
        C0439b c0439b2 = new C0439b(this);
        this.f7348p = c0439b2;
        return c0439b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f7367n;
        int i4 = this.f7367n;
        int[] iArr = this.f7365l;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            k3.h.d(copyOf, "copyOf(this, newSize)");
            this.f7365l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7366m, size * 2);
            k3.h.d(copyOf2, "copyOf(this, newSize)");
            this.f7366m = copyOf2;
        }
        if (this.f7367n != i4) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0441d c0441d = this.f7349q;
        if (c0441d != null) {
            return c0441d;
        }
        C0441d c0441d2 = new C0441d(this);
        this.f7349q = c0441d2;
        return c0441d2;
    }
}
