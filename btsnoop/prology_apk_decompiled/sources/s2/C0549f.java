package s2;

import B2.AbstractActivityC0003d;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549f extends android.support.v4.media.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f8237c;

    public C0549f(k kVar) {
        this.f8237c = kVar;
    }

    @Override // android.support.v4.media.c
    public final void a() {
        k kVar = this.f8237c;
        if (kVar.f8259l == null) {
            return;
        }
        try {
            android.support.v4.media.d dVar = k.f8256x.f3668a;
            if (dVar.f3666h == null) {
                MediaSession.Token sessionToken = dVar.f3660b.getSessionToken();
                dVar.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
            }
            k.f8257y = new t(kVar.f8259l, dVar.f3666h);
            C0552i c0552i = k.s;
            AbstractActivityC0003d abstractActivityC0003d = c0552i != null ? c0552i.f8245m : null;
            if (abstractActivityC0003d != null) {
                t.y0(abstractActivityC0003d, k.f8257y);
            }
            k.f8257y.w0(k.f8258z);
            K2.k kVar2 = k.f8255v;
            if (kVar2 != null) {
                kVar2.b(k.q(new Object[0]));
                k.f8255v = null;
            }
        } catch (Exception e4) {
            System.out.println("onConnected error: " + e4.getMessage());
            e4.printStackTrace();
            K2.k kVar3 = k.f8255v;
            if (kVar3 == null) {
                kVar.f8263p.f8248p = true;
                return;
            }
            kVar3.a("onConnected error: " + e4.getMessage(), null, null);
        }
    }

    @Override // android.support.v4.media.c
    public final void b() {
        K2.k kVar = k.f8255v;
        if (kVar != null) {
            kVar.a("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
        } else {
            this.f8237c.f8263p.f8248p = true;
        }
    }

    @Override // android.support.v4.media.c
    public final void c() {
        System.out.println("### UNHANDLED: onConnectionSuspended");
    }
}
