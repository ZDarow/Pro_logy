package p064Q;

/* renamed from: Q.t */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0548t extends android.app.Service {

    /* renamed from: s */
    public static final boolean f1621s = android.util.Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: l */
    public p064Q.C0539k f1622l;

    /* renamed from: m */
    public final p043K2.C0339o f1623m = new p043K2.C0339o(8, this);

    /* renamed from: n */
    public final p064Q.C0534f f1624n = new p064Q.C0534f(this, "android.media.session.MediaController", -1, -1, null);

    /* renamed from: o */
    public final java.util.ArrayList f1625o = new java.util.ArrayList();

    /* renamed from: p */
    public final p165n.C1878e f1626p = new p165n.C1883j(0);

    /* renamed from: q */
    public final p064Q.HandlerC0547s f1627q;

    /* renamed from: r */
    public android.support.v4.media.session.MediaSessionCompat$Token f1628r;

    /* JADX WARN: Type inference failed for: r0v3, types: [n.e, n.j] */
    public AbstractServiceC0548t() {
        p064Q.HandlerC0547s handlerC0547s = new p064Q.HandlerC0547s();
        handlerC0547s.f1620b = this;
        this.f1627q = handlerC0547s;
    }

    /* renamed from: a */
    public final void m1056a(java.lang.String str, android.os.Bundle bundle) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new java.lang.IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        p064Q.C0539k c0539k = this.f1622l;
        c0539k.mo1046e(str, bundle);
        ((p064Q.AbstractServiceC0548t) c0539k.f1584d).f1627q.post(new p064Q.RunnableC0536h(c0539k, str, bundle, 0));
    }

    /* renamed from: b */
    public abstract p008B1.C0026d mo1057b(android.os.Bundle bundle);

    /* renamed from: c */
    public abstract void mo1058c(java.lang.String str, p064Q.AbstractC0541m abstractC0541m, android.os.Bundle bundle);

    /* renamed from: d */
    public abstract void mo1059d(java.lang.String str, p064Q.AbstractC0541m abstractC0541m);

    @Override // android.app.Service
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    /* renamed from: e */
    public final void m1060e(java.lang.String str, p064Q.C0534f c0534f, android.os.Bundle bundle, android.os.Bundle bundle2) {
        p064Q.C0532d c0532d = new p064Q.C0532d(this, str, c0534f, str, bundle, bundle2);
        if (bundle == null) {
            ((com.ryanheise.audioservice.AudioService) this).mo1058c(str, c0532d, null);
        } else {
            mo1058c(str, c0532d, bundle);
        }
        if (c0532d.m1052b()) {
            return;
        }
        throw new java.lang.IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0534f.f1568a + " id=" + str);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return ((p064Q.C0538j) this.f1622l.f1582b).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f1622l = new p064Q.C0539k(this);
        } else {
            this.f1622l = new p064Q.C0539k(this);
        }
        p064Q.C0539k c0539k = this.f1622l;
        c0539k.getClass();
        p064Q.C0538j c0538j = new p064Q.C0538j(c0539k, c0539k.f1589f);
        c0539k.f1582b = c0538j;
        c0538j.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1627q.f1620b = null;
    }
}
