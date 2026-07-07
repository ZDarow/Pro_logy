package c0;

/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0213l f4625d = new Object().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4627b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4628c;

    public C0213l(C0212k c0212k) {
        this.f4626a = c0212k.f4622a;
        this.f4627b = c0212k.f4623b;
        this.f4628c = c0212k.f4624c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0213l.class != obj.getClass()) {
            return false;
        }
        C0213l c0213l = (C0213l) obj;
        return this.f4626a == c0213l.f4626a && this.f4627b == c0213l.f4627b && this.f4628c == c0213l.f4628c;
    }

    public final int hashCode() {
        return ((this.f4626a ? 1 : 0) << 2) + ((this.f4627b ? 1 : 0) << 1) + (this.f4628c ? 1 : 0);
    }
}
