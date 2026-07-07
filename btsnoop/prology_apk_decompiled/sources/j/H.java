package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.AbstractC0248a;

/* loaded from: classes.dex */
public abstract class H extends ViewGroup {

    /* renamed from: l, reason: collision with root package name */
    public boolean f6570l;

    /* renamed from: m, reason: collision with root package name */
    public int f6571m;

    /* renamed from: n, reason: collision with root package name */
    public int f6572n;

    /* renamed from: o, reason: collision with root package name */
    public int f6573o;

    /* renamed from: p, reason: collision with root package name */
    public int f6574p;

    /* renamed from: q, reason: collision with root package name */
    public int f6575q;

    /* renamed from: r, reason: collision with root package name */
    public float f6576r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f6577t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f6578u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f6579v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f6580x;

    /* renamed from: y, reason: collision with root package name */
    public int f6581y;

    /* renamed from: z, reason: collision with root package name */
    public int f6582z;

    public H(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6570l = true;
        this.f6571m = -1;
        this.f6572n = 0;
        this.f6574p = 8388659;
        int[] iArr = AbstractC0248a.f5007j;
        android.support.v4.media.session.t q02 = android.support.v4.media.session.t.q0(context, attributeSet, iArr, i4);
        C.x.c(this, context, iArr, attributeSet, (TypedArray) q02.f3735n, i4);
        TypedArray typedArray = (TypedArray) q02.f3735n;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f6576r = typedArray.getFloat(4, -1.0f);
        this.f6571m = typedArray.getInt(3, -1);
        this.s = typedArray.getBoolean(7, false);
        setDividerDrawable(q02.g0(5));
        this.f6581y = typedArray.getInt(8, 0);
        this.f6582z = typedArray.getDimensionPixelSize(6, 0);
        q02.u0();
    }

    public final void b(Canvas canvas, int i4) {
        this.f6579v.setBounds(getPaddingLeft() + this.f6582z, i4, (getWidth() - getPaddingRight()) - this.f6582z, this.f6580x + i4);
        this.f6579v.draw(canvas);
    }

    public final void c(Canvas canvas, int i4) {
        this.f6579v.setBounds(i4, getPaddingTop() + this.f6582z, this.w + i4, (getHeight() - getPaddingBottom()) - this.f6582z);
        this.f6579v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof G;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public G generateDefaultLayoutParams() {
        int i4 = this.f6573o;
        if (i4 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i4 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public G generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public G generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean g(int i4) {
        if (i4 == 0) {
            return (this.f6581y & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f6581y & 4) != 0;
        }
        if ((this.f6581y & 2) == 0) {
            return false;
        }
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f6571m < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f6571m;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6571m == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f6572n;
        if (this.f6573o == 1 && (i4 = this.f6574p & 112) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6575q) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6575q;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((G) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6571m;
    }

    public Drawable getDividerDrawable() {
        return this.f6579v;
    }

    public int getDividerPadding() {
        return this.f6582z;
    }

    public int getDividerWidth() {
        return this.w;
    }

    public int getGravity() {
        return this.f6574p;
    }

    public int getOrientation() {
        return this.f6573o;
    }

    public int getShowDividers() {
        return this.f6581y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6576r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        if (this.f6579v == null) {
            return;
        }
        int i5 = 0;
        if (this.f6573o == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && g(i5)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((G) childAt.getLayoutParams())).topMargin) - this.f6580x);
                }
                i5++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f6580x : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((G) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a4 = v0.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i5)) {
                G g4 = (G) childAt3.getLayoutParams();
                c(canvas, a4 ? childAt3.getRight() + ((LinearLayout.LayoutParams) g4).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) g4).leftMargin) - this.w);
            }
            i5++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                G g5 = (G) childAt4.getLayoutParams();
                if (a4) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) g5).leftMargin;
                    i4 = this.w;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) g5).rightMargin;
                }
            } else if (a4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.w;
                right = left - i4;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.H.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.H.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f6570l = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f6571m = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6579v) {
            return;
        }
        this.f6579v = drawable;
        if (drawable != null) {
            this.w = drawable.getIntrinsicWidth();
            this.f6580x = drawable.getIntrinsicHeight();
        } else {
            this.w = 0;
            this.f6580x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f6582z = i4;
    }

    public void setGravity(int i4) {
        if (this.f6574p != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f6574p = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f6574p;
        if ((8388615 & i6) != i5) {
            this.f6574p = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.s = z4;
    }

    public void setOrientation(int i4) {
        if (this.f6573o != i4) {
            this.f6573o = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f6581y) {
            requestLayout();
        }
        this.f6581y = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f6574p;
        if ((i6 & 112) != i5) {
            this.f6574p = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f6576r = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
