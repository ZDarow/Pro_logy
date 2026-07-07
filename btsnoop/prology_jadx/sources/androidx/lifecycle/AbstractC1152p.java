package androidx.lifecycle;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public abstract class AbstractC1152p {
    /* renamed from: a */
    public static final void m2662a(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        p154k3.AbstractC1803h.m3779e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
