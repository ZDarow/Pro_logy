package L;

import androidx.datastore.preferences.protobuf.AbstractC0167t;
import androidx.datastore.preferences.protobuf.AbstractC0169v;
import androidx.datastore.preferences.protobuf.C0155g;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.U;

/* loaded from: classes.dex */
public final class k extends AbstractC0169v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Q PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC0169v.l(k.class, kVar);
    }

    public static i F() {
        return (i) ((AbstractC0167t) DEFAULT_INSTANCE.e(5));
    }

    public static void n(k kVar, long j4) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j4);
    }

    public static void o(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d4) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d4);
    }

    public static void r(k kVar, C0155g c0155g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0155g;
    }

    public static void s(k kVar, boolean z4) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z4);
    }

    public static void t(k kVar, float f4) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f4);
    }

    public static void u(k kVar, int i4) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i4);
    }

    public static k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h D() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.o();
    }

    public final int E() {
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
    @Override // androidx.datastore.preferences.protobuf.AbstractC0169v
    public final Object e(int i4) {
        switch (j.b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new U(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new k();
            case LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0167t(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                Q q4 = PARSER;
                Q q5 = q4;
                if (q4 == null) {
                    synchronized (k.class) {
                        try {
                            Q q6 = PARSER;
                            Q q7 = q6;
                            if (q6 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                q7 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return q5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0155g w() {
        return this.valueCase_ == 8 ? (C0155g) this.value_ : C0155g.f4078n;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
