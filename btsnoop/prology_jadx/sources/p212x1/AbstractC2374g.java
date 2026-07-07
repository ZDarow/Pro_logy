package p212x1;

/* renamed from: x1.g */
/* loaded from: classes.dex */
public abstract class AbstractC2374g {
    /* renamed from: a */
    public static android.os.IBinder m4591a(android.app.Activity activity) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    /* renamed from: b */
    public static androidx.window.sidecar.SidecarInterface m4592b(android.content.Context context) {
        p154k3.AbstractC1803h.m3779e(context, "context");
        return androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    /* renamed from: c */
    public static p185r1.C2066i m4593c() {
        try {
            java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
            if (android.text.TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            p185r1.C2066i c2066i = p185r1.C2066i.f8401q;
            return p185r1.AbstractC2064g.m4125c(apiVersion);
        } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
