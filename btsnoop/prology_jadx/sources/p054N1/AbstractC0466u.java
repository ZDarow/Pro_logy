package p054N1;

/* renamed from: N1.u */
/* loaded from: classes.dex */
public abstract class AbstractC0466u {

    /* renamed from: a */
    public final int f1359a;

    public AbstractC0466u(int i4) {
        this.f1359a = i4;
    }

    /* renamed from: g */
    public static com.google.android.gms.common.api.Status m980g(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* renamed from: a */
    public abstract boolean mo944a(p054N1.C0460o c0460o);

    /* renamed from: b */
    public abstract p046L1.C0359c[] mo945b(p054N1.C0460o c0460o);

    /* renamed from: c */
    public abstract void mo946c(com.google.android.gms.common.api.Status status);

    /* renamed from: d */
    public abstract void mo947d(java.lang.RuntimeException runtimeException);

    /* renamed from: e */
    public abstract void mo948e(p054N1.C0460o c0460o);

    /* renamed from: f */
    public abstract void mo949f(p008B1.C0026d c0026d, boolean z4);
}
