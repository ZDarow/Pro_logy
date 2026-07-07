package p058O1;

/* renamed from: O1.A */
/* loaded from: classes.dex */
public final class ServiceConnectionC0493A implements android.content.ServiceConnection {

    /* renamed from: l */
    public final java.util.HashMap f1443l = new java.util.HashMap();

    /* renamed from: m */
    public int f1444m = 2;

    /* renamed from: n */
    public boolean f1445n;

    /* renamed from: o */
    public android.os.IBinder f1446o;

    /* renamed from: p */
    public final p058O1.C0522z f1447p;

    /* renamed from: q */
    public android.content.ComponentName f1448q;

    /* renamed from: r */
    public final /* synthetic */ p058O1.C0495C f1449r;

    public ServiceConnectionC0493A(p058O1.C0495C c0495c, p058O1.C0522z c0522z) {
        this.f1449r = c0495c;
        this.f1447p = c0522z;
    }

    /* renamed from: a */
    public final void m999a(java.lang.String str, java.util.concurrent.Executor executor) {
        android.os.StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f1444m = 3;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new android.os.StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            android.os.StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            p058O1.C0495C c0495c = this.f1449r;
            p070R1.C0579a c0579a = c0495c.f1457d;
            android.content.Context context = c0495c.f1455b;
            boolean m1101b = c0579a.m1101b(context, str, this.f1447p.m1020a(context), this, executor);
            this.f1445n = m1101b;
            if (m1101b) {
                this.f1449r.f1456c.sendMessageDelayed(this.f1449r.f1456c.obtainMessage(1, this.f1447p), this.f1449r.f1459f);
            } else {
                this.f1444m = 2;
                try {
                    p058O1.C0495C c0495c2 = this.f1449r;
                    c0495c2.f1457d.m1100a(c0495c2.f1455b, this);
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            android.os.StrictMode.setVmPolicy(vmPolicy);
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.f1449r.f1454a) {
            try {
                this.f1449r.f1456c.removeMessages(1, this.f1447p);
                this.f1446o = iBinder;
                this.f1448q = componentName;
                java.util.Iterator it = this.f1443l.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1444m = 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f1449r.f1454a) {
            try {
                this.f1449r.f1456c.removeMessages(1, this.f1447p);
                this.f1446o = null;
                this.f1448q = componentName;
                java.util.Iterator it = this.f1443l.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1444m = 2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
