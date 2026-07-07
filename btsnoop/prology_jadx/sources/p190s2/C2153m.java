package p190s2;

/* renamed from: s2.m */
/* loaded from: classes.dex */
public final class C2153m {

    /* renamed from: a */
    public final java.lang.String f8588a;

    /* renamed from: b */
    public final java.lang.String f8589b;

    /* renamed from: c */
    public final long f8590c;

    /* renamed from: d */
    public final p190s2.C2152l f8591d;

    public C2153m(java.lang.String str, java.lang.String str2, long j4, p190s2.C2152l c2152l) {
        this.f8588a = str;
        this.f8589b = str2;
        this.f8590c = j4;
        this.f8591d = c2152l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p190s2.C2153m)) {
            return false;
        }
        p190s2.C2153m c2153m = (p190s2.C2153m) obj;
        return this.f8588a.equals(c2153m.f8588a) && this.f8589b.equals(c2153m.f8589b) && this.f8590c == c2153m.f8590c && java.util.Objects.equals(this.f8591d, c2153m.f8591d);
    }
}
