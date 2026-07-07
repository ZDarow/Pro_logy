package S0;

import T.C0091l;
import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.H;
import W.y;
import android.util.SparseArray;
import f2.G;
import f2.I;
import f2.c0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import y0.D;
import y0.F;

/* loaded from: classes.dex */
public final class n implements y0.o {

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f1932K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: L, reason: collision with root package name */
    public static final C0095p f1933L;

    /* renamed from: A, reason: collision with root package name */
    public long f1934A;

    /* renamed from: B, reason: collision with root package name */
    public m f1935B;

    /* renamed from: C, reason: collision with root package name */
    public int f1936C;

    /* renamed from: D, reason: collision with root package name */
    public int f1937D;

    /* renamed from: E, reason: collision with root package name */
    public int f1938E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1939F;

    /* renamed from: G, reason: collision with root package name */
    public y0.q f1940G;

    /* renamed from: H, reason: collision with root package name */
    public F[] f1941H;

    /* renamed from: I, reason: collision with root package name */
    public F[] f1942I;
    public boolean J;

    /* renamed from: a, reason: collision with root package name */
    public final V0.j f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1944b;

    /* renamed from: c, reason: collision with root package name */
    public final u f1945c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1946d;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f1951i;

    /* renamed from: j, reason: collision with root package name */
    public final W.r f1952j;

    /* renamed from: k, reason: collision with root package name */
    public final W.w f1953k;

    /* renamed from: p, reason: collision with root package name */
    public final d0.n f1958p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f1959q;

    /* renamed from: r, reason: collision with root package name */
    public int f1960r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public long f1961t;

    /* renamed from: u, reason: collision with root package name */
    public int f1962u;

    /* renamed from: v, reason: collision with root package name */
    public W.r f1963v;
    public long w;

    /* renamed from: x, reason: collision with root package name */
    public int f1964x;

    /* renamed from: y, reason: collision with root package name */
    public long f1965y;

    /* renamed from: z, reason: collision with root package name */
    public long f1966z;

    /* renamed from: l, reason: collision with root package name */
    public final B1.d f1954l = new B1.d(7);

    /* renamed from: m, reason: collision with root package name */
    public final W.r f1955m = new W.r(16);

    /* renamed from: f, reason: collision with root package name */
    public final W.r f1948f = new W.r(X.g.f2863a);

    /* renamed from: g, reason: collision with root package name */
    public final W.r f1949g = new W.r(5);

    /* renamed from: h, reason: collision with root package name */
    public final W.r f1950h = new W.r();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f1956n = new ArrayDeque();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f1957o = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f1947e = new SparseArray();

    static {
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("application/x-emsg");
        f1933L = new C0095p(c0094o);
    }

    public n(V0.j jVar, int i4, W.w wVar, u uVar, List list, d0.n nVar) {
        this.f1943a = jVar;
        this.f1944b = i4;
        this.f1953k = wVar;
        this.f1945c = uVar;
        this.f1946d = Collections.unmodifiableList(list);
        this.f1958p = nVar;
        byte[] bArr = new byte[16];
        this.f1951i = bArr;
        this.f1952j = new W.r(bArr);
        G g4 = I.f5510m;
        this.f1959q = c0.f5550p;
        this.f1966z = -9223372036854775807L;
        this.f1965y = -9223372036854775807L;
        this.f1934A = -9223372036854775807L;
        this.f1940G = y0.q.f9103k;
        this.f1941H = new F[0];
        this.f1942I = new F[0];
    }

    public static C0092m a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) arrayList.get(i4);
            if (bVar.f1886m == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f1884n.f2694a;
                K2.o h4 = t.h(bArr);
                UUID uuid = h4 == null ? null : (UUID) h4.f1009m;
                if (uuid == null) {
                    W.a.A("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0091l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0092m(null, false, (C0091l[]) arrayList2.toArray(new C0091l[0]));
    }

    public static void c(W.r rVar, int i4, w wVar) {
        rVar.G(i4 + 8);
        int h4 = rVar.h();
        if ((h4 & 1) != 0) {
            throw T.I.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (h4 & 2) != 0;
        int y4 = rVar.y();
        if (y4 == 0) {
            Arrays.fill(wVar.f2035l, 0, wVar.f2028e, false);
            return;
        }
        if (y4 != wVar.f2028e) {
            throw T.I.a(null, "Senc sample count " + y4 + " is different from fragment sample count" + wVar.f2028e);
        }
        Arrays.fill(wVar.f2035l, 0, y4, z4);
        int a4 = rVar.a();
        W.r rVar2 = wVar.f2037n;
        rVar2.D(a4);
        wVar.f2034k = true;
        wVar.f2038o = true;
        rVar.f(rVar2.f2694a, 0, rVar2.f2696c);
        rVar2.G(0);
        wVar.f2038o = false;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        SparseArray sparseArray = this.f1947e;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((m) sparseArray.valueAt(i4)).d();
        }
        this.f1957o.clear();
        this.f1964x = 0;
        this.f1965y = j5;
        this.f1956n.clear();
        this.f1960r = 0;
        this.f1962u = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x07f2, code lost:
    
        r5 = r0;
        r5.f1960r = 0;
        r5.f1962u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07f8, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r54) {
        /*
            Method dump skipped, instructions count: 2041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.n.e(long):void");
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        int i4;
        int i5 = this.f1944b;
        y0.q tVar = (i5 & 32) == 0 ? new android.support.v4.media.session.t(qVar, this.f1943a) : qVar;
        this.f1940G = tVar;
        this.f1960r = 0;
        this.f1962u = 0;
        F[] fArr = new F[2];
        this.f1941H = fArr;
        d0.n nVar = this.f1958p;
        if (nVar != null) {
            fArr[0] = nVar;
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i6 = 100;
        if ((i5 & 4) != 0) {
            fArr[i4] = tVar.v(100, 5);
            i6 = 101;
            i4++;
        }
        F[] fArr2 = (F[]) y.O(i4, this.f1941H);
        this.f1941H = fArr2;
        for (F f4 : fArr2) {
            f4.c(f1933L);
        }
        List list = this.f1946d;
        this.f1942I = new F[list.size()];
        int i7 = 0;
        while (i7 < this.f1942I.length) {
            F v4 = this.f1940G.v(i6, 3);
            v4.c((C0095p) list.get(i7));
            this.f1942I[i7] = v4;
            i7++;
            i6++;
        }
        u uVar = this.f1945c;
        if (uVar != null) {
            this.f1947e.put(0, new m(qVar.v(0, uVar.f2009b), new x(this.f1945c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new k(0, 0, 0, 0)));
            this.f1940G.s();
        }
    }

    @Override // y0.o
    public final List j() {
        return this.f1959q;
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        c0 c0Var;
        D j4 = t.j(pVar, true, false);
        if (j4 != null) {
            c0Var = I.o(j4);
        } else {
            G g4 = I.f5510m;
            c0Var = c0.f5550p;
        }
        this.f1959q = c0Var;
        return j4 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x00b9, code lost:
    
        r4 = r30.f1960r;
        r7 = r3.f1921b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00bf, code lost:
    
        if (r4 != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00c3, code lost:
    
        if (r3.f1931l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00c5, code lost:
    
        r4 = r3.f1923d.f2044d[r3.f1925f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00d4, code lost:
    
        r30.f1936C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00da, code lost:
    
        if (r3.f1925f >= r3.f1928i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00dc, code lost:
    
        ((y0.l) r31).e(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00e5, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00e8, code lost:
    
        r2 = r7.f2037n;
        r1 = r1.f2022d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00ec, code lost:
    
        if (r1 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00ee, code lost:
    
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00f1, code lost:
    
        r1 = r3.f1925f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00f5, code lost:
    
        if (r7.f2034k == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00fb, code lost:
    
        if (r7.f2035l[r1] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00fd, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0109, code lost:
    
        if (r3.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x010b, code lost:
    
        r30.f1935B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x010e, code lost:
    
        r30.f1960r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x011a, code lost:
    
        if (r3.f1923d.f2041a.f2014g != r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x011c, code lost:
    
        r30.f1936C = r4 - 8;
        ((y0.l) r31).e(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0135, code lost:
    
        if ("audio/ac4".equals(r3.f1923d.f2041a.f2013f.f2325m) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0137, code lost:
    
        r30.f1937D = r3.c(r30.f1936C, 7);
        r4 = r30.f1936C;
        r9 = r30.f1952j;
        y0.AbstractC0619b.i(r4, r9);
        r3.f1920a.a(r9, 7, 0);
        r30.f1937D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x015a, code lost:
    
        r30.f1936C += r30.f1937D;
        r30.f1960r = 4;
        r30.f1938E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0152, code lost:
    
        r30.f1937D = r3.c(r30.f1936C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00ce, code lost:
    
        r4 = r7.f2031h[r3.f1925f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0166, code lost:
    
        r4 = r3.f1923d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x016a, code lost:
    
        if (r3.f1931l != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x016c, code lost:
    
        r9 = r4.f2046f[r3.f1925f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x017a, code lost:
    
        if (r13 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x017c, code lost:
    
        r9 = r13.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0180, code lost:
    
        r4 = r4.f2041a;
        r8 = r4.f2017j;
        r11 = r3.f1920a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0186, code lost:
    
        if (r8 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0188, code lost:
    
        r14 = r30.f1949g;
        r15 = r14.f2694a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x019e, code lost:
    
        if (r30.f1937D >= r30.f1936C) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01a0, code lost:
    
        r2 = r30.f1938E;
        r29 = r13;
        r13 = r4.f2013f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01a8, code lost:
    
        if (r2 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01aa, code lost:
    
        r19 = r4;
        ((y0.l) r31).k(r15, r8, r5, false);
        r14.G(0);
        r2 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01bb, code lost:
    
        if (r2 < 1) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01bd, code lost:
    
        r30.f1938E = r2 - 1;
        r2 = r30.f1948f;
        r2.G(0);
        r22 = r5;
        r11.a(r2, 4, 0);
        r11.a(r14, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01d3, code lost:
    
        if (r30.f1942I.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01d5, code lost:
    
        r2 = r13.f2325m;
        r4 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01df, code lost:
    
        if ("video/avc".equals(r2) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01e4, code lost:
    
        if ((r4 & 31) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01f6, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01fa, code lost:
    
        r30.f1939F = r2;
        r30.f1937D += 5;
        r30.f1936C += r8;
        r4 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x020b, code lost:
    
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01ec, code lost:
    
        if ("video/hevc".equals(r2) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01f4, code lost:
    
        if (((r4 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01f9, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0216, code lost:
    
        throw T.I.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0217, code lost:
    
        r19 = r4;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x021e, code lost:
    
        if (r30.f1939F == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0220, code lost:
    
        r5 = r30.f1950h;
        r5.D(r2);
        r23 = r8;
        r24 = r14;
        ((y0.l) r31).k(r5.f2694a, 0, r30.f1938E, false);
        r11.a(r5, r30.f1938E, 0);
        r2 = r30.f1938E;
        r4 = X.g.f(r5.f2694a, r5.f2696c);
        r5.G("video/hevc".equals(r13.f2325m) ? 1 : 0);
        r5.F(r4);
        y0.AbstractC0619b.f(r9, r5, r30.f1942I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x025e, code lost:
    
        r30.f1937D += r2;
        r30.f1938E -= r2;
        r4 = r19;
        r5 = r22;
        r8 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0255, code lost:
    
        r23 = r8;
        r24 = r14;
        r2 = r11.d(r31, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0271, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x028a, code lost:
    
        if (r3.f1931l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x028c, code lost:
    
        r1 = r3.f1923d.f2047g[r3.f1925f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x02a4, code lost:
    
        if (r3.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02a6, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02a9, code lost:
    
        r25 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02af, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02b1, code lost:
    
        r28 = r1.f2021c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02b8, code lost:
    
        r11.b(r9, r25, r30.f1936C, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02c9, code lost:
    
        if (r12.isEmpty() != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02cb, code lost:
    
        r1 = (S0.l) r12.removeFirst();
        r30.f1964x -= r1.f1919c;
        r2 = r1.f1918b;
        r4 = r1.f1917a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02dc, code lost:
    
        if (r2 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02de, code lost:
    
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02df, code lost:
    
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02e1, code lost:
    
        if (r29 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02e3, code lost:
    
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02e7, code lost:
    
        r6 = r30.f1941H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02eb, code lost:
    
        if (r8 >= r7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02ed, code lost:
    
        r6[r8].b(r4, 1, r1.f1919c, r30.f1964x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0303, code lost:
    
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x030a, code lost:
    
        if (r3.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x030c, code lost:
    
        r30.f1935B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x030f, code lost:
    
        r30.f1960r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0313, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x02b6, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x029b, code lost:
    
        if (r7.f2033j[r3.f1925f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x029d, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x029f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0274, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0276, code lost:
    
        r2 = r30.f1937D;
        r4 = r30.f1936C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x027a, code lost:
    
        if (r2 >= r4) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x027c, code lost:
    
        r30.f1937D += r11.d(r31, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0173, code lost:
    
        r9 = r7.f2032i[r3.f1925f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r31, T.C0098t r32) {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.n.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
