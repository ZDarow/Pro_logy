package p179q0;

/* renamed from: q0.r */
/* loaded from: classes.dex */
public final class C2013r extends p179q0.AbstractC2002j {

    /* renamed from: G */
    public static final p076T.C0659B f8208G;

    /* renamed from: A */
    public final java.util.HashMap f8209A;

    /* renamed from: B */
    public final java.util.HashSet f8210B;

    /* renamed from: C */
    public final boolean f8211C;

    /* renamed from: D */
    public boolean f8212D;

    /* renamed from: E */
    public java.util.HashSet f8213E;

    /* renamed from: F */
    public p179q0.C1991d0 f8214F;

    /* renamed from: v */
    public final java.util.ArrayList f8215v;

    /* renamed from: w */
    public final java.util.HashSet f8216w;

    /* renamed from: x */
    public android.os.Handler f8217x;

    /* renamed from: y */
    public final java.util.ArrayList f8218y;

    /* renamed from: z */
    public final java.util.IdentityHashMap f8219z;

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    static {
        p076T.C0706t c0706t = new p076T.C0706t();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        java.util.List emptyList = java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        p076T.C0712z c0712z = p076T.C0712z.f2455a;
        android.net.Uri uri = android.net.Uri.EMPTY;
        f8208G = new p076T.C0659B("", new p076T.C0707u(c0706t), uri != null ? new p076T.C0711y(uri, null, null, emptyList, c1415c02, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z);
    }

    public C2013r(boolean z4, p179q0.C1991d0 c1991d0, p179q0.AbstractC1984a... abstractC1984aArr) {
        for (p179q0.AbstractC1984a abstractC1984a : abstractC1984aArr) {
            abstractC1984a.getClass();
        }
        this.f8214F = c1991d0.f8129b.length > 0 ? c1991d0.m4044a() : c1991d0;
        this.f8219z = new java.util.IdentityHashMap();
        this.f8209A = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f8215v = arrayList;
        this.f8218y = new java.util.ArrayList();
        this.f8213E = new java.util.HashSet();
        this.f8216w = new java.util.HashSet();
        this.f8210B = new java.util.HashSet();
        this.f8211C = z4;
        java.util.List asList = java.util.Arrays.asList(abstractC1984aArr);
        synchronized (this) {
            m4057D(arrayList.size(), asList, null, null);
        }
    }

    /* renamed from: B */
    public final synchronized void m4055B(int i4, java.util.ArrayList arrayList, android.os.Handler handler, p093X2.RunnableC0855p runnableC0855p) {
        m4057D(i4, arrayList, handler, runnableC0855p);
    }

    /* renamed from: C */
    public final void m4056C(int i4, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            p179q0.C2011p c2011p = (p179q0.C2011p) it.next();
            int i5 = i4 + 1;
            java.util.ArrayList arrayList = this.f8218y;
            if (i4 > 0) {
                p179q0.C2011p c2011p2 = (p179q0.C2011p) arrayList.get(i4 - 1);
                int mo1236o = c2011p2.f8199a.f7959z.f8231b.mo1236o() + c2011p2.f8203e;
                c2011p.f8202d = i4;
                c2011p.f8203e = mo1236o;
                c2011p.f8204f = false;
                c2011p.f8201c.clear();
            } else {
                c2011p.f8202d = i4;
                c2011p.f8203e = 0;
                c2011p.f8204f = false;
                c2011p.f8201c.clear();
            }
            m4058E(i4, 1, c2011p.f8199a.f7959z.f8231b.mo1236o());
            arrayList.add(i4, c2011p);
            this.f8209A.put(c2011p.f8200b, c2011p);
            m4049A(c2011p, c2011p.f8199a);
            if (this.f8112m.isEmpty() || !this.f8219z.isEmpty()) {
                p179q0.C2000i c2000i = (p179q0.C2000i) this.f8175s.get(c2011p);
                c2000i.getClass();
                c2000i.f8170a.m4032c(c2000i.f8171b);
            } else {
                this.f8210B.add(c2011p);
            }
            i4 = i5;
        }
    }

    /* renamed from: D */
    public final void m4057D(int i4, java.util.List list, android.os.Handler handler, p093X2.RunnableC0855p runnableC0855p) {
        p086W.AbstractC0781a.m1416e((handler == null) == (runnableC0855p == null));
        android.os.Handler handler2 = this.f8217x;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((p179q0.AbstractC1984a) it.next()).getClass();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new p179q0.C2011p((p179q0.AbstractC1984a) it2.next(), this.f8211C));
        }
        this.f8215v.addAll(i4, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(1, new p179q0.C2012q(i4, arrayList, m4059F(handler, runnableC0855p))).sendToTarget();
        } else {
            if (runnableC0855p == null || handler == null) {
                return;
            }
            handler.post(runnableC0855p);
        }
    }

    /* renamed from: E */
    public final void m4058E(int i4, int i5, int i6) {
        while (true) {
            java.util.ArrayList arrayList = this.f8218y;
            if (i4 >= arrayList.size()) {
                return;
            }
            p179q0.C2011p c2011p = (p179q0.C2011p) arrayList.get(i4);
            c2011p.f8202d += i5;
            c2011p.f8203e += i6;
            i4++;
        }
    }

    /* renamed from: F */
    public final p179q0.C2010o m4059F(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        p179q0.C2010o c2010o = new p179q0.C2010o(handler, runnable);
        this.f8216w.add(c2010o);
        return c2010o;
    }

    /* renamed from: G */
    public final void m4060G() {
        java.util.Iterator it = this.f8210B.iterator();
        while (it.hasNext()) {
            p179q0.C2011p c2011p = (p179q0.C2011p) it.next();
            if (c2011p.f8201c.isEmpty()) {
                p179q0.C2000i c2000i = (p179q0.C2000i) this.f8175s.get(c2011p);
                c2000i.getClass();
                c2000i.f8170a.m4032c(c2000i.f8171b);
                it.remove();
            }
        }
    }

    /* renamed from: H */
    public final synchronized void m4061H(java.util.Set set) {
        try {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                p179q0.C2010o c2010o = (p179q0.C2010o) it.next();
                c2010o.f8197a.post(c2010o.f8198b);
            }
            this.f8216w.removeAll(set);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* renamed from: I */
    public final synchronized void m4062I(int i4, int i5, android.os.Handler handler, p093X2.RunnableC0855p runnableC0855p) {
        p086W.AbstractC0781a.m1416e(handler != null);
        android.os.Handler handler2 = this.f8217x;
        java.util.ArrayList arrayList = this.f8215v;
        arrayList.add(i5, (p179q0.C2011p) arrayList.remove(i4));
        if (handler2 != null) {
            handler2.obtainMessage(3, new p179q0.C2012q(i4, java.lang.Integer.valueOf(i5), m4059F(handler, runnableC0855p))).sendToTarget();
        } else if (handler != null) {
            handler.post(runnableC0855p);
        }
    }

    /* renamed from: J */
    public final synchronized void m4063J(int i4, int i5, android.os.Handler handler, p093X2.RunnableC0855p runnableC0855p) {
        p086W.AbstractC0781a.m1416e(handler != null);
        android.os.Handler handler2 = this.f8217x;
        p086W.AbstractC0805y.m1597R(this.f8215v, i4, i5);
        if (handler2 != null) {
            handler2.obtainMessage(2, new p179q0.C2012q(i4, java.lang.Integer.valueOf(i5), m4059F(handler, runnableC0855p))).sendToTarget();
        } else if (handler != null) {
            handler.post(runnableC0855p);
        }
    }

    /* renamed from: K */
    public final void m4064K(p179q0.C2010o c2010o) {
        if (!this.f8212D) {
            android.os.Handler handler = this.f8217x;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.f8212D = true;
        }
        if (c2010o != null) {
            this.f8213E.add(c2010o);
        }
    }

    /* renamed from: L */
    public final void m4065L(p179q0.C1991d0 c1991d0) {
        int size;
        android.os.Handler handler = this.f8217x;
        if (handler == null) {
            if (c1991d0.f8129b.length > 0) {
                c1991d0 = c1991d0.m4044a();
            }
            this.f8214F = c1991d0;
        } else {
            synchronized (this) {
                size = this.f8215v.size();
            }
            if (c1991d0.f8129b.length != size) {
                c1991d0 = c1991d0.m4044a().m4045b(0, size);
            }
            handler.obtainMessage(4, new p179q0.C2012q(0, c1991d0, null)).sendToTarget();
        }
    }

    /* renamed from: M */
    public final synchronized void m4066M(p179q0.C1991d0 c1991d0) {
        m4065L(c1991d0);
    }

    /* renamed from: N */
    public final void m4067N() {
        this.f8212D = false;
        java.util.HashSet hashSet = this.f8213E;
        this.f8213E = new java.util.HashSet();
        m4039n(new p179q0.C2008m(this.f8218y, this.f8214F));
        android.os.Handler handler = this.f8217x;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        int i4 = p102a0.AbstractC0962a.f3501d;
        android.util.Pair pair = (android.util.Pair) c1964f.f7960a;
        java.lang.Object obj = pair.first;
        p179q0.C1964F m3967a = c1964f.m3967a(pair.second);
        p179q0.C2011p c2011p = (p179q0.C2011p) this.f8209A.get(obj);
        if (c2011p == null) {
            c2011p = new p179q0.C2011p(new p179q0.AbstractC1984a(), this.f8211C);
            c2011p.f8204f = true;
            m4049A(c2011p, c2011p.f8199a);
        }
        this.f8210B.add(c2011p);
        p179q0.C2000i c2000i = (p179q0.C2000i) this.f8175s.get(c2011p);
        c2000i.getClass();
        c2000i.f8170a.m4034e(c2000i.f8171b);
        c2011p.f8201c.add(m3967a);
        p179q0.C2020y mo2975b = c2011p.f8199a.mo2975b(m3967a, c2218e, j4);
        this.f8219z.put(mo2975b, c2011p);
        m4060G();
        return mo2975b;
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: d */
    public final void mo4033d() {
        super.mo4033d();
        this.f8210B.clear();
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: f */
    public final void mo4035f() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: g */
    public final synchronized p076T.AbstractC0677U mo4036g() {
        try {
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return new p179q0.C2008m(this.f8215v, this.f8214F.f8129b.length != this.f8215v.size() ? this.f8214F.m4044a().m4045b(0, this.f8215v.size()) : this.f8214F);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final p076T.C0659B mo2976h() {
        return f8208G;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final synchronized void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        try {
            this.f8177u = interfaceC0860C;
            this.f8176t = p086W.AbstractC0805y.m1619n(null);
            this.f8217x = new android.os.Handler(new p086W.C0786f(1, this));
            if (this.f8215v.isEmpty()) {
                m4067N();
            } else {
                this.f8214F = this.f8214F.m4045b(0, this.f8215v.size());
                m4056C(0, this.f8215v);
                m4064K(null);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        java.util.IdentityHashMap identityHashMap = this.f8219z;
        p179q0.C2011p c2011p = (p179q0.C2011p) identityHashMap.remove(interfaceC1962D);
        c2011p.getClass();
        c2011p.f8199a.mo2979o(interfaceC1962D);
        java.util.ArrayList arrayList = c2011p.f8201c;
        arrayList.remove(((p179q0.C2020y) interfaceC1962D).f8239l);
        if (!identityHashMap.isEmpty()) {
            m4060G();
        }
        if (c2011p.f8204f && arrayList.isEmpty()) {
            this.f8210B.remove(c2011p);
            p179q0.C2000i c2000i = (p179q0.C2000i) this.f8175s.remove(c2011p);
            c2000i.getClass();
            p179q0.C1998h c1998h = c2000i.f8171b;
            p179q0.AbstractC1984a abstractC1984a = c2000i.f8170a;
            abstractC1984a.m4040p(c1998h);
            p035I.C0291m c0291m = c2000i.f8172c;
            abstractC1984a.m4042t(c0291m);
            abstractC1984a.m4041s(c0291m);
        }
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: r */
    public final synchronized void mo2980r() {
        try {
            super.mo2980r();
            this.f8218y.clear();
            this.f8210B.clear();
            this.f8209A.clear();
            this.f8214F = this.f8214F.m4044a();
            android.os.Handler handler = this.f8217x;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f8217x = null;
            }
            this.f8212D = false;
            this.f8213E.clear();
            m4061H(this.f8216w);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p179q0.AbstractC2002j
    /* renamed from: v */
    public final p179q0.C1964F mo3986v(java.lang.Object obj, p179q0.C1964F c1964f) {
        p179q0.C2011p c2011p = (p179q0.C2011p) obj;
        for (int i4 = 0; i4 < c2011p.f8201c.size(); i4++) {
            if (((p179q0.C1964F) c2011p.f8201c.get(i4)).f7963d == c1964f.f7963d) {
                java.lang.Object obj2 = c2011p.f8200b;
                int i5 = p102a0.AbstractC0962a.f3501d;
                return c1964f.m3967a(android.util.Pair.create(obj2, c1964f.f7960a));
            }
        }
        return null;
    }

    @Override // p179q0.AbstractC2002j
    /* renamed from: y */
    public final int mo4051y(int i4, java.lang.Object obj) {
        return i4 + ((p179q0.C2011p) obj).f8203e;
    }

    @Override // p179q0.AbstractC2002j
    /* renamed from: z */
    public final void mo3987z(java.lang.Object obj, p179q0.AbstractC1984a abstractC1984a, p076T.AbstractC0677U abstractC0677U) {
        p179q0.C2011p c2011p = (p179q0.C2011p) obj;
        int i4 = c2011p.f8202d + 1;
        java.util.ArrayList arrayList = this.f8218y;
        if (i4 < arrayList.size()) {
            int mo1236o = abstractC0677U.mo1236o() - (((p179q0.C2011p) arrayList.get(c2011p.f8202d + 1)).f8203e - c2011p.f8203e);
            if (mo1236o != 0) {
                m4058E(c2011p.f8202d + 1, 0, mo1236o);
            }
        }
        m4064K(null);
    }
}
