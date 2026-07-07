package p064Q;

/* renamed from: Q.o */
/* loaded from: classes.dex */
public final class RunnableC0543o implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1600l;

    /* renamed from: m */
    public final /* synthetic */ p043K2.C0339o f1601m;

    /* renamed from: n */
    public final /* synthetic */ p043K2.C0339o f1602n;

    public /* synthetic */ RunnableC0543o(p043K2.C0339o c0339o, p043K2.C0339o c0339o2, int i4) {
        this.f1600l = i4;
        this.f1602n = c0339o;
        this.f1601m = c0339o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1600l) {
            case 0:
                p064Q.C0534f c0534f = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) this.f1602n.f1048m).f1626p.remove(((android.os.Messenger) this.f1601m.f1048m).getBinder());
                if (c0534f != null) {
                    ((android.os.Messenger) c0534f.f1571d.f1048m).getBinder().unlinkToDeath(c0534f, 0);
                    return;
                }
                return;
            default:
                android.os.IBinder binder = ((android.os.Messenger) this.f1601m.f1048m).getBinder();
                p064Q.C0534f c0534f2 = (p064Q.C0534f) ((p064Q.AbstractServiceC0548t) this.f1602n.f1048m).f1626p.remove(binder);
                if (c0534f2 != null) {
                    binder.unlinkToDeath(c0534f2, 0);
                    return;
                }
                return;
        }
    }
}
