package T;

import B2.AbstractC0007h;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2218b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f2219c;

    /* renamed from: d, reason: collision with root package name */
    public final B[] f2220d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2221e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2222f;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
        W.y.H(5);
        W.y.H(6);
        W.y.H(7);
        W.y.H(8);
    }

    public C0080a(int i4, int i5, int[] iArr, B[] bArr, long[] jArr) {
        Uri uri;
        int i6 = 0;
        W.a.e(iArr.length == bArr.length);
        this.f2217a = i4;
        this.f2218b = i5;
        this.f2221e = iArr;
        this.f2220d = bArr;
        this.f2222f = jArr;
        this.f2219c = new Uri[bArr.length];
        while (true) {
            Uri[] uriArr = this.f2219c;
            if (i6 >= uriArr.length) {
                return;
            }
            B b4 = bArr[i6];
            if (b4 == null) {
                uri = null;
            } else {
                C0103y c0103y = b4.f2067b;
                c0103y.getClass();
                uri = c0103y.f2364a;
            }
            uriArr[i6] = uri;
            i6++;
        }
    }

    public final int a(int i4) {
        int i5;
        int i6 = i4 + 1;
        while (true) {
            int[] iArr = this.f2221e;
            if (i6 >= iArr.length || (i5 = iArr[i6]) == 0 || i5 == 1) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0080a.class != obj.getClass()) {
            return false;
        }
        C0080a c0080a = (C0080a) obj;
        return this.f2217a == c0080a.f2217a && this.f2218b == c0080a.f2218b && Arrays.equals(this.f2220d, c0080a.f2220d) && Arrays.equals(this.f2221e, c0080a.f2221e) && Arrays.equals(this.f2222f, c0080a.f2222f);
    }

    public final int hashCode() {
        int i4 = ((this.f2217a * 31) + this.f2218b) * 31;
        int i5 = (int) 0;
        return (((Arrays.hashCode(this.f2222f) + ((Arrays.hashCode(this.f2221e) + ((Arrays.hashCode(this.f2220d) + ((i4 + i5) * 31)) * 31)) * 31)) * 31) + i5) * 31;
    }
}
