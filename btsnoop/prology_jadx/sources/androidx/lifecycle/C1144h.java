package androidx.lifecycle;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C1144h extends androidx.lifecycle.AbstractC1138b {
    @Override // androidx.lifecycle.AbstractC1138b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.FragmentC1157u.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.FragmentC1157u.a());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new android.app.Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
