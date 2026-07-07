package p073S0;

/* renamed from: S0.v */
/* loaded from: classes.dex */
public final class C0644v {

    /* renamed from: a */
    public final boolean f2095a;

    /* renamed from: b */
    public final java.lang.String f2096b;

    /* renamed from: c */
    public final p215y0.C2386E f2097c;

    /* renamed from: d */
    public final int f2098d;

    /* renamed from: e */
    public final byte[] f2099e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0644v(boolean r6, java.lang.String r7, int r8, byte[] r9, int r10, int r11, byte[] r12) {
        /*
            r5 = this;
            r0 = 2
            r5.<init>()
            r1 = 0
            r2 = 1
            if (r8 != 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            if (r12 != 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r1
        L10:
            r3 = r3 ^ r4
            p086W.AbstractC0781a.m1416e(r3)
            r5.f2095a = r6
            r5.f2096b = r7
            r5.f2098d = r8
            r5.f2099e = r12
            y0.E r6 = new y0.E
            if (r7 != 0) goto L22
        L20:
            r0 = r2
            goto L72
        L22:
            r8 = -1
            int r12 = r7.hashCode()
            switch(r12) {
                case 3046605: goto L4d;
                case 3046671: goto L42;
                case 3049879: goto L37;
                case 3049895: goto L2c;
                default: goto L2a;
            }
        L2a:
            r1 = r8
            goto L56
        L2c:
            java.lang.String r12 = "cens"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L35
            goto L2a
        L35:
            r1 = 3
            goto L56
        L37:
            java.lang.String r12 = "cenc"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L40
            goto L2a
        L40:
            r1 = r0
            goto L56
        L42:
            java.lang.String r12 = "cbcs"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L4b
            goto L2a
        L4b:
            r1 = r2
            goto L56
        L4d:
            java.lang.String r12 = "cbc1"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L56
            goto L2a
        L56:
            switch(r1) {
                case 0: goto L72;
                case 1: goto L72;
                case 2: goto L20;
                case 3: goto L20;
                default: goto L59;
            }
        L59:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported protection scheme type '"
            r8.<init>(r12)
            r8.append(r7)
            java.lang.String r7 = "'. Assuming AES-CTR crypto mode."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "TrackEncryptionBox"
            p086W.AbstractC0781a.m1410A(r8, r7)
            goto L20
        L72:
            r6.<init>(r0, r10, r11, r9)
            r5.f2097c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0644v.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
