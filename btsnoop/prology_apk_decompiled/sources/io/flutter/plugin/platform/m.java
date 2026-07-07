package io.flutter.plugin.platform;

import B2.AbstractActivityC0003d;
import B2.AbstractC0007h;
import B2.L;
import I.C0044m;
import a.AbstractC0110a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements K2.j, g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6355l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6356m;

    public /* synthetic */ m(int i4, Object obj) {
        this.f6355l = i4;
        this.f6356m = obj;
    }

    @Override // K2.j
    public void A(int i4) {
        G2.a aVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f6355l) {
            case 0:
                o oVar = (o) this.f6356m;
                f fVar = (f) oVar.w.get(i4);
                if (fVar == null) {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i4);
                    return;
                }
                SurfaceView surfaceView = ((U2.a) fVar).f2523a;
                if (surfaceView != null && (viewGroup = (ViewGroup) surfaceView.getParent()) != null) {
                    viewGroup.removeView(surfaceView);
                }
                oVar.w.remove(i4);
                try {
                    ((U2.a) fVar).f2523a.getHolder().getSurface().release();
                } catch (RuntimeException e4) {
                    Log.e("PlatformViewsController", "Disposing platform view threw an exception", e4);
                }
                if (oVar.r(i4)) {
                    HashMap hashMap = oVar.f6388u;
                    A a4 = (A) hashMap.get(Integer.valueOf(i4));
                    SurfaceView a5 = a4.a();
                    if (a5 != null) {
                        oVar.f6389v.remove(a5.getContext());
                    }
                    a4.f6317a.cancel();
                    a4.f6317a.detachState();
                    a4.f6324h.release();
                    a4.f6322f.release();
                    hashMap.remove(Integer.valueOf(i4));
                    return;
                }
                SparseArray sparseArray = oVar.f6392z;
                h hVar = (h) sparseArray.get(i4);
                if (hVar == null) {
                    SparseArray sparseArray2 = oVar.f6390x;
                    G2.b bVar = (G2.b) sparseArray2.get(i4);
                    if (bVar != null) {
                        bVar.removeAllViews();
                        bVar.a();
                        ViewGroup viewGroup3 = (ViewGroup) bVar.getParent();
                        if (viewGroup3 != null) {
                            viewGroup3.removeView(bVar);
                        }
                        sparseArray2.remove(i4);
                        return;
                    }
                    return;
                }
                hVar.removeAllViews();
                g gVar = hVar.f6343q;
                if (gVar != null) {
                    gVar.release();
                    hVar.f6343q = null;
                }
                ViewTreeObserver viewTreeObserver = hVar.getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (aVar = hVar.f6344r) != null) {
                    hVar.f6344r = null;
                    viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
                }
                ViewGroup viewGroup4 = (ViewGroup) hVar.getParent();
                if (viewGroup4 != null) {
                    viewGroup4.removeView(hVar);
                }
                sparseArray.remove(i4);
                return;
            default:
                n nVar = (n) this.f6356m;
                f fVar2 = (f) nVar.f6365t.get(i4);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i4);
                    return;
                }
                SurfaceView surfaceView2 = ((U2.a) fVar2).f2523a;
                if (surfaceView2 != null && (viewGroup2 = (ViewGroup) surfaceView2.getParent()) != null) {
                    viewGroup2.removeView(surfaceView2);
                }
                nVar.f6365t.remove(i4);
                try {
                    ((U2.a) fVar2).f2523a.getHolder().getSurface().release();
                } catch (RuntimeException e5) {
                    Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e5);
                }
                SparseArray sparseArray3 = nVar.f6366u;
                G2.b bVar2 = (G2.b) sparseArray3.get(i4);
                if (bVar2 != null) {
                    bVar2.removeAllViews();
                    bVar2.a();
                    ViewGroup viewGroup5 = (ViewGroup) bVar2.getParent();
                    if (viewGroup5 != null) {
                        viewGroup5.removeView(bVar2);
                    }
                    sparseArray3.remove(i4);
                    return;
                }
                return;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f6356m).id();
    }

    @Override // io.flutter.plugin.platform.g
    public void b(int i4, int i5) {
        ((TextureRegistry$SurfaceProducer) this.f6356m).setSize(i4, i5);
    }

    @Override // K2.j
    public void c(int i4) {
        SurfaceView surfaceView;
        switch (this.f6355l) {
            case 0:
                o oVar = (o) this.f6356m;
                if (oVar.r(i4)) {
                    surfaceView = ((A) oVar.f6388u.get(Integer.valueOf(i4))).a();
                } else {
                    f fVar = (f) oVar.w.get(i4);
                    if (fVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i4);
                        return;
                    }
                    surfaceView = ((U2.a) fVar).f2523a;
                }
                if (surfaceView != null) {
                    surfaceView.clearFocus();
                    return;
                }
                Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i4);
                return;
            default:
                f fVar2 = (f) ((n) this.f6356m).f6365t.get(i4);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i4);
                    return;
                }
                SurfaceView surfaceView2 = ((U2.a) fVar2).f2523a;
                if (surfaceView2 != null) {
                    surfaceView2.clearFocus();
                    return;
                }
                Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i4);
                return;
        }
    }

    public CharSequence d(K2.d dVar) {
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) ((T0.j) this.f6356m).f2416m;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0003d.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != K2.d.f955l) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0003d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0003d);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e4) {
                                    charSequence = coerceToText;
                                    e = e4;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e5) {
                    e = e5;
                    charSequence = text;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e7) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
            return null;
        }
    }

    @Override // K2.j
    public void e(K2.g gVar) {
        o oVar = (o) this.f6356m;
        oVar.getClass();
        o.d(19);
        o.a(oVar, gVar);
        if (oVar.f6384p.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        oVar.b(gVar, false);
        o.d(19);
        if (oVar.f6384p.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    public void f(ArrayList arrayList) {
        T0.j jVar = (T0.j) this.f6356m;
        jVar.getClass();
        int i4 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int ordinal = ((K2.f) arrayList.get(i5)).ordinal();
            if (ordinal == 0) {
                i4 &= -5;
            } else if (ordinal == 1) {
                i4 &= -515;
            }
        }
        jVar.f2415l = i4;
        jVar.c();
    }

    public void g(int i4) {
        View decorView = ((AbstractActivityC0003d) ((T0.j) this.f6356m).f2416m).getWindow().getDecorView();
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (b4 == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (b4 == 2) {
            decorView.performHapticFeedback(3);
        } else if (b4 == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (b4 != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.g
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f6356m).getHeight();
    }

    @Override // io.flutter.plugin.platform.g
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f6356m).getSurface();
    }

    @Override // io.flutter.plugin.platform.g
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f6356m).getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.l, java.lang.Runnable] */
    @Override // K2.j
    public void i(K2.i iVar, final D1.f fVar) {
        g gVar;
        o oVar = (o) this.f6356m;
        int l4 = oVar.l(iVar.f994b);
        int l5 = oVar.l(iVar.f995c);
        int i4 = iVar.f993a;
        if (!oVar.r(i4)) {
            f fVar2 = (f) oVar.w.get(i4);
            h hVar = (h) oVar.f6392z.get(i4);
            if (fVar2 == null || hVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
                return;
            }
            if ((l4 > hVar.getRenderTargetWidth() || l5 > hVar.getRenderTargetHeight()) && (gVar = hVar.f6343q) != null) {
                gVar.b(l4, l5);
            }
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            layoutParams.width = l4;
            layoutParams.height = l5;
            hVar.setLayoutParams(layoutParams);
            SurfaceView surfaceView = ((U2.a) fVar2).f2523a;
            if (surfaceView != null) {
                ViewGroup.LayoutParams layoutParams2 = surfaceView.getLayoutParams();
                layoutParams2.width = l4;
                layoutParams2.height = l5;
                surfaceView.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(hVar.getRenderTargetWidth() / oVar.g());
            int round2 = (int) Math.round(hVar.getRenderTargetHeight() / oVar.g());
            K2.k kVar = fVar.f457b;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            kVar.b(hashMap);
            return;
        }
        final float g4 = oVar.g();
        final A a4 = (A) oVar.f6388u.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.k kVar2 = oVar.f6386r;
        if (kVar2 != null) {
            if (kVar2.f6304e.f320b == 3) {
                kVar2.f6315p = true;
            }
            SingleViewPresentation singleViewPresentation = a4.f6317a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                a4.f6317a.getView().getClass();
            }
        }
        ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                o oVar2 = (o) m.this.f6356m;
                io.flutter.plugin.editing.k kVar3 = oVar2.f6386r;
                A a5 = a4;
                if (kVar3 != null) {
                    if (kVar3.f6304e.f320b == 3) {
                        kVar3.f6315p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = a5.f6317a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        a5.f6317a.getView().getClass();
                    }
                }
                double g5 = oVar2.f6382n == null ? g4 : oVar2.g();
                int round3 = (int) Math.round(a5.f6322f.getWidth() / g5);
                int round4 = (int) Math.round(a5.f6322f.getHeight() / g5);
                K2.k kVar4 = fVar.f457b;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                kVar4.b(hashMap2);
            }
        };
        int width = a4.f6322f.getWidth();
        g gVar2 = a4.f6322f;
        if (l4 == width && l5 == gVar2.getHeight()) {
            a4.a().postDelayed(r32, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            SurfaceView a5 = a4.a();
            gVar2.b(l4, l5);
            a4.f6324h.resize(l4, l5, a4.f6320d);
            a4.f6324h.setSurface(gVar2.getSurface());
            a5.postDelayed(r32, 0L);
            return;
        }
        boolean isFocused = a4.a().isFocused();
        t detachState = a4.f6317a.detachState();
        a4.f6324h.setSurface(null);
        a4.f6324h.release();
        DisplayManager displayManager = (DisplayManager) a4.f6318b.getSystemService("display");
        gVar2.b(l4, l5);
        a4.f6324h = displayManager.createVirtualDisplay("flutter-vd#" + a4.f6321e, l4, l5, a4.f6320d, gVar2.getSurface(), 0, A.f6316i, null);
        SurfaceView a6 = a4.a();
        a6.addOnAttachStateChangeListener(new y(a6, (l) r32));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(a4.f6318b, a4.f6324h.getDisplay(), a4.f6319c, detachState, a4.f6323g, isFocused);
        singleViewPresentation2.show();
        a4.f6317a.cancel();
        a4.f6317a = singleViewPresentation2;
    }

    @Override // K2.j
    public void k(boolean z4) {
        ((o) this.f6356m).f6374C = z4;
    }

    @Override // K2.j
    public void l(K2.h hVar) {
        switch (this.f6355l) {
            case 0:
                o oVar = (o) this.f6356m;
                float f4 = oVar.f6382n.getResources().getDisplayMetrics().density;
                int i4 = hVar.f977a;
                if (oVar.r(i4)) {
                    A a4 = (A) oVar.f6388u.get(Integer.valueOf(i4));
                    MotionEvent k4 = oVar.k(f4, hVar, true);
                    SingleViewPresentation singleViewPresentation = a4.f6317a;
                    if (singleViewPresentation == null) {
                        return;
                    }
                    singleViewPresentation.dispatchTouchEvent(k4);
                    return;
                }
                f fVar = (f) oVar.w.get(i4);
                if (fVar == null) {
                    Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i4);
                    return;
                }
                SurfaceView surfaceView = ((U2.a) fVar).f2523a;
                if (surfaceView != null) {
                    surfaceView.dispatchTouchEvent(oVar.k(f4, hVar, false));
                    return;
                }
                Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i4);
                return;
            default:
                n nVar = (n) this.f6356m;
                float f5 = nVar.f6360n.getResources().getDisplayMetrics().density;
                SparseArray sparseArray = nVar.f6365t;
                int i5 = hVar.f977a;
                f fVar2 = (f) sparseArray.get(i5);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i5);
                    return;
                }
                SurfaceView surfaceView2 = ((U2.a) fVar2).f2523a;
                if (surfaceView2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i5);
                    return;
                }
                MotionEvent m4 = nVar.f6367v.m(new L(hVar.f992p));
                List<List> list = (List) hVar.f983g;
                ArrayList arrayList = new ArrayList();
                for (List list2 : list) {
                    MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                    pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                    pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                    pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                    double d4 = f5;
                    pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d4);
                    pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d4);
                    pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d4);
                    pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d4);
                    pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d4);
                    pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d4);
                    arrayList.add(pointerCoords);
                }
                int i6 = hVar.f981e;
                MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i6]);
                if (m4 == null) {
                    List<List> list3 = (List) hVar.f982f;
                    ArrayList arrayList2 = new ArrayList();
                    for (List list4 : list3) {
                        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                        pointerProperties.id = ((Integer) list4.get(0)).intValue();
                        pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                        arrayList2.add(pointerProperties);
                    }
                    m4 = MotionEvent.obtain(hVar.f978b.longValue(), hVar.f979c.longValue(), hVar.f980d, hVar.f981e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i6]), pointerCoordsArr, hVar.f984h, hVar.f985i, hVar.f986j, hVar.f987k, hVar.f988l, hVar.f989m, hVar.f990n, hVar.f991o);
                } else if (pointerCoordsArr.length >= 1) {
                    m4.offsetLocation(pointerCoordsArr[0].x - m4.getX(), pointerCoordsArr[0].y - m4.getY());
                }
                surfaceView2.dispatchTouchEvent(m4);
                return;
        }
    }

    @Override // K2.j
    public void n(int i4, double d4, double d5) {
        o oVar = (o) this.f6356m;
        if (oVar.r(i4)) {
            return;
        }
        h hVar = (h) oVar.f6392z.get(i4);
        if (hVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i4);
        } else {
            int l4 = oVar.l(d4);
            int l5 = oVar.l(d5);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hVar.getLayoutParams();
            layoutParams.topMargin = l4;
            layoutParams.leftMargin = l5;
            hVar.setLayoutParams(layoutParams);
        }
    }

    @Override // K2.j
    public void o(int i4, int i5) {
        SurfaceView surfaceView;
        switch (this.f6355l) {
            case 0:
                if (i5 != 0 && i5 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i4 + ")");
                }
                o oVar = (o) this.f6356m;
                if (oVar.r(i4)) {
                    surfaceView = ((A) oVar.f6388u.get(Integer.valueOf(i4))).a();
                } else {
                    f fVar = (f) oVar.w.get(i4);
                    if (fVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i4);
                        return;
                    }
                    surfaceView = ((U2.a) fVar).f2523a;
                }
                if (surfaceView != null) {
                    surfaceView.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i4);
                return;
            default:
                f fVar2 = (f) ((n) this.f6356m).f6365t.get(i4);
                if (fVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i4);
                    return;
                }
                SurfaceView surfaceView2 = ((U2.a) fVar2).f2523a;
                if (surfaceView2 != null) {
                    surfaceView2.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i4);
                return;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f6356m).release();
        this.f6356m = null;
    }

    @Override // io.flutter.plugin.platform.g
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f6356m).scheduleFrame();
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [io.flutter.plugin.platform.k] */
    @Override // K2.j
    public long u(final K2.g gVar) {
        h hVar;
        long j4;
        final int i4 = 0;
        final int i5 = 1;
        final o oVar = (o) this.f6356m;
        o.a(oVar, gVar);
        SparseArray sparseArray = oVar.f6392z;
        int i6 = gVar.f968a;
        if (sparseArray.get(i6) != null) {
            throw new IllegalStateException(AbstractC0007h.k("Trying to create an already created platform view, view id: ", i6));
        }
        if (oVar.f6385q == null) {
            throw new IllegalStateException(AbstractC0007h.k("Texture registry is null. This means that platform views controller was detached, view id: ", i6));
        }
        if (oVar.f6383o == null) {
            throw new IllegalStateException(AbstractC0007h.k("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i6));
        }
        U2.a b4 = oVar.b(gVar, true);
        SurfaceView surfaceView = b4.f2523a;
        if (surfaceView.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean Y3 = AbstractC0110a.Y(surfaceView, new B2.x(13, o.f6371I));
        double d4 = gVar.f971d;
        double d5 = gVar.f970c;
        if (Y3) {
            if (gVar.f975h == 2) {
                o.d(19);
                if (oVar.f6384p.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!oVar.f6378G) {
                o.d(20);
                g i7 = o.i(oVar.f6385q);
                int l4 = oVar.l(d5);
                int l5 = oVar.l(d4);
                Activity activity = oVar.f6382n;
                ?? r14 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z4) {
                        switch (i5) {
                            case 0:
                                K2.g gVar2 = gVar;
                                o oVar2 = oVar;
                                int i8 = gVar2.f968a;
                                if (z4) {
                                    C0044m c0044m = (C0044m) oVar2.s.f96m;
                                    if (c0044m == null) {
                                        return;
                                    }
                                    c0044m.j("viewFocused", Integer.valueOf(i8), null);
                                    return;
                                }
                                io.flutter.plugin.editing.k kVar = oVar2.f6386r;
                                if (kVar != null) {
                                    kVar.b(i8);
                                    return;
                                }
                                return;
                            default:
                                o oVar3 = oVar;
                                if (!z4) {
                                    oVar3.getClass();
                                    return;
                                }
                                B1.d dVar = oVar3.s;
                                K2.g gVar3 = gVar;
                                C0044m c0044m2 = (C0044m) dVar.f96m;
                                if (c0044m2 == null) {
                                    return;
                                }
                                c0044m2.j("viewFocused", Integer.valueOf(gVar3.f968a), null);
                                return;
                        }
                    }
                };
                w wVar = A.f6316i;
                A a4 = null;
                if (l4 != 0 && l5 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    i7.b(l4, l5);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i8 = gVar.f968a;
                    sb.append(i8);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), l4, l5, displayMetrics.densityDpi, i7.getSurface(), 0, A.f6316i, null);
                    if (createVirtualDisplay != null) {
                        a4 = new A(activity, oVar.f6387t, createVirtualDisplay, b4, i7, r14, i8);
                    }
                }
                if (a4 != null) {
                    oVar.f6388u.put(Integer.valueOf(i6), a4);
                    oVar.f6389v.put(surfaceView.getContext(), surfaceView);
                    return i7.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + gVar.f969b + " with id: " + i6);
            }
        }
        o.d(23);
        int l6 = oVar.l(d5);
        int l7 = oVar.l(d4);
        if (oVar.f6378G) {
            hVar = new h(oVar.f6382n);
            j4 = -1;
        } else {
            g i9 = o.i(oVar.f6385q);
            h hVar2 = new h(oVar.f6382n);
            hVar2.f6343q = i9;
            Surface surface = i9.getSurface();
            if (surface != null) {
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long a5 = i9.a();
            hVar = hVar2;
            j4 = a5;
        }
        hVar.setTouchProcessor(oVar.f6381m);
        g gVar2 = hVar.f6343q;
        if (gVar2 != null) {
            gVar2.b(l6, l7);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l6, l7);
        int l8 = oVar.l(gVar.f972e);
        int l9 = oVar.l(gVar.f973f);
        layoutParams.topMargin = l8;
        layoutParams.leftMargin = l9;
        hVar.setLayoutParams(layoutParams);
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(l6, l7));
        surfaceView.setImportantForAccessibility(4);
        hVar.addView(surfaceView);
        hVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                switch (i4) {
                    case 0:
                        K2.g gVar22 = gVar;
                        o oVar2 = oVar;
                        int i82 = gVar22.f968a;
                        if (z4) {
                            C0044m c0044m = (C0044m) oVar2.s.f96m;
                            if (c0044m == null) {
                                return;
                            }
                            c0044m.j("viewFocused", Integer.valueOf(i82), null);
                            return;
                        }
                        io.flutter.plugin.editing.k kVar = oVar2.f6386r;
                        if (kVar != null) {
                            kVar.b(i82);
                            return;
                        }
                        return;
                    default:
                        o oVar3 = oVar;
                        if (!z4) {
                            oVar3.getClass();
                            return;
                        }
                        B1.d dVar = oVar3.s;
                        K2.g gVar3 = gVar;
                        C0044m c0044m2 = (C0044m) dVar.f96m;
                        if (c0044m2 == null) {
                            return;
                        }
                        c0044m2.j("viewFocused", Integer.valueOf(gVar3.f968a), null);
                        return;
                }
            }
        });
        oVar.f6383o.addView(hVar);
        sparseArray.append(i6, hVar);
        return j4;
    }

    public m(int i4) {
        this.f6355l = i4;
        switch (i4) {
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return;
            default:
                this.f6356m = new HashMap();
                return;
        }
    }
}
