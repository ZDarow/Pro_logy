package p145j;

/* renamed from: j.H */
/* loaded from: classes.dex */
public abstract class AbstractC1629H extends android.view.ViewGroup {

    /* renamed from: l */
    public boolean f6819l;

    /* renamed from: m */
    public int f6820m;

    /* renamed from: n */
    public int f6821n;

    /* renamed from: o */
    public int f6822o;

    /* renamed from: p */
    public int f6823p;

    /* renamed from: q */
    public int f6824q;

    /* renamed from: r */
    public float f6825r;

    /* renamed from: s */
    public boolean f6826s;

    /* renamed from: t */
    public int[] f6827t;

    /* renamed from: u */
    public int[] f6828u;

    /* renamed from: v */
    public android.graphics.drawable.Drawable f6829v;

    /* renamed from: w */
    public int f6830w;

    /* renamed from: x */
    public int f6831x;

    /* renamed from: y */
    public int f6832y;

    /* renamed from: z */
    public int f6833z;

    public AbstractC1629H(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6819l = true;
        this.f6820m = -1;
        this.f6821n = 0;
        this.f6823p = 8388659;
        int[] iArr = p121e.AbstractC1299a.f5194j;
        android.support.v4.media.session.C1061t m2202q0 = android.support.v4.media.session.C1061t.m2202q0(context, attributeSet, iArr, i4);
        p011C.AbstractC0132x.m463c(this, context, iArr, attributeSet, (android.content.res.TypedArray) m2202q0.f3862n, i4);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) m2202q0.f3862n;
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
        this.f6825r = typedArray.getFloat(4, -1.0f);
        this.f6820m = typedArray.getInt(3, -1);
        this.f6826s = typedArray.getBoolean(7, false);
        setDividerDrawable(m2202q0.m2225g0(5));
        this.f6832y = typedArray.getInt(8, 0);
        this.f6833z = typedArray.getDimensionPixelSize(6, 0);
        m2202q0.m2243u0();
    }

    /* renamed from: b */
    public final void m3585b(android.graphics.Canvas canvas, int i4) {
        this.f6829v.setBounds(getPaddingLeft() + this.f6833z, i4, (getWidth() - getPaddingRight()) - this.f6833z, this.f6831x + i4);
        this.f6829v.draw(canvas);
    }

    /* renamed from: c */
    public final void m3586c(android.graphics.Canvas canvas, int i4) {
        this.f6829v.setBounds(i4, getPaddingTop() + this.f6833z, this.f6830w + i4, (getHeight() - getPaddingBottom()) - this.f6833z);
        this.f6829v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p145j.C1628G;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public p145j.C1628G generateDefaultLayoutParams() {
        int i4 = this.f6822o;
        if (i4 == 0) {
            return new android.widget.LinearLayout.LayoutParams(-2, -2);
        }
        if (i4 == 1) {
            return new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public p145j.C1628G generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.widget.LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j.G, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p145j.C1628G generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.widget.LinearLayout.LayoutParams(layoutParams);
    }

    /* renamed from: g */
    public final boolean m3587g(int i4) {
        if (i4 == 0) {
            return (this.f6832y & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f6832y & 4) != 0;
        }
        if ((this.f6832y & 2) == 0) {
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
        if (this.f6820m < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f6820m;
        if (childCount <= i5) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6820m == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f6821n;
        if (this.f6822o == 1 && (i4 = this.f6823p & 112) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6824q) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6824q;
            }
        }
        return i6 + ((android.widget.LinearLayout.LayoutParams) ((p145j.C1628G) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6820m;
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.f6829v;
    }

    public int getDividerPadding() {
        return this.f6833z;
    }

    public int getDividerWidth() {
        return this.f6830w;
    }

    public int getGravity() {
        return this.f6823p;
    }

    public int getOrientation() {
        return this.f6822o;
    }

    public int getShowDividers() {
        return this.f6832y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6825r;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i4;
        if (this.f6829v == null) {
            return;
        }
        int i5 = 0;
        if (this.f6822o == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                android.view.View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && m3587g(i5)) {
                    m3585b(canvas, (childAt.getTop() - ((android.widget.LinearLayout.LayoutParams) ((p145j.C1628G) childAt.getLayoutParams())).topMargin) - this.f6831x);
                }
                i5++;
            }
            if (m3587g(virtualChildCount)) {
                android.view.View childAt2 = getChildAt(virtualChildCount - 1);
                m3585b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f6831x : childAt2.getBottom() + ((android.widget.LinearLayout.LayoutParams) ((p145j.C1628G) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m3632a = p145j.AbstractC1690v0.m3632a(this);
        while (i5 < virtualChildCount2) {
            android.view.View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m3587g(i5)) {
                p145j.C1628G c1628g = (p145j.C1628G) childAt3.getLayoutParams();
                m3586c(canvas, m3632a ? childAt3.getRight() + ((android.widget.LinearLayout.LayoutParams) c1628g).rightMargin : (childAt3.getLeft() - ((android.widget.LinearLayout.LayoutParams) c1628g).leftMargin) - this.f6830w);
            }
            i5++;
        }
        if (m3587g(virtualChildCount2)) {
            android.view.View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                p145j.C1628G c1628g2 = (p145j.C1628G) childAt4.getLayoutParams();
                if (m3632a) {
                    left = childAt4.getLeft() - ((android.widget.LinearLayout.LayoutParams) c1628g2).leftMargin;
                    i4 = this.f6830w;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((android.widget.LinearLayout.LayoutParams) c1628g2).rightMargin;
                }
            } else if (m3632a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f6830w;
                right = left - i4;
            }
            m3586c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
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
        throw new UnsupportedOperationException("Method not decompiled: p145j.AbstractC1629H.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p145j.AbstractC1629H.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f6819l = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f6820m = i4;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f6829v) {
            return;
        }
        this.f6829v = drawable;
        if (drawable != null) {
            this.f6830w = drawable.getIntrinsicWidth();
            this.f6831x = drawable.getIntrinsicHeight();
        } else {
            this.f6830w = 0;
            this.f6831x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f6833z = i4;
    }

    public void setGravity(int i4) {
        if (this.f6823p != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f6823p = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f6823p;
        if ((8388615 & i6) != i5) {
            this.f6823p = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f6826s = z4;
    }

    public void setOrientation(int i4) {
        if (this.f6822o != i4) {
            this.f6822o = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f6832y) {
            requestLayout();
        }
        this.f6832y = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f6823p;
        if ((i6 & 112) != i5) {
            this.f6823p = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f6825r = java.lang.Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
