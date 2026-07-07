package r0;

import B2.D;
import T.C0095p;
import T.C0098t;
import Y.x;
import android.util.SparseArray;
import y0.F;
import y0.q;
import y0.z;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502d implements q, InterfaceC0504f {

    /* renamed from: u, reason: collision with root package name */
    public static final D f8010u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0098t f8011v;

    /* renamed from: l, reason: collision with root package name */
    public final y0.o f8012l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8013m;

    /* renamed from: n, reason: collision with root package name */
    public final C0095p f8014n;

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f8015o = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public boolean f8016p;

    /* renamed from: q, reason: collision with root package name */
    public x f8017q;

    /* renamed from: r, reason: collision with root package name */
    public long f8018r;
    public z s;

    /* renamed from: t, reason: collision with root package name */
    public C0095p[] f8019t;

    /* JADX WARN: Type inference failed for: r0v0, types: [B2.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, T.t] */
    static {
        ?? obj = new Object();
        obj.f116b = new L1.g(15, false);
        f8010u = obj;
        f8011v = new Object();
    }

    public C0502d(y0.o oVar, int i4, C0095p c0095p) {
        this.f8012l = oVar;
        this.f8013m = i4;
        this.f8014n = c0095p;
    }

    public final void a(x xVar, long j4, long j5) {
        this.f8017q = xVar;
        this.f8018r = j5;
        boolean z4 = this.f8016p;
        y0.o oVar = this.f8012l;
        if (!z4) {
            oVar.g(this);
            if (j4 != -9223372036854775807L) {
                oVar.b(0L, j4);
            }
            this.f8016p = true;
            return;
        }
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        oVar.b(0L, j4);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f8015o;
            if (i4 >= sparseArray.size()) {
                return;
            }
            C0501c c0501c = (C0501c) sparseArray.valueAt(i4);
            if (xVar == null) {
                c0501c.f8008e = c0501c.f8006c;
            } else {
                c0501c.f8009f = j5;
                F a02 = xVar.a0(c0501c.f8004a);
                c0501c.f8008e = a02;
                C0095p c0095p = c0501c.f8007d;
                if (c0095p != null) {
                    a02.c(c0095p);
                }
            }
            i4++;
        }
    }

    @Override // y0.q
    public final void s() {
        SparseArray sparseArray = this.f8015o;
        C0095p[] c0095pArr = new C0095p[sparseArray.size()];
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            C0095p c0095p = ((C0501c) sparseArray.valueAt(i4)).f8007d;
            W.a.k(c0095p);
            c0095pArr[i4] = c0095p;
        }
        this.f8019t = c0095pArr;
    }

    @Override // y0.q
    public final void t(z zVar) {
        this.s = zVar;
    }

    @Override // y0.q
    public final F v(int i4, int i5) {
        SparseArray sparseArray = this.f8015o;
        C0501c c0501c = (C0501c) sparseArray.get(i4);
        if (c0501c == null) {
            W.a.j(this.f8019t == null);
            c0501c = new C0501c(i4, i5, i5 == this.f8013m ? this.f8014n : null);
            x xVar = this.f8017q;
            long j4 = this.f8018r;
            if (xVar == null) {
                c0501c.f8008e = c0501c.f8006c;
            } else {
                c0501c.f8009f = j4;
                F a02 = xVar.a0(i5);
                c0501c.f8008e = a02;
                C0095p c0095p = c0501c.f8007d;
                if (c0095p != null) {
                    a02.c(c0095p);
                }
            }
            sparseArray.put(i4, c0501c);
        }
        return c0501c;
    }
}
