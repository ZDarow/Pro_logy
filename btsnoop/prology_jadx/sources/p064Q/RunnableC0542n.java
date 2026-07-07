package p064Q;

/* renamed from: Q.n */
/* loaded from: classes.dex */
public final class RunnableC0542n implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ p043K2.C0339o f1594l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.String f1595m;

    /* renamed from: n */
    public final /* synthetic */ int f1596n;

    /* renamed from: o */
    public final /* synthetic */ int f1597o;

    /* renamed from: p */
    public final /* synthetic */ android.os.Bundle f1598p;

    /* renamed from: q */
    public final /* synthetic */ p043K2.C0339o f1599q;

    public RunnableC0542n(int i4, int i5, p043K2.C0339o c0339o, p043K2.C0339o c0339o2, android.os.Bundle bundle, java.lang.String str) {
        this.f1599q = c0339o;
        this.f1594l = c0339o2;
        this.f1595m = str;
        this.f1596n = i4;
        this.f1597o = i5;
        this.f1598p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p043K2.C0339o c0339o = this.f1594l;
        android.os.IBinder binder = ((android.os.Messenger) c0339o.f1048m).getBinder();
        p043K2.C0339o c0339o2 = this.f1599q;
        ((p064Q.AbstractServiceC0548t) c0339o2.f1048m).f1626p.remove(binder);
        java.lang.String str = this.f1595m;
        p064Q.C0534f c0534f = new p064Q.C0534f((p064Q.AbstractServiceC0548t) c0339o2.f1048m, str, this.f1596n, this.f1597o, c0339o);
        p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) c0339o2.f1048m;
        abstractServiceC0548t.getClass();
        c0534f.f1573f = abstractServiceC0548t.mo1057b(this.f1598p);
        abstractServiceC0548t.getClass();
        if (c0534f.f1573f == null) {
            android.util.Log.i("MBServiceCompat", "No root for client " + str + " from service " + p064Q.RunnableC0542n.class.getName());
            try {
                c0339o.m754M(2, null);
                return;
            } catch (android.os.RemoteException unused) {
                android.util.Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            abstractServiceC0548t.f1626p.put(binder, c0534f);
            binder.linkToDeath(c0534f, 0);
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = abstractServiceC0548t.f1628r;
            if (mediaSessionCompat$Token != null) {
                p008B1.C0026d c0026d = c0534f.f1573f;
                java.lang.String str2 = (java.lang.String) c0026d.f99m;
                android.os.Bundle bundle = (android.os.Bundle) c0026d.f100n;
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                c0339o.m754M(1, bundle2);
            }
        } catch (android.os.RemoteException unused2) {
            android.util.Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            abstractServiceC0548t.f1626p.remove(binder);
        }
    }
}
