package D2;

import B2.r;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements L2.f {

    /* renamed from: l, reason: collision with root package name */
    public final FlutterJNI f468l;

    /* renamed from: m, reason: collision with root package name */
    public final AssetManager f469m;

    /* renamed from: n, reason: collision with root package name */
    public final long f470n;

    /* renamed from: o, reason: collision with root package name */
    public final j f471o;

    /* renamed from: p, reason: collision with root package name */
    public final r f472p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f473q;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j4) {
        this.f473q = false;
        r rVar = new r(5, this);
        this.f468l = flutterJNI;
        this.f469m = assetManager;
        this.f470n = j4;
        j jVar = new j(flutterJNI);
        this.f471o = jVar;
        jVar.f("flutter/isolate", rVar, null);
        this.f472p = new r(6, jVar);
        if (flutterJNI.isAttached()) {
            this.f473q = true;
        }
    }

    @Override // L2.f
    public final void a(String str, ByteBuffer byteBuffer, L2.e eVar) {
        this.f472p.a(str, byteBuffer, eVar);
    }

    @Override // L2.f
    public final F1.g b(L2.l lVar) {
        return ((j) this.f472p.f185m).b(lVar);
    }

    @Override // L2.f
    public final void c(String str, ByteBuffer byteBuffer) {
        this.f472p.c(str, byteBuffer);
    }

    public final void e(a aVar, List list) {
        if (this.f473q) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        W2.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f468l.runBundleAndSnapshotFromLibrary(aVar.f465a, aVar.f467c, aVar.f466b, this.f469m, list, this.f470n);
            this.f473q = true;
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

    @Override // L2.f
    public final void f(String str, L2.d dVar, F1.g gVar) {
        this.f472p.f(str, dVar, gVar);
    }

    @Override // L2.f
    public final void g(String str, L2.d dVar) {
        this.f472p.g(str, dVar);
    }
}
