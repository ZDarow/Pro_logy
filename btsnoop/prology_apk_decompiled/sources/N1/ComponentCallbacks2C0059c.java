package N1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: N1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0059c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: p, reason: collision with root package name */
    public static final ComponentCallbacks2C0059c f1258p = new ComponentCallbacks2C0059c();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f1259l = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f1260m = new AtomicBoolean();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1261n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public boolean f1262o = false;

    public final void a(boolean z4) {
        synchronized (f1258p) {
            try {
                Iterator it = this.f1261n.iterator();
                while (it.hasNext()) {
                    W1.f fVar = ((m) it.next()).f1286a.f1277x;
                    fVar.sendMessage(fVar.obtainMessage(1, Boolean.valueOf(z4)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f1260m;
        boolean compareAndSet = this.f1259l.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f1260m;
        boolean compareAndSet = this.f1259l.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f1259l.compareAndSet(false, true)) {
            this.f1260m.set(true);
            a(true);
        }
    }
}
