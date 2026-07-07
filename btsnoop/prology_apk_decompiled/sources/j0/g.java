package j0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g extends Z.f {

    /* renamed from: u, reason: collision with root package name */
    public long f6825u;

    /* renamed from: v, reason: collision with root package name */
    public int f6826v;
    public int w;

    @Override // Z.f
    public final void e() {
        super.e();
        this.f6826v = 0;
    }

    public final boolean j(Z.f fVar) {
        ByteBuffer byteBuffer;
        W.a.e(!fVar.c(1073741824));
        W.a.e(!fVar.c(268435456));
        W.a.e(!fVar.c(4));
        if (k()) {
            if (this.f6826v >= this.w) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f3140p;
            if (byteBuffer2 != null && (byteBuffer = this.f3140p) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f6826v;
        this.f6826v = i4 + 1;
        if (i4 == 0) {
            this.f3142r = fVar.f3142r;
            if (fVar.c(1)) {
                this.f1886m = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f3140p;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f3140p.put(byteBuffer3);
        }
        this.f6825u = fVar.f3142r;
        return true;
    }

    public final boolean k() {
        return this.f6826v > 0;
    }
}
