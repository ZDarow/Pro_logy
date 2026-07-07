package q0;

import T.C0081b;
import T.C0098t;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 extends T.U {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f7851n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f7852b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7854d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7855e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7856f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7857g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7858h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7859i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7860j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7861k;

    /* renamed from: l, reason: collision with root package name */
    public final T.B f7862l;

    /* renamed from: m, reason: collision with root package name */
    public final C0102x f7863m;

    static {
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        List emptyList = Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        C0104z c0104z = C0104z.f2370a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0103y(uri, null, null, emptyList, c0Var2, null, -9223372036854775807L);
        }
        c0098t.a();
        c0101w.a();
        T.E e4 = T.E.f2095y;
    }

    public h0(long j4, boolean z4, boolean z5, T.B b4) {
        this(j4, j4, 0L, 0L, z4, false, z5, null, b4);
    }

    @Override // T.U
    public final int b(Object obj) {
        return f7851n.equals(obj) ? 0 : -1;
    }

    @Override // T.U
    public final T.S f(int i4, T.S s, boolean z4) {
        W.a.g(i4, 1);
        Object obj = z4 ? f7851n : null;
        long j4 = -this.f7856f;
        s.getClass();
        s.h(null, obj, 0, this.f7854d, j4, C0081b.f2225c, false);
        return s;
    }

    @Override // T.U
    public final int h() {
        return 1;
    }

    @Override // T.U
    public final Object l(int i4) {
        W.a.g(i4, 1);
        return f7851n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // T.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T.T m(int r23, T.T r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            W.a.g(r2, r1)
            long r1 = r0.f7857g
            boolean r13 = r0.f7859i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f7860j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f7855e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = T.T.f2150q
            T.x r14 = r0.f7863m
            long r1 = r0.f7855e
            r17 = r1
            T.B r4 = r0.f7862l
            java.lang.Object r5 = r0.f7861k
            long r6 = r0.f7852b
            long r8 = r0.f7853c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f7858h
            r19 = 0
            long r1 = r0.f7856f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.m(int, T.T, long):T.T");
    }

    @Override // T.U
    public final int o() {
        return 1;
    }

    public h0(long j4, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6, Object obj, T.B b4) {
        this(-9223372036854775807L, -9223372036854775807L, j4, j5, j6, j7, z4, z5, false, obj, b4, z6 ? b4.f2068c : null);
    }

    public h0(long j4, long j5, long j6, long j7, long j8, long j9, boolean z4, boolean z5, boolean z6, Object obj, T.B b4, C0102x c0102x) {
        this.f7852b = j4;
        this.f7853c = j5;
        this.f7854d = j6;
        this.f7855e = j7;
        this.f7856f = j8;
        this.f7857g = j9;
        this.f7858h = z4;
        this.f7859i = z5;
        this.f7860j = z6;
        this.f7861k = obj;
        b4.getClass();
        this.f7862l = b4;
        this.f7863m = c0102x;
    }
}
