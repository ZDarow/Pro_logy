package Y;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3028i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3030b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3031c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3032d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3033e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3034f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3035g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3036h;

    static {
        T.C.a("media3.datasource");
    }

    public l(Uri uri, int i4, byte[] bArr, Map map, long j4, long j5, String str, int i5) {
        W.a.e(j4 >= 0);
        W.a.e(j4 >= 0);
        W.a.e(j5 > 0 || j5 == -1);
        uri.getClass();
        this.f3029a = uri;
        this.f3030b = i4;
        this.f3031c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f3032d = Collections.unmodifiableMap(new HashMap(map));
        this.f3033e = j4;
        this.f3034f = j5;
        this.f3035g = str;
        this.f3036h = i5;
    }

    public final l a(long j4) {
        long j5 = this.f3034f;
        long j6 = j5 != -1 ? j5 - j4 : -1L;
        if (j4 == 0 && j5 == j6) {
            return this;
        }
        return new l(this.f3029a, this.f3030b, this.f3031c, this.f3032d, this.f3033e + j4, j6, this.f3035g, this.f3036h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i4 = this.f3030b;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f3029a);
        sb.append(", ");
        sb.append(this.f3033e);
        sb.append(", ");
        sb.append(this.f3034f);
        sb.append(", ");
        sb.append(this.f3035g);
        sb.append(", ");
        sb.append(this.f3036h);
        sb.append("]");
        return sb.toString();
    }
}
