package p009B2;

/* renamed from: B2.c */
/* loaded from: classes.dex */
public final class C0046c implements android.window.OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ p009B2.AbstractActivityC0047d f145a;

    public C0046c(p009B2.AbstractActivityC0047d abstractActivityC0047d) {
        this.f145a = abstractActivityC0047d;
    }

    public final void onBackCancelled() {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f145a;
        if (abstractActivityC0047d.m135j("cancelBackGesture")) {
            p009B2.C0050g c0050g = abstractActivityC0047d.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                c0138c.f360j.f988a.m694j("cancelBackGesture", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f145a;
        if (abstractActivityC0047d.m135j("commitBackGesture")) {
            p009B2.C0050g c0050g = abstractActivityC0047d.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c != null) {
                c0138c.f360j.f988a.m694j("commitBackGesture", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f145a;
        if (abstractActivityC0047d.m135j("updateBackGestureProgress")) {
            p009B2.C0050g c0050g = abstractActivityC0047d.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            p043K2.C0325a c0325a = c0138c.f360j;
            c0325a.getClass();
            c0325a.f988a.m694j("updateBackGestureProgress", p043K2.C0325a.m719a(backEvent), null);
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f145a;
        if (abstractActivityC0047d.m135j("startBackGesture")) {
            p009B2.C0050g c0050g = abstractActivityC0047d.f148m;
            c0050g.m138b();
            p013C2.C0138c c0138c = c0050g.f156b;
            if (c0138c == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            p043K2.C0325a c0325a = c0138c.f360j;
            c0325a.getClass();
            c0325a.f988a.m694j("startBackGesture", p043K2.C0325a.m719a(backEvent), null);
        }
    }
}
