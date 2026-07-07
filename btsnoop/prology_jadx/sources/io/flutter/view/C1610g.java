package io.flutter.view;

/* renamed from: io.flutter.view.g */
/* loaded from: classes.dex */
public final class C1610g extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: z */
    public static final /* synthetic */ int f6751z = 0;

    /* renamed from: a */
    public final android.view.View f6752a;

    /* renamed from: b */
    public final android.support.v4.media.session.C1061t f6753b;

    /* renamed from: c */
    public final android.view.accessibility.AccessibilityManager f6754c;

    /* renamed from: d */
    public final io.flutter.view.AccessibilityViewEmbedder f6755d;

    /* renamed from: e */
    public final io.flutter.plugin.platform.InterfaceC1586i f6756e;

    /* renamed from: f */
    public final android.content.ContentResolver f6757f;

    /* renamed from: g */
    public final java.util.HashMap f6758g;

    /* renamed from: h */
    public final java.util.HashMap f6759h;

    /* renamed from: i */
    public io.flutter.view.C1609f f6760i;

    /* renamed from: j */
    public java.lang.Integer f6761j;

    /* renamed from: k */
    public java.lang.Integer f6762k;

    /* renamed from: l */
    public int f6763l;

    /* renamed from: m */
    public java.lang.String f6764m;

    /* renamed from: n */
    public io.flutter.view.C1609f f6765n;

    /* renamed from: o */
    public io.flutter.view.C1609f f6766o;

    /* renamed from: p */
    public io.flutter.view.C1609f f6767p;

    /* renamed from: q */
    public final java.util.ArrayList f6768q;

    /* renamed from: r */
    public int f6769r;

    /* renamed from: s */
    public p009B2.C0061r f6770s;

    /* renamed from: t */
    public boolean f6771t;

    /* renamed from: u */
    public boolean f6772u;

    /* renamed from: v */
    public final io.flutter.view.C1604a f6773v;

    /* renamed from: w */
    public final io.flutter.view.AccessibilityManagerAccessibilityStateChangeListenerC1605b f6774w;

    /* renamed from: x */
    public final io.flutter.view.AccessibilityManagerTouchExplorationStateChangeListenerC1606c f6775x;

    /* renamed from: y */
    public final p009B2.C0062s f6776y;

    public C1610g(android.view.View view, android.support.v4.media.session.C1061t c1061t, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.flutter.plugin.platform.InterfaceC1586i interfaceC1586i) {
        int i4;
        io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder = new io.flutter.view.AccessibilityViewEmbedder(view, 65536);
        this.f6758g = new java.util.HashMap();
        this.f6759h = new java.util.HashMap();
        this.f6763l = 0;
        this.f6768q = new java.util.ArrayList();
        this.f6769r = 0;
        this.f6771t = false;
        this.f6772u = false;
        this.f6773v = new io.flutter.view.C1604a(this);
        io.flutter.view.AccessibilityManagerAccessibilityStateChangeListenerC1605b accessibilityManagerAccessibilityStateChangeListenerC1605b = new io.flutter.view.AccessibilityManagerAccessibilityStateChangeListenerC1605b(this);
        this.f6774w = accessibilityManagerAccessibilityStateChangeListenerC1605b;
        p009B2.C0062s c0062s = new p009B2.C0062s(this, new android.os.Handler(), 2);
        this.f6776y = c0062s;
        this.f6752a = view;
        this.f6753b = c1061t;
        this.f6754c = accessibilityManager;
        this.f6757f = contentResolver;
        this.f6755d = accessibilityViewEmbedder;
        this.f6756e = interfaceC1586i;
        accessibilityManagerAccessibilityStateChangeListenerC1605b.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC1605b);
        io.flutter.view.AccessibilityManagerTouchExplorationStateChangeListenerC1606c accessibilityManagerTouchExplorationStateChangeListenerC1606c = new io.flutter.view.AccessibilityManagerTouchExplorationStateChangeListenerC1606c(this, accessibilityManager);
        this.f6775x = accessibilityManagerTouchExplorationStateChangeListenerC1606c;
        accessibilityManagerTouchExplorationStateChangeListenerC1606c.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1606c);
        this.f6763l |= 128;
        c0062s.onChange(false, null);
        contentResolver.registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, c0062s);
        if (android.os.Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i4 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i4 == Integer.MAX_VALUE || i4 < 300) {
                this.f6763l &= -9;
            } else {
                this.f6763l |= 8;
            }
            ((io.flutter.embedding.engine.FlutterJNI) c1061t.f3862n).setAccessibilityFeatures(this.f6763l);
        }
        interfaceC1586i.mo1725m(this);
    }

    /* renamed from: d */
    public static java.lang.String m3558d(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == -1) {
            return null;
        }
        return strArr[i4];
    }

    /* renamed from: a */
    public final boolean m3559a(android.view.SurfaceView surfaceView, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        java.lang.Integer recordFlutterId;
        io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6755d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(surfaceView, view, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(surfaceView, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f6762k = recordFlutterId;
            this.f6765n = null;
            return true;
        }
        if (eventType == 128) {
            this.f6767p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f6761j = recordFlutterId;
            this.f6760i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f6762k = null;
        this.f6761j = null;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, io.flutter.view.e] */
    /* renamed from: b */
    public final io.flutter.view.C1608e m3560b(int i4) {
        java.util.HashMap hashMap = this.f6759h;
        io.flutter.view.C1608e c1608e = (io.flutter.view.C1608e) hashMap.get(java.lang.Integer.valueOf(i4));
        if (c1608e != null) {
            return c1608e;
        }
        ?? obj = new java.lang.Object();
        obj.f6694c = -1;
        obj.f6693b = i4;
        obj.f6692a = 267386881 + i4;
        hashMap.put(java.lang.Integer.valueOf(i4), obj);
        return obj;
    }

    /* renamed from: c */
    public final io.flutter.view.C1609f m3561c(int i4) {
        java.util.HashMap hashMap = this.f6758g;
        io.flutter.view.C1609f c1609f = (io.flutter.view.C1609f) hashMap.get(java.lang.Integer.valueOf(i4));
        if (c1609f != null) {
            return c1609f;
        }
        io.flutter.view.C1609f c1609f2 = new io.flutter.view.C1609f(this);
        c1609f2.f6725b = i4;
        hashMap.put(java.lang.Integer.valueOf(i4), c1609f2);
        return c1609f2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        int i5;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i6;
        m3567j(true);
        io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder = this.f6755d;
        if (i4 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i4);
        }
        java.util.HashMap hashMap = this.f6758g;
        android.view.View view = this.f6752a;
        if (i4 == -1) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        io.flutter.view.C1609f c1609f = (io.flutter.view.C1609f) hashMap.get(java.lang.Integer.valueOf(i4));
        if (c1609f == null) {
            return null;
        }
        int m3528c = io.flutter.view.C1609f.m3528c(c1609f);
        io.flutter.plugin.platform.InterfaceC1586i interfaceC1586i = this.f6756e;
        if (m3528c != -1 && interfaceC1586i.mo1726r(io.flutter.view.C1609f.m3528c(c1609f))) {
            android.view.SurfaceView mo1708K = interfaceC1586i.mo1708K(io.flutter.view.C1609f.m3528c(c1609f));
            if (mo1708K == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(mo1708K, io.flutter.view.C1609f.m3526a(c1609f), io.flutter.view.C1609f.m3529d(c1609f));
        }
        android.view.accessibility.AccessibilityNodeInfo obtain2 = android.view.accessibility.AccessibilityNodeInfo.obtain(view, i4);
        int i7 = android.os.Build.VERSION.SDK_INT;
        obtain2.setImportantForAccessibility((c1609f.m3553D(12) || (io.flutter.view.C1609f.m3545t(c1609f) == null && c1609f.f6728d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        if (io.flutter.view.C1609f.m3530e(c1609f) != null) {
            obtain2.setViewIdResourceName(io.flutter.view.C1609f.m3530e(c1609f));
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i4);
        obtain2.setFocusable(io.flutter.view.C1609f.m3531f(c1609f));
        io.flutter.view.C1609f c1609f2 = this.f6765n;
        if (c1609f2 != null) {
            obtain2.setFocused(io.flutter.view.C1609f.m3526a(c1609f2) == i4);
        }
        io.flutter.view.C1609f c1609f3 = this.f6760i;
        if (c1609f3 != null) {
            obtain2.setAccessibilityFocused(io.flutter.view.C1609f.m3526a(c1609f3) == i4);
        }
        if (io.flutter.view.C1609f.m3532g(c1609f, 5)) {
            obtain2.setPassword(io.flutter.view.C1609f.m3532g(c1609f, 11));
            if (!io.flutter.view.C1609f.m3532g(c1609f, 21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!io.flutter.view.C1609f.m3532g(c1609f, 21));
            if (io.flutter.view.C1609f.m3533h(c1609f) != -1 && io.flutter.view.C1609f.m3534i(c1609f) != -1) {
                obtain2.setTextSelection(io.flutter.view.C1609f.m3533h(c1609f), io.flutter.view.C1609f.m3534i(c1609f));
            }
            io.flutter.view.C1609f c1609f4 = this.f6760i;
            if (c1609f4 != null && io.flutter.view.C1609f.m3526a(c1609f4) == i4) {
                obtain2.setLiveRegion(1);
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6686v)) {
                obtain2.addAction(256);
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6687w)) {
                obtain2.addAction(512);
                i6 = 1;
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6671F)) {
                obtain2.addAction(256);
                i6 |= 2;
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6672G)) {
                obtain2.addAction(512);
                i6 |= 2;
            }
            obtain2.setMovementGranularities(i6);
            if (io.flutter.view.C1609f.m3536k(c1609f) >= 0) {
                obtain2.setMaxTextLength(io.flutter.view.C1609f.m3536k(c1609f) + ((io.flutter.view.C1609f.m3537l(c1609f) == null ? 0 : io.flutter.view.C1609f.m3537l(c1609f).length()) - io.flutter.view.C1609f.m3538m(c1609f)));
            }
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6688x)) {
            obtain2.addAction(131072);
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6689y)) {
            obtain2.addAction(16384);
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6690z)) {
            obtain2.addAction(65536);
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6666A)) {
            obtain2.addAction(32768);
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6673H)) {
            obtain2.addAction(2097152);
        }
        if (io.flutter.view.C1609f.m3532g(c1609f, 4)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (io.flutter.view.C1609f.m3532g(c1609f, 15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6670E)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        if (io.flutter.view.C1609f.m3539n(c1609f) != null) {
            obtain2.setParent(view, io.flutter.view.C1609f.m3526a(io.flutter.view.C1609f.m3539n(c1609f)));
        } else {
            obtain2.setParent(view);
        }
        if (io.flutter.view.C1609f.m3540o(c1609f) != -1) {
            obtain2.setTraversalAfter(view, io.flutter.view.C1609f.m3540o(c1609f));
        }
        android.graphics.Rect m3529d = io.flutter.view.C1609f.m3529d(c1609f);
        if (io.flutter.view.C1609f.m3539n(c1609f) != null) {
            android.graphics.Rect m3529d2 = io.flutter.view.C1609f.m3529d(io.flutter.view.C1609f.m3539n(c1609f));
            android.graphics.Rect rect = new android.graphics.Rect(m3529d);
            rect.offset(-m3529d2.left, -m3529d2.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(m3529d);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(m3529d);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!io.flutter.view.C1609f.m3532g(c1609f, 7) || io.flutter.view.C1609f.m3532g(c1609f, 8));
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6677m)) {
            if (io.flutter.view.C1609f.m3541p(c1609f) != null) {
                str3 = io.flutter.view.C1609f.m3541p(c1609f).f6696e;
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, str3));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (io.flutter.view.C1609f.m3532g(c1609f, 24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6678n)) {
            if (io.flutter.view.C1609f.m3542q(c1609f) != null) {
                str2 = io.flutter.view.C1609f.m3542q(c1609f).f6696e;
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, str2));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        io.flutter.view.EnumC1607d enumC1607d = io.flutter.view.EnumC1607d.f6679o;
        boolean m3535j = io.flutter.view.C1609f.m3535j(c1609f, enumC1607d);
        io.flutter.view.EnumC1607d enumC1607d2 = io.flutter.view.EnumC1607d.f6682r;
        io.flutter.view.EnumC1607d enumC1607d3 = io.flutter.view.EnumC1607d.f6681q;
        io.flutter.view.EnumC1607d enumC1607d4 = io.flutter.view.EnumC1607d.f6680p;
        if (m3535j || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d3) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d4) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d2)) {
            obtain2.setScrollable(true);
            if (io.flutter.view.C1609f.m3532g(c1609f, 19)) {
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d4)) {
                    if (m3568k(c1609f)) {
                        obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(0, io.flutter.view.C1609f.m3527b(c1609f), false));
                    } else {
                        obtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (m3568k(c1609f)) {
                    obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(io.flutter.view.C1609f.m3527b(c1609f), 0, false));
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d3)) {
                obtain2.addAction(4096);
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d4) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d2)) {
                obtain2.addAction(8192);
            }
        }
        io.flutter.view.EnumC1607d enumC1607d5 = io.flutter.view.EnumC1607d.f6683s;
        boolean m3535j2 = io.flutter.view.C1609f.m3535j(c1609f, enumC1607d5);
        io.flutter.view.EnumC1607d enumC1607d6 = io.flutter.view.EnumC1607d.f6684t;
        if (m3535j2 || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d6)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d5)) {
                obtain2.addAction(4096);
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d6)) {
                obtain2.addAction(8192);
            }
        }
        if (io.flutter.view.C1609f.m3532g(c1609f, 16)) {
            obtain2.setLiveRegion(1);
        }
        if (io.flutter.view.C1609f.m3532g(c1609f, 5)) {
            obtain2.setText(io.flutter.view.C1609f.m3543r(c1609f));
            if (i7 >= 28) {
                obtain2.setHintText(io.flutter.view.C1609f.m3544s(c1609f));
            }
        } else if (!io.flutter.view.C1609f.m3532g(c1609f, 12)) {
            java.lang.CharSequence m3545t = io.flutter.view.C1609f.m3545t(c1609f);
            if (i7 < 28 && io.flutter.view.C1609f.m3546u(c1609f) != null) {
                m3545t = ((java.lang.Object) (m3545t != null ? m3545t : "")) + "\n" + io.flutter.view.C1609f.m3546u(c1609f);
            }
            if (m3545t != null) {
                obtain2.setContentDescription(m3545t);
            }
        }
        if (i7 >= 28 && io.flutter.view.C1609f.m3546u(c1609f) != null) {
            obtain2.setTooltipText(io.flutter.view.C1609f.m3546u(c1609f));
            if (io.flutter.view.C1609f.m3545t(c1609f) == null) {
                obtain2.setContentDescription(io.flutter.view.C1609f.m3546u(c1609f));
            }
        }
        boolean m3532g = io.flutter.view.C1609f.m3532g(c1609f, 1);
        boolean m3532g2 = io.flutter.view.C1609f.m3532g(c1609f, 17);
        obtain2.setCheckable(m3532g || m3532g2);
        if (m3532g) {
            obtain2.setChecked(io.flutter.view.C1609f.m3532g(c1609f, 2));
            if (io.flutter.view.C1609f.m3532g(c1609f, 9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (m3532g2) {
            obtain2.setChecked(io.flutter.view.C1609f.m3532g(c1609f, 18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(io.flutter.view.C1609f.m3532g(c1609f, 3));
        if (i7 >= 36 && io.flutter.view.C1609f.m3532g(c1609f, 27)) {
            obtain2.setExpandedState(io.flutter.view.C1609f.m3532g(c1609f, 28) ? 3 : 1);
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6674I)) {
                obtain2.addAction(262144);
            }
            if (io.flutter.view.C1609f.m3535j(c1609f, io.flutter.view.EnumC1607d.f6675J)) {
                obtain2.addAction(524288);
            }
        }
        if (i7 >= 28) {
            obtain2.setHeading(io.flutter.view.C1609f.m3547v(c1609f) > 0);
        }
        io.flutter.view.C1609f c1609f5 = this.f6760i;
        if (c1609f5 == null || io.flutter.view.C1609f.m3526a(c1609f5) != i4) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        if (io.flutter.view.C1609f.m3548w(c1609f) != null) {
            java.util.Iterator it = io.flutter.view.C1609f.m3548w(c1609f).iterator();
            while (it.hasNext()) {
                io.flutter.view.C1608e c1608e = (io.flutter.view.C1608e) it.next();
                i5 = c1608e.f6692a;
                str = c1608e.f6695d;
                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i5, str));
            }
        }
        java.util.Iterator it2 = io.flutter.view.C1609f.m3549x(c1609f).iterator();
        while (it2.hasNext()) {
            io.flutter.view.C1609f c1609f6 = (io.flutter.view.C1609f) it2.next();
            if (!io.flutter.view.C1609f.m3532g(c1609f6, 14)) {
                if (io.flutter.view.C1609f.m3528c(c1609f6) != -1) {
                    android.view.SurfaceView mo1708K2 = interfaceC1586i.mo1708K(io.flutter.view.C1609f.m3528c(c1609f6));
                    if (!interfaceC1586i.mo1726r(io.flutter.view.C1609f.m3528c(c1609f6))) {
                        mo1708K2.setImportantForAccessibility(0);
                        obtain2.addChild(mo1708K2);
                    }
                }
                obtain2.addChild(view, io.flutter.view.C1609f.m3526a(c1609f6));
            }
        }
        return obtain2;
    }

    /* renamed from: e */
    public final android.view.accessibility.AccessibilityEvent m3562e(int i4, int i5) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i5);
        android.view.View view = this.f6752a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i4);
        return obtain;
    }

    /* renamed from: f */
    public final boolean m3563f(android.view.MotionEvent motionEvent, boolean z4) {
        io.flutter.view.C1609f m3554E;
        if (!this.f6754c.isTouchExplorationEnabled()) {
            return false;
        }
        java.util.HashMap hashMap = this.f6758g;
        if (hashMap.isEmpty()) {
            return false;
        }
        io.flutter.view.C1609f m3554E2 = ((io.flutter.view.C1609f) hashMap.get(0)).m3554E(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (m3554E2 != null && m3554E2.f6733i != -1) {
            if (z4) {
                return false;
            }
            return this.f6755d.onAccessibilityHoverEvent(m3554E2.f6725b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (!hashMap.isEmpty() && (m3554E = ((io.flutter.view.C1609f) hashMap.get(0)).m3554E(new float[]{x3, y4, 0.0f, 1.0f}, z4)) != this.f6767p) {
                if (m3554E != null) {
                    m3565h(m3554E.f6725b, 128);
                }
                io.flutter.view.C1609f c1609f = this.f6767p;
                if (c1609f != null) {
                    m3565h(c1609f.f6725b, 256);
                }
                this.f6767p = m3554E;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            io.flutter.view.C1609f c1609f2 = this.f6767p;
            if (c1609f2 != null) {
                m3565h(c1609f2.f6725b, 256);
                this.f6767p = null;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i4) {
        if (i4 == 1) {
            io.flutter.view.C1609f c1609f = this.f6765n;
            if (c1609f != null) {
                return createAccessibilityNodeInfo(c1609f.f6725b);
            }
            java.lang.Integer num = this.f6762k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i4 != 2) {
            return null;
        }
        io.flutter.view.C1609f c1609f2 = this.f6760i;
        if (c1609f2 != null) {
            return createAccessibilityNodeInfo(c1609f2.f6725b);
        }
        java.lang.Integer num2 = this.f6761j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m3564g(io.flutter.view.C1609f c1609f, int i4, android.os.Bundle bundle, boolean z4) {
        int i5;
        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i7 = c1609f.f6731g;
        int i8 = c1609f.f6732h;
        if (i8 >= 0 && i7 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z4) {
                                c1609f.f6732h = c1609f.f6742r.length();
                            } else {
                                c1609f.f6732h = 0;
                            }
                        }
                    } else if (z4 && i8 < c1609f.f6742r.length()) {
                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(c1609f.f6742r.substring(c1609f.f6732h));
                        if (matcher.find()) {
                            c1609f.f6732h += matcher.start(1);
                        } else {
                            c1609f.f6732h = c1609f.f6742r.length();
                        }
                    } else if (!z4 && c1609f.f6732h > 0) {
                        java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(c1609f.f6742r.substring(0, c1609f.f6732h));
                        if (matcher2.find()) {
                            c1609f.f6732h = matcher2.start(1);
                        } else {
                            c1609f.f6732h = 0;
                        }
                    }
                } else if (z4 && i8 < c1609f.f6742r.length()) {
                    java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(c1609f.f6742r.substring(c1609f.f6732h));
                    matcher3.find();
                    if (matcher3.find()) {
                        c1609f.f6732h += matcher3.start(1);
                    } else {
                        c1609f.f6732h = c1609f.f6742r.length();
                    }
                } else if (!z4 && c1609f.f6732h > 0) {
                    java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(c1609f.f6742r.substring(0, c1609f.f6732h));
                    if (matcher4.find()) {
                        c1609f.f6732h = matcher4.start(1);
                    }
                }
            } else if (z4 && i8 < c1609f.f6742r.length()) {
                c1609f.f6732h++;
            } else if (!z4 && (i5 = c1609f.f6732h) > 0) {
                c1609f.f6732h = i5 - 1;
            }
            if (!z5) {
                c1609f.f6731g = c1609f.f6732h;
            }
        }
        if (i7 != c1609f.f6731g || i8 != c1609f.f6732h) {
            java.lang.String str = c1609f.f6742r;
            if (str == null) {
                str = "";
            }
            android.view.accessibility.AccessibilityEvent m3562e = m3562e(c1609f.f6725b, 8192);
            m3562e.getText().add(str);
            m3562e.setFromIndex(c1609f.f6731g);
            m3562e.setToIndex(c1609f.f6732h);
            m3562e.setItemCount(str.length());
            m3566i(m3562e);
        }
        android.support.v4.media.session.C1061t c1061t = this.f6753b;
        if (i6 == 1) {
            if (z4) {
                io.flutter.view.EnumC1607d enumC1607d = io.flutter.view.EnumC1607d.f6686v;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d)) {
                    c1061t.m2216Z(i4, enumC1607d, java.lang.Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                io.flutter.view.EnumC1607d enumC1607d2 = io.flutter.view.EnumC1607d.f6687w;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d2)) {
                    c1061t.m2216Z(i4, enumC1607d2, java.lang.Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z4) {
                io.flutter.view.EnumC1607d enumC1607d3 = io.flutter.view.EnumC1607d.f6671F;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d3)) {
                    c1061t.m2216Z(i4, enumC1607d3, java.lang.Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                io.flutter.view.EnumC1607d enumC1607d4 = io.flutter.view.EnumC1607d.f6672G;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d4)) {
                    c1061t.m2216Z(i4, enumC1607d4, java.lang.Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m3565h(int i4, int i5) {
        if (this.f6754c.isEnabled()) {
            m3566i(m3562e(i4, i5));
        }
    }

    /* renamed from: i */
    public final void m3566i(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f6754c.isEnabled()) {
            android.view.View view = this.f6752a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* renamed from: j */
    public final void m3567j(boolean z4) {
        if (this.f6771t == z4) {
            return;
        }
        this.f6771t = z4;
        if (z4) {
            this.f6763l |= 1;
        } else {
            this.f6763l &= -2;
        }
        ((io.flutter.embedding.engine.FlutterJNI) this.f6753b.f3862n).setAccessibilityFeatures(this.f6763l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L24;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3568k(io.flutter.view.C1609f r3) {
        /*
            r2 = this;
            int r0 = r3.f6734j
            if (r0 <= 0) goto L31
            io.flutter.view.f r0 = r2.f6760i
            r1 = 0
            if (r0 == 0) goto L17
            io.flutter.view.f r0 = r0.f6714R
        Lb:
            if (r0 == 0) goto L13
            if (r0 != r3) goto L10
            goto L14
        L10:
            io.flutter.view.f r0 = r0.f6714R
            goto Lb
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L2f
        L17:
            io.flutter.view.f r3 = r2.f6760i
            if (r3 == 0) goto L2f
            io.flutter.view.f r3 = r3.f6714R
        L1d:
            if (r3 == 0) goto L2c
            r0 = 19
            boolean r0 = r3.m3553D(r0)
            if (r0 == 0) goto L29
            r1 = r3
            goto L2c
        L29:
            io.flutter.view.f r3 = r3.f6714R
            goto L1d
        L2c:
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.C1610g.m3568k(io.flutter.view.f):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, android.os.Bundle bundle) {
        if (i4 >= 65536) {
            boolean performAction = this.f6755d.performAction(i4, i5, bundle);
            if (performAction && i5 == 128) {
                this.f6761j = null;
            }
            return performAction;
        }
        java.util.HashMap hashMap = this.f6758g;
        io.flutter.view.C1609f c1609f = (io.flutter.view.C1609f) hashMap.get(java.lang.Integer.valueOf(i4));
        if (c1609f == null) {
            return false;
        }
        io.flutter.view.EnumC1607d enumC1607d = io.flutter.view.EnumC1607d.f6683s;
        io.flutter.view.EnumC1607d enumC1607d2 = io.flutter.view.EnumC1607d.f6684t;
        android.support.v4.media.session.C1061t c1061t = this.f6753b;
        switch (i5) {
            case 16:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6677m);
                return true;
            case 32:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6678n);
                return true;
            case 64:
                if (this.f6760i == null) {
                    this.f6752a.invalidate();
                }
                this.f6760i = c1609f;
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6667B);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", java.lang.Integer.valueOf(c1609f.f6725b));
                ((p035I.C0291m) c1061t.f3861m).m700q(hashMap2, null);
                m3565h(i4, 32768);
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d) || io.flutter.view.C1609f.m3535j(c1609f, enumC1607d2)) {
                    m3565h(i4, 4);
                }
                return true;
            case 128:
                io.flutter.view.C1609f c1609f2 = this.f6760i;
                if (c1609f2 != null && c1609f2.f6725b == i4) {
                    this.f6760i = null;
                }
                java.lang.Integer num = this.f6761j;
                if (num != null && num.intValue() == i4) {
                    this.f6761j = null;
                }
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6668C);
                m3565h(i4, 65536);
                return true;
            case 256:
                return m3564g(c1609f, i4, bundle, true);
            case 512:
                return m3564g(c1609f, i4, bundle, false);
            case 4096:
                io.flutter.view.EnumC1607d enumC1607d3 = io.flutter.view.EnumC1607d.f6681q;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d3)) {
                    c1061t.m2215Y(i4, enumC1607d3);
                } else {
                    io.flutter.view.EnumC1607d enumC1607d4 = io.flutter.view.EnumC1607d.f6679o;
                    if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d4)) {
                        c1061t.m2215Y(i4, enumC1607d4);
                    } else {
                        if (!io.flutter.view.C1609f.m3535j(c1609f, enumC1607d)) {
                            return false;
                        }
                        c1609f.f6742r = c1609f.f6744t;
                        c1609f.f6743s = c1609f.f6745u;
                        m3565h(i4, 4);
                        c1061t.m2215Y(i4, enumC1607d);
                    }
                }
                return true;
            case 8192:
                io.flutter.view.EnumC1607d enumC1607d5 = io.flutter.view.EnumC1607d.f6682r;
                if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d5)) {
                    c1061t.m2215Y(i4, enumC1607d5);
                } else {
                    io.flutter.view.EnumC1607d enumC1607d6 = io.flutter.view.EnumC1607d.f6680p;
                    if (io.flutter.view.C1609f.m3535j(c1609f, enumC1607d6)) {
                        c1061t.m2215Y(i4, enumC1607d6);
                    } else {
                        if (!io.flutter.view.C1609f.m3535j(c1609f, enumC1607d2)) {
                            return false;
                        }
                        c1609f.f6742r = c1609f.f6746v;
                        c1609f.f6743s = c1609f.f6747w;
                        m3565h(i4, 4);
                        c1061t.m2215Y(i4, enumC1607d2);
                    }
                }
                return true;
            case 16384:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6689y);
                return true;
            case 32768:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6666A);
                return true;
            case 65536:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6690z);
                return true;
            case 131072:
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", java.lang.Integer.valueOf(c1609f.f6732h));
                    hashMap3.put("extent", java.lang.Integer.valueOf(c1609f.f6732h));
                }
                c1061t.m2216Z(i4, io.flutter.view.EnumC1607d.f6688x, hashMap3);
                io.flutter.view.C1609f c1609f3 = (io.flutter.view.C1609f) hashMap.get(java.lang.Integer.valueOf(i4));
                c1609f3.f6731g = ((java.lang.Integer) hashMap3.get("base")).intValue();
                c1609f3.f6732h = ((java.lang.Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6674I);
                return true;
            case 524288:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6675J);
                return true;
            case 1048576:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6670E);
                return true;
            case 2097152:
                java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                c1061t.m2216Z(i4, io.flutter.view.EnumC1607d.f6673H, string);
                c1609f.f6742r = string;
                c1609f.f6743s = null;
                return true;
            case android.R.id.accessibilityActionShowOnScreen:
                c1061t.m2215Y(i4, io.flutter.view.EnumC1607d.f6685u);
                return true;
            default:
                io.flutter.view.C1608e c1608e = (io.flutter.view.C1608e) this.f6759h.get(java.lang.Integer.valueOf(i5 - 267386881));
                if (c1608e == null) {
                    return false;
                }
                c1061t.m2216Z(i4, io.flutter.view.EnumC1607d.f6669D, java.lang.Integer.valueOf(c1608e.f6693b));
                return true;
        }
    }
}
