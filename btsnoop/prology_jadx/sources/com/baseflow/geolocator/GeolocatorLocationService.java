package com.baseflow.geolocator;

/* loaded from: classes.dex */
public class GeolocatorLocationService extends android.app.Service {

    /* renamed from: v */
    public static final /* synthetic */ int f4882v = 0;

    /* renamed from: r */
    public p025F1.InterfaceC0216h f4889r;

    /* renamed from: l */
    public final p017D1.BinderC0169b f4883l = new p017D1.BinderC0169b(this);

    /* renamed from: m */
    public boolean f4884m = false;

    /* renamed from: n */
    public int f4885n = 0;

    /* renamed from: o */
    public int f4886o = 0;

    /* renamed from: p */
    public p009B2.AbstractActivityC0047d f4887p = null;

    /* renamed from: q */
    public p025F1.C0214f f4888q = null;

    /* renamed from: s */
    public android.os.PowerManager.WakeLock f4890s = null;

    /* renamed from: t */
    public android.net.wifi.WifiManager.WifiLock f4891t = null;

    /* renamed from: u */
    public p008B1.C0026d f4892u = null;

    /* renamed from: a */
    public final void m2924a(p025F1.C0210b c0210b) {
        android.net.wifi.WifiManager wifiManager;
        android.os.PowerManager powerManager;
        m2925b();
        if (c0210b.f590f && (powerManager = (android.os.PowerManager) getApplicationContext().getSystemService("power")) != null) {
            android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f4890s = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f4890s.acquire();
        }
        if (!c0210b.f589e || (wifiManager = (android.net.wifi.WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        android.net.wifi.WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(android.os.Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f4891t = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.f4891t.acquire();
    }

    /* renamed from: b */
    public final void m2925b() {
        android.os.PowerManager.WakeLock wakeLock = this.f4890s;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f4890s.release();
            this.f4890s = null;
        }
        android.net.wifi.WifiManager.WifiLock wifiLock = this.f4891t;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f4891t.release();
        this.f4891t = null;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        android.util.Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f4883l;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        android.util.Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        p025F1.C0214f c0214f;
        android.util.Log.d("FlutterGeolocator", "Destroying location service.");
        this.f4886o--;
        android.util.Log.d("FlutterGeolocator", "Stopping location service.");
        p025F1.InterfaceC0216h interfaceC0216h = this.f4889r;
        if (interfaceC0216h != null && (c0214f = this.f4888q) != null) {
            c0214f.f608l.remove(interfaceC0216h);
            interfaceC0216h.mo574d();
        }
        if (this.f4884m) {
            android.util.Log.d("FlutterGeolocator", "Stop service in foreground.");
            stopForeground(1);
            m2925b();
            this.f4884m = false;
            this.f4892u = null;
        }
        this.f4888q = null;
        this.f4892u = null;
        android.util.Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i4, int i5) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        android.util.Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
