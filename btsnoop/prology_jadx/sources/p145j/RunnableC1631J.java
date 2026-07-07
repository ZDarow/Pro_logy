package p145j;

/* renamed from: j.J */
/* loaded from: classes.dex */
public final class RunnableC1631J implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f6836l;

    /* renamed from: m */
    public final /* synthetic */ p145j.AbstractC1634M f6837m;

    public /* synthetic */ RunnableC1631J(p145j.AbstractC1634M abstractC1634M, int i4) {
        this.f6836l = i4;
        this.f6837m = abstractC1634M;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p145j.AbstractC1634M abstractC1634M = this.f6837m;
        switch (this.f6836l) {
            case 0:
                p145j.C1636O c1636o = abstractC1634M.f6851n;
                if (c1636o != null) {
                    c1636o.setListSelectionHidden(true);
                    c1636o.requestLayout();
                    return;
                }
                return;
            default:
                p145j.C1636O c1636o2 = abstractC1634M.f6851n;
                if (c1636o2 != null) {
                    java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                    if (!c1636o2.isAttachedToWindow() || abstractC1634M.f6851n.getCount() <= abstractC1634M.f6851n.getChildCount() || abstractC1634M.f6851n.getChildCount() > Integer.MAX_VALUE) {
                        return;
                    }
                    abstractC1634M.f6848G.setInputMethodMode(2);
                    abstractC1634M.mo3341c();
                    return;
                }
                return;
        }
    }
}
