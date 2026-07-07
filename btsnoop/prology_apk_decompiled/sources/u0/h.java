package u0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8529d;

    public h(int i4, int i5, int i6, int i7) {
        this.f8526a = i4;
        this.f8527b = i5;
        this.f8528c = i6;
        this.f8529d = i7;
    }

    public final boolean a(int i4) {
        if (i4 == 1) {
            if (this.f8526a - this.f8527b <= 1) {
                return false;
            }
        } else if (this.f8528c - this.f8529d <= 1) {
            return false;
        }
        return true;
    }
}
