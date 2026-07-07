package p058O1;

/* renamed from: O1.C */
/* loaded from: classes.dex */
public final class C0495C {

    /* renamed from: g */
    public static final java.lang.Object f1451g = new java.lang.Object();

    /* renamed from: h */
    public static p058O1.C0495C f1452h;

    /* renamed from: i */
    public static android.os.HandlerThread f1453i;

    /* renamed from: a */
    public final java.util.HashMap f1454a = new java.util.HashMap();

    /* renamed from: b */
    public final android.content.Context f1455b;

    /* renamed from: c */
    public volatile p088W1.HandlerC0820f f1456c;

    /* renamed from: d */
    public final p070R1.C0579a f1457d;

    /* renamed from: e */
    public final long f1458e;

    /* renamed from: f */
    public final long f1459f;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.Handler, W1.f] */
    /* JADX WARN: Type inference failed for: r3v3, types: [R1.a, java.lang.Object] */
    public C0495C(android.content.Context context, android.os.Looper looper) {
        p058O1.C0494B c0494b = new p058O1.C0494B(this);
        this.f1455b = context.getApplicationContext();
        ?? handler = new android.os.Handler(looper, c0494b);
        android.os.Looper.getMainLooper();
        this.f1456c = handler;
        if (p070R1.C0579a.f1817b == null) {
            synchronized (p070R1.C0579a.f1816a) {
                try {
                    if (p070R1.C0579a.f1817b == null) {
                        ?? obj = new java.lang.Object();
                        new java.util.concurrent.ConcurrentHashMap();
                        p070R1.C0579a.f1817b = obj;
                    }
                } finally {
                }
            }
        }
        p070R1.C0579a c0579a = p070R1.C0579a.f1817b;
        p058O1.AbstractC0515s.m1017d(c0579a);
        this.f1457d = c0579a;
        this.f1458e = 5000L;
        this.f1459f = 300000L;
    }

    /* renamed from: a */
    public final void m1000a(java.lang.String str, android.content.ServiceConnection serviceConnection, boolean z4) {
        p058O1.C0522z c0522z = new p058O1.C0522z(str, z4);
        p058O1.AbstractC0515s.m1018e(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1454a) {
            try {
                p058O1.ServiceConnectionC0493A serviceConnectionC0493A = (p058O1.ServiceConnectionC0493A) this.f1454a.get(c0522z);
                if (serviceConnectionC0493A == null) {
                    throw new java.lang.IllegalStateException("Nonexistent connection status for service config: ".concat(c0522z.toString()));
                }
                if (!serviceConnectionC0493A.f1443l.containsKey(serviceConnection)) {
                    throw new java.lang.IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c0522z.toString()));
                }
                serviceConnectionC0493A.f1443l.remove(serviceConnection);
                if (serviceConnectionC0493A.f1443l.isEmpty()) {
                    this.f1456c.sendMessageDelayed(this.f1456c.obtainMessage(0, c0522z), this.f1458e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m1001b(p058O1.C0522z c0522z, p058O1.ServiceConnectionC0518v serviceConnectionC0518v, java.lang.String str) {
        boolean z4;
        synchronized (this.f1454a) {
            try {
                p058O1.ServiceConnectionC0493A serviceConnectionC0493A = (p058O1.ServiceConnectionC0493A) this.f1454a.get(c0522z);
                if (serviceConnectionC0493A == null) {
                    serviceConnectionC0493A = new p058O1.ServiceConnectionC0493A(this, c0522z);
                    serviceConnectionC0493A.f1443l.put(serviceConnectionC0518v, serviceConnectionC0518v);
                    serviceConnectionC0493A.m999a(str, null);
                    this.f1454a.put(c0522z, serviceConnectionC0493A);
                } else {
                    this.f1456c.removeMessages(0, c0522z);
                    if (serviceConnectionC0493A.f1443l.containsKey(serviceConnectionC0518v)) {
                        throw new java.lang.IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c0522z.toString()));
                    }
                    serviceConnectionC0493A.f1443l.put(serviceConnectionC0518v, serviceConnectionC0518v);
                    int i4 = serviceConnectionC0493A.f1444m;
                    if (i4 == 1) {
                        serviceConnectionC0518v.onServiceConnected(serviceConnectionC0493A.f1448q, serviceConnectionC0493A.f1446o);
                    } else if (i4 == 2) {
                        serviceConnectionC0493A.m999a(str, null);
                    }
                }
                z4 = serviceConnectionC0493A.f1445n;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
