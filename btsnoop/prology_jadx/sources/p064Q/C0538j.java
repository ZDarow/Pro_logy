package p064Q;

/* renamed from: Q.j */
/* loaded from: classes.dex */
public final class C0538j extends android.service.media.MediaBrowserService {

    /* renamed from: l */
    public final /* synthetic */ p064Q.AbstractC0537i f1585l;

    /* renamed from: m */
    public final /* synthetic */ p064Q.C0539k f1586m;

    /* renamed from: n */
    public final /* synthetic */ p064Q.C0539k f1587n;

    public C0538j(p064Q.C0539k c0539k, android.content.Context context) {
        this.f1587n = c0539k;
        this.f1586m = c0539k;
        this.f1585l = c0539k;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i4, android.os.Bundle bundle) {
        int i5;
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        android.os.Bundle bundle2 = null;
        android.os.Bundle bundle3 = bundle == null ? null : new android.os.Bundle(bundle);
        p064Q.AbstractC0537i abstractC0537i = this.f1585l;
        p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) abstractC0537i.f1584d;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            i5 = -1;
        } else {
            bundle3.remove("extra_client_version");
            abstractC0537i.f1583c = new android.os.Messenger(abstractServiceC0548t.f1627q);
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", ((android.os.Messenger) abstractC0537i.f1583c).getBinder());
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = abstractServiceC0548t.f1628r;
            if (mediaSessionCompat$Token != null) {
                android.support.v4.media.session.InterfaceC1045d m2098d = mediaSessionCompat$Token.m2098d();
                bundle4.putBinder("extra_session_binder", m2098d != null ? m2098d.asBinder() : null);
            } else {
                ((java.util.ArrayList) abstractC0537i.f1581a).add(bundle4);
            }
            int i6 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i5 = i6;
            bundle2 = bundle4;
        }
        p064Q.C0534f c0534f = new p064Q.C0534f((p064Q.AbstractServiceC0548t) abstractC0537i.f1584d, str, i5, i4, null);
        abstractServiceC0548t.getClass();
        p008B1.C0026d mo1057b = abstractServiceC0548t.mo1057b(bundle3);
        if (((android.os.Messenger) abstractC0537i.f1583c) != null) {
            abstractServiceC0548t.f1625o.add(c0534f);
        }
        android.os.Bundle bundle5 = (android.os.Bundle) mo1057b.f100n;
        if (bundle2 == null) {
            bundle2 = bundle5;
        } else if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        return new android.service.media.MediaBrowserService.BrowserRoot((java.lang.String) mo1057b.f99m, bundle2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result) {
        p043K2.C0339o c0339o = new p043K2.C0339o(7, result);
        p064Q.AbstractC0537i abstractC0537i = this.f1585l;
        abstractC0537i.getClass();
        p064Q.C0535g c0535g = new p064Q.C0535g(str, c0339o, 0);
        p064Q.AbstractServiceC0548t abstractServiceC0548t = (p064Q.AbstractServiceC0548t) abstractC0537i.f1584d;
        p064Q.C0534f c0534f = abstractServiceC0548t.f1624n;
        ((com.ryanheise.audioservice.AudioService) abstractServiceC0548t).mo1058c(str, c0535g, null);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(java.lang.String str, android.service.media.MediaBrowserService.Result result) {
        p043K2.C0339o c0339o = new p043K2.C0339o(7, result);
        p064Q.C0539k c0539k = this.f1586m;
        c0539k.getClass();
        p064Q.C0535g c0535g = new p064Q.C0535g(str, c0339o, 1);
        p064Q.AbstractServiceC0548t abstractServiceC0548t = c0539k.f1588e;
        p064Q.C0534f c0534f = abstractServiceC0548t.f1624n;
        abstractServiceC0548t.mo1059d(str, c0535g);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result, android.os.Bundle bundle) {
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        p064Q.C0539k c0539k = this.f1587n;
        p064Q.AbstractServiceC0548t abstractServiceC0548t = c0539k.f1589f;
        p064Q.C0534f c0534f = abstractServiceC0548t.f1624n;
        abstractServiceC0548t.mo1058c(str, new p064Q.C0535g(c0539k, str, new p043K2.C0339o(7, result), bundle), bundle);
        c0539k.f1589f.getClass();
    }
}
