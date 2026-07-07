package androidx.lifecycle;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public abstract class AbstractC1138b implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        p154k3.AbstractC1803h.m3779e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
    }
}
