package R0;

import C.C0016c;
import T.G;
import W.r;
import W.y;
import d1.C0231a;
import java.io.EOFException;
import y0.F;
import y0.l;
import y0.n;
import y0.o;
import y0.p;
import y0.q;
import y0.u;
import y0.x;

/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: u, reason: collision with root package name */
    public static final C0016c f1724u = new C0016c(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1727c;

    /* renamed from: d, reason: collision with root package name */
    public final x f1728d;

    /* renamed from: e, reason: collision with root package name */
    public final u f1729e;

    /* renamed from: f, reason: collision with root package name */
    public final C0231a f1730f;

    /* renamed from: g, reason: collision with root package name */
    public final n f1731g;

    /* renamed from: h, reason: collision with root package name */
    public q f1732h;

    /* renamed from: i, reason: collision with root package name */
    public F f1733i;

    /* renamed from: j, reason: collision with root package name */
    public F f1734j;

    /* renamed from: k, reason: collision with root package name */
    public int f1735k;

    /* renamed from: l, reason: collision with root package name */
    public G f1736l;

    /* renamed from: m, reason: collision with root package name */
    public long f1737m;

    /* renamed from: n, reason: collision with root package name */
    public long f1738n;

    /* renamed from: o, reason: collision with root package name */
    public long f1739o;

    /* renamed from: p, reason: collision with root package name */
    public int f1740p;

    /* renamed from: q, reason: collision with root package name */
    public f f1741q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1742r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public long f1743t;

    public d(int i4) {
        this(-9223372036854775807L, i4);
    }

    public static long a(G g4) {
        if (g4 == null) {
            return -9223372036854775807L;
        }
        int g5 = g4.g();
        for (int i4 = 0; i4 < g5; i4++) {
            T.F f4 = g4.f(i4);
            if (f4 instanceof M0.n) {
                M0.n nVar = (M0.n) f4;
                if (nVar.f1142l.equals("TLEN")) {
                    return y.M(Long.parseLong((String) nVar.f1155n.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f1735k = 0;
        this.f1737m = -9223372036854775807L;
        this.f1738n = 0L;
        this.f1740p = 0;
        this.f1743t = j5;
        f fVar = this.f1741q;
        if (!(fVar instanceof b) || ((b) fVar).b(j5)) {
            return;
        }
        this.s = true;
        this.f1734j = this.f1731g;
    }

    public final boolean c(l lVar) {
        f fVar = this.f1741q;
        if (fVar != null) {
            long e4 = fVar.e();
            if (e4 != -1 && lVar.w() > e4 - 4) {
                return true;
            }
        }
        try {
            return !lVar.p(this.f1727c.f2694a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r18.e(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        r17.f1735k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r18.f9091q = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(y0.l r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f9091q = r3
            long r4 = r1.f9089o
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L3f
            int r4 = r0.f1725a
            r4 = r4 & 8
            if (r4 != 0) goto L20
            r4 = r5
            goto L22
        L20:
            C.c r4 = R0.d.f1724u
        L22:
            d1.a r6 = r0.f1730f
            T.G r4 = r6.a(r1, r4)
            r0.f1736l = r4
            if (r4 == 0) goto L31
            y0.u r6 = r0.f1729e
            r6.b(r4)
        L31:
            long r6 = r18.w()
            int r4 = (int) r6
            if (r19 != 0) goto L3b
            r1.e(r4)
        L3b:
            r6 = r3
        L3c:
            r7 = r6
            r8 = r7
            goto L42
        L3f:
            r4 = r3
            r6 = r4
            goto L3c
        L42:
            boolean r9 = r17.c(r18)
            r10 = 1
            if (r9 == 0) goto L52
            if (r7 <= 0) goto L4c
            goto L9f
        L4c:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L52:
            W.r r9 = r0.f1727c
            r9.G(r3)
            int r9 = r9.h()
            if (r6 == 0) goto L6b
            long r11 = (long) r6
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L72
        L6b:
            int r11 = y0.AbstractC0619b.j(r9)
            r12 = -1
            if (r11 != r12) goto L91
        L72:
            int r6 = r8 + 1
            if (r8 != r2) goto L80
            if (r19 == 0) goto L79
            return r3
        L79:
            java.lang.String r1 = "Searched too many bytes."
            T.I r1 = T.I.a(r5, r1)
            throw r1
        L80:
            if (r19 == 0) goto L8a
            r1.f9091q = r3
            int r7 = r4 + r6
            r1.a(r7, r3)
            goto L8d
        L8a:
            r1.e(r10)
        L8d:
            r7 = r3
            r8 = r6
            r6 = r7
            goto L42
        L91:
            int r7 = r7 + 1
            if (r7 != r10) goto L9c
            y0.x r6 = r0.f1728d
            r6.a(r9)
            r6 = r9
            goto Lab
        L9c:
            r9 = 4
            if (r7 != r9) goto Lab
        L9f:
            if (r19 == 0) goto La6
            int r4 = r4 + r8
            r1.e(r4)
            goto La8
        La6:
            r1.f9091q = r3
        La8:
            r0.f1735k = r6
            return r10
        Lab:
            int r11 = r11 + (-4)
            r1.a(r11, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.e(y0.l, boolean):boolean");
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f1732h = qVar;
        F v4 = qVar.v(0, 1);
        this.f1733i = v4;
        this.f1734j = v4;
        this.f1732h.s();
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        return e((l) pVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r6 != 1231971951) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038d  */
    /* JADX WARN: Type inference failed for: r0v41, types: [A0.b] */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r51, T.C0098t r52) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [y0.x, java.lang.Object] */
    public d(long j4, int i4) {
        this.f1725a = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f1726b = j4;
        this.f1727c = new r(10);
        this.f1728d = new Object();
        this.f1729e = new u();
        this.f1737m = -9223372036854775807L;
        this.f1730f = new C0231a(1);
        n nVar = new n();
        this.f1731g = nVar;
        this.f1734j = nVar;
    }
}
