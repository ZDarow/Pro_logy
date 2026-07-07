package G;

import android.database.DataSetObserver;
import j.M;
import j.h0;

/* loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f651b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f650a = i4;
        this.f651b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f650a) {
            case 0:
                h0 h0Var = (h0) this.f651b;
                h0Var.f652l = true;
                h0Var.notifyDataSetChanged();
                return;
            default:
                M m4 = (M) this.f651b;
                if (m4.f6597G.isShowing()) {
                    m4.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f650a) {
            case 0:
                h0 h0Var = (h0) this.f651b;
                h0Var.f652l = false;
                h0Var.notifyDataSetInvalidated();
                return;
            default:
                ((M) this.f651b).dismiss();
                return;
        }
    }
}
