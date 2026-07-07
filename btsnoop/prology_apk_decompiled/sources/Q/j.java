package Q;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends MediaBrowserService {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f1534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f1535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f1536n;

    public j(k kVar, Context context) {
        this.f1536n = kVar;
        this.f1535m = kVar;
        this.f1534l = kVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i4, Bundle bundle) {
        int i5;
        android.support.v4.media.session.t.b0(bundle);
        Bundle bundle2 = null;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        i iVar = this.f1534l;
        t tVar = (t) iVar.f1533d;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            i5 = -1;
        } else {
            bundle3.remove("extra_client_version");
            iVar.f1532c = new Messenger(tVar.f1575q);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", ((Messenger) iVar.f1532c).getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = tVar.f1576r;
            if (mediaSessionCompat$Token != null) {
                android.support.v4.media.session.d d4 = mediaSessionCompat$Token.d();
                bundle4.putBinder("extra_session_binder", d4 != null ? d4.asBinder() : null);
            } else {
                ((ArrayList) iVar.f1530a).add(bundle4);
            }
            int i6 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i5 = i6;
            bundle2 = bundle4;
        }
        f fVar = new f((t) iVar.f1533d, str, i5, i4, null);
        tVar.getClass();
        B1.d b4 = tVar.b(bundle3);
        if (((Messenger) iVar.f1532c) != null) {
            tVar.f1573o.add(fVar);
        }
        Bundle bundle5 = (Bundle) b4.f97n;
        if (bundle2 == null) {
            bundle2 = bundle5;
        } else if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        return new MediaBrowserService.BrowserRoot((String) b4.f96m, bundle2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        K2.o oVar = new K2.o(7, result);
        i iVar = this.f1534l;
        iVar.getClass();
        g gVar = new g(str, oVar, 0);
        t tVar = (t) iVar.f1533d;
        f fVar = tVar.f1572n;
        ((AudioService) tVar).c(str, gVar, null);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        K2.o oVar = new K2.o(7, result);
        k kVar = this.f1535m;
        kVar.getClass();
        g gVar = new g(str, oVar, 1);
        t tVar = kVar.f1537e;
        f fVar = tVar.f1572n;
        tVar.d(str, gVar);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        android.support.v4.media.session.t.b0(bundle);
        k kVar = this.f1536n;
        t tVar = kVar.f1538f;
        f fVar = tVar.f1572n;
        tVar.c(str, new g(kVar, str, new K2.o(7, result), bundle), bundle);
        kVar.f1538f.getClass();
    }
}
