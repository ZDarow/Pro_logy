package Q;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import n.C0442e;

/* loaded from: classes.dex */
public abstract class t extends Service {
    public static final boolean s = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: l, reason: collision with root package name */
    public k f1570l;

    /* renamed from: m, reason: collision with root package name */
    public final K2.o f1571m = new K2.o(8, this);

    /* renamed from: n, reason: collision with root package name */
    public final f f1572n = new f(this, "android.media.session.MediaController", -1, -1, null);

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1573o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final C0442e f1574p = new n.j(0);

    /* renamed from: q, reason: collision with root package name */
    public final s f1575q;

    /* renamed from: r, reason: collision with root package name */
    public MediaSessionCompat$Token f1576r;

    /* JADX WARN: Type inference failed for: r0v3, types: [n.e, n.j] */
    public t() {
        s sVar = new s();
        sVar.f1569b = this;
        this.f1575q = sVar;
    }

    public final void a(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        k kVar = this.f1570l;
        kVar.e(str, bundle);
        ((t) kVar.f1533d).f1575q.post(new h(kVar, str, bundle, 0));
    }

    public abstract B1.d b(Bundle bundle);

    public abstract void c(String str, m mVar, Bundle bundle);

    public abstract void d(String str, m mVar);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void e(String str, f fVar, Bundle bundle, Bundle bundle2) {
        d dVar = new d(this, str, fVar, str, bundle, bundle2);
        if (bundle == null) {
            ((AudioService) this).c(str, dVar, null);
        } else {
            c(str, dVar, bundle);
        }
        if (dVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f1517a + " id=" + str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((j) this.f1570l.f1531b).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1570l = new k(this);
        } else {
            this.f1570l = new k(this);
        }
        k kVar = this.f1570l;
        kVar.getClass();
        j jVar = new j(kVar, kVar.f1538f);
        kVar.f1531b = jVar;
        jVar.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1575q.f1569b = null;
    }
}
