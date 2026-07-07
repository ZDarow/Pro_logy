package k0;

import B2.AbstractC0007h;
import L.k;
import M0.h;
import O0.c;
import T.C0095p;
import p1.AbstractC0462a;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0376a f6926a = new Object();

    public final AbstractC0462a a(C0095p c0095p) {
        String str = c0095p.f2325m;
        if (str != null) {
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    return new I0.b(0);
                case 1:
                    return new L0.a();
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    return new h(null);
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    return new I0.b(1);
                case k.LONG_FIELD_NUMBER /* 4 */:
                    return new c();
            }
        }
        throw new IllegalArgumentException(AbstractC0007h.l("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C0095p c0095p) {
        String str = c0095p.f2325m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
