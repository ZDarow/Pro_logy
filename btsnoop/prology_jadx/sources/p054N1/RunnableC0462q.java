package p054N1;

/* renamed from: N1.q */
/* loaded from: classes.dex */
public final class RunnableC0462q implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1348l;

    /* renamed from: m */
    public java.lang.Object f1349m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f1350n;

    public /* synthetic */ RunnableC0462q(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f1348l = i4;
        this.f1350n = obj;
        this.f1349m = obj2;
    }

    /* renamed from: a */
    private final void m974a() {
        synchronized (((p119d2.C1288g) this.f1350n).f5165b) {
            ((p119d2.InterfaceC1282a) ((p119d2.C1288g) this.f1350n).f5167d).mo107f((p119d2.C1290i) this.f1349m);
        }
    }

    /* renamed from: b */
    private final void m975b() {
        java.lang.Exception exc;
        synchronized (((p119d2.C1288g) this.f1350n).f5165b) {
            p119d2.InterfaceC1283b interfaceC1283b = (p119d2.InterfaceC1283b) ((p119d2.C1288g) this.f1350n).f5167d;
            p119d2.C1290i c1290i = (p119d2.C1290i) this.f1349m;
            synchronized (c1290i.f5168a) {
                exc = c1290i.f5173f;
            }
            p058O1.AbstractC0515s.m1017d(exc);
            interfaceC1283b.mo288g(exc);
        }
    }

    /* renamed from: c */
    private final void m976c() {
        synchronized (((p119d2.C1288g) this.f1350n).f5165b) {
            p009B2.C0067x c0067x = (p009B2.C0067x) ((p119d2.C1288g) this.f1350n).f5167d;
            java.lang.Object m3024a = ((p119d2.C1290i) this.f1349m).m3024a();
            switch (c0067x.f218l) {
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    p025F1.C0213e c0213e = (p025F1.C0213e) c0067x.f219m;
                    c0213e.m576h(c0213e.f604f);
                    break;
                default:
                    ((p017D1.C0173f) c0067x.f219m).mo529a((android.location.Location) m3024a);
                    break;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p209w3.C2347i c2347i;
        p058O1.InterfaceC0502f interfaceC0502f;
        p022E1.InterfaceC0195a interfaceC0195a;
        p054N1.C0452g c0452g;
        java.util.Set set;
        p129f2.C1408Y c1408y;
        android.location.Location location = null;
        p058O1.InterfaceC0502f interfaceC0502f2 = null;
        switch (this.f1348l) {
            case 0:
                p054N1.C0463r c0463r = (p054N1.C0463r) this.f1350n;
                p054N1.C0460o c0460o = (p054N1.C0460o) ((p054N1.C0449d) c0463r.f1356f).f1318u.get((p054N1.C0447b) c0463r.f1353c);
                if (c0460o == null) {
                    return;
                }
                p046L1.C0357a c0357a = (p046L1.C0357a) this.f1349m;
                if ((c0357a.f1094m == 0 ? 1 : 0) == 0) {
                    c0460o.m971l(c0357a, null);
                    return;
                }
                c0463r.f1351a = true;
                p050M1.InterfaceC0419c interfaceC0419c = (p050M1.InterfaceC0419c) c0463r.f1352b;
                if (interfaceC0419c.mo893j()) {
                    if (!c0463r.f1351a || (interfaceC0502f = (p058O1.InterfaceC0502f) c0463r.f1354d) == null) {
                        return;
                    }
                    interfaceC0419c.mo890g(interfaceC0502f, (java.util.Set) c0463r.f1355e);
                    return;
                }
                try {
                    interfaceC0419c.mo890g(null, interfaceC0419c.mo889f());
                    return;
                } catch (java.lang.SecurityException e4) {
                    android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    interfaceC0419c.mo892i("Failed to get service from broker.");
                    c0460o.m971l(new p046L1.C0357a(10), null);
                    return;
                }
            case 1:
                p054N1.C0453h c0453h = (p054N1.C0453h) this.f1349m;
                p043K2.C0339o c0339o = (p043K2.C0339o) this.f1350n;
                java.lang.Object obj = c0453h.f1326b;
                if (obj == null) {
                    return;
                }
                switch (c0339o.f1047l) {
                    case 18:
                        p025F1.C0212d c0212d = (p025F1.C0212d) obj;
                        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) c0339o.f1048m;
                        synchronized (c0212d) {
                            if (c0212d.f598c.f606h == null) {
                                android.util.Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                                p025F1.C0213e c0213e = c0212d.f598c;
                                c0213e.f601c.m1733d(c0213e.f600b);
                                p022E1.InterfaceC0195a interfaceC0195a2 = c0212d.f598c.f605g;
                                if (interfaceC0195a2 != null) {
                                    interfaceC0195a2.mo530c(2);
                                }
                                return;
                            }
                            java.util.List list = locationResult.f4958l;
                            int size = list.size();
                            if (size != 0) {
                                location = (android.location.Location) list.get(size - 1);
                            }
                            if (location == null) {
                                return;
                            }
                            if (location.getExtras() == null) {
                                location.setExtras(android.os.Bundle.EMPTY);
                            }
                            if (c0212d.f596a != null) {
                                location.getExtras().putBoolean("geolocator_use_mslAltitude", c0212d.f596a.f623d);
                            }
                            c0212d.f598c.f602d.m607a(location);
                            c0212d.f598c.f606h.mo529a(location);
                            return;
                        }
                    case 19:
                        p025F1.C0212d c0212d2 = (p025F1.C0212d) obj;
                        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) c0339o.f1048m;
                        synchronized (c0212d2) {
                            if (locationAvailability.f4941o >= 1000) {
                                r1 = false;
                            }
                            if (!r1) {
                                p025F1.C0213e c0213e2 = c0212d2.f598c;
                                android.content.Context context = c0212d2.f597b;
                                c0213e2.getClass();
                                if (!p025F1.InterfaceC0216h.m604e(context) && (interfaceC0195a = c0212d2.f598c.f605g) != null) {
                                    interfaceC0195a.mo530c(3);
                                }
                            }
                        }
                        return;
                    default:
                        p096Y1.C0890a c0890a = ((p096Y1.BinderC0897h) c0339o.f1048m).f3200d;
                        synchronized (c0890a) {
                            c0890a.f3188l = false;
                            c0452g = ((p054N1.C0453h) c0890a.f3189m).f1327c;
                        }
                        if (c0452g != null) {
                            ((p096Y1.C0891b) c0890a.f3190n).m898b(c0452g, 2441);
                            return;
                        }
                        return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p114c2.C1251f c1251f = (p114c2.C1251f) this.f1349m;
                p046L1.C0357a c0357a2 = c1251f.f4878m;
                r1 = c0357a2.f1094m == 0;
                p054N1.BinderC0442A binderC0442A = (p054N1.BinderC0442A) this.f1350n;
                if (r1) {
                    p058O1.C0511o c0511o = c1251f.f4879n;
                    p058O1.AbstractC0515s.m1017d(c0511o);
                    p046L1.C0357a c0357a3 = c0511o.f1517n;
                    if (c0357a3.f1094m != 0) {
                        android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(java.lang.String.valueOf(c0357a3)), new java.lang.Exception());
                        binderC0442A.f1288j.m979c(c0357a3);
                        binderC0442A.f1287i.mo891h();
                        return;
                    }
                    p054N1.C0463r c0463r2 = binderC0442A.f1288j;
                    android.os.IBinder iBinder = c0511o.f1516m;
                    if (iBinder != null) {
                        int i4 = p058O1.AbstractBinderC0497a.f1461d;
                        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0502f2 = queryLocalInterface instanceof p058O1.InterfaceC0502f ? (p058O1.InterfaceC0502f) queryLocalInterface : new p058O1.C0496D(iBinder);
                    }
                    c0463r2.getClass();
                    if (interfaceC0502f2 == null || (set = binderC0442A.f1285g) == null) {
                        android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
                        c0463r2.m979c(new p046L1.C0357a(4));
                    } else {
                        c0463r2.f1354d = interfaceC0502f2;
                        c0463r2.f1355e = set;
                        if (c0463r2.f1351a) {
                            ((p050M1.InterfaceC0419c) c0463r2.f1352b).mo890g(interfaceC0502f2, set);
                        }
                    }
                } else {
                    binderC0442A.f1288j.m979c(c0357a2);
                }
                binderC0442A.f1287i.mo891h();
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p064Q.C0539k c0539k = (p064Q.C0539k) this.f1350n;
                java.util.ArrayList arrayList = (java.util.ArrayList) c0539k.f1581a;
                boolean isEmpty = arrayList.isEmpty();
                android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = (android.support.v4.media.session.MediaSessionCompat$Token) this.f1349m;
                if (!isEmpty) {
                    android.support.v4.media.session.InterfaceC1045d m2098d = mediaSessionCompat$Token.m2098d();
                    if (m2098d != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((android.os.Bundle) it.next()).putBinder("extra_session_binder", m2098d.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((p064Q.C0538j) c0539k.f1582b).setSessionToken((android.media.session.MediaSession.Token) mediaSessionCompat$Token.f3800m);
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                if (((p119d2.C1290i) this.f1349m).f5171d) {
                    p119d2.C1290i c1290i = ((p119d2.C1287f) this.f1350n).f5163a;
                    synchronized (c1290i.f5168a) {
                        try {
                            if (!c1290i.f5170c) {
                                c1290i.f5170c = true;
                                c1290i.f5171d = true;
                                c1290i.f5169b.m1732f(c1290i);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                try {
                    ((p119d2.C1287f) this.f1350n).getClass();
                    ((p119d2.C1287f) this.f1350n).f5163a.m3027d(null);
                    return;
                } catch (p119d2.C1284c e5) {
                    if (e5.getCause() instanceof java.lang.Exception) {
                        ((p119d2.C1287f) this.f1350n).f5163a.m3026c((java.lang.Exception) e5.getCause());
                        return;
                    } else {
                        ((p119d2.C1287f) this.f1350n).f5163a.m3026c(e5);
                        return;
                    }
                } catch (java.lang.Exception e6) {
                    ((p119d2.C1287f) this.f1350n).f5163a.m3026c(e6);
                    return;
                }
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                m974a();
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                m975b();
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                m976c();
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                p145j.C1663i c1663i = (p145j.C1663i) this.f1350n;
                p140i.MenuC1517i menuC1517i = c1663i.f6939n;
                if (menuC1517i != null && (c1408y = menuC1517i.f6276e) != null) {
                    ((androidx.appcompat.widget.ActionMenuView) c1408y.f5729m).getClass();
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = c1663i.f6943r;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    p145j.C1657f c1657f = (p145j.C1657f) this.f1349m;
                    if (!c1657f.m3391b()) {
                        if (c1657f.f6326e != null) {
                            c1657f.m3393d(0, 0, false, false);
                        }
                    }
                    c1663i.f6932C = c1657f;
                }
                c1663i.f6934E = null;
                return;
            case 9:
                break;
            case 10:
                p073S0.C0629g c0629g = (p073S0.C0629g) ((p129f2.C1408Y) this.f1349m).f5729m;
                if (c0629g != null) {
                    c0629g.m1147e((android.graphics.Typeface) this.f1350n);
                    return;
                }
                return;
            default:
                ((p219z.C2434e) this.f1349m).accept(this.f1350n);
                return;
        }
        do {
            try {
                ((java.lang.Runnable) this.f1349m).run();
            } catch (java.lang.Throwable th) {
                p187r3.AbstractC2131v.m4245d(p110b3.C1196j.f4623l, th);
            }
            c2347i = (p209w3.C2347i) this.f1350n;
            java.lang.Runnable m4556g = c2347i.m4556g();
            if (m4556g == null) {
                return;
            }
            this.f1349m = m4556g;
            r2++;
        } while (r2 < 16);
        p218y3.C2428k c2428k = c2347i.f9285n;
        c2428k.getClass();
        c2428k.mo4159e(c2347i, this);
    }

    public /* synthetic */ RunnableC0462q(java.lang.Object obj, java.lang.Object obj2, int i4, boolean z4) {
        this.f1348l = i4;
        this.f1349m = obj;
        this.f1350n = obj2;
    }
}
