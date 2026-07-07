package q0;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7670c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7671d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7672e;

    public F(Object obj) {
        this(-1L, obj);
    }

    public final F a(Object obj) {
        if (this.f7668a.equals(obj)) {
            return this;
        }
        return new F(obj, this.f7669b, this.f7670c, this.f7671d, this.f7672e);
    }

    public final boolean b() {
        return this.f7669b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return this.f7668a.equals(f4.f7668a) && this.f7669b == f4.f7669b && this.f7670c == f4.f7670c && this.f7671d == f4.f7671d && this.f7672e == f4.f7672e;
    }

    public final int hashCode() {
        return ((((((((this.f7668a.hashCode() + 527) * 31) + this.f7669b) * 31) + this.f7670c) * 31) + ((int) this.f7671d)) * 31) + this.f7672e;
    }

    public F(long j4, Object obj) {
        this(obj, -1, -1, j4, -1);
    }

    public F(Object obj, long j4, int i4) {
        this(obj, -1, -1, j4, i4);
    }

    public F(Object obj, int i4, int i5, long j4, int i6) {
        this.f7668a = obj;
        this.f7669b = i4;
        this.f7670c = i5;
        this.f7671d = j4;
        this.f7672e = i6;
    }
}
