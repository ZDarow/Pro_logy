package D0;

import T.C0098t;
import y0.C0622e;
import y0.C0623f;
import y0.InterfaceC0624g;
import y0.i;
import y0.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0622e f421a;

    /* renamed from: b, reason: collision with root package name */
    public final i f422b;

    /* renamed from: c, reason: collision with root package name */
    public C0623f f423c;

    /* renamed from: d, reason: collision with root package name */
    public final int f424d;

    public b(InterfaceC0624g interfaceC0624g, i iVar, long j4, long j5, long j6, long j7, long j8, int i4) {
        this.f422b = iVar;
        this.f424d = i4;
        this.f421a = new C0622e(interfaceC0624g, j4, j5, j6, j7, j8);
    }

    public static int a(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j4, C0098t c0098t) {
        if (j4 == lVar.f9089o) {
            return 0;
        }
        c0098t.f2352a = j4;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(y0.l r28, T.C0098t r29) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.b.b(y0.l, T.t):int");
    }

    public final void d(long j4) {
        C0623f c0623f = this.f423c;
        if (c0623f == null || c0623f.f9061a != j4) {
            C0622e c0622e = this.f421a;
            this.f423c = new C0623f(j4, c0622e.f9055a.a(j4), c0622e.f9057c, c0622e.f9058d, c0622e.f9059e, c0622e.f9060f);
        }
    }
}
