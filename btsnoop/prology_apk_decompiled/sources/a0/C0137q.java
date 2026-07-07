package a0;

import T.C0084e;
import android.content.Context;
import android.os.Looper;

/* renamed from: a0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3561a;

    /* renamed from: b, reason: collision with root package name */
    public final W.t f3562b;

    /* renamed from: c, reason: collision with root package name */
    public final C0135o f3563c;

    /* renamed from: d, reason: collision with root package name */
    public e2.j f3564d;

    /* renamed from: e, reason: collision with root package name */
    public final C0135o f3565e;

    /* renamed from: f, reason: collision with root package name */
    public e2.j f3566f;

    /* renamed from: g, reason: collision with root package name */
    public final C0135o f3567g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f3568h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3569i;

    /* renamed from: j, reason: collision with root package name */
    public final C0084e f3570j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3571k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3572l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f3573m;

    /* renamed from: n, reason: collision with root package name */
    public C0128h f3574n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3575o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3576p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3577q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3578r;
    public final String s;

    public C0137q(Context context) {
        C0135o c0135o = new C0135o(context, 0);
        C0135o c0135o2 = new C0135o(context, 1);
        C0135o c0135o3 = new C0135o(context, 2);
        C0136p c0136p = new C0136p(0);
        C0135o c0135o4 = new C0135o(context, 3);
        context.getClass();
        this.f3561a = context;
        this.f3563c = c0135o;
        this.f3564d = c0135o2;
        this.f3565e = c0135o3;
        this.f3566f = c0136p;
        this.f3567g = c0135o4;
        int i4 = W.y.f2709a;
        Looper myLooper = Looper.myLooper();
        this.f3568h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f3570j = C0084e.f2235e;
        this.f3571k = 1;
        this.f3572l = true;
        this.f3573m = m0.f3548c;
        this.f3574n = new C0128h(0.97f, 1.03f, 1000L, 1.0E-7f, W.y.M(20L), W.y.M(500L), 0.999f);
        this.f3562b = W.t.f2700a;
        this.f3575o = 500L;
        this.f3576p = 2000L;
        this.f3577q = true;
        this.s = "";
        this.f3569i = -1000;
    }

    public final C0118H a() {
        W.a.j(!this.f3578r);
        this.f3578r = true;
        return new C0118H(this);
    }
}
