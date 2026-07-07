package y0;

import T.C0095p;
import T.InterfaceC0089j;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class n implements F {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9102a = new byte[4096];

    @Override // y0.F
    public final void a(W.r rVar, int i4, int i5) {
        rVar.H(i4);
    }

    @Override // y0.F
    public final void b(long j4, int i4, int i5, int i6, E e4) {
    }

    @Override // y0.F
    public final void c(C0095p c0095p) {
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        byte[] bArr = this.f9102a;
        int read = interfaceC0089j.read(bArr, 0, Math.min(bArr.length, i4));
        if (read != -1) {
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }
}
