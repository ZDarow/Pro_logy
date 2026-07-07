package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.AbstractC0248a;
import f.AbstractC0266a;
import i.AbstractC0330k;
import i.InterfaceC0336q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class M implements InterfaceC0336q {

    /* renamed from: H, reason: collision with root package name */
    public static final Method f6589H;

    /* renamed from: I, reason: collision with root package name */
    public static final Method f6590I;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f6593C;

    /* renamed from: E, reason: collision with root package name */
    public Rect f6595E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6596F;

    /* renamed from: G, reason: collision with root package name */
    public final r f6597G;

    /* renamed from: l, reason: collision with root package name */
    public final Context f6598l;

    /* renamed from: m, reason: collision with root package name */
    public ListAdapter f6599m;

    /* renamed from: n, reason: collision with root package name */
    public O f6600n;

    /* renamed from: p, reason: collision with root package name */
    public int f6602p;

    /* renamed from: q, reason: collision with root package name */
    public int f6603q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6604r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6605t;

    /* renamed from: v, reason: collision with root package name */
    public G.a f6607v;
    public View w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0330k f6608x;

    /* renamed from: o, reason: collision with root package name */
    public int f6601o = -2;

    /* renamed from: u, reason: collision with root package name */
    public int f6606u = 0;

    /* renamed from: y, reason: collision with root package name */
    public final J f6609y = new J(this, 1);

    /* renamed from: z, reason: collision with root package name */
    public final L f6610z = new L(this);

    /* renamed from: A, reason: collision with root package name */
    public final K f6591A = new K(this);

    /* renamed from: B, reason: collision with root package name */
    public final J f6592B = new J(this, 0);

    /* renamed from: D, reason: collision with root package name */
    public final Rect f6594D = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f6589H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6590I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.PopupWindow, j.r] */
    public M(Context context, int i4) {
        int resourceId;
        this.f6598l = context;
        this.f6593C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0248a.f5008k, i4, 0);
        this.f6602p = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6603q = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6604r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, i4, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0248a.f5012o, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0266a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f6597G = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        G.a aVar = this.f6607v;
        if (aVar == null) {
            this.f6607v = new G.a(1, this);
        } else {
            ListAdapter listAdapter2 = this.f6599m;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f6599m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6607v);
        }
        O o2 = this.f6600n;
        if (o2 != null) {
            o2.setAdapter(this.f6599m);
        }
    }

    @Override // i.InterfaceC0336q
    public final void c() {
        int i4;
        O o2;
        O o4 = this.f6600n;
        r rVar = this.f6597G;
        Context context = this.f6598l;
        if (o4 == null) {
            O o5 = new O(context, !this.f6596F);
            o5.setHoverListener((P) this);
            this.f6600n = o5;
            o5.setAdapter(this.f6599m);
            this.f6600n.setOnItemClickListener(this.f6608x);
            this.f6600n.setFocusable(true);
            this.f6600n.setFocusableInTouchMode(true);
            this.f6600n.setOnItemSelectedListener(new I(r0, this));
            this.f6600n.setOnScrollListener(this.f6591A);
            rVar.setContentView(this.f6600n);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f6594D;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f6604r) {
                this.f6603q = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.w, this.f6603q, rVar.getInputMethodMode() == 2);
        int i6 = this.f6601o;
        int a4 = this.f6600n.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a4 + (a4 > 0 ? this.f6600n.getPaddingBottom() + this.f6600n.getPaddingTop() + i4 : 0);
        this.f6597G.getInputMethodMode();
        rVar.setWindowLayoutType(1002);
        if (rVar.isShowing()) {
            View view = this.w;
            Field field = C.x.f330a;
            if (view.isAttachedToWindow()) {
                int i7 = this.f6601o;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.w.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.w, this.f6602p, this.f6603q, i7 < 0 ? -1 : i7, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i8 = this.f6601o;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.w.getWidth();
        }
        rVar.setWidth(i8);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f6589H;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f6610z);
        if (this.f6605t) {
            rVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6590I;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f6595E);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f6595E);
        }
        rVar.showAsDropDown(this.w, this.f6602p, this.f6603q, this.f6606u);
        this.f6600n.setSelection(-1);
        if ((!this.f6596F || this.f6600n.isInTouchMode()) && (o2 = this.f6600n) != null) {
            o2.setListSelectionHidden(true);
            o2.requestLayout();
        }
        if (this.f6596F) {
            return;
        }
        this.f6593C.post(this.f6592B);
    }

    @Override // i.InterfaceC0336q
    public final void dismiss() {
        r rVar = this.f6597G;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f6600n = null;
        this.f6593C.removeCallbacks(this.f6609y);
    }

    @Override // i.InterfaceC0336q
    public final boolean i() {
        return this.f6597G.isShowing();
    }

    @Override // i.InterfaceC0336q
    public final ListView k() {
        return this.f6600n;
    }
}
