package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f0 */
/* loaded from: classes.dex */
public final class C1104f0 extends androidx.datastore.preferences.protobuf.AbstractC1108h0 {

    /* renamed from: b */
    public final /* synthetic */ int f4225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1104f0(sun.misc.Unsafe unsafe, int i4) {
        super(unsafe);
        this.f4225b = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: c */
    public final boolean mo2500c(long j4, java.lang.Object obj) {
        switch (this.f4225b) {
            case 0:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g ? androidx.datastore.preferences.protobuf.AbstractC1110i0.m2564b(j4, obj) : androidx.datastore.preferences.protobuf.AbstractC1110i0.m2565c(j4, obj);
            default:
                return androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g ? androidx.datastore.preferences.protobuf.AbstractC1110i0.m2564b(j4, obj) : androidx.datastore.preferences.protobuf.AbstractC1110i0.m2565c(j4, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: d */
    public final double mo2501d(long j4, java.lang.Object obj) {
        switch (this.f4225b) {
            case 0:
                return java.lang.Double.longBitsToDouble(m2545g(j4, obj));
            default:
                return java.lang.Double.longBitsToDouble(m2545g(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: e */
    public final float mo2502e(long j4, java.lang.Object obj) {
        switch (this.f4225b) {
            case 0:
                return java.lang.Float.intBitsToFloat(m2544f(j4, obj));
            default:
                return java.lang.Float.intBitsToFloat(m2544f(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: j */
    public final void mo2503j(java.lang.Object obj, long j4, boolean z4) {
        switch (this.f4225b) {
            case 0:
                if (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g) {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2573k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2574l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g) {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2573k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2574l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: k */
    public final void mo2504k(java.lang.Object obj, long j4, byte b4) {
        switch (this.f4225b) {
            case 0:
                if (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g) {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2573k(obj, j4, b4);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2574l(obj, j4, b4);
                    return;
                }
            default:
                if (androidx.datastore.preferences.protobuf.AbstractC1110i0.f4252g) {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2573k(obj, j4, b4);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.AbstractC1110i0.m2574l(obj, j4, b4);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: l */
    public final void mo2505l(java.lang.Object obj, long j4, double d4) {
        switch (this.f4225b) {
            case 0:
                m2549o(obj, j4, java.lang.Double.doubleToLongBits(d4));
                return;
            default:
                m2549o(obj, j4, java.lang.Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: m */
    public final void mo2506m(java.lang.Object obj, long j4, float f4) {
        switch (this.f4225b) {
            case 0:
                m2548n(j4, obj, java.lang.Float.floatToIntBits(f4));
                return;
            default:
                m2548n(j4, obj, java.lang.Float.floatToIntBits(f4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1108h0
    /* renamed from: r */
    public final boolean mo2507r() {
        switch (this.f4225b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
