package Y;

import B2.AbstractC0007h;
import android.net.Uri;
import f2.h0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p extends AbstractC0107c {

    /* renamed from: A, reason: collision with root package name */
    public long f3049A;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3050p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3051q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3052r;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final x f3053t;

    /* renamed from: u, reason: collision with root package name */
    public final x f3054u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f3055v;
    public InputStream w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3056x;

    /* renamed from: y, reason: collision with root package name */
    public int f3057y;

    /* renamed from: z, reason: collision with root package name */
    public long f3058z;

    public p(String str, int i4, int i5, boolean z4, x xVar) {
        super(true);
        this.s = str;
        this.f3051q = i4;
        this.f3052r = i5;
        this.f3050p = z4;
        this.f3053t = xVar;
        this.f3054u = new x(0, (byte) 0);
    }

    public static void t(HttpURLConnection httpURLConnection, long j4) {
        if (httpURLConnection != null && W.y.f2709a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j4 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j4 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, blocks: (B:19:0x0128, B:21:0x0130), top: B:18:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    @Override // Y.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(Y.l r24) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.p.b(Y.l):long");
    }

    @Override // Y.h
    public final void close() {
        try {
            InputStream inputStream = this.w;
            if (inputStream != null) {
                long j4 = this.f3058z;
                long j5 = -1;
                if (j4 != -1) {
                    j5 = j4 - this.f3049A;
                }
                t(this.f3055v, j5);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    int i4 = W.y.f2709a;
                    throw new u(e4, 2000, 3);
                }
            }
        } finally {
            this.w = null;
            l();
            if (this.f3056x) {
                this.f3056x = false;
                c();
            }
        }
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.f3055v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                W.a.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f3055v = null;
        }
    }

    @Override // Y.h
    public final Uri o() {
        HttpURLConnection httpURLConnection = this.f3055v;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final URL q(URL url, String str) {
        if (str == null) {
            throw new u("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new u(AbstractC0007h.l("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f3050p || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e4) {
            throw new u(e4, 2001, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection r(Y.l r25) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.p.r(Y.l):java.net.HttpURLConnection");
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f3058z;
            if (j4 != -1) {
                long j5 = j4 - this.f3049A;
                if (j5 != 0) {
                    i5 = (int) Math.min(i5, j5);
                }
                return -1;
            }
            InputStream inputStream = this.w;
            int i6 = W.y.f2709a;
            int read = inputStream.read(bArr, i4, i5);
            if (read == -1) {
                return -1;
            }
            this.f3049A += read;
            a(read);
            return read;
        } catch (IOException e4) {
            int i7 = W.y.f2709a;
            throw u.b(e4, 2);
        }
    }

    public final HttpURLConnection s(URL url, int i4, byte[] bArr, long j4, long j5, boolean z4, boolean z5, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f3051q);
        httpURLConnection.setReadTimeout(this.f3052r);
        HashMap hashMap = new HashMap();
        x xVar = this.f3053t;
        if (xVar != null) {
            hashMap.putAll(xVar.S());
        }
        hashMap.putAll(this.f3054u.S());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f3067a;
        if (j4 == 0 && j5 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
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
        String str2 = this.s;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z5);
        httpURLConnection.setDoOutput(bArr != null);
        int i5 = l.f3028i;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void u(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            int min = (int) Math.min(j4, 4096);
            InputStream inputStream = this.w;
            int i4 = W.y.f2709a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new u(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new u();
            }
            j4 -= read;
            a(read);
        }
    }

    @Override // Y.h
    public final Map y() {
        HttpURLConnection httpURLConnection = this.f3055v;
        return httpURLConnection == null ? h0.f5570r : new o(httpURLConnection.getHeaderFields());
    }
}
