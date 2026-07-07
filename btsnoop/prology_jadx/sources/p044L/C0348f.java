package p044L;

/* renamed from: L.f */
/* loaded from: classes.dex */
public final class C0348f extends androidx.datastore.preferences.protobuf.AbstractC1132v {
    private static final p044L.C0348f DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.InterfaceC1084Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.C1075H preferences_ = androidx.datastore.preferences.protobuf.C1075H.f4157m;

    static {
        p044L.C0348f c0348f = new p044L.C0348f();
        DEFAULT_INSTANCE = c0348f;
        androidx.datastore.preferences.protobuf.AbstractC1132v.m2636l(p044L.C0348f.class, c0348f);
    }

    /* renamed from: n */
    public static androidx.datastore.preferences.protobuf.C1075H m771n(p044L.C0348f c0348f) {
        androidx.datastore.preferences.protobuf.C1075H c1075h = c0348f.preferences_;
        if (!c1075h.f4158l) {
            c0348f.preferences_ = c1075h.m2375b();
        }
        return c0348f.preferences_;
    }

    /* renamed from: p */
    public static p044L.C0346d m772p() {
        return (p044L.C0346d) ((androidx.datastore.preferences.protobuf.AbstractC1130t) DEFAULT_INSTANCE.mo774e(5));
    }

    /* renamed from: q */
    public static p044L.C0348f m773q(java.io.InputStream inputStream) {
        p044L.C0348f c0348f = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.C1109i c1109i = new androidx.datastore.preferences.protobuf.C1109i(inputStream);
        androidx.datastore.preferences.protobuf.C1119n m2626a = androidx.datastore.preferences.protobuf.C1119n.m2626a();
        androidx.datastore.preferences.protobuf.AbstractC1132v m2641k = c0348f.m2641k();
        try {
            androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
            c1085s.getClass();
            androidx.datastore.preferences.protobuf.InterfaceC1088V m2422a = c1085s.m2422a(m2641k.getClass());
            p086W.C0792l c0792l = c1109i.f4254b;
            if (c0792l == null) {
                c0792l = new p086W.C0792l(c1109i);
            }
            m2422a.mo2402c(m2641k, c0792l, m2626a);
            m2422a.mo2407h(m2641k);
            if (androidx.datastore.preferences.protobuf.AbstractC1132v.m2635h(m2641k, true)) {
                return (p044L.C0348f) m2641k;
            }
            throw new java.io.IOException(new androidx.datastore.preferences.protobuf.C1096b0().getMessage());
        } catch (androidx.datastore.preferences.protobuf.C1096b0 e4) {
            throw new java.io.IOException(e4.getMessage());
        } catch (androidx.datastore.preferences.protobuf.C1136z e5) {
            if (e5.f4299l) {
                throw new java.io.IOException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (java.io.IOException e6) {
            if (e6.getCause() instanceof androidx.datastore.preferences.protobuf.C1136z) {
                throw ((androidx.datastore.preferences.protobuf.C1136z) e6.getCause());
            }
            throw new java.io.IOException(e6.getMessage(), e6);
        } catch (java.lang.RuntimeException e7) {
            if (e7.getCause() instanceof androidx.datastore.preferences.protobuf.C1136z) {
                throw ((androidx.datastore.preferences.protobuf.C1136z) e7.getCause());
            }
            throw e7;
        }
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.datastore.preferences.protobuf.Q, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1132v
    /* renamed from: e */
    public final java.lang.Object mo774e(int i4) {
        switch (p044L.AbstractC0352j.m781b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.datastore.preferences.protobuf.C1087U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", p044L.AbstractC0347e.f1078a});
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new p044L.C0348f();
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new androidx.datastore.preferences.protobuf.AbstractC1130t(DEFAULT_INSTANCE);
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q = PARSER;
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q2 = interfaceC1084Q;
                if (interfaceC1084Q == null) {
                    synchronized (p044L.C0348f.class) {
                        try {
                            androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q3 = PARSER;
                            androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q4 = interfaceC1084Q3;
                            if (interfaceC1084Q3 == null) {
                                ?? obj = new java.lang.Object();
                                PARSER = obj;
                                interfaceC1084Q4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1084Q2;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public final java.util.Map m775o() {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }
}
