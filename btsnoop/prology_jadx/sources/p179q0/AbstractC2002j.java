package p179q0;

/* renamed from: q0.j */
/* loaded from: classes.dex */
public abstract class AbstractC2002j extends p179q0.AbstractC1984a {

    /* renamed from: s */
    public final java.util.HashMap f8175s = new java.util.HashMap();

    /* renamed from: t */
    public android.os.Handler f8176t;

    /* renamed from: u */
    public p094Y.InterfaceC0860C f8177u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f0.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.G, q0.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, q0.I] */
    /* renamed from: A */
    public final void m4049A(final java.lang.Object obj, p179q0.AbstractC1984a abstractC1984a) {
        java.util.HashMap hashMap = this.f8175s;
        p086W.AbstractC0781a.m1416e(!hashMap.containsKey(obj));
        ?? r12 = new p179q0.InterfaceC1965G() { // from class: q0.h
            @Override // p179q0.InterfaceC1965G
            /* renamed from: a */
            public final void mo1962a(p179q0.AbstractC1984a abstractC1984a2, p076T.AbstractC0677U abstractC0677U) {
                p179q0.AbstractC2002j.this.mo3987z(obj, abstractC1984a2, abstractC0677U);
            }
        };
        ?? obj2 = new java.lang.Object();
        obj2.f879o = this;
        obj2.f877m = m4031a(null);
        obj2.f878n = new p127f0.C1372e(this.f8114o.f5650c, 0, null);
        obj2.f876l = obj;
        hashMap.put(obj, new p179q0.C2000i(abstractC1984a, r12, obj2));
        android.os.Handler handler = this.f8176t;
        handler.getClass();
        abstractC1984a.getClass();
        p127f0.C1372e c1372e = abstractC1984a.f8113n;
        c1372e.getClass();
        ?? obj3 = new java.lang.Object();
        obj3.f7970a = handler;
        obj3.f7971b = obj2;
        c1372e.f5650c.add(obj3);
        this.f8176t.getClass();
        p127f0.C1372e c1372e2 = abstractC1984a.f8114o;
        c1372e2.getClass();
        ?? obj4 = new java.lang.Object();
        obj4.f5647a = obj2;
        c1372e2.f5650c.add(obj4);
        p094Y.InterfaceC0860C interfaceC0860C = this.f8177u;
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        abstractC1984a.m4038l(r12, interfaceC0860C, c1177l);
        if (this.f8112m.isEmpty()) {
            abstractC1984a.m4032c(r12);
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: d */
    public void mo4033d() {
        for (p179q0.C2000i c2000i : this.f8175s.values()) {
            c2000i.f8170a.m4032c(c2000i.f8171b);
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: f */
    public void mo4035f() {
        for (p179q0.C2000i c2000i : this.f8175s.values()) {
            c2000i.f8170a.m4034e(c2000i.f8171b);
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public void mo2977j() {
        java.util.Iterator it = this.f8175s.values().iterator();
        while (it.hasNext()) {
            ((p179q0.C2000i) it.next()).f8170a.mo2977j();
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public void mo2980r() {
        java.util.HashMap hashMap = this.f8175s;
        for (p179q0.C2000i c2000i : hashMap.values()) {
            c2000i.f8170a.m4040p(c2000i.f8171b);
            p035I.C0291m c0291m = c2000i.f8172c;
            p179q0.AbstractC1984a abstractC1984a = c2000i.f8170a;
            abstractC1984a.m4042t(c0291m);
            abstractC1984a.m4041s(c0291m);
        }
        hashMap.clear();
    }

    /* renamed from: v */
    public abstract p179q0.C1964F mo3986v(java.lang.Object obj, p179q0.C1964F c1964f);

    /* renamed from: w */
    public long mo4050w(long j4, java.lang.Object obj) {
        return j4;
    }

    /* renamed from: y */
    public int mo4051y(int i4, java.lang.Object obj) {
        return i4;
    }

    /* renamed from: z */
    public abstract void mo3987z(java.lang.Object obj, p179q0.AbstractC1984a abstractC1984a, p076T.AbstractC0677U abstractC0677U);
}
