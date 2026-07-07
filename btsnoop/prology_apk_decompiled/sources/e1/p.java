package e1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final y0.F f5287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5288b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5289c;

    /* renamed from: f, reason: collision with root package name */
    public final W.q f5292f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f5293g;

    /* renamed from: h, reason: collision with root package name */
    public int f5294h;

    /* renamed from: i, reason: collision with root package name */
    public int f5295i;

    /* renamed from: j, reason: collision with root package name */
    public long f5296j;

    /* renamed from: l, reason: collision with root package name */
    public long f5298l;

    /* renamed from: p, reason: collision with root package name */
    public long f5302p;

    /* renamed from: q, reason: collision with root package name */
    public long f5303q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5304r;
    public boolean s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f5290d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f5291e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public o f5299m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public o f5300n = new Object();

    /* renamed from: k, reason: collision with root package name */
    public boolean f5297k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5301o = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [e1.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [e1.o, java.lang.Object] */
    public p(y0.F f4, boolean z4, boolean z5) {
        this.f5287a = f4;
        this.f5288b = z4;
        this.f5289c = z5;
        byte[] bArr = new byte[128];
        this.f5293g = bArr;
        this.f5292f = new W.q(bArr, 0, 0);
        o oVar = this.f5300n;
        oVar.f5272b = false;
        oVar.f5271a = false;
    }

    public final void a() {
        boolean z4;
        int i4;
        boolean z5 = false;
        if (this.f5288b) {
            o oVar = this.f5300n;
            z4 = oVar.f5272b && ((i4 = oVar.f5275e) == 7 || i4 == 2);
        } else {
            z4 = this.s;
        }
        boolean z6 = this.f5304r;
        int i5 = this.f5295i;
        if (i5 == 5 || (z4 && i5 == 1)) {
            z5 = true;
        }
        this.f5304r = z6 | z5;
    }
}
