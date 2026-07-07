package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class u extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4184m = 0;

    /* renamed from: l, reason: collision with root package name */
    public K2.o f4185l;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final t Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            k3.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            k3.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            k3.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            k3.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            k3.h.e(activity, "activity");
            int i4 = u.f4184m;
            s.a(activity, e.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            k3.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            k3.h.e(activity, "activity");
            k3.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            k3.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            k3.h.e(activity, "activity");
        }
    }

    public final void a(e eVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            k3.h.d(activity, "activity");
            s.a(activity, eVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(e.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(e.ON_DESTROY);
        this.f4185l = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(e.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        K2.o oVar = this.f4185l;
        if (oVar != null) {
            ((r) oVar.f1009m).c();
        }
        a(e.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        K2.o oVar = this.f4185l;
        if (oVar != null) {
            r rVar = (r) oVar.f1009m;
            int i4 = rVar.f4177l + 1;
            rVar.f4177l = i4;
            if (i4 == 1 && rVar.f4180o) {
                rVar.f4182q.d(e.ON_START);
                rVar.f4180o = false;
            }
        }
        a(e.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(e.ON_STOP);
    }
}
