package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1110i0 {

    /* renamed from: a */
    public static final sun.misc.Unsafe f4246a;

    /* renamed from: b */
    public static final java.lang.Class f4247b;

    /* renamed from: c */
    public static final androidx.datastore.preferences.protobuf.AbstractC1108h0 f4248c;

    /* renamed from: d */
    public static final boolean f4249d;

    /* renamed from: e */
    public static final boolean f4250e;

    /* renamed from: f */
    public static final long f4251f;

    /* renamed from: g */
    public static final boolean f4252g;

    static {
        sun.misc.Unsafe m2571i = m2571i();
        f4246a = m2571i;
        f4247b = androidx.datastore.preferences.protobuf.AbstractC1097c.f4211a;
        boolean m2570h = m2570h(java.lang.Long.TYPE);
        boolean m2570h2 = m2570h(java.lang.Integer.TYPE);
        androidx.datastore.preferences.protobuf.AbstractC1108h0 abstractC1108h0 = null;
        if (m2571i != null) {
            if (!androidx.datastore.preferences.protobuf.AbstractC1097c.m2487a()) {
                abstractC1108h0 = new androidx.datastore.preferences.protobuf.AbstractC1108h0(m2571i);
            } else if (m2570h) {
                abstractC1108h0 = new androidx.datastore.preferences.protobuf.C1104f0(m2571i, 1);
            } else if (m2570h2) {
                abstractC1108h0 = new androidx.datastore.preferences.protobuf.C1104f0(m2571i, 0);
            }
        }
        f4248c = abstractC1108h0;
        f4249d = abstractC1108h0 == null ? false : abstractC1108h0.mo2507r();
        f4250e = abstractC1108h0 == null ? false : abstractC1108h0.mo2510q();
        f4251f = m2567e(byte[].class);
        m2567e(boolean[].class);
        m2568f(boolean[].class);
        m2567e(int[].class);
        m2568f(int[].class);
        m2567e(long[].class);
        m2568f(long[].class);
        m2567e(float[].class);
        m2568f(float[].class);
        m2567e(double[].class);
        m2568f(double[].class);
        m2567e(java.lang.Object[].class);
        m2568f(java.lang.Object[].class);
        java.lang.reflect.Field m2569g = m2569g();
        if (m2569g != null && abstractC1108h0 != null) {
            abstractC1108h0.m2547i(m2569g);
        }
        f4252g = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public static void m2563a(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.AbstractC1110i0.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: b */
    public static boolean m2564b(long j4, java.lang.Object obj) {
        return ((byte) ((f4248c.m2544f((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: c */
    public static boolean m2565c(long j4, java.lang.Object obj) {
        return ((byte) ((f4248c.m2544f((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: d */
    public static java.lang.Object m2566d(java.lang.Class cls) {
        try {
            return f4246a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e4) {
            throw new java.lang.IllegalStateException(e4);
        }
    }

    /* renamed from: e */
    public static int m2567e(java.lang.Class cls) {
        if (f4250e) {
            return f4248c.m2542a(cls);
        }
        return -1;
    }

    /* renamed from: f */
    public static void m2568f(java.lang.Class cls) {
        if (f4250e) {
            f4248c.m2543b(cls);
        }
    }

    /* renamed from: g */
    public static java.lang.reflect.Field m2569g() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (androidx.datastore.preferences.protobuf.AbstractC1097c.m2487a()) {
            try {
                field2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (java.lang.Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: h */
    public static boolean m2570h(java.lang.Class cls) {
        if (!androidx.datastore.preferences.protobuf.AbstractC1097c.m2487a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f4247b;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static sun.misc.Unsafe m2571i() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new androidx.datastore.preferences.protobuf.C1102e0());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m2572j(byte[] bArr, long j4, byte b4) {
        f4248c.mo2504k(bArr, f4251f + j4, b4);
    }

    /* renamed from: k */
    public static void m2573k(java.lang.Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int m2544f = f4248c.m2544f(j5, obj);
        int i4 = ((~((int) j4)) & 3) << 3;
        m2575m(j5, obj, ((255 & b4) << i4) | (m2544f & (~(255 << i4))));
    }

    /* renamed from: l */
    public static void m2574l(java.lang.Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        m2575m(j5, obj, ((255 & b4) << i4) | (f4248c.m2544f(j5, obj) & (~(255 << i4))));
    }

    /* renamed from: m */
    public static void m2575m(long j4, java.lang.Object obj, int i4) {
        f4248c.m2548n(j4, obj, i4);
    }

    /* renamed from: n */
    public static void m2576n(java.lang.Object obj, long j4, long j5) {
        f4248c.m2549o(obj, j4, j5);
    }

    /* renamed from: o */
    public static void m2577o(java.lang.Object obj, long j4, java.lang.Object obj2) {
        f4248c.m2550p(obj, j4, obj2);
    }
}
