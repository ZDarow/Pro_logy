package p197u0;

/* renamed from: u0.h */
/* loaded from: classes.dex */
public final class C2221h {

    /* renamed from: a */
    public final int f8867a;

    /* renamed from: b */
    public final int f8868b;

    /* renamed from: c */
    public final int f8869c;

    /* renamed from: d */
    public final int f8870d;

    public C2221h(int i4, int i5, int i6, int i7) {
        this.f8867a = i4;
        this.f8868b = i5;
        this.f8869c = i6;
        this.f8870d = i7;
    }

    /* renamed from: a */
    public final boolean m4428a(int i4) {
        if (i4 == 1) {
            if (this.f8867a - this.f8868b <= 1) {
                return false;
            }
        } else if (this.f8869c - this.f8870d <= 1) {
            return false;
        }
        return true;
    }
}
