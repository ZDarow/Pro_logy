package f2;

/* loaded from: classes.dex */
public final class i0 extends M {

    /* renamed from: t, reason: collision with root package name */
    public static final Object[] f5579t;

    /* renamed from: u, reason: collision with root package name */
    public static final i0 f5580u;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object[] f5581o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f5582p;

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f5583q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f5584r;
    public final transient int s;

    static {
        Object[] objArr = new Object[0];
        f5579t = objArr;
        f5580u = new i0(0, 0, 0, objArr, objArr);
    }

    public i0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f5581o = objArr;
        this.f5582p = i4;
        this.f5583q = objArr2;
        this.f5584r = i5;
        this.s = i6;
    }

    @Override // f2.AbstractC0276D
    public final int b(int i4, Object[] objArr) {
        Object[] objArr2 = this.f5581o;
        int i5 = this.s;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // f2.AbstractC0276D
    public final Object[] c() {
        return this.f5581o;
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5583q;
            if (objArr.length != 0) {
                int t4 = r.t(obj);
                while (true) {
                    int i4 = t4 & this.f5584r;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t4 = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // f2.AbstractC0276D
    public final int d() {
        return this.s;
    }

    @Override // f2.AbstractC0276D
    public final int e() {
        return 0;
    }

    @Override // f2.AbstractC0276D
    public final boolean f() {
        return false;
    }

    @Override // f2.AbstractC0276D
    /* renamed from: g */
    public final r0 iterator() {
        return a().listIterator(0);
    }

    @Override // f2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5582p;
    }

    @Override // f2.M
    public final I k() {
        return I.h(this.s, this.f5581o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s;
    }
}
