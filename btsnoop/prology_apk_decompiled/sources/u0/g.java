package u0;

import W.t;
import Y.C;
import android.content.Context;
import android.os.Handler;
import b0.C0177a;
import f2.I;
import f2.Y;
import f2.c0;
import f2.h0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.F;

/* loaded from: classes.dex */
public final class g implements d, C {

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f8507n = I.n(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f8508o = I.n(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f8509p = I.n(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f8510q = I.n(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f8511r = I.n(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final c0 s = I.n(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t, reason: collision with root package name */
    public static g f8512t;

    /* renamed from: a, reason: collision with root package name */
    public final h0 f8513a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f8514b = new Y(26);

    /* renamed from: c, reason: collision with root package name */
    public final t f8515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8516d;

    /* renamed from: e, reason: collision with root package name */
    public final s f8517e;

    /* renamed from: f, reason: collision with root package name */
    public int f8518f;

    /* renamed from: g, reason: collision with root package name */
    public long f8519g;

    /* renamed from: h, reason: collision with root package name */
    public long f8520h;

    /* renamed from: i, reason: collision with root package name */
    public long f8521i;

    /* renamed from: j, reason: collision with root package name */
    public long f8522j;

    /* renamed from: k, reason: collision with root package name */
    public long f8523k;

    /* renamed from: l, reason: collision with root package name */
    public long f8524l;

    /* renamed from: m, reason: collision with root package name */
    public int f8525m;

    public g(Context context, HashMap hashMap, int i4, t tVar, boolean z4) {
        this.f8513a = h0.a(hashMap);
        this.f8517e = new s(i4);
        this.f8515c = tVar;
        this.f8516d = z4;
        if (context == null) {
            this.f8525m = 0;
            this.f8523k = b(0);
            return;
        }
        W.p c4 = W.p.c(context);
        int d4 = c4.d();
        this.f8525m = d4;
        this.f8523k = b(d4);
        f fVar = new f(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c4.f2684c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fVar));
        ((Handler) c4.f2683b).post(new W.m(0, c4, fVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x0cd7, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.g.a(java.lang.String):int[]");
    }

    public final long b(int i4) {
        Integer valueOf = Integer.valueOf(i4);
        h0 h0Var = this.f8513a;
        Long l4 = (Long) h0Var.get(valueOf);
        if (l4 == null) {
            l4 = (Long) h0Var.get(0);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    public final void c(final int i4, final long j4, final long j5) {
        if (i4 == 0 && j4 == 0 && j5 == this.f8524l) {
            return;
        }
        this.f8524l = j5;
        Iterator it = ((CopyOnWriteArrayList) this.f8514b.f5535m).iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (!cVar.f8499c) {
                cVar.f8497a.post(new Runnable() { // from class: u0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.e eVar = c.this.f8498b;
                        C2.d dVar = eVar.f4344o;
                        C0177a G3 = eVar.G(((I) dVar.f368b).isEmpty() ? null : (F) f2.r.l((I) dVar.f368b));
                        eVar.K(G3, 1006, new V0.n(G3, i4, j4, j5));
                    }
                });
            }
        }
    }
}
