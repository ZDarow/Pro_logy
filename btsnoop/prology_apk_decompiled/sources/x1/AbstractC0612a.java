package x1;

import a3.l;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0612a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        k3.h.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                k3.h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        k3.h.e(sidecarDeviceState, "sidecarDeviceState");
        int a4 = a(sidecarDeviceState);
        if (a4 < 0 || a4 > 4) {
            return 0;
        }
        return a4;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        l lVar = l.f3631l;
        k3.h.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? lVar : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                k3.h.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return lVar;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i4) {
        try {
            try {
                sidecarDeviceState.posture = i4;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i4));
        }
    }
}
