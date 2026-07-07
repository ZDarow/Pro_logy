package S0;

import y0.AbstractC0619b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1887a;

    /* renamed from: b, reason: collision with root package name */
    public int f1888b;

    /* renamed from: c, reason: collision with root package name */
    public int f1889c;

    /* renamed from: d, reason: collision with root package name */
    public long f1890d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1891e;

    /* renamed from: f, reason: collision with root package name */
    public final W.r f1892f;

    /* renamed from: g, reason: collision with root package name */
    public final W.r f1893g;

    /* renamed from: h, reason: collision with root package name */
    public int f1894h;

    /* renamed from: i, reason: collision with root package name */
    public int f1895i;

    public d(W.r rVar, W.r rVar2, boolean z4) {
        this.f1893g = rVar;
        this.f1892f = rVar2;
        this.f1891e = z4;
        rVar2.G(12);
        this.f1887a = rVar2.y();
        rVar.G(12);
        this.f1895i = rVar.y();
        AbstractC0619b.e("first_chunk must be 1", rVar.h() == 1);
        this.f1888b = -1;
    }

    public final boolean a() {
        int i4 = this.f1888b + 1;
        this.f1888b = i4;
        if (i4 == this.f1887a) {
            return false;
        }
        boolean z4 = this.f1891e;
        W.r rVar = this.f1892f;
        this.f1890d = z4 ? rVar.z() : rVar.w();
        if (this.f1888b == this.f1894h) {
            W.r rVar2 = this.f1893g;
            this.f1889c = rVar2.y();
            rVar2.H(4);
            int i5 = this.f1895i - 1;
            this.f1895i = i5;
            this.f1894h = i5 > 0 ? rVar2.y() - 1 : -1;
        }
        return true;
    }
}
