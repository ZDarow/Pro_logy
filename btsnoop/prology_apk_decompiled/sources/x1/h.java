package x1;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.support.v4.media.session.t;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import k3.h;
import u1.j;
import w0.C0591a;
import x1.f;
import x1.g;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f8974a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8975b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8976c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8977d;

    /* renamed from: e, reason: collision with root package name */
    public t f8978e;

    public h(Context context) {
        k3.h.e(context, "context");
        SidecarInterface b4 = g.b(context);
        f fVar = new f();
        this.f8974a = b4;
        this.f8975b = fVar;
        this.f8976c = new LinkedHashMap();
        this.f8977d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f8974a;
    }

    public final u1.j e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a4 = g.a(activity);
        if (a4 == null) {
            return new u1.j(l.f3631l);
        }
        SidecarInterface sidecarInterface = this.f8974a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a4) : null;
        SidecarInterface sidecarInterface2 = this.f8974a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f8975b.f(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a4 = g.a(activity);
        if (a4 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f8974a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a4);
        }
        LinkedHashMap linkedHashMap = this.f8977d;
        if (((B.a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        t tVar = this.f8978e;
        if (tVar != null) {
            tVar.U(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f8976c;
        boolean z4 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a4);
        if (!z4 || (sidecarInterface = this.f8974a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f8976c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f8974a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f8974a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        t tVar = this.f8978e;
        if (tVar != null) {
            tVar.s0(activity, e(activity));
        }
        this.f8977d.get(activity);
    }

    public final void h(C0591a c0591a) {
        this.f8978e = new t(c0591a);
        SidecarInterface sidecarInterface = this.f8974a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f8975b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    LinkedHashMap linkedHashMap;
                    t tVar;
                    f fVar;
                    SidecarInterface d4;
                    h.e(sidecarDeviceState, "newDeviceState");
                    linkedHashMap = x1.h.this.f8976c;
                    Collection<Activity> values = linkedHashMap.values();
                    x1.h hVar = x1.h.this;
                    for (Activity activity : values) {
                        IBinder a4 = g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a4 != null && (d4 = hVar.d()) != null) {
                            sidecarWindowLayoutInfo = d4.getWindowLayoutInfo(a4);
                        }
                        tVar = hVar.f8978e;
                        if (tVar != null) {
                            fVar = hVar.f8975b;
                            tVar.s0(activity, fVar.f(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    LinkedHashMap linkedHashMap;
                    f fVar;
                    SidecarDeviceState sidecarDeviceState;
                    t tVar;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    linkedHashMap = x1.h.this.f8976c;
                    Activity activity = (Activity) linkedHashMap.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    fVar = x1.h.this.f8975b;
                    SidecarInterface d4 = x1.h.this.d();
                    if (d4 == null || (sidecarDeviceState = d4.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    j f4 = fVar.f(sidecarWindowLayoutInfo, sidecarDeviceState);
                    tVar = x1.h.this.f8978e;
                    if (tVar != null) {
                        tVar.s0(activity, f4);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f8974a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!k3.h.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f8974a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f8974a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f8974a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!k3.h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f8974a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!k3.h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f8974a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!k3.h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                k3.h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            k3.h.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                k3.h.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (k3.h.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
