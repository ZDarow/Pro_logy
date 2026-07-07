package p146j0;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public abstract class AbstractC1711o {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r6 = ((p146j0.C1709m) r4.get(r5)).f7096d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        p146j0.AbstractC1710n.m3674g();
        r4 = p146j0.AbstractC1710n.m3670c();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r5 >= r6.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r2 = p146j0.AbstractC1710n.m3672e(r6.get(r5)).covers(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r2 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r7 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3682a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = p146j0.AbstractC1710n.m3673f(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            p146j0.AbstractC1710n.m3674g()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = p146j0.AbstractC1710n.m3671d(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = p146j0.AbstractC1710n.m3672e(r6)
            boolean r6 = p146j0.AbstractC1710n.m3677j(r6, r4)
            if (r6 == 0) goto L30
            r3 = r7
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = r1
        L34:
            if (r3 != r1) goto Lc4
            java.lang.Boolean r4 = p101a.AbstractC0936a.f3300a
            if (r4 != 0) goto Lc4
            int r4 = p086W.AbstractC0805y.f2801a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = r0
            goto Lbb
        L43:
            T.o r4 = new T.o     // Catch: p146j0.C1721y -> Lbb
            r4.<init>()     // Catch: p146j0.C1721y -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = p076T.AbstractC0665H.m1201l(r5)     // Catch: p146j0.C1721y -> Lbb
            r4.f2370l = r5     // Catch: p146j0.C1721y -> Lbb
            T.p r5 = new T.p     // Catch: p146j0.C1721y -> Lbb
            r5.<init>(r4)     // Catch: p146j0.C1721y -> Lbb
            java.lang.String r4 = r5.f2408m     // Catch: p146j0.C1721y -> Lbb
            if (r4 == 0) goto Lbb
            j0.v r4 = p146j0.C1718v.f7176m     // Catch: p146j0.C1721y -> Lbb
            f2.c0 r4 = p146j0.AbstractC1696B.m3649g(r4, r5, r0, r0)     // Catch: p146j0.C1721y -> Lbb
            r5 = r0
        L60:
            int r6 = r4.f5746o     // Catch: p146j0.C1721y -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: p146j0.C1721y -> Lbb
            j0.m r6 = (p146j0.C1709m) r6     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f7096d     // Catch: p146j0.C1721y -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: p146j0.C1721y -> Lbb
            j0.m r6 = (p146j0.C1709m) r6     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f7096d     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: p146j0.C1721y -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: p146j0.C1721y -> Lbb
            j0.m r6 = (p146j0.C1709m) r6     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f7096d     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: p146j0.C1721y -> Lbb
            java.util.List r6 = p146j0.AbstractC1710n.m3673f(r6)     // Catch: p146j0.C1721y -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: p146j0.C1721y -> Lbb
            if (r2 != 0) goto Lb8
            p146j0.AbstractC1710n.m3674g()     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = p146j0.AbstractC1710n.m3670c()     // Catch: p146j0.C1721y -> Lbb
            r5 = r0
        L9c:
            int r2 = r6.size()     // Catch: p146j0.C1721y -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: p146j0.C1721y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = p146j0.AbstractC1710n.m3672e(r2)     // Catch: p146j0.C1721y -> Lbb
            boolean r2 = p146j0.AbstractC1710n.m3677j(r2, r4)     // Catch: p146j0.C1721y -> Lbb
            if (r2 == 0) goto Lb1
            goto Lb5
        Lb1:
            int r5 = r5 + 1
            goto L9c
        Lb4:
            r7 = r1
        Lb5:
            if (r7 != r1) goto L40
            goto Lbb
        Lb8:
            int r5 = r5 + 1
            goto L60
        Lbb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            p101a.AbstractC0936a.f3300a = r4
            if (r1 == 0) goto Lc4
            return r0
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p146j0.AbstractC1711o.m3682a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
