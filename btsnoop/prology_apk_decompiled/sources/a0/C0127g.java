package a0;

import T.C0095p;
import android.text.TextUtils;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3478a;

    /* renamed from: b, reason: collision with root package name */
    public final C0095p f3479b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095p f3480c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3481d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3482e;

    public C0127g(String str, C0095p c0095p, C0095p c0095p2, int i4, int i5) {
        W.a.e(i4 == 0 || i5 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f3478a = str;
        c0095p.getClass();
        this.f3479b = c0095p;
        c0095p2.getClass();
        this.f3480c = c0095p2;
        this.f3481d = i4;
        this.f3482e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0127g.class != obj.getClass()) {
            return false;
        }
        C0127g c0127g = (C0127g) obj;
        return this.f3481d == c0127g.f3481d && this.f3482e == c0127g.f3482e && this.f3478a.equals(c0127g.f3478a) && this.f3479b.equals(c0127g.f3479b) && this.f3480c.equals(c0127g.f3480c);
    }

    public final int hashCode() {
        return this.f3480c.hashCode() + ((this.f3479b.hashCode() + ((this.f3478a.hashCode() + ((((527 + this.f3481d) * 31) + this.f3482e) * 31)) * 31)) * 31);
    }
}
