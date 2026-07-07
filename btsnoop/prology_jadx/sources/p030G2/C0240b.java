package p030G2;

/* renamed from: G2.b */
/* loaded from: classes.dex */
public final class C0240b extends android.widget.FrameLayout {

    /* renamed from: l */
    public io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack f698l;

    /* renamed from: m */
    public final float f699m;

    /* renamed from: n */
    public int f700n;

    /* renamed from: o */
    public int f701o;

    /* renamed from: p */
    public int f702p;

    /* renamed from: q */
    public int f703q;

    /* renamed from: r */
    public final p009B2.C0044a f704r;

    /* renamed from: s */
    public final android.graphics.Paint f705s;

    /* renamed from: t */
    public p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a f706t;

    public C0240b(android.app.Activity activity, float f4, p009B2.C0044a c0044a) {
        super(activity, null);
        this.f699m = f4;
        this.f704r = c0044a;
        this.f705s = new android.graphics.Paint();
    }

    private android.graphics.Matrix getPlatformViewMatrix() {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f698l.getFinalMatrix());
        float f4 = this.f699m;
        matrix.preScale(1.0f / f4, 1.0f / f4);
        matrix.postTranslate(-this.f700n, -this.f701o);
        return matrix;
    }

    /* renamed from: a */
    public final void m650a() {
        p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a viewTreeObserverOnGlobalFocusChangeListenerC0239a;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (viewTreeObserverOnGlobalFocusChangeListenerC0239a = this.f706t) == null) {
            return;
        }
        this.f706t = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0239a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        canvas.save();
        java.util.Iterator<android.graphics.Path> it = this.f698l.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            android.graphics.Path path = new android.graphics.Path(it.next());
            path.offset(-this.f700n, -this.f701o);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f698l.getFinalOpacity() * 255.0f);
        android.graphics.Paint paint = this.f705s;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f698l.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p009B2.C0044a c0044a = this.f704r;
        if (c0044a == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f700n;
            this.f702p = i4;
            int i5 = this.f701o;
            this.f703q = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f700n, this.f701o);
        } else {
            matrix.postTranslate(this.f702p, this.f703q);
            this.f702p = this.f700n;
            this.f703q = this.f701o;
        }
        c0044a.m126c(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        m650a();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f706t == null) {
            p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a viewTreeObserverOnGlobalFocusChangeListenerC0239a = new p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a(onFocusChangeListener, this);
            this.f706t = viewTreeObserverOnGlobalFocusChangeListenerC0239a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0239a);
        }
    }
}
