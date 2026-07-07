package j;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import i.MenuItemC0329j;

/* loaded from: classes.dex */
public final class n0 implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6721l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6722m;

    public n0(s0 s0Var) {
        this.f6722m = s0Var;
        s0Var.f6740a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6721l) {
            case 0:
                o0 o0Var = ((Toolbar) this.f6722m).f3920T;
                MenuItemC0329j menuItemC0329j = o0Var == null ? null : o0Var.f6727m;
                if (menuItemC0329j != null) {
                    menuItemC0329j.collapseActionView();
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.f6722m;
                if (s0Var.f6750k != null) {
                    s0Var.getClass();
                    return;
                }
                return;
        }
    }

    public n0(Toolbar toolbar) {
        this.f6722m = toolbar;
    }
}
