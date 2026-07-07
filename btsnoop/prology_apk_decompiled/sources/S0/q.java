package S0;

import W.y;
import f2.G;
import f2.I;
import f2.c0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import y0.D;
import y0.z;

/* loaded from: classes.dex */
public final class q implements y0.o, z {

    /* renamed from: A, reason: collision with root package name */
    public N0.a f1975A;

    /* renamed from: a, reason: collision with root package name */
    public final V0.j f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1977b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f1978c;

    /* renamed from: d, reason: collision with root package name */
    public final W.r f1979d;

    /* renamed from: e, reason: collision with root package name */
    public final W.r f1980e;

    /* renamed from: f, reason: collision with root package name */
    public final W.r f1981f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1982g;

    /* renamed from: h, reason: collision with root package name */
    public final s f1983h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1984i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f1985j;

    /* renamed from: k, reason: collision with root package name */
    public int f1986k;

    /* renamed from: l, reason: collision with root package name */
    public int f1987l;

    /* renamed from: m, reason: collision with root package name */
    public long f1988m;

    /* renamed from: n, reason: collision with root package name */
    public int f1989n;

    /* renamed from: o, reason: collision with root package name */
    public W.r f1990o;

    /* renamed from: p, reason: collision with root package name */
    public int f1991p;

    /* renamed from: q, reason: collision with root package name */
    public int f1992q;

    /* renamed from: r, reason: collision with root package name */
    public int f1993r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1994t;

    /* renamed from: u, reason: collision with root package name */
    public y0.q f1995u;

    /* renamed from: v, reason: collision with root package name */
    public p[] f1996v;
    public long[][] w;

    /* renamed from: x, reason: collision with root package name */
    public int f1997x;

    /* renamed from: y, reason: collision with root package name */
    public long f1998y;

    /* renamed from: z, reason: collision with root package name */
    public int f1999z;

    public q(V0.j jVar, int i4) {
        this.f1976a = jVar;
        this.f1977b = i4;
        G g4 = I.f5510m;
        this.f1985j = c0.f5550p;
        this.f1986k = (i4 & 4) != 0 ? 3 : 0;
        this.f1983h = new s();
        this.f1984i = new ArrayList();
        this.f1981f = new W.r(16);
        this.f1982g = new ArrayDeque();
        this.f1978c = new W.r(X.g.f2863a);
        this.f1979d = new W.r(4);
        this.f1980e = new W.r();
        this.f1991p = -1;
        this.f1995u = y0.q.f9103k;
        this.f1996v = new p[0];
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f1982g.clear();
        this.f1989n = 0;
        this.f1991p = -1;
        this.f1992q = 0;
        this.f1993r = 0;
        this.s = 0;
        if (j4 == 0) {
            if (this.f1986k != 3) {
                this.f1986k = 0;
                this.f1989n = 0;
                return;
            } else {
                s sVar = this.f1983h;
                sVar.f2004a.clear();
                sVar.f2005b = 0;
                this.f1984i.clear();
                return;
            }
        }
        for (p pVar : this.f1996v) {
            x xVar = pVar.f1971b;
            int f4 = y.f(xVar.f2046f, j5, false);
            while (true) {
                if (f4 < 0) {
                    f4 = -1;
                    break;
                } else if ((xVar.f2047g[f4] & 1) != 0) {
                    break;
                } else {
                    f4--;
                }
            }
            if (f4 == -1) {
                f4 = xVar.a(j5);
            }
            pVar.f1974e = f4;
            y0.G g4 = pVar.f1973d;
            if (g4 != null) {
                g4.f9005b = false;
                g4.f9006c = 0;
            }
        }
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[EDGE_INSN: B:70:0x00df->B:71:0x00df BREAK  A[LOOP:1: B:28:0x006c->B:59:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    @Override // y0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y0.y f(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.q.f(long):y0.y");
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        if ((this.f1977b & 16) == 0) {
            qVar = new android.support.v4.media.session.t(qVar, this.f1976a);
        }
        this.f1995u = qVar;
    }

    @Override // y0.z
    public final long i() {
        return this.f1998y;
    }

    @Override // y0.o
    public final List j() {
        return this.f1985j;
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        c0 c0Var;
        D j4 = t.j(pVar, false, (this.f1977b & 2) != 0);
        if (j4 != null) {
            c0Var = I.o(j4);
        } else {
            G g4 = I.f5510m;
            c0Var = c0.f5550p;
        }
        this.f1985j = c0Var;
        return j4 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0497, code lost:
    
        r3 = r10;
        r5 = r36.f1989n;
        r6 = r36.f1981f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x049f, code lost:
    
        if (r5 != 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04a8, code lost:
    
        if (r37.k(r6.f2694a, 0, 8, r3) != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04eb, code lost:
    
        r36.f1989n = 8;
        r6.G(0);
        r36.f1988m = r6.w();
        r36.f1987l = r6.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0502, code lost:
    
        r10 = r36.f1988m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0508, code lost:
    
        if (r10 != 1) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x050a, code lost:
    
        r37.readFully(r6.f2694a, 8, 8);
        r36.f1989n += 8;
        r36.f1988m = r6.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0542, code lost:
    
        r10 = r36.f1988m;
        r13 = r36.f1989n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0549, code lost:
    
        if (r10 < r13) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x054b, code lost:
    
        r10 = r36.f1987l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0556, code lost:
    
        if (r10 == 1836019574) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x055b, code lost:
    
        if (r10 == 1953653099) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0560, code lost:
    
        if (r10 == 1835297121) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0565, code lost:
    
        if (r10 == 1835626086) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x056a, code lost:
    
        if (r10 == 1937007212) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x056f, code lost:
    
        if (r10 == 1701082227) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0571, code lost:
    
        if (r10 != 1835365473) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0579, code lost:
    
        if (r10 == 1835296868) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x057e, code lost:
    
        if (r10 == 1836476516) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0580, code lost:
    
        if (r10 == 1751411826) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0585, code lost:
    
        if (r10 == 1937011556) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x058a, code lost:
    
        if (r10 == 1937011827) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x058f, code lost:
    
        if (r10 == 1937011571) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0594, code lost:
    
        if (r10 == 1668576371) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0599, code lost:
    
        if (r10 == 1701606260) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x059e, code lost:
    
        if (r10 == 1937011555) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x05a3, code lost:
    
        if (r10 == 1937011578) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a8, code lost:
    
        if (r10 == 1937013298) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05ad, code lost:
    
        if (r10 == 1937007471) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05b2, code lost:
    
        if (r10 == 1668232756) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05b7, code lost:
    
        if (r10 == 1953196132) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05bc, code lost:
    
        if (r10 == 1718909296) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05c1, code lost:
    
        if (r10 == 1969517665) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05c6, code lost:
    
        if (r10 == 1801812339) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05cb, code lost:
    
        if (r10 != 1768715124) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05ce, code lost:
    
        r6 = r37.B();
        r10 = r36.f1989n;
        r28 = r6 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05dc, code lost:
    
        if (r36.f1987l != 1836086884) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05de, code lost:
    
        r36.f1975A = new N0.a(0, r28, -9223372036854775807L, r28 + r10, r36.f1988m - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05f4, code lost:
    
        r36.f1990o = null;
        r36.f1986k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05fa, code lost:
    
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05fe, code lost:
    
        if (r13 != 8) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0600, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0603, code lost:
    
        W.a.j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x060d, code lost:
    
        if (r36.f1988m > 2147483647L) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x060f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0612, code lost:
    
        W.a.j(r7);
        r7 = new W.r((int) r36.f1988m);
        java.lang.System.arraycopy(r6.f2694a, 0, r7.f2694a, 0, 8);
        r36.f1990o = r7;
        r36.f1986k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0611, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0602, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x062b, code lost:
    
        r13 = r37.B();
        r3 = r36.f1988m;
        r5 = r36.f1989n;
        r13 = (r13 + r3) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0638, code lost:
    
        if (r3 == r5) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x063c, code lost:
    
        if (r36.f1987l != 1835365473) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x063e, code lost:
    
        r14.D(8);
        r37.z(r14.f2694a, 0, 8);
        r3 = S0.j.f1912a;
        r3 = r14.f2695b;
        r4 = 4;
        r14.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0653, code lost:
    
        if (r14.h() == 1751411826) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0655, code lost:
    
        r3 = r3 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0656, code lost:
    
        r14.G(r3);
        r37.e(r14.f2695b);
        r37.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0663, code lost:
    
        r12.push(new S0.a(r13, r36.f1987l));
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0674, code lost:
    
        if (r36.f1988m != r36.f1989n) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0676, code lost:
    
        m(r13);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x067b, code lost:
    
        r3 = 0;
        r36.f1986k = 0;
        r36.f1989n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0662, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x068c, code lost:
    
        throw T.I.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x051f, code lost:
    
        if (r10 != 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0521, code lost:
    
        r10 = r37.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0527, code lost:
    
        if (r10 != (-1)) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0529, code lost:
    
        r13 = (S0.a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x052f, code lost:
    
        if (r13 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0531, code lost:
    
        r10 = r13.f1881n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0535, code lost:
    
        if (r10 == (-1)) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0537, code lost:
    
        r36.f1988m = (r10 - r37.B()) + r36.f1989n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x04ad, code lost:
    
        if (r36.f1999z != 2) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04b2, code lost:
    
        if ((r36.f1977b & 2) == 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04b4, code lost:
    
        r0 = r36.f1995u.v(0, 4);
        r2 = r36.f1975A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04bd, code lost:
    
        if (r2 != null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04bf, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04cb, code lost:
    
        r2 = new T.C0094o();
        r2.f2288j = r13;
        B2.AbstractC0007h.q(r2, r0);
        r36.f1995u.s();
        r36.f1995u.t(new A0.b(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x04e9, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x04c1, code lost:
    
        r13 = new T.G(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:?, code lost:
    
        return -1;
     */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r37, T.C0098t r38) {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.q.l(y0.p, T.t):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        if (r0 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ea, code lost:
    
        r2 = r11.q(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
    
        if (r0 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
    
        r6 = r24;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r11.H(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0206, code lost:
    
        if (r9 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r3 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0223, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0224, code lost:
    
        r11.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020e, code lost:
    
        r11.G(r3);
        r11.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0220, code lost:
    
        r9 = new M0.k(r9, r2, r11.q(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a7, code lost:
    
        W.a.m("MetadataUtil", "Skipped unknown metadata entry: " + S0.c.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ba, code lost:
    
        r11.G(r12);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00cb, code lost:
    
        r0 = M0.j.a(S0.t.f(r11) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00d5, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00d7, code lost:
    
        r2 = new M0.n("TCON", null, f2.I.o(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00e9, code lost:
    
        r11.G(r12);
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00e2, code lost:
    
        W.a.A("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00e8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e1, code lost:
    
        r11.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c1, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x022e, code lost:
    
        r2 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0235, code lost:
    
        if (r2 != 6516084) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0237, code lost:
    
        r9 = S0.t.c(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x023f, code lost:
    
        if (r2 == 7233901) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0244, code lost:
    
        if (r2 != 7631467) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024b, code lost:
    
        if (r2 == 6516589) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0250, code lost:
    
        if (r2 != 7828084) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0257, code lost:
    
        if (r2 != 6578553) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0259, code lost:
    
        r9 = S0.t.i(r9, r11, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0263, code lost:
    
        if (r2 != 4280916) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0265, code lost:
    
        r9 = S0.t.i(r9, r11, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x026f, code lost:
    
        if (r2 != 7630703) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0271, code lost:
    
        r9 = S0.t.i(r9, r11, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027b, code lost:
    
        if (r2 != 6384738) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027d, code lost:
    
        r9 = S0.t.i(r9, r11, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0287, code lost:
    
        if (r2 != 7108978) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0289, code lost:
    
        r9 = S0.t.i(r9, r11, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0293, code lost:
    
        if (r2 != 6776174) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0295, code lost:
    
        r9 = S0.t.i(r9, r11, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x029d, code lost:
    
        if (r2 != 6779504) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x029f, code lost:
    
        r9 = S0.t.i(r9, r11, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bf, code lost:
    
        r9 = S0.t.i(r9, r11, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c7, code lost:
    
        r9 = S0.t.i(r9, r11, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e5, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ec, code lost:
    
        if (r5.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ef, code lost:
    
        r9 = new T.G(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r11.G(r3);
        r3 = r3 + r14;
        r11.H(r2);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r12 = r11.f2695b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r12 >= r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r12 = r11.h() + r12;
        r9 = r11.h();
        r2 = (r9 >> 24) & 255;
        r29 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r2 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r2 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r9 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        if (r9 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r9 = S0.t.e(r9, r11, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        r11.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02cf, code lost:
    
        if (r9 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d1, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d4, code lost:
    
        r3 = r29;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r9 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        r9 = S0.t.e(r9, r11, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r9 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r9 = S0.t.g(r9, "TBPM", r11, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0122, code lost:
    
        if (r9 != 1668311404) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r9 = S0.t.g(r9, "TCMP", r11, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        if (r9 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        r9 = S0.t.d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        if (r9 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013b, code lost:
    
        r9 = S0.t.i(r9, r11, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r9 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        r9 = S0.t.i(r9, r11, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
    
        if (r9 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r9 = S0.t.i(r9, r11, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        if (r9 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        r9 = S0.t.i(r9, r11, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r9 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r9 = S0.t.i(r9, r11, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        if (r9 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r9 = S0.t.i(r9, r11, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        if (r9 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        r9 = S0.t.g(r9, "ITUNESADVISORY", r11, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018f, code lost:
    
        if (r9 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        r9 = S0.t.g(r9, "ITUNESGAPLESS", r11, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019e, code lost:
    
        if (r9 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a0, code lost:
    
        r9 = S0.t.i(r9, r11, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r9 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
    
        r9 = S0.t.i(r9, r11, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
    
        if (r9 != 757935405) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        r2 = null;
        r9 = null;
        r3 = -1;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01be, code lost:
    
        r14 = r11.f2695b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c0, code lost:
    
        if (r14 >= r12) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c2, code lost:
    
        r24 = r11.h();
        r0 = r11.h();
        r11.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r0 != 1835360622) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r9 = r11.q(r24 - 12);
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0200, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e1, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0698 A[EDGE_INSN: B:362:0x0698->B:363:0x0698 BREAK  A[LOOP:10: B:285:0x0558->B:291:0x068e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06ba A[LOOP:13: B:364:0x06b7->B:366:0x06ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r36) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.q.m(long):void");
    }

    @Override // y0.o
    public final void release() {
    }
}
