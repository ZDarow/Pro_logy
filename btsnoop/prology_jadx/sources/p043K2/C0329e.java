package p043K2;

/* renamed from: K2.e */
/* loaded from: classes.dex */
public final class C0329e implements p204v2.InterfaceC2279i {

    /* renamed from: l */
    public final int f996l;

    /* renamed from: m */
    public final int f997m;

    /* renamed from: n */
    public final java.lang.Object f998n;

    /* renamed from: o */
    public final java.io.Serializable f999o;

    /* renamed from: p */
    public final java.io.Serializable f1000p;

    /* renamed from: q */
    public final java.io.Serializable f1001q;

    /* renamed from: r */
    public final java.io.Serializable f1002r;

    public C0329e(int i4, int i5) {
        this.f999o = new java.util.LinkedList();
        this.f1000p = new java.util.HashSet();
        this.f1001q = new java.util.HashSet();
        this.f1002r = new java.util.HashMap();
        this.f998n = "Sqflite";
        this.f996l = i4;
        this.f997m = i5;
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: a */
    public synchronized void mo726a(p204v2.C2277g c2277g) {
        ((java.util.LinkedList) this.f999o).add(c2277g);
        java.util.Iterator it = new java.util.HashSet((java.util.HashSet) this.f1000p).iterator();
        while (it.hasNext()) {
            m730f((p204v2.C2278h) it.next());
        }
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: c */
    public synchronized void mo727c() {
        try {
            java.util.Iterator it = ((java.util.HashSet) this.f1000p).iterator();
            while (it.hasNext()) {
                p204v2.C2278h c2278h = (p204v2.C2278h) it.next();
                synchronized (c2278h) {
                    android.os.HandlerThread handlerThread = c2278h.f9032c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        c2278h.f9032c = null;
                        c2278h.f9033d = null;
                    }
                }
            }
            java.util.Iterator it2 = ((java.util.HashSet) this.f1001q).iterator();
            while (it2.hasNext()) {
                p204v2.C2278h c2278h2 = (p204v2.C2278h) it2.next();
                synchronized (c2278h2) {
                    android.os.HandlerThread handlerThread2 = c2278h2.f9032c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        c2278h2.f9032c = null;
                        c2278h2.f9033d = null;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: d */
    public synchronized void mo728d() {
        for (int i4 = 0; i4 < this.f996l; i4++) {
            p204v2.C2278h c2278h = new p204v2.C2278h(((java.lang.String) this.f998n) + i4, this.f997m);
            c2278h.m4477a(new p086W.RunnableC0793m(14, this, c2278h));
            ((java.util.HashSet) this.f1000p).add(c2278h);
        }
    }

    /* renamed from: e */
    public synchronized p204v2.C2277g m729e(p204v2.C2278h c2278h) {
        p204v2.C2277g c2277g;
        p204v2.C2278h c2278h2;
        try {
            java.util.ListIterator listIterator = ((java.util.LinkedList) this.f999o).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c2277g = (p204v2.C2277g) listIterator.next();
                c2278h2 = c2277g.m4476a() != null ? (p204v2.C2278h) ((java.util.HashMap) this.f1002r).get(c2277g.m4476a()) : null;
                if (c2278h2 == null) {
                    break;
                }
            } while (c2278h2 != c2278h);
            listIterator.remove();
            return c2277g;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public synchronized void m730f(p204v2.C2278h c2278h) {
        try {
            p204v2.C2277g m729e = m729e(c2278h);
            if (m729e != null) {
                ((java.util.HashSet) this.f1001q).add(c2278h);
                ((java.util.HashSet) this.f1000p).remove(c2278h);
                if (m729e.m4476a() != null) {
                    ((java.util.HashMap) this.f1002r).put(m729e.m4476a(), c2278h);
                }
                c2278h.f9033d.post(new p086W.RunnableC0793m(13, c2278h, m729e));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public C0329e(java.lang.Integer num, int i4, java.lang.Boolean bool, java.lang.Integer num2, int i5, java.lang.Integer num3, java.lang.Boolean bool2) {
        this.f998n = num;
        this.f996l = i4;
        this.f1001q = bool;
        this.f999o = num2;
        this.f997m = i5;
        this.f1000p = num3;
        this.f1002r = bool2;
    }
}
