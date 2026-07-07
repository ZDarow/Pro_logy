package Q;

import android.os.Bundle;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f1537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f1538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar) {
        super(tVar);
        this.f1538f = tVar;
        this.f1537e = tVar;
    }

    @Override // Q.i
    public final void e(String str, Bundle bundle) {
        if (bundle != null) {
            ((j) this.f1531b).notifyChildrenChanged(str, bundle);
        } else {
            super.e(str, bundle);
        }
    }
}
