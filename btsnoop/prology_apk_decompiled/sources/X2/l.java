package X2;

import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K2.k f2949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Exception f2950n;

    public /* synthetic */ l(K2.k kVar, Exception exc, int i4) {
        this.f2948l = i4;
        this.f2949m = kVar;
        this.f2950n = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2948l) {
            case 0:
                Exception exc = this.f2950n;
                this.f2949m.a("connect_error", exc.getMessage(), r.c(exc));
                return;
            case 1:
                Exception exc2 = this.f2950n;
                this.f2949m.a("write_error", exc2.getMessage(), r.c(exc2));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Exception exc3 = this.f2950n;
                this.f2949m.a("write_error", exc3.getMessage(), r.c(exc3));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2949m.a("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f2950n));
                return;
            default:
                this.f2949m.a("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f2950n));
                return;
        }
    }
}
