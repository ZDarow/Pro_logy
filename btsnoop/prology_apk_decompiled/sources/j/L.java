package j;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class L implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f6588a;

    public L(M m4) {
        this.f6588a = m4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        M m4 = this.f6588a;
        if (action == 0 && (rVar = m4.f6597G) != null && rVar.isShowing() && x3 >= 0 && x3 < m4.f6597G.getWidth() && y4 >= 0 && y4 < m4.f6597G.getHeight()) {
            m4.f6593C.postDelayed(m4.f6609y, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        m4.f6593C.removeCallbacks(m4.f6609y);
        return false;
    }
}
