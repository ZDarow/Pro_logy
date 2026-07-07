package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Method f6534a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f6535b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f6536c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f6537d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6538e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f6539f;

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        Method method;
        Method method2;
        Method method3;
        Field field;
        Method method4;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (Build.VERSION.SDK_INT > 26) {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                field = declaredField;
                method3 = null;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                field = null;
            }
            this.f6534a = method;
            this.f6535b = method6;
            this.f6536c = method2;
            this.f6537d = method3;
            this.f6538e = field;
            this.f6539f = method4;
        }
        try {
            method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
        } catch (NoSuchMethodException unused4) {
            Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
            method5 = null;
        }
        try {
            method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
            field = null;
        } catch (NoSuchMethodException unused5) {
            Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
            method3 = null;
            field = null;
        }
        method6 = method5;
        method4 = field;
        this.f6534a = method;
        this.f6535b = method6;
        this.f6536c = method2;
        this.f6537d = method3;
        this.f6538e = field;
        this.f6539f = method4;
    }

    public static Long a(k kVar, AccessibilityRecord accessibilityRecord) {
        Method method = kVar.f6536c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, null);
        } catch (IllegalAccessException e4) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e5);
            return null;
        }
    }

    public static boolean b(long j4, int i4) {
        return (j4 & (1 << i4)) != 0;
    }
}
