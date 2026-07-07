package B3;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class g implements t {

    /* renamed from: l, reason: collision with root package name */
    public final FileInputStream f243l;

    public g(FileInputStream fileInputStream) {
        this.f243l = fileInputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f243l.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if ((r6 != null ? q3.i.g0(r6, "getsockname failed") : false) != false) goto L27;
     */
    @Override // B3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(B3.a r5, long r6) {
        /*
            r4 = this;
            java.lang.String r0 = "sink"
            k3.h.e(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            return r0
        Lc:
            if (r2 < 0) goto L6f
            r0 = 1
            B3.q r1 = r5.k(r0)     // Catch: java.lang.AssertionError -> L3a
            int r2 = r1.f262c     // Catch: java.lang.AssertionError -> L3a
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.lang.AssertionError -> L3a
            long r6 = java.lang.Math.min(r6, r2)     // Catch: java.lang.AssertionError -> L3a
            int r6 = (int) r6     // Catch: java.lang.AssertionError -> L3a
            java.io.FileInputStream r7 = r4.f243l     // Catch: java.lang.AssertionError -> L3a
            byte[] r2 = r1.f260a     // Catch: java.lang.AssertionError -> L3a
            int r3 = r1.f262c     // Catch: java.lang.AssertionError -> L3a
            int r6 = r7.read(r2, r3, r6)     // Catch: java.lang.AssertionError -> L3a
            r7 = -1
            if (r6 != r7) goto L3f
            int r6 = r1.f261b     // Catch: java.lang.AssertionError -> L3a
            int r7 = r1.f262c     // Catch: java.lang.AssertionError -> L3a
            if (r6 != r7) goto L3c
            B3.q r6 = r1.a()     // Catch: java.lang.AssertionError -> L3a
            r5.f223l = r6     // Catch: java.lang.AssertionError -> L3a
            B3.r.a(r1)     // Catch: java.lang.AssertionError -> L3a
            goto L3c
        L3a:
            r5 = move-exception
            goto L4b
        L3c:
            r5 = -1
            return r5
        L3f:
            int r7 = r1.f262c     // Catch: java.lang.AssertionError -> L3a
            int r7 = r7 + r6
            r1.f262c = r7     // Catch: java.lang.AssertionError -> L3a
            long r1 = r5.f224m     // Catch: java.lang.AssertionError -> L3a
            long r6 = (long) r6     // Catch: java.lang.AssertionError -> L3a
            long r1 = r1 + r6
            r5.f224m = r1     // Catch: java.lang.AssertionError -> L3a
            return r6
        L4b:
            int r6 = B3.k.f249a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L65
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L61
            java.lang.String r1 = "getsockname failed"
            boolean r6 = q3.i.g0(r6, r1)
            goto L62
        L61:
            r6 = r7
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            r0 = r7
        L66:
            if (r0 == 0) goto L6e
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L6e:
            throw r5
        L6f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.g.d(B3.a, long):long");
    }

    public final String toString() {
        return "source(" + this.f243l + ')';
    }
}
