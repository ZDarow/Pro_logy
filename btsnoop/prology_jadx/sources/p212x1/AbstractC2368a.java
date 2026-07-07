package p212x1;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2368a {
    /* renamed from: a */
    public static int m4576a(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        p154k3.AbstractC1803h.m3779e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((java.lang.Integer) invoke).intValue();
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m4577b(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        p154k3.AbstractC1803h.m3779e(sidecarDeviceState, "sidecarDeviceState");
        int m4576a = m4576a(sidecarDeviceState);
        if (m4576a < 0 || m4576a > 4) {
            return 0;
        }
        return m4576a;
    }

    /* renamed from: c */
    public static java.util.List m4578c(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        p105a3.C1029l c1029l = p105a3.C1029l.f3755l;
        p154k3.AbstractC1803h.m3779e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? c1029l : list;
            } catch (java.lang.NoSuchFieldError unused) {
                java.lang.Object invoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (java.util.List) invoke;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            return c1029l;
        }
    }

    /* renamed from: d */
    public static void m4579d(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int i4) {
        try {
            try {
                sidecarDeviceState.posture = i4;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        } catch (java.lang.NoSuchFieldError unused2) {
            androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(i4));
        }
    }
}
