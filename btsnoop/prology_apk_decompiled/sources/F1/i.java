package F1;

import B2.AbstractActivityC0003d;
import B2.r;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u.AbstractC0580h;
import x.AbstractC0609a;
import x.C0610b;
import y.ExecutorC0614a;

/* loaded from: classes.dex */
public final class i implements h, LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f601a;

    /* renamed from: b, reason: collision with root package name */
    public final n f602b;

    /* renamed from: c, reason: collision with root package name */
    public final j f603c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f604d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f605e = false;

    /* renamed from: f, reason: collision with root package name */
    public Location f606f;

    /* renamed from: g, reason: collision with root package name */
    public String f607g;

    /* renamed from: h, reason: collision with root package name */
    public o f608h;

    /* renamed from: i, reason: collision with root package name */
    public E1.a f609i;

    public i(Context context, j jVar) {
        this.f601a = (LocationManager) context.getSystemService("location");
        this.f603c = jVar;
        this.f604d = context;
        this.f602b = new n(context, jVar);
    }

    public static boolean g(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z4 = time > 120000;
        boolean z5 = time < -120000;
        boolean z6 = time > 0;
        if (z4) {
            return true;
        }
        if (z5) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z7 = accuracy > 0.0f;
        boolean z8 = accuracy < 0.0f;
        boolean z9 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z8) {
            return true;
        }
        if (!z6 || z7) {
            return z6 && !z9 && equals;
        }
        return true;
    }

    @Override // F1.h
    public final void a(D1.f fVar, D1.f fVar2) {
        LocationManager locationManager = this.f601a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && g(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        fVar.a(location);
    }

    @Override // F1.h
    public final void b(AbstractActivityC0003d abstractActivityC0003d, o oVar, E1.a aVar) {
        long j4;
        float f4;
        int i4;
        String str;
        if (!h.e(this.f604d)) {
            aVar.c(3);
            return;
        }
        this.f608h = oVar;
        this.f609i = aVar;
        int i5 = 5;
        j jVar = this.f603c;
        if (jVar != null) {
            float f5 = (float) jVar.f611b;
            int i6 = jVar.f610a;
            long j5 = i6 == 1 ? Long.MAX_VALUE : jVar.f612c;
            int b4 = L.j.b(i6);
            i4 = (b4 == 0 || b4 == 1) ? 104 : (b4 == 3 || b4 == 4 || b4 == 5) ? 100 : 102;
            f4 = f5;
            i5 = i6;
            j4 = j5;
        } else {
            j4 = 0;
            f4 = 0.0f;
            i4 = 102;
        }
        List<String> providers = this.f601a.getProviders(true);
        if (i5 == 1) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f607g = str;
        if (str == null) {
            aVar.c(3);
            return;
        }
        B.d.a("intervalMillis", j4);
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        if (f4 > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        B.d.a("minUpdateIntervalMillis", j4);
        boolean z4 = i4 == 104 || i4 == 102 || i4 == 100;
        Object[] objArr = {Integer.valueOf(i4)};
        if (!z4) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        if (j4 == Long.MAX_VALUE && j4 == -1) {
            throw new IllegalStateException("passive location requests must have an explicit minimum update interval");
        }
        C0610b c0610b = new C0610b(j4, i4, Math.min(j4, j4), f4);
        this.f605e = true;
        this.f602b.b();
        String str2 = this.f607g;
        Looper mainLooper = Looper.getMainLooper();
        int i7 = AbstractC0609a.f8959a;
        int i8 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f601a;
        if (i8 >= 31) {
            r.e.b(locationManager, str2, r.e.d(c0610b), new ExecutorC0614a(new Handler(mainLooper), 0), this);
            return;
        }
        try {
            if (AbstractC0580h.f8489a == null) {
                AbstractC0580h.f8489a = Class.forName("android.location.LocationRequest");
            }
            if (AbstractC0580h.f8490b == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", AbstractC0580h.f8489a, LocationListener.class, Looper.class);
                AbstractC0580h.f8490b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest a4 = c0610b.a(str2);
            if (a4 != null) {
                AbstractC0580h.f8490b.invoke(locationManager, a4, this, mainLooper);
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str2, c0610b.f8961b, c0610b.f8963d, this, mainLooper);
    }

    @Override // F1.h
    public final boolean c(int i4, int i5) {
        return false;
    }

    @Override // F1.h
    public final void d() {
        LocationManager locationManager;
        this.f605e = false;
        n nVar = this.f602b;
        if (nVar.f620c != null && (locationManager = nVar.f619b) != null) {
            locationManager.removeNmeaListener(nVar.f621d);
            locationManager.unregisterGnssStatusCallback(nVar.f622e);
            nVar.f627j = false;
        }
        this.f601a.removeUpdates(this);
    }

    @Override // F1.h
    public final void f(r rVar) {
        if (this.f601a == null) {
            ((K2.k) rVar.f185m).b(Boolean.FALSE);
        } else {
            ((K2.k) rVar.f185m).b(Boolean.valueOf(h.e(this.f604d)));
        }
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i4) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            onLocationChanged((Location) list.get(i4));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f607g)) {
            if (this.f605e) {
                this.f601a.removeUpdates(this);
            }
            E1.a aVar = this.f609i;
            if (aVar != null) {
                aVar.c(3);
            }
            this.f607g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
        if (i4 != 2 && i4 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (g(location, this.f606f)) {
            this.f606f = location;
            if (this.f608h != null) {
                this.f602b.a(location);
                this.f608h.a(this.f606f);
            }
        }
    }
}
