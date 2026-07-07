package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* renamed from: l */
    public int f4080l;

    /* renamed from: m */
    public int f4081m;

    /* renamed from: n */
    public java.lang.ref.WeakReference f4082n;

    /* renamed from: o */
    public android.view.LayoutInflater f4083o;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4080l = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p121e.AbstractC1299a.f5206v, 0, 0);
        this.f4081m = obtainStyledAttributes.getResourceId(2, -1);
        this.f4080l = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4081m;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.f4083o;
    }

    public int getLayoutResource() {
        return this.f4080l;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f4081m = i4;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.f4083o = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f4080l = i4;
    }

    public void setOnInflateListener(p145j.InterfaceC1688u0 interfaceC1688u0) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        java.lang.ref.WeakReference weakReference = this.f4082n;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (view == null) {
                throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            android.view.ViewParent parent = getParent();
            if (!(parent instanceof android.view.ViewGroup)) {
                throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f4080l == 0) {
                throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            android.view.LayoutInflater layoutInflater = this.f4083o;
            if (layoutInflater == null) {
                layoutInflater = android.view.LayoutInflater.from(getContext());
            }
            android.view.View inflate = layoutInflater.inflate(this.f4080l, viewGroup, false);
            int i5 = this.f4081m;
            if (i5 != -1) {
                inflate.setId(i5);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f4082n = new java.lang.ref.WeakReference(inflate);
        }
    }
}
