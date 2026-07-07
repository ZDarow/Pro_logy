package u1;

import C.A;
import C.B;
import C.C;
import C.O;
import C.z;
import a3.C0148a;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import r2.AbstractC0508a;
import y1.C0626b;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8592b = 0;

    static {
        new ArrayList(new C0148a(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) {
        Rect rect;
        O b4;
        WindowMetrics currentWindowMetrics;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            k3.h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i4 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                k3.h.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e4) {
                Log.w("m", e4);
                rect = b(activity);
            } catch (NoSuchFieldException e5) {
                Log.w("m", e5);
                rect = b(activity);
            } catch (NoSuchMethodException e6) {
                Log.w("m", e6);
                rect = b(activity);
            } catch (InvocationTargetException e7) {
                Log.w("m", e7);
                rect = b(activity);
            }
        } else if (i4 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i5 = rect.bottom + dimensionPixelSize;
                if (i5 == point.y) {
                    rect.bottom = i5;
                } else {
                    int i6 = rect.right + dimensionPixelSize;
                    if (i6 == point.x) {
                        rect.right = i6;
                    }
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            b4 = (i7 >= 34 ? new C() : i7 >= 30 ? new B() : i7 >= 29 ? new A() : new z()).b();
            k3.h.d(b4, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i7 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b4 = C0626b.f9143a.a(activity);
        }
        return new k(new r1.b(rect), b4);
    }

    public static Rect b(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                k3.h.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                k3.h.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e4) {
            Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e5) {
            Log.w("m", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e6) {
            Log.w("m", e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e7) {
            Log.w("m", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        k3.h.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i4 = rect.bottom + dimensionPixelSize;
            if (i4 == point.y) {
                rect.bottom = i4;
            } else {
                int i5 = rect.right + dimensionPixelSize;
                if (i5 == point.x) {
                    rect.right = i5;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (AbstractC0508a.g(obj2)) {
                    displayCutout = AbstractC0508a.e(obj2);
                }
            } catch (ClassNotFoundException e8) {
                Log.w("m", e8);
            } catch (IllegalAccessException e9) {
                Log.w("m", e9);
            } catch (InstantiationException e10) {
                Log.w("m", e10);
            } catch (NoSuchFieldException e11) {
                Log.w("m", e11);
            } catch (NoSuchMethodException e12) {
                Log.w("m", e12);
            } catch (InvocationTargetException e13) {
                Log.w("m", e13);
            }
            if (displayCutout != null) {
                int i6 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i6 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i7 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i7 == safeInsetRight) {
                    int i8 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i8;
                }
                int i9 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i9 == safeInsetTop) {
                    rect.top = 0;
                }
                int i10 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i10 == safeInsetBottom) {
                    int i11 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i11;
                }
            }
        }
        return rect;
    }
}
