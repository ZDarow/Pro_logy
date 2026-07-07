package t0;

import T.C0095p;
import T.V;
import W.y;
import android.os.SystemClock;
import f2.C0278F;
import f2.I;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561c extends AbstractC0562d {

    /* renamed from: g, reason: collision with root package name */
    public final u0.d f8290g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8291h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8292i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8293j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8294k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8295l;

    /* renamed from: m, reason: collision with root package name */
    public final float f8296m;

    /* renamed from: n, reason: collision with root package name */
    public final float f8297n;

    /* renamed from: o, reason: collision with root package name */
    public final I f8298o;

    /* renamed from: p, reason: collision with root package name */
    public final W.t f8299p;

    /* renamed from: q, reason: collision with root package name */
    public float f8300q;

    /* renamed from: r, reason: collision with root package name */
    public int f8301r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public long f8302t;

    /* renamed from: u, reason: collision with root package name */
    public r0.l f8303u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561c(V v4, int[] iArr, u0.d dVar, long j4, long j5, long j6, I i4) {
        super(v4, iArr);
        W.t tVar = W.t.f2700a;
        if (j6 < j4) {
            W.a.A("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j6 = j4;
        }
        this.f8290g = dVar;
        this.f8291h = j4 * 1000;
        this.f8292i = j5 * 1000;
        this.f8293j = j6 * 1000;
        this.f8294k = 1279;
        this.f8295l = 719;
        this.f8296m = 0.7f;
        this.f8297n = 0.75f;
        this.f8298o = I.j(i4);
        this.f8299p = tVar;
        this.f8300q = 1.0f;
        this.s = 0;
        this.f8302t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0278F c0278f = (C0278F) arrayList.get(i4);
            if (c0278f != null) {
                c0278f.a(new C0559a(j4, jArr[i4]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        r0.l lVar = (r0.l) f2.r.l(list);
        long j4 = lVar.f8026r;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j5 = lVar.s;
        if (j5 != -9223372036854775807L) {
            return j5 - j4;
        }
        return -9223372036854775807L;
    }

    @Override // t0.s
    public final int e() {
        return this.s;
    }

    @Override // t0.s
    public final int g() {
        return this.f8301r;
    }

    @Override // t0.AbstractC0562d, t0.s
    public final void i() {
        this.f8302t = -9223372036854775807L;
        this.f8303u = null;
    }

    @Override // t0.AbstractC0562d, t0.s
    public final void j(float f4) {
        this.f8300q = f4;
    }

    @Override // t0.s
    public final Object l() {
        return null;
    }

    @Override // t0.AbstractC0562d, t0.s
    public final int n(long j4, List list) {
        int i4;
        int i5;
        this.f8299p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.f8302t;
        if (j5 != -9223372036854775807L && elapsedRealtime - j5 < 1000 && (list.isEmpty() || ((r0.l) f2.r.l(list)).equals(this.f8303u))) {
            return list.size();
        }
        this.f8302t = elapsedRealtime;
        this.f8303u = list.isEmpty() ? null : (r0.l) f2.r.l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long C4 = y.C(((r0.l) list.get(size - 1)).f8026r - j4, this.f8300q);
        long j6 = this.f8293j;
        if (C4 < j6) {
            return size;
        }
        x(list);
        C0095p c0095p = this.f8307d[w(elapsedRealtime)];
        for (int i6 = 0; i6 < size; i6++) {
            r0.l lVar = (r0.l) list.get(i6);
            C0095p c0095p2 = lVar.f8023o;
            if (y.C(lVar.f8026r - j4, this.f8300q) >= j6 && c0095p2.f2321i < c0095p.f2321i && (i4 = c0095p2.f2331t) != -1 && i4 <= this.f8295l && (i5 = c0095p2.s) != -1 && i5 <= this.f8294k && i4 < c0095p.f2331t) {
                return i6;
            }
        }
        return size;
    }

    @Override // t0.AbstractC0562d, t0.s
    public final void r() {
        this.f8303u = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // t0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r14, long r16, long r18, java.util.List r20, r0.n[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            W.t r2 = r0.f8299p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f8301r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f8301r
            r1 = r1[r4]
            long r4 = r1.b()
            long r6 = r1.c()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.b()
            long r6 = r6.c()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = x(r20)
        L43:
            int r1 = r0.s
            if (r1 != 0) goto L51
            r1 = 1
            r0.s = r1
            int r1 = r13.w(r2)
            r0.f8301r = r1
            return
        L51:
            int r6 = r0.f8301r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = f2.r.l(r20)
            r0.l r7 = (r0.l) r7
            T.p r7 = r7.f8023o
            int r7 = r13.p(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = f2.r.l(r20)
            r0.l r1 = (r0.l) r1
            int r1 = r1.f8024p
            r6 = r7
        L73:
            int r7 = r13.w(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.o(r2, r6)
            if (r2 != 0) goto Lb7
            T.p[] r2 = r0.f8307d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f8291h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f8297n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f2321i
            int r3 = r3.f2321i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.f8292i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.s = r1
            r0.f8301r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0561c.s(long, long, long, java.util.List, r0.n[]):void");
    }

    public final int w(long j4) {
        long j5;
        u0.g gVar = (u0.g) this.f8290g;
        synchronized (gVar) {
            j5 = gVar.f8523k;
        }
        long j6 = ((float) j5) * this.f8296m;
        this.f8290g.getClass();
        long j7 = ((float) j6) / this.f8300q;
        if (!this.f8298o.isEmpty()) {
            int i4 = 1;
            while (i4 < this.f8298o.size() - 1 && ((C0559a) this.f8298o.get(i4)).f8288a < j7) {
                i4++;
            }
            C0559a c0559a = (C0559a) this.f8298o.get(i4 - 1);
            C0559a c0559a2 = (C0559a) this.f8298o.get(i4);
            long j8 = c0559a.f8288a;
            float f4 = ((float) (j7 - j8)) / ((float) (c0559a2.f8288a - j8));
            j7 = c0559a.f8289b + (f4 * ((float) (c0559a2.f8289b - r1)));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f8305b; i6++) {
            if (j4 == Long.MIN_VALUE || !o(j4, i6)) {
                if (h(i6).f2321i <= j7) {
                    return i6;
                }
                i5 = i6;
            }
        }
        return i5;
    }
}
