package f2;

import java.util.Map;

/* loaded from: classes.dex */
public final class e0 extends M {

    /* renamed from: o, reason: collision with root package name */
    public final transient h0 f5560o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Object[] f5561p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int f5562q;

    public e0(h0 h0Var, Object[] objArr, int i4) {
        this.f5560o = h0Var;
        this.f5561p = objArr;
        this.f5562q = i4;
    }

    @Override // f2.AbstractC0276D
    public final int b(int i4, Object[] objArr) {
        return a().b(i4, objArr);
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f5560o.get(key));
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return true;
    }

    @Override // f2.AbstractC0276D
    /* renamed from: g */
    public final r0 iterator() {
        return a().listIterator(0);
    }

    @Override // f2.M
    public final I k() {
        return new d0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5562q;
    }
}
