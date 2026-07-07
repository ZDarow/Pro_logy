package p094Y;

/* renamed from: Y.m */
/* loaded from: classes.dex */
public final class C0875m implements p094Y.InterfaceC0870h {

    /* renamed from: l */
    public final android.content.Context f3143l;

    /* renamed from: m */
    public final java.util.ArrayList f3144m;

    /* renamed from: n */
    public final p094Y.InterfaceC0870h f3145n;

    /* renamed from: o */
    public p094Y.C0881s f3146o;

    /* renamed from: p */
    public p094Y.C0864b f3147p;

    /* renamed from: q */
    public p094Y.C0867e f3148q;

    /* renamed from: r */
    public p094Y.InterfaceC0870h f3149r;

    /* renamed from: s */
    public p094Y.C0862E f3150s;

    /* renamed from: t */
    public p094Y.C0868f f3151t;

    /* renamed from: u */
    public p094Y.C0858A f3152u;

    /* renamed from: v */
    public p094Y.InterfaceC0870h f3153v;

    public C0875m(android.content.Context context, p094Y.InterfaceC0870h interfaceC0870h) {
        this.f3143l = context.getApplicationContext();
        interfaceC0870h.getClass();
        this.f3145n = interfaceC0870h;
        this.f3144m = new java.util.ArrayList();
    }

    /* renamed from: c */
    public static void m1696c(p094Y.InterfaceC0870h interfaceC0870h, p094Y.InterfaceC0860C interfaceC0860C) {
        if (interfaceC0870h != null) {
            interfaceC0870h.mo1688j(interfaceC0860C);
        }
    }

    /* renamed from: a */
    public final void m1697a(p094Y.InterfaceC0870h interfaceC0870h) {
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f3144m;
            if (i4 >= arrayList.size()) {
                return;
            }
            interfaceC0870h.mo1688j((p094Y.InterfaceC0860C) arrayList.get(i4));
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [Y.f, Y.h, Y.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y.h, Y.c, Y.s] */
    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        p086W.AbstractC0781a.m1421j(this.f3153v == null);
        java.lang.String scheme = c0874l.f3135a.getScheme();
        int i4 = p086W.AbstractC0805y.f2801a;
        android.net.Uri uri = c0874l.f3135a;
        java.lang.String scheme2 = uri.getScheme();
        boolean isEmpty = android.text.TextUtils.isEmpty(scheme2);
        android.content.Context context = this.f3143l;
        if (isEmpty || "file".equals(scheme2)) {
            java.lang.String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f3146o == null) {
                    ?? abstractC0865c = new p094Y.AbstractC0865c(false);
                    this.f3146o = abstractC0865c;
                    m1697a(abstractC0865c);
                }
                this.f3153v = this.f3146o;
            } else {
                if (this.f3147p == null) {
                    p094Y.C0864b c0864b = new p094Y.C0864b(context);
                    this.f3147p = c0864b;
                    m1697a(c0864b);
                }
                this.f3153v = this.f3147p;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f3147p == null) {
                p094Y.C0864b c0864b2 = new p094Y.C0864b(context);
                this.f3147p = c0864b2;
                m1697a(c0864b2);
            }
            this.f3153v = this.f3147p;
        } else if ("content".equals(scheme)) {
            if (this.f3148q == null) {
                p094Y.C0867e c0867e = new p094Y.C0867e(context);
                this.f3148q = c0867e;
                m1697a(c0867e);
            }
            this.f3153v = this.f3148q;
        } else {
            boolean equals = "rtmp".equals(scheme);
            p094Y.InterfaceC0870h interfaceC0870h = this.f3145n;
            if (equals) {
                if (this.f3149r == null) {
                    try {
                        p094Y.InterfaceC0870h interfaceC0870h2 = (p094Y.InterfaceC0870h) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f3149r = interfaceC0870h2;
                        m1697a(interfaceC0870h2);
                    } catch (java.lang.ClassNotFoundException unused) {
                        p086W.AbstractC0781a.m1410A("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (java.lang.Exception e4) {
                        throw new java.lang.RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.f3149r == null) {
                        this.f3149r = interfaceC0870h;
                    }
                }
                this.f3153v = this.f3149r;
            } else if ("udp".equals(scheme)) {
                if (this.f3150s == null) {
                    p094Y.C0862E c0862e = new p094Y.C0862E(8000);
                    this.f3150s = c0862e;
                    m1697a(c0862e);
                }
                this.f3153v = this.f3150s;
            } else if ("data".equals(scheme)) {
                if (this.f3151t == null) {
                    ?? abstractC0865c2 = new p094Y.AbstractC0865c(false);
                    this.f3151t = abstractC0865c2;
                    m1697a(abstractC0865c2);
                }
                this.f3153v = this.f3151t;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f3152u == null) {
                    p094Y.C0858A c0858a = new p094Y.C0858A(context);
                    this.f3152u = c0858a;
                    m1697a(c0858a);
                }
                this.f3153v = this.f3152u;
            } else {
                this.f3153v = interfaceC0870h;
            }
        }
        return this.f3153v.mo1686b(c0874l);
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        p094Y.InterfaceC0870h interfaceC0870h = this.f3153v;
        if (interfaceC0870h != null) {
            try {
                interfaceC0870h.close();
            } finally {
                this.f3153v = null;
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        interfaceC0860C.getClass();
        this.f3145n.mo1688j(interfaceC0860C);
        this.f3144m.add(interfaceC0860C);
        m1696c(this.f3146o, interfaceC0860C);
        m1696c(this.f3147p, interfaceC0860C);
        m1696c(this.f3148q, interfaceC0860C);
        m1696c(this.f3149r, interfaceC0860C);
        m1696c(this.f3150s, interfaceC0860C);
        m1696c(this.f3151t, interfaceC0860C);
        m1696c(this.f3152u, interfaceC0860C);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        p094Y.InterfaceC0870h interfaceC0870h = this.f3153v;
        if (interfaceC0870h == null) {
            return null;
        }
        return interfaceC0870h.mo1687o();
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        p094Y.InterfaceC0870h interfaceC0870h = this.f3153v;
        interfaceC0870h.getClass();
        return interfaceC0870h.read(bArr, i4, i5);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: y */
    public final java.util.Map mo1689y() {
        p094Y.InterfaceC0870h interfaceC0870h = this.f3153v;
        return interfaceC0870h == null ? java.util.Collections.emptyMap() : interfaceC0870h.mo1689y();
    }
}
