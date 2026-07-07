package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f4089a;

    public h0(Unsafe unsafe) {
        this.f4089a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4089a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4089a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract double d(long j4, Object obj);

    public abstract float e(long j4, Object obj);

    public final int f(long j4, Object obj) {
        return this.f4089a.getInt(obj, j4);
    }

    public final long g(long j4, Object obj) {
        return this.f4089a.getLong(obj, j4);
    }

    public final Object h(long j4, Object obj) {
        return this.f4089a.getObject(obj, j4);
    }

    public final long i(Field field) {
        return this.f4089a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j4, boolean z4);

    public abstract void k(Object obj, long j4, byte b4);

    public abstract void l(Object obj, long j4, double d4);

    public abstract void m(Object obj, long j4, float f4);

    public final void n(long j4, Object obj, int i4) {
        this.f4089a.putInt(obj, j4, i4);
    }

    public final void o(Object obj, long j4, long j5) {
        this.f4089a.putLong(obj, j4, j5);
    }

    public final void p(Object obj, long j4, Object obj2) {
        this.f4089a.putObject(obj, j4, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f4089a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            i0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
