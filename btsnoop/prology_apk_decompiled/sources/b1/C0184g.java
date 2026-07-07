package b1;

import android.text.Layout;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184g {

    /* renamed from: a, reason: collision with root package name */
    public String f4437a;

    /* renamed from: b, reason: collision with root package name */
    public int f4438b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4439c;

    /* renamed from: d, reason: collision with root package name */
    public int f4440d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4441e;

    /* renamed from: k, reason: collision with root package name */
    public float f4447k;

    /* renamed from: l, reason: collision with root package name */
    public String f4448l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f4451o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f4452p;

    /* renamed from: r, reason: collision with root package name */
    public C0179b f4454r;

    /* renamed from: f, reason: collision with root package name */
    public int f4442f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f4443g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f4444h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f4445i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4446j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f4449m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f4450n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f4453q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(C0184g c0184g) {
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c0184g != null) {
            if (!this.f4439c && c0184g.f4439c) {
                this.f4438b = c0184g.f4438b;
                this.f4439c = true;
            }
            if (this.f4444h == -1) {
                this.f4444h = c0184g.f4444h;
            }
            if (this.f4445i == -1) {
                this.f4445i = c0184g.f4445i;
            }
            if (this.f4437a == null && (str = c0184g.f4437a) != null) {
                this.f4437a = str;
            }
            if (this.f4442f == -1) {
                this.f4442f = c0184g.f4442f;
            }
            if (this.f4443g == -1) {
                this.f4443g = c0184g.f4443g;
            }
            if (this.f4450n == -1) {
                this.f4450n = c0184g.f4450n;
            }
            if (this.f4451o == null && (alignment2 = c0184g.f4451o) != null) {
                this.f4451o = alignment2;
            }
            if (this.f4452p == null && (alignment = c0184g.f4452p) != null) {
                this.f4452p = alignment;
            }
            if (this.f4453q == -1) {
                this.f4453q = c0184g.f4453q;
            }
            if (this.f4446j == -1) {
                this.f4446j = c0184g.f4446j;
                this.f4447k = c0184g.f4447k;
            }
            if (this.f4454r == null) {
                this.f4454r = c0184g.f4454r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c0184g.s;
            }
            if (!this.f4441e && c0184g.f4441e) {
                this.f4440d = c0184g.f4440d;
                this.f4441e = true;
            }
            if (this.f4449m != -1 || (i4 = c0184g.f4449m) == -1) {
                return;
            }
            this.f4449m = i4;
        }
    }
}
