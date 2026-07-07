package m0;

import android.net.Uri;
import android.util.Base64;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final C0430k f7304a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7305b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0706  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(m0.C0433n r38, m0.C0422c r39, android.net.Uri r40) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.v.<init>(m0.n, m0.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(X.g.f2863a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f7304a.equals(vVar.f7304a) && this.f7305b.equals(vVar.f7305b);
    }

    public final int hashCode() {
        return this.f7305b.hashCode() + ((this.f7304a.hashCode() + 217) * 31);
    }
}
