package p161m0;

/* renamed from: m0.m */
/* loaded from: classes.dex */
public final class C1856m implements java.io.Closeable {

    /* renamed from: A */
    public boolean f7519A;

    /* renamed from: B */
    public boolean f7520B;

    /* renamed from: C */
    public boolean f7521C;

    /* renamed from: D */
    public long f7522D;

    /* renamed from: l */
    public final p129f2.C1408Y f7523l;

    /* renamed from: m */
    public final p129f2.C1408Y f7524m;

    /* renamed from: n */
    public final java.lang.String f7525n;

    /* renamed from: o */
    public final javax.net.SocketFactory f7526o;

    /* renamed from: p */
    public final java.util.ArrayDeque f7527p = new java.util.ArrayDeque();

    /* renamed from: q */
    public final android.util.SparseArray f7528q = new android.util.SparseArray();

    /* renamed from: r */
    public final p063P2.C0528a f7529r;

    /* renamed from: s */
    public android.net.Uri f7530s;

    /* renamed from: t */
    public p161m0.C1868y f7531t;

    /* renamed from: u */
    public p025F1.C0209a f7532u;

    /* renamed from: v */
    public java.lang.String f7533v;

    /* renamed from: w */
    public long f7534w;

    /* renamed from: x */
    public p161m0.RunnableC1855l f7535x;

    /* renamed from: y */
    public p086W.C0796p f7536y;

    /* renamed from: z */
    public int f7537z;

    /* JADX WARN: Type inference failed for: r1v3, types: [P2.a, java.lang.Object] */
    public C1856m(p129f2.C1408Y c1408y, p129f2.C1408Y c1408y2, java.lang.String str, android.net.Uri uri, javax.net.SocketFactory socketFactory) {
        this.f7523l = c1408y;
        this.f7524m = c1408y2;
        this.f7525n = str;
        this.f7526o = socketFactory;
        ?? obj = new java.lang.Object();
        obj.f1553n = this;
        this.f7529r = obj;
        this.f7530s = p161m0.AbstractC1869z.m3848f(uri);
        this.f7531t = new p161m0.C1868y(new p094Y.C0886x(this));
        this.f7534w = 60000L;
        this.f7532u = p161m0.AbstractC1869z.m3846d(uri);
        this.f7522D = -9223372036854775807L;
        this.f7537z = -1;
    }

    /* renamed from: a */
    public static /* synthetic */ p063P2.C0528a m3812a(p161m0.C1856m c1856m) {
        return c1856m.f7529r;
    }

    /* renamed from: b */
    public static /* synthetic */ android.net.Uri m3813b(p161m0.C1856m c1856m) {
        return c1856m.f7530s;
    }

    /* renamed from: c */
    public static void m3814c(p161m0.C1856m c1856m, androidx.datastore.preferences.protobuf.C1113k c1113k) {
        c1856m.getClass();
        if (c1856m.f7519A) {
            c1856m.f7524m.m3185B(c1113k);
            return;
        }
        java.lang.String message = c1113k.getMessage();
        if (message == null) {
            message = "";
        }
        c1856m.f7523l.m3187F(message, c1113k);
    }

    /* renamed from: e */
    public static /* synthetic */ android.util.SparseArray m3815e(p161m0.C1856m c1856m) {
        return c1856m.f7528q;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p161m0.RunnableC1855l runnableC1855l = this.f7535x;
        if (runnableC1855l != null) {
            runnableC1855l.close();
            this.f7535x = null;
            android.net.Uri uri = this.f7530s;
            java.lang.String str = this.f7533v;
            str.getClass();
            p063P2.C0528a c0528a = this.f7529r;
            p161m0.C1856m c1856m = (p161m0.C1856m) c0528a.f1553n;
            int i4 = c1856m.f7537z;
            if (i4 != -1 && i4 != 0) {
                c1856m.f7537z = 0;
                c0528a.m1031l(c0528a.m1027h(12, str, p129f2.C1425h0.f5764r, uri));
            }
        }
        this.f7531t.close();
    }

    /* renamed from: f */
    public final void m3816f() {
        long m1605Z;
        p161m0.C1859p c1859p = (p161m0.C1859p) this.f7527p.pollFirst();
        if (c1859p == null) {
            p161m0.C1861r c1861r = (p161m0.C1861r) this.f7524m.f5729m;
            long j4 = c1861r.f7571y;
            if (j4 != -9223372036854775807L) {
                m1605Z = p086W.AbstractC0805y.m1605Z(j4);
            } else {
                long j5 = c1861r.f7572z;
                m1605Z = j5 != -9223372036854775807L ? p086W.AbstractC0805y.m1605Z(j5) : 0L;
            }
            c1861r.f7561o.m3819i(m1605Z);
            return;
        }
        android.net.Uri m3823a = c1859p.m3823a();
        p086W.AbstractC0781a.m1422k(c1859p.f7543c);
        java.lang.String str = c1859p.f7543c;
        java.lang.String str2 = this.f7533v;
        p063P2.C0528a c0528a = this.f7529r;
        ((p161m0.C1856m) c0528a.f1553n).f7537z = 0;
        p129f2.AbstractC1444r.m3225d("Transport", str);
        c0528a.m1031l(c0528a.m1027h(10, str2, p129f2.C1425h0.m3215b(1, new java.lang.Object[]{"Transport", str}, null), m3823a));
    }

    /* renamed from: g */
    public final java.net.Socket m3817g(android.net.Uri uri) {
        p086W.AbstractC0781a.m1416e(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        java.lang.String host = uri.getHost();
        host.getClass();
        return this.f7526o.createSocket(host, port);
    }

    /* renamed from: h */
    public final void m3818h(long j4) {
        if (this.f7537z == 2 && !this.f7521C) {
            android.net.Uri uri = this.f7530s;
            java.lang.String str = this.f7533v;
            str.getClass();
            p063P2.C0528a c0528a = this.f7529r;
            p161m0.C1856m c1856m = (p161m0.C1856m) c0528a.f1553n;
            p086W.AbstractC0781a.m1421j(c1856m.f7537z == 2);
            c0528a.m1031l(c0528a.m1027h(5, str, p129f2.C1425h0.f5764r, uri));
            c1856m.f7521C = true;
        }
        this.f7522D = j4;
    }

    /* renamed from: i */
    public final void m3819i(long j4) {
        android.net.Uri uri = this.f7530s;
        java.lang.String str = this.f7533v;
        str.getClass();
        p063P2.C0528a c0528a = this.f7529r;
        int i4 = ((p161m0.C1856m) c0528a.f1553n).f7537z;
        p086W.AbstractC0781a.m1421j(i4 == 1 || i4 == 2);
        p161m0.C1837B c1837b = p161m0.C1837B.f7406c;
        java.lang.Object[] objArr = {java.lang.Double.valueOf(j4 / 1000.0d)};
        int i5 = p086W.AbstractC0805y.f2801a;
        c0528a.m1031l(c0528a.m1027h(6, str, p129f2.C1425h0.m3215b(1, new java.lang.Object[]{"Range", java.lang.String.format(java.util.Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
