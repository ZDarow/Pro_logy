package p064Q;

/* renamed from: Q.d */
/* loaded from: classes.dex */
public final class C0532d extends p064Q.AbstractC0541m {

    /* renamed from: e */
    public final /* synthetic */ p064Q.C0534f f1561e;

    /* renamed from: f */
    public final /* synthetic */ java.lang.String f1562f;

    /* renamed from: g */
    public final /* synthetic */ android.os.Bundle f1563g;

    /* renamed from: h */
    public final /* synthetic */ android.os.Bundle f1564h;

    /* renamed from: i */
    public final /* synthetic */ p064Q.AbstractServiceC0548t f1565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532d(p064Q.AbstractServiceC0548t abstractServiceC0548t, java.lang.String str, p064Q.C0534f c0534f, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) {
        super(str);
        this.f1565i = abstractServiceC0548t;
        this.f1561e = c0534f;
        this.f1562f = str2;
        this.f1563g = bundle;
        this.f1564h = bundle2;
    }

    @Override // p064Q.AbstractC0541m
    /* renamed from: c */
    public final void mo1037c(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        p165n.C1878e c1878e = this.f1565i.f1626p;
        p064Q.C0534f c0534f = this.f1561e;
        p043K2.C0339o c0339o = c0534f.f1571d;
        java.lang.Object obj2 = c1878e.get(((android.os.Messenger) c0339o.f1048m).getBinder());
        java.lang.String str = c0534f.f1568a;
        java.lang.String str2 = this.f1562f;
        if (obj2 != c0534f) {
            if (p064Q.AbstractServiceC0548t.f1621s) {
                android.util.Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        try {
            c0339o.m747A(str2, list, this.f1563g, this.f1564h);
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
