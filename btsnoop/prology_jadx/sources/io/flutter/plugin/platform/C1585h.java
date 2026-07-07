package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.h */
/* loaded from: classes.dex */
public final class C1585h extends android.widget.FrameLayout {

    /* renamed from: l */
    public int f6573l;

    /* renamed from: m */
    public int f6574m;

    /* renamed from: n */
    public int f6575n;

    /* renamed from: o */
    public int f6576o;

    /* renamed from: p */
    public p009B2.C0044a f6577p;

    /* renamed from: q */
    public io.flutter.plugin.platform.InterfaceC1584g f6578q;

    /* renamed from: r */
    public p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a f6579r;

    public C1585h(android.app.Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = this.f6578q;
        if (interfaceC1584g == null) {
            super.draw(canvas);
            android.util.Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        android.view.Surface surface = interfaceC1584g.getSurface();
        if (!surface.isValid()) {
            android.util.Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f6578q.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public android.view.ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f6579r;
    }

    public int getRenderTargetHeight() {
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = this.f6578q;
        if (interfaceC1584g != null) {
            return interfaceC1584g.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = this.f6578q;
        if (interfaceC1584g != null) {
            return interfaceC1584g.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f6577p == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f6575n;
            this.f6573l = i4;
            int i5 = this.f6576o;
            this.f6574m = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f6575n, this.f6576o);
        } else {
            matrix.postTranslate(this.f6573l, this.f6574m);
            this.f6573l = this.f6575n;
            this.f6574m = this.f6576o;
        }
        this.f6577p.m126c(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(android.widget.FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
        this.f6575n = layoutParams.leftMargin;
        this.f6576o = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a viewTreeObserverOnGlobalFocusChangeListenerC0239a;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (viewTreeObserverOnGlobalFocusChangeListenerC0239a = this.f6579r) != null) {
            this.f6579r = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0239a);
        }
        android.view.ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f6579r == null) {
            p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a viewTreeObserverOnGlobalFocusChangeListenerC0239a2 = new p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a(this, onFocusChangeListener);
            this.f6579r = viewTreeObserverOnGlobalFocusChangeListenerC0239a2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0239a2);
        }
    }

    public void setTouchProcessor(p009B2.C0044a c0044a) {
        this.f6577p = c0044a;
    }
}
