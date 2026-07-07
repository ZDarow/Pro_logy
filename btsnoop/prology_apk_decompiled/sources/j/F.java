package j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import i.ViewOnTouchListenerC0320a;

/* loaded from: classes.dex */
public final class F implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0320a f6569m;

    public /* synthetic */ F(ViewOnTouchListenerC0320a viewOnTouchListenerC0320a, int i4) {
        this.f6568l = i4;
        this.f6569m = viewOnTouchListenerC0320a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6568l) {
            case 0:
                ViewParent parent = this.f6569m.f6005d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                ViewOnTouchListenerC0320a viewOnTouchListenerC0320a = this.f6569m;
                viewOnTouchListenerC0320a.a();
                View view = viewOnTouchListenerC0320a.f6005d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0320a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0320a.f6008g = true;
                    return;
                }
                return;
        }
    }
}
