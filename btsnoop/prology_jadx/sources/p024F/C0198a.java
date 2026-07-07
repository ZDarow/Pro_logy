package p024F;

/* renamed from: F.a */
/* loaded from: classes.dex */
public final class C0198a {

    /* renamed from: a */
    public int f544a;

    /* renamed from: b */
    public int f545b;

    /* renamed from: c */
    public float f546c;

    /* renamed from: d */
    public float f547d;

    /* renamed from: e */
    public long f548e;

    /* renamed from: f */
    public long f549f;

    /* renamed from: g */
    public long f550g;

    /* renamed from: h */
    public float f551h;

    /* renamed from: i */
    public int f552i;

    /* renamed from: a */
    public final float m560a(long j4) {
        long j5 = this.f548e;
        if (j4 < j5) {
            return 0.0f;
        }
        long j6 = this.f550g;
        if (j6 < 0 || j4 < j6) {
            return p024F.ViewOnTouchListenerC0203f.m565b(((float) (j4 - j5)) / this.f544a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.f551h;
        return (p024F.ViewOnTouchListenerC0203f.m565b(((float) (j4 - j6)) / this.f552i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
