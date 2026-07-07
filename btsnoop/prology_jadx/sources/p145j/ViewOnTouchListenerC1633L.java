package p145j;

/* renamed from: j.L */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1633L implements android.view.View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ p145j.AbstractC1634M f6839a;

    public ViewOnTouchListenerC1633L(p145j.AbstractC1634M abstractC1634M) {
        this.f6839a = abstractC1634M;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        p145j.C1681r c1681r;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        p145j.AbstractC1634M abstractC1634M = this.f6839a;
        if (action == 0 && (c1681r = abstractC1634M.f6848G) != null && c1681r.isShowing() && x3 >= 0 && x3 < abstractC1634M.f6848G.getWidth() && y4 >= 0 && y4 < abstractC1634M.f6848G.getHeight()) {
            abstractC1634M.f6844C.postDelayed(abstractC1634M.f6862y, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC1634M.f6844C.removeCallbacks(abstractC1634M.f6862y);
        return false;
    }
}
