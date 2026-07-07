package y0;

import android.net.Uri;
import e1.C0255A;
import e1.C0257a;
import e1.C0259c;
import e1.C0260d;
import e1.C0262f;
import f1.C0270d;
import f2.I;
import f2.c0;
import java.util.ArrayList;
import java.util.HashMap;
import z0.C0636a;

/* loaded from: classes.dex */
public final class m implements r {
    public static final int[] s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: t, reason: collision with root package name */
    public static final u3.m f9093t = new u3.m(new b0.d(22));

    /* renamed from: u, reason: collision with root package name */
    public static final u3.m f9094u = new u3.m(new b0.d(23));

    /* renamed from: l, reason: collision with root package name */
    public boolean f9095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9096m;

    /* renamed from: n, reason: collision with root package name */
    public int f9097n;

    /* renamed from: o, reason: collision with root package name */
    public c0 f9098o;

    /* renamed from: r, reason: collision with root package name */
    public int f9101r;

    /* renamed from: q, reason: collision with root package name */
    public L1.g f9100q = new L1.g(15, false);

    /* renamed from: p, reason: collision with root package name */
    public boolean f9099p = true;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    @Override // y0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized y0.o[] a(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            int[] r1 = y0.m.s     // Catch: java.lang.Throwable -> L48
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L48
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L48
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = p1.AbstractC0462a.A(r8)     // Catch: java.lang.Throwable -> L48
            r4 = -1
            if (r8 == r4) goto L2e
            r6.b(r8, r0)     // Catch: java.lang.Throwable -> L48
        L2e:
            int r7 = p1.AbstractC0462a.B(r7)     // Catch: java.lang.Throwable -> L48
            if (r7 == r4) goto L39
            if (r7 == r8) goto L39
            r6.b(r7, r0)     // Catch: java.lang.Throwable -> L48
        L39:
            r4 = r3
        L3a:
            if (r4 >= r2) goto L4a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L48
            if (r5 == r8) goto L45
            if (r5 == r7) goto L45
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> L48
        L45:
            int r4 = r4 + 1
            goto L3a
        L48:
            r7 = move-exception
            goto L97
        L4a:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L48
            y0.o[] r7 = new y0.o[r7]     // Catch: java.lang.Throwable -> L48
        L50:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L48
            if (r3 >= r8) goto L95
            java.lang.Object r8 = r0.get(r3)     // Catch: java.lang.Throwable -> L48
            y0.o r8 = (y0.o) r8     // Catch: java.lang.Throwable -> L48
            boolean r1 = r6.f9099p     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L90
            y0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof S0.n     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof S0.q     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof e1.E     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof A0.d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof Q0.d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            V0.m r1 = new V0.m     // Catch: java.lang.Throwable -> L48
            L1.g r2 = r6.f9100q     // Catch: java.lang.Throwable -> L48
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L48
            r8 = r1
        L90:
            r7[r3] = r8     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + 1
            goto L50
        L95:
            monitor-exit(r6)
            return r7
        L97:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.m.a(android.net.Uri, java.util.Map):y0.o[]");
    }

    public final void b(int i4, ArrayList arrayList) {
        switch (i4) {
            case 0:
                arrayList.add(new C0257a());
                return;
            case 1:
                arrayList.add(new C0259c());
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                arrayList.add(new C0260d((this.f9095l ? 1 : 0) | (this.f9096m ? 2 : 0)));
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                arrayList.add(new C0636a((this.f9095l ? 1 : 0) | (this.f9096m ? 2 : 0)));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                o a4 = f9093t.a(0);
                if (a4 != null) {
                    arrayList.add(a4);
                    return;
                } else {
                    arrayList.add(new D0.c());
                    return;
                }
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new E0.b());
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new Q0.d(this.f9100q, this.f9099p ? 0 : 2));
                return;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new R0.d(this.f9097n | (this.f9095l ? 1 : 0) | (this.f9096m ? 2 : 0)));
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                L1.g gVar = this.f9100q;
                int i5 = this.f9099p ? 0 : 32;
                f2.G g4 = I.f5510m;
                arrayList.add(new S0.n(gVar, i5, null, null, c0.f5550p, null));
                arrayList.add(new S0.q(this.f9100q, this.f9099p ? 0 : 16));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new C0255A());
                return;
            case 11:
                if (this.f9098o == null) {
                    f2.G g5 = I.f5510m;
                    this.f9098o = c0.f5550p;
                }
                arrayList.add(new e1.E(1, !this.f9099p ? 1 : 0, this.f9100q, new W.w(0L), new C0262f(0, this.f9098o)));
                return;
            case 12:
                arrayList.add(new C0270d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C0.a(this.f9101r));
                return;
            case 15:
                o a5 = f9094u.a(new Object[0]);
                if (a5 != null) {
                    arrayList.add(a5);
                    return;
                }
                return;
            case 16:
                arrayList.add(new A0.d(1 ^ (this.f9099p ? 1 : 0), this.f9100q));
                return;
            case 17:
                arrayList.add(new C0.a(1, (byte) 0));
                return;
            case 18:
                arrayList.add(new B0.a(2));
                return;
            case 19:
                arrayList.add(new C0.a(0, (byte) 0));
                return;
            case 20:
                arrayList.add(new B0.a(1));
                return;
            case 21:
                arrayList.add(new B0.a(0));
                return;
        }
    }

    @Override // y0.r
    public final synchronized o[] c() {
        return a(Uri.EMPTY, new HashMap());
    }
}
