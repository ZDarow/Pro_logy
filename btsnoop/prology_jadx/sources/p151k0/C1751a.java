package p151k0;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public final class C1751a {

    /* renamed from: a */
    public static final p151k0.C1751a f7188a = new java.lang.Object();

    /* renamed from: a */
    public final p176p1.AbstractC1949a m3714a(p076T.C0702p c0702p) {
        java.lang.String str = c0702p.f2408m;
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
                    return new p036I0.C0306b(0);
                case 1:
                    return new p045L0.C0354a();
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    return new p049M0.C0409h(null);
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    return new p036I0.C0306b(1);
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    return new p057O0.C0484c();
            }
        }
        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m153l("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* renamed from: b */
    public final boolean m3715b(p076T.C0702p c0702p) {
        java.lang.String str = c0702p.f2408m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
