package io.flutter.plugin.platform;

import B2.C0000a;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public m f6358l;

    /* renamed from: m, reason: collision with root package name */
    public C0000a f6359m;

    /* renamed from: n, reason: collision with root package name */
    public Activity f6360n;

    /* renamed from: o, reason: collision with root package name */
    public B2.u f6361o;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.k f6363q;

    /* renamed from: r, reason: collision with root package name */
    public B1.d f6364r;

    /* renamed from: v, reason: collision with root package name */
    public final B1.d f6367v;

    /* renamed from: p, reason: collision with root package name */
    public FlutterJNI f6362p = null;

    /* renamed from: y, reason: collision with root package name */
    public Surface f6369y = null;

    /* renamed from: z, reason: collision with root package name */
    public SurfaceControl f6370z = null;

    /* renamed from: A, reason: collision with root package name */
    public final m f6357A = new m(3, this);
    public final C0344a s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final SparseArray f6365t = new SparseArray();

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f6366u = new SparseArray();
    public final ArrayList w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f6368x = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public n() {
        if (B1.d.f93o == null) {
            B1.d.f93o = new B1.d(3);
        }
        this.f6367v = B1.d.f93o;
    }

    @Override // io.flutter.plugin.platform.i
    public final SurfaceView K(int i4) {
        f fVar = (f) this.f6365t.get(i4);
        if (fVar == null) {
            return null;
        }
        return ((U2.a) fVar).f2523a;
    }

    @Override // io.flutter.plugin.platform.i
    public final void f() {
        this.s.f6327a = null;
    }

    @Override // io.flutter.plugin.platform.i
    public final void m(io.flutter.view.g gVar) {
        this.s.f6327a = gVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean r(int i4) {
        return false;
    }
}
