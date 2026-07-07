package p017D1;

/* renamed from: D1.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0172e implements p025F1.InterfaceC0223o, p022E1.InterfaceC0195a {

    /* renamed from: a */
    public final /* synthetic */ p017D1.C0174g f460a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f461b;

    /* renamed from: c */
    public final /* synthetic */ p025F1.InterfaceC0216h f462c;

    /* renamed from: d */
    public final /* synthetic */ java.lang.String f463d;

    /* renamed from: e */
    public final /* synthetic */ p043K2.C0335k f464e;

    public /* synthetic */ C0172e(p017D1.C0174g c0174g, boolean[] zArr, p025F1.InterfaceC0216h interfaceC0216h, java.lang.String str, p043K2.C0335k c0335k) {
        this.f460a = c0174g;
        this.f461b = zArr;
        this.f462c = interfaceC0216h;
        this.f463d = str;
        this.f464e = c0335k;
    }

    @Override // p025F1.InterfaceC0223o
    /* renamed from: a */
    public void mo529a(android.location.Location location) {
        p017D1.C0174g c0174g = this.f460a;
        c0174g.getClass();
        boolean[] zArr = this.f461b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        p025F1.InterfaceC0216h interfaceC0216h = this.f462c;
        c0174g.f470o.f608l.remove(interfaceC0216h);
        interfaceC0216h.mo574d();
        ((java.util.HashMap) c0174g.f472q).remove(this.f463d);
        this.f464e.mo742b(p080U1.AbstractC0748a.m1360H(location));
    }

    @Override // p022E1.InterfaceC0195a
    /* renamed from: c */
    public void mo530c(int i4) {
        p017D1.C0174g c0174g = this.f460a;
        c0174g.getClass();
        boolean[] zArr = this.f461b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        p025F1.InterfaceC0216h interfaceC0216h = this.f462c;
        c0174g.f470o.f608l.remove(interfaceC0216h);
        interfaceC0216h.mo574d();
        ((java.util.HashMap) c0174g.f472q).remove(this.f463d);
        this.f464e.mo741a(p009B2.AbstractC0051h.m147f(i4), p009B2.AbstractC0051h.m146e(i4), null);
    }
}
