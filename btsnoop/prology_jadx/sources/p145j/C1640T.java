package p145j;

/* renamed from: j.T */
/* loaded from: classes.dex */
public final class C1640T {

    /* renamed from: a */
    public int f6878a;

    /* renamed from: b */
    public int f6879b;

    /* renamed from: c */
    public int f6880c;

    /* renamed from: d */
    public int f6881d;

    /* renamed from: e */
    public int f6882e;

    /* renamed from: f */
    public int f6883f;

    /* renamed from: g */
    public boolean f6884g;

    /* renamed from: h */
    public boolean f6885h;

    /* renamed from: a */
    public final void m3598a(int i4, int i5) {
        this.f6880c = i4;
        this.f6881d = i5;
        this.f6885h = true;
        if (this.f6884g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f6878a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f6879b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f6878a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f6879b = i5;
        }
    }
}
