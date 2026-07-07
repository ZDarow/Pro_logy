package g0;

import T.C0095p;
import T.V;
import W.y;
import Y.C;
import a.AbstractC0110a;
import android.net.Uri;
import android.util.Pair;
import f2.G;
import f2.I;
import f2.Y;
import f2.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.C0470b;
import r0.AbstractC0503e;
import t0.AbstractC0562d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C0307c f5657a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.h f5658b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.h f5659c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f5660d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f5661e;

    /* renamed from: f, reason: collision with root package name */
    public final C0095p[] f5662f;

    /* renamed from: g, reason: collision with root package name */
    public final h0.c f5663g;

    /* renamed from: h, reason: collision with root package name */
    public final V f5664h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5665i;

    /* renamed from: k, reason: collision with root package name */
    public final b0.l f5667k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5668l;

    /* renamed from: n, reason: collision with root package name */
    public C0470b f5670n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f5671o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5672p;

    /* renamed from: q, reason: collision with root package name */
    public t0.s f5673q;
    public boolean s;

    /* renamed from: j, reason: collision with root package name */
    public final Y f5666j = new Y(2);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f5669m = y.f2714f;

    /* renamed from: r, reason: collision with root package name */
    public long f5674r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [t0.s, t0.d, g0.g] */
    public i(C0307c c0307c, h0.c cVar, Uri[] uriArr, C0095p[] c0095pArr, Y y4, C c4, Y y5, List list, b0.l lVar) {
        this.f5657a = c0307c;
        this.f5663g = cVar;
        this.f5661e = uriArr;
        this.f5662f = c0095pArr;
        this.f5660d = y5;
        this.f5665i = list;
        this.f5667k = lVar;
        Y.h a4 = ((Y.g) y4.f5535m).a();
        this.f5658b = a4;
        if (c4 != null) {
            a4.j(c4);
        }
        this.f5659c = ((Y.g) y4.f5535m).a();
        this.f5664h = new V("", c0095pArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < uriArr.length; i4++) {
            if ((c0095pArr[i4].f2318f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        V v4 = this.f5664h;
        int[] X3 = AbstractC0110a.X(arrayList);
        ?? abstractC0562d = new AbstractC0562d(v4, X3);
        abstractC0562d.f5652g = abstractC0562d.p(v4.f2172d[X3[0]]);
        this.f5673q = abstractC0562d;
    }

    public final r0.n[] a(k kVar, long j4) {
        int i4;
        List list;
        int b4 = kVar == null ? -1 : this.f5664h.b(kVar.f8023o);
        int length = this.f5673q.length();
        r0.n[] nVarArr = new r0.n[length];
        boolean z4 = false;
        int i5 = 0;
        while (i5 < length) {
            int k4 = this.f5673q.k(i5);
            Uri uri = this.f5661e[k4];
            h0.c cVar = this.f5663g;
            if (cVar.c(uri)) {
                h0.i a4 = cVar.a(z4, uri);
                a4.getClass();
                long j5 = a4.f5900h - cVar.f5875y;
                i4 = i5;
                Pair c4 = c(kVar, k4 != b4 ? true : z4, a4, j5, j4);
                long longValue = ((Long) c4.first).longValue();
                int intValue = ((Integer) c4.second).intValue();
                int i6 = (int) (longValue - a4.f5903k);
                if (i6 >= 0) {
                    I i7 = a4.f5910r;
                    if (i7.size() >= i6) {
                        ArrayList arrayList = new ArrayList();
                        if (i6 < i7.size()) {
                            if (intValue != -1) {
                                h0.f fVar = (h0.f) i7.get(i6);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f5880x.size()) {
                                    I i8 = fVar.f5880x;
                                    arrayList.addAll(i8.subList(intValue, i8.size()));
                                }
                                i6++;
                            }
                            arrayList.addAll(i7.subList(i6, i7.size()));
                            intValue = 0;
                        }
                        if (a4.f5906n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            I i9 = a4.s;
                            if (intValue < i9.size()) {
                                arrayList.addAll(i9.subList(intValue, i9.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        nVarArr[i4] = new f(j5, list);
                    }
                }
                G g4 = I.f5510m;
                list = c0.f5550p;
                nVarArr[i4] = new f(j5, list);
            } else {
                nVarArr[i5] = r0.n.f8064f;
                i4 = i5;
            }
            i5 = i4 + 1;
            z4 = false;
        }
        return nVarArr;
    }

    public final int b(k kVar) {
        if (kVar.f5701z == -1) {
            return 1;
        }
        h0.i a4 = this.f5663g.a(false, this.f5661e[this.f5664h.b(kVar.f8023o)]);
        a4.getClass();
        int i4 = (int) (kVar.f8063u - a4.f5903k);
        if (i4 < 0) {
            return 1;
        }
        I i5 = a4.f5910r;
        I i6 = i4 < i5.size() ? ((h0.f) i5.get(i4)).f5880x : a4.s;
        int size = i6.size();
        int i7 = kVar.f5701z;
        if (i7 >= size) {
            return 2;
        }
        h0.d dVar = (h0.d) i6.get(i7);
        if (dVar.f5876x) {
            return 0;
        }
        return y.a(Uri.parse(W.a.x(a4.f5932a, dVar.f5881l)), kVar.f8021m.f3029a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z4, h0.i iVar, long j4, long j5) {
        boolean z5 = true;
        if (kVar != null && !z4) {
            boolean z6 = kVar.f5694S;
            long j6 = kVar.f8063u;
            int i4 = kVar.f5701z;
            if (!z6) {
                return new Pair(Long.valueOf(j6), Integer.valueOf(i4));
            }
            if (i4 == -1) {
                j6 = kVar.a();
            }
            return new Pair(Long.valueOf(j6), Integer.valueOf(i4 != -1 ? i4 + 1 : -1));
        }
        long j7 = iVar.f5912u + j4;
        if (kVar != null && !this.f5672p) {
            j5 = kVar.f8026r;
        }
        boolean z7 = iVar.f5907o;
        long j8 = iVar.f5903k;
        I i5 = iVar.f5910r;
        if (!z7 && j5 >= j7) {
            return new Pair(Long.valueOf(j8 + i5.size()), -1);
        }
        long j9 = j5 - j4;
        Long valueOf = Long.valueOf(j9);
        int i6 = 0;
        if (this.f5663g.f5874x && kVar != null) {
            z5 = false;
        }
        int d4 = y.d(i5, valueOf, z5);
        long j10 = d4 + j8;
        if (d4 >= 0) {
            h0.f fVar = (h0.f) i5.get(d4);
            long j11 = fVar.f5885p + fVar.f5883n;
            I i7 = iVar.s;
            I i8 = j9 < j11 ? fVar.f5880x : i7;
            while (true) {
                if (i6 >= i8.size()) {
                    break;
                }
                h0.d dVar = (h0.d) i8.get(i6);
                if (j9 >= dVar.f5885p + dVar.f5883n) {
                    i6++;
                } else if (dVar.w) {
                    j10 += i8 == i7 ? 1L : 0L;
                    r1 = i6;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0.e, g0.e] */
    public final C0309e d(Uri uri, int i4, boolean z4) {
        if (uri == null) {
            return null;
        }
        Y y4 = this.f5666j;
        byte[] bArr = (byte[]) ((C0308d) y4.f5535m).remove(uri);
        if (bArr != null) {
            return null;
        }
        Y.l lVar = new Y.l(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        C0095p c0095p = this.f5662f[i4];
        int e4 = this.f5673q.e();
        Object l4 = this.f5673q.l();
        byte[] bArr2 = this.f5669m;
        ?? abstractC0503e = new AbstractC0503e(this.f5659c, lVar, 3, c0095p, e4, l4, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = y.f2714f;
        }
        abstractC0503e.f5648u = bArr2;
        return abstractC0503e;
    }
}
