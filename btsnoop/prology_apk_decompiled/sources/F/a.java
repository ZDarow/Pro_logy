package F;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f534a;

    /* renamed from: b, reason: collision with root package name */
    public int f535b;

    /* renamed from: c, reason: collision with root package name */
    public float f536c;

    /* renamed from: d, reason: collision with root package name */
    public float f537d;

    /* renamed from: e, reason: collision with root package name */
    public long f538e;

    /* renamed from: f, reason: collision with root package name */
    public long f539f;

    /* renamed from: g, reason: collision with root package name */
    public long f540g;

    /* renamed from: h, reason: collision with root package name */
    public float f541h;

    /* renamed from: i, reason: collision with root package name */
    public int f542i;

    public final float a(long j4) {
        long j5 = this.f538e;
        if (j4 < j5) {
            return 0.0f;
        }
        long j6 = this.f540g;
        if (j6 < 0 || j4 < j6) {
            return f.b(((float) (j4 - j5)) / this.f534a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.f541h;
        return (f.b(((float) (j4 - j6)) / this.f542i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
