package a0;

/* renamed from: a0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116F implements h0 {

    /* renamed from: l, reason: collision with root package name */
    public C0116F f3205l;

    /* renamed from: m, reason: collision with root package name */
    public C0116F f3206m;

    public final void a(long j4, float[] fArr) {
        C0116F c0116f = this.f3206m;
        if (c0116f != null) {
            c0116f.a(j4, fArr);
        }
    }

    public final void b() {
        C0116F c0116f = this.f3206m;
        if (c0116f != null) {
            c0116f.b();
        }
    }

    public final void c(long j4, long j5) {
        C0116F c0116f = this.f3205l;
        if (c0116f != null) {
            c0116f.c(j4, j5);
        }
    }

    @Override // a0.h0
    public final void d(int i4, Object obj) {
        if (i4 == 7) {
            this.f3205l = (C0116F) obj;
        } else if (i4 == 8) {
            this.f3206m = (C0116F) obj;
        } else if (i4 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
