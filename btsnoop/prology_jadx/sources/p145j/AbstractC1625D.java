package p145j;

/* renamed from: j.D */
/* loaded from: classes.dex */
public abstract class AbstractC1625D extends android.widget.ListView {

    /* renamed from: l */
    public final android.graphics.Rect f6804l;

    /* renamed from: m */
    public int f6805m;

    /* renamed from: n */
    public int f6806n;

    /* renamed from: o */
    public int f6807o;

    /* renamed from: p */
    public int f6808p;

    /* renamed from: q */
    public int f6809q;

    /* renamed from: r */
    public final java.lang.reflect.Field f6810r;

    /* renamed from: s */
    public p145j.C1624C f6811s;

    /* renamed from: t */
    public boolean f6812t;

    /* renamed from: u */
    public final boolean f6813u;

    /* renamed from: v */
    public boolean f6814v;

    /* renamed from: w */
    public p024F.ViewOnTouchListenerC0203f f6815w;

    /* renamed from: x */
    public p024F.RunnableC0199b f6816x;

    public AbstractC1625D(android.content.Context context, boolean z4) {
        super(context, null, com.prology.R.attr.dropDownListViewStyle);
        this.f6804l = new android.graphics.Rect();
        this.f6805m = 0;
        this.f6806n = 0;
        this.f6807o = 0;
        this.f6808p = 0;
        this.f6813u = z4;
        setCacheColorHint(0);
        try {
            java.lang.reflect.Field declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f6810r = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    public final int m3583a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        android.view.View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i4, i9 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i5) {
                return i5;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3584b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p145j.AbstractC1625D.m3584b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.f6804l;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6816x != null) {
            return;
        }
        super.drawableStateChanged();
        p145j.C1624C c1624c = this.f6811s;
        if (c1624c != null) {
            c1624c.f6803m = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.f6814v && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6813u || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6813u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6813u || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6813u && this.f6812t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6816x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6816x == null) {
            p024F.RunnableC0199b runnableC0199b = new p024F.RunnableC0199b(7, this);
            this.f6816x = runnableC0199b;
            post(runnableC0199b);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                android.graphics.drawable.Drawable selector = getSelector();
                if (selector != null && this.f6814v && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6809q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        p024F.RunnableC0199b runnableC0199b = this.f6816x;
        if (runnableC0199b != null) {
            p145j.AbstractC1625D abstractC1625D = (p145j.AbstractC1625D) runnableC0199b.f554m;
            abstractC1625D.f6816x = null;
            abstractC1625D.removeCallbacks(runnableC0199b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f6812t = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, j.C] */
    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        p145j.C1624C c1624c = null;
        if (drawable != 0) {
            ?? drawable2 = new android.graphics.drawable.Drawable();
            android.graphics.drawable.Drawable drawable3 = drawable2.f6802l;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f6802l = drawable;
            drawable.setCallback(drawable2);
            drawable2.f6803m = true;
            c1624c = drawable2;
        }
        this.f6811s = c1624c;
        super.setSelector(c1624c);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f6805m = rect.left;
        this.f6806n = rect.top;
        this.f6807o = rect.right;
        this.f6808p = rect.bottom;
    }
}
