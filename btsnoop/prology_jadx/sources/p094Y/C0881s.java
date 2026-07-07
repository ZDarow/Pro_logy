package p094Y;

/* renamed from: Y.s */
/* loaded from: classes.dex */
public final class C0881s extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public java.io.RandomAccessFile f3168p;

    /* renamed from: q */
    public android.net.Uri f3169q;

    /* renamed from: r */
    public long f3170r;

    /* renamed from: s */
    public boolean f3171s;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo1686b(p094Y.C0874l r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f3135a
            long r1 = r9.f3139e
            r8.f3169q = r0
            r8.m1692f()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f3168p = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f3140f     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f3168p     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f3170r = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r0 = 1
            r8.f3171s = r0
            r8.m1693i(r9)
            long r0 = r8.f3170r
            return r0
        L43:
            Y.r r9 = new Y.r
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r0, r1)
            throw r9
        L4c:
            Y.r r0 = new Y.r
            r0.<init>(r9, r3)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            Y.r r0 = new Y.r
            r0.<init>(r9, r3)
            throw r0
        L5e:
            Y.r r0 = new Y.r
            r0.<init>(r9, r4)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            Y.r r0 = new Y.r
            int r1 = p086W.AbstractC0805y.f2801a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = p094Y.AbstractC0879q.m1704a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r9, r4)
            throw r0
        L91:
            Y.r r1 = new Y.r
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ",query="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",fragment="
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r9, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0881s.mo1686b(Y.l):long");
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3169q = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.f3168p;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (java.io.IOException e4) {
                throw new p094Y.C0871i(e4, 2000);
            }
        } finally {
            this.f3168p = null;
            if (this.f3171s) {
                this.f3171s = false;
                m1691c();
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f3169q;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3170r;
        if (j4 == 0) {
            return -1;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = this.f3168p;
            int i6 = p086W.AbstractC0805y.f2801a;
            int read = randomAccessFile.read(bArr, i4, (int) java.lang.Math.min(j4, i5));
            if (read > 0) {
                this.f3170r -= read;
                m1690a(read);
            }
            return read;
        } catch (java.io.IOException e4) {
            throw new p094Y.C0871i(e4, 2000);
        }
    }
}
