package p025F1;

/* renamed from: F1.e */
/* loaded from: classes.dex */
public final class C0213e implements p025F1.InterfaceC0216h {

    /* renamed from: a */
    public final android.content.Context f599a;

    /* renamed from: b */
    public final p025F1.C0212d f600b;

    /* renamed from: c */
    public final p096Y1.C0891b f601c;

    /* renamed from: d */
    public final p025F1.C0222n f602d;

    /* renamed from: e */
    public final int f603e;

    /* renamed from: f */
    public final p025F1.C0218j f604f;

    /* renamed from: g */
    public p022E1.InterfaceC0195a f605g;

    /* renamed from: h */
    public p025F1.InterfaceC0223o f606h;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.b, M1.f] */
    public C0213e(android.content.Context context, p025F1.C0218j c0218j) {
        int nextInt;
        this.f599a = context;
        int i4 = p104a2.AbstractC1004b.f3726a;
        this.f601c = new p050M1.AbstractC0422f(context, p096Y1.C0891b.f3191i, p050M1.InterfaceC0418b.f1197a, p050M1.C0421e.f1199b);
        this.f604f = c0218j;
        this.f602d = new p025F1.C0222n(context, c0218j);
        synchronized (this) {
            nextInt = new java.security.SecureRandom().nextInt(65536);
        }
        this.f603e = nextInt;
        this.f600b = new p025F1.C0212d(this, c0218j, context);
    }

    /* renamed from: g */
    public static com.google.android.gms.location.LocationRequest m570g(p025F1.C0218j c0218j) {
        float f4;
        long j4;
        long j5;
        long j6;
        int i4 = 104;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            p058O1.AbstractC0515s.m1014a("intervalMillis must be greater than or equal to 0", 0 >= 0);
            if (c0218j != null) {
                int m781b = p044L.AbstractC0352j.m781b(c0218j.f620a);
                if (m781b == 0) {
                    i4 = 105;
                } else if (m781b != 1) {
                    i4 = m781b != 2 ? 100 : 102;
                }
                p104a2.AbstractC1012j.m2035a(i4);
                j5 = c0218j.f622c;
                p058O1.AbstractC0515s.m1014a("intervalMillis must be greater than or equal to 0", j5 >= 0);
                p058O1.AbstractC0515s.m1014a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j5 == -1 || j5 >= 0);
                float f5 = (float) c0218j.f621b;
                p058O1.AbstractC0515s.m1014a("minUpdateDistanceMeters must be greater than or equal to 0", f5 >= 0.0f);
                f4 = f5;
                j4 = j5;
            } else {
                f4 = 0.0f;
                i4 = 102;
                j4 = 0;
                j5 = -1;
            }
            if (j5 == -1) {
                j6 = j4;
            } else {
                if (i4 != 105) {
                    j5 = java.lang.Math.min(j5, j4);
                }
                j6 = j5;
            }
            return new com.google.android.gms.location.LocationRequest(i4, j4, j6, java.lang.Math.max(0L, j4), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, f4, true, -1 == -1 ? j4 : -1L, 0, 0, false, new android.os.WorkSource(null), null);
        }
        com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new android.os.WorkSource(), null);
        if (c0218j != null) {
            int m781b2 = p044L.AbstractC0352j.m781b(c0218j.f620a);
            if (m781b2 == 0) {
                i4 = 105;
            } else if (m781b2 != 1) {
                i4 = m781b2 != 2 ? 100 : 102;
            }
            p104a2.AbstractC1012j.m2035a(i4);
            locationRequest.f4943l = i4;
            long j7 = c0218j.f622c;
            p058O1.AbstractC0515s.m1014a("intervalMillis must be greater than or equal to 0", j7 >= 0);
            long j8 = locationRequest.f4945n;
            long j9 = locationRequest.f4944m;
            if (j8 == j9 / 6) {
                locationRequest.f4945n = j7 / 6;
            }
            if (locationRequest.f4951t == j9) {
                locationRequest.f4951t = j7;
            }
            locationRequest.f4944m = j7;
            long j10 = j7 / 2;
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j10)};
            if (!(j10 >= 0)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("illegal fastest interval: %d", objArr));
            }
            locationRequest.f4945n = j10;
            float f6 = (float) c0218j.f621b;
            if (f6 < 0.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(f6).length() + 22);
                sb.append("invalid displacement: ");
                sb.append(f6);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            locationRequest.f4949r = f6;
        }
        return locationRequest;
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: a */
    public final void mo571a(p017D1.C0173f c0173f, p017D1.C0173f c0173f2) {
        p096Y1.C0891b c0891b = this.f601c;
        c0891b.getClass();
        p009B2.C0034E c0034e = new p009B2.C0034E();
        c0034e.f121b = true;
        c0034e.f123d = p046L1.C0363g.f1110n;
        c0034e.f122c = 2414;
        p119d2.C1290i m899c = c0891b.m899c(0, c0034e.m121a());
        p009B2.C0067x c0067x = new p009B2.C0067x(4, c0173f);
        m899c.getClass();
        p054N1.ExecutorC0457l executorC0457l = p119d2.AbstractC1286e.f5162a;
        p119d2.C1288g c1288g = new p119d2.C1288g(executorC0457l, c0067x);
        p096Y1.C0890a c0890a = m899c.f5169b;
        c0890a.m1731e(c1288g);
        m899c.m3029f();
        c0890a.m1731e(new p119d2.C1288g(executorC0457l, (p119d2.InterfaceC1283b) new p009B2.C0067x(5, c0173f2)));
        m899c.m3029f();
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: b */
    public final void mo572b(final p009B2.AbstractActivityC0047d abstractActivityC0047d, p025F1.InterfaceC0223o interfaceC0223o, final p022E1.InterfaceC0195a interfaceC0195a) {
        this.f606h = interfaceC0223o;
        this.f605g = interfaceC0195a;
        com.google.android.gms.location.LocationRequest m570g = m570g(this.f604f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m570g);
        p104a2.C1005c c1005c = new p104a2.C1005c(arrayList, false, false);
        int i4 = p104a2.AbstractC1004b.f3726a;
        p050M1.AbstractC0422f abstractC0422f = new p050M1.AbstractC0422f(this.f599a, p096Y1.C0891b.f3191i, p050M1.InterfaceC0418b.f1197a, p050M1.C0421e.f1199b);
        p009B2.C0034E c0034e = new p009B2.C0034E();
        c0034e.f121b = true;
        c0034e.f123d = new p043K2.C0339o(17, c1005c);
        c0034e.f122c = 2426;
        p119d2.C1290i m899c = abstractC0422f.m899c(0, c0034e.m121a());
        p009B2.C0067x c0067x = new p009B2.C0067x(3, this);
        m899c.getClass();
        p054N1.ExecutorC0457l executorC0457l = p119d2.AbstractC1286e.f5162a;
        p119d2.C1288g c1288g = new p119d2.C1288g(executorC0457l, c0067x);
        p096Y1.C0890a c0890a = m899c.f5169b;
        c0890a.m1731e(c1288g);
        m899c.m3029f();
        c0890a.m1731e(new p119d2.C1288g(executorC0457l, new p119d2.InterfaceC1283b() { // from class: F1.c
            @Override // p119d2.InterfaceC1283b
            /* renamed from: g */
            public final void mo288g(java.lang.Exception exc) {
                p025F1.C0213e c0213e = p025F1.C0213e.this;
                c0213e.getClass();
                boolean z4 = exc instanceof p050M1.C0426j;
                p022E1.InterfaceC0195a interfaceC0195a2 = interfaceC0195a;
                if (!z4) {
                    if (((p050M1.C0420d) exc).f1198l.f4910l == 8502) {
                        c0213e.m576h(c0213e.f604f);
                        return;
                    } else {
                        interfaceC0195a2.mo530c(3);
                        return;
                    }
                }
                p009B2.AbstractActivityC0047d abstractActivityC0047d2 = abstractActivityC0047d;
                if (abstractActivityC0047d2 == null) {
                    interfaceC0195a2.mo530c(3);
                    return;
                }
                com.google.android.gms.common.api.Status status = ((p050M1.C0426j) exc).f1198l;
                if (status.f4910l != 6) {
                    interfaceC0195a2.mo530c(3);
                    return;
                }
                try {
                    int i5 = c0213e.f603e;
                    android.app.PendingIntent pendingIntent = status.f4912n;
                    if (pendingIntent != null) {
                        p058O1.AbstractC0515s.m1017d(pendingIntent);
                        abstractActivityC0047d2.startIntentSenderForResult(pendingIntent.getIntentSender(), i5, null, 0, 0, 0);
                    }
                } catch (android.content.IntentSender.SendIntentException unused) {
                    interfaceC0195a2.mo530c(3);
                }
            }
        }));
        m899c.m3029f();
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: c */
    public final boolean mo573c(int i4, int i5) {
        if (i4 == this.f603e) {
            if (i5 == -1) {
                p025F1.C0218j c0218j = this.f604f;
                if (c0218j == null || this.f606h == null || this.f605g == null) {
                    return false;
                }
                m576h(c0218j);
                return true;
            }
            p022E1.InterfaceC0195a interfaceC0195a = this.f605g;
            if (interfaceC0195a != null) {
                interfaceC0195a.mo530c(3);
            }
        }
        return false;
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: d */
    public final void mo574d() {
        android.location.LocationManager locationManager;
        p025F1.C0222n c0222n = this.f602d;
        if (c0222n.f630c != null && (locationManager = c0222n.f629b) != null) {
            locationManager.removeNmeaListener(c0222n.f631d);
            locationManager.unregisterGnssStatusCallback(c0222n.f632e);
            c0222n.f637j = false;
        }
        this.f601c.m1733d(this.f600b);
    }

    @Override // p025F1.InterfaceC0216h
    /* renamed from: f */
    public final void mo575f(p009B2.C0061r c0061r) {
        int i4 = p104a2.AbstractC1004b.f3726a;
        p050M1.AbstractC0422f abstractC0422f = new p050M1.AbstractC0422f(this.f599a, p096Y1.C0891b.f3191i, p050M1.InterfaceC0418b.f1197a, p050M1.C0421e.f1199b);
        p104a2.C1005c c1005c = new p104a2.C1005c(new java.util.ArrayList(), false, false);
        p009B2.C0034E c0034e = new p009B2.C0034E();
        c0034e.f121b = true;
        c0034e.f123d = new p043K2.C0339o(17, c1005c);
        c0034e.f122c = 2426;
        p119d2.C1290i m899c = abstractC0422f.m899c(0, c0034e.m121a());
        p009B2.C0067x c0067x = new p009B2.C0067x(2, c0061r);
        m899c.getClass();
        m899c.f5169b.m1731e(new p119d2.C1288g((java.util.concurrent.Executor) p119d2.AbstractC1286e.f5162a, (p119d2.InterfaceC1282a) c0067x));
        m899c.m3029f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [W.p, java.lang.Object] */
    /* renamed from: h */
    public final void m576h(p025F1.C0218j c0218j) {
        com.google.android.gms.location.LocationRequest m570g = m570g(c0218j);
        this.f602d.m608b();
        p096Y1.C0891b c0891b = this.f601c;
        p025F1.C0212d c0212d = this.f600b;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        c0891b.getClass();
        if (mainLooper == null) {
            mainLooper = android.os.Looper.myLooper();
            p058O1.AbstractC0515s.m1018e(mainLooper, "invalid null looper");
        }
        java.lang.String simpleName = p025F1.C0212d.class.getSimpleName();
        p058O1.AbstractC0515s.m1018e(c0212d, "Listener must not be null");
        p054N1.C0453h c0453h = new p054N1.C0453h(mainLooper, c0212d, simpleName);
        ?? obj = new java.lang.Object();
        obj.f3190n = c0891b;
        obj.f3188l = true;
        obj.f3189m = c0453h;
        p094Y.C0886x c0886x = new p094Y.C0886x(1, (java.lang.Object) obj, m570g);
        ?? obj2 = new java.lang.Object();
        obj2.f2775b = c0886x;
        obj2.f2776c = obj;
        obj2.f2777d = c0453h;
        obj2.f2774a = 2436;
        p054N1.C0452g c0452g = c0453h.f1327c;
        p058O1.AbstractC0515s.m1018e(c0452g, "Key must not be null");
        p054N1.C0453h c0453h2 = (p054N1.C0453h) obj2.f2777d;
        int i4 = obj2.f2774a;
        p008B1.C0026d c0026d = new p008B1.C0026d((p086W.C0796p) obj2, c0453h2, i4);
        p043K2.C0339o c0339o = new p043K2.C0339o((p086W.C0796p) obj2, c0452g);
        p058O1.AbstractC0515s.m1018e(c0453h2.f1327c, "Listener has already been released.");
        p054N1.C0449d c0449d = c0891b.f1208h;
        c0449d.getClass();
        p119d2.C1285d c1285d = new p119d2.C1285d();
        c0449d.m957e(c1285d, i4, c0891b);
        p054N1.C0469x c0469x = new p054N1.C0469x(new p054N1.C0443B(new p054N1.C0470y(c0026d, c0339o), c1285d), c0449d.f1317t.get(), c0891b);
        p088W1.HandlerC0820f handlerC0820f = c0449d.f1321x;
        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(8, c0469x));
    }
}
