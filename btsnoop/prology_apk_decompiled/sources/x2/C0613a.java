package x2;

import H2.b;
import I.C0044m;
import L2.f;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.media.session.t;
import k3.h;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613a implements b {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f8986l;

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        C0044m c0044m = this.f8986l;
        if (c0044m != null) {
            c0044m.s(null);
        } else {
            h.i("methodChannel");
            throw null;
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "binding");
        f fVar = (f) aVar.f709m;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) aVar.f708l;
        h.d(context, "getApplicationContext(...)");
        this.f8986l = new C0044m(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        h.b(contentResolver);
        t tVar = new t(packageManager, (ActivityManager) systemService, contentResolver, 29);
        C0044m c0044m = this.f8986l;
        if (c0044m != null) {
            c0044m.s(tVar);
        } else {
            h.i("methodChannel");
            throw null;
        }
    }
}
