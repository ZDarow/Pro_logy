package p179q0;

/* renamed from: q0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1984a {

    /* renamed from: l */
    public final java.util.ArrayList f8111l = new java.util.ArrayList(1);

    /* renamed from: m */
    public final java.util.HashSet f8112m = new java.util.HashSet(1);

    /* renamed from: n */
    public final p127f0.C1372e f8113n;

    /* renamed from: o */
    public final p127f0.C1372e f8114o;

    /* renamed from: p */
    public android.os.Looper f8115p;

    /* renamed from: q */
    public p076T.AbstractC0677U f8116q;

    /* renamed from: r */
    public p107b0.C1177l f8117r;

    public AbstractC1984a() {
        int i4 = 0;
        p179q0.C1964F c1964f = null;
        this.f8113n = new p127f0.C1372e(new java.util.concurrent.CopyOnWriteArrayList(), i4, c1964f);
        this.f8114o = new p127f0.C1372e(new java.util.concurrent.CopyOnWriteArrayList(), i4, c1964f);
    }

    /* renamed from: a */
    public final p127f0.C1372e m4031a(p179q0.C1964F c1964f) {
        return new p127f0.C1372e(this.f8113n.f5650c, 0, c1964f);
    }

    /* renamed from: b */
    public abstract p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4);

    /* renamed from: c */
    public final void m4032c(p179q0.InterfaceC1965G interfaceC1965G) {
        java.util.HashSet hashSet = this.f8112m;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1965G);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo4033d();
    }

    /* renamed from: d */
    public void mo4033d() {
    }

    /* renamed from: e */
    public final void m4034e(p179q0.InterfaceC1965G interfaceC1965G) {
        this.f8115p.getClass();
        java.util.HashSet hashSet = this.f8112m;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1965G);
        if (isEmpty) {
            mo4035f();
        }
    }

    /* renamed from: f */
    public void mo4035f() {
    }

    /* renamed from: g */
    public p076T.AbstractC0677U mo4036g() {
        return null;
    }

    /* renamed from: h */
    public abstract p076T.C0659B mo2976h();

    /* renamed from: i */
    public boolean mo4037i() {
        return !(this instanceof p179q0.C2013r);
    }

    /* renamed from: j */
    public abstract void mo2977j();

    /* renamed from: l */
    public final void m4038l(p179q0.InterfaceC1965G interfaceC1965G, p094Y.InterfaceC0860C interfaceC0860C, p107b0.C1177l c1177l) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.f8115p;
        p086W.AbstractC0781a.m1416e(looper == null || looper == myLooper);
        this.f8117r = c1177l;
        p076T.AbstractC0677U abstractC0677U = this.f8116q;
        this.f8111l.add(interfaceC1965G);
        if (this.f8115p == null) {
            this.f8115p = myLooper;
            this.f8112m.add(interfaceC1965G);
            mo2978m(interfaceC0860C);
        } else if (abstractC0677U != null) {
            m4034e(interfaceC1965G);
            interfaceC1965G.mo1962a(this, abstractC0677U);
        }
    }

    /* renamed from: m */
    public abstract void mo2978m(p094Y.InterfaceC0860C interfaceC0860C);

    /* renamed from: n */
    public final void m4039n(p076T.AbstractC0677U abstractC0677U) {
        this.f8116q = abstractC0677U;
        java.util.Iterator it = this.f8111l.iterator();
        while (it.hasNext()) {
            ((p179q0.InterfaceC1965G) it.next()).mo1962a(this, abstractC0677U);
        }
    }

    /* renamed from: o */
    public abstract void mo2979o(p179q0.InterfaceC1962D interfaceC1962D);

    /* renamed from: p */
    public final void m4040p(p179q0.InterfaceC1965G interfaceC1965G) {
        java.util.ArrayList arrayList = this.f8111l;
        arrayList.remove(interfaceC1965G);
        if (!arrayList.isEmpty()) {
            m4032c(interfaceC1965G);
            return;
        }
        this.f8115p = null;
        this.f8116q = null;
        this.f8117r = null;
        this.f8112m.clear();
        mo2980r();
    }

    /* renamed from: r */
    public abstract void mo2980r();

    /* renamed from: s */
    public final void m4041s(p127f0.InterfaceC1373f interfaceC1373f) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f8114o.f5650c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p127f0.C1371d c1371d = (p127f0.C1371d) it.next();
            if (c1371d.f5647a == interfaceC1373f) {
                copyOnWriteArrayList.remove(c1371d);
            }
        }
    }

    /* renamed from: t */
    public final void m4042t(p179q0.InterfaceC1968J interfaceC1968J) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f8113n.f5650c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p179q0.C1967I c1967i = (p179q0.C1967I) it.next();
            if (c1967i.f7971b == interfaceC1968J) {
                copyOnWriteArrayList.remove(c1967i);
            }
        }
    }

    /* renamed from: u */
    public void mo2981u(p076T.C0659B c0659b) {
    }
}
