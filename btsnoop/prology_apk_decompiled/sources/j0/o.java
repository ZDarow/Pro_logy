package j0;

/* loaded from: classes.dex */
public abstract class o {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r6 = ((j0.m) r4.get(r5)).f6836d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        j0.n.g();
        r4 = j0.n.c();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r5 >= r6.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r2 = j0.n.e(r6.get(r5)).covers(r4);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = j0.n.f(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            j0.n.g()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = j0.n.d(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = j0.n.e(r6)
            boolean r6 = j0.n.j(r6, r4)
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
            java.lang.Boolean r4 = a.AbstractC0110a.f3188a
            if (r4 != 0) goto Lc4
            int r4 = W.y.f2709a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = r0
            goto Lbb
        L43:
            T.o r4 = new T.o     // Catch: j0.y -> Lbb
            r4.<init>()     // Catch: j0.y -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = T.H.l(r5)     // Catch: j0.y -> Lbb
            r4.f2290l = r5     // Catch: j0.y -> Lbb
            T.p r5 = new T.p     // Catch: j0.y -> Lbb
            r5.<init>(r4)     // Catch: j0.y -> Lbb
            java.lang.String r4 = r5.f2325m     // Catch: j0.y -> Lbb
            if (r4 == 0) goto Lbb
            j0.v r4 = j0.v.f6914m     // Catch: j0.y -> Lbb
            f2.c0 r4 = j0.B.g(r4, r5, r0, r0)     // Catch: j0.y -> Lbb
            r5 = r0
        L60:
            int r6 = r4.f5552o     // Catch: j0.y -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: j0.y -> Lbb
            j0.m r6 = (j0.m) r6     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6836d     // Catch: j0.y -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: j0.y -> Lbb
            j0.m r6 = (j0.m) r6     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6836d     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: j0.y -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: j0.y -> Lbb
            j0.m r6 = (j0.m) r6     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f6836d     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: j0.y -> Lbb
            java.util.List r6 = j0.n.f(r6)     // Catch: j0.y -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: j0.y -> Lbb
            if (r2 != 0) goto Lb8
            j0.n.g()     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = j0.n.c()     // Catch: j0.y -> Lbb
            r5 = r0
        L9c:
            int r2 = r6.size()     // Catch: j0.y -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: j0.y -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = j0.n.e(r2)     // Catch: j0.y -> Lbb
            boolean r2 = j0.n.j(r2, r4)     // Catch: j0.y -> Lbb
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
            a.AbstractC0110a.f3188a = r4
            if (r1 == 0) goto Lc4
            return r0
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.o.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
