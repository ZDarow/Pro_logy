package t0;

import T.X;
import W.y;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import f2.I;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568j extends X {

    /* renamed from: r, reason: collision with root package name */
    public boolean f8336r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8337t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8338u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8339v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8340x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f8341y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f8342z;

    public C0568j(Context context) {
        CaptioningManager captioningManager;
        String locale;
        Point point;
        String E3;
        String[] split;
        int i4 = y.f2709a;
        if ((i4 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f2192o = 1088;
            Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i4 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f2191n = I.o(locale);
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && y.L(context)) {
            if (i4 < 28) {
                E3 = y.E("sys.display-size");
            } else {
                E3 = y.E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(E3)) {
                try {
                    split = E3.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        b(point.x, point.y);
                        this.f8341y = new SparseArray();
                        this.f8342z = new SparseBooleanArray();
                        c();
                    }
                }
                W.a.n("Util", "Invalid display size: " + E3);
            }
            if ("Sony".equals(y.f2711c) && y.f2712d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                b(point.x, point.y);
                this.f8341y = new SparseArray();
                this.f8342z = new SparseBooleanArray();
                c();
            }
        }
        point = new Point();
        if (i4 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        b(point.x, point.y);
        this.f8341y = new SparseArray();
        this.f8342z = new SparseBooleanArray();
        c();
    }

    @Override // T.X
    public final X b(int i4, int i5) {
        super.b(i4, i5);
        return this;
    }

    public final void c() {
        this.f8336r = true;
        this.s = true;
        this.f8337t = true;
        this.f8338u = true;
        this.f8339v = true;
        this.w = true;
        this.f8340x = true;
    }

    public C0568j(C0569k c0569k) {
        a(c0569k);
        this.f8336r = c0569k.f8344r;
        this.s = c0569k.s;
        this.f8337t = c0569k.f8345t;
        this.f8338u = c0569k.f8346u;
        this.f8339v = c0569k.f8347v;
        this.w = c0569k.w;
        this.f8340x = c0569k.f8348x;
        SparseArray sparseArray = new SparseArray();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = c0569k.f8349y;
            if (i4 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i4), new HashMap((Map) sparseArray2.valueAt(i4)));
                i4++;
            } else {
                this.f8341y = sparseArray;
                this.f8342z = c0569k.f8350z.clone();
                return;
            }
        }
    }

    public C0568j() {
        this.f8341y = new SparseArray();
        this.f8342z = new SparseBooleanArray();
        c();
    }
}
