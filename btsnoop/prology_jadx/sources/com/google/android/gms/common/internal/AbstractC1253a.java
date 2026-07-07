package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC1253a implements p050M1.InterfaceC0419c {

    /* renamed from: I */
    public static final p046L1.C0359c[] f4914I = new p046L1.C0359c[0];

    /* renamed from: A */
    public final int f4915A;

    /* renamed from: B */
    public final java.lang.String f4916B;

    /* renamed from: C */
    public volatile java.lang.String f4917C;

    /* renamed from: D */
    public p046L1.C0357a f4918D;

    /* renamed from: E */
    public boolean f4919E;

    /* renamed from: F */
    public volatile p058O1.C0521y f4920F;

    /* renamed from: G */
    public final java.util.concurrent.atomic.AtomicInteger f4921G;

    /* renamed from: H */
    public final java.util.Set f4922H;

    /* renamed from: l */
    public volatile java.lang.String f4923l;

    /* renamed from: m */
    public p009B2.C0033D f4924m;

    /* renamed from: n */
    public final android.content.Context f4925n;

    /* renamed from: o */
    public final p058O1.C0495C f4926o;

    /* renamed from: p */
    public final p058O1.HandlerC0516t f4927p;

    /* renamed from: q */
    public final java.lang.Object f4928q;

    /* renamed from: r */
    public final java.lang.Object f4929r;

    /* renamed from: s */
    public p058O1.C0514r f4930s;

    /* renamed from: t */
    public p058O1.InterfaceC0498b f4931t;

    /* renamed from: u */
    public android.os.IInterface f4932u;

    /* renamed from: v */
    public final java.util.ArrayList f4933v;

    /* renamed from: w */
    public p058O1.ServiceConnectionC0518v f4934w;

    /* renamed from: x */
    public int f4935x;

    /* renamed from: y */
    public final p058O1.C0504h f4936y;

    /* renamed from: z */
    public final p058O1.C0504h f4937z;

    public AbstractC1253a(android.content.Context context, android.os.Looper looper, int i4, p013C2.C0139d c0139d, p050M1.InterfaceC0423g interfaceC0423g, p050M1.InterfaceC0424h interfaceC0424h) {
        synchronized (p058O1.C0495C.f1451g) {
            try {
                if (p058O1.C0495C.f1452h == null) {
                    p058O1.C0495C.f1452h = new p058O1.C0495C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p058O1.C0495C c0495c = p058O1.C0495C.f1452h;
        java.lang.Object obj = p046L1.C0360d.f1103b;
        p058O1.AbstractC0515s.m1017d(interfaceC0423g);
        p058O1.AbstractC0515s.m1017d(interfaceC0424h);
        p058O1.C0504h c0504h = new p058O1.C0504h(interfaceC0423g);
        p058O1.C0504h c0504h2 = new p058O1.C0504h(interfaceC0424h);
        java.lang.String str = (java.lang.String) c0139d.f378d;
        this.f4923l = null;
        this.f4928q = new java.lang.Object();
        this.f4929r = new java.lang.Object();
        this.f4933v = new java.util.ArrayList();
        this.f4935x = 1;
        this.f4918D = null;
        this.f4919E = false;
        this.f4920F = null;
        this.f4921G = new java.util.concurrent.atomic.AtomicInteger(0);
        p058O1.AbstractC0515s.m1018e(context, "Context must not be null");
        this.f4925n = context;
        p058O1.AbstractC0515s.m1018e(looper, "Looper must not be null");
        p058O1.AbstractC0515s.m1018e(c0495c, "Supervisor must not be null");
        this.f4926o = c0495c;
        this.f4927p = new p058O1.HandlerC0516t(this, looper);
        this.f4915A = i4;
        this.f4936y = c0504h;
        this.f4937z = c0504h2;
        this.f4916B = str;
        java.util.Set set = (java.util.Set) c0139d.f376b;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4922H = set;
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m2934v(com.google.android.gms.common.internal.AbstractC1253a abstractC1253a, int i4, int i5, android.os.IInterface iInterface) {
        synchronized (abstractC1253a.f4928q) {
            try {
                if (abstractC1253a.f4935x != i4) {
                    return false;
                }
                abstractC1253a.m2936w(i5, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: a */
    public final boolean mo884a() {
        boolean z4;
        synchronized (this.f4928q) {
            int i4 = this.f4935x;
            z4 = true;
            if (i4 != 2 && i4 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: b */
    public final p046L1.C0359c[] mo885b() {
        p058O1.C0521y c0521y = this.f4920F;
        if (c0521y == null) {
            return null;
        }
        return c0521y.f1539m;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: c */
    public final boolean mo886c() {
        boolean z4;
        synchronized (this.f4928q) {
            z4 = this.f4935x == 4;
        }
        return z4;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: d */
    public final void mo887d() {
        if (!mo886c() || this.f4924m == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: e */
    public final java.lang.String mo888e() {
        return this.f4923l;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: f */
    public final java.util.Set mo889f() {
        return mo893j() ? this.f4922H : java.util.Collections.emptySet();
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: g */
    public final void mo890g(p058O1.InterfaceC0502f interfaceC0502f, java.util.Set set) {
        android.os.Bundle mo1080p = mo1080p();
        java.lang.String str = this.f4917C;
        int i4 = p046L1.AbstractC0361e.f1105a;
        com.google.android.gms.common.api.Scope[] scopeArr = p058O1.C0501e.f1471z;
        android.os.Bundle bundle = new android.os.Bundle();
        int i5 = this.f4915A;
        p046L1.C0359c[] c0359cArr = p058O1.C0501e.f1470A;
        p058O1.C0501e c0501e = new p058O1.C0501e(6, i5, i4, null, null, scopeArr, bundle, null, c0359cArr, c0359cArr, true, 0, false, str);
        c0501e.f1475o = this.f4925n.getPackageName();
        c0501e.f1478r = mo1080p;
        if (set != null) {
            c0501e.f1477q = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (mo893j()) {
            c0501e.f1479s = new android.accounts.Account("<<default account>>", "com.google");
            if (interfaceC0502f != null) {
                c0501e.f1476p = ((p058O1.C0496D) interfaceC0502f).f1460c;
            }
        }
        c0501e.f1480t = f4914I;
        c0501e.f1481u = mo1079o();
        if (this instanceof p096Y1.C0898i) {
            c0501e.f1484x = true;
        }
        try {
            synchronized (this.f4929r) {
                try {
                    p058O1.C0514r c0514r = this.f4930s;
                    if (c0514r != null) {
                        c0514r.m1013K(new p058O1.BinderC0517u(this, this.f4921G.get()), c0501e);
                    } else {
                        android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (android.os.DeadObjectException e4) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i6 = this.f4921G.get();
            p058O1.HandlerC0516t handlerC0516t = this.f4927p;
            handlerC0516t.sendMessage(handlerC0516t.obtainMessage(6, i6, 3));
        } catch (android.os.RemoteException e5) {
            e = e5;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f4921G.get();
            p058O1.C0519w c0519w = new p058O1.C0519w(this, 8, null, null);
            p058O1.HandlerC0516t handlerC0516t2 = this.f4927p;
            handlerC0516t2.sendMessage(handlerC0516t2.obtainMessage(1, i7, -1, c0519w));
        } catch (java.lang.SecurityException e6) {
            throw e6;
        } catch (java.lang.RuntimeException e7) {
            e = e7;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f4921G.get();
            p058O1.C0519w c0519w2 = new p058O1.C0519w(this, 8, null, null);
            p058O1.HandlerC0516t handlerC0516t22 = this.f4927p;
            handlerC0516t22.sendMessage(handlerC0516t22.obtainMessage(1, i72, -1, c0519w2));
        }
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: h */
    public final void mo891h() {
        this.f4921G.incrementAndGet();
        synchronized (this.f4933v) {
            try {
                int size = this.f4933v.size();
                for (int i4 = 0; i4 < size; i4++) {
                    p058O1.AbstractC0512p abstractC0512p = (p058O1.AbstractC0512p) this.f4933v.get(i4);
                    synchronized (abstractC0512p) {
                        abstractC0512p.f1520a = null;
                    }
                }
                this.f4933v.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4929r) {
            this.f4930s = null;
        }
        m2936w(1, null);
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: i */
    public final void mo892i(java.lang.String str) {
        this.f4923l = str;
        mo891h();
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: j */
    public boolean mo893j() {
        return false;
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: k */
    public final void mo894k(p058O1.InterfaceC0498b interfaceC0498b) {
        this.f4931t = interfaceC0498b;
        m2936w(2, null);
    }

    @Override // p050M1.InterfaceC0419c
    /* renamed from: l */
    public final void mo895l(p043K2.C0339o c0339o) {
        ((p054N1.C0460o) c0339o.f1048m).f1345o.f1321x.post(new p024F.RunnableC0199b(2, c0339o));
    }

    /* renamed from: n */
    public abstract android.os.IInterface mo1078n(android.os.IBinder iBinder);

    /* renamed from: o */
    public p046L1.C0359c[] mo1079o() {
        return f4914I;
    }

    /* renamed from: p */
    public android.os.Bundle mo1080p() {
        return new android.os.Bundle();
    }

    /* renamed from: q */
    public final android.os.IInterface m2935q() {
        android.os.IInterface iInterface;
        synchronized (this.f4928q) {
            try {
                if (this.f4935x == 5) {
                    throw new android.os.DeadObjectException();
                }
                if (!mo886c()) {
                    throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f4932u;
                p058O1.AbstractC0515s.m1018e(iInterface, "Client is connected but service is null");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* renamed from: r */
    public abstract java.lang.String mo1081r();

    /* renamed from: s */
    public abstract java.lang.String mo1082s();

    /* renamed from: t */
    public boolean mo1083t() {
        return mo896m() >= 211700000;
    }

    /* renamed from: u */
    public void mo1740u() {
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [B2.D, java.lang.Object] */
    /* renamed from: w */
    public final void m2936w(int i4, android.os.IInterface iInterface) {
        p009B2.C0033D c0033d;
        if ((i4 == 4) != (iInterface != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        synchronized (this.f4928q) {
            try {
                this.f4935x = i4;
                this.f4932u = iInterface;
                if (i4 == 1) {
                    p058O1.ServiceConnectionC0518v serviceConnectionC0518v = this.f4934w;
                    if (serviceConnectionC0518v != null) {
                        p058O1.C0495C c0495c = this.f4926o;
                        java.lang.String str = (java.lang.String) this.f4924m.f119b;
                        p058O1.AbstractC0515s.m1017d(str);
                        this.f4924m.getClass();
                        if (this.f4916B == null) {
                            this.f4925n.getClass();
                        }
                        c0495c.m1000a(str, serviceConnectionC0518v, this.f4924m.f118a);
                        this.f4934w = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    p058O1.ServiceConnectionC0518v serviceConnectionC0518v2 = this.f4934w;
                    if (serviceConnectionC0518v2 != null && (c0033d = this.f4924m) != null) {
                        android.util.Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((java.lang.String) c0033d.f119b) + " on com.google.android.gms");
                        p058O1.C0495C c0495c2 = this.f4926o;
                        java.lang.String str2 = (java.lang.String) this.f4924m.f119b;
                        p058O1.AbstractC0515s.m1017d(str2);
                        this.f4924m.getClass();
                        if (this.f4916B == null) {
                            this.f4925n.getClass();
                        }
                        c0495c2.m1000a(str2, serviceConnectionC0518v2, this.f4924m.f118a);
                        this.f4921G.incrementAndGet();
                    }
                    p058O1.ServiceConnectionC0518v serviceConnectionC0518v3 = new p058O1.ServiceConnectionC0518v(this, this.f4921G.get());
                    this.f4934w = serviceConnectionC0518v3;
                    java.lang.String mo1082s = mo1082s();
                    boolean mo1083t = mo1083t();
                    ?? obj = new java.lang.Object();
                    obj.f119b = mo1082s;
                    obj.f118a = mo1083t;
                    this.f4924m = obj;
                    if (mo1083t && mo896m() < 17895000) {
                        throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf((java.lang.String) this.f4924m.f119b)));
                    }
                    p058O1.C0495C c0495c3 = this.f4926o;
                    java.lang.String str3 = (java.lang.String) this.f4924m.f119b;
                    p058O1.AbstractC0515s.m1017d(str3);
                    this.f4924m.getClass();
                    java.lang.String str4 = this.f4916B;
                    if (str4 == null) {
                        str4 = this.f4925n.getClass().getName();
                    }
                    if (!c0495c3.m1001b(new p058O1.C0522z(str3, this.f4924m.f118a), serviceConnectionC0518v3, str4)) {
                        android.util.Log.w("GmsClient", "unable to connect to service: " + ((java.lang.String) this.f4924m.f119b) + " on com.google.android.gms");
                        int i5 = this.f4921G.get();
                        p058O1.C0520x c0520x = new p058O1.C0520x(this, 16);
                        p058O1.HandlerC0516t handlerC0516t = this.f4927p;
                        handlerC0516t.sendMessage(handlerC0516t.obtainMessage(7, i5, -1, c0520x));
                    }
                } else if (i4 == 4) {
                    p058O1.AbstractC0515s.m1017d(iInterface);
                    java.lang.System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
