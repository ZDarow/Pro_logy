package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public final class C1153q extends androidx.lifecycle.AbstractC1138b {
    final /* synthetic */ androidx.lifecycle.C1154r this$0;

    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.AbstractC1138b {
        final /* synthetic */ androidx.lifecycle.C1154r this$0;

        public a(androidx.lifecycle.C1154r c1154r) {
            this.this$0 = c1154r;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            this.this$0.m2663c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            p154k3.AbstractC1803h.m3779e(activity, "activity");
            androidx.lifecycle.C1154r c1154r = this.this$0;
            int i4 = c1154r.f4326l + 1;
            c1154r.f4326l = i4;
            if (i4 == 1 && c1154r.f4329o) {
                c1154r.f4331q.m2660d(androidx.lifecycle.EnumC1141e.ON_START);
                c1154r.f4329o = false;
            }
        }
    }

    public C1153q(androidx.lifecycle.C1154r c1154r) {
        this.this$0 = c1154r;
    }

    @Override // androidx.lifecycle.AbstractC1138b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i4 = androidx.lifecycle.FragmentC1157u.f4334m;
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            p154k3.AbstractC1803h.m3777c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((androidx.lifecycle.FragmentC1157u) findFragmentByTag).f4335l = this.this$0.f4333s;
        }
    }

    @Override // androidx.lifecycle.AbstractC1138b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        androidx.lifecycle.C1154r c1154r = this.this$0;
        int i4 = c1154r.f4327m - 1;
        c1154r.f4327m = i4;
        if (i4 == 0) {
            android.os.Handler handler = c1154r.f4330p;
            p154k3.AbstractC1803h.m3776b(handler);
            handler.postDelayed(c1154r.f4332r, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        androidx.lifecycle.AbstractC1152p.m2662a(activity, new androidx.lifecycle.C1153q.a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1138b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        androidx.lifecycle.C1154r c1154r = this.this$0;
        int i4 = c1154r.f4326l - 1;
        c1154r.f4326l = i4;
        if (i4 == 0 && c1154r.f4328n) {
            c1154r.f4331q.m2660d(androidx.lifecycle.EnumC1141e.ON_STOP);
            c1154r.f4329o = true;
        }
    }
}
