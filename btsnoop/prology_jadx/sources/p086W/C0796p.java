package p086W;

/* renamed from: W.p */
/* loaded from: classes.dex */
public final class C0796p {

    /* renamed from: e */
    public static p086W.C0796p f2773e;

    /* renamed from: a */
    public int f2774a;

    /* renamed from: b */
    public java.lang.Object f2775b;

    /* renamed from: c */
    public java.lang.Object f2776c;

    /* renamed from: d */
    public java.lang.Object f2777d;

    public C0796p(int i4, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f2774a = i4;
        this.f2775b = str;
        this.f2776c = str2;
        this.f2777d = str3;
    }

    /* renamed from: a */
    public static void m1505a(int i4, p086W.C0796p c0796p) {
        synchronized (c0796p.f2777d) {
            try {
                if (c0796p.f2774a == i4) {
                    return;
                }
                c0796p.f2774a = i4;
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) c0796p.f2776c).iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    p197u0.C2219f c2219f = (p197u0.C2219f) weakReference.get();
                    if (c2219f != null) {
                        c2219f.m4424a(i4);
                    } else {
                        ((java.util.concurrent.CopyOnWriteArrayList) c0796p.f2776c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static synchronized p086W.C0796p m1506c(android.content.Context context) {
        p086W.C0796p c0796p;
        synchronized (p086W.C0796p.class) {
            try {
                if (f2773e == null) {
                    f2773e = new p086W.C0796p(context);
                }
                c0796p = f2773e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0796p;
    }

    /* renamed from: b */
    public java.lang.String m1507b(p025F1.C0209a c0209a, android.net.Uri uri, int i4) {
        int i5 = this.f2774a;
        if (i5 == 1) {
            java.lang.String encodeToString = android.util.Base64.encodeToString((c0209a.f583b + ":" + c0209a.f584c).getBytes(p161m0.C1868y.f7593r), 0);
            int i6 = p086W.AbstractC0805y.f2801a;
            java.util.Locale locale = java.util.Locale.US;
            return p009B2.AbstractC0051h.m153l("Basic ", encodeToString);
        }
        if (i5 != 2) {
            throw new p076T.C0666I(null, new java.lang.UnsupportedOperationException(), false, 4);
        }
        java.lang.String str = (java.lang.String) this.f2776c;
        java.lang.String str2 = (java.lang.String) this.f2775b;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.lang.String m3850h = p161m0.AbstractC1869z.m3850h(i4);
            java.lang.String str3 = c0209a.f583b + ":" + str2 + ":" + c0209a.f584c;
            java.nio.charset.Charset charset = p161m0.C1868y.f7593r;
            java.lang.String m1604Y = p086W.AbstractC0805y.m1604Y(messageDigest.digest((p086W.AbstractC0805y.m1604Y(messageDigest.digest(str3.getBytes(charset))) + ":" + str + ":" + p086W.AbstractC0805y.m1604Y(messageDigest.digest((m3850h + ":" + uri).getBytes(charset)))).getBytes(charset)));
            java.lang.String str4 = (java.lang.String) this.f2777d;
            if (str4.isEmpty()) {
                return java.lang.String.format(java.util.Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", c0209a.f583b, str2, str, uri, m1604Y);
            }
            return java.lang.String.format(java.util.Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", c0209a.f583b, str2, str, uri, m1604Y, str4);
        } catch (java.security.NoSuchAlgorithmException e4) {
            throw new p076T.C0666I(null, e4, false, 4);
        }
    }

    /* renamed from: d */
    public int m1508d() {
        int i4;
        synchronized (this.f2777d) {
            i4 = this.f2774a;
        }
        return i4;
    }

    /* renamed from: e */
    public int m1509e() {
        int i4 = this.f2774a;
        if (i4 != 2) {
            return i4 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public C0796p(android.content.Context context) {
        this.f2775b = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f2776c = new java.util.concurrent.CopyOnWriteArrayList();
        this.f2777d = new java.lang.Object();
        this.f2774a = 0;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new p075S2.C0654g(1, this), intentFilter);
    }

    public C0796p(int i4, java.lang.String str, int i5, java.util.ArrayList arrayList, byte[] bArr) {
        java.util.List unmodifiableList;
        this.f2775b = str;
        this.f2774a = i5;
        if (arrayList == null) {
            unmodifiableList = java.util.Collections.emptyList();
        } else {
            unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        }
        this.f2776c = unmodifiableList;
        this.f2777d = bArr;
    }
}
