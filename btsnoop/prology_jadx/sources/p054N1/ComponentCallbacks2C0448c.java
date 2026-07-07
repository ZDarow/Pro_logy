package p054N1;

/* renamed from: N1.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0448c implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* renamed from: p */
    public static final p054N1.ComponentCallbacks2C0448c f1300p = new p054N1.ComponentCallbacks2C0448c();

    /* renamed from: l */
    public final java.util.concurrent.atomic.AtomicBoolean f1301l = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: m */
    public final java.util.concurrent.atomic.AtomicBoolean f1302m = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: n */
    public final java.util.ArrayList f1303n = new java.util.ArrayList();

    /* renamed from: o */
    public boolean f1304o = false;

    /* renamed from: a */
    public final void m951a(boolean z4) {
        synchronized (f1300p) {
            try {
                java.util.Iterator it = this.f1303n.iterator();
                while (it.hasNext()) {
                    p088W1.HandlerC0820f handlerC0820f = ((p054N1.C0458m) it.next()).f1330a.f1321x;
                    handlerC0820f.sendMessage(handlerC0820f.obtainMessage(1, java.lang.Boolean.valueOf(z4)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f1302m;
        boolean compareAndSet = this.f1301l.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m951a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f1302m;
        boolean compareAndSet = this.f1301l.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m951a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f1301l.compareAndSet(false, true)) {
            this.f1302m.set(true);
            m951a(true);
        }
    }
}
