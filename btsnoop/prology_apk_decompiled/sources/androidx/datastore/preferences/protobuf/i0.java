package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f4098a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f4099b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f4100c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4101d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4102e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f4103f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f4104g;

    static {
        Unsafe i4 = i();
        f4098a = i4;
        f4099b = AbstractC0151c.f4063a;
        boolean h4 = h(Long.TYPE);
        boolean h5 = h(Integer.TYPE);
        h0 h0Var = null;
        if (i4 != null) {
            if (!AbstractC0151c.a()) {
                h0Var = new h0(i4);
            } else if (h4) {
                h0Var = new f0(i4, 1);
            } else if (h5) {
                h0Var = new f0(i4, 0);
            }
        }
        f4100c = h0Var;
        f4101d = h0Var == null ? false : h0Var.r();
        f4102e = h0Var == null ? false : h0Var.q();
        f4103f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g4 = g();
        if (g4 != null && h0Var != null) {
            h0Var.i(g4);
        }
        f4104g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j4, Object obj) {
        return ((byte) ((f4100c.f((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j4, Object obj) {
        return ((byte) ((f4100c.f((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f4098a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int e(Class cls) {
        if (f4102e) {
            return f4100c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4102e) {
            f4100c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0151c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0151c.a()) {
            return false;
        }
        try {
            Class cls2 = f4099b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j4, byte b4) {
        f4100c.k(bArr, f4103f + j4, b4);
    }

    public static void k(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int f4 = f4100c.f(j5, obj);
        int i4 = ((~((int) j4)) & 3) << 3;
        m(j5, obj, ((255 & b4) << i4) | (f4 & (~(255 << i4))));
    }

    public static void l(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        m(j5, obj, ((255 & b4) << i4) | (f4100c.f(j5, obj) & (~(255 << i4))));
    }

    public static void m(long j4, Object obj, int i4) {
        f4100c.n(j4, obj, i4);
    }

    public static void n(Object obj, long j4, long j5) {
        f4100c.o(obj, j4, j5);
    }

    public static void o(Object obj, long j4, Object obj2) {
        f4100c.p(obj, j4, obj2);
    }
}
