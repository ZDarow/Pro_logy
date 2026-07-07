package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public class FragmentC1157u extends android.app.Fragment {

    /* renamed from: m */
    public static final /* synthetic */ int f4334m = 0;

    /* renamed from: l */
    public p043K2.C0339o f4335l;

    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.C1156t Companion = new java.lang.Object();

        public static final void registerIn(android.app.Activity activity) {
            Companion.getClass();
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.FragmentC1157u.a());
        }

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
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            androidx.lifecycle.AbstractC1155s.m2664a(activity, androidx.lifecycle.EnumC1141e.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            p154k3.AbstractC1803h.m3779e(bundle, "bundle");
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

    /* renamed from: a */
    public final void m2665a(androidx.lifecycle.EnumC1141e enumC1141e) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            p154k3.AbstractC1803h.m3778d(activity, "activity");
            androidx.lifecycle.AbstractC1155s.m2664a(activity, enumC1141e);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        m2665a(androidx.lifecycle.EnumC1141e.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m2665a(androidx.lifecycle.EnumC1141e.ON_DESTROY);
        this.f4335l = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m2665a(androidx.lifecycle.EnumC1141e.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        p043K2.C0339o c0339o = this.f4335l;
        if (c0339o != null) {
            ((androidx.lifecycle.C1154r) c0339o.f1048m).m2663c();
        }
        m2665a(androidx.lifecycle.EnumC1141e.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        p043K2.C0339o c0339o = this.f4335l;
        if (c0339o != null) {
            androidx.lifecycle.C1154r c1154r = (androidx.lifecycle.C1154r) c0339o.f1048m;
            int i4 = c1154r.f4326l + 1;
            c1154r.f4326l = i4;
            if (i4 == 1 && c1154r.f4329o) {
                c1154r.f4331q.m2660d(androidx.lifecycle.EnumC1141e.ON_START);
                c1154r.f4329o = false;
            }
        }
        m2665a(androidx.lifecycle.EnumC1141e.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m2665a(androidx.lifecycle.EnumC1141e.ON_STOP);
    }
}
