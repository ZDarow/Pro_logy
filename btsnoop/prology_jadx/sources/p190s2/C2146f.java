package p190s2;

/* renamed from: s2.f */
/* loaded from: classes.dex */
public final class C2146f extends android.support.v4.media.AbstractC1035c {

    /* renamed from: c */
    public final /* synthetic */ p190s2.C2151k f8556c;

    public C2146f(p190s2.C2151k c2151k) {
        this.f8556c = c2151k;
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: a */
    public final void mo1130a() {
        p190s2.C2151k c2151k = this.f8556c;
        if (c2151k.f8580l == null) {
            return;
        }
        try {
            android.support.v4.media.C1036d c1036d = p190s2.C2151k.f8577x.f3793a;
            if (c1036d.f3791h == null) {
                android.media.session.MediaSession.Token sessionToken = c1036d.f3785b.getSessionToken();
                c1036d.f3791h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, null) : null;
            }
            p190s2.C2151k.f8578y = new android.support.v4.media.session.C1061t(c2151k.f8580l, c1036d.f3791h);
            p190s2.C2149i c2149i = p190s2.C2151k.f8572s;
            p009B2.AbstractActivityC0047d abstractActivityC0047d = c2149i != null ? c2149i.f8564m : null;
            if (abstractActivityC0047d != null) {
                android.support.v4.media.session.C1061t.m2203y0(abstractActivityC0047d, p190s2.C2151k.f8578y);
            }
            p190s2.C2151k.f8578y.m2245w0(p190s2.C2151k.f8579z);
            p043K2.C0335k c0335k = p190s2.C2151k.f8575v;
            if (c0335k != null) {
                c0335k.mo742b(p190s2.C2151k.m4275q(new java.lang.Object[0]));
                p190s2.C2151k.f8575v = null;
            }
        } catch (java.lang.Exception e4) {
            java.lang.System.out.println("onConnected error: " + e4.getMessage());
            e4.printStackTrace();
            p043K2.C0335k c0335k2 = p190s2.C2151k.f8575v;
            if (c0335k2 == null) {
                c2151k.f8584p.f8567p = true;
                return;
            }
            c0335k2.mo741a("onConnected error: " + e4.getMessage(), null, null);
        }
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: b */
    public final void mo1131b() {
        p043K2.C0335k c0335k = p190s2.C2151k.f8575v;
        if (c0335k != null) {
            c0335k.mo741a("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
        } else {
            this.f8556c.f8584p.f8567p = true;
        }
    }

    @Override // android.support.v4.media.AbstractC1035c
    /* renamed from: c */
    public final void mo1132c() {
        java.lang.System.out.println("### UNHANDLED: onConnectionSuspended");
    }
}
