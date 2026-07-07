package l2;

import B2.AbstractActivityC0003d;
import C2.d;
import F1.g;
import I.C0044m;
import L2.f;
import L2.o;
import a.AbstractC0110a;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import k3.h;
import m2.C0437a;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408b implements H2.b, o, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public final C0437a f7125l;

    /* renamed from: m, reason: collision with root package name */
    public final g f7126m;

    /* renamed from: n, reason: collision with root package name */
    public d f7127n;

    /* renamed from: o, reason: collision with root package name */
    public C0044m f7128o;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m2.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [F1.g, java.lang.Object] */
    public C0408b() {
        ?? obj = new Object();
        obj.f7335m = Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        this.f7125l = obj;
        this.f7126m = new Object();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x017c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0bd9  */
    @Override // L2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(L2.n r28, final K2.k r29) {
        /*
            Method dump skipped, instructions count: 3276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C0408b.I(L2.n, K2.k):void");
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        C0044m c0044m = this.f7128o;
        if (c0044m != null) {
            c0044m.s(null);
        } else {
            h.i("channel");
            throw null;
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "flutterPluginBinding");
        C0044m c0044m = new C0044m((f) aVar.f709m, "com.lucasjosino.on_audio_query");
        this.f7128o = c0044m;
        c0044m.s(this);
    }

    @Override // I2.a
    public final void e() {
        d dVar = this.f7127n;
        if (dVar != null) {
            ((HashSet) dVar.f368b).remove(this.f7125l);
        }
        this.f7127n = null;
    }

    @Override // I2.a
    public final void f(d dVar) {
        h.e(dVar, "binding");
        h(dVar);
    }

    @Override // I2.a
    public final void g() {
        e();
    }

    @Override // I2.a
    public final void h(d dVar) {
        h.e(dVar, "binding");
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
        h.d(abstractActivityC0003d, "getActivity(...)");
        AbstractC0110a.f3190c = new WeakReference(abstractActivityC0003d.getApplicationContext());
        AbstractC0110a.f3191d = new WeakReference(abstractActivityC0003d);
        this.f7127n = dVar;
        ((HashSet) dVar.f368b).add(this.f7125l);
    }
}
