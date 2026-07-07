package p129f2;

/* renamed from: f2.i0 */
/* loaded from: classes.dex */
public final class C1427i0 extends p129f2.AbstractC1397M {

    /* renamed from: t */
    public static final java.lang.Object[] f5773t;

    /* renamed from: u */
    public static final p129f2.C1427i0 f5774u;

    /* renamed from: o */
    public final transient java.lang.Object[] f5775o;

    /* renamed from: p */
    public final transient int f5776p;

    /* renamed from: q */
    public final transient java.lang.Object[] f5777q;

    /* renamed from: r */
    public final transient int f5778r;

    /* renamed from: s */
    public final transient int f5779s;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f5773t = objArr;
        f5774u = new p129f2.C1427i0(0, 0, 0, objArr, objArr);
    }

    public C1427i0(int i4, int i5, int i6, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.f5775o = objArr;
        this.f5776p = i4;
        this.f5777q = objArr2;
        this.f5778r = i5;
        this.f5779s = i6;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: b */
    public final int mo3151b(int i4, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.f5775o;
        int i5 = this.f5779s;
        java.lang.System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: c */
    public final java.lang.Object[] mo3152c() {
        return this.f5775o;
    }

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f5777q;
            if (objArr.length != 0) {
                int m3240t = p129f2.AbstractC1444r.m3240t(obj);
                while (true) {
                    int i4 = m3240t & this.f5778r;
                    java.lang.Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    m3240t = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: d */
    public final int mo3153d() {
        return this.f5779s;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: e */
    public final int mo3154e() {
        return 0;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: f */
    public final boolean mo3155f() {
        return false;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: g */
    public final p129f2.AbstractC1445r0 iterator() {
        return mo3150a().listIterator(0);
    }

    @Override // p129f2.AbstractC1397M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5776p;
    }

    @Override // p129f2.AbstractC1397M
    /* renamed from: k */
    public final p129f2.AbstractC1393I mo3179k() {
        return p129f2.AbstractC1393I.m3160h(this.f5779s, this.f5775o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5779s;
    }
}
