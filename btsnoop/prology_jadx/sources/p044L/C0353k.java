package p044L;

/* renamed from: L.k */
/* loaded from: classes.dex */
public final class C0353k extends androidx.datastore.preferences.protobuf.AbstractC1132v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final p044L.C0353k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.InterfaceC1084Q PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        p044L.C0353k c0353k = new p044L.C0353k();
        DEFAULT_INSTANCE = c0353k;
        androidx.datastore.preferences.protobuf.AbstractC1132v.m2636l(p044L.C0353k.class, c0353k);
    }

    /* renamed from: F */
    public static p044L.C0351i m783F() {
        return (p044L.C0351i) ((androidx.datastore.preferences.protobuf.AbstractC1130t) DEFAULT_INSTANCE.mo774e(5));
    }

    /* renamed from: n */
    public static void m784n(p044L.C0353k c0353k, long j4) {
        c0353k.valueCase_ = 4;
        c0353k.value_ = java.lang.Long.valueOf(j4);
    }

    /* renamed from: o */
    public static void m785o(p044L.C0353k c0353k, java.lang.String str) {
        c0353k.getClass();
        str.getClass();
        c0353k.valueCase_ = 5;
        c0353k.value_ = str;
    }

    /* renamed from: p */
    public static void m786p(p044L.C0353k c0353k, p044L.C0350h c0350h) {
        c0353k.getClass();
        c0353k.value_ = c0350h;
        c0353k.valueCase_ = 6;
    }

    /* renamed from: q */
    public static void m787q(p044L.C0353k c0353k, double d4) {
        c0353k.valueCase_ = 7;
        c0353k.value_ = java.lang.Double.valueOf(d4);
    }

    /* renamed from: r */
    public static void m788r(p044L.C0353k c0353k, androidx.datastore.preferences.protobuf.C1105g c1105g) {
        c0353k.getClass();
        c0353k.valueCase_ = 8;
        c0353k.value_ = c1105g;
    }

    /* renamed from: s */
    public static void m789s(p044L.C0353k c0353k, boolean z4) {
        c0353k.valueCase_ = 1;
        c0353k.value_ = java.lang.Boolean.valueOf(z4);
    }

    /* renamed from: t */
    public static void m790t(p044L.C0353k c0353k, float f4) {
        c0353k.valueCase_ = 2;
        c0353k.value_ = java.lang.Float.valueOf(f4);
    }

    /* renamed from: u */
    public static void m791u(p044L.C0353k c0353k, int i4) {
        c0353k.valueCase_ = 3;
        c0353k.value_ = java.lang.Integer.valueOf(i4);
    }

    /* renamed from: x */
    public static p044L.C0353k m792x() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final int m793A() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: B */
    public final long m794B() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: C */
    public final java.lang.String m795C() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    /* renamed from: D */
    public final p044L.C0350h m796D() {
        return this.valueCase_ == 6 ? (p044L.C0350h) this.value_ : p044L.C0350h.m777o();
    }

    /* renamed from: E */
    public final int m797E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
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
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.datastore.preferences.protobuf.C1087U(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", p044L.C0350h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new p044L.C0353k();
            case LONG_FIELD_NUMBER /* 4 */:
                return new androidx.datastore.preferences.protobuf.AbstractC1130t(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q = PARSER;
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q2 = interfaceC1084Q;
                if (interfaceC1084Q == null) {
                    synchronized (p044L.C0353k.class) {
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

    /* renamed from: v */
    public final boolean m798v() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: w */
    public final androidx.datastore.preferences.protobuf.C1105g m799w() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.C1105g) this.value_ : androidx.datastore.preferences.protobuf.C1105g.f4226n;
    }

    /* renamed from: y */
    public final double m800y() {
        if (this.valueCase_ == 7) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: z */
    public final float m801z() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
