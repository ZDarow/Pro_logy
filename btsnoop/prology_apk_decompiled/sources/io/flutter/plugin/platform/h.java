package io.flutter.plugin.platform;

import B2.C0000a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public int f6338l;

    /* renamed from: m, reason: collision with root package name */
    public int f6339m;

    /* renamed from: n, reason: collision with root package name */
    public int f6340n;

    /* renamed from: o, reason: collision with root package name */
    public int f6341o;

    /* renamed from: p, reason: collision with root package name */
    public C0000a f6342p;

    /* renamed from: q, reason: collision with root package name */
    public g f6343q;

    /* renamed from: r, reason: collision with root package name */
    public G2.a f6344r;

    public h(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar = this.f6343q;
        if (gVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = gVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f6343q.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f6344r;
    }

    public int getRenderTargetHeight() {
        g gVar = this.f6343q;
        if (gVar != null) {
            return gVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        g gVar = this.f6343q;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6342p == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f6340n;
            this.f6338l = i4;
            int i5 = this.f6341o;
            this.f6339m = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f6340n, this.f6341o);
        } else {
            matrix.postTranslate(this.f6338l, this.f6339m);
            this.f6338l = this.f6340n;
            this.f6339m = this.f6341o;
        }
        this.f6342p.c(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f6340n = layoutParams.leftMargin;
        this.f6341o = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        G2.a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f6344r) != null) {
            this.f6344r = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f6344r == null) {
            G2.a aVar2 = new G2.a(this, onFocusChangeListener);
            this.f6344r = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }

    public void setTouchProcessor(C0000a c0000a) {
        this.f6342p = c0000a;
    }
}
