package Y2;

import Y.x;
import android.widget.Toast$Callback;

/* loaded from: classes.dex */
public final class b extends Toast$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f3127a;

    public b(x xVar) {
        this.f3127a = xVar;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f3127a.f3066n = null;
    }
}
