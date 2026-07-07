package p054N1;

/* renamed from: N1.d */
/* loaded from: classes.dex */
public final class C0449d implements android.os.Handler.Callback {

    /* renamed from: C */
    public static p054N1.C0449d f1307C;

    /* renamed from: l */
    public long f1309l;

    /* renamed from: m */
    public boolean f1310m;

    /* renamed from: n */
    public p058O1.C0506j f1311n;

    /* renamed from: o */
    public p066Q1.C0562c f1312o;

    /* renamed from: p */
    public final android.content.Context f1313p;

    /* renamed from: q */
    public final p046L1.C0360d f1314q;

    /* renamed from: r */
    public final p008B1.C0026d f1315r;

    /* renamed from: s */
    public final java.util.concurrent.atomic.AtomicInteger f1316s;

    /* renamed from: t */
    public final java.util.concurrent.atomic.AtomicInteger f1317t;

    /* renamed from: u */
    public final java.util.concurrent.ConcurrentHashMap f1318u;

    /* renamed from: v */
    public final p165n.C1879f f1319v;

    /* renamed from: w */
    public final p165n.C1879f f1320w;

    /* renamed from: x */
    public final p088W1.HandlerC0820f f1321x;

    /* renamed from: y */
    public volatile boolean f1322y;

    /* renamed from: z */
    public static final com.google.android.gms.common.api.Status f1308z = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: A */
    public static final com.google.android.gms.common.api.Status f1305A = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: B */
    public static final java.lang.Object f1306B = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Handler, W1.f] */
    public C0449d(android.content.Context context, android.os.Looper looper) {
        p046L1.C0360d c0360d = p046L1.C0360d.f1104c;
        this.f1309l = 10000L;
        this.f1310m = false;
        this.f1316s = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f1317t = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f1318u = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
        this.f1319v = new p165n.C1879f(0);
        this.f1320w = new p165n.C1879f(0);
        this.f1322y = true;
        this.f1313p = context;
        ?? handler = new android.os.Handler(looper, this);
        android.os.Looper.getMainLooper();
        this.f1321x = handler;
        this.f1314q = c0360d;
        this.f1315r = new p008B1.C0026d(26);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (p080U1.AbstractC0748a.f2607f == null) {
            p080U1.AbstractC0748a.f2607f = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p080U1.AbstractC0748a.f2607f.booleanValue()) {
            this.f1322y = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: c */
    public static com.google.android.gms.common.api.Status m952c(p054N1.C0447b c0447b, p046L1.C0357a c0357a) {
        return new com.google.android.gms.common.api.Status(17, "API: " + ((java.lang.String) c0447b.f1297b.f100n) + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(c0357a), c0357a.f1095n, c0357a);
    }

    /* renamed from: f */
    public static p054N1.C0449d m953f(android.content.Context context) {
        p054N1.C0449d c0449d;
        android.os.HandlerThread handlerThread;
        synchronized (f1306B) {
            if (f1307C == null) {
                synchronized (p058O1.C0495C.f1451g) {
                    try {
                        handlerThread = p058O1.C0495C.f1453i;
                        if (handlerThread == null) {
                            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
                            p058O1.C0495C.f1453i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = p058O1.C0495C.f1453i;
                        }
                    } finally {
                    }
                }
                android.os.Looper looper = handlerThread.getLooper();
                android.content.Context applicationContext = context.getApplicationContext();
                java.lang.Object obj = p046L1.C0360d.f1103b;
                f1307C = new p054N1.C0449d(applicationContext, looper);
            }
            c0449d = f1307C;
        }
        return c0449d;
    }

    /* renamed from: a */
    public final boolean m954a() {
        if (this.f1310m) {
            return false;
        }
        p058O1.C0505i c0505i = (p058O1.C0505i) p058O1.C0504h.m1003b().f1497a;
        if (c0505i != null && !c0505i.f1499m) {
            return false;
        }
        int i4 = ((android.util.SparseIntArray) this.f1315r.f99m).get(203400000, -1);
        return i4 == -1 || i4 == 0;
    }

    /* renamed from: b */
    public final boolean m955b(p046L1.C0357a c0357a, int i4) {
        boolean z4;
        android.app.PendingIntent activity;
        java.lang.Boolean bool;
        p046L1.C0360d c0360d = this.f1314q;
        android.content.Context context = this.f1313p;
        c0360d.getClass();
        synchronized (p080U1.AbstractC0748a.class) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = p080U1.AbstractC0748a.f2602a;
            if (context2 != null && (bool = p080U1.AbstractC0748a.f2603b) != null && context2 == applicationContext) {
                z4 = bool.booleanValue();
            }
            p080U1.AbstractC0748a.f2603b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            p080U1.AbstractC0748a.f2603b = java.lang.Boolean.valueOf(isInstantApp);
            p080U1.AbstractC0748a.f2602a = applicationContext;
            z4 = isInstantApp;
        }
        if (z4) {
            return false;
        }
        int i5 = c0357a.f1094m;
        if (i5 == 0 || (activity = c0357a.f1095n) == null) {
            android.content.Intent m810a = c0360d.m810a(context, i5, null);
            activity = m810a != null ? android.app.PendingIntent.getActivity(context, 0, m810a, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i6 = c0357a.f1094m;
        int i7 = com.google.android.gms.common.api.GoogleApiActivity.f4906m;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", true);
        c0360d.m808f(context, i6, android.app.PendingIntent.getActivity(context, 0, intent, p088W1.AbstractC0819e.f2914a | 134217728));
        return true;
    }

    /* renamed from: d */
    public final p054N1.C0460o m956d(p050M1.AbstractC0422f abstractC0422f) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f1318u;
        p054N1.C0447b c0447b = abstractC0422f.f1205e;
        p054N1.C0460o c0460o = (p054N1.C0460o) concurrentHashMap.get(c0447b);
        if (c0460o == null) {
            c0460o = new p054N1.C0460o(this, abstractC0422f);
            concurrentHashMap.put(c0447b, c0460o);
        }
        if (c0460o.f1334d.mo893j()) {
            this.f1320w.add(c0447b);
        }
        c0460o.m969j();
        return c0460o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m957e(p119d2.C1285d r9, int r10, p050M1.AbstractC0422f r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L83
            N1.b r3 = r11.f1205e
            boolean r11 = r8.m954a()
            if (r11 != 0) goto Lb
            goto L47
        Lb:
            O1.h r11 = p058O1.C0504h.m1003b()
            java.lang.Object r11 = r11.f1497a
            O1.i r11 = (p058O1.C0505i) r11
            r0 = 1
            if (r11 == 0) goto L49
            boolean r1 = r11.f1499m
            if (r1 == 0) goto L47
            java.util.concurrent.ConcurrentHashMap r1 = r8.f1318u
            java.lang.Object r1 = r1.get(r3)
            N1.o r1 = (p054N1.C0460o) r1
            if (r1 == 0) goto L44
            M1.c r2 = r1.f1334d
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.AbstractC1253a
            if (r4 == 0) goto L47
            com.google.android.gms.common.internal.a r2 = (com.google.android.gms.common.internal.AbstractC1253a) r2
            O1.y r4 = r2.f4920F
            if (r4 == 0) goto L44
            boolean r4 = r2.mo884a()
            if (r4 != 0) goto L44
            O1.d r11 = p054N1.C0467v.m981a(r1, r2, r10)
            if (r11 == 0) goto L47
            int r2 = r1.f1344n
            int r2 = r2 + r0
            r1.f1344n = r2
            boolean r0 = r11.f1466n
            goto L49
        L44:
            boolean r0 = r11.f1500n
            goto L49
        L47:
            r10 = 0
            goto L65
        L49:
            N1.v r11 = new N1.v
            r1 = 0
            if (r0 == 0) goto L54
            long r4 = java.lang.System.currentTimeMillis()
            goto L55
        L54:
            r4 = r1
        L55:
            if (r0 == 0) goto L5d
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L5e
        L5d:
            r6 = r1
        L5e:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L65:
            if (r10 == 0) goto L83
            d2.i r9 = r9.f5161a
            W1.f r11 = r8.f1321x
            r11.getClass()
            N1.l r0 = new N1.l
            r0.<init>(r11)
            r9.getClass()
            d2.g r11 = new d2.g
            r11.<init>(r0, r10)
            Y1.a r10 = r9.f5169b
            r10.m1731e(r11)
            r9.m3029f()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054N1.C0449d.m957e(d2.d, int, M1.f):void");
    }

    /* renamed from: g */
    public final void m958g(p046L1.C0357a c0357a, int i4) {
        if (m955b(c0357a, i4)) {
            return;
        }
        p088W1.HandlerC0820f handlerC0820f = this.f1321x;
        handlerC0820f.sendMessage(handlerC0820f.obtainMessage(5, i4, 0, c0357a));
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [Q1.c, M1.f] */
    /* JADX WARN: Type inference failed for: r3v24, types: [Q1.c, M1.f] */
    /* JADX WARN: Type inference failed for: r4v12, types: [Q1.c, M1.f] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        p054N1.C0460o c0460o;
        p046L1.C0359c[] mo945b;
        int i4 = 11;
        int i5 = message.what;
        switch (i5) {
            case 1:
                this.f1309l = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f1321x.removeMessages(12);
                for (p054N1.C0447b c0447b : this.f1318u.keySet()) {
                    p088W1.HandlerC0820f handlerC0820f = this.f1321x;
                    handlerC0820f.sendMessageDelayed(handlerC0820f.obtainMessage(12, c0447b), this.f1309l);
                }
                return true;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                message.obj.getClass();
                throw new java.lang.ClassCastException();
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                for (p054N1.C0460o c0460o2 : this.f1318u.values()) {
                    p058O1.AbstractC0515s.m1015b(c0460o2.f1345o.f1321x);
                    c0460o2.f1343m = null;
                    c0460o2.m969j();
                }
                return true;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                p054N1.C0469x c0469x = (p054N1.C0469x) message.obj;
                p054N1.C0460o c0460o3 = (p054N1.C0460o) this.f1318u.get(c0469x.f1371c.f1205e);
                if (c0460o3 == null) {
                    c0460o3 = m956d(c0469x.f1371c);
                }
                if (!c0460o3.f1334d.mo893j() || this.f1317t.get() == c0469x.f1370b) {
                    c0460o3.m970k(c0469x.f1369a);
                } else {
                    c0469x.f1369a.mo946c(f1308z);
                    c0460o3.m973n();
                }
                return true;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                int i6 = message.arg1;
                p046L1.C0357a c0357a = (p046L1.C0357a) message.obj;
                java.util.Iterator it = this.f1318u.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0460o = (p054N1.C0460o) it.next();
                        if (c0460o.f1339i == i6) {
                        }
                    } else {
                        c0460o = null;
                    }
                }
                if (c0460o != null) {
                    int i7 = c0357a.f1094m;
                    if (i7 == 13) {
                        this.f1314q.getClass();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p046L1.AbstractC0362f.f1106a;
                        c0460o.m961b(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + p046L1.C0357a.m803d(i7) + ": " + c0357a.f1096o, null, null));
                    } else {
                        c0460o.m961b(m952c(c0460o.f1335e, c0357a));
                    }
                } else {
                    android.util.Log.wtf("GoogleApiManager", p009B2.AbstractC0051h.m151j(i6, "Could not find API instance ", " while trying to fail enqueued calls."), new java.lang.Exception());
                }
                return true;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f1313p.getApplicationContext() instanceof android.app.Application) {
                    android.app.Application application = (android.app.Application) this.f1313p.getApplicationContext();
                    p054N1.ComponentCallbacks2C0448c componentCallbacks2C0448c = p054N1.ComponentCallbacks2C0448c.f1300p;
                    synchronized (componentCallbacks2C0448c) {
                        try {
                            if (!componentCallbacks2C0448c.f1304o) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C0448c);
                                application.registerComponentCallbacks(componentCallbacks2C0448c);
                                componentCallbacks2C0448c.f1304o = true;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    p054N1.C0458m c0458m = new p054N1.C0458m(this);
                    synchronized (componentCallbacks2C0448c) {
                        componentCallbacks2C0448c.f1303n.add(c0458m);
                    }
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = componentCallbacks2C0448c.f1302m;
                    boolean z4 = atomicBoolean2.get();
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = componentCallbacks2C0448c.f1301l;
                    if (!z4) {
                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f1309l = 300000L;
                    }
                }
                return true;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                m956d((p050M1.AbstractC0422f) message.obj);
                return true;
            case 9:
                if (this.f1318u.containsKey(message.obj)) {
                    p054N1.C0460o c0460o4 = (p054N1.C0460o) this.f1318u.get(message.obj);
                    p058O1.AbstractC0515s.m1015b(c0460o4.f1345o.f1321x);
                    if (c0460o4.f1341k) {
                        c0460o4.m969j();
                    }
                }
                return true;
            case 10:
                p165n.C1879f c1879f = this.f1320w;
                c1879f.getClass();
                p165n.C1874a c1874a = new p165n.C1874a(c1879f);
                while (c1874a.hasNext()) {
                    p054N1.C0460o c0460o5 = (p054N1.C0460o) this.f1318u.remove((p054N1.C0447b) c1874a.next());
                    if (c0460o5 != null) {
                        c0460o5.m973n();
                    }
                }
                this.f1320w.clear();
                return true;
            case 11:
                if (this.f1318u.containsKey(message.obj)) {
                    p054N1.C0460o c0460o6 = (p054N1.C0460o) this.f1318u.get(message.obj);
                    p054N1.C0449d c0449d = c0460o6.f1345o;
                    p058O1.AbstractC0515s.m1015b(c0449d.f1321x);
                    boolean z5 = c0460o6.f1341k;
                    if (z5) {
                        if (z5) {
                            p054N1.C0449d c0449d2 = c0460o6.f1345o;
                            p088W1.HandlerC0820f handlerC0820f2 = c0449d2.f1321x;
                            p054N1.C0447b c0447b2 = c0460o6.f1335e;
                            handlerC0820f2.removeMessages(11, c0447b2);
                            c0449d2.f1321x.removeMessages(9, c0447b2);
                            c0460o6.f1341k = false;
                        }
                        c0460o6.m961b(c0449d.f1314q.m811b(c0449d.f1313p, p046L1.AbstractC0361e.f1105a) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        c0460o6.f1334d.mo892i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f1318u.containsKey(message.obj)) {
                    p054N1.C0460o c0460o7 = (p054N1.C0460o) this.f1318u.get(message.obj);
                    p058O1.AbstractC0515s.m1015b(c0460o7.f1345o.f1321x);
                    p050M1.InterfaceC0419c interfaceC0419c = c0460o7.f1334d;
                    if (interfaceC0419c.mo886c() && c0460o7.f1338h.isEmpty()) {
                        p008B1.C0026d c0026d = c0460o7.f1336f;
                        if (((java.util.Map) c0026d.f99m).isEmpty() && ((java.util.Map) c0026d.f100n).isEmpty()) {
                            interfaceC0419c.mo892i("Timing out service connection.");
                        } else {
                            c0460o7.m966g();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new java.lang.ClassCastException();
            case 15:
                p054N1.C0461p c0461p = (p054N1.C0461p) message.obj;
                if (this.f1318u.containsKey(c0461p.f1346a)) {
                    p054N1.C0460o c0460o8 = (p054N1.C0460o) this.f1318u.get(c0461p.f1346a);
                    if (c0460o8.f1342l.contains(c0461p) && !c0460o8.f1341k) {
                        if (c0460o8.f1334d.mo886c()) {
                            c0460o8.m963d();
                        } else {
                            c0460o8.m969j();
                        }
                    }
                }
                return true;
            case 16:
                p054N1.C0461p c0461p2 = (p054N1.C0461p) message.obj;
                if (this.f1318u.containsKey(c0461p2.f1346a)) {
                    p054N1.C0460o c0460o9 = (p054N1.C0460o) this.f1318u.get(c0461p2.f1346a);
                    if (c0460o9.f1342l.remove(c0461p2)) {
                        p054N1.C0449d c0449d3 = c0460o9.f1345o;
                        c0449d3.f1321x.removeMessages(15, c0461p2);
                        c0449d3.f1321x.removeMessages(16, c0461p2);
                        p046L1.C0359c c0359c = c0461p2.f1347b;
                        java.util.LinkedList<p054N1.AbstractC0466u> linkedList = c0460o9.f1333c;
                        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList.size());
                        for (p054N1.AbstractC0466u abstractC0466u : linkedList) {
                            if (abstractC0466u != null && (mo945b = abstractC0466u.mo945b(c0460o9)) != null) {
                                int length = mo945b.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!p058O1.AbstractC0515s.m1019f(mo945b[i8], c0359c)) {
                                        i8++;
                                    } else if (i8 >= 0) {
                                        arrayList.add(abstractC0466u);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            p054N1.AbstractC0466u abstractC0466u2 = (p054N1.AbstractC0466u) arrayList.get(i9);
                            linkedList.remove(abstractC0466u2);
                            abstractC0466u2.mo947d(new p050M1.C0427k(c0359c));
                        }
                    }
                }
                return true;
            case 17:
                p058O1.C0506j c0506j = this.f1311n;
                if (c0506j != null) {
                    if (c0506j.f1503l > 0 || m954a()) {
                        if (this.f1312o == null) {
                            this.f1312o = new p050M1.AbstractC0422f(this.f1313p, p066Q1.C0562c.f1763i, p058O1.C0507k.f1505b, p050M1.C0421e.f1199b);
                        }
                        p066Q1.C0562c c0562c = this.f1312o;
                        c0562c.getClass();
                        p009B2.C0034E c0034e = new p009B2.C0034E();
                        c0034e.f122c = 0;
                        c0034e.f124e = new p046L1.C0359c[]{p088W1.AbstractC0818d.f2912a};
                        c0034e.f121b = false;
                        c0034e.f123d = new p043K2.C0339o(i4, c0506j);
                        c0562c.m899c(2, c0034e.m121a());
                    }
                    this.f1311n = null;
                }
                return true;
            case 18:
                p054N1.C0468w c0468w = (p054N1.C0468w) message.obj;
                if (c0468w.f1367c == 0) {
                    p058O1.C0506j c0506j2 = new p058O1.C0506j(c0468w.f1366b, java.util.Arrays.asList(c0468w.f1365a));
                    if (this.f1312o == null) {
                        this.f1312o = new p050M1.AbstractC0422f(this.f1313p, p066Q1.C0562c.f1763i, p058O1.C0507k.f1505b, p050M1.C0421e.f1199b);
                    }
                    p066Q1.C0562c c0562c2 = this.f1312o;
                    c0562c2.getClass();
                    p009B2.C0034E c0034e2 = new p009B2.C0034E();
                    c0034e2.f122c = 0;
                    c0034e2.f124e = new p046L1.C0359c[]{p088W1.AbstractC0818d.f2912a};
                    c0034e2.f121b = false;
                    c0034e2.f123d = new p043K2.C0339o(i4, c0506j2);
                    c0562c2.m899c(2, c0034e2.m121a());
                } else {
                    p058O1.C0506j c0506j3 = this.f1311n;
                    if (c0506j3 != null) {
                        java.util.List list = c0506j3.f1504m;
                        if (c0506j3.f1503l != c0468w.f1366b || (list != null && list.size() >= c0468w.f1368d)) {
                            this.f1321x.removeMessages(17);
                            p058O1.C0506j c0506j4 = this.f1311n;
                            if (c0506j4 != null) {
                                if (c0506j4.f1503l > 0 || m954a()) {
                                    if (this.f1312o == null) {
                                        this.f1312o = new p050M1.AbstractC0422f(this.f1313p, p066Q1.C0562c.f1763i, p058O1.C0507k.f1505b, p050M1.C0421e.f1199b);
                                    }
                                    p066Q1.C0562c c0562c3 = this.f1312o;
                                    c0562c3.getClass();
                                    p009B2.C0034E c0034e3 = new p009B2.C0034E();
                                    c0034e3.f122c = 0;
                                    c0034e3.f124e = new p046L1.C0359c[]{p088W1.AbstractC0818d.f2912a};
                                    c0034e3.f121b = false;
                                    c0034e3.f123d = new p043K2.C0339o(i4, c0506j4);
                                    c0562c3.m899c(2, c0034e3.m121a());
                                }
                                this.f1311n = null;
                            }
                        } else {
                            p058O1.C0506j c0506j5 = this.f1311n;
                            p058O1.C0503g c0503g = c0468w.f1365a;
                            if (c0506j5.f1504m == null) {
                                c0506j5.f1504m = new java.util.ArrayList();
                            }
                            c0506j5.f1504m.add(c0503g);
                        }
                    }
                    if (this.f1311n == null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(c0468w.f1365a);
                        this.f1311n = new p058O1.C0506j(c0468w.f1366b, arrayList2);
                        p088W1.HandlerC0820f handlerC0820f3 = this.f1321x;
                        handlerC0820f3.sendMessageDelayed(handlerC0820f3.obtainMessage(17), c0468w.f1367c);
                    }
                }
                return true;
            case 19:
                this.f1310m = false;
                return true;
            default:
                android.util.Log.w("GoogleApiManager", "Unknown message id: " + i5);
                return false;
        }
    }
}
