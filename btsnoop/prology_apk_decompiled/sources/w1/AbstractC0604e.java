package w1;

import C.A;
import C.B;
import C.C;
import C.O;
import C.z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import k3.h;
import u1.C0582b;
import u1.C0583c;
import u1.j;
import u1.k;
import u1.m;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0604e {
    public static C0583c a(k kVar, FoldingFeature foldingFeature) {
        C0582b c0582b;
        C0582b c0582b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0582b = C0582b.f8569r;
        } else {
            if (type != 2) {
                return null;
            }
            c0582b = C0582b.s;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0582b2 = C0582b.f8567p;
        } else {
            if (state != 2) {
                return null;
            }
            c0582b2 = C0582b.f8568q;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        r1.b bVar = new r1.b(bounds);
        Rect c4 = kVar.f8589a.c();
        if (bVar.a() == 0 && bVar.b() == 0) {
            return null;
        }
        if (bVar.b() != c4.width() && bVar.a() != c4.height()) {
            return null;
        }
        if (bVar.b() < c4.width() && bVar.a() < c4.height()) {
            return null;
        }
        if (bVar.b() == c4.width() && bVar.a() == c4.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new C0583c(new r1.b(bounds2), c0582b, c0582b2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        k kVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        h.e(windowLayoutInfo, "info");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            if (i4 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i5 = m.f8592b;
            return c(m.a((Activity) context), windowLayoutInfo);
        }
        int i6 = m.f8592b;
        if (i4 < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z4 = context2 instanceof Activity;
                if (!z4 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        h.d(context2, "iterator.baseContext");
                    }
                }
                if (z4) {
                    kVar = m.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i7 = Build.VERSION.SDK_INT;
                    O b4 = (i7 >= 34 ? new C() : i7 >= 30 ? new B() : i7 >= 29 ? new A() : new z()).b();
                    h.d(b4, "Builder().build()");
                    kVar = new k(rect, b4);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        O c4 = O.c(null, windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        kVar = new k(bounds, c4);
        return c(kVar, windowLayoutInfo);
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        C0583c c0583c;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                c0583c = a(kVar, foldingFeature);
            } else {
                c0583c = null;
            }
            if (c0583c != null) {
                arrayList.add(c0583c);
            }
        }
        return new j(arrayList);
    }
}
