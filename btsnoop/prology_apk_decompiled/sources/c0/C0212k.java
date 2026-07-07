package c0;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4622a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4623b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4624c;

    public final C0213l a() {
        if (this.f4622a || !(this.f4623b || this.f4624c)) {
            return new C0213l(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
