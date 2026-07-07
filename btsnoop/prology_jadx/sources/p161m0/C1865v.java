package p161m0;

/* renamed from: m0.v */
/* loaded from: classes.dex */
public final class C1865v {

    /* renamed from: a */
    public final p161m0.C1854k f7583a;

    /* renamed from: b */
    public final android.net.Uri f7584b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0706  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1865v(p161m0.C1857n r38, p161m0.C1846c r39, android.net.Uri r40) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p161m0.C1865v.<init>(m0.n, m0.c, android.net.Uri):void");
    }

    /* renamed from: a */
    public static byte[] m3840a(java.lang.String str) {
        byte[] decode = android.util.Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        java.lang.System.arraycopy(p090X.AbstractC0830g.f2960a, 0, bArr, 0, 4);
        java.lang.System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1865v.class != obj.getClass()) {
            return false;
        }
        p161m0.C1865v c1865v = (p161m0.C1865v) obj;
        return this.f7583a.equals(c1865v.f7583a) && this.f7584b.equals(c1865v.f7584b);
    }

    public final int hashCode() {
        return this.f7584b.hashCode() + ((this.f7583a.hashCode() + 217) * 31);
    }
}
