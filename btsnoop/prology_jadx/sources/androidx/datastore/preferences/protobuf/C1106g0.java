package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.g0 */
/* loaded from: classes.dex */
public final class C1106g0 extends androidx.datastore.preferences.protobuf.AbstractC1108h0 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: c */
    public final boolean mo2500c(long j4, java.lang.Object obj) {
        return this.f4237a.getBoolean(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: d */
    public final double mo2501d(long j4, java.lang.Object obj) {
        return this.f4237a.getDouble(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: e */
    public final float mo2502e(long j4, java.lang.Object obj) {
        return this.f4237a.getFloat(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: j */
    public final void mo2503j(java.lang.Object obj, long j4, boolean z4) {
        this.f4237a.putBoolean(obj, j4, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: k */
    public final void mo2504k(java.lang.Object obj, long j4, byte b4) {
        this.f4237a.putByte(obj, j4, b4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: l */
    public final void mo2505l(java.lang.Object obj, long j4, double d4) {
        this.f4237a.putDouble(obj, j4, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: m */
    public final void mo2506m(java.lang.Object obj, long j4, float f4) {
        this.f4237a.putFloat(obj, j4, f4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: q */
    public final boolean mo2510q() {
        if (!super.mo2510q()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.f4237a.getClass();
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getByte", java.lang.Object.class, cls2);
            cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, cls2);
            cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, cls2);
            cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, cls2);
            cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            androidx.datastore.preferences.protobuf.AbstractC1110i0.m2563a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: r */
    public final boolean mo2507r() {
        sun.misc.Unsafe unsafe = this.f4237a;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                if (androidx.datastore.preferences.protobuf.AbstractC1110i0.m2569g() != null) {
                    try {
                        java.lang.Class<?> cls3 = this.f4237a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, java.lang.Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, java.lang.Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
                        return true;
                    } catch (java.lang.Throwable th) {
                        androidx.datastore.preferences.protobuf.AbstractC1110i0.m2563a(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                androidx.datastore.preferences.protobuf.AbstractC1110i0.m2563a(th2);
            }
        }
        return false;
    }
}
