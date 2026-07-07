package p093X2;

/* renamed from: X2.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0854o implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3057l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f3058m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f3059n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f3060o;

    /* renamed from: p */
    public final /* synthetic */ java.lang.Object f3061p;

    public /* synthetic */ RunnableC0854o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i4) {
        this.f3057l = i4;
        this.f3058m = obj;
        this.f3059n = obj2;
        this.f3061p = obj3;
        this.f3060o = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3057l) {
            case 0:
                p093X2.C0849j c0849j = (p093X2.C0849j) this.f3059n;
                java.lang.String str = (java.lang.String) this.f3061p;
                p043K2.C0335k c0335k = (p043K2.C0335k) this.f3060o;
                p093X2.C0857r c0857r = ((p093X2.C0846g) this.f3058m).f3031m;
                try {
                    c0849j.m1682c(str.getBytes());
                    c0857r.f3080x.runOnUiThread(new p093X2.RunnableC0855p(c0335k, 1));
                    return;
                } catch (java.lang.Exception e4) {
                    c0857r.f3080x.runOnUiThread(new p093X2.RunnableC0851l(c0335k, e4, 2));
                    return;
                }
            case 1:
                p093X2.C0849j c0849j2 = (p093X2.C0849j) this.f3059n;
                byte[] bArr = (byte[]) this.f3061p;
                p043K2.C0335k c0335k2 = (p043K2.C0335k) this.f3060o;
                p093X2.C0857r c0857r2 = ((p093X2.C0846g) this.f3058m).f3031m;
                try {
                    c0849j2.m1682c(bArr);
                    c0857r2.f3080x.runOnUiThread(new p093X2.RunnableC0855p(c0335k2, 0));
                    return;
                } catch (java.lang.Exception e5) {
                    c0857r2.f3080x.runOnUiThread(new p093X2.RunnableC0851l(c0335k2, e5, 1));
                    return;
                }
            default:
                int i4 = ((p127f0.C1372e) this.f3058m).f5648a;
                this.f3059n.mo704x(i4, (p179q0.C1964F) this.f3061p, (p166n0.C1891g) this.f3060o);
                return;
        }
    }
}
