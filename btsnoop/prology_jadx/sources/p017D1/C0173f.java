package p017D1;

/* renamed from: D1.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0173f implements p022E1.InterfaceC0195a, p025F1.InterfaceC0223o, p093X2.InterfaceC0850k {

    /* renamed from: a */
    public final /* synthetic */ int f465a;

    /* renamed from: b */
    public final /* synthetic */ p043K2.C0335k f466b;

    public /* synthetic */ C0173f(p043K2.C0335k c0335k, int i4) {
        this.f465a = i4;
        this.f466b = c0335k;
    }

    @Override // p025F1.InterfaceC0223o
    /* renamed from: a */
    public void mo529a(android.location.Location location) {
        this.f466b.mo742b(p080U1.AbstractC0748a.m1360H(location));
    }

    @Override // p093X2.InterfaceC0850k
    /* renamed from: b */
    public void mo535b(boolean z4) {
        this.f466b.mo742b(java.lang.Boolean.valueOf(z4));
    }

    @Override // p022E1.InterfaceC0195a
    /* renamed from: c */
    public void mo530c(int i4) {
        switch (this.f465a) {
            case 1:
                this.f466b.mo741a(p009B2.AbstractC0051h.m147f(i4), p009B2.AbstractC0051h.m146e(i4), null);
                return;
            default:
                this.f466b.mo741a(p009B2.AbstractC0051h.m147f(i4), p009B2.AbstractC0051h.m146e(i4), null);
                return;
        }
    }
}
