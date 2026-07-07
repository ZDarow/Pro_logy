package p145j;

/* renamed from: j.n0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1674n0 implements android.view.View.OnClickListener {

    /* renamed from: l */
    public final /* synthetic */ int f6979l = 0;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f6980m;

    public ViewOnClickListenerC1674n0(p145j.C1684s0 c1684s0) {
        this.f6980m = c1684s0;
        c1684s0.f6998a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.f6979l) {
            case 0:
                p145j.C1676o0 c1676o0 = ((androidx.appcompat.widget.Toolbar) this.f6980m).f4062T;
                p140i.MenuItemC1518j menuItemC1518j = c1676o0 == null ? null : c1676o0.f6985m;
                if (menuItemC1518j != null) {
                    menuItemC1518j.collapseActionView();
                    return;
                }
                return;
            default:
                p145j.C1684s0 c1684s0 = (p145j.C1684s0) this.f6980m;
                if (c1684s0.f7008k != null) {
                    c1684s0.getClass();
                    return;
                }
                return;
        }
    }

    public ViewOnClickListenerC1674n0(androidx.appcompat.widget.Toolbar toolbar) {
        this.f6980m = toolbar;
    }
}
