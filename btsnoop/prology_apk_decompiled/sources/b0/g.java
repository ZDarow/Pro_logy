package b0;

import T.S;
import T.T;
import T.U;
import a0.C0136p;
import java.util.HashMap;
import java.util.Random;
import q0.F;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final C0136p f4356h = new C0136p(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f4357i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public j f4361d;

    /* renamed from: f, reason: collision with root package name */
    public String f4363f;

    /* renamed from: a, reason: collision with root package name */
    public final T f4358a = new T();

    /* renamed from: b, reason: collision with root package name */
    public final S f4359b = new S();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4360c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public U f4362e = U.f2168a;

    /* renamed from: g, reason: collision with root package name */
    public long f4364g = -1;

    public final void a(f fVar) {
        long j4 = fVar.f4351c;
        if (j4 != -1) {
            this.f4364g = j4;
        }
        this.f4363f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b0.f b(int r16, q0.F r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f4360c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            b0.f r8 = (b0.f) r8
            long r9 = r8.f4351c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f4350b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            b0.g r9 = r8.f4355g
            java.util.HashMap r10 = r9.f4360c
            java.lang.String r13 = r9.f4363f
            java.lang.Object r10 = r10.get(r13)
            b0.f r10 = (b0.f) r10
            if (r10 == 0) goto L44
            long r13 = r10.f4351c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f4364g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f7671d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f4351c = r9
        L51:
            q0.F r9 = r8.f4352d
            if (r2 != 0) goto L5a
            int r10 = r8.f4350b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.f7671d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L15
            long r11 = r8.f4351c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.f7671d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f7669b
            int r11 = r9.f7669b
            if (r10 != r11) goto L15
            int r10 = r2.f7670c
            int r11 = r9.f7670c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f4351c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = W.y.f2709a
            q0.F r10 = r5.f4352d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            a0.p r4 = b0.g.f4356h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            b0.f r5 = new b0.f
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.b(int, q0.F):b0.f");
    }

    public final synchronized String c(U u4, F f4) {
        return b(u4.g(f4.f7668a, this.f4359b).f2145c, f4).f4349a;
    }

    public final void d(C0177a c0177a) {
        F f4;
        boolean p2 = c0177a.f4327b.p();
        HashMap hashMap = this.f4360c;
        if (p2) {
            String str = this.f4363f;
            if (str != null) {
                f fVar = (f) hashMap.get(str);
                fVar.getClass();
                a(fVar);
                return;
            }
            return;
        }
        f fVar2 = (f) hashMap.get(this.f4363f);
        int i4 = c0177a.f4328c;
        F f5 = c0177a.f4329d;
        this.f4363f = b(i4, f5).f4349a;
        e(c0177a);
        if (f5 == null || !f5.b()) {
            return;
        }
        long j4 = f5.f7671d;
        if (fVar2 != null && fVar2.f4351c == j4 && (f4 = fVar2.f4352d) != null && f4.f7669b == f5.f7669b && f4.f7670c == f5.f7670c) {
            return;
        }
        b(i4, new F(j4, f5.f7668a));
        this.f4361d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b2, B:41:0x00b6, B:42:0x00bd, B:44:0x00c7, B:46:0x00cb, B:48:0x00d8, B:51:0x00df), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(b0.C0177a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.e(b0.a):void");
    }
}
