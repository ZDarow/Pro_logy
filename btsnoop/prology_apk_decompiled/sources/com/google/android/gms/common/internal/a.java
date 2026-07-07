package com.google.android.gms.common.internal;

import B2.D;
import C2.d;
import F.b;
import K2.o;
import L1.e;
import M1.c;
import M1.g;
import O1.C;
import O1.InterfaceC0062b;
import O1.f;
import O1.h;
import O1.p;
import O1.r;
import O1.s;
import O1.t;
import O1.u;
import O1.v;
import O1.w;
import O1.x;
import O1.y;
import O1.z;
import Y1.i;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: I */
    public static final L1.c[] f4741I = new L1.c[0];

    /* renamed from: A */
    public final int f4742A;

    /* renamed from: B */
    public final String f4743B;

    /* renamed from: C */
    public volatile String f4744C;

    /* renamed from: D */
    public L1.a f4745D;

    /* renamed from: E */
    public boolean f4746E;

    /* renamed from: F */
    public volatile y f4747F;

    /* renamed from: G */
    public final AtomicInteger f4748G;

    /* renamed from: H */
    public final Set f4749H;

    /* renamed from: l */
    public volatile String f4750l;

    /* renamed from: m */
    public D f4751m;

    /* renamed from: n */
    public final Context f4752n;

    /* renamed from: o */
    public final C f4753o;

    /* renamed from: p */
    public final t f4754p;

    /* renamed from: q */
    public final Object f4755q;

    /* renamed from: r */
    public final Object f4756r;
    public r s;

    /* renamed from: t */
    public InterfaceC0062b f4757t;

    /* renamed from: u */
    public IInterface f4758u;

    /* renamed from: v */
    public final ArrayList f4759v;
    public v w;

    /* renamed from: x */
    public int f4760x;

    /* renamed from: y */
    public final h f4761y;

    /* renamed from: z */
    public final h f4762z;

    public a(Context context, Looper looper, int i4, d dVar, g gVar, M1.h hVar) {
        synchronized (C.f1403g) {
            try {
                if (C.f1404h == null) {
                    C.f1404h = new C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C c4 = C.f1404h;
        Object obj = L1.d.f1064b;
        s.d(gVar);
        s.d(hVar);
        h hVar2 = new h(gVar);
        h hVar3 = new h(hVar);
        String str = (String) dVar.f370d;
        this.f4750l = null;
        this.f4755q = new Object();
        this.f4756r = new Object();
        this.f4759v = new ArrayList();
        this.f4760x = 1;
        this.f4745D = null;
        this.f4746E = false;
        this.f4747F = null;
        this.f4748G = new AtomicInteger(0);
        s.e(context, "Context must not be null");
        this.f4752n = context;
        s.e(looper, "Looper must not be null");
        s.e(c4, "Supervisor must not be null");
        this.f4753o = c4;
        this.f4754p = new t(this, looper);
        this.f4742A = i4;
        this.f4761y = hVar2;
        this.f4762z = hVar3;
        this.f4743B = str;
        Set set = (Set) dVar.f368b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4749H = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i4, int i5, IInterface iInterface) {
        synchronized (aVar.f4755q) {
            try {
                if (aVar.f4760x != i4) {
                    return false;
                }
                aVar.w(i5, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // M1.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f4755q) {
            int i4 = this.f4760x;
            z4 = true;
            if (i4 != 2 && i4 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // M1.c
    public final L1.c[] b() {
        y yVar = this.f4747F;
        if (yVar == null) {
            return null;
        }
        return yVar.f1488m;
    }

    @Override // M1.c
    public final boolean c() {
        boolean z4;
        synchronized (this.f4755q) {
            z4 = this.f4760x == 4;
        }
        return z4;
    }

    @Override // M1.c
    public final void d() {
        if (!c() || this.f4751m == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // M1.c
    public final String e() {
        return this.f4750l;
    }

    @Override // M1.c
    public final Set f() {
        return j() ? this.f4749H : Collections.emptySet();
    }

    @Override // M1.c
    public final void g(f fVar, Set set) {
        Bundle p2 = p();
        String str = this.f4744C;
        int i4 = e.f1066a;
        Scope[] scopeArr = O1.e.f1423z;
        Bundle bundle = new Bundle();
        int i5 = this.f4742A;
        L1.c[] cVarArr = O1.e.f1422A;
        O1.e eVar = new O1.e(6, i5, i4, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        eVar.f1427o = this.f4752n.getPackageName();
        eVar.f1430r = p2;
        if (set != null) {
            eVar.f1429q = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            eVar.s = new Account("<<default account>>", "com.google");
            if (fVar != null) {
                eVar.f1428p = ((O1.D) fVar).f1412c;
            }
        }
        eVar.f1431t = f4741I;
        eVar.f1432u = o();
        if (this instanceof i) {
            eVar.f1434x = true;
        }
        try {
            synchronized (this.f4756r) {
                try {
                    r rVar = this.s;
                    if (rVar != null) {
                        rVar.K(new u(this, this.f4748G.get()), eVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i6 = this.f4748G.get();
            t tVar = this.f4754p;
            tVar.sendMessage(tVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f4748G.get();
            w wVar = new w(this, 8, null, null);
            t tVar2 = this.f4754p;
            tVar2.sendMessage(tVar2.obtainMessage(1, i7, -1, wVar));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f4748G.get();
            w wVar2 = new w(this, 8, null, null);
            t tVar22 = this.f4754p;
            tVar22.sendMessage(tVar22.obtainMessage(1, i72, -1, wVar2));
        }
    }

    @Override // M1.c
    public final void h() {
        this.f4748G.incrementAndGet();
        synchronized (this.f4759v) {
            try {
                int size = this.f4759v.size();
                for (int i4 = 0; i4 < size; i4++) {
                    p pVar = (p) this.f4759v.get(i4);
                    synchronized (pVar) {
                        pVar.f1469a = null;
                    }
                }
                this.f4759v.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4756r) {
            this.s = null;
        }
        w(1, null);
    }

    @Override // M1.c
    public final void i(String str) {
        this.f4750l = str;
        h();
    }

    @Override // M1.c
    public boolean j() {
        return false;
    }

    @Override // M1.c
    public final void k(InterfaceC0062b interfaceC0062b) {
        this.f4757t = interfaceC0062b;
        w(2, null);
    }

    @Override // M1.c
    public final void l(o oVar) {
        ((N1.o) oVar.f1009m).f1301o.f1277x.post(new b(2, oVar));
    }

    public abstract IInterface n(IBinder iBinder);

    public L1.c[] o() {
        return f4741I;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f4755q) {
            try {
                if (this.f4760x == 5) {
                    throw new DeadObjectException();
                }
                if (!c()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f4758u;
                s.e(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return m() >= 211700000;
    }

    public void u() {
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [B2.D, java.lang.Object] */
    public final void w(int i4, IInterface iInterface) {
        D d4;
        if ((i4 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f4755q) {
            try {
                this.f4760x = i4;
                this.f4758u = iInterface;
                if (i4 == 1) {
                    v vVar = this.w;
                    if (vVar != null) {
                        C c4 = this.f4753o;
                        String str = (String) this.f4751m.f116b;
                        s.d(str);
                        this.f4751m.getClass();
                        if (this.f4743B == null) {
                            this.f4752n.getClass();
                        }
                        c4.a(str, vVar, this.f4751m.f115a);
                        this.w = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    v vVar2 = this.w;
                    if (vVar2 != null && (d4 = this.f4751m) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) d4.f116b) + " on com.google.android.gms");
                        C c5 = this.f4753o;
                        String str2 = (String) this.f4751m.f116b;
                        s.d(str2);
                        this.f4751m.getClass();
                        if (this.f4743B == null) {
                            this.f4752n.getClass();
                        }
                        c5.a(str2, vVar2, this.f4751m.f115a);
                        this.f4748G.incrementAndGet();
                    }
                    v vVar3 = new v(this, this.f4748G.get());
                    this.w = vVar3;
                    String s = s();
                    boolean t4 = t();
                    ?? obj = new Object();
                    obj.f116b = s;
                    obj.f115a = t4;
                    this.f4751m = obj;
                    if (t4 && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f4751m.f116b)));
                    }
                    C c6 = this.f4753o;
                    String str3 = (String) this.f4751m.f116b;
                    s.d(str3);
                    this.f4751m.getClass();
                    String str4 = this.f4743B;
                    if (str4 == null) {
                        str4 = this.f4752n.getClass().getName();
                    }
                    if (!c6.b(new z(str3, this.f4751m.f115a), vVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f4751m.f116b) + " on com.google.android.gms");
                        int i5 = this.f4748G.get();
                        x xVar = new x(this, 16);
                        t tVar = this.f4754p;
                        tVar.sendMessage(tVar.obtainMessage(7, i5, -1, xVar));
                    }
                } else if (i4 == 4) {
                    s.d(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
