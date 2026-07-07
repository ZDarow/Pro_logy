package p102a0;

/* renamed from: a0.e0 */
/* loaded from: classes.dex */
public final class C0971e0 {

    /* renamed from: a */
    public final p107b0.C1177l f3554a;

    /* renamed from: e */
    public final p102a0.C0950N f3558e;

    /* renamed from: h */
    public final p107b0.C1170e f3561h;

    /* renamed from: i */
    public final p086W.C0802v f3562i;

    /* renamed from: k */
    public boolean f3564k;

    /* renamed from: l */
    public p094Y.InterfaceC0860C f3565l;

    /* renamed from: j */
    public p179q0.C1991d0 f3563j = new p179q0.C1991d0();

    /* renamed from: c */
    public final java.util.IdentityHashMap f3556c = new java.util.IdentityHashMap();

    /* renamed from: d */
    public final java.util.HashMap f3557d = new java.util.HashMap();

    /* renamed from: b */
    public final java.util.ArrayList f3555b = new java.util.ArrayList();

    /* renamed from: f */
    public final java.util.HashMap f3559f = new java.util.HashMap();

    /* renamed from: g */
    public final java.util.HashSet f3560g = new java.util.HashSet();

    public C0971e0(p102a0.C0950N c0950n, p107b0.C1170e c1170e, p086W.C0802v c0802v, p107b0.C1177l c1177l) {
        this.f3554a = c1177l;
        this.f3558e = c0950n;
        this.f3561h = c1170e;
        this.f3562i = c0802v;
    }

    /* renamed from: a */
    public final p076T.AbstractC0677U m2002a(int i4, java.util.ArrayList arrayList, p179q0.C1991d0 c1991d0) {
        if (!arrayList.isEmpty()) {
            this.f3563j = c1991d0;
            for (int i5 = i4; i5 < arrayList.size() + i4; i5++) {
                p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) arrayList.get(i5 - i4);
                java.util.ArrayList arrayList2 = this.f3555b;
                if (i5 > 0) {
                    p102a0.C0969d0 c0969d02 = (p102a0.C0969d0) arrayList2.get(i5 - 1);
                    c0969d0.f3535d = c0969d02.f3532a.f7959z.f8231b.mo1236o() + c0969d02.f3535d;
                    c0969d0.f3536e = false;
                    c0969d0.f3534c.clear();
                } else {
                    c0969d0.f3535d = 0;
                    c0969d0.f3536e = false;
                    c0969d0.f3534c.clear();
                }
                int mo1236o = c0969d0.f3532a.f7959z.f8231b.mo1236o();
                for (int i6 = i5; i6 < arrayList2.size(); i6++) {
                    ((p102a0.C0969d0) arrayList2.get(i6)).f3535d += mo1236o;
                }
                arrayList2.add(i5, c0969d0);
                this.f3557d.put(c0969d0.f3533b, c0969d0);
                if (this.f3564k) {
                    m2006e(c0969d0);
                    if (this.f3556c.isEmpty()) {
                        this.f3560g.add(c0969d0);
                    } else {
                        p102a0.C0967c0 c0967c0 = (p102a0.C0967c0) this.f3559f.get(c0969d0);
                        if (c0967c0 != null) {
                            c0967c0.f3521a.m4032c(c0967c0.f3522b);
                        }
                    }
                }
            }
        }
        return m2003b();
    }

    /* renamed from: b */
    public final p076T.AbstractC0677U m2003b() {
        java.util.ArrayList arrayList = this.f3555b;
        if (arrayList.isEmpty()) {
            return p076T.AbstractC0677U.f2248a;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) arrayList.get(i5);
            c0969d0.f3535d = i4;
            i4 += c0969d0.f3532a.f7959z.f8231b.mo1236o();
        }
        return new p102a0.C0983k0(arrayList, this.f3563j);
    }

    /* renamed from: c */
    public final void m2004c() {
        java.util.Iterator it = this.f3560g.iterator();
        while (it.hasNext()) {
            p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) it.next();
            if (c0969d0.f3534c.isEmpty()) {
                p102a0.C0967c0 c0967c0 = (p102a0.C0967c0) this.f3559f.get(c0969d0);
                if (c0967c0 != null) {
                    c0967c0.f3521a.m4032c(c0967c0.f3522b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void m2005d(p102a0.C0969d0 c0969d0) {
        if (c0969d0.f3536e && c0969d0.f3534c.isEmpty()) {
            p102a0.C0967c0 c0967c0 = (p102a0.C0967c0) this.f3559f.remove(c0969d0);
            c0967c0.getClass();
            p102a0.C0960Y c0960y = c0967c0.f3522b;
            p179q0.AbstractC1984a abstractC1984a = c0967c0.f3521a;
            abstractC1984a.m4040p(c0960y);
            p094Y.C0886x c0886x = c0967c0.f3523c;
            abstractC1984a.m4042t(c0886x);
            abstractC1984a.m4041s(c0886x);
            this.f3560g.remove(c0969d0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a0.Y, q0.G] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, f0.d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, q0.I] */
    /* renamed from: e */
    public final void m2006e(p102a0.C0969d0 c0969d0) {
        p179q0.C1960B c1960b = c0969d0.f3532a;
        ?? r12 = new p179q0.InterfaceC1965G() { // from class: a0.Y
            @Override // p179q0.InterfaceC1965G
            /* renamed from: a */
            public final void mo1962a(p179q0.AbstractC1984a abstractC1984a, p076T.AbstractC0677U abstractC0677U) {
                p086W.C0802v c0802v = p102a0.C0971e0.this.f3558e.f3436s;
                c0802v.m1571d(2);
                c0802v.m1572e(22);
            }
        };
        p094Y.C0886x c0886x = new p094Y.C0886x(this, c0969d0, 5, false);
        this.f3559f.put(c0969d0, new p102a0.C0967c0(c1960b, r12, c0886x));
        int i4 = p086W.AbstractC0805y.f2801a;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            myLooper = android.os.Looper.getMainLooper();
        }
        android.os.Handler handler = new android.os.Handler(myLooper, null);
        c1960b.getClass();
        p127f0.C1372e c1372e = c1960b.f8113n;
        c1372e.getClass();
        ?? obj = new java.lang.Object();
        obj.f7970a = handler;
        obj.f7971b = c0886x;
        c1372e.f5650c.add(obj);
        android.os.Looper myLooper2 = android.os.Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = android.os.Looper.getMainLooper();
        }
        new android.os.Handler(myLooper2, null);
        p127f0.C1372e c1372e2 = c1960b.f8114o;
        c1372e2.getClass();
        ?? obj2 = new java.lang.Object();
        obj2.f5647a = c0886x;
        c1372e2.f5650c.add(obj2);
        c1960b.m4038l(r12, this.f3565l, this.f3554a);
    }

    /* renamed from: f */
    public final void m2007f(p179q0.InterfaceC1962D interfaceC1962D) {
        java.util.IdentityHashMap identityHashMap = this.f3556c;
        p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) identityHashMap.remove(interfaceC1962D);
        c0969d0.getClass();
        c0969d0.f3532a.mo2979o(interfaceC1962D);
        c0969d0.f3534c.remove(((p179q0.C2020y) interfaceC1962D).f8239l);
        if (!identityHashMap.isEmpty()) {
            m2004c();
        }
        m2005d(c0969d0);
    }

    /* renamed from: g */
    public final void m2008g(int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            java.util.ArrayList arrayList = this.f3555b;
            p102a0.C0969d0 c0969d0 = (p102a0.C0969d0) arrayList.remove(i6);
            this.f3557d.remove(c0969d0.f3533b);
            int i7 = -c0969d0.f3532a.f7959z.f8231b.mo1236o();
            for (int i8 = i6; i8 < arrayList.size(); i8++) {
                ((p102a0.C0969d0) arrayList.get(i8)).f3535d += i7;
            }
            c0969d0.f3536e = true;
            if (this.f3564k) {
                m2005d(c0969d0);
            }
        }
    }
}
