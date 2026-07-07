package io.flutter.view;

/* renamed from: io.flutter.view.k */
/* loaded from: classes.dex */
public final class C1614k {

    /* renamed from: a */
    public final java.lang.reflect.Method f6781a;

    /* renamed from: b */
    public final java.lang.reflect.Method f6782b;

    /* renamed from: c */
    public final java.lang.reflect.Method f6783c;

    /* renamed from: d */
    public final java.lang.reflect.Method f6784d;

    /* renamed from: e */
    public final java.lang.reflect.Field f6785e;

    /* renamed from: f */
    public final java.lang.reflect.Method f6786f;

    /* JADX WARN: Multi-variable type inference failed */
    public C1614k() {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Field field;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6 = null;
        try {
            method = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = android.view.accessibility.AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (java.lang.NoSuchMethodException unused2) {
            android.util.Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (android.os.Build.VERSION.SDK_INT > 26) {
            try {
                java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = java.lang.Class.forName("android.util.LongArray").getMethod("get", java.lang.Integer.TYPE);
                field = declaredField;
                method3 = null;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused3) {
                android.util.Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                field = null;
            }
            this.f6781a = method;
            this.f6782b = method6;
            this.f6783c = method2;
            this.f6784d = method3;
            this.f6785e = field;
            this.f6786f = method4;
        }
        try {
            method5 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
        } catch (java.lang.NoSuchMethodException unused4) {
            android.util.Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
            method5 = null;
        }
        try {
            method3 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getChildId", java.lang.Integer.TYPE);
            field = null;
        } catch (java.lang.NoSuchMethodException unused5) {
            android.util.Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
            method3 = null;
            field = null;
        }
        method6 = method5;
        method4 = field;
        this.f6781a = method;
        this.f6782b = method6;
        this.f6783c = method2;
        this.f6784d = method3;
        this.f6785e = field;
        this.f6786f = method4;
    }

    /* renamed from: a */
    public static java.lang.Long m3569a(io.flutter.view.C1614k c1614k, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.reflect.Method method = c1614k.f6783c;
        if (method == null) {
            return null;
        }
        try {
            return (java.lang.Long) method.invoke(accessibilityRecord, null);
        } catch (java.lang.IllegalAccessException e4) {
            android.util.Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e4);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e5) {
            android.util.Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e5);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m3570b(long j4, int i4) {
        return (j4 & (1 << i4)) != 0;
    }
}
