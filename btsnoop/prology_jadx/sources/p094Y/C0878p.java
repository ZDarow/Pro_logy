package p094Y;

/* renamed from: Y.p */
/* loaded from: classes.dex */
public final class C0878p extends p094Y.AbstractC0865c {

    /* renamed from: A */
    public long f3156A;

    /* renamed from: p */
    public final boolean f3157p;

    /* renamed from: q */
    public final int f3158q;

    /* renamed from: r */
    public final int f3159r;

    /* renamed from: s */
    public final java.lang.String f3160s;

    /* renamed from: t */
    public final p094Y.C0886x f3161t;

    /* renamed from: u */
    public final p094Y.C0886x f3162u;

    /* renamed from: v */
    public java.net.HttpURLConnection f3163v;

    /* renamed from: w */
    public java.io.InputStream f3164w;

    /* renamed from: x */
    public boolean f3165x;

    /* renamed from: y */
    public int f3166y;

    /* renamed from: z */
    public long f3167z;

    public C0878p(java.lang.String str, int i4, int i5, boolean z4, p094Y.C0886x c0886x) {
        super(true);
        this.f3160s = str;
        this.f3158q = i4;
        this.f3159r = i5;
        this.f3157p = z4;
        this.f3161t = c0886x;
        this.f3162u = new p094Y.C0886x(0, (byte) 0);
    }

    /* renamed from: t */
    public static void m1698t(java.net.HttpURLConnection httpURLConnection, long j4) {
        if (httpURLConnection != null && p086W.AbstractC0805y.f2801a <= 20) {
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (j4 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j4 <= 2048) {
                    return;
                }
                java.lang.String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                java.lang.Class<? super java.lang.Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                java.lang.reflect.Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, blocks: (B:19:0x0128, B:21:0x0130), top: B:18:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo1686b(p094Y.C0874l r24) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0878p.mo1686b(Y.l):long");
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        try {
            java.io.InputStream inputStream = this.f3164w;
            if (inputStream != null) {
                long j4 = this.f3167z;
                long j5 = -1;
                if (j4 != -1) {
                    j5 = j4 - this.f3156A;
                }
                m1698t(this.f3163v, j5);
                try {
                    inputStream.close();
                } catch (java.io.IOException e4) {
                    int i4 = p086W.AbstractC0805y.f2801a;
                    throw new p094Y.C0883u(e4, 2000, 3);
                }
            }
        } finally {
            this.f3164w = null;
            m1699l();
            if (this.f3165x) {
                this.f3165x = false;
                m1691c();
            }
        }
    }

    /* renamed from: l */
    public final void m1699l() {
        java.net.HttpURLConnection httpURLConnection = this.f3163v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e4) {
                p086W.AbstractC0781a.m1426o("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f3163v = null;
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        java.net.HttpURLConnection httpURLConnection = this.f3163v;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: q */
    public final java.net.URL m1700q(java.net.URL url, java.lang.String str) {
        if (str == null) {
            throw new p094Y.C0883u("Null location redirect", 2001);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new p094Y.C0883u(p009B2.AbstractC0051h.m153l("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f3157p || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new p094Y.C0883u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (java.net.MalformedURLException e4) {
            throw new p094Y.C0883u(e4, 2001, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        return r0;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection m1701r(p094Y.C0874l r25) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0878p.m1701r(Y.l):java.net.HttpURLConnection");
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f3167z;
            if (j4 != -1) {
                long j5 = j4 - this.f3156A;
                if (j5 != 0) {
                    i5 = (int) java.lang.Math.min(i5, j5);
                }
                return -1;
            }
            java.io.InputStream inputStream = this.f3164w;
            int i6 = p086W.AbstractC0805y.f2801a;
            int read = inputStream.read(bArr, i4, i5);
            if (read == -1) {
                return -1;
            }
            this.f3156A += read;
            m1690a(read);
            return read;
        } catch (java.io.IOException e4) {
            int i7 = p086W.AbstractC0805y.f2801a;
            throw p094Y.C0883u.m1707b(e4, 2);
        }
    }

    /* renamed from: s */
    public final java.net.HttpURLConnection m1702s(java.net.URL url, int i4, byte[] bArr, long j4, long j5, boolean z4, boolean z5, java.util.Map map) {
        java.lang.String sb;
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f3158q);
        httpURLConnection.setReadTimeout(this.f3159r);
        java.util.HashMap hashMap = new java.util.HashMap();
        p094Y.C0886x c0886x = this.f3161t;
        if (c0886x != null) {
            hashMap.putAll(c0886x.m1715S());
        }
        hashMap.putAll(this.f3162u.m1715S());
        hashMap.putAll(map);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.util.regex.Pattern pattern = p094Y.AbstractC0887y.f3177a;
        if (j4 == 0 && j5 == -1) {
            sb = null;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("bytes=");
            sb2.append(j4);
            sb2.append("-");
            if (j5 != -1) {
                sb2.append((j4 + j5) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        java.lang.String str2 = this.f3160s;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z5);
        httpURLConnection.setDoOutput(bArr != null);
        int i5 = p094Y.C0874l.f3134i;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new java.lang.IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: u */
    public final void m1703u(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            int min = (int) java.lang.Math.min(j4, 4096);
            java.io.InputStream inputStream = this.f3164w;
            int i4 = p086W.AbstractC0805y.f2801a;
            int read = inputStream.read(bArr, 0, min);
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new p094Y.C0883u(new java.io.InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new p094Y.C0883u();
            }
            j4 -= read;
            m1690a(read);
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: y */
    public final java.util.Map mo1689y() {
        java.net.HttpURLConnection httpURLConnection = this.f3163v;
        return httpURLConnection == null ? p129f2.C1425h0.f5764r : new p094Y.C0877o(httpURLConnection.getHeaderFields());
    }
}
