package y0;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622e implements z {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0624g f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9056b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9057c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9058d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9059e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9060f;

    public C0622e(InterfaceC0624g interfaceC0624g, long j4, long j5, long j6, long j7, long j8) {
        this.f9055a = interfaceC0624g;
        this.f9056b = j4;
        this.f9057c = j5;
        this.f9058d = j6;
        this.f9059e = j7;
        this.f9060f = j8;
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // y0.z
    public final y f(long j4) {
        C0617A c0617a = new C0617A(j4, C0623f.a(this.f9055a.a(j4), 0L, this.f9057c, this.f9058d, this.f9059e, this.f9060f));
        return new y(c0617a, c0617a);
    }

    @Override // y0.z
    public final long i() {
        return this.f9056b;
    }
}
