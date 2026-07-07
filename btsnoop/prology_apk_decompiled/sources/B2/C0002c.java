package B2;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: B2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0003d f142a;

    public C0002c(AbstractActivityC0003d abstractActivityC0003d) {
        this.f142a = abstractActivityC0003d;
    }

    public final void onBackCancelled() {
        AbstractActivityC0003d abstractActivityC0003d = this.f142a;
        if (abstractActivityC0003d.j("cancelBackGesture")) {
            C0006g c0006g = abstractActivityC0003d.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                cVar.f354j.f949a.j("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0003d abstractActivityC0003d = this.f142a;
        if (abstractActivityC0003d.j("commitBackGesture")) {
            C0006g c0006g = abstractActivityC0003d.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar != null) {
                cVar.f354j.f949a.j("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0003d abstractActivityC0003d = this.f142a;
        if (abstractActivityC0003d.j("updateBackGestureProgress")) {
            C0006g c0006g = abstractActivityC0003d.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            K2.a aVar = cVar.f354j;
            aVar.getClass();
            aVar.f949a.j("updateBackGestureProgress", K2.a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0003d abstractActivityC0003d = this.f142a;
        if (abstractActivityC0003d.j("startBackGesture")) {
            C0006g c0006g = abstractActivityC0003d.f145m;
            c0006g.b();
            C2.c cVar = c0006g.f153b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            K2.a aVar = cVar.f354j;
            aVar.getClass();
            aVar.f949a.j("startBackGesture", K2.a.a(backEvent), null);
        }
    }
}
