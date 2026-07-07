package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class s {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, e eVar) {
        m b4;
        k3.h.e(activity, "activity");
        k3.h.e(eVar, "event");
        if (!(activity instanceof k) || (b4 = ((k) activity).b()) == null) {
            return;
        }
        b4.d(eVar);
    }
}
