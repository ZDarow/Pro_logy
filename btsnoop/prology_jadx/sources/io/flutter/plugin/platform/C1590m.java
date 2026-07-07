package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.m */
/* loaded from: classes.dex */
public final class C1590m implements p043K2.InterfaceC0334j, io.flutter.plugin.platform.InterfaceC1584g {

    /* renamed from: l */
    public final /* synthetic */ int f6590l;

    /* renamed from: m */
    public java.lang.Object f6591m;

    public /* synthetic */ C1590m(int i4, java.lang.Object obj) {
        this.f6590l = i4;
        this.f6591m = obj;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: A */
    public void mo731A(int i4) {
        p030G2.ViewTreeObserverOnGlobalFocusChangeListenerC0239a viewTreeObserverOnGlobalFocusChangeListenerC0239a;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        switch (this.f6590l) {
            case 0:
                io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) c1592o.f6628w.get(i4);
                if (interfaceC1583f == null) {
                    android.util.Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i4);
                    return;
                }
                android.view.SurfaceView surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
                if (surfaceView != null && (viewGroup = (android.view.ViewGroup) surfaceView.getParent()) != null) {
                    viewGroup.removeView(surfaceView);
                }
                c1592o.f6628w.remove(i4);
                try {
                    ((p081U2.C0751a) interfaceC1583f).f2611a.getHolder().getSurface().release();
                } catch (java.lang.RuntimeException e4) {
                    android.util.Log.e("PlatformViewsController", "Disposing platform view threw an exception", e4);
                }
                if (c1592o.mo1726r(i4)) {
                    java.util.HashMap hashMap = c1592o.f6626u;
                    io.flutter.plugin.platform.C1576A c1576a = (io.flutter.plugin.platform.C1576A) hashMap.get(java.lang.Integer.valueOf(i4));
                    android.view.SurfaceView m3500a = c1576a.m3500a();
                    if (m3500a != null) {
                        c1592o.f6627v.remove(m3500a.getContext());
                    }
                    c1576a.f6552a.cancel();
                    c1576a.f6552a.detachState();
                    c1576a.f6559h.release();
                    c1576a.f6557f.release();
                    hashMap.remove(java.lang.Integer.valueOf(i4));
                    return;
                }
                android.util.SparseArray sparseArray = c1592o.f6631z;
                io.flutter.plugin.platform.C1585h c1585h = (io.flutter.plugin.platform.C1585h) sparseArray.get(i4);
                if (c1585h == null) {
                    android.util.SparseArray sparseArray2 = c1592o.f6629x;
                    p030G2.C0240b c0240b = (p030G2.C0240b) sparseArray2.get(i4);
                    if (c0240b != null) {
                        c0240b.removeAllViews();
                        c0240b.m650a();
                        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) c0240b.getParent();
                        if (viewGroup3 != null) {
                            viewGroup3.removeView(c0240b);
                        }
                        sparseArray2.remove(i4);
                        return;
                    }
                    return;
                }
                c1585h.removeAllViews();
                io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = c1585h.f6578q;
                if (interfaceC1584g != null) {
                    interfaceC1584g.release();
                    c1585h.f6578q = null;
                }
                android.view.ViewTreeObserver viewTreeObserver = c1585h.getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (viewTreeObserverOnGlobalFocusChangeListenerC0239a = c1585h.f6579r) != null) {
                    c1585h.f6579r = null;
                    viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0239a);
                }
                android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) c1585h.getParent();
                if (viewGroup4 != null) {
                    viewGroup4.removeView(c1585h);
                }
                sparseArray.remove(i4);
                return;
            default:
                io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f6591m;
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f2 = (io.flutter.plugin.platform.InterfaceC1583f) c1591n.f6601t.get(i4);
                if (interfaceC1583f2 == null) {
                    android.util.Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i4);
                    return;
                }
                android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) interfaceC1583f2).f2611a;
                if (surfaceView2 != null && (viewGroup2 = (android.view.ViewGroup) surfaceView2.getParent()) != null) {
                    viewGroup2.removeView(surfaceView2);
                }
                c1591n.f6601t.remove(i4);
                try {
                    ((p081U2.C0751a) interfaceC1583f2).f2611a.getHolder().getSurface().release();
                } catch (java.lang.RuntimeException e5) {
                    android.util.Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e5);
                }
                android.util.SparseArray sparseArray3 = c1591n.f6602u;
                p030G2.C0240b c0240b2 = (p030G2.C0240b) sparseArray3.get(i4);
                if (c0240b2 != null) {
                    c0240b2.removeAllViews();
                    c0240b2.m650a();
                    android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) c0240b2.getParent();
                    if (viewGroup5 != null) {
                        viewGroup5.removeView(c0240b2);
                    }
                    sparseArray3.remove(i4);
                    return;
                }
                return;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: a */
    public long mo3501a() {
        return ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).mo3441id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    /* renamed from: b */
    public void mo3502b(int i4, int i5) {
        ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).setSize(i4, i5);
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: c */
    public void mo732c(int i4) {
        android.view.SurfaceView surfaceView;
        switch (this.f6590l) {
            case 0:
                io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
                if (c1592o.mo1726r(i4)) {
                    surfaceView = ((io.flutter.plugin.platform.C1576A) c1592o.f6626u.get(java.lang.Integer.valueOf(i4))).m3500a();
                } else {
                    io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) c1592o.f6628w.get(i4);
                    if (interfaceC1583f == null) {
                        android.util.Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i4);
                        return;
                    }
                    surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
                }
                if (surfaceView != null) {
                    surfaceView.clearFocus();
                    return;
                }
                android.util.Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i4);
                return;
            default:
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f2 = (io.flutter.plugin.platform.InterfaceC1583f) ((io.flutter.plugin.platform.C1591n) this.f6591m).f6601t.get(i4);
                if (interfaceC1583f2 == null) {
                    android.util.Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i4);
                    return;
                }
                android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) interfaceC1583f2).f2611a;
                if (surfaceView2 != null) {
                    surfaceView2.clearFocus();
                    return;
                }
                android.util.Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i4);
                return;
        }
    }

    /* renamed from: d */
    public java.lang.CharSequence m3505d(p043K2.EnumC0328d enumC0328d) {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) ((p077T0.C0722j) this.f6591m).f2503m;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) abstractActivityC0047d.getSystemService("clipboard");
        java.lang.CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (enumC0328d != null && enumC0328d != p043K2.EnumC0328d.f994l) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                java.lang.CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    android.net.Uri uri = itemAt.getUri();
                    if (uri == null) {
                        android.util.Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        java.lang.String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0047d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            java.lang.CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0047d);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (java.io.IOException e4) {
                                    charSequence = coerceToText;
                                    e = e4;
                                    android.util.Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            android.util.Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (java.io.IOException e5) {
                    e = e5;
                    charSequence = text;
                }
            } catch (java.io.IOException e6) {
                e = e6;
            }
        } catch (java.io.FileNotFoundException unused) {
            android.util.Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (java.lang.SecurityException e7) {
            android.util.Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
            return null;
        }
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: e */
    public void mo733e(p043K2.C0331g c0331g) {
        io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
        c1592o.getClass();
        io.flutter.plugin.platform.C1592o.m3509d(19);
        io.flutter.plugin.platform.C1592o.m3508a(c1592o, c0331g);
        if (c1592o.f6621p.IsSurfaceControlEnabled()) {
            throw new java.lang.IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        c1592o.m3511b(c0331g, false);
        io.flutter.plugin.platform.C1592o.m3509d(19);
        if (c1592o.f6621p.IsSurfaceControlEnabled()) {
            throw new java.lang.IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    /* renamed from: f */
    public void m3506f(java.util.ArrayList arrayList) {
        p077T0.C0722j c0722j = (p077T0.C0722j) this.f6591m;
        c0722j.getClass();
        int i4 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int ordinal = ((p043K2.EnumC0330f) arrayList.get(i5)).ordinal();
            if (ordinal == 0) {
                i4 &= -5;
            } else if (ordinal == 1) {
                i4 &= -515;
            }
        }
        c0722j.f2502l = i4;
        c0722j.m1316c();
    }

    /* renamed from: g */
    public void m3507g(int i4) {
        android.view.View decorView = ((p009B2.AbstractActivityC0047d) ((p077T0.C0722j) this.f6591m).f2503m).getWindow().getDecorView();
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (m781b == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (m781b == 2) {
            decorView.performHapticFeedback(3);
        } else if (m781b == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (m781b != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public int getHeight() {
        return ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).getHeight();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public android.view.Surface getSurface() {
        return ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public int getWidth() {
        return ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.l, java.lang.Runnable] */
    @Override // p043K2.InterfaceC0334j
    /* renamed from: i */
    public void mo734i(p043K2.C0333i c0333i, final p017D1.C0173f c0173f) {
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g;
        io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
        int m3518l = c1592o.m3518l(c0333i.f1033b);
        int m3518l2 = c1592o.m3518l(c0333i.f1034c);
        int i4 = c0333i.f1032a;
        if (!c1592o.mo1726r(i4)) {
            io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) c1592o.f6628w.get(i4);
            io.flutter.plugin.platform.C1585h c1585h = (io.flutter.plugin.platform.C1585h) c1592o.f6631z.get(i4);
            if (interfaceC1583f == null || c1585h == null) {
                android.util.Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
                return;
            }
            if ((m3518l > c1585h.getRenderTargetWidth() || m3518l2 > c1585h.getRenderTargetHeight()) && (interfaceC1584g = c1585h.f6578q) != null) {
                interfaceC1584g.mo3502b(m3518l, m3518l2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = c1585h.getLayoutParams();
            layoutParams.width = m3518l;
            layoutParams.height = m3518l2;
            c1585h.setLayoutParams(layoutParams);
            android.view.SurfaceView surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
            if (surfaceView != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = surfaceView.getLayoutParams();
                layoutParams2.width = m3518l;
                layoutParams2.height = m3518l2;
                surfaceView.setLayoutParams(layoutParams2);
            }
            int round = (int) java.lang.Math.round(c1585h.getRenderTargetWidth() / c1592o.m3514g());
            int round2 = (int) java.lang.Math.round(c1585h.getRenderTargetHeight() / c1592o.m3514g());
            p043K2.C0335k c0335k = c0173f.f466b;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("width", java.lang.Double.valueOf(round));
            hashMap.put("height", java.lang.Double.valueOf(round2));
            c0335k.mo742b(hashMap);
            return;
        }
        final float m3514g = c1592o.m3514g();
        final io.flutter.plugin.platform.C1576A c1576a = (io.flutter.plugin.platform.C1576A) c1592o.f6626u.get(java.lang.Integer.valueOf(i4));
        io.flutter.plugin.editing.C1575k c1575k = c1592o.f6623r;
        if (c1575k != null) {
            if (c1575k.f6539e.f326b == 3) {
                c1575k.f6550p = true;
            }
            io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = c1576a.f6552a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                c1576a.f6552a.getView().getClass();
            }
        }
        ?? r32 = new java.lang.Runnable() { // from class: io.flutter.plugin.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugin.platform.C1592o c1592o2 = (io.flutter.plugin.platform.C1592o) io.flutter.plugin.platform.C1590m.this.f6591m;
                io.flutter.plugin.editing.C1575k c1575k2 = c1592o2.f6623r;
                io.flutter.plugin.platform.C1576A c1576a2 = c1576a;
                if (c1575k2 != null) {
                    if (c1575k2.f6539e.f326b == 3) {
                        c1575k2.f6550p = false;
                    }
                    io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation2 = c1576a2.f6552a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        c1576a2.f6552a.getView().getClass();
                    }
                }
                double m3514g2 = c1592o2.f6619n == null ? m3514g : c1592o2.m3514g();
                int round3 = (int) java.lang.Math.round(c1576a2.f6557f.getWidth() / m3514g2);
                int round4 = (int) java.lang.Math.round(c1576a2.f6557f.getHeight() / m3514g2);
                p043K2.C0335k c0335k2 = c0173f.f466b;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("width", java.lang.Double.valueOf(round3));
                hashMap2.put("height", java.lang.Double.valueOf(round4));
                c0335k2.mo742b(hashMap2);
            }
        };
        int width = c1576a.f6557f.getWidth();
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g2 = c1576a.f6557f;
        if (m3518l == width && m3518l2 == interfaceC1584g2.getHeight()) {
            c1576a.m3500a().postDelayed(r32, 0L);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.view.SurfaceView m3500a = c1576a.m3500a();
            interfaceC1584g2.mo3502b(m3518l, m3518l2);
            c1576a.f6559h.resize(m3518l, m3518l2, c1576a.f6555d);
            c1576a.f6559h.setSurface(interfaceC1584g2.getSurface());
            m3500a.postDelayed(r32, 0L);
            return;
        }
        boolean isFocused = c1576a.m3500a().isFocused();
        io.flutter.plugin.platform.C1597t detachState = c1576a.f6552a.detachState();
        c1576a.f6559h.setSurface(null);
        c1576a.f6559h.release();
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) c1576a.f6553b.getSystemService("display");
        interfaceC1584g2.mo3502b(m3518l, m3518l2);
        c1576a.f6559h = displayManager.createVirtualDisplay("flutter-vd#" + c1576a.f6556e, m3518l, m3518l2, c1576a.f6555d, interfaceC1584g2.getSurface(), 0, io.flutter.plugin.platform.C1576A.f6551i, null);
        android.view.SurfaceView m3500a2 = c1576a.m3500a();
        m3500a2.addOnAttachStateChangeListener(new io.flutter.plugin.platform.ViewOnAttachStateChangeListenerC1602y(m3500a2, (io.flutter.plugin.platform.RunnableC1589l) r32));
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation2 = new io.flutter.plugin.platform.SingleViewPresentation(c1576a.f6553b, c1576a.f6559h.getDisplay(), c1576a.f6554c, detachState, c1576a.f6558g, isFocused);
        singleViewPresentation2.show();
        c1576a.f6552a.cancel();
        c1576a.f6552a = singleViewPresentation2;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: k */
    public void mo735k(boolean z4) {
        ((io.flutter.plugin.platform.C1592o) this.f6591m).f6611C = z4;
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: l */
    public void mo736l(p043K2.C0332h c0332h) {
        switch (this.f6590l) {
            case 0:
                io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
                float f4 = c1592o.f6619n.getResources().getDisplayMetrics().density;
                int i4 = c0332h.f1016a;
                if (c1592o.mo1726r(i4)) {
                    io.flutter.plugin.platform.C1576A c1576a = (io.flutter.plugin.platform.C1576A) c1592o.f6626u.get(java.lang.Integer.valueOf(i4));
                    android.view.MotionEvent m3517k = c1592o.m3517k(f4, c0332h, true);
                    io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = c1576a.f6552a;
                    if (singleViewPresentation == null) {
                        return;
                    }
                    singleViewPresentation.dispatchTouchEvent(m3517k);
                    return;
                }
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) c1592o.f6628w.get(i4);
                if (interfaceC1583f == null) {
                    android.util.Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i4);
                    return;
                }
                android.view.SurfaceView surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
                if (surfaceView != null) {
                    surfaceView.dispatchTouchEvent(c1592o.m3517k(f4, c0332h, false));
                    return;
                }
                android.util.Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i4);
                return;
            default:
                io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f6591m;
                float f5 = c1591n.f6595n.getResources().getDisplayMetrics().density;
                android.util.SparseArray sparseArray = c1591n.f6601t;
                int i5 = c0332h.f1016a;
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f2 = (io.flutter.plugin.platform.InterfaceC1583f) sparseArray.get(i5);
                if (interfaceC1583f2 == null) {
                    android.util.Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i5);
                    return;
                }
                android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) interfaceC1583f2).f2611a;
                if (surfaceView2 == null) {
                    android.util.Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i5);
                    return;
                }
                android.view.MotionEvent m111m = c1591n.f6603v.m111m(new p009B2.C0041L(c0332h.f1031p));
                java.util.List<java.util.List> list = (java.util.List) c0332h.f1022g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.List list2 : list) {
                    android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
                    pointerCoords.orientation = (float) ((java.lang.Double) list2.get(0)).doubleValue();
                    pointerCoords.pressure = (float) ((java.lang.Double) list2.get(1)).doubleValue();
                    pointerCoords.size = (float) ((java.lang.Double) list2.get(2)).doubleValue();
                    double d4 = f5;
                    pointerCoords.toolMajor = (float) (((java.lang.Double) list2.get(3)).doubleValue() * d4);
                    pointerCoords.toolMinor = (float) (((java.lang.Double) list2.get(4)).doubleValue() * d4);
                    pointerCoords.touchMajor = (float) (((java.lang.Double) list2.get(5)).doubleValue() * d4);
                    pointerCoords.touchMinor = (float) (((java.lang.Double) list2.get(6)).doubleValue() * d4);
                    pointerCoords.x = (float) (((java.lang.Double) list2.get(7)).doubleValue() * d4);
                    pointerCoords.y = (float) (((java.lang.Double) list2.get(8)).doubleValue() * d4);
                    arrayList.add(pointerCoords);
                }
                int i6 = c0332h.f1020e;
                android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) arrayList.toArray(new android.view.MotionEvent.PointerCoords[i6]);
                if (m111m == null) {
                    java.util.List<java.util.List> list3 = (java.util.List) c0332h.f1021f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.util.List list4 : list3) {
                        android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
                        pointerProperties.id = ((java.lang.Integer) list4.get(0)).intValue();
                        pointerProperties.toolType = ((java.lang.Integer) list4.get(1)).intValue();
                        arrayList2.add(pointerProperties);
                    }
                    m111m = android.view.MotionEvent.obtain(c0332h.f1017b.longValue(), c0332h.f1018c.longValue(), c0332h.f1019d, c0332h.f1020e, (android.view.MotionEvent.PointerProperties[]) arrayList2.toArray(new android.view.MotionEvent.PointerProperties[i6]), pointerCoordsArr, c0332h.f1023h, c0332h.f1024i, c0332h.f1025j, c0332h.f1026k, c0332h.f1027l, c0332h.f1028m, c0332h.f1029n, c0332h.f1030o);
                } else if (pointerCoordsArr.length >= 1) {
                    m111m.offsetLocation(pointerCoordsArr[0].x - m111m.getX(), pointerCoordsArr[0].y - m111m.getY());
                }
                surfaceView2.dispatchTouchEvent(m111m);
                return;
        }
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: n */
    public void mo737n(int i4, double d4, double d5) {
        io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
        if (c1592o.mo1726r(i4)) {
            return;
        }
        io.flutter.plugin.platform.C1585h c1585h = (io.flutter.plugin.platform.C1585h) c1592o.f6631z.get(i4);
        if (c1585h == null) {
            android.util.Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i4);
        } else {
            int m3518l = c1592o.m3518l(d4);
            int m3518l2 = c1592o.m3518l(d5);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c1585h.getLayoutParams();
            layoutParams.topMargin = m3518l;
            layoutParams.leftMargin = m3518l2;
            c1585h.setLayoutParams(layoutParams);
        }
    }

    @Override // p043K2.InterfaceC0334j
    /* renamed from: o */
    public void mo738o(int i4, int i5) {
        android.view.SurfaceView surfaceView;
        switch (this.f6590l) {
            case 0:
                if (i5 != 0 && i5 != 1) {
                    throw new java.lang.IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i4 + ")");
                }
                io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
                if (c1592o.mo1726r(i4)) {
                    surfaceView = ((io.flutter.plugin.platform.C1576A) c1592o.f6626u.get(java.lang.Integer.valueOf(i4))).m3500a();
                } else {
                    io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f = (io.flutter.plugin.platform.InterfaceC1583f) c1592o.f6628w.get(i4);
                    if (interfaceC1583f == null) {
                        android.util.Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i4);
                        return;
                    }
                    surfaceView = ((p081U2.C0751a) interfaceC1583f).f2611a;
                }
                if (surfaceView != null) {
                    surfaceView.setLayoutDirection(i5);
                    return;
                }
                android.util.Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i4);
                return;
            default:
                io.flutter.plugin.platform.InterfaceC1583f interfaceC1583f2 = (io.flutter.plugin.platform.InterfaceC1583f) ((io.flutter.plugin.platform.C1591n) this.f6591m).f6601t.get(i4);
                if (interfaceC1583f2 == null) {
                    android.util.Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i4);
                    return;
                }
                android.view.SurfaceView surfaceView2 = ((p081U2.C0751a) interfaceC1583f2).f2611a;
                if (surfaceView2 != null) {
                    surfaceView2.setLayoutDirection(i5);
                    return;
                }
                android.util.Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i4);
                return;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public void release() {
        ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).release();
        this.f6591m = null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1584g
    public void scheduleFrame() {
        ((io.flutter.view.TextureRegistry$SurfaceProducer) this.f6591m).scheduleFrame();
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [io.flutter.plugin.platform.k] */
    @Override // p043K2.InterfaceC0334j
    /* renamed from: u */
    public long mo739u(final p043K2.C0331g c0331g) {
        io.flutter.plugin.platform.C1585h c1585h;
        long j4;
        final int i4 = 0;
        final int i5 = 1;
        final io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6591m;
        io.flutter.plugin.platform.C1592o.m3508a(c1592o, c0331g);
        android.util.SparseArray sparseArray = c1592o.f6631z;
        int i6 = c0331g.f1007a;
        if (sparseArray.get(i6) != null) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Trying to create an already created platform view, view id: ", i6));
        }
        if (c1592o.f6622q == null) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Texture registry is null. This means that platform views controller was detached, view id: ", i6));
        }
        if (c1592o.f6620o == null) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i6));
        }
        p081U2.C0751a m3511b = c1592o.m3511b(c0331g, true);
        android.view.SurfaceView surfaceView = m3511b.f2611a;
        if (surfaceView.getParent() != null) {
            throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean m1787Y = p101a.AbstractC0936a.m1787Y(surfaceView, new p009B2.C0067x(13, io.flutter.plugin.platform.C1592o.f6608I));
        double d4 = c0331g.f1010d;
        double d5 = c0331g.f1009c;
        if (m1787Y) {
            if (c0331g.f1014h == 2) {
                io.flutter.plugin.platform.C1592o.m3509d(19);
                if (c1592o.f6621p.IsSurfaceControlEnabled()) {
                    throw new java.lang.IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!c1592o.f6615G) {
                io.flutter.plugin.platform.C1592o.m3509d(20);
                io.flutter.plugin.platform.InterfaceC1584g m3510i = io.flutter.plugin.platform.C1592o.m3510i(c1592o.f6622q);
                int m3518l = c1592o.m3518l(d5);
                int m3518l2 = c1592o.m3518l(d4);
                android.app.Activity activity = c1592o.f6619n;
                ?? r14 = new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z4) {
                        switch (i5) {
                            case 0:
                                p043K2.C0331g c0331g2 = c0331g;
                                io.flutter.plugin.platform.C1592o c1592o2 = c1592o;
                                int i7 = c0331g2.f1007a;
                                if (z4) {
                                    p035I.C0291m c0291m = (p035I.C0291m) c1592o2.f6624s.f99m;
                                    if (c0291m == null) {
                                        return;
                                    }
                                    c0291m.m694j("viewFocused", java.lang.Integer.valueOf(i7), null);
                                    return;
                                }
                                io.flutter.plugin.editing.C1575k c1575k = c1592o2.f6623r;
                                if (c1575k != null) {
                                    c1575k.m3497b(i7);
                                    return;
                                }
                                return;
                            default:
                                io.flutter.plugin.platform.C1592o c1592o3 = c1592o;
                                if (!z4) {
                                    c1592o3.getClass();
                                    return;
                                }
                                p008B1.C0026d c0026d = c1592o3.f6624s;
                                p043K2.C0331g c0331g3 = c0331g;
                                p035I.C0291m c0291m2 = (p035I.C0291m) c0026d.f99m;
                                if (c0291m2 == null) {
                                    return;
                                }
                                c0291m2.m694j("viewFocused", java.lang.Integer.valueOf(c0331g3.f1007a), null);
                                return;
                        }
                    }
                };
                io.flutter.plugin.platform.C1600w c1600w = io.flutter.plugin.platform.C1576A.f6551i;
                io.flutter.plugin.platform.C1576A c1576a = null;
                if (m3518l != 0 && m3518l2 != 0) {
                    android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) activity.getSystemService("display");
                    android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    m3510i.mo3502b(m3518l, m3518l2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("flutter-vd#");
                    int i7 = c0331g.f1007a;
                    sb.append(i7);
                    android.hardware.display.VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), m3518l, m3518l2, displayMetrics.densityDpi, m3510i.getSurface(), 0, io.flutter.plugin.platform.C1576A.f6551i, null);
                    if (createVirtualDisplay != null) {
                        c1576a = new io.flutter.plugin.platform.C1576A(activity, c1592o.f6625t, createVirtualDisplay, m3511b, m3510i, r14, i7);
                    }
                }
                if (c1576a != null) {
                    c1592o.f6626u.put(java.lang.Integer.valueOf(i6), c1576a);
                    c1592o.f6627v.put(surfaceView.getContext(), surfaceView);
                    return m3510i.mo3501a();
                }
                throw new java.lang.IllegalStateException("Failed creating virtual display for a " + c0331g.f1008b + " with id: " + i6);
            }
        }
        io.flutter.plugin.platform.C1592o.m3509d(23);
        int m3518l3 = c1592o.m3518l(d5);
        int m3518l4 = c1592o.m3518l(d4);
        if (c1592o.f6615G) {
            c1585h = new io.flutter.plugin.platform.C1585h(c1592o.f6619n);
            j4 = -1;
        } else {
            io.flutter.plugin.platform.InterfaceC1584g m3510i2 = io.flutter.plugin.platform.C1592o.m3510i(c1592o.f6622q);
            io.flutter.plugin.platform.C1585h c1585h2 = new io.flutter.plugin.platform.C1585h(c1592o.f6619n);
            c1585h2.f6578q = m3510i2;
            android.view.Surface surface = m3510i2.getSurface();
            if (surface != null) {
                android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long mo3501a = m3510i2.mo3501a();
            c1585h = c1585h2;
            j4 = mo3501a;
        }
        c1585h.setTouchProcessor(c1592o.f6618m);
        io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g = c1585h.f6578q;
        if (interfaceC1584g != null) {
            interfaceC1584g.mo3502b(m3518l3, m3518l4);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(m3518l3, m3518l4);
        int m3518l5 = c1592o.m3518l(c0331g.f1011e);
        int m3518l6 = c1592o.m3518l(c0331g.f1012f);
        layoutParams.topMargin = m3518l5;
        layoutParams.leftMargin = m3518l6;
        c1585h.setLayoutParams(layoutParams);
        surfaceView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(m3518l3, m3518l4));
        surfaceView.setImportantForAccessibility(4);
        c1585h.addView(surfaceView);
        c1585h.setOnDescendantFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z4) {
                switch (i4) {
                    case 0:
                        p043K2.C0331g c0331g2 = c0331g;
                        io.flutter.plugin.platform.C1592o c1592o2 = c1592o;
                        int i72 = c0331g2.f1007a;
                        if (z4) {
                            p035I.C0291m c0291m = (p035I.C0291m) c1592o2.f6624s.f99m;
                            if (c0291m == null) {
                                return;
                            }
                            c0291m.m694j("viewFocused", java.lang.Integer.valueOf(i72), null);
                            return;
                        }
                        io.flutter.plugin.editing.C1575k c1575k = c1592o2.f6623r;
                        if (c1575k != null) {
                            c1575k.m3497b(i72);
                            return;
                        }
                        return;
                    default:
                        io.flutter.plugin.platform.C1592o c1592o3 = c1592o;
                        if (!z4) {
                            c1592o3.getClass();
                            return;
                        }
                        p008B1.C0026d c0026d = c1592o3.f6624s;
                        p043K2.C0331g c0331g3 = c0331g;
                        p035I.C0291m c0291m2 = (p035I.C0291m) c0026d.f99m;
                        if (c0291m2 == null) {
                            return;
                        }
                        c0291m2.m694j("viewFocused", java.lang.Integer.valueOf(c0331g3.f1007a), null);
                        return;
                }
            }
        });
        c1592o.f6620o.addView(c1585h);
        sparseArray.append(i6, c1585h);
        return j4;
    }

    public C1590m(int i4) {
        this.f6590l = i4;
        switch (i4) {
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return;
            default:
                this.f6591m = new java.util.HashMap();
                return;
        }
    }
}
