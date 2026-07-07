package p086W;

/* renamed from: W.k */
/* loaded from: classes.dex */
public final class C0791k {

    /* renamed from: a */
    public final p086W.C0800t f2756a;

    /* renamed from: b */
    public final p086W.C0802v f2757b;

    /* renamed from: c */
    public final p086W.InterfaceC0789i f2758c;

    /* renamed from: d */
    public final java.util.concurrent.CopyOnWriteArraySet f2759d;

    /* renamed from: e */
    public final java.util.ArrayDeque f2760e;

    /* renamed from: f */
    public final java.util.ArrayDeque f2761f;

    /* renamed from: g */
    public final java.lang.Object f2762g;

    /* renamed from: h */
    public boolean f2763h;

    /* renamed from: i */
    public final boolean f2764i;

    public C0791k(android.os.Looper looper, p086W.C0800t c0800t, p086W.InterfaceC0789i interfaceC0789i) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, c0800t, interfaceC0789i, true);
    }

    /* renamed from: a */
    public final void m1440a(java.lang.Object obj) {
        obj.getClass();
        synchronized (this.f2762g) {
            try {
                if (this.f2763h) {
                    return;
                }
                this.f2759d.add(new p086W.C0790j(obj));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1441b() {
        m1445f();
        java.util.ArrayDeque arrayDeque = this.f2761f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        p086W.C0802v c0802v = this.f2757b;
        if (!c0802v.f2795a.hasMessages(1)) {
            c0802v.getClass();
            p086W.C0801u m1568b = p086W.C0802v.m1568b();
            m1568b.f2793a = c0802v.f2795a.obtainMessage(1);
            c0802v.getClass();
            android.os.Message message = m1568b.f2793a;
            message.getClass();
            c0802v.f2795a.sendMessageAtFrontOfQueue(message);
            m1568b.m1566a();
        }
        java.util.ArrayDeque arrayDeque2 = this.f2760e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((java.lang.Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* renamed from: c */
    public final void m1442c(int i4, p086W.InterfaceC0788h interfaceC0788h) {
        m1445f();
        this.f2761f.add(new p086W.RunnableC0787g(new java.util.concurrent.CopyOnWriteArraySet(this.f2759d), i4, interfaceC0788h, 0));
    }

    /* renamed from: d */
    public final void m1443d() {
        m1445f();
        synchronized (this.f2762g) {
            this.f2763h = true;
        }
        java.util.Iterator it = this.f2759d.iterator();
        while (it.hasNext()) {
            p086W.C0790j c0790j = (p086W.C0790j) it.next();
            p086W.InterfaceC0789i interfaceC0789i = this.f2758c;
            c0790j.f2755d = true;
            if (c0790j.f2754c) {
                c0790j.f2754c = false;
                interfaceC0789i.mo1439c(c0790j.f2752a, c0790j.f2753b.m119b());
            }
        }
        this.f2759d.clear();
    }

    /* renamed from: e */
    public final void m1444e(int i4, p086W.InterfaceC0788h interfaceC0788h) {
        m1442c(i4, interfaceC0788h);
        m1441b();
    }

    /* renamed from: f */
    public final void m1445f() {
        if (this.f2764i) {
            p086W.AbstractC0781a.m1421j(java.lang.Thread.currentThread() == this.f2757b.f2795a.getLooper().getThread());
        }
    }

    public C0791k(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, p086W.C0800t c0800t, p086W.InterfaceC0789i interfaceC0789i, boolean z4) {
        this.f2756a = c0800t;
        this.f2759d = copyOnWriteArraySet;
        this.f2758c = interfaceC0789i;
        this.f2762g = new java.lang.Object();
        this.f2760e = new java.util.ArrayDeque();
        this.f2761f = new java.util.ArrayDeque();
        this.f2757b = c0800t.m1565a(looper, new p086W.C0786f(0, this));
        this.f2764i = z4;
    }
}
