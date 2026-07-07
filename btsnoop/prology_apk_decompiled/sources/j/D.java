package j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.prology.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class D extends ListView {

    /* renamed from: l, reason: collision with root package name */
    public final Rect f6557l;

    /* renamed from: m, reason: collision with root package name */
    public int f6558m;

    /* renamed from: n, reason: collision with root package name */
    public int f6559n;

    /* renamed from: o, reason: collision with root package name */
    public int f6560o;

    /* renamed from: p, reason: collision with root package name */
    public int f6561p;

    /* renamed from: q, reason: collision with root package name */
    public int f6562q;

    /* renamed from: r, reason: collision with root package name */
    public final Field f6563r;
    public C s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6564t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6565u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6566v;
    public F.f w;

    /* renamed from: x, reason: collision with root package name */
    public F.b f6567x;

    public D(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6557l = new Rect();
        this.f6558m = 0;
        this.f6559n = 0;
        this.f6560o = 0;
        this.f6561p = 0;
        this.f6565u = z4;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f6563r = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final int a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i4, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.D.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6557l;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6567x != null) {
            return;
        }
        super.drawableStateChanged();
        C c4 = this.s;
        if (c4 != null) {
            c4.f6556m = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6566v && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6565u || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6565u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6565u || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6565u && this.f6564t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6567x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6567x == null) {
            F.b bVar = new F.b(7, this);
            this.f6567x = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f6566v && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6562q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F.b bVar = this.f6567x;
        if (bVar != null) {
            D d4 = (D) bVar.f544m;
            d4.f6567x = null;
            d4.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f6564t = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, j.C] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C c4 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f6555l;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f6555l = drawable;
            drawable.setCallback(drawable2);
            drawable2.f6556m = true;
            c4 = drawable2;
        }
        this.s = c4;
        super.setSelector(c4);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f6558m = rect.left;
        this.f6559n = rect.top;
        this.f6560o = rect.right;
        this.f6561p = rect.bottom;
    }
}
