package T;

import B2.AbstractC0007h;
import android.net.Uri;
import f2.C0278F;
import java.util.List;

/* renamed from: T.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103y {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2365b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2366c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.I f2367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2368e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2369f;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
        W.y.H(5);
        W.y.H(6);
        W.y.H(7);
    }

    public C0103y(Uri uri, String str, U1.a aVar, List list, f2.I i4, String str2, long j4) {
        this.f2364a = uri;
        this.f2365b = H.l(str);
        this.f2366c = list;
        this.f2367d = i4;
        C0278F i5 = f2.I.i();
        for (int i6 = 0; i6 < i4.size(); i6++) {
            ((A) i4.get(i6)).getClass();
            new L1.g(13, false);
            i5.c(new Object());
        }
        i5.g();
        this.f2368e = str2;
        this.f2369f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0103y)) {
            return false;
        }
        C0103y c0103y = (C0103y) obj;
        return this.f2364a.equals(c0103y.f2364a) && W.y.a(this.f2365b, c0103y.f2365b) && W.y.a(null, null) && W.y.a(null, null) && this.f2366c.equals(c0103y.f2366c) && W.y.a(null, null) && this.f2367d.equals(c0103y.f2367d) && W.y.a(this.f2368e, c0103y.f2368e) && Long.valueOf(this.f2369f).equals(Long.valueOf(c0103y.f2369f));
    }

    public final int hashCode() {
        int hashCode = this.f2364a.hashCode() * 31;
        String str = this.f2365b;
        int hashCode2 = (this.f2367d.hashCode() + ((this.f2366c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        return (int) (((hashCode2 + (this.f2368e != null ? r2.hashCode() : 0)) * 31) + this.f2369f);
    }
}
