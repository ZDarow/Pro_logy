package p145j;

/* renamed from: j.F */
/* loaded from: classes.dex */
public final class RunnableC1627F implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6817l;

    /* renamed from: m */
    public final /* synthetic */ p140i.ViewOnTouchListenerC1509a f6818m;

    public /* synthetic */ RunnableC1627F(p140i.ViewOnTouchListenerC1509a viewOnTouchListenerC1509a, int i4) {
        this.f6817l = i4;
        this.f6818m = viewOnTouchListenerC1509a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6817l) {
            case 0:
                android.view.ViewParent parent = this.f6818m.f6225d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                p140i.ViewOnTouchListenerC1509a viewOnTouchListenerC1509a = this.f6818m;
                viewOnTouchListenerC1509a.m3335a();
                android.view.View view = viewOnTouchListenerC1509a.f6225d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC1509a.m3337c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC1509a.f6228g = true;
                    return;
                }
                return;
        }
    }
}
