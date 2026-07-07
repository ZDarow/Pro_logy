package z;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0446i;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0634g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0446i f9205a = new C0446i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f9206b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9207c;

    /* renamed from: d, reason: collision with root package name */
    public static final n.j f9208d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9206b = threadPoolExecutor;
        f9207c = new Object();
        f9208d = new n.j(0);
    }

    public static String a(int i4, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((C0630c) list.get(i5)).f9195e);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z.C0633f b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = a.AbstractC0110a.Z(r1)
            android.os.Trace.beginSection(r1)
            n.i r1 = z.AbstractC0634g.f9205a
            java.lang.Object r2 = r1.a(r8)     // Catch: java.lang.Throwable -> L1d
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
            e1.f r10 = z.AbstractC0629b.a(r9, r10)     // Catch: java.lang.Throwable -> L1d android.content.pm.PackageManager.NameNotFoundException -> Lb9
            int r2 = r10.f5198a     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            java.util.List r10 = r10.f5199b
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
            z.h[] r2 = (z.C0635h[]) r2     // Catch: java.lang.Throwable -> L1d
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
            int r7 = r7.f9213e     // Catch: java.lang.Throwable -> L1d
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
            u.g r0 = u.AbstractC0575c.f8476a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r0 = a.AbstractC0110a.Z(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            u.g r0 = u.AbstractC0575c.f8476a     // Catch: java.lang.Throwable -> L7e
            android.graphics.Typeface r9 = r0.e(r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            goto L9d
        L7e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L83:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            z.h[] r10 = (z.C0635h[]) r10     // Catch: java.lang.Throwable -> L1d
            u.g r0 = u.AbstractC0575c.f8476a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r0 = a.AbstractC0110a.Z(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            u.g r0 = u.AbstractC0575c.f8476a     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r9 = r0.d(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
        L9d:
            if (r9 == 0) goto Lab
            r1.b(r8, r9)     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC0634g.b(java.lang.String, android.content.Context, java.util.List, int):z.f");
    }
}
