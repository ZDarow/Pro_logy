package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1108h0 {

    /* renamed from: a */
    public final sun.misc.Unsafe f4237a;

    public AbstractC1108h0(sun.misc.Unsafe unsafe) {
        this.f4237a = unsafe;
    }

    /* renamed from: a */
    public final int m2542a(java.lang.Class cls) {
        return this.f4237a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m2543b(java.lang.Class cls) {
        return this.f4237a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public abstract boolean mo2500c(long j4, java.lang.Object obj);

    /* renamed from: d */
    public abstract double mo2501d(long j4, java.lang.Object obj);

    /* renamed from: e */
    public abstract float mo2502e(long j4, java.lang.Object obj);

    /* renamed from: f */
    public final int m2544f(long j4, java.lang.Object obj) {
        return this.f4237a.getInt(obj, j4);
    }

    /* renamed from: g */
    public final long m2545g(long j4, java.lang.Object obj) {
        return this.f4237a.getLong(obj, j4);
    }

    /* renamed from: h */
    public final java.lang.Object m2546h(long j4, java.lang.Object obj) {
        return this.f4237a.getObject(obj, j4);
    }

    /* renamed from: i */
    public final long m2547i(java.lang.reflect.Field field) {
        return this.f4237a.objectFieldOffset(field);
    }

    /* renamed from: j */
    public abstract void mo2503j(java.lang.Object obj, long j4, boolean z4);

    /* renamed from: k */
    public abstract void mo2504k(java.lang.Object obj, long j4, byte b4);

    /* renamed from: l */
    public abstract void mo2505l(java.lang.Object obj, long j4, double d4);

    /* renamed from: m */
    public abstract void mo2506m(java.lang.Object obj, long j4, float f4);

    /* renamed from: n */
    public final void m2548n(long j4, java.lang.Object obj, int i4) {
        this.f4237a.putInt(obj, j4, i4);
    }

    /* renamed from: o */
    public final void m2549o(java.lang.Object obj, long j4, long j5) {
        this.f4237a.putLong(obj, j4, j5);
    }

    /* renamed from: p */
    public final void m2550p(java.lang.Object obj, long j4, java.lang.Object obj2) {
        this.f4237a.putObject(obj, j4, obj2);
    }

    /* renamed from: q */
    public boolean mo2510q() {
        sun.misc.Unsafe unsafe = this.f4237a;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2563a(th);
            return false;
        }
    }

    /* renamed from: r */
    public abstract boolean mo2507r();
}
