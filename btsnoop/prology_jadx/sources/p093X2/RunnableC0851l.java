package p093X2;

/* renamed from: X2.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0851l implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3046l;

    /* renamed from: m */
    public final /* synthetic */ p043K2.C0335k f3047m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Exception f3048n;

    public /* synthetic */ RunnableC0851l(p043K2.C0335k c0335k, java.lang.Exception exc, int i4) {
        this.f3046l = i4;
        this.f3047m = c0335k;
        this.f3048n = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3046l) {
            case 0:
                java.lang.Exception exc = this.f3048n;
                this.f3047m.mo741a("connect_error", exc.getMessage(), p093X2.C0857r.m1684c(exc));
                return;
            case 1:
                java.lang.Exception exc2 = this.f3048n;
                this.f3047m.mo741a("write_error", exc2.getMessage(), p093X2.C0857r.m1684c(exc2));
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Exception exc3 = this.f3048n;
                this.f3047m.mo741a("write_error", exc3.getMessage(), p093X2.C0857r.m1684c(exc3));
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f3047m.mo741a("UNEXPECTED_ERROR", "Unexpected error", android.util.Log.getStackTraceString(this.f3048n));
                return;
            default:
                this.f3047m.mo741a("UNEXPECTED_ERROR", "Unexpected error", android.util.Log.getStackTraceString(this.f3048n));
                return;
        }
    }
}
