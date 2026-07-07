package p064Q;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public class C0539k extends p064Q.AbstractC0537i {

    /* renamed from: e */
    public final /* synthetic */ p064Q.AbstractServiceC0548t f1588e;

    /* renamed from: f */
    public final /* synthetic */ p064Q.AbstractServiceC0548t f1589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539k(p064Q.AbstractServiceC0548t abstractServiceC0548t) {
        super(abstractServiceC0548t);
        this.f1589f = abstractServiceC0548t;
        this.f1588e = abstractServiceC0548t;
    }

    @Override // p064Q.AbstractC0537i
    /* renamed from: e */
    public final void mo1046e(java.lang.String str, android.os.Bundle bundle) {
        if (bundle != null) {
            ((p064Q.C0538j) this.f1582b).notifyChildrenChanged(str, bundle);
        } else {
            super.mo1046e(str, bundle);
        }
    }
}
