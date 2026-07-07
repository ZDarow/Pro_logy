package C;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import u.C0574b;

/* loaded from: classes.dex */
public final class z extends D {

    /* renamed from: c, reason: collision with root package name */
    public static Field f333c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f334d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f335e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f336f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f337a;

    /* renamed from: b, reason: collision with root package name */
    public C0574b f338b;

    public z() {
        this.f337a = e();
    }

    private static WindowInsets e() {
        if (!f334d) {
            try {
                f333c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f334d = true;
        }
        Field field = f333c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f336f) {
            try {
                f335e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f336f = true;
        }
        Constructor constructor = f335e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // C.D
    public O b() {
        a();
        O c4 = O.c(null, this.f337a);
        K k4 = c4.f296a;
        k4.o(null);
        k4.q(this.f338b);
        return c4;
    }

    @Override // C.D
    public void c(C0574b c0574b) {
        this.f338b = c0574b;
    }

    @Override // C.D
    public void d(C0574b c0574b) {
        WindowInsets windowInsets = this.f337a;
        if (windowInsets != null) {
            this.f337a = windowInsets.replaceSystemWindowInsets(c0574b.f8472a, c0574b.f8473b, c0574b.f8474c, c0574b.f8475d);
        }
    }

    public z(O o2) {
        super(o2);
        this.f337a = o2.b();
    }
}
