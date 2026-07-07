package p009B2;

/* renamed from: B2.g */
/* loaded from: classes.dex */
public final class C0050g {

    /* renamed from: a */
    public p009B2.AbstractActivityC0047d f155a;

    /* renamed from: b */
    public p013C2.C0138c f156b;

    /* renamed from: c */
    public p009B2.C0064u f157c;

    /* renamed from: d */
    public p077T0.C0722j f158d;

    /* renamed from: e */
    public p063P2.C0528a f159e;

    /* renamed from: f */
    public p009B2.ViewTreeObserverOnPreDrawListenerC0049f f160f;

    /* renamed from: g */
    public boolean f161g;

    /* renamed from: h */
    public boolean f162h;

    /* renamed from: j */
    public boolean f164j;

    /* renamed from: k */
    public java.lang.Integer f165k;

    /* renamed from: l */
    public final p009B2.C0048e f166l = new p009B2.C0048e(0, this);

    /* renamed from: i */
    public boolean f163i = false;

    public C0050g(p009B2.AbstractActivityC0047d abstractActivityC0047d) {
        this.f155a = abstractActivityC0047d;
    }

    /* renamed from: a */
    public final void m137a() {
        if (this.f155a.m134i()) {
            throw new java.lang.AssertionError("The internal FlutterEngine created by " + this.f155a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f155a;
        abstractActivityC0047d.getClass();
        android.util.Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0047d + " connection to the engine " + abstractActivityC0047d.f148m.f156b + " evicted by another attaching activity");
        p009B2.C0050g c0050g = abstractActivityC0047d.f148m;
        if (c0050g != null) {
            c0050g.m140d();
            abstractActivityC0047d.f148m.m141e();
        }
    }

    /* renamed from: b */
    public final void m138b() {
        if (this.f155a == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: c */
    public final java.lang.String m139c(android.content.Intent intent) {
        boolean z4;
        android.net.Uri data;
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f155a;
        abstractActivityC0047d.getClass();
        try {
            android.os.Bundle m132g = abstractActivityC0047d.m132g();
            z4 = (m132g == null || !m132g.containsKey("flutter_deeplinking_enabled")) ? true : m132g.getBoolean("flutter_deeplinking_enabled");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            z4 = false;
        }
        if (!z4 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    /* renamed from: d */
    public final void m140d() {
        m138b();
        if (this.f160f != null) {
            this.f157c.getViewTreeObserver().removeOnPreDrawListener(this.f160f);
            this.f160f = null;
        }
        p009B2.C0064u c0064u = this.f157c;
        if (c0064u != null) {
            c0064u.m276a();
            p009B2.C0064u c0064u2 = this.f157c;
            c0064u2.f208q.remove(this.f166l);
        }
    }

    /* renamed from: e */
    public final void m141e() {
        if (this.f164j) {
            m138b();
            this.f155a.getClass();
            this.f155a.getClass();
            p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f155a;
            abstractActivityC0047d.getClass();
            if (abstractActivityC0047d.isChangingConfigurations()) {
                p013C2.C0140e c0140e = this.f156b.f354d;
                if (c0140e.m489f()) {
                    p089W2.AbstractC0821a.m1664b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c0140e.f387g = true;
                        java.util.Iterator it = c0140e.f384d.values().iterator();
                        while (it.hasNext()) {
                            ((p038I2.InterfaceC0309a) it.next()).mo533g();
                        }
                        c0140e.m487d();
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        try {
                            android.os.Trace.endSection();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f156b.f354d.m486c();
            }
            p077T0.C0722j c0722j = this.f158d;
            if (c0722j != null) {
                ((p008B1.C0026d) c0722j.f2504n).f100n = null;
                this.f158d = null;
            }
            p063P2.C0528a c0528a = this.f159e;
            if (c0528a != null) {
                ((p009B2.C0061r) c0528a.f1553n).f188m = null;
                c0528a.f1552m = null;
                this.f159e = null;
            }
            this.f155a.getClass();
            p013C2.C0138c c0138c = this.f156b;
            if (c0138c != null) {
                p043K2.C0327c c0327c = c0138c.f357g;
                c0327c.m724e(1, c0327c.f992c);
            }
            if (this.f155a.m134i()) {
                this.f156b.m473a();
                if (this.f155a.m129d() != null) {
                    p009B2.C0061r.m262i().m274m(this.f155a.m129d(), null);
                }
                this.f156b = null;
            }
            this.f164j = false;
        }
    }
}
