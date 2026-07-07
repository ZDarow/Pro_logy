package G2;

import B2.C0000a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public FlutterMutatorsStack f688l;

    /* renamed from: m, reason: collision with root package name */
    public final float f689m;

    /* renamed from: n, reason: collision with root package name */
    public int f690n;

    /* renamed from: o, reason: collision with root package name */
    public int f691o;

    /* renamed from: p, reason: collision with root package name */
    public int f692p;

    /* renamed from: q, reason: collision with root package name */
    public int f693q;

    /* renamed from: r, reason: collision with root package name */
    public final C0000a f694r;
    public final Paint s;

    /* renamed from: t, reason: collision with root package name */
    public a f695t;

    public b(Activity activity, float f4, C0000a c0000a) {
        super(activity, null);
        this.f689m = f4;
        this.f694r = c0000a;
        this.s = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f688l.getFinalMatrix());
        float f4 = this.f689m;
        matrix.preScale(1.0f / f4, 1.0f / f4);
        matrix.postTranslate(-this.f690n, -this.f691o);
        return matrix;
    }

    public final void a() {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (aVar = this.f695t) == null) {
            return;
        }
        this.f695t = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f688l.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f690n, -this.f691o);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f688l.getFinalOpacity() * 255.0f);
        Paint paint = this.s;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f688l.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0000a c0000a = this.f694r;
        if (c0000a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f690n;
            this.f692p = i4;
            int i5 = this.f691o;
            this.f693q = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f690n, this.f691o);
        } else {
            matrix.postTranslate(this.f692p, this.f693q);
            this.f692p = this.f690n;
            this.f693q = this.f691o;
        }
        c0000a.c(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f695t == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.f695t = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
