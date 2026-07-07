package io.flutter.plugin.platform;

import B2.AbstractC0007h;
import B2.C0000a;
import B2.C0009j;
import B2.L;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: I, reason: collision with root package name */
    public static final Class[] f6371I = {SurfaceView.class};

    /* renamed from: F, reason: collision with root package name */
    public final B1.d f6377F;

    /* renamed from: m, reason: collision with root package name */
    public C0000a f6381m;

    /* renamed from: n, reason: collision with root package name */
    public Activity f6382n;

    /* renamed from: o, reason: collision with root package name */
    public B2.u f6383o;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f6385q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.plugin.editing.k f6386r;
    public B1.d s;

    /* renamed from: p, reason: collision with root package name */
    public FlutterJNI f6384p = null;

    /* renamed from: A, reason: collision with root package name */
    public int f6372A = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6373B = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6374C = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6378G = false;

    /* renamed from: H, reason: collision with root package name */
    public final m f6379H = new m(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final m f6380l = new m(2);

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f6388u = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final C0344a f6387t = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f6389v = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f6391y = new SparseArray();

    /* renamed from: D, reason: collision with root package name */
    public final HashSet f6375D = new HashSet();

    /* renamed from: E, reason: collision with root package name */
    public final HashSet f6376E = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f6392z = new SparseArray();
    public final SparseArray w = new SparseArray();

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f6390x = new SparseArray();

    /* JADX WARN: Type inference failed for: r0v5, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public o() {
        if (B1.d.f93o == null) {
            B1.d.f93o = new B1.d(3);
        }
        this.f6377F = B1.d.f93o;
    }

    public static void a(o oVar, K2.g gVar) {
        oVar.getClass();
        int i4 = gVar.f974g;
        if (i4 == 0 || i4 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i4 + "(view id: " + gVar.f968a + ")");
    }

    public static void d(int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i4) {
            throw new IllegalStateException(AbstractC0007h.i(i5, i4, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static g i(io.flutter.embedding.engine.renderer.j jVar) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29) {
            return i4 >= 29 ? new c(jVar.b()) : new v(jVar.d());
        }
        TextureRegistry$SurfaceProducer c4 = jVar.c(i4 <= 34 ? 2 : 1);
        m mVar = new m(4);
        mVar.f6356m = c4;
        return mVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final SurfaceView K(int i4) {
        if (r(i4)) {
            return ((A) this.f6388u.get(Integer.valueOf(i4))).a();
        }
        f fVar = (f) this.w.get(i4);
        if (fVar == null) {
            return null;
        }
        return ((U2.a) fVar).f2523a;
    }

    public final U2.a b(K2.g gVar, boolean z4) {
        HashMap hashMap = (HashMap) this.f6380l.f6356m;
        String str = gVar.f969b;
        U2.b bVar = (U2.b) hashMap.get(str);
        if (bVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = gVar.f976i;
        Object a4 = byteBuffer != null ? bVar.f2524a.a(byteBuffer) : null;
        Context mutableContextWrapper = z4 ? new MutableContextWrapper(this.f6382n) : this.f6382n;
        T2.g gVar2 = (T2.g) a4;
        Objects.requireNonNull(gVar2);
        U2.a aVar = new U2.a(mutableContextWrapper, ((T2.l) ((LongSparseArray) bVar.f2525b.f214m).get(gVar2.f2441a.longValue())).f2453c);
        SurfaceView surfaceView = aVar.f2523a;
        if (surfaceView == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        surfaceView.setLayoutDirection(gVar.f974g);
        this.w.put(gVar.f968a, aVar);
        return aVar;
    }

    public final void c() {
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f6391y;
            if (i4 >= sparseArray.size()) {
                return;
            }
            d dVar = (d) sparseArray.valueAt(i4);
            dVar.c();
            dVar.f164l.close();
            i4++;
        }
    }

    public final void e(boolean z4) {
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f6391y;
            if (i4 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i4);
            d dVar = (d) sparseArray.valueAt(i4);
            if (this.f6375D.contains(Integer.valueOf(keyAt))) {
                C2.c cVar = this.f6383o.s;
                if (cVar != null) {
                    dVar.b(cVar.f346b);
                }
                z4 &= dVar.e();
            } else {
                if (!this.f6373B) {
                    dVar.c();
                }
                dVar.setVisibility(8);
                this.f6383o.removeView(dVar);
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f6390x;
            if (i5 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i5);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f6376E.contains(Integer.valueOf(keyAt2)) || (!z4 && this.f6374C)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i5++;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void f() {
        this.f6387t.f6327a = null;
    }

    public final float g() {
        return this.f6382n.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void h() {
        if (!this.f6374C || this.f6373B) {
            return;
        }
        B2.u uVar = this.f6383o;
        uVar.f203o.a();
        C0009j c0009j = uVar.f202n;
        if (c0009j == null) {
            C0009j c0009j2 = new C0009j(uVar.getContext(), uVar.getWidth(), uVar.getHeight(), 1);
            uVar.f202n = c0009j2;
            uVar.addView(c0009j2);
        } else {
            c0009j.g(uVar.getWidth(), uVar.getHeight());
        }
        uVar.f204p = uVar.f203o;
        C0009j c0009j3 = uVar.f202n;
        uVar.f203o = c0009j3;
        C2.c cVar = uVar.s;
        if (cVar != null) {
            c0009j3.b(cVar.f346b);
        }
        this.f6373B = true;
    }

    public final void j() {
        for (A a4 : this.f6388u.values()) {
            int width = a4.f6322f.getWidth();
            g gVar = a4.f6322f;
            int height = gVar.getHeight();
            boolean isFocused = a4.a().isFocused();
            t detachState = a4.f6317a.detachState();
            a4.f6324h.setSurface(null);
            a4.f6324h.release();
            a4.f6324h = ((DisplayManager) a4.f6318b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + a4.f6321e, width, height, a4.f6320d, gVar.getSurface(), 0, A.f6316i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(a4.f6318b, a4.f6324h.getDisplay(), a4.f6319c, detachState, a4.f6323g, isFocused);
            singleViewPresentation.show();
            a4.f6317a.cancel();
            a4.f6317a = singleViewPresentation;
        }
    }

    public final MotionEvent k(float f4, K2.h hVar, boolean z4) {
        MotionEvent m4 = this.f6377F.m(new L(hVar.f992p));
        List<List> list = (List) hVar.f983g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d4 = f4;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d4);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d4);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d4);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d4);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d4);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d4);
            arrayList.add(pointerCoords);
        }
        int i4 = hVar.f981e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i4]);
        if (!z4 && m4 != null) {
            if (pointerCoordsArr.length >= 1) {
                m4.offsetLocation(pointerCoordsArr[0].x - m4.getX(), pointerCoordsArr[0].y - m4.getY());
            }
            return m4;
        }
        List<List> list3 = (List) hVar.f982f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(hVar.f978b.longValue(), hVar.f979c.longValue(), hVar.f980d, hVar.f981e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i4]), pointerCoordsArr, hVar.f984h, hVar.f985i, hVar.f986j, hVar.f987k, hVar.f988l, hVar.f989m, hVar.f990n, hVar.f991o);
    }

    public final int l(double d4) {
        return (int) Math.round(d4 * g());
    }

    @Override // io.flutter.plugin.platform.i
    public final void m(io.flutter.view.g gVar) {
        this.f6387t.f6327a = gVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean r(int i4) {
        return this.f6388u.containsKey(Integer.valueOf(i4));
    }
}
