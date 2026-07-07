package p064Q;

/* renamed from: Q.q */
/* loaded from: classes.dex */
public final class RunnableC0545q implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ p043K2.C0339o f1608l;

    /* renamed from: m */
    public final /* synthetic */ int f1609m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.String f1610n;

    /* renamed from: o */
    public final /* synthetic */ int f1611o;

    /* renamed from: p */
    public final /* synthetic */ p043K2.C0339o f1612p;

    public RunnableC0545q(int i4, int i5, p043K2.C0339o c0339o, p043K2.C0339o c0339o2, android.os.Bundle bundle, java.lang.String str) {
        this.f1612p = c0339o;
        this.f1608l = c0339o2;
        this.f1609m = i4;
        this.f1610n = str;
        this.f1611o = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p064Q.C0534f c0534f;
        p043K2.C0339o c0339o = this.f1608l;
        android.os.IBinder binder = ((android.os.Messenger) c0339o.f1048m).getBinder();
        p043K2.C0339o c0339o2 = this.f1612p;
        ((p064Q.AbstractServiceC0548t) c0339o2.f1048m).f1626p.remove(binder);
        p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) c0339o2.f1048m;
        java.util.Iterator it = abstractServiceC0548t.f1625o.iterator();
        while (true) {
            c0534f = null;
            if (!it.hasNext()) {
                break;
            }
            p064Q.C0534f c0534f2 = (p064Q.C0534f) it.next();
            if (c0534f2.f1570c == this.f1609m) {
                if (android.text.TextUtils.isEmpty(this.f1610n) || this.f1611o <= 0) {
                    c0534f = new p064Q.C0534f((p064Q.AbstractServiceC0548t) c0339o2.f1048m, c0534f2.f1568a, c0534f2.f1569b, c0534f2.f1570c, c0339o);
                }
                it.remove();
            }
        }
        if (c0534f == null) {
            c0534f = new p064Q.C0534f((p064Q.AbstractServiceC0548t) c0339o2.f1048m, this.f1610n, this.f1611o, this.f1609m, c0339o);
        }
        abstractServiceC0548t.f1626p.put(binder, c0534f);
        try {
            binder.linkToDeath(c0534f, 0);
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
