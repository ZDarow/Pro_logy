package p008B1;

/* renamed from: B1.g */
/* loaded from: classes.dex */
public final class C0029g implements p008B1.InterfaceC0023a {

    /* renamed from: a */
    public final /* synthetic */ p043K2.C0335k f105a;

    /* renamed from: b */
    public final /* synthetic */ double f106b;

    /* renamed from: c */
    public final /* synthetic */ double f107c;

    public C0029g(p043K2.C0335k c0335k, double d4, double d5) {
        this.f105a = c0335k;
        this.f106b = d4;
        this.f107c = d5;
    }

    @Override // p008B1.InterfaceC0023a
    public final void onError(java.lang.String str) {
        if (str == null) {
            str = "Unknown error occurred";
        }
        this.f105a.mo741a("IO_ERROR", str, null);
    }

    @Override // p008B1.InterfaceC0023a
    public final void onGeocode(java.util.List list) {
        p043K2.C0335k c0335k = this.f105a;
        if (list == null || list.size() <= 0) {
            c0335k.mo741a("NOT_FOUND", java.lang.String.format(java.util.Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", java.lang.Double.valueOf(this.f106b), java.lang.Double.valueOf(this.f107c)), null);
        } else {
            c0335k.mo742b(p101a.AbstractC0936a.m1785W(list));
        }
    }
}
