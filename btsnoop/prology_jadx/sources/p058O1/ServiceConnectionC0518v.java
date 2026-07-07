package p058O1;

/* renamed from: O1.v */
/* loaded from: classes.dex */
public final class ServiceConnectionC0518v implements android.content.ServiceConnection {

    /* renamed from: l */
    public final int f1533l;

    /* renamed from: m */
    public final /* synthetic */ com.google.android.gms.common.internal.AbstractC1253a f1534m;

    public ServiceConnectionC0518v(com.google.android.gms.common.internal.AbstractC1253a abstractC1253a, int i4) {
        this.f1534m = abstractC1253a;
        this.f1533l = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i4;
        int i5;
        com.google.android.gms.common.internal.AbstractC1253a abstractC1253a = this.f1534m;
        if (iBinder == null) {
            synchronized (abstractC1253a.f4928q) {
                i4 = abstractC1253a.f4935x;
            }
            if (i4 == 3) {
                abstractC1253a.f4919E = true;
                i5 = 5;
            } else {
                i5 = 4;
            }
            p058O1.HandlerC0516t handlerC0516t = abstractC1253a.f4927p;
            handlerC0516t.sendMessage(handlerC0516t.obtainMessage(i5, abstractC1253a.f4921G.get(), 16));
            return;
        }
        synchronized (abstractC1253a.f4929r) {
            try {
                com.google.android.gms.common.internal.AbstractC1253a abstractC1253a2 = this.f1534m;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1253a2.f4930s = (queryLocalInterface == null || !(queryLocalInterface instanceof p058O1.C0514r)) ? new p058O1.C0514r(iBinder) : (p058O1.C0514r) queryLocalInterface;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.AbstractC1253a abstractC1253a3 = this.f1534m;
        int i6 = this.f1533l;
        abstractC1253a3.getClass();
        p058O1.C0520x c0520x = new p058O1.C0520x(abstractC1253a3, 0);
        p058O1.HandlerC0516t handlerC0516t2 = abstractC1253a3.f4927p;
        handlerC0516t2.sendMessage(handlerC0516t2.obtainMessage(7, i6, -1, c0520x));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.AbstractC1253a abstractC1253a;
        synchronized (this.f1534m.f4929r) {
            abstractC1253a = this.f1534m;
            abstractC1253a.f4930s = null;
        }
        int i4 = this.f1533l;
        p058O1.HandlerC0516t handlerC0516t = abstractC1253a.f4927p;
        handlerC0516t.sendMessage(handlerC0516t.obtainMessage(6, i4, 1));
    }
}
