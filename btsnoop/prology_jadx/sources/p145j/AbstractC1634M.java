package p145j;

/* renamed from: j.M */
/* loaded from: classes.dex */
public abstract class AbstractC1634M implements p140i.InterfaceC1525q {

    /* renamed from: H */
    public static final java.lang.reflect.Method f6840H;

    /* renamed from: I */
    public static final java.lang.reflect.Method f6841I;

    /* renamed from: C */
    public final android.os.Handler f6844C;

    /* renamed from: E */
    public android.graphics.Rect f6846E;

    /* renamed from: F */
    public boolean f6847F;

    /* renamed from: G */
    public final p145j.C1681r f6848G;

    /* renamed from: l */
    public final android.content.Context f6849l;

    /* renamed from: m */
    public android.widget.ListAdapter f6850m;

    /* renamed from: n */
    public p145j.C1636O f6851n;

    /* renamed from: p */
    public int f6853p;

    /* renamed from: q */
    public int f6854q;

    /* renamed from: r */
    public boolean f6855r;

    /* renamed from: s */
    public boolean f6856s;

    /* renamed from: t */
    public boolean f6857t;

    /* renamed from: v */
    public p027G.C0230a f6859v;

    /* renamed from: w */
    public android.view.View f6860w;

    /* renamed from: x */
    public p140i.AbstractC1519k f6861x;

    /* renamed from: o */
    public int f6852o = -2;

    /* renamed from: u */
    public int f6858u = 0;

    /* renamed from: y */
    public final p145j.RunnableC1631J f6862y = new p145j.RunnableC1631J(this, 1);

    /* renamed from: z */
    public final p145j.ViewOnTouchListenerC1633L f6863z = new p145j.ViewOnTouchListenerC1633L(this);

    /* renamed from: A */
    public final p145j.C1632K f6842A = new p145j.C1632K(this);

    /* renamed from: B */
    public final p145j.RunnableC1631J f6843B = new p145j.RunnableC1631J(this, 0);

    /* renamed from: D */
    public final android.graphics.Rect f6845D = new android.graphics.Rect();

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                f6840H = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6841I = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.PopupWindow, j.r] */
    public AbstractC1634M(android.content.Context context, int i4) {
        int resourceId;
        this.f6849l = context;
        this.f6844C = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, p121e.AbstractC1299a.f5195k, i4, 0);
        this.f6853p = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6854q = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6855r = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new android.widget.PopupWindow(context, (android.util.AttributeSet) null, i4, 0);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, p121e.AbstractC1299a.f5199o, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : p126f.AbstractC1367a.m3116a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f6848G = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void m3590a(android.widget.ListAdapter listAdapter) {
        p027G.C0230a c0230a = this.f6859v;
        if (c0230a == null) {
            this.f6859v = new p027G.C0230a(1, this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f6850m;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0230a);
            }
        }
        this.f6850m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6859v);
        }
        p145j.C1636O c1636o = this.f6851n;
        if (c1636o != null) {
            c1636o.setAdapter(this.f6850m);
        }
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: c */
    public final void mo3341c() {
        int i4;
        p145j.C1636O c1636o;
        p145j.C1636O c1636o2 = this.f6851n;
        p145j.C1681r c1681r = this.f6848G;
        android.content.Context context = this.f6849l;
        if (c1636o2 == null) {
            p145j.C1636O c1636o3 = new p145j.C1636O(context, !this.f6847F);
            c1636o3.setHoverListener((p145j.C1637P) this);
            this.f6851n = c1636o3;
            c1636o3.setAdapter(this.f6850m);
            this.f6851n.setOnItemClickListener(this.f6861x);
            this.f6851n.setFocusable(true);
            this.f6851n.setFocusableInTouchMode(true);
            this.f6851n.setOnItemSelectedListener(new p145j.C1630I(r0, this));
            this.f6851n.setOnScrollListener(this.f6842A);
            c1681r.setContentView(this.f6851n);
        }
        android.graphics.drawable.Drawable background = c1681r.getBackground();
        android.graphics.Rect rect = this.f6845D;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f6855r) {
                this.f6854q = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int maxAvailableHeight = c1681r.getMaxAvailableHeight(this.f6860w, this.f6854q, c1681r.getInputMethodMode() == 2);
        int i6 = this.f6852o;
        int m3583a = this.f6851n.m3583a(i6 != -2 ? i6 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = m3583a + (m3583a > 0 ? this.f6851n.getPaddingBottom() + this.f6851n.getPaddingTop() + i4 : 0);
        this.f6848G.getInputMethodMode();
        c1681r.setWindowLayoutType(1002);
        if (c1681r.isShowing()) {
            android.view.View view = this.f6860w;
            java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
            if (view.isAttachedToWindow()) {
                int i7 = this.f6852o;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f6860w.getWidth();
                }
                c1681r.setOutsideTouchable(true);
                c1681r.update(this.f6860w, this.f6853p, this.f6854q, i7 < 0 ? -1 : i7, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i8 = this.f6852o;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f6860w.getWidth();
        }
        c1681r.setWidth(i8);
        c1681r.setHeight(paddingBottom);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = f6840H;
            if (method != null) {
                try {
                    method.invoke(c1681r, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c1681r.setIsClippedToScreen(true);
        }
        c1681r.setOutsideTouchable(true);
        c1681r.setTouchInterceptor(this.f6863z);
        if (this.f6857t) {
            c1681r.setOverlapAnchor(this.f6856s);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method2 = f6841I;
            if (method2 != null) {
                try {
                    method2.invoke(c1681r, this.f6846E);
                } catch (java.lang.Exception e4) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            c1681r.setEpicenterBounds(this.f6846E);
        }
        c1681r.showAsDropDown(this.f6860w, this.f6853p, this.f6854q, this.f6858u);
        this.f6851n.setSelection(-1);
        if ((!this.f6847F || this.f6851n.isInTouchMode()) && (c1636o = this.f6851n) != null) {
            c1636o.setListSelectionHidden(true);
            c1636o.requestLayout();
        }
        if (this.f6847F) {
            return;
        }
        this.f6844C.post(this.f6843B);
    }

    @Override // p140i.InterfaceC1525q
    public final void dismiss() {
        p145j.C1681r c1681r = this.f6848G;
        c1681r.dismiss();
        c1681r.setContentView(null);
        this.f6851n = null;
        this.f6844C.removeCallbacks(this.f6862y);
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: i */
    public final boolean mo3345i() {
        return this.f6848G.isShowing();
    }

    @Override // p140i.InterfaceC1525q
    /* renamed from: k */
    public final android.widget.ListView mo3347k() {
        return this.f6851n;
    }
}
