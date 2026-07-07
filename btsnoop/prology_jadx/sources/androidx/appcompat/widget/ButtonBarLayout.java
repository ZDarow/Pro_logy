package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* renamed from: l */
    public boolean f3949l;

    /* renamed from: m */
    public int f3950m;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3950m = -1;
        int[] iArr = p121e.AbstractC1299a.f5193i;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        p011C.AbstractC0132x.m463c(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f3949l = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z4) {
        setOrientation(z4 ? 1 : 0);
        setGravity(z4 ? 8388613 : 80);
        android.view.View findViewById = findViewById(com.prology.R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z4 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return java.lang.Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        int size = android.view.View.MeasureSpec.getSize(i4);
        if (this.f3949l) {
            if (size > this.f3950m && getOrientation() == 1) {
                setStacked(false);
            }
            this.f3950m = size;
        }
        if ((getOrientation() == 1) || android.view.View.MeasureSpec.getMode(i4) != 1073741824) {
            i6 = i4;
            z4 = false;
        } else {
            i6 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f3949l && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i7 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            android.view.View childAt = getChildAt(i8);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
                r3 = i7 >= 0 ? getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f3949l != z4) {
            this.f3949l = z4;
            if (!z4 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
