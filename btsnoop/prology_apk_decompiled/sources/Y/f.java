package Y;

import B2.AbstractC0007h;
import T.I;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f extends AbstractC0107c {

    /* renamed from: p, reason: collision with root package name */
    public l f3011p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f3012q;

    /* renamed from: r, reason: collision with root package name */
    public int f3013r;
    public int s;

    @Override // Y.h
    public final long b(l lVar) {
        f();
        this.f3011p = lVar;
        Uri normalizeScheme = lVar.f3029a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        W.a.d("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i4 = W.y.f2709a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new I("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f3012q = Base64.decode(str, 0);
            } catch (IllegalArgumentException e4) {
                throw new I(AbstractC0007h.l("Error while parsing Base64 encoded string: ", str), e4, true, 0);
            }
        } else {
            this.f3012q = URLDecoder.decode(str, e2.d.f5434a.name()).getBytes(e2.d.f5436c);
        }
        byte[] bArr = this.f3012q;
        long length = bArr.length;
        long j4 = lVar.f3033e;
        if (j4 > length) {
            this.f3012q = null;
            throw new i(2008);
        }
        int i5 = (int) j4;
        this.f3013r = i5;
        int length2 = bArr.length - i5;
        this.s = length2;
        long j5 = lVar.f3034f;
        if (j5 != -1) {
            this.s = (int) Math.min(length2, j5);
        }
        i(lVar);
        return j5 != -1 ? j5 : this.s;
    }

    @Override // Y.h
    public final void close() {
        if (this.f3012q != null) {
            this.f3012q = null;
            c();
        }
        this.f3011p = null;
    }

    @Override // Y.h
    public final Uri o() {
        l lVar = this.f3011p;
        if (lVar != null) {
            return lVar.f3029a;
        }
        return null;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.s;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        byte[] bArr2 = this.f3012q;
        int i7 = W.y.f2709a;
        System.arraycopy(bArr2, this.f3013r, bArr, i4, min);
        this.f3013r += min;
        this.s -= min;
        a(min);
        return min;
    }
}
