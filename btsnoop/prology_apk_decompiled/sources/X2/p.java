package X2;

import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K2.k f2965m;

    public /* synthetic */ p(K2.k kVar, int i4) {
        this.f2964l = i4;
        this.f2965m = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2964l) {
            case 0:
                this.f2965m.b(null);
                return;
            case 1:
                this.f2965m.b(null);
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2965m.b(null);
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2965m.b(null);
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                this.f2965m.b(new HashMap());
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                this.f2965m.b(new HashMap());
                return;
            default:
                this.f2965m.b(new HashMap());
                return;
        }
    }
}
