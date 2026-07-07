package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i4) {
        super(unsafe);
        this.f4077b = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j4, Object obj) {
        switch (this.f4077b) {
            case 0:
                return i0.f4104g ? i0.b(j4, obj) : i0.c(j4, obj);
            default:
                return i0.f4104g ? i0.b(j4, obj) : i0.c(j4, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j4, Object obj) {
        switch (this.f4077b) {
            case 0:
                return Double.longBitsToDouble(g(j4, obj));
            default:
                return Double.longBitsToDouble(g(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j4, Object obj) {
        switch (this.f4077b) {
            case 0:
                return Float.intBitsToFloat(f(j4, obj));
            default:
                return Float.intBitsToFloat(f(j4, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j4, boolean z4) {
        switch (this.f4077b) {
            case 0:
                if (i0.f4104g) {
                    i0.k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    i0.l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (i0.f4104g) {
                    i0.k(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    i0.l(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j4, byte b4) {
        switch (this.f4077b) {
            case 0:
                if (i0.f4104g) {
                    i0.k(obj, j4, b4);
                    return;
                } else {
                    i0.l(obj, j4, b4);
                    return;
                }
            default:
                if (i0.f4104g) {
                    i0.k(obj, j4, b4);
                    return;
                } else {
                    i0.l(obj, j4, b4);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j4, double d4) {
        switch (this.f4077b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d4));
                return;
            default:
                o(obj, j4, Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j4, float f4) {
        switch (this.f4077b) {
            case 0:
                n(j4, obj, Float.floatToIntBits(f4));
                return;
            default:
                n(j4, obj, Float.floatToIntBits(f4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f4077b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
