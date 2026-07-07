package p219z;

/* renamed from: z.g */
/* loaded from: classes.dex */
public abstract class AbstractC2436g {

    /* renamed from: a */
    public static final p165n.C1882i f9569a = new p165n.C1882i(16);

    /* renamed from: b */
    public static final java.util.concurrent.ThreadPoolExecutor f9570b;

    /* renamed from: c */
    public static final java.lang.Object f9571c;

    /* renamed from: d */
    public static final p165n.C1883j f9572d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), (java.util.concurrent.ThreadFactory) new java.lang.Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9570b = threadPoolExecutor;
        f9571c = new java.lang.Object();
        f9572d = new p165n.C1883j(0);
    }

    /* renamed from: a */
    public static java.lang.String m4676a(int i4, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((p219z.C2432c) list.get(i5)).f9559e);
            sb.append("-");
            sb.append(i4);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001d, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:17:0x0054, B:20:0x005d, B:22:0x0063, B:24:0x0069, B:27:0x007a, B:29:0x009f, B:32:0x00ab, B:37:0x007f, B:38:0x0082, B:39:0x0083, B:42:0x009a, B:45:0x00b5, B:46:0x00b8, B:48:0x0032, B:50:0x003a, B:53:0x003e, B:55:0x0042, B:57:0x004d, B:66:0x00b9, B:41:0x0094, B:26:0x0074), top: B:2:0x000c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p219z.C2435f m4677b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = p101a.AbstractC0936a.m1788Z(r1)
            android.os.Trace.beginSection(r1)
            n.i r1 = p219z.AbstractC2436g.f9569a
            java.lang.Object r2 = r1.m3862a(r8)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L20
            z.f r8 = new z.f     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L1d:
            r8 = move-exception
            goto Lc3
        L20:
            e1.f r10 = p219z.AbstractC2431b.m4673a(r9, r10)     // Catch: java.lang.Throwable -> L1d android.content.pm.PackageManager.NameNotFoundException -> Lb9
            int r2 = r10.f5389a     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            java.util.List r10 = r10.f5390b
            r4 = -3
            if (r2 == 0) goto L32
            if (r2 == r0) goto L30
        L2e:
            r2 = r4
            goto L52
        L30:
            r2 = -2
            goto L52
        L32:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            z.h[] r2 = (p219z.C2437h[]) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L51
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L3e
            goto L51
        L3e:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            r6 = r3
        L40:
            if (r6 >= r5) goto L4f
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L1d
            int r7 = r7.f9577e     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L4d
            if (r7 >= 0) goto L4b
            goto L2e
        L4b:
            r2 = r7
            goto L52
        L4d:
            int r6 = r6 + r0
            goto L40
        L4f:
            r2 = r3
            goto L52
        L51:
            r2 = r0
        L52:
            if (r2 == 0) goto L5d
            z.f r8 = new z.f     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L5d:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L1d
            if (r2 <= r0) goto L83
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 29
            if (r0 < r2) goto L83
            u.g r0 = p196u.AbstractC2208c.f8814a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r0 = p101a.AbstractC0936a.m1788Z(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            u.g r0 = p196u.AbstractC2208c.f8814a     // Catch: java.lang.Throwable -> L7e
            android.graphics.Typeface r9 = r0.mo4407e(r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            goto L9d
        L7e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L83:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            z.h[] r10 = (p219z.C2437h[]) r10     // Catch: java.lang.Throwable -> L1d
            u.g r0 = p196u.AbstractC2208c.f8814a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r0 = p101a.AbstractC0936a.m1788Z(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            u.g r0 = p196u.AbstractC2208c.f8814a     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r9 = r0.mo4395d(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
        L9d:
            if (r9 == 0) goto Lab
            r1.m3863b(r8, r9)     // Catch: java.lang.Throwable -> L1d
            z.f r8 = new z.f     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lab:
            z.f r8 = new z.f     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        Lb9:
            z.f r8 = new z.f     // Catch: java.lang.Throwable -> L1d
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lc3:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p219z.AbstractC2436g.m4677b(java.lang.String, android.content.Context, java.util.List, int):z.f");
    }
}
