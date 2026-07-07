package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.o */
/* loaded from: classes.dex */
public final class C1592o implements io.flutter.plugin.platform.InterfaceC1586i {

    /* renamed from: I */
    public static final java.lang.Class[] f6608I = {android.view.SurfaceView.class};

    /* renamed from: F */
    public final p008B1.C0026d f6614F;

    /* renamed from: m */
    public p009B2.C0044a f6618m;

    /* renamed from: n */
    public android.app.Activity f6619n;

    /* renamed from: o */
    public p009B2.C0064u f6620o;

    /* renamed from: q */
    public io.flutter.embedding.engine.renderer.C1561j f6622q;

    /* renamed from: r */
    public io.flutter.plugin.editing.C1575k f6623r;

    /* renamed from: s */
    public p008B1.C0026d f6624s;

    /* renamed from: p */
    public io.flutter.embedding.engine.FlutterJNI f6621p = null;

    /* renamed from: A */
    public int f6609A = 0;

    /* renamed from: B */
    public boolean f6610B = false;

    /* renamed from: C */
    public boolean f6611C = true;

    /* renamed from: G */
    public boolean f6615G = false;

    /* renamed from: H */
    public final io.flutter.plugin.platform.C1590m f6616H = new io.flutter.plugin.platform.C1590m(0, this);

    /* renamed from: l */
    public final io.flutter.plugin.platform.C1590m f6617l = new io.flutter.plugin.platform.C1590m(2);

    /* renamed from: u */
    public final java.util.HashMap f6626u = new java.util.HashMap();

    /* renamed from: t */
    public final io.flutter.plugin.platform.C1578a f6625t = new java.lang.Object();

    /* renamed from: v */
    public final java.util.HashMap f6627v = new java.util.HashMap();

    /* renamed from: y */
    public final android.util.SparseArray f6630y = new android.util.SparseArray();

    /* renamed from: D */
    public final java.util.HashSet f6612D = new java.util.HashSet();

    /* renamed from: E */
    public final java.util.HashSet f6613E = new java.util.HashSet();

    /* renamed from: z */
    public final android.util.SparseArray f6631z = new android.util.SparseArray();

    /* renamed from: w */
    public final android.util.SparseArray f6628w = new android.util.SparseArray();

    /* renamed from: x */
    public final android.util.SparseArray f6629x = new android.util.SparseArray();

    /* JADX WARN: Type inference failed for: r0v5, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public C1592o() {
        if (p008B1.C0026d.f96o == null) {
            p008B1.C0026d.f96o = new p008B1.C0026d(3);
        }
        this.f6614F = p008B1.C0026d.f96o;
    }

    /* renamed from: a */
    public static void m3508a(io.flutter.plugin.platform.C1592o c1592o, p043K2.C0331g c0331g) {
        c1592o.getClass();
        int i4 = c0331g.f1013g;
        if (i4 == 0 || i4 == 1) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to create a view with unknown direction value: " + i4 + "(view id: " + c0331g.f1007a + ")");
    }

    /* renamed from: d */
    public static void m3509d(int i4) {
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (i5 < i4) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m150i(i5, i4, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    /* renamed from: i */
    public static io.flutter.plugin.platform.InterfaceC1584g m3510i(io.flutter.embedding.engine.renderer.C1561j c1561j) {
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 < 29) {
            return i4 >= 29 ? new io.flutter.plugin.platform.C1580c(c1561j.m3445b()) : new io.flutter.plugin.platform.C1599v(c1561j.m3447d());
        }
        io.flutter.view.TextureRegistry$SurfaceProducer m3446c = c1561j.m3446c(i4 <= 34 ? 2 : 1);
        io.flutter.plugin.platform.C1590m c1590m = new io.flutter.plugin.platform.C1590m(4);
        c1590m.f6591m = m3446c;
        return c1590m;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: K */
    public final android.view.SurfaceView mo1708K(int i4) {
        if (mo1726r(i4)) {
            return ((io.flutter.plugin.platform.C1576A) this.f6626u.get(java.lang.Integer.valueOf(i4))).m3500a();
        }
        io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) this.f6628w.get(i4);
        if (interfaceC1583f == null) {
            return null;
        }
        return ((p081U2.C0751a) interfaceC1583f).f2611a;
    }

    /* renamed from: b */
    public final p081U2.C0751a m3511b(p043K2.C0331g c0331g, boolean z4) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f6617l.f6591m;
        java.lang.String str = c0331g.f1008b;
        p081U2.C0752b c0752b = (p081U2.C0752b) hashMap.get(str);
        if (c0752b == null) {
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        java.nio.ByteBuffer byteBuffer = c0331g.f1015i;
        java.lang.Object mo831a = byteBuffer != null ? c0752b.f2612a.mo831a(byteBuffer) : null;
        android.content.Context mutableContextWrapper = z4 ? new android.content.MutableContextWrapper(this.f6619n) : this.f6619n;
        p078T2.C0730g c0730g = (p078T2.C0730g) mo831a;
        java.util.Objects.requireNonNull(c0730g);
        p081U2.C0751a c0751a = new p081U2.C0751a(mutableContextWrapper, ((p078T2.AbstractC0735l) ((android.util.LongSparseArray) c0752b.f2613b.f219m).get(c0730g.f2528a.longValue())).f2540c);
        android.view.SurfaceView surfaceView = c0751a.f2611a;
        if (surfaceView == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        surfaceView.setLayoutDirection(c0331g.f1013g);
        this.f6628w.put(c0331g.f1007a, c0751a);
        return c0751a;
    }

    /* renamed from: c */
    public final void m3512c() {
        int i4 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f6630y;
            if (i4 >= sparseArray.size()) {
                return;
            }
            io.flutter.plugin.platform.C1581d c1581d = (io.flutter.plugin.platform.C1581d) sparseArray.valueAt(i4);
            c1581d.mo195c();
            c1581d.f167l.close();
            i4++;
        }
    }

    /* renamed from: e */
    public final void m3513e(boolean z4) {
        int i4 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f6630y;
            if (i4 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i4);
            io.flutter.plugin.platform.C1581d c1581d = (io.flutter.plugin.platform.C1581d) sparseArray.valueAt(i4);
            if (this.f6612D.contains(java.lang.Integer.valueOf(keyAt))) {
                p013C2.C0138c c0138c = this.f6620o.f210s;
                if (c0138c != null) {
                    c1581d.mo194b(c0138c.f352b);
                }
                z4 &= c1581d.m197e();
            } else {
                if (!this.f6610B) {
                    c1581d.mo195c();
                }
                c1581d.setVisibility(8);
                this.f6620o.removeView(c1581d);
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            android.util.SparseArray sparseArray2 = this.f6629x;
            if (i5 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i5);
            android.view.View view = (android.view.View) sparseArray2.get(keyAt2);
            if (!this.f6613E.contains(java.lang.Integer.valueOf(keyAt2)) || (!z4 && this.f6611C)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i5++;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: f */
    public final void mo1724f() {
        this.f6625t.f6562a = null;
    }

    /* renamed from: g */
    public final float m3514g() {
        return this.f6619n.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    /* renamed from: h */
    public final void m3515h() {
        if (!this.f6611C || this.f6610B) {
            return;
        }
        p009B2.C0064u c0064u = this.f6620o;
        c0064u.f206o.mo193a();
        p009B2.C0053j c0053j = c0064u.f205n;
        if (c0053j == null) {
            p009B2.C0053j c0053j2 = new p009B2.C0053j(c0064u.getContext(), c0064u.getWidth(), c0064u.getHeight(), 1);
            c0064u.f205n = c0053j2;
            c0064u.addView(c0053j2);
        } else {
            c0053j.m198g(c0064u.getWidth(), c0064u.getHeight());
        }
        c0064u.f207p = c0064u.f206o;
        p009B2.C0053j c0053j3 = c0064u.f205n;
        c0064u.f206o = c0053j3;
        p013C2.C0138c c0138c = c0064u.f210s;
        if (c0138c != null) {
            c0053j3.mo194b(c0138c.f352b);
        }
        this.f6610B = true;
    }

    /* renamed from: j */
    public final void m3516j() {
        for (io.flutter.plugin.platform.C1576A c1576a : this.f6626u.values()) {
            int width = c1576a.f6557f.getWidth();
            io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = c1576a.f6557f;
            int height = interfaceC1584g.getHeight();
            boolean isFocused = c1576a.m3500a().isFocused();
            io.flutter.plugin.platform.C1597t detachState = c1576a.f6552a.detachState();
            c1576a.f6559h.setSurface(null);
            c1576a.f6559h.release();
            c1576a.f6559h = ((android.hardware.display.DisplayManager) c1576a.f6553b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + c1576a.f6556e, width, height, c1576a.f6555d, interfaceC1584g.getSurface(), 0, io.flutter.plugin.platform.C1576A.f6551i, null);
            io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = new io.flutter.plugin.platform.SingleViewPresentation(c1576a.f6553b, c1576a.f6559h.getDisplay(), c1576a.f6554c, detachState, c1576a.f6558g, isFocused);
            singleViewPresentation.show();
            c1576a.f6552a.cancel();
            c1576a.f6552a = singleViewPresentation;
        }
    }

    /* renamed from: k */
    public final android.view.MotionEvent m3517k(float f4, p043K2.C0332h c0332h, boolean z4) {
        android.view.MotionEvent m111m = this.f6614F.m111m(new p009B2.C0041L(c0332h.f1031p));
        java.util.List<java.util.List> list = (java.util.List) c0332h.f1022g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List list2 : list) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((java.lang.Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((java.lang.Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((java.lang.Double) list2.get(2)).doubleValue();
            double d4 = f4;
            pointerCoords.toolMajor = (float) (((java.lang.Double) list2.get(3)).doubleValue() * d4);
            pointerCoords.toolMinor = (float) (((java.lang.Double) list2.get(4)).doubleValue() * d4);
            pointerCoords.touchMajor = (float) (((java.lang.Double) list2.get(5)).doubleValue() * d4);
            pointerCoords.touchMinor = (float) (((java.lang.Double) list2.get(6)).doubleValue() * d4);
            pointerCoords.x = (float) (((java.lang.Double) list2.get(7)).doubleValue() * d4);
            pointerCoords.y = (float) (((java.lang.Double) list2.get(8)).doubleValue() * d4);
            arrayList.add(pointerCoords);
        }
        int i4 = c0332h.f1020e;
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) arrayList.toArray(new android.view.MotionEvent.PointerCoords[i4]);
        if (!z4 && m111m != null) {
            if (pointerCoordsArr.length >= 1) {
                m111m.offsetLocation(pointerCoordsArr[0].x - m111m.getX(), pointerCoordsArr[0].y - m111m.getY());
            }
            return m111m;
        }
        java.util.List<java.util.List> list3 = (java.util.List) c0332h.f1021f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.List list4 : list3) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerProperties.id = ((java.lang.Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((java.lang.Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return android.view.MotionEvent.obtain(c0332h.f1017b.longValue(), c0332h.f1018c.longValue(), c0332h.f1019d, c0332h.f1020e, (android.view.MotionEvent.PointerProperties[]) arrayList2.toArray(new android.view.MotionEvent.PointerProperties[i4]), pointerCoordsArr, c0332h.f1023h, c0332h.f1024i, c0332h.f1025j, c0332h.f1026k, c0332h.f1027l, c0332h.f1028m, c0332h.f1029n, c0332h.f1030o);
    }

    /* renamed from: l */
    public final int m3518l(double d4) {
        return (int) java.lang.Math.round(d4 * m3514g());
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: m */
    public final void mo1725m(io.flutter.view.C1610g c1610g) {
        this.f6625t.f6562a = c1610g;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1586i
    /* renamed from: r */
    public final boolean mo1726r(int i4) {
        return this.f6626u.containsKey(java.lang.Integer.valueOf(i4));
    }
}
