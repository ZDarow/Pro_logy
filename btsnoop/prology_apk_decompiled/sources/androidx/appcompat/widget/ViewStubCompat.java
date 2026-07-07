package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.AbstractC0248a;
import j.u0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: l, reason: collision with root package name */
    public int f3936l;

    /* renamed from: m, reason: collision with root package name */
    public int f3937m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f3938n;

    /* renamed from: o, reason: collision with root package name */
    public LayoutInflater f3939o;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3936l = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0248a.f5018v, 0, 0);
        this.f3937m = obtainStyledAttributes.getResourceId(2, -1);
        this.f3936l = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3937m;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3939o;
    }

    public int getLayoutResource() {
        return this.f3936l;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f3937m = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3939o = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f3936l = i4;
    }

    public void setOnInflateListener(u0 u0Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f3938n;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f3936l == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f3939o;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3936l, viewGroup, false);
            int i5 = this.f3937m;
            if (i5 != -1) {
                inflate.setId(i5);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3938n = new WeakReference(inflate);
        }
    }
}
