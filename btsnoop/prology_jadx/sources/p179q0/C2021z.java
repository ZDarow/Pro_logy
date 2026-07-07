package p179q0;

/* renamed from: q0.z */
/* loaded from: classes.dex */
public final class C2021z extends p179q0.AbstractC2017v {

    /* renamed from: e */
    public static final java.lang.Object f8246e = new java.lang.Object();

    /* renamed from: c */
    public final java.lang.Object f8247c;

    /* renamed from: d */
    public final java.lang.Object f8248d;

    public C2021z(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, java.lang.Object obj2) {
        super(abstractC0677U);
        this.f8247c = obj;
        this.f8248d = obj2;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: b */
    public final int mo1231b(java.lang.Object obj) {
        java.lang.Object obj2;
        if (f8246e.equals(obj) && (obj2 = this.f8248d) != null) {
            obj = obj2;
        }
        return this.f8231b.mo1231b(obj);
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: f */
    public final p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4) {
        this.f8231b.mo1232f(i4, c0675s, z4);
        if (p086W.AbstractC0805y.m1606a(c0675s.f2224b, this.f8248d) && z4) {
            c0675s.f2224b = f8246e;
        }
        return c0675s;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: l */
    public final java.lang.Object mo1234l(int i4) {
        java.lang.Object mo1234l = this.f8231b.mo1234l(i4);
        return p086W.AbstractC0805y.m1606a(mo1234l, this.f8248d) ? f8246e : mo1234l;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: m */
    public final p076T.C0676T mo1235m(int i4, p076T.C0676T c0676t, long j4) {
        this.f8231b.mo1235m(i4, c0676t, j4);
        if (p086W.AbstractC0805y.m1606a(c0676t.f2232a, this.f8247c)) {
            c0676t.f2232a = p076T.C0676T.f2230q;
        }
        return c0676t;
    }
}
