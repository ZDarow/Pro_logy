package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.p */
/* loaded from: classes.dex */
public final class C1593p extends android.view.ViewGroup {

    /* renamed from: l */
    public final android.graphics.Rect f6632l;

    /* renamed from: m */
    public final android.graphics.Rect f6633m;

    public C1593p(android.content.Context context) {
        super(context);
        this.f6632l = new android.graphics.Rect();
        this.f6633m = new android.graphics.Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            android.view.View childAt = getChildAt(i8);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f6632l.set(i4, i5, i6, i7);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f6632l, layoutParams.x, layoutParams.y, this.f6633m);
            android.graphics.Rect rect = this.f6633m;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i4), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i5), Integer.MIN_VALUE));
        }
        super.onMeasure(i4, i5);
    }
}
