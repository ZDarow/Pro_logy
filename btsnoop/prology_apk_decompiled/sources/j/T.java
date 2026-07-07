package j;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f6624a;

    /* renamed from: b, reason: collision with root package name */
    public int f6625b;

    /* renamed from: c, reason: collision with root package name */
    public int f6626c;

    /* renamed from: d, reason: collision with root package name */
    public int f6627d;

    /* renamed from: e, reason: collision with root package name */
    public int f6628e;

    /* renamed from: f, reason: collision with root package name */
    public int f6629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6630g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6631h;

    public final void a(int i4, int i5) {
        this.f6626c = i4;
        this.f6627d = i5;
        this.f6631h = true;
        if (this.f6630g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f6624a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f6625b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f6624a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f6625b = i5;
        }
    }
}
