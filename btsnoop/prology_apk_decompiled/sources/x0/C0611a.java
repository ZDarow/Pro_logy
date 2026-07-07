package x0;

import T.C0095p;
import W.r;
import W.y;
import Y.x;
import Z.f;
import a0.AbstractC0125e;
import a0.C0116F;
import java.nio.ByteBuffer;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611a extends AbstractC0125e {

    /* renamed from: C, reason: collision with root package name */
    public final f f8964C;

    /* renamed from: D, reason: collision with root package name */
    public final r f8965D;

    /* renamed from: E, reason: collision with root package name */
    public long f8966E;

    /* renamed from: F, reason: collision with root package name */
    public C0116F f8967F;

    /* renamed from: G, reason: collision with root package name */
    public long f8968G;

    public C0611a() {
        super(6);
        this.f8964C = new f(1);
        this.f8965D = new r();
    }

    @Override // a0.AbstractC0125e
    public final int D(C0095p c0095p) {
        return "application/x-camera-motion".equals(c0095p.f2325m) ? AbstractC0125e.f(4, 0, 0, 0) : AbstractC0125e.f(0, 0, 0, 0);
    }

    @Override // a0.AbstractC0125e, a0.h0
    public final void d(int i4, Object obj) {
        if (i4 == 8) {
            this.f8967F = (C0116F) obj;
        }
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "CameraMotionRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        return m();
    }

    @Override // a0.AbstractC0125e
    public final boolean p() {
        return true;
    }

    @Override // a0.AbstractC0125e
    public final void q() {
        C0116F c0116f = this.f8967F;
        if (c0116f != null) {
            c0116f.b();
        }
    }

    @Override // a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        this.f8968G = Long.MIN_VALUE;
        C0116F c0116f = this.f8967F;
        if (c0116f != null) {
            c0116f.b();
        }
    }

    @Override // a0.AbstractC0125e
    public final void x(C0095p[] c0095pArr, long j4, long j5) {
        this.f8966E = j5;
    }

    @Override // a0.AbstractC0125e
    public final void z(long j4, long j5) {
        float[] fArr;
        while (!m() && this.f8968G < 100000 + j4) {
            f fVar = this.f8964C;
            fVar.e();
            x xVar = this.f3423n;
            xVar.N();
            if (y(xVar, fVar, 0) != -4 || fVar.c(4)) {
                return;
            }
            long j6 = fVar.f3142r;
            this.f8968G = j6;
            boolean z4 = j6 < this.w;
            if (this.f8967F != null && !z4) {
                fVar.i();
                ByteBuffer byteBuffer = fVar.f3140p;
                int i4 = y.f2709a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    r rVar = this.f8965D;
                    rVar.E(array, limit);
                    rVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i5 = 0; i5 < 3; i5++) {
                        fArr2[i5] = Float.intBitsToFloat(rVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f8967F.a(this.f8968G - this.f8966E, fArr);
                }
            }
        }
    }
}
