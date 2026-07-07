package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class q extends b {
    final /* synthetic */ r this$0;

    /* loaded from: classes.dex */
    public static final class a extends b {
        final /* synthetic */ r this$0;

        public a(r rVar) {
            this.this$0 = rVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            k3.h.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            k3.h.e(activity, "activity");
            r rVar = this.this$0;
            int i4 = rVar.f4177l + 1;
            rVar.f4177l = i4;
            if (i4 == 1 && rVar.f4180o) {
                rVar.f4182q.d(e.ON_START);
                rVar.f4180o = false;
            }
        }
    }

    public q(r rVar) {
        this.this$0 = rVar;
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k3.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = u.f4184m;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            k3.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u) findFragmentByTag).f4185l = this.this$0.s;
        }
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k3.h.e(activity, "activity");
        r rVar = this.this$0;
        int i4 = rVar.f4178m - 1;
        rVar.f4178m = i4;
        if (i4 == 0) {
            Handler handler = rVar.f4181p;
            k3.h.b(handler);
            handler.postDelayed(rVar.f4183r, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        k3.h.e(activity, "activity");
        p.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k3.h.e(activity, "activity");
        r rVar = this.this$0;
        int i4 = rVar.f4177l - 1;
        rVar.f4177l = i4;
        if (i4 == 0 && rVar.f4179n) {
            rVar.f4182q.d(e.ON_STOP);
            rVar.f4180o = true;
        }
    }
}
