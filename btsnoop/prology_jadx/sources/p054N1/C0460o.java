package p054N1;

/* renamed from: N1.o */
/* loaded from: classes.dex */
public final class C0460o implements p050M1.InterfaceC0423g, p050M1.InterfaceC0424h {

    /* renamed from: d */
    public final p050M1.InterfaceC0419c f1334d;

    /* renamed from: e */
    public final p054N1.C0447b f1335e;

    /* renamed from: f */
    public final p008B1.C0026d f1336f;

    /* renamed from: i */
    public final int f1339i;

    /* renamed from: j */
    public final p054N1.BinderC0442A f1340j;

    /* renamed from: k */
    public boolean f1341k;

    /* renamed from: o */
    public final /* synthetic */ p054N1.C0449d f1345o;

    /* renamed from: c */
    public final java.util.LinkedList f1333c = new java.util.LinkedList();

    /* renamed from: g */
    public final java.util.HashSet f1337g = new java.util.HashSet();

    /* renamed from: h */
    public final java.util.HashMap f1338h = new java.util.HashMap();

    /* renamed from: l */
    public final java.util.ArrayList f1342l = new java.util.ArrayList();

    /* renamed from: m */
    public p046L1.C0357a f1343m = null;

    /* renamed from: n */
    public int f1344n = 0;

    public C0460o(p054N1.C0449d c0449d, p050M1.AbstractC0422f abstractC0422f) {
        this.f1345o = c0449d;
        android.os.Looper looper = c0449d.f1321x.getLooper();
        android.support.v4.media.session.C1061t m897a = abstractC0422f.m897a();
        p013C2.C0139d c0139d = new p013C2.C0139d((p165n.C1879f) m897a.f3861m, (java.lang.String) m897a.f3862n, (java.lang.String) m897a.f3863o);
        p101a.AbstractC0936a abstractC0936a = (p101a.AbstractC0936a) abstractC0422f.f1203c.f99m;
        p058O1.AbstractC0515s.m1017d(abstractC0936a);
        p050M1.InterfaceC0419c mo1076e = abstractC0936a.mo1076e(abstractC0422f.f1201a, looper, c0139d, abstractC0422f.f1204d, this, this);
        java.lang.String str = abstractC0422f.f1202b;
        if (str != null && (mo1076e instanceof com.google.android.gms.common.internal.AbstractC1253a)) {
            ((com.google.android.gms.common.internal.AbstractC1253a) mo1076e).f4917C = str;
        }
        if (str != null && (mo1076e instanceof p054N1.AbstractServiceConnectionC0454i)) {
            p009B2.AbstractC0051h.m159r(mo1076e);
            throw null;
        }
        this.f1334d = mo1076e;
        this.f1335e = abstractC0422f.f1205e;
        this.f1336f = new p008B1.C0026d(21);
        this.f1339i = abstractC0422f.f1206f;
        if (!mo1076e.mo893j()) {
            this.f1340j = null;
            return;
        }
        android.content.Context context = c0449d.f1313p;
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        android.support.v4.media.session.C1061t m897a2 = abstractC0422f.m897a();
        this.f1340j = new p054N1.BinderC0442A(context, handlerC0820f, new p013C2.C0139d((p165n.C1879f) m897a2.f3861m, (java.lang.String) m897a2.f3862n, (java.lang.String) m897a2.f3863o));
    }

    @Override // p050M1.InterfaceC0423g
    /* renamed from: K */
    public final void mo900K(int i4) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p054N1.C0449d c0449d = this.f1345o;
        if (myLooper == c0449d.f1321x.getLooper()) {
            m965f(i4);
        } else {
            c0449d.f1321x.post(new p054N1.RunnableC0459n(this, i4));
        }
    }

    @Override // p050M1.InterfaceC0423g
    /* renamed from: V */
    public final void mo901V() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p054N1.C0449d c0449d = this.f1345o;
        if (myLooper == c0449d.f1321x.getLooper()) {
            m964e();
        } else {
            c0449d.f1321x.post(new p024F.RunnableC0199b(1, this));
        }
    }

    /* renamed from: a */
    public final void m960a(p046L1.C0357a c0357a) {
        java.util.HashSet hashSet = this.f1337g;
        java.util.Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new java.lang.ClassCastException();
            }
            if (p058O1.AbstractC0515s.m1019f(c0357a, p046L1.C0357a.f1092p)) {
                this.f1334d.mo887d();
            }
            throw null;
        }
    }

    /* renamed from: b */
    public final void m961b(com.google.android.gms.common.api.Status status) {
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        m962c(status, null, false);
    }

    /* renamed from: c */
    public final void m962c(com.google.android.gms.common.api.Status status, java.lang.RuntimeException runtimeException, boolean z4) {
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        if ((status == null) == (runtimeException == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.f1333c.iterator();
        while (it.hasNext()) {
            p054N1.AbstractC0466u abstractC0466u = (p054N1.AbstractC0466u) it.next();
            if (!z4 || abstractC0466u.f1359a == 2) {
                if (status != null) {
                    abstractC0466u.mo946c(status);
                } else {
                    abstractC0466u.mo947d(runtimeException);
                }
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void m963d() {
        java.util.LinkedList linkedList = this.f1333c;
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            p054N1.AbstractC0466u abstractC0466u = (p054N1.AbstractC0466u) arrayList.get(i4);
            if (!this.f1334d.mo886c()) {
                return;
            }
            if (m967h(abstractC0466u)) {
                linkedList.remove(abstractC0466u);
            }
        }
    }

    /* renamed from: e */
    public final void m964e() {
        p050M1.InterfaceC0419c interfaceC0419c = this.f1334d;
        p054N1.C0449d c0449d = this.f1345o;
        p058O1.AbstractC0515s.m1015b(c0449d.f1321x);
        this.f1343m = null;
        m960a(p046L1.C0357a.f1092p);
        if (this.f1341k) {
            p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
            p054N1.C0447b c0447b = this.f1335e;
            handlerC0820f.removeMessages(11, c0447b);
            c0449d.f1321x.removeMessages(9, c0447b);
            this.f1341k = false;
        }
        java.util.Iterator it = this.f1338h.values().iterator();
        while (it.hasNext()) {
            p008B1.C0026d c0026d = ((p054N1.C0470y) it.next()).f1372a;
            try {
                ((p094Y.C0886x) ((p086W.C0796p) c0026d.f100n).f2775b).mo751J(interfaceC0419c, new p119d2.C1285d());
            } catch (android.os.DeadObjectException unused) {
                mo900K(3);
                interfaceC0419c.mo892i("DeadObjectException thrown while calling register listener method.");
            } catch (android.os.RemoteException unused2) {
                it.remove();
            }
        }
        m963d();
        m966g();
    }

    /* renamed from: f */
    public final void m965f(int i4) {
        p054N1.C0449d c0449d = this.f1345o;
        p058O1.AbstractC0515s.m1015b(c0449d.f1321x);
        this.f1343m = null;
        this.f1341k = true;
        java.lang.String mo888e = this.f1334d.mo888e();
        p008B1.C0026d c0026d = this.f1336f;
        c0026d.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (mo888e != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(mo888e);
        }
        c0026d.m113o(true, new com.google.android.gms.common.api.Status(20, sb.toString(), null, null));
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        p054N1.C0447b c0447b = this.f1335e;
        handlerC0820f.sendMessageDelayed(android.os.Message.obtain(handlerC0820f, 9, c0447b), 5000L);
        p088W1.HandlerC0820f handlerC0820f2 = c0449d.f1321x;
        handlerC0820f2.sendMessageDelayed(android.os.Message.obtain(handlerC0820f2, 11, c0447b), 120000L);
        ((android.util.SparseIntArray) c0449d.f1315r.f99m).clear();
        java.util.Iterator it = this.f1338h.values().iterator();
        while (it.hasNext()) {
            ((p054N1.C0470y) it.next()).getClass();
        }
    }

    @Override // p050M1.InterfaceC0424h
    /* renamed from: f0 */
    public final void mo902f0(p046L1.C0357a c0357a) {
        m971l(c0357a, null);
    }

    /* renamed from: g */
    public final void m966g() {
        p054N1.C0449d c0449d = this.f1345o;
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        p054N1.C0447b c0447b = this.f1335e;
        handlerC0820f.removeMessages(12, c0447b);
        p088W1.HandlerC0820f handlerC0820f2 = c0449d.f1321x;
        handlerC0820f2.sendMessageDelayed(handlerC0820f2.obtainMessage(12, c0447b), c0449d.f1309l);
    }

    /* renamed from: h */
    public final boolean m967h(p054N1.AbstractC0466u abstractC0466u) {
        p046L1.C0359c c0359c;
        if (abstractC0466u == null) {
            p050M1.InterfaceC0419c interfaceC0419c = this.f1334d;
            abstractC0466u.mo949f(this.f1336f, interfaceC0419c.mo893j());
            try {
                abstractC0466u.mo948e(this);
            } catch (android.os.DeadObjectException unused) {
                mo900K(1);
                interfaceC0419c.mo892i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        p046L1.C0359c[] mo945b = abstractC0466u.mo945b(this);
        if (mo945b != null && mo945b.length != 0) {
            p046L1.C0359c[] mo885b = this.f1334d.mo885b();
            if (mo885b == null) {
                mo885b = new p046L1.C0359c[0];
            }
            p165n.C1883j c1883j = new p165n.C1883j(mo885b.length);
            for (p046L1.C0359c c0359c2 : mo885b) {
                c1883j.put(c0359c2.f1100l, java.lang.Long.valueOf(c0359c2.m804d()));
            }
            int length = mo945b.length;
            for (int i4 = 0; i4 < length; i4++) {
                c0359c = mo945b[i4];
                java.lang.Long l4 = (java.lang.Long) c1883j.get(c0359c.f1100l);
                if (l4 == null || l4.longValue() < c0359c.m804d()) {
                    break;
                }
            }
        }
        c0359c = null;
        if (c0359c == null) {
            p050M1.InterfaceC0419c interfaceC0419c2 = this.f1334d;
            abstractC0466u.mo949f(this.f1336f, interfaceC0419c2.mo893j());
            try {
                abstractC0466u.mo948e(this);
            } catch (android.os.DeadObjectException unused2) {
                mo900K(1);
                interfaceC0419c2.mo892i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        android.util.Log.w("GoogleApiManager", this.f1334d.getClass().getName() + " could not execute call because it requires feature (" + c0359c.f1100l + ", " + c0359c.m804d() + ").");
        if (!this.f1345o.f1322y || !abstractC0466u.mo944a(this)) {
            abstractC0466u.mo947d(new p050M1.C0427k(c0359c));
            return true;
        }
        p054N1.C0461p c0461p = new p054N1.C0461p(this.f1335e, c0359c);
        int indexOf = this.f1342l.indexOf(c0461p);
        if (indexOf >= 0) {
            p054N1.C0461p c0461p2 = (p054N1.C0461p) this.f1342l.get(indexOf);
            this.f1345o.f1321x.removeMessages(15, c0461p2);
            p088W1.HandlerC0820f handlerC0820f = this.f1345o.f1321x;
            handlerC0820f.sendMessageDelayed(android.os.Message.obtain(handlerC0820f, 15, c0461p2), 5000L);
        } else {
            this.f1342l.add(c0461p);
            p088W1.HandlerC0820f handlerC0820f2 = this.f1345o.f1321x;
            handlerC0820f2.sendMessageDelayed(android.os.Message.obtain(handlerC0820f2, 15, c0461p), 5000L);
            p088W1.HandlerC0820f handlerC0820f3 = this.f1345o.f1321x;
            handlerC0820f3.sendMessageDelayed(android.os.Message.obtain(handlerC0820f3, 16, c0461p), 120000L);
            p046L1.C0357a c0357a = new p046L1.C0357a(2, null);
            if (!m968i(c0357a)) {
                this.f1345o.m955b(c0357a, this.f1339i);
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m968i(p046L1.C0357a c0357a) {
        synchronized (p054N1.C0449d.f1306B) {
            this.f1345o.getClass();
        }
        return false;
    }

    /* renamed from: j */
    public final void m969j() {
        p054N1.C0449d c0449d = this.f1345o;
        p058O1.AbstractC0515s.m1015b(c0449d.f1321x);
        p050M1.InterfaceC0419c interfaceC0419c = this.f1334d;
        if (interfaceC0419c.mo886c() || interfaceC0419c.mo884a()) {
            return;
        }
        try {
            p008B1.C0026d c0026d = c0449d.f1315r;
            android.content.Context context = c0449d.f1313p;
            c0026d.getClass();
            p058O1.AbstractC0515s.m1017d(context);
            int mo896m = interfaceC0419c.mo896m();
            android.util.SparseIntArray sparseIntArray = (android.util.SparseIntArray) c0026d.f99m;
            int i4 = sparseIntArray.get(mo896m, -1);
            if (i4 == -1) {
                i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= sparseIntArray.size()) {
                        i4 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i5);
                    if (keyAt > mo896m && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i4 == -1) {
                    i4 = ((p046L1.C0360d) c0026d.f100n).m811b(context, mo896m);
                }
                sparseIntArray.put(mo896m, i4);
            }
            if (i4 != 0) {
                p046L1.C0357a c0357a = new p046L1.C0357a(i4, null);
                android.util.Log.w("GoogleApiManager", "The service for " + interfaceC0419c.getClass().getName() + " is not available: " + c0357a.toString());
                m971l(c0357a, null);
                return;
            }
            p054N1.C0463r c0463r = new p054N1.C0463r(c0449d, interfaceC0419c, this.f1335e);
            if (interfaceC0419c.mo893j()) {
                p054N1.BinderC0442A binderC0442A = this.f1340j;
                p058O1.AbstractC0515s.m1017d(binderC0442A);
                p114c2.C1246a c1246a = binderC0442A.f1287i;
                if (c1246a != null) {
                    c1246a.mo891h();
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.System.identityHashCode(binderC0442A));
                p013C2.C0139d c0139d = binderC0442A.f1286h;
                c0139d.f380f = valueOf;
                p088W1.HandlerC0820f handlerC0820f = binderC0442A.f1283e;
                binderC0442A.f1287i = (p114c2.C1246a) binderC0442A.f1284f.mo1076e(binderC0442A.f1282d, handlerC0820f.getLooper(), c0139d, (p109b2.C1185a) c0139d.f379e, binderC0442A, binderC0442A);
                binderC0442A.f1288j = c0463r;
                java.util.Set set = binderC0442A.f1285g;
                if (set == null || set.isEmpty()) {
                    handlerC0820f.post(new p024F.RunnableC0199b(3, binderC0442A));
                } else {
                    p114c2.C1246a c1246a2 = binderC0442A.f1287i;
                    c1246a2.getClass();
                    c1246a2.mo894k(new p058O1.C0504h(c1246a2));
                }
            }
            try {
                interfaceC0419c.mo894k(c0463r);
            } catch (java.lang.SecurityException e4) {
                m971l(new p046L1.C0357a(10), e4);
            }
        } catch (java.lang.IllegalStateException e5) {
            m971l(new p046L1.C0357a(10), e5);
        }
    }

    /* renamed from: k */
    public final void m970k(p054N1.AbstractC0466u abstractC0466u) {
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        boolean mo886c = this.f1334d.mo886c();
        java.util.LinkedList linkedList = this.f1333c;
        if (mo886c) {
            if (m967h(abstractC0466u)) {
                m966g();
                return;
            } else {
                linkedList.add(abstractC0466u);
                return;
            }
        }
        linkedList.add(abstractC0466u);
        p046L1.C0357a c0357a = this.f1343m;
        if (c0357a == null || c0357a.f1094m == 0 || c0357a.f1095n == null) {
            m969j();
        } else {
            m971l(c0357a, null);
        }
    }

    /* renamed from: l */
    public final void m971l(p046L1.C0357a c0357a, java.lang.RuntimeException runtimeException) {
        p114c2.C1246a c1246a;
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        p054N1.BinderC0442A binderC0442A = this.f1340j;
        if (binderC0442A != null && (c1246a = binderC0442A.f1287i) != null) {
            c1246a.mo891h();
        }
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        this.f1343m = null;
        ((android.util.SparseIntArray) this.f1345o.f1315r.f99m).clear();
        m960a(c0357a);
        if ((this.f1334d instanceof p066Q1.C0563d) && c0357a.f1094m != 24) {
            p054N1.C0449d c0449d = this.f1345o;
            c0449d.f1310m = true;
            p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
            handlerC0820f.sendMessageDelayed(handlerC0820f.obtainMessage(19), 300000L);
        }
        if (c0357a.f1094m == 4) {
            m961b(p054N1.C0449d.f1305A);
            return;
        }
        if (this.f1333c.isEmpty()) {
            this.f1343m = c0357a;
            return;
        }
        if (runtimeException != null) {
            p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
            m962c(null, runtimeException, false);
            return;
        }
        if (!this.f1345o.f1322y) {
            m961b(p054N1.C0449d.m952c(this.f1335e, c0357a));
            return;
        }
        m962c(p054N1.C0449d.m952c(this.f1335e, c0357a), null, true);
        if (this.f1333c.isEmpty() || m968i(c0357a) || this.f1345o.m955b(c0357a, this.f1339i)) {
            return;
        }
        if (c0357a.f1094m == 18) {
            this.f1341k = true;
        }
        if (!this.f1341k) {
            m961b(p054N1.C0449d.m952c(this.f1335e, c0357a));
            return;
        }
        p054N1.C0449d c0449d2 = this.f1345o;
        p054N1.C0447b c0447b = this.f1335e;
        p088W1.HandlerC0820f handlerC0820f2 = c0449d2.f1321x;
        handlerC0820f2.sendMessageDelayed(android.os.Message.obtain(handlerC0820f2, 9, c0447b), 5000L);
    }

    /* renamed from: m */
    public final void m972m(p046L1.C0357a c0357a) {
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        p050M1.InterfaceC0419c interfaceC0419c = this.f1334d;
        interfaceC0419c.mo892i("onSignInFailed for " + interfaceC0419c.getClass().getName() + " with " + java.lang.String.valueOf(c0357a));
        m971l(c0357a, null);
    }

    /* renamed from: n */
    public final void m973n() {
        p058O1.AbstractC0515s.m1015b(this.f1345o.f1321x);
        com.google.android.gms.common.api.Status status = p054N1.C0449d.f1308z;
        m961b(status);
        this.f1336f.m113o(false, status);
        for (p054N1.C0452g c0452g : (p054N1.C0452g[]) this.f1338h.keySet().toArray(new p054N1.C0452g[0])) {
            m970k(new p054N1.C0443B(c0452g, new p119d2.C1285d()));
        }
        m960a(new p046L1.C0357a(4));
        p050M1.InterfaceC0419c interfaceC0419c = this.f1334d;
        if (interfaceC0419c.mo886c()) {
            interfaceC0419c.mo895l(new p043K2.C0339o(3, this));
        }
    }
}
