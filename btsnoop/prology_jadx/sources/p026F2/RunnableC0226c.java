package p026F2;

/* renamed from: F2.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0226c implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f647l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f648m;

    public /* synthetic */ RunnableC0226c(int i4, java.lang.Object obj) {
        this.f647l = i4;
        this.f648m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f647l) {
            case 0:
                ((p026F2.CallableC0227d) this.f648m).f650b.f657e.prefetchDefaultFontManager();
                return;
            case 1:
                android.widget.Toast toast = (android.widget.Toast) ((p094Y.C0886x) this.f648m).f3176n;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                androidx.lifecycle.C1154r c1154r = (androidx.lifecycle.C1154r) this.f648m;
                p154k3.AbstractC1803h.m3779e(c1154r, "this$0");
                int i4 = c1154r.f4327m;
                androidx.lifecycle.C1149m c1149m = c1154r.f4331q;
                if (i4 == 0) {
                    c1154r.f4328n = true;
                    c1149m.m2660d(androidx.lifecycle.EnumC1141e.ON_PAUSE);
                }
                if (c1154r.f4326l == 0 && c1154r.f4328n) {
                    c1149m.m2660d(androidx.lifecycle.EnumC1141e.ON_STOP);
                    c1154r.f4329o = true;
                    return;
                }
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p107b0.C1170e c1170e = (p107b0.C1170e) this.f648m;
                c1170e.m2742K(c1170e.m2744a(), 1028, new p107b0.C1168c(22));
                c1170e.f4502q.m1443d();
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                p112c0.C1211J c1211j = (p112c0.C1211J) this.f648m;
                if (c1211j.f4705k0 >= 300000) {
                    ((p112c0.C1214M) c1211j.f4714s.f1048m).f4734a1 = true;
                    c1211j.f4705k0 = 0L;
                    return;
                }
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                ((p129f2.C1408Y) this.f648m).m3186D();
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((io.flutter.plugin.platform.C1592o) this.f648m).m3513e(false);
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                p146j0.C1702f c1702f = (p146j0.C1702f) this.f648m;
                synchronized (c1702f.f7069a) {
                    try {
                        if (c1702f.f7081m) {
                            return;
                        }
                        long j4 = c1702f.f7080l - 1;
                        c1702f.f7080l = j4;
                        if (j4 > 0) {
                            return;
                        }
                        if (j4 >= 0) {
                            c1702f.m3657a();
                            return;
                        }
                        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException();
                        synchronized (c1702f.f7069a) {
                            c1702f.f7082n = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                ((android.os.HandlerThread) this.f648m).quit();
                return;
            case 9:
                ((p171o0.C1929c) this.f648m).m3886w();
                return;
            case 10:
                com.ryanheise.audioservice.AudioService audioService = com.ryanheise.audioservice.AudioService.f4959J;
                com.ryanheise.audioservice.AudioService audioService2 = (com.ryanheise.audioservice.AudioService) this.f648m;
                if (audioService2.f4969F) {
                    ((android.app.NotificationManager) audioService2.getSystemService("notification")).notify(1124, audioService2.m2940g());
                    return;
                }
                return;
            case 11:
                ((p073S0.C0629g) this.f648m).getClass();
                return;
            case 12:
                break;
            default:
                p206w0.C2311g c2311g = (p206w0.C2311g) this.f648m;
                int i5 = c2311g.f9134k - 1;
                c2311g.f9134k = i5;
                if (i5 > 0) {
                    return;
                }
                if (i5 < 0) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(c2311g.f9134k));
                }
                c2311g.f9126c.m4528a();
                return;
        }
        while (true) {
            p204v2.C2276f c2276f = (p204v2.C2276f) this.f648m;
            java.util.ArrayList arrayList = c2276f.f9020f;
            if (arrayList.isEmpty() || c2276f.f9026l != null) {
                return;
            }
            ((p208w2.C2338d) arrayList.get(0)).f9265a.run();
            arrayList.remove(0);
        }
    }
}
