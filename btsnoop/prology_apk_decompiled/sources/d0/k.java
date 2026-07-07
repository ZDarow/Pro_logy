package d0;

import B2.D;
import I.C0044m;
import T.C0095p;
import T.H;
import W.y;
import Y.w;
import a0.Q;
import android.os.SystemClock;
import e0.C0249a;
import e0.C0250b;
import e0.C0251c;
import f1.C0271e;
import f2.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q0.C0470b;
import r0.AbstractC0503e;
import r0.C0502d;
import t0.C0560b;
import t0.s;
import y0.z;

/* loaded from: classes.dex */
public final class k implements r0.i {

    /* renamed from: a, reason: collision with root package name */
    public final u0.o f4889a;

    /* renamed from: b, reason: collision with root package name */
    public final C0044m f4890b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4892d;

    /* renamed from: e, reason: collision with root package name */
    public final Y.h f4893e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4894f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4895g;

    /* renamed from: h, reason: collision with root package name */
    public final n f4896h;

    /* renamed from: i, reason: collision with root package name */
    public final i[] f4897i;

    /* renamed from: j, reason: collision with root package name */
    public s f4898j;

    /* renamed from: k, reason: collision with root package name */
    public C0251c f4899k;

    /* renamed from: l, reason: collision with root package name */
    public int f4900l;

    /* renamed from: m, reason: collision with root package name */
    public C0470b f4901m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4902n;

    public k(D d4, u0.o oVar, C0251c c0251c, C0044m c0044m, int i4, int[] iArr, s sVar, int i5, Y.h hVar, long j4, int i6, boolean z4, ArrayList arrayList, n nVar) {
        y0.o nVar2;
        String str;
        C0095p c0095p;
        i[] iVarArr;
        e0.m mVar;
        C0502d c0502d;
        this.f4889a = oVar;
        this.f4899k = c0251c;
        this.f4890b = c0044m;
        this.f4891c = iArr;
        this.f4898j = sVar;
        this.f4892d = i5;
        this.f4893e = hVar;
        this.f4900l = i4;
        this.f4894f = j4;
        this.f4895g = i6;
        this.f4896h = nVar;
        long d5 = c0251c.d(i4);
        ArrayList h4 = h();
        this.f4897i = new i[sVar.length()];
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f4897i.length) {
            e0.m mVar2 = (e0.m) h4.get(sVar.k(i8));
            C0250b p2 = c0044m.p(mVar2.f5078m);
            i[] iVarArr2 = this.f4897i;
            C0250b c0250b = p2 == null ? (C0250b) mVar2.f5078m.get(i7) : p2;
            C0095p c0095p2 = mVar2.f5077l;
            d4.getClass();
            String str2 = c0095p2.f2324l;
            if (!H.j(str2)) {
                if (str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) {
                    str = str2;
                    c0095p = c0095p2;
                    iVarArr = iVarArr2;
                    mVar = mVar2;
                    nVar2 = new Q0.d((L1.g) d4.f116b, d4.f115a ? 1 : 3);
                } else if (Objects.equals(str2, "image/jpeg")) {
                    nVar2 = new C0.a(1);
                } else if (Objects.equals(str2, "image/png")) {
                    nVar2 = new C0.a(1, (byte) 0);
                } else {
                    int i9 = z4 ? 4 : 0;
                    str = str2;
                    c0095p = c0095p2;
                    iVarArr = iVarArr2;
                    mVar = mVar2;
                    nVar2 = new S0.n((L1.g) d4.f116b, d4.f115a ? i9 : i9 | 32, null, null, arrayList, nVar);
                }
                if (d4.f115a && !H.j(str) && !(nVar2.d() instanceof S0.n) && !(nVar2.d() instanceof Q0.d)) {
                    nVar2 = new V0.m(nVar2, (L1.g) d4.f116b);
                }
                c0502d = new C0502d(nVar2, i5, c0095p);
                int i10 = i8;
                iVarArr[i10] = new i(d5, mVar, c0250b, c0502d, 0L, mVar.d());
                i8 = i10 + 1;
                i7 = 0;
            } else if (d4.f115a) {
                nVar2 = new V0.h(((L1.g) d4.f116b).d(c0095p2), c0095p2);
            } else {
                c0502d = null;
                iVarArr = iVarArr2;
                mVar = mVar2;
                int i102 = i8;
                iVarArr[i102] = new i(d5, mVar, c0250b, c0502d, 0L, mVar.d());
                i8 = i102 + 1;
                i7 = 0;
            }
            str = str2;
            c0095p = c0095p2;
            iVarArr = iVarArr2;
            mVar = mVar2;
            if (d4.f115a) {
                nVar2 = new V0.m(nVar2, (L1.g) d4.f116b);
            }
            c0502d = new C0502d(nVar2, i5, c0095p);
            int i1022 = i8;
            iVarArr[i1022] = new i(d5, mVar, c0250b, c0502d, 0L, mVar.d());
            i8 = i1022 + 1;
            i7 = 0;
        }
    }

    @Override // r0.i
    public final void a() {
        C0470b c0470b = this.f4901m;
        if (c0470b != null) {
            throw c0470b;
        }
        this.f4889a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r3 < (((r0.l() + r10) + r8) - 1)) goto L15;
     */
    @Override // r0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, a0.m0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            d0.i[] r0 = r7.f4897i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            d0.h r6 = r5.f4884d
            if (r6 == 0) goto L5c
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5c
        L1b:
            d0.h r0 = r5.f4884d
            W.a.k(r0)
            long r3 = r5.f4885e
            long r3 = r0.c(r1, r3)
            long r10 = r5.f4886f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4a
            W.a.k(r0)
            long r16 = r0.l()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L51
        L4a:
            long r3 = r3 + r14
            long r3 = r5.f(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r12
        L52:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.k.b(long, a0.m0):long");
    }

    @Override // r0.i
    public final boolean c(long j4, AbstractC0503e abstractC0503e, List list) {
        if (this.f4901m != null) {
            return false;
        }
        return this.f4898j.f(j4, abstractC0503e, list);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [q0.b, java.io.IOException] */
    @Override // r0.i
    public final void d(Q q4, long j4, List list, D d4) {
        long j5;
        i[] iVarArr;
        r0.n[] nVarArr;
        long j6;
        e0.m mVar;
        long j7;
        long k4;
        C0095p c0095p;
        long j8;
        long j9;
        Object jVar;
        long M3;
        long j10;
        long k5;
        boolean z4;
        if (this.f4901m != null) {
            return;
        }
        long j11 = q4.f3332a;
        long j12 = j4 - j11;
        long M4 = y.M(this.f4899k.b(this.f4900l).f5062b) + y.M(this.f4899k.f5029a) + j4;
        n nVar = this.f4896h;
        if (nVar != null) {
            o oVar = nVar.f4916e;
            C0251c c0251c = oVar.f4922q;
            if (!c0251c.f5032d) {
                j5 = j12;
                z4 = false;
            } else if (oVar.s) {
                j5 = j12;
                z4 = true;
            } else {
                Map.Entry ceilingEntry = oVar.f4921p.ceilingEntry(Long.valueOf(c0251c.f5036h));
                d dVar = oVar.f4918m;
                if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= M4) {
                    j5 = j12;
                    z4 = false;
                } else {
                    long longValue = ((Long) ceilingEntry.getKey()).longValue();
                    g gVar = dVar.f4837m;
                    j5 = j12;
                    long j13 = gVar.f4872Y;
                    if (j13 == -9223372036854775807L || j13 < longValue) {
                        gVar.f4872Y = longValue;
                    }
                    z4 = true;
                }
                if (z4 && oVar.f4923r) {
                    oVar.s = true;
                    oVar.f4923r = false;
                    g gVar2 = dVar.f4837m;
                    gVar2.f4862O.removeCallbacks(gVar2.f4856H);
                    gVar2.B();
                }
            }
            if (z4) {
                return;
            }
        } else {
            j5 = j12;
        }
        long M5 = y.M(y.z(this.f4894f));
        C0251c c0251c2 = this.f4899k;
        long j14 = c0251c2.f5029a;
        long M6 = j14 == -9223372036854775807L ? -9223372036854775807L : M5 - y.M(j14 + c0251c2.b(this.f4900l).f5062b);
        r0.l lVar = list.isEmpty() ? null : (r0.l) list.get(list.size() - 1);
        int length = this.f4898j.length();
        r0.n[] nVarArr2 = new r0.n[length];
        int i4 = 0;
        while (true) {
            iVarArr = this.f4897i;
            if (i4 >= length) {
                break;
            }
            i iVar = iVarArr[i4];
            h hVar = iVar.f4884d;
            r0.m mVar2 = r0.n.f8064f;
            if (hVar == null) {
                nVarArr2[i4] = mVar2;
                j10 = M6;
            } else {
                long b4 = iVar.b(M5);
                long c4 = iVar.c(M5);
                if (lVar != null) {
                    j10 = M6;
                    k5 = lVar.a();
                } else {
                    h hVar2 = iVar.f4884d;
                    W.a.k(hVar2);
                    j10 = M6;
                    k5 = y.k(hVar2.c(j4, iVar.f4885e) + iVar.f4886f, b4, c4);
                }
                if (k5 < b4) {
                    nVarArr2[i4] = mVar2;
                } else {
                    nVarArr2[i4] = new j(i(i4), k5, c4);
                }
            }
            i4++;
            M6 = j10;
        }
        long j15 = M6;
        long j16 = 0;
        if (!this.f4899k.f5032d || iVarArr[0].d() == 0) {
            nVarArr = nVarArr2;
            j6 = -9223372036854775807L;
        } else {
            long e4 = iVarArr[0].e(iVarArr[0].c(M5));
            C0251c c0251c3 = this.f4899k;
            long j17 = c0251c3.f5029a;
            if (j17 == -9223372036854775807L) {
                nVarArr = nVarArr2;
                M3 = -9223372036854775807L;
            } else {
                nVarArr = nVarArr2;
                M3 = M5 - y.M(j17 + c0251c3.b(this.f4900l).f5062b);
            }
            long min = Math.min(M3, e4) - j11;
            j16 = 0;
            j6 = Math.max(0L, min);
        }
        long j18 = j5;
        long j19 = j16;
        this.f4898j.s(j11, j18, j6, list, nVarArr);
        int g4 = this.f4898j.g();
        SystemClock.elapsedRealtime();
        i i5 = i(g4);
        h hVar3 = i5.f4884d;
        C0250b c0250b = i5.f4883c;
        C0502d c0502d = i5.f4881a;
        e0.m mVar3 = i5.f4882b;
        if (c0502d != null) {
            e0.j jVar2 = c0502d.f8019t == null ? mVar3.f5081p : null;
            e0.j e5 = hVar3 == null ? mVar3.e() : null;
            if (jVar2 != null || e5 != null) {
                C0095p d5 = this.f4898j.d();
                int e6 = this.f4898j.e();
                Object l4 = this.f4898j.l();
                if (jVar2 != null) {
                    e0.j a4 = jVar2.a(e5, c0250b.f5025a);
                    if (a4 != null) {
                        jVar2 = a4;
                    }
                } else {
                    e5.getClass();
                    jVar2 = e5;
                }
                d4.f116b = new r0.k(this.f4893e, U1.a.b(mVar3, c0250b.f5025a, jVar2, 0), d5, e6, l4, i5.f4881a);
                return;
            }
        }
        C0251c c0251c4 = this.f4899k;
        boolean z5 = c0251c4.f5032d && this.f4900l == c0251c4.f5041m.size() - 1;
        long j20 = i5.f4885e;
        boolean z6 = (z5 && j20 == -9223372036854775807L) ? false : true;
        if (i5.d() == j19) {
            d4.f115a = z6;
            return;
        }
        long b5 = i5.b(M5);
        long c5 = i5.c(M5);
        if (z5) {
            long e7 = i5.e(c5);
            z6 &= (e7 - i5.f(c5)) + e7 >= j20;
        }
        long j21 = i5.f4886f;
        if (lVar != null) {
            mVar = mVar3;
            k4 = lVar.a();
            j7 = j20;
        } else {
            W.a.k(hVar3);
            mVar = mVar3;
            j7 = j20;
            k4 = y.k(hVar3.c(j4, j7) + j21, b5, c5);
        }
        if (k4 < b5) {
            this.f4901m = new IOException();
            return;
        }
        if (k4 <= c5) {
            e0.m mVar4 = mVar;
            if (!this.f4902n || k4 < c5) {
                if (z6 && i5.f(k4) >= j7) {
                    d4.f115a = true;
                    return;
                }
                int min2 = (int) Math.min(this.f4895g, (c5 - k4) + 1);
                if (j7 != -9223372036854775807L) {
                    while (min2 > 1 && i5.f((min2 + k4) - 1) >= j7) {
                        min2--;
                    }
                }
                long j22 = list.isEmpty() ? j4 : -9223372036854775807L;
                C0095p d6 = this.f4898j.d();
                int e8 = this.f4898j.e();
                Object l5 = this.f4898j.l();
                long f4 = i5.f(k4);
                W.a.k(hVar3);
                long j23 = j7;
                e0.j E3 = hVar3.E(k4 - j21);
                Y.h hVar4 = this.f4893e;
                if (c0502d == null) {
                    jVar = new r0.o(hVar4, U1.a.b(mVar4, c0250b.f5025a, E3, i5.g(k4, j15) ? 0 : 8), d6, e8, l5, f4, i5.e(k4), k4, this.f4892d, d6);
                } else {
                    int i6 = 1;
                    int i7 = 1;
                    while (true) {
                        if (i7 >= min2) {
                            c0095p = d6;
                            break;
                        }
                        int i8 = min2;
                        c0095p = d6;
                        W.a.k(hVar3);
                        e0.j a5 = E3.a(hVar3.E((i7 + k4) - j21), c0250b.f5025a);
                        if (a5 == null) {
                            break;
                        }
                        i6++;
                        i7++;
                        d6 = c0095p;
                        E3 = a5;
                        min2 = i8;
                    }
                    long j24 = (i6 + k4) - 1;
                    long e9 = i5.e(j24);
                    if (j7 == -9223372036854775807L || j23 > e9) {
                        j8 = j15;
                        j9 = -9223372036854775807L;
                    } else {
                        j9 = j23;
                        j8 = j15;
                    }
                    Y.l b6 = U1.a.b(mVar4, c0250b.f5025a, E3, i5.g(j24, j8) ? 0 : 8);
                    long j25 = -mVar4.f5079n;
                    C0095p c0095p2 = c0095p;
                    if (H.i(c0095p2.f2325m)) {
                        j25 += f4;
                    }
                    jVar = new r0.j(hVar4, b6, c0095p2, e8, l5, f4, e9, j22, j9, k4, i6, j25, i5.f4881a);
                }
                d4.f116b = jVar;
                return;
            }
        }
        d4.f115a = z6;
    }

    @Override // r0.i
    public final boolean e(AbstractC0503e abstractC0503e, boolean z4, B.c cVar, C0560b c0560b) {
        long j4;
        if (!z4) {
            return false;
        }
        n nVar = this.f4896h;
        if (nVar != null) {
            long j5 = nVar.f4915d;
            boolean z5 = j5 != -9223372036854775807L && j5 < abstractC0503e.f8026r;
            o oVar = nVar.f4916e;
            if (oVar.f4922q.f5032d) {
                if (!oVar.s) {
                    if (z5) {
                        if (oVar.f4923r) {
                            oVar.s = true;
                            oVar.f4923r = false;
                            g gVar = oVar.f4918m.f4837m;
                            gVar.f4862O.removeCallbacks(gVar.f4856H);
                            gVar.B();
                        }
                    }
                }
                return true;
            }
        }
        boolean z6 = this.f4899k.f5032d;
        i[] iVarArr = this.f4897i;
        if (!z6 && (abstractC0503e instanceof r0.l)) {
            IOException iOException = (IOException) cVar.f85m;
            if ((iOException instanceof w) && ((w) iOException).f3063o == 404) {
                i iVar = iVarArr[this.f4898j.p(abstractC0503e.f8023o)];
                long d4 = iVar.d();
                if (d4 != -1 && d4 != 0) {
                    h hVar = iVar.f4884d;
                    W.a.k(hVar);
                    if (((r0.l) abstractC0503e).a() > ((hVar.l() + iVar.f4886f) + d4) - 1) {
                        this.f4902n = true;
                        return true;
                    }
                }
            }
        }
        i iVar2 = iVarArr[this.f4898j.p(abstractC0503e.f8023o)];
        I i4 = iVar2.f4882b.f5078m;
        C0044m c0044m = this.f4890b;
        C0250b p2 = c0044m.p(i4);
        C0250b c0250b = iVar2.f4883c;
        if (p2 != null && !c0250b.equals(p2)) {
            return true;
        }
        s sVar = this.f4898j;
        I i5 = iVar2.f4882b.f5078m;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (sVar.o(elapsedRealtime, i7)) {
                i6++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < i5.size(); i8++) {
            hashSet.add(Integer.valueOf(((C0250b) i5.get(i8)).f5027c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList d5 = c0044m.d(i5);
        for (int i9 = 0; i9 < d5.size(); i9++) {
            hashSet2.add(Integer.valueOf(((C0250b) d5.get(i9)).f5027c));
        }
        u0.h hVar2 = new u0.h(size, size - hashSet2.size(), length, i6);
        if (!hVar2.a(2) && !hVar2.a(1)) {
            return false;
        }
        c0560b.getClass();
        C0271e d6 = C0560b.d(hVar2, cVar);
        if (d6 != null) {
            int i10 = d6.f5489a;
            if (hVar2.a(i10)) {
                long j6 = d6.f5490b;
                if (i10 == 2) {
                    s sVar2 = this.f4898j;
                    return sVar2.q(j6, sVar2.p(abstractC0503e.f8023o));
                }
                if (i10 != 1) {
                    return false;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j6;
                String str = c0250b.f5026b;
                HashMap hashMap = (HashMap) c0044m.f847l;
                if (hashMap.containsKey(str)) {
                    Long l4 = (Long) hashMap.get(str);
                    int i11 = y.f2709a;
                    j4 = Math.max(elapsedRealtime2, l4.longValue());
                } else {
                    j4 = elapsedRealtime2;
                }
                hashMap.put(str, Long.valueOf(j4));
                int i12 = c0250b.f5027c;
                if (i12 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer valueOf = Integer.valueOf(i12);
                HashMap hashMap2 = (HashMap) c0044m.f848m;
                if (hashMap2.containsKey(valueOf)) {
                    Long l5 = (Long) hashMap2.get(valueOf);
                    int i13 = y.f2709a;
                    elapsedRealtime2 = Math.max(elapsedRealtime2, l5.longValue());
                }
                hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // r0.i
    public final void f(AbstractC0503e abstractC0503e) {
        if (abstractC0503e instanceof r0.k) {
            int p2 = this.f4898j.p(((r0.k) abstractC0503e).f8023o);
            i[] iVarArr = this.f4897i;
            i iVar = iVarArr[p2];
            if (iVar.f4884d == null) {
                C0502d c0502d = iVar.f4881a;
                W.a.k(c0502d);
                z zVar = c0502d.s;
                y0.j jVar = zVar instanceof y0.j ? (y0.j) zVar : null;
                if (jVar != null) {
                    e0.m mVar = iVar.f4882b;
                    iVarArr[p2] = new i(iVar.f4885e, mVar, iVar.f4883c, iVar.f4881a, iVar.f4886f, new G0.c(jVar, mVar.f5079n, 4));
                }
            }
        }
        n nVar = this.f4896h;
        if (nVar != null) {
            long j4 = nVar.f4915d;
            if (j4 == -9223372036854775807L || abstractC0503e.s > j4) {
                nVar.f4915d = abstractC0503e.s;
            }
            nVar.f4916e.f4923r = true;
        }
    }

    @Override // r0.i
    public final int g(long j4, List list) {
        return (this.f4901m != null || this.f4898j.length() < 2) ? list.size() : this.f4898j.n(j4, list);
    }

    public final ArrayList h() {
        List list = this.f4899k.b(this.f4900l).f5063c;
        ArrayList arrayList = new ArrayList();
        for (int i4 : this.f4891c) {
            arrayList.addAll(((C0249a) list.get(i4)).f5021c);
        }
        return arrayList;
    }

    public final i i(int i4) {
        i[] iVarArr = this.f4897i;
        i iVar = iVarArr[i4];
        C0250b p2 = this.f4890b.p(iVar.f4882b.f5078m);
        if (p2 == null || p2.equals(iVar.f4883c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.f4885e, iVar.f4882b, p2, iVar.f4881a, iVar.f4886f, iVar.f4884d);
        iVarArr[i4] = iVar2;
        return iVar2;
    }

    @Override // r0.i
    public final void release() {
        for (i iVar : this.f4897i) {
            C0502d c0502d = iVar.f4881a;
            if (c0502d != null) {
                c0502d.f8012l.release();
            }
        }
    }
}
