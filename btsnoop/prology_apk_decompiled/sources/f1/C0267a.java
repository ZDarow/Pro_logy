package f1;

import S0.i;
import T.C0094o;
import T.C0095p;
import T.H;
import T.I;
import W.r;
import W.y;
import java.math.RoundingMode;
import y0.F;
import y0.q;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267a implements InterfaceC0268b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5460m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5461n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final q f5462a;

    /* renamed from: b, reason: collision with root package name */
    public final F f5463b;

    /* renamed from: c, reason: collision with root package name */
    public final i f5464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5465d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5466e;

    /* renamed from: f, reason: collision with root package name */
    public final r f5467f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5468g;

    /* renamed from: h, reason: collision with root package name */
    public final C0095p f5469h;

    /* renamed from: i, reason: collision with root package name */
    public int f5470i;

    /* renamed from: j, reason: collision with root package name */
    public long f5471j;

    /* renamed from: k, reason: collision with root package name */
    public int f5472k;

    /* renamed from: l, reason: collision with root package name */
    public long f5473l;

    public C0267a(q qVar, F f4, i iVar) {
        this.f5462a = qVar;
        this.f5463b = f4;
        this.f5464c = iVar;
        int i4 = iVar.f1908b;
        int max = Math.max(1, i4 / 10);
        this.f5468g = max;
        r rVar = new r((byte[]) iVar.f1911e);
        rVar.n();
        int n4 = rVar.n();
        this.f5465d = n4;
        int i5 = iVar.f1907a;
        int i6 = iVar.f1909c;
        int i7 = (((i6 - (i5 * 4)) * 8) / (iVar.f1910d * i5)) + 1;
        if (n4 != i7) {
            throw I.a(null, "Expected frames per block: " + i7 + "; got: " + n4);
        }
        int g4 = y.g(max, n4);
        this.f5466e = new byte[g4 * i6];
        this.f5467f = new r(n4 * 2 * i5 * g4);
        int i8 = ((i6 * i4) * 8) / n4;
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("audio/raw");
        c0094o.f2285g = i8;
        c0094o.f2286h = i8;
        c0094o.f2291m = max * 2 * i5;
        c0094o.f2302z = i5;
        c0094o.f2270A = i4;
        c0094o.f2271B = 2;
        this.f5469h = new C0095p(c0094o);
    }

    @Override // f1.InterfaceC0268b
    public final void a(long j4) {
        this.f5470i = 0;
        this.f5471j = j4;
        this.f5472k = 0;
        this.f5473l = 0L;
    }

    @Override // f1.InterfaceC0268b
    public final void b(long j4, int i4) {
        this.f5462a.t(new C0272f(this.f5464c, this.f5465d, i4, j4));
        this.f5463b.c(this.f5469h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // f1.InterfaceC0268b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(y0.l r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0267a.c(y0.l, long):boolean");
    }

    public final void d(int i4) {
        long j4 = this.f5471j;
        long j5 = this.f5473l;
        i iVar = this.f5464c;
        long j6 = iVar.f1908b;
        int i5 = y.f2709a;
        long U3 = j4 + y.U(j5, 1000000L, j6, RoundingMode.FLOOR);
        int i6 = i4 * 2 * iVar.f1907a;
        this.f5463b.b(U3, 1, i6, this.f5472k - i6, null);
        this.f5473l += i4;
        this.f5472k -= i6;
    }
}
