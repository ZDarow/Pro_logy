package C2;

import B2.r;
import K2.l;
import K2.n;
import Y.x;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements W2.b {

    /* renamed from: y, reason: collision with root package name */
    public static long f343y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f344z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f345a;

    /* renamed from: b, reason: collision with root package name */
    public final j f346b;

    /* renamed from: c, reason: collision with root package name */
    public final D2.b f347c;

    /* renamed from: d, reason: collision with root package name */
    public final e f348d;

    /* renamed from: e, reason: collision with root package name */
    public final M2.a f349e;

    /* renamed from: f, reason: collision with root package name */
    public final t f350f;

    /* renamed from: g, reason: collision with root package name */
    public final K2.c f351g;

    /* renamed from: h, reason: collision with root package name */
    public final r f352h;

    /* renamed from: i, reason: collision with root package name */
    public final K2.a f353i;

    /* renamed from: j, reason: collision with root package name */
    public final K2.a f354j;

    /* renamed from: k, reason: collision with root package name */
    public final l f355k;

    /* renamed from: l, reason: collision with root package name */
    public final B1.d f356l;

    /* renamed from: m, reason: collision with root package name */
    public final r f357m;

    /* renamed from: n, reason: collision with root package name */
    public final r f358n;

    /* renamed from: o, reason: collision with root package name */
    public final n f359o;

    /* renamed from: p, reason: collision with root package name */
    public final r f360p;

    /* renamed from: q, reason: collision with root package name */
    public final K2.b f361q;

    /* renamed from: r, reason: collision with root package name */
    public final B1.d f362r;
    public final o s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.n f363t;

    /* renamed from: u, reason: collision with root package name */
    public final x f364u;
    public final long w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f365v = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final a f366x = new a(0, this);

    /* JADX WARN: Removed duplicated region for block: B:92:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x042c  */
    /* JADX WARN: Type inference failed for: r3v8, types: [K2.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r22, io.flutter.embedding.engine.FlutterJNI r23, io.flutter.plugin.platform.o r24) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.c.<init>(android.content.Context, io.flutter.embedding.engine.FlutterJNI, io.flutter.plugin.platform.o):void");
    }

    public final void a() {
        Iterator it = this.f365v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        e eVar = this.f348d;
        eVar.e();
        HashMap hashMap = eVar.f373a;
        Iterator it2 = new HashSet(hashMap.keySet()).iterator();
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            H2.b bVar = (H2.b) hashMap.get(cls);
            if (bVar != null) {
                W2.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (bVar instanceof I2.a) {
                        if (eVar.f()) {
                            ((I2.a) bVar).e();
                        }
                        eVar.f376d.remove(cls);
                    }
                    bVar.b(eVar.f375c);
                    hashMap.remove(cls);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        hashMap.clear();
        while (true) {
            o oVar = this.s;
            SparseArray sparseArray = oVar.w;
            if (sparseArray.size() <= 0) {
                break;
            }
            oVar.f6379H.A(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.n nVar = this.f363t;
            SparseArray sparseArray2 = nVar.f6365t;
            if (sparseArray2.size() <= 0) {
                this.f347c.f468l.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = this.f345a;
                flutterJNI.removeEngineLifecycleListener(this.f366x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                t.n0().getClass();
                f344z.remove(Long.valueOf(this.w));
                return;
            }
            nVar.f6357A.A(sparseArray2.keyAt(0));
        }
    }
}
