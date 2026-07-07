package com.baseflow.geolocator;

import B1.d;
import B2.AbstractActivityC0003d;
import D1.b;
import F1.f;
import F1.h;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

/* loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f4712v = 0;

    /* renamed from: r, reason: collision with root package name */
    public h f4719r;

    /* renamed from: l, reason: collision with root package name */
    public final b f4713l = new b(this);

    /* renamed from: m, reason: collision with root package name */
    public boolean f4714m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f4715n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4716o = 0;

    /* renamed from: p, reason: collision with root package name */
    public AbstractActivityC0003d f4717p = null;

    /* renamed from: q, reason: collision with root package name */
    public f f4718q = null;
    public PowerManager.WakeLock s = null;

    /* renamed from: t, reason: collision with root package name */
    public WifiManager.WifiLock f4720t = null;

    /* renamed from: u, reason: collision with root package name */
    public d f4721u = null;

    public final void a(F1.b bVar) {
        WifiManager wifiManager;
        PowerManager powerManager;
        b();
        if (bVar.f580f && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.s = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.s.acquire();
        }
        if (!bVar.f579e || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f4720t = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.f4720t.acquire();
    }

    public final void b() {
        PowerManager.WakeLock wakeLock = this.s;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.s.release();
            this.s = null;
        }
        WifiManager.WifiLock wifiLock = this.f4720t;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f4720t.release();
        this.f4720t = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f4713l;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f fVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f4716o--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        h hVar = this.f4719r;
        if (hVar != null && (fVar = this.f4718q) != null) {
            fVar.f598l.remove(hVar);
            hVar.d();
        }
        if (this.f4714m) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            stopForeground(1);
            b();
            this.f4714m = false;
            this.f4721u = null;
        }
        this.f4718q = null;
        this.f4721u = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
