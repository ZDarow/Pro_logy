package p215y0;

/* renamed from: y0.m */
/* loaded from: classes.dex */
public final class C2401m implements p215y0.InterfaceC2406r {

    /* renamed from: s */
    public static final int[] f9454s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: t */
    public static final p200u3.C2259m f9455t = new p200u3.C2259m(new p107b0.C1169d(22));

    /* renamed from: u */
    public static final p200u3.C2259m f9456u = new p200u3.C2259m(new p107b0.C1169d(23));

    /* renamed from: l */
    public boolean f9457l;

    /* renamed from: m */
    public boolean f9458m;

    /* renamed from: n */
    public int f9459n;

    /* renamed from: o */
    public p129f2.C1415c0 f9460o;

    /* renamed from: r */
    public int f9463r;

    /* renamed from: q */
    public p046L1.C0363g f9462q = new p046L1.C0363g(15, false);

    /* renamed from: p */
    public boolean f9461p = true;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0060, B:34:0x0068, B:36:0x0070, B:38:0x0078, B:40:0x0080, B:42:0x0088, B:43:0x0090), top: B:2:0x0001 }] */
    @Override // p215y0.InterfaceC2406r
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized p215y0.InterfaceC2403o[] mo4637a(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            int[] r1 = p215y0.C2401m.f9454s     // Catch: java.lang.Throwable -> L48
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
            int r8 = p176p1.AbstractC1949a.m3900A(r8)     // Catch: java.lang.Throwable -> L48
            r4 = -1
            if (r8 == r4) goto L2e
            r6.m4638b(r8, r0)     // Catch: java.lang.Throwable -> L48
        L2e:
            int r7 = p176p1.AbstractC1949a.m3901B(r7)     // Catch: java.lang.Throwable -> L48
            if (r7 == r4) goto L39
            if (r7 == r8) goto L39
            r6.m4638b(r7, r0)     // Catch: java.lang.Throwable -> L48
        L39:
            r4 = r3
        L3a:
            if (r4 >= r2) goto L4a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L48
            if (r5 == r8) goto L45
            if (r5 == r7) goto L45
            r6.m4638b(r5, r0)     // Catch: java.lang.Throwable -> L48
        L45:
            int r4 = r4 + 1
            goto L3a
        L48:
            r7 = move-exception
            goto L97
        L4a:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L48
            y0.o[] r7 = new p215y0.InterfaceC2403o[r7]     // Catch: java.lang.Throwable -> L48
        L50:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L48
            if (r3 >= r8) goto L95
            java.lang.Object r8 = r0.get(r3)     // Catch: java.lang.Throwable -> L48
            y0.o r8 = (p215y0.InterfaceC2403o) r8     // Catch: java.lang.Throwable -> L48
            boolean r1 = r6.f9461p     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L90
            y0.o r1 = r8.mo1404d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof p073S0.C0636n     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.mo1404d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof p073S0.C0639q     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.mo1404d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof p123e1.C1323E     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.mo1404d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof p002A0.C0006d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            y0.o r1 = r8.mo1404d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof p065Q0.C0558d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            V0.m r1 = new V0.m     // Catch: java.lang.Throwable -> L48
            L1.g r2 = r6.f9462q     // Catch: java.lang.Throwable -> L48
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
        throw new UnsupportedOperationException("Method not decompiled: p215y0.C2401m.mo4637a(android.net.Uri, java.util.Map):y0.o[]");
    }

    /* renamed from: b */
    public final void m4638b(int i4, java.util.ArrayList arrayList) {
        switch (i4) {
            case 0:
                arrayList.add(new p123e1.C1327a());
                return;
            case 1:
                arrayList.add(new p123e1.C1329c());
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                arrayList.add(new p123e1.C1330d((this.f9457l ? 1 : 0) | (this.f9458m ? 2 : 0)));
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                arrayList.add(new p220z0.C2440a((this.f9457l ? 1 : 0) | (this.f9458m ? 2 : 0)));
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                p215y0.InterfaceC2403o m4447a = f9455t.m4447a(0);
                if (m4447a != null) {
                    arrayList.add(m4447a);
                    return;
                } else {
                    arrayList.add(new p016D0.C0167c());
                    return;
                }
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new p021E0.C0190b());
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new p065Q0.C0558d(this.f9462q, this.f9461p ? 0 : 2));
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new p069R0.C0574d(this.f9459n | (this.f9457l ? 1 : 0) | (this.f9458m ? 2 : 0)));
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                p046L1.C0363g c0363g = this.f9462q;
                int i5 = this.f9461p ? 0 : 32;
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                arrayList.add(new p073S0.C0636n(c0363g, i5, null, null, p129f2.C1415c0.f5744p, null));
                arrayList.add(new p073S0.C0639q(this.f9462q, this.f9461p ? 0 : 16));
                return;
            case 9:
                arrayList.add(new java.lang.Object());
                return;
            case 10:
                arrayList.add(new p123e1.C1319A());
                return;
            case 11:
                if (this.f9460o == null) {
                    p129f2.C1391G c1391g2 = p129f2.AbstractC1393I.f5704m;
                    this.f9460o = p129f2.C1415c0.f5744p;
                }
                arrayList.add(new p123e1.C1323E(1, !this.f9461p ? 1 : 0, this.f9462q, new p086W.C0803w(0L), new p123e1.C1332f(0, this.f9460o)));
                return;
            case 12:
                arrayList.add(new p128f1.C1382d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new p012C0.C0135a(this.f9463r));
                return;
            case 15:
                p215y0.InterfaceC2403o m4447a2 = f9456u.m4447a(new java.lang.Object[0]);
                if (m4447a2 != null) {
                    arrayList.add(m4447a2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new p002A0.C0006d(1 ^ (this.f9461p ? 1 : 0), this.f9462q));
                return;
            case 17:
                arrayList.add(new p012C0.C0135a(1, (byte) 0));
                return;
            case 18:
                arrayList.add(new p007B0.C0022a(2));
                return;
            case 19:
                arrayList.add(new p012C0.C0135a(0, (byte) 0));
                return;
            case 20:
                arrayList.add(new p007B0.C0022a(1));
                return;
            case 21:
                arrayList.add(new p007B0.C0022a(0));
                return;
        }
    }

    @Override // p215y0.InterfaceC2406r
    /* renamed from: c */
    public final synchronized p215y0.InterfaceC2403o[] mo403c() {
        return mo4637a(android.net.Uri.EMPTY, new java.util.HashMap());
    }
}
