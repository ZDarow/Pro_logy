package p112c0;

/* renamed from: c0.e */
/* loaded from: classes.dex */
public final class C1223e {

    /* renamed from: c */
    public static final p112c0.C1223e f4767c = new p112c0.C1223e(p129f2.AbstractC1393I.m3166o(p112c0.C1222d.f4763d));

    /* renamed from: d */
    public static final p129f2.C1415c0 f4768d = p129f2.AbstractC1393I.m3168q(2, 5, 6);

    /* renamed from: e */
    public static final p129f2.C1425h0 f4769e;

    /* renamed from: a */
    public final android.util.SparseArray f4770a = new android.util.SparseArray();

    /* renamed from: b */
    public final int f4771b;

    static {
        p063P2.C0528a c0528a = new p063P2.C0528a(4, 5);
        c0528a.m1028i(5, 6);
        c0528a.m1028i(17, 6);
        c0528a.m1028i(7, 6);
        c0528a.m1028i(30, 10);
        c0528a.m1028i(18, 6);
        c0528a.m1028i(6, 8);
        c0528a.m1028i(8, 8);
        c0528a.m1028i(14, 8);
        f4769e = c0528a.m1024e();
    }

    public C1223e(p129f2.C1415c0 c1415c0) {
        for (int i4 = 0; i4 < c1415c0.f5746o; i4++) {
            p112c0.C1222d c1222d = (p112c0.C1222d) c1415c0.get(i4);
            this.f4770a.put(c1222d.f4764a, c1222d);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4770a.size(); i6++) {
            i5 = java.lang.Math.max(i5, ((p112c0.C1222d) this.f4770a.valueAt(i6)).f4765b);
        }
        this.f4771b = i5;
    }

    /* renamed from: a */
    public static p129f2.C1415c0 m2902a(int[] iArr, int i4) {
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i5 : iArr) {
            m3161i.m3145a(new p112c0.C1222d(i5, i4));
        }
        return m3161i.m3157g();
    }

    /* renamed from: b */
    public static p112c0.C1223e m2903b(android.content.Context context, p076T.C0691e c0691e, p112c0.C1228j c1228j) {
        return m2904c(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0691e, c1228j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if ("Xiaomi".equals(r3) == false) goto L44;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [f2.L, f2.C] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p112c0.C1223e m2904c(android.content.Context r5, android.content.Intent r6, p076T.C0691e r7, p112c0.C1228j r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1223e.m2904c(android.content.Context, android.content.Intent, T.e, c0.j):c0.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (r15 != 5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair m2905d(p076T.C0691e r17, p076T.C0702p r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1223e.m2905d(T.e, T.p):android.util.Pair");
    }

    /* renamed from: e */
    public final boolean m2906e(int i4) {
        android.util.SparseArray sparseArray = this.f4770a;
        int i5 = p086W.AbstractC0805y.f2801a;
        return sparseArray.indexOfKey(i4) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p112c0.C1223e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c0.e r9 = (p112c0.C1223e) r9
            android.util.SparseArray r1 = r8.f4770a
            android.util.SparseArray r3 = r9.f4770a
            int r4 = p086W.AbstractC0805y.f2801a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = p086W.AbstractC0805y.f2801a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = p009B2.AbstractC0059p.m256u(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f4771b
            int r9 = r9.f4771b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1223e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i4;
        android.util.SparseArray sparseArray = this.f4770a;
        if (p086W.AbstractC0805y.f2801a >= 31) {
            i4 = sparseArray.contentHashCode();
        } else {
            int i5 = 17;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                i5 = java.util.Objects.hashCode(sparseArray.valueAt(i6)) + ((sparseArray.keyAt(i6) + (i5 * 31)) * 31);
            }
            i4 = i5;
        }
        return (i4 * 31) + this.f4771b;
    }

    public final java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4771b + ", audioProfiles=" + this.f4770a + "]";
    }
}
