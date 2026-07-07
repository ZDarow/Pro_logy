package p198u1;

/* renamed from: u1.m */
/* loaded from: classes.dex */
public final class C2245m implements p198u1.InterfaceC2244l {

    /* renamed from: b */
    public static final /* synthetic */ int f8936b = 0;

    static {
        new java.util.ArrayList(new p105a3.C1018a(new java.lang.Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    /* renamed from: a */
    public static p198u1.C2243k m4440a(android.app.Activity activity) {
        android.graphics.Rect rect;
        p011C.C0105O mo354b;
        android.view.WindowMetrics currentWindowMetrics;
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            currentWindowMetrics = ((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            p154k3.AbstractC1803h.m3778d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i4 >= 29) {
            android.content.res.Configuration configuration = activity.getResources().getConfiguration();
            try {
                java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(configuration);
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new android.graphics.Rect((android.graphics.Rect) invoke);
            } catch (java.lang.IllegalAccessException e4) {
                android.util.Log.w("m", e4);
                rect = m4441b(activity);
            } catch (java.lang.NoSuchFieldException e5) {
                android.util.Log.w("m", e5);
                rect = m4441b(activity);
            } catch (java.lang.NoSuchMethodException e6) {
                android.util.Log.w("m", e6);
                rect = m4441b(activity);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                android.util.Log.w("m", e7);
                rect = m4441b(activity);
            }
        } else if (i4 >= 28) {
            rect = m4441b(activity);
        } else {
            rect = new android.graphics.Rect();
            android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getRealSize(point);
                android.content.res.Resources resources = activity.getResources();
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
        int i7 = android.os.Build.VERSION.SDK_INT;
        if (i7 < 30) {
            mo354b = (i7 >= 34 ? new p011C.C0093C() : i7 >= 30 ? new p011C.C0092B() : i7 >= 29 ? new p011C.C0091A() : new p011C.C0134z()).mo354b();
            p154k3.AbstractC1803h.m3778d(mo354b, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i7 < 30) {
                throw new java.lang.Exception("Incompatible SDK version");
            }
            mo354b = p216y1.C2416b.f9505a.m4653a(activity);
        }
        return new p198u1.C2243k(new p185r1.C2059b(rect), mo354b);
    }

    /* renamed from: b */
    public static android.graphics.Rect m4441b(android.app.Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        android.view.DisplayCutout displayCutout = null;
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                java.lang.Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                p154k3.AbstractC1803h.m3777c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((android.graphics.Rect) invoke);
            } else {
                java.lang.Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                p154k3.AbstractC1803h.m3777c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((android.graphics.Rect) invoke2);
            }
        } catch (java.lang.IllegalAccessException e4) {
            android.util.Log.w("m", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.NoSuchFieldException e5) {
            android.util.Log.w("m", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.NoSuchMethodException e6) {
            android.util.Log.w("m", e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (java.lang.reflect.InvocationTargetException e7) {
            android.util.Log.w("m", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        p154k3.AbstractC1803h.m3778d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            android.content.res.Resources resources = activity.getResources();
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
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                java.lang.Object newInstance = constructor.newInstance(null);
                java.lang.reflect.Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                java.lang.reflect.Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                java.lang.Object obj2 = declaredField2.get(newInstance);
                if (p186r2.AbstractC2067a.m4132g(obj2)) {
                    displayCutout = p186r2.AbstractC2067a.m4130e(obj2);
                }
            } catch (java.lang.ClassNotFoundException e8) {
                android.util.Log.w("m", e8);
            } catch (java.lang.IllegalAccessException e9) {
                android.util.Log.w("m", e9);
            } catch (java.lang.InstantiationException e10) {
                android.util.Log.w("m", e10);
            } catch (java.lang.NoSuchFieldException e11) {
                android.util.Log.w("m", e11);
            } catch (java.lang.NoSuchMethodException e12) {
                android.util.Log.w("m", e12);
            } catch (java.lang.reflect.InvocationTargetException e13) {
                android.util.Log.w("m", e13);
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
