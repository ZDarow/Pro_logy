package j;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import v.AbstractC0586b;
import v.InterfaceC0585a;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f6553a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f6554b;

    static {
        try {
            f6554b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0585a) {
                ((AbstractC0586b) ((InterfaceC0585a) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof C) {
                return a(((C) drawable).f6555l);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        char c4;
        Insets opticalInsets;
        int i4;
        int i5;
        int i6;
        int i7;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i4 = opticalInsets.left;
            rect.left = i4;
            i5 = opticalInsets.right;
            rect.right = i5;
            i6 = opticalInsets.top;
            rect.top = i6;
            i7 = opticalInsets.bottom;
            rect.bottom = i7;
            return rect;
        }
        Class cls = f6554b;
        if (cls != null) {
            try {
                boolean z4 = drawable instanceof InterfaceC0585a;
                Object obj = drawable;
                if (z4) {
                    ((AbstractC0586b) ((InterfaceC0585a) drawable)).getClass();
                    obj = null;
                }
                Object invoke = obj.getClass().getMethod("getOpticalInsets", null).invoke(obj, null);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c4 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c4 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c4 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f6553a;
    }

    public static PorterDuff.Mode c(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
