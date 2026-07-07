package p212x1;

/* renamed from: x1.h */
/* loaded from: classes.dex */
public final class C2375h {

    /* renamed from: a */
    public final androidx.window.sidecar.SidecarInterface f9333a;

    /* renamed from: b */
    public final p212x1.C2373f f9334b;

    /* renamed from: c */
    public final java.util.LinkedHashMap f9335c;

    /* renamed from: d */
    public final java.util.LinkedHashMap f9336d;

    /* renamed from: e */
    public android.support.v4.media.session.C1061t f9337e;

    public C2375h(android.content.Context context) {
        p154k3.AbstractC1803h.m3779e(context, "context");
        androidx.window.sidecar.SidecarInterface m4592b = p212x1.AbstractC2374g.m4592b(context);
        p212x1.C2373f c2373f = new p212x1.C2373f();
        this.f9333a = m4592b;
        this.f9334b = c2373f;
        this.f9335c = new java.util.LinkedHashMap();
        this.f9336d = new java.util.LinkedHashMap();
    }

    /* renamed from: d */
    public final androidx.window.sidecar.SidecarInterface m4597d() {
        return this.f9333a;
    }

    /* renamed from: e */
    public final p198u1.C2242j m4598e(android.app.Activity activity) {
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
        android.os.IBinder m4591a = p212x1.AbstractC2374g.m4591a(activity);
        if (m4591a == null) {
            return new p198u1.C2242j(p105a3.C1029l.f3755l);
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.f9333a;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(m4591a) : null;
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f9333a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return this.f9334b.m4589f(windowLayoutInfo, sidecarDeviceState);
    }

    /* renamed from: f */
    public final void m4599f(android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        android.os.IBinder m4591a = p212x1.AbstractC2374g.m4591a(activity);
        if (m4591a == null) {
            return;
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f9333a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(m4591a);
        }
        java.util.LinkedHashMap linkedHashMap = this.f9336d;
        if (((p006B.InterfaceC0018a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        android.support.v4.media.session.C1061t c1061t = this.f9337e;
        if (c1061t != null) {
            c1061t.m2211U(activity);
        }
        java.util.LinkedHashMap linkedHashMap2 = this.f9335c;
        boolean z4 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(m4591a);
        if (!z4 || (sidecarInterface = this.f9333a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* renamed from: g */
    public final void m4600g(android.os.IBinder iBinder, android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        java.util.LinkedHashMap linkedHashMap = this.f9335c;
        linkedHashMap.put(iBinder, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f9333a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f9333a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        android.support.v4.media.session.C1061t c1061t = this.f9337e;
        if (c1061t != null) {
            c1061t.m2240s0(activity, m4598e(activity));
        }
        this.f9336d.get(activity);
    }

    /* renamed from: h */
    public final void m4601h(p206w0.C2305a c2305a) {
        this.f9337e = new android.support.v4.media.session.C1061t(c2305a);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.f9333a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback(this.f9334b, new androidx.window.sidecar.SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
                    java.util.LinkedHashMap linkedHashMap;
                    android.support.v4.media.session.C1061t c1061t;
                    p212x1.C2373f c2373f;
                    androidx.window.sidecar.SidecarInterface m4597d;
                    p154k3.AbstractC1803h.m3779e(sidecarDeviceState, "newDeviceState");
                    linkedHashMap = p212x1.C2375h.this.f9335c;
                    java.util.Collection<android.app.Activity> values = linkedHashMap.values();
                    p212x1.C2375h c2375h = p212x1.C2375h.this;
                    for (android.app.Activity activity : values) {
                        android.os.IBinder m4591a = p212x1.AbstractC2374g.m4591a(activity);
                        androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (m4591a != null && (m4597d = c2375h.m4597d()) != null) {
                            sidecarWindowLayoutInfo = m4597d.getWindowLayoutInfo(m4591a);
                        }
                        c1061t = c2375h.f9337e;
                        if (c1061t != null) {
                            c2373f = c2375h.f9334b;
                            c1061t.m2240s0(activity, c2373f.m4589f(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    java.util.LinkedHashMap linkedHashMap;
                    p212x1.C2373f c2373f;
                    androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
                    android.support.v4.media.session.C1061t c1061t;
                    p154k3.AbstractC1803h.m3779e(iBinder, "windowToken");
                    p154k3.AbstractC1803h.m3779e(sidecarWindowLayoutInfo, "newLayout");
                    linkedHashMap = p212x1.C2375h.this.f9335c;
                    android.app.Activity activity = (android.app.Activity) linkedHashMap.get(iBinder);
                    if (activity == null) {
                        android.util.Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    c2373f = p212x1.C2375h.this.f9334b;
                    androidx.window.sidecar.SidecarInterface m4597d = p212x1.C2375h.this.m4597d();
                    if (m4597d == null || (sidecarDeviceState = m4597d.getDeviceState()) == null) {
                        sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
                    }
                    p198u1.C2242j m4589f = c2373f.m4589f(sidecarWindowLayoutInfo, sidecarDeviceState);
                    c1061t = p212x1.C2375h.this.f9337e;
                    if (c1061t != null) {
                        c1061t.m2240s0(activity, m4589f);
                    }
                }
            }));
        }
    }

    /* renamed from: i */
    public final boolean m4602i() {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.Class<?> cls4;
        try {
            androidx.window.sidecar.SidecarInterface sidecarInterface = this.f9333a;
            java.lang.reflect.Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", androidx.window.sidecar.SidecarInterface.SidecarCallback.class);
            java.lang.Class<?> returnType = method != null ? method.getReturnType() : null;
            java.lang.Class cls5 = java.lang.Void.TYPE;
            if (!p154k3.AbstractC1803h.m3775a(returnType, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.f9333a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface3 = this.f9333a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface4 = this.f9333a;
            java.lang.reflect.Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", android.os.IBinder.class);
            java.lang.Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!p154k3.AbstractC1803h.m3775a(returnType2, androidx.window.sidecar.SidecarWindowLayoutInfo.class)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface5 = this.f9333a;
            java.lang.reflect.Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", android.os.IBinder.class);
            java.lang.Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!p154k3.AbstractC1803h.m3775a(returnType3, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface6 = this.f9333a;
            java.lang.reflect.Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", android.os.IBinder.class);
            java.lang.Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!p154k3.AbstractC1803h.m3775a(returnType4, cls5)) {
                throw new java.lang.NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (java.lang.NoSuchFieldError unused) {
                androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, 3);
                java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((java.lang.Integer) invoke).intValue() != 3) {
                    throw new java.lang.Exception("Invalid device posture getter/setter");
                }
            }
            androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = new androidx.window.sidecar.SidecarDisplayFeature();
            android.graphics.Rect rect = sidecarDisplayFeature.getRect();
            p154k3.AbstractC1803h.m3778d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new androidx.window.sidecar.SidecarWindowLayoutInfo();
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (java.lang.NoSuchFieldError unused2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(sidecarDisplayFeature);
                androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                java.lang.Object invoke2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                p154k3.AbstractC1803h.m3777c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (p154k3.AbstractC1803h.m3775a(arrayList, (java.util.List) invoke2)) {
                    return true;
                }
                throw new java.lang.Exception("Invalid display feature getter/setter");
            }
        } catch (java.lang.Throwable unused3) {
            return false;
        }
    }
}
