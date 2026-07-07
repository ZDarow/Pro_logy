package io.flutter.embedding.engine.renderer;

import B2.C0004e;
import a0.C0118H;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.n;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f6245a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f6247c;

    /* renamed from: h, reason: collision with root package name */
    public final C0004e f6252h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f6246b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f6248d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f6249e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f6250f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6251g = new ArrayList();

    public j(FlutterJNI flutterJNI) {
        C0004e c0004e = new C0004e(3, this);
        this.f6252h = c0004e;
        this.f6245a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0004e);
    }

    public final void a(n nVar) {
        HashSet hashSet = this.f6250f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((n) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(nVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f6246b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f6245a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i4) {
        if (Build.VERSION.SDK_INT < 29) {
            g d4 = d();
            return new m(d4.f6220a, this.f6249e, this.f6245a, d4);
        }
        long andIncrement = this.f6246b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z4 = i4 == 2;
        this.f6245a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z4);
        if (z4) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f6251g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final g d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f6246b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        g gVar = new g(this, andIncrement, surfaceTexture);
        this.f6245a.registerTexture(gVar.f6220a, gVar.f6221b);
        a(gVar);
        return gVar;
    }

    public final void e(int i4) {
        Iterator it = this.f6250f.iterator();
        while (it.hasNext()) {
            n nVar = (n) ((WeakReference) it.next()).get();
            if (nVar != null) {
                nVar.onTrimMemory(i4);
            } else {
                it.remove();
            }
        }
    }

    public final void f(n nVar) {
        HashSet hashSet = this.f6250f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == nVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        Iterator it = this.f6251g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            o oVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (oVar != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                V2.b bVar = (V2.b) oVar;
                if (bVar.f2639d) {
                    ((C0118H) bVar.f2453c).N(bVar.f2452b.getSurface());
                    bVar.f2639d = false;
                }
            }
        }
    }

    public final void h() {
        if (this.f6247c != null) {
            this.f6245a.onSurfaceDestroyed();
            if (this.f6248d) {
                this.f6252h.a();
            }
            this.f6248d = false;
            this.f6247c = null;
        }
    }
}
