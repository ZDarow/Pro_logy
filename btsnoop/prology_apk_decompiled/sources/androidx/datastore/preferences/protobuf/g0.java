package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends h0 {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j4, Object obj) {
        return this.f4089a.getBoolean(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j4, Object obj) {
        return this.f4089a.getDouble(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j4, Object obj) {
        return this.f4089a.getFloat(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j4, boolean z4) {
        this.f4089a.putBoolean(obj, j4, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j4, byte b4) {
        this.f4089a.putByte(obj, j4, b4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j4, double d4) {
        this.f4089a.putDouble(obj, j4, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j4, float f4) {
        this.f4089a.putFloat(obj, j4, f4);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f4089a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            i0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        Unsafe unsafe = this.f4089a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (i0.g() != null) {
                    try {
                        Class<?> cls3 = this.f4089a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        i0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                i0.a(th2);
            }
        }
        return false;
    }
}
