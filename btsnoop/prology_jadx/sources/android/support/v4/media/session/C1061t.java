package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.t */
/* loaded from: classes.dex */
public final class C1061t implements p047L2.InterfaceC0379i, p047L2.InterfaceC0374d, p071R2.InterfaceC0601g, p200u3.InterfaceC2250d, p215y0.InterfaceC2405q, p083V0.InterfaceC0766d, p123e1.InterfaceC1320B, p146j0.InterfaceC1706j, p047L2.InterfaceC0385o {

    /* renamed from: p */
    public static int f3858p;

    /* renamed from: q */
    public static android.support.v4.media.session.C1061t f3859q;

    /* renamed from: l */
    public final /* synthetic */ int f3860l;

    /* renamed from: m */
    public java.lang.Object f3861m;

    /* renamed from: n */
    public java.lang.Object f3862n;

    /* renamed from: o */
    public java.lang.Object f3863o;

    public /* synthetic */ C1061t(int i4, boolean z4) {
        this.f3860l = i4;
    }

    /* renamed from: C0 */
    public static void m2197C0(p047L2.InterfaceC0376f interfaceC0376f, final android.support.v4.media.session.C1061t c1061t) {
        p075S2.C0650c c0650c = p075S2.C0650c.f2131d;
        p025F1.C0215g c0215g = null;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", c0650c, c0215g);
        if (c1061t != null) {
            final int i4 = 0;
            c0291m.m701r(new p047L2.InterfaceC0372b(c1061t) { // from class: S2.d

                /* renamed from: m */
                public final /* synthetic */ android.support.v4.media.session.C1061t f2133m;

                {
                    this.f2133m = c1061t;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.lang.Boolean bool;
                    switch (i4) {
                        case 0:
                            android.support.v4.media.session.C1061t c1061t2 = this.f2133m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c1061t2.m2210T((java.lang.String) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1794c0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            android.support.v4.media.session.C1061t c1061t3 = this.f2133m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList3.get(0);
                            java.util.Map map = (java.util.Map) arrayList3.get(1);
                            try {
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1794c0(th2);
                            }
                            if (((p009B2.AbstractActivityC0047d) c1061t3.f3863o) == null) {
                                throw new p075S2.C0649b();
                            }
                            try {
                                ((p009B2.AbstractActivityC0047d) c1061t3.f3863o).startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(str)).putExtra("com.android.browser.headers", android.support.v4.media.session.C1061t.m2200c0(map)));
                                bool = java.lang.Boolean.TRUE;
                            } catch (android.content.ActivityNotFoundException unused) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            android.support.v4.media.session.C1061t c1061t4 = this.f2133m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c1061t4.m2241t0((java.lang.String) arrayList5.get(0), (java.lang.Boolean) arrayList5.get(1), (p075S2.C0652e) arrayList5.get(2), (p075S2.C0648a) arrayList5.get(3)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1794c0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            android.support.v4.media.session.C1061t c1061t5 = this.f2133m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add(0, c1061t5.m2207D0());
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1794c0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            android.support.v4.media.session.C1061t c1061t6 = this.f2133m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            try {
                                c1061t6.getClass();
                                ((android.content.Context) c1061t6.f3861m).sendBroadcast(new android.content.Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList7 = p101a.AbstractC0936a.m1794c0(th5);
                            }
                            c0026d.mo106e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", c0650c, c0215g);
        if (c1061t != null) {
            final int i5 = 1;
            c0291m2.m701r(new p047L2.InterfaceC0372b(c1061t) { // from class: S2.d

                /* renamed from: m */
                public final /* synthetic */ android.support.v4.media.session.C1061t f2133m;

                {
                    this.f2133m = c1061t;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.lang.Boolean bool;
                    switch (i5) {
                        case 0:
                            android.support.v4.media.session.C1061t c1061t2 = this.f2133m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c1061t2.m2210T((java.lang.String) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1794c0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            android.support.v4.media.session.C1061t c1061t3 = this.f2133m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList3.get(0);
                            java.util.Map map = (java.util.Map) arrayList3.get(1);
                            try {
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1794c0(th2);
                            }
                            if (((p009B2.AbstractActivityC0047d) c1061t3.f3863o) == null) {
                                throw new p075S2.C0649b();
                            }
                            try {
                                ((p009B2.AbstractActivityC0047d) c1061t3.f3863o).startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(str)).putExtra("com.android.browser.headers", android.support.v4.media.session.C1061t.m2200c0(map)));
                                bool = java.lang.Boolean.TRUE;
                            } catch (android.content.ActivityNotFoundException unused) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            android.support.v4.media.session.C1061t c1061t4 = this.f2133m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c1061t4.m2241t0((java.lang.String) arrayList5.get(0), (java.lang.Boolean) arrayList5.get(1), (p075S2.C0652e) arrayList5.get(2), (p075S2.C0648a) arrayList5.get(3)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1794c0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            android.support.v4.media.session.C1061t c1061t5 = this.f2133m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add(0, c1061t5.m2207D0());
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1794c0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            android.support.v4.media.session.C1061t c1061t6 = this.f2133m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            try {
                                c1061t6.getClass();
                                ((android.content.Context) c1061t6.f3861m).sendBroadcast(new android.content.Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList7 = p101a.AbstractC0936a.m1794c0(th5);
                            }
                            c0026d.mo106e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0291m2.m701r(null);
        }
        p035I.C0291m c0291m3 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", c0650c, c0215g);
        if (c1061t != null) {
            final int i6 = 2;
            c0291m3.m701r(new p047L2.InterfaceC0372b(c1061t) { // from class: S2.d

                /* renamed from: m */
                public final /* synthetic */ android.support.v4.media.session.C1061t f2133m;

                {
                    this.f2133m = c1061t;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.lang.Boolean bool;
                    switch (i6) {
                        case 0:
                            android.support.v4.media.session.C1061t c1061t2 = this.f2133m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c1061t2.m2210T((java.lang.String) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1794c0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            android.support.v4.media.session.C1061t c1061t3 = this.f2133m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList3.get(0);
                            java.util.Map map = (java.util.Map) arrayList3.get(1);
                            try {
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1794c0(th2);
                            }
                            if (((p009B2.AbstractActivityC0047d) c1061t3.f3863o) == null) {
                                throw new p075S2.C0649b();
                            }
                            try {
                                ((p009B2.AbstractActivityC0047d) c1061t3.f3863o).startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(str)).putExtra("com.android.browser.headers", android.support.v4.media.session.C1061t.m2200c0(map)));
                                bool = java.lang.Boolean.TRUE;
                            } catch (android.content.ActivityNotFoundException unused) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            android.support.v4.media.session.C1061t c1061t4 = this.f2133m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c1061t4.m2241t0((java.lang.String) arrayList5.get(0), (java.lang.Boolean) arrayList5.get(1), (p075S2.C0652e) arrayList5.get(2), (p075S2.C0648a) arrayList5.get(3)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1794c0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            android.support.v4.media.session.C1061t c1061t5 = this.f2133m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add(0, c1061t5.m2207D0());
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1794c0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            android.support.v4.media.session.C1061t c1061t6 = this.f2133m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            try {
                                c1061t6.getClass();
                                ((android.content.Context) c1061t6.f3861m).sendBroadcast(new android.content.Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList7 = p101a.AbstractC0936a.m1794c0(th5);
                            }
                            c0026d.mo106e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0291m3.m701r(null);
        }
        p035I.C0291m c0291m4 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", c0650c, c0215g);
        if (c1061t != null) {
            final int i7 = 3;
            c0291m4.m701r(new p047L2.InterfaceC0372b(c1061t) { // from class: S2.d

                /* renamed from: m */
                public final /* synthetic */ android.support.v4.media.session.C1061t f2133m;

                {
                    this.f2133m = c1061t;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.lang.Boolean bool;
                    switch (i7) {
                        case 0:
                            android.support.v4.media.session.C1061t c1061t2 = this.f2133m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c1061t2.m2210T((java.lang.String) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1794c0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            android.support.v4.media.session.C1061t c1061t3 = this.f2133m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList3.get(0);
                            java.util.Map map = (java.util.Map) arrayList3.get(1);
                            try {
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1794c0(th2);
                            }
                            if (((p009B2.AbstractActivityC0047d) c1061t3.f3863o) == null) {
                                throw new p075S2.C0649b();
                            }
                            try {
                                ((p009B2.AbstractActivityC0047d) c1061t3.f3863o).startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(str)).putExtra("com.android.browser.headers", android.support.v4.media.session.C1061t.m2200c0(map)));
                                bool = java.lang.Boolean.TRUE;
                            } catch (android.content.ActivityNotFoundException unused) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            android.support.v4.media.session.C1061t c1061t4 = this.f2133m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c1061t4.m2241t0((java.lang.String) arrayList5.get(0), (java.lang.Boolean) arrayList5.get(1), (p075S2.C0652e) arrayList5.get(2), (p075S2.C0648a) arrayList5.get(3)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1794c0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            android.support.v4.media.session.C1061t c1061t5 = this.f2133m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add(0, c1061t5.m2207D0());
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1794c0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            android.support.v4.media.session.C1061t c1061t6 = this.f2133m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            try {
                                c1061t6.getClass();
                                ((android.content.Context) c1061t6.f3861m).sendBroadcast(new android.content.Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList7 = p101a.AbstractC0936a.m1794c0(th5);
                            }
                            c0026d.mo106e(arrayList7);
                            return;
                    }
                }
            });
        } else {
            c0291m4.m701r(null);
        }
        p035I.C0291m c0291m5 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", c0650c, c0215g);
        if (c1061t == null) {
            c0291m5.m701r(null);
        } else {
            final int i8 = 4;
            c0291m5.m701r(new p047L2.InterfaceC0372b(c1061t) { // from class: S2.d

                /* renamed from: m */
                public final /* synthetic */ android.support.v4.media.session.C1061t f2133m;

                {
                    this.f2133m = c1061t;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.lang.Boolean bool;
                    switch (i8) {
                        case 0:
                            android.support.v4.media.session.C1061t c1061t2 = this.f2133m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c1061t2.m2210T((java.lang.String) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1794c0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            android.support.v4.media.session.C1061t c1061t3 = this.f2133m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList3.get(0);
                            java.util.Map map = (java.util.Map) arrayList3.get(1);
                            try {
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1794c0(th2);
                            }
                            if (((p009B2.AbstractActivityC0047d) c1061t3.f3863o) == null) {
                                throw new p075S2.C0649b();
                            }
                            try {
                                ((p009B2.AbstractActivityC0047d) c1061t3.f3863o).startActivity(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(str)).putExtra("com.android.browser.headers", android.support.v4.media.session.C1061t.m2200c0(map)));
                                bool = java.lang.Boolean.TRUE;
                            } catch (android.content.ActivityNotFoundException unused) {
                                bool = java.lang.Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            android.support.v4.media.session.C1061t c1061t4 = this.f2133m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c1061t4.m2241t0((java.lang.String) arrayList5.get(0), (java.lang.Boolean) arrayList5.get(1), (p075S2.C0652e) arrayList5.get(2), (p075S2.C0648a) arrayList5.get(3)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1794c0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            android.support.v4.media.session.C1061t c1061t5 = this.f2133m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                arrayList6.add(0, c1061t5.m2207D0());
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1794c0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            android.support.v4.media.session.C1061t c1061t6 = this.f2133m;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            try {
                                c1061t6.getClass();
                                ((android.content.Context) c1061t6.f3861m).sendBroadcast(new android.content.Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList7 = p101a.AbstractC0936a.m1794c0(th5);
                            }
                            c0026d.mo106e(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    /* renamed from: E0 */
    public static android.os.Bundle m2198E0(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m2199b0(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: b0 */
    public static void m2199b0(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.C1061t.class.getClassLoader());
        }
    }

    /* renamed from: c0 */
    public static android.os.Bundle m2200c0(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            bundle.putString(str, (java.lang.String) map.get(str));
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, A2.a, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [F2.f, java.lang.Object] */
    /* renamed from: n0 */
    public static android.support.v4.media.session.C1061t m2201n0() {
        if (f3859q == null) {
            java.lang.Object obj = new java.lang.Object();
            ?? obj2 = new java.lang.Object();
            obj2.f83a = 0;
            java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool(obj2);
            io.flutter.embedding.engine.FlutterJNI flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
            ?? obj3 = new java.lang.Object();
            obj3.f653a = false;
            obj3.f657e = flutterJNI;
            obj3.f658f = newCachedThreadPool;
            android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(1, false);
            c1061t.f3861m = obj3;
            c1061t.f3862n = obj;
            c1061t.f3863o = newCachedThreadPool;
            f3859q = c1061t;
        }
        return f3859q;
    }

    /* renamed from: q0 */
    public static android.support.v4.media.session.C1061t m2202q0(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i4) {
        return new android.support.v4.media.session.C1061t(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    /* renamed from: y0 */
    public static void m2203y0(android.app.Activity activity, android.support.v4.media.session.C1061t c1061t) {
        activity.getWindow().getDecorView().setTag(com.prology.R.id.media_controller_compat_view_tag, c1061t);
        activity.setMediaController(c1061t != null ? new android.media.session.MediaController(activity, (android.media.session.MediaSession.Token) ((android.support.v4.media.session.MediaSessionCompat$Token) c1061t.f3862n).f3800m) : null);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: A */
    public void mo2204A(int i4) {
        ((android.media.MediaCodec) this.f3861m).setVideoScalingMode(i4);
    }

    /* renamed from: A0 */
    public void m2205A0(java.util.ArrayList arrayList) {
        if (arrayList != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (android.support.v4.media.session.MediaSessionCompat$QueueItem) it.next();
                if (mediaSessionCompat$QueueItem == null) {
                    throw new java.lang.IllegalArgumentException("queue shouldn't have null items");
                }
                long j4 = mediaSessionCompat$QueueItem.f3796m;
                if (hashSet.contains(java.lang.Long.valueOf(j4))) {
                    android.util.Log.e("MediaSessionCompat", "Found duplicate queue id: " + j4, new java.lang.IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(java.lang.Long.valueOf(j4));
            }
        }
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3861m;
        c1056o.f3850g = arrayList;
        android.media.session.MediaSession mediaSession = c1056o.f3844a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (android.support.v4.media.session.MediaSessionCompat$QueueItem) it2.next();
            android.media.session.MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.f3797n;
            if (queueItem == null) {
                queueItem = android.support.v4.media.session.AbstractC1059r.m2194a(mediaSessionCompat$QueueItem2.f3795l.m2061e(), mediaSessionCompat$QueueItem2.f3796m);
                mediaSessionCompat$QueueItem2.f3797n = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: B */
    public long mo654B(int i4) {
        p086W.AbstractC0781a.m1416e(i4 >= 0);
        long[] jArr = (long[]) this.f3863o;
        p086W.AbstractC0781a.m1416e(i4 < jArr.length);
        return jArr[i4];
    }

    /* renamed from: B0 */
    public void m2206B0(p047L2.InterfaceC0379i interfaceC0379i) {
        ((p047L2.InterfaceC0376f) this.f3861m).mo272g((java.lang.String) this.f3862n, interfaceC0379i == null ? null : new android.support.v4.media.session.C1061t(this, interfaceC0379i));
    }

    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object mo266C = ((p200u3.InterfaceC2250d) this.f3861m).mo266C(new p071R2.C0612r(interfaceC2251e, (p048M.C0397d) this.f3862n, (p071R2.C0590K) this.f3863o), interfaceC1190d);
        return mo266C == p115c3.EnumC1252a.f4880l ? mo266C : p100Z2.C0934g.f3298a;
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: D */
    public void mo1104D(java.lang.String str, boolean z4, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putBoolean(str, z4).apply();
    }

    /* renamed from: D0 */
    public java.lang.Boolean m2207D0() {
        java.lang.String str;
        java.util.List emptyList = java.util.Collections.emptyList();
        android.content.pm.PackageManager packageManager = ((android.content.Context) this.f3861m).getPackageManager();
        java.util.List arrayList = emptyList == null ? new java.util.ArrayList() : emptyList;
        android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            java.lang.String str2 = resolveActivity.activityInfo.packageName;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        android.content.Intent intent = new android.content.Intent("android.support.customtabs.action.CustomTabsService");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (java.lang.String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    android.util.Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return java.lang.Boolean.valueOf(str != null);
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: E */
    public void mo47E() {
        p025F1.C0219k c0219k;
        android.content.Context context = (android.content.Context) this.f3862n;
        if (context == null || (c0219k = (p025F1.C0219k) this.f3863o) == null) {
            return;
        }
        context.unregisterReceiver(c0219k);
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: F */
    public java.util.Map mo1105F(java.util.List list, p071R2.C0602h c0602h) {
        java.lang.Object value;
        java.util.Map<java.lang.String, ?> all = m2212V(c0602h).getAll();
        p154k3.AbstractC1803h.m3778d(all, "getAll(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            if (p071R2.AbstractC0591L.m1120b(entry.getKey(), entry.getValue(), list != null ? p105a3.AbstractC1021d.m2055j0(list) : null) && (value = entry.getValue()) != null) {
                java.lang.String key = entry.getKey();
                java.lang.Object m1121c = p071R2.AbstractC0591L.m1121c(value, (p025F1.C0215g) this.f3863o);
                p154k3.AbstractC1803h.m3777c(m1121c, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, m1121c);
            }
        }
        return hashMap;
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: G */
    public void mo1106G(java.lang.String str, double d4, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).apply();
    }

    @Override // p047L2.InterfaceC0379i
    /* renamed from: H */
    public void mo48H(java.lang.Object obj, p047L2.C0378h c0378h) {
        if (((android.content.Context) this.f3862n) == null) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        p025F1.C0219k c0219k = new p025F1.C0219k(c0378h);
        this.f3863o = c0219k;
        p176p1.AbstractC1949a.m3908K((android.content.Context) this.f3862n, c0219k, intentFilter);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        if (p182q3.AbstractC2032i.m4082p0(r4, "generic") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0275, code lost:
    
        if (r3.equals("init") == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191 A[LOOP:1: B:23:0x018b->B:25:0x0191, LOOP_END] */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo42I(p047L2.C0384n r13, p043K2.C0335k r14) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.C1061t.mo42I(L2.n, K2.k):void");
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: J */
    public void mo1107J(java.lang.String str, java.util.List list, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((p025F1.C0215g) this.f3863o).m603s(list))).apply();
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: K */
    public java.lang.Double mo1108K(java.lang.String str, p071R2.C0602h c0602h) {
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        if (!m2212V.contains(str)) {
            return null;
        }
        java.lang.Object m1121c = p071R2.AbstractC0591L.m1121c(m2212V.getString(str, ""), (p025F1.C0215g) this.f3863o);
        p154k3.AbstractC1803h.m3777c(m1121c, "null cannot be cast to non-null type kotlin.Double");
        return (java.lang.Double) m1121c;
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: L */
    public java.lang.Long mo1109L(java.lang.String str, p071R2.C0602h c0602h) {
        long j4;
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        if (!m2212V.contains(str)) {
            return null;
        }
        try {
            j4 = m2212V.getLong(str, 0L);
        } catch (java.lang.ClassCastException unused) {
            j4 = m2212V.getInt(str, 0);
        }
        return java.lang.Long.valueOf(j4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: M */
    public android.media.MediaFormat mo2208M() {
        return ((android.media.MediaCodec) this.f3861m).getOutputFormat();
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: N */
    public p071R2.C0594O mo1110N(java.lang.String str, p071R2.C0602h c0602h) {
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        if (!m2212V.contains(str)) {
            return null;
        }
        java.lang.String string = m2212V.getString(str, "");
        p154k3.AbstractC1803h.m3776b(string);
        return p182q3.AbstractC2032i.m4082p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new p071R2.C0594O(string, p071R2.EnumC0592M.f1861o) : p182q3.AbstractC2032i.m4082p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new p071R2.C0594O(null, p071R2.EnumC0592M.f1860n) : new p071R2.C0594O(null, p071R2.EnumC0592M.f1862p);
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: O */
    public void mo1111O(java.lang.String str, java.lang.String str2, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putString(str, str2).apply();
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: P */
    public java.util.List mo1112P(java.util.List list, p071R2.C0602h c0602h) {
        java.util.Map<java.lang.String, ?> all = m2212V(c0602h).getAll();
        p154k3.AbstractC1803h.m3778d(all, "getAll(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            p154k3.AbstractC1803h.m3778d(key, "<get-key>(...)");
            if (p071R2.AbstractC0591L.m1120b(key, entry.getValue(), list != null ? p105a3.AbstractC1021d.m2055j0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return p105a3.AbstractC1021d.m2053h0(linkedHashMap.keySet());
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: Q */
    public int mo655Q() {
        return ((long[]) this.f3863o).length;
    }

    @Override // p047L2.InterfaceC0374d
    /* renamed from: R */
    public void mo103R(java.nio.ByteBuffer byteBuffer, p018D2.C0181g c0181g) {
        android.support.v4.media.session.C1061t c1061t = (android.support.v4.media.session.C1061t) this.f3863o;
        p047L2.C0384n mo835c = ((p047L2.C0392v) c1061t.f3863o).mo835c(byteBuffer);
        java.lang.String str = mo835c.f1133a;
        boolean equals = str.equals("listen");
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.f3862n;
        java.lang.Object obj = mo835c.f1134b;
        java.lang.String str2 = (java.lang.String) c1061t.f3862n;
        p047L2.C0392v c0392v = (p047L2.C0392v) c1061t.f3863o;
        p047L2.InterfaceC0379i interfaceC0379i = (p047L2.InterfaceC0379i) this.f3861m;
        if (!equals) {
            if (!str.equals("cancel")) {
                c0181g.mo289a(null);
                return;
            }
            if (((p047L2.InterfaceC0377g) atomicReference.getAndSet(null)) == null) {
                c0181g.mo289a(c0392v.mo838f("error", "No active stream to cancel", null));
                return;
            }
            try {
                interfaceC0379i.mo47E();
                c0181g.mo289a(c0392v.mo834b(null));
                return;
            } catch (java.lang.RuntimeException e4) {
                android.util.Log.e("EventChannel#" + str2, "Failed to close event stream", e4);
                c0181g.mo289a(c0392v.mo838f("error", e4.getMessage(), null));
                return;
            }
        }
        p047L2.C0378h c0378h = new p047L2.C0378h(this);
        if (((p047L2.InterfaceC0377g) atomicReference.getAndSet(c0378h)) != null) {
            try {
                interfaceC0379i.mo47E();
            } catch (java.lang.RuntimeException e5) {
                android.util.Log.e("EventChannel#" + str2, "Failed to close existing event stream", e5);
            }
        }
        try {
            interfaceC0379i.mo48H(obj, c0378h);
            c0181g.mo289a(c0392v.mo834b(null));
        } catch (java.lang.RuntimeException e6) {
            atomicReference.set(null);
            android.util.Log.e("EventChannel#" + str2, "Failed to open event stream", e6);
            c0181g.mo289a(c0392v.mo838f("error", e6.getMessage(), null));
        }
    }

    /* renamed from: S */
    public java.lang.String m2209S(java.lang.String str, long j4, int i4, long j5) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f3861m;
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f3863o;
            if (i5 >= size) {
                sb.append((java.lang.String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((java.lang.String) arrayList2.get(i5));
            if (((java.lang.Integer) arrayList.get(i5)).intValue() == 1) {
                sb.append(str);
            } else {
                int intValue = ((java.lang.Integer) arrayList.get(i5)).intValue();
                java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f3862n;
                if (intValue == 2) {
                    sb.append(java.lang.String.format(java.util.Locale.US, (java.lang.String) arrayList3.get(i5), java.lang.Long.valueOf(j4)));
                } else if (((java.lang.Integer) arrayList.get(i5)).intValue() == 3) {
                    sb.append(java.lang.String.format(java.util.Locale.US, (java.lang.String) arrayList3.get(i5), java.lang.Integer.valueOf(i4)));
                } else if (((java.lang.Integer) arrayList.get(i5)).intValue() == 4) {
                    sb.append(java.lang.String.format(java.util.Locale.US, (java.lang.String) arrayList3.get(i5), java.lang.Long.valueOf(j5)));
                }
            }
            i5++;
        }
    }

    /* renamed from: T */
    public java.lang.Boolean m2210T(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        android.content.ComponentName resolveActivity = intent.resolveActivity(((android.content.Context) ((p009B2.C0067x) this.f3862n).f219m).getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    /* renamed from: U */
    public void m2211U(android.app.Activity activity) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) this.f3862n;
        reentrantLock.lock();
        try {
            ((java.util.WeakHashMap) this.f3863o).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: V */
    public android.content.SharedPreferences m2212V(p071R2.C0602h c0602h) {
        java.lang.String str = c0602h.f1879a;
        android.content.Context context = (android.content.Context) this.f3862n;
        if (str != null) {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            p154k3.AbstractC1803h.m3776b(sharedPreferences);
            return sharedPreferences;
        }
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        p154k3.AbstractC1803h.m3776b(sharedPreferences2);
        return sharedPreferences2;
    }

    /* renamed from: W */
    public void m2213W(boolean z4) {
        for (p056O.DialogInterfaceOnCancelListenerC0476d dialogInterfaceOnCancelListenerC0476d : ((p056O.C0479g) this.f3861m).m994f()) {
            if (dialogInterfaceOnCancelListenerC0476d != null && z4) {
                dialogInterfaceOnCancelListenerC0476d.f1382n.m2213W(true);
            }
        }
    }

    /* renamed from: X */
    public void m2214X(boolean z4) {
        for (p056O.DialogInterfaceOnCancelListenerC0476d dialogInterfaceOnCancelListenerC0476d : ((p056O.C0479g) this.f3861m).m994f()) {
            if (dialogInterfaceOnCancelListenerC0476d != null && z4) {
                dialogInterfaceOnCancelListenerC0476d.f1382n.m2214X(true);
            }
        }
    }

    /* renamed from: Y */
    public void m2215Y(int i4, io.flutter.view.EnumC1607d enumC1607d) {
        ((io.flutter.embedding.engine.FlutterJNI) this.f3862n).dispatchSemanticsAction(i4, enumC1607d);
    }

    /* renamed from: Z */
    public void m2216Z(int i4, io.flutter.view.EnumC1607d enumC1607d, java.io.Serializable serializable) {
        ((io.flutter.embedding.engine.FlutterJNI) this.f3862n).dispatchSemanticsAction(i4, enumC1607d, serializable);
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: a */
    public void mo1314a(p086W.C0803w c0803w, p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        this.f3862n = c0803w;
        c1325g.m3084a();
        c1325g.m3086c();
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 5);
        this.f3863o = mo640v;
        mo640v.mo1407c((p076T.C0702p) this.f3861m);
    }

    /* renamed from: a0 */
    public void m2217a0() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f3863o;
        java.util.Iterator it = new java.util.ArrayList(hashMap.values()).iterator();
        while (it.hasNext()) {
            ((p194t2.C2185a) it.next()).m4313H();
        }
        hashMap.clear();
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: b */
    public void mo2218b(int i4, p098Z.C0917b c0917b, long j4, int i5) {
        ((android.media.MediaCodec) this.f3861m).queueSecureInputBuffer(i4, 0, c0917b.f3247i, j4, i5);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: c */
    public void mo2219c(android.os.Bundle bundle) {
        ((android.media.MediaCodec) this.f3861m).setParameters(bundle);
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: d */
    public void mo1317d(p086W.C0798r c0798r) {
        long m1576d;
        long j4;
        p086W.AbstractC0781a.m1422k((p086W.C0803w) this.f3862n);
        int i4 = p086W.AbstractC0805y.f2801a;
        p086W.C0803w c0803w = (p086W.C0803w) this.f3862n;
        synchronized (c0803w) {
            try {
                long j5 = c0803w.f2798c;
                m1576d = j5 != -9223372036854775807L ? j5 + c0803w.f2797b : c0803w.m1576d();
            } finally {
            }
        }
        p086W.C0803w c0803w2 = (p086W.C0803w) this.f3862n;
        synchronized (c0803w2) {
            j4 = c0803w2.f2797b;
        }
        if (m1576d == -9223372036854775807L || j4 == -9223372036854775807L) {
            return;
        }
        p076T.C0702p c0702p = (p076T.C0702p) this.f3861m;
        if (j4 != c0702p.f2413r) {
            p076T.C0701o m1295a = c0702p.m1295a();
            m1295a.f2375q = j4;
            p076T.C0702p c0702p2 = new p076T.C0702p(m1295a);
            this.f3861m = c0702p2;
            ((p215y0.InterfaceC2387F) this.f3863o).mo1407c(c0702p2);
        }
        int m1539a = c0798r.m1539a();
        ((p215y0.InterfaceC2387F) this.f3863o).mo1405a(c0798r, m1539a, 0);
        ((p215y0.InterfaceC2387F) this.f3863o).mo1406b(m1576d, 1, m1539a, 0, null);
    }

    /* renamed from: d0 */
    public int m2220d0(int i4, int i5) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f3862n;
        int size = arrayList.size();
        while (i5 < size) {
            ((p152k1.AbstractC1762a) arrayList.get(i5)).getClass();
            i5++;
        }
        return i4;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: e */
    public void mo2221e(int i4, int i5, long j4, int i6) {
        ((android.media.MediaCodec) this.f3861m).queueInputBuffer(i4, 0, i5, j4, i6);
    }

    /* renamed from: e0 */
    public android.content.res.ColorStateList m2222e0(int i4) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.f3862n;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            java.lang.Object obj = p126f.AbstractC1367a.f5645a;
            android.content.res.ColorStateList colorStateList = ((android.content.Context) this.f3861m).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: f */
    public int mo2223f(android.media.MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            android.media.MediaCodec mediaCodec = (android.media.MediaCodec) this.f3861m;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && p086W.AbstractC0805y.f2801a < 21) {
                this.f3863o = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: f0 */
    public long m2224f0() {
        p215y0.C2400l c2400l = (p215y0.C2400l) this.f3863o;
        if (c2400l != null) {
            return c2400l.f9450o;
        }
        return -1L;
    }

    @Override // p146j0.InterfaceC1706j
    public void flush() {
        ((android.media.MediaCodec) this.f3861m).flush();
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: g */
    public int mo657g(long j4) {
        long[] jArr = (long[]) this.f3863o;
        int m1607b = p086W.AbstractC0805y.m1607b(jArr, j4, false);
        if (m1607b < jArr.length) {
            return m1607b;
        }
        return -1;
    }

    /* renamed from: g0 */
    public android.graphics.drawable.Drawable m2225g0(int i4) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.f3862n;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : p126f.AbstractC1367a.m3116a((android.content.Context) this.f3861m, resourceId);
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: h */
    public void mo1113h(java.util.List list, p071R2.C0602h c0602h) {
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        android.content.SharedPreferences.Editor edit = m2212V.edit();
        p154k3.AbstractC1803h.m3778d(edit, "edit(...)");
        java.util.Map<java.lang.String, ?> all = m2212V.getAll();
        p154k3.AbstractC1803h.m3778d(all, "getAll(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : all.keySet()) {
            if (p071R2.AbstractC0591L.m1120b(str, all.get(str), list != null ? p105a3.AbstractC1021d.m2055j0(list) : null)) {
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        p154k3.AbstractC1803h.m3778d(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p154k3.AbstractC1803h.m3778d(next, "next(...)");
            edit.remove((java.lang.String) next);
        }
        edit.apply();
    }

    /* renamed from: h0 */
    public android.graphics.Typeface m2226h0(int i4, int i5, p073S0.C0629g c0629g) {
        int i6 = 12;
        int resourceId = ((android.content.res.TypedArray) this.f3862n).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((android.util.TypedValue) this.f3863o) == null) {
            this.f3863o = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) this.f3863o;
        java.lang.Object obj = p192t.AbstractC2162e.f8608a;
        android.content.Context context = (android.content.Context) this.f3861m;
        if (context.isRestricted()) {
            return null;
        }
        android.content.res.Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + java.lang.Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            c0629g.m1144b();
            return null;
        }
        int i7 = typedValue.assetCookie;
        p165n.C1882i c1882i = p196u.AbstractC2208c.f8815b;
        android.graphics.Typeface typeface = (android.graphics.Typeface) c1882i.m3862a(p196u.AbstractC2208c.m4390b(resources, resourceId, charSequence2, i7, i5));
        if (typeface != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new p086W.RunnableC0793m(i6, c0629g, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                p192t.InterfaceC2158a m1388w = p080U1.AbstractC0748a.m1388w(resources.getXml(resourceId), resources);
                if (m1388w != null) {
                    return p196u.AbstractC2208c.m4389a(context, m1388w, resources, resourceId, charSequence2, typedValue.assetCookie, i5, c0629g);
                }
                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0629g.m1144b();
                return null;
            }
            int i8 = typedValue.assetCookie;
            android.graphics.Typeface mo4396f = p196u.AbstractC2208c.f8814a.mo4396f(context, resources, resourceId, charSequence2, i5);
            if (mo4396f != null) {
                c1882i.m3863b(p196u.AbstractC2208c.m4390b(resources, resourceId, charSequence2, i8, i5), mo4396f);
            }
            if (mo4396f != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new p086W.RunnableC0793m(i6, c0629g, mo4396f));
            } else {
                c0629g.m1144b();
            }
            return mo4396f;
        } catch (java.io.IOException e4) {
            android.util.Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e4);
            c0629g.m1144b();
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e5) {
            android.util.Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e5);
            c0629g.m1144b();
            return null;
        }
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: i */
    public void mo1114i(java.lang.String str, java.lang.String str2, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putString(str, str2).apply();
    }

    /* renamed from: i0 */
    public android.view.View m2227i0(int i4) {
        return ((androidx.recyclerview.widget.RecyclerView) ((p129f2.C1408Y) this.f3861m).f5729m).getChildAt(i4);
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: j */
    public void mo2228j(long j4, int i4) {
        ((android.media.MediaCodec) this.f3861m).releaseOutputBuffer(i4, j4);
    }

    /* renamed from: j0 */
    public int m2229j0() {
        return ((androidx.recyclerview.widget.RecyclerView) ((p129f2.C1408Y) this.f3861m).f5729m).getChildCount();
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: k */
    public java.nio.ByteBuffer mo2230k(int i4) {
        return p086W.AbstractC0805y.f2801a >= 21 ? ((android.media.MediaCodec) this.f3861m).getInputBuffer(i4) : ((java.nio.ByteBuffer[]) this.f3862n)[i4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [B2.D, java.lang.Object] */
    /* renamed from: k0 */
    public boolean m2231k0(android.view.KeyEvent keyEvent) {
        if (((java.util.HashSet) this.f3862n).remove(keyEvent)) {
            return false;
        }
        p009B2.InterfaceC0035F[] interfaceC0035FArr = (p009B2.InterfaceC0035F[]) this.f3861m;
        if (interfaceC0035FArr.length <= 0) {
            m2239r0(keyEvent);
            return true;
        }
        p009B2.C0034E c0034e = new p009B2.C0034E(this, keyEvent);
        for (p009B2.C0031B c0031b : interfaceC0035FArr) {
            ?? obj = new java.lang.Object();
            obj.f119b = c0034e;
            obj.f118a = false;
            c0031b.mo105b(keyEvent, obj);
        }
        return true;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: l */
    public void mo2232l(android.view.Surface surface) {
        ((android.media.MediaCodec) this.f3861m).setOutputSurface(surface);
    }

    /* renamed from: l0 */
    public boolean m2233l0() {
        java.lang.String trim;
        if (((java.lang.String) this.f3863o) != null) {
            return true;
        }
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) this.f3862n;
        if (!arrayDeque.isEmpty()) {
            java.lang.String str = (java.lang.String) arrayDeque.poll();
            str.getClass();
            this.f3863o = str;
            return true;
        }
        do {
            java.lang.String readLine = ((java.io.BufferedReader) this.f3861m).readLine();
            this.f3863o = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f3863o = trim;
        } while (trim.isEmpty());
        return true;
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: m */
    public java.lang.Boolean mo1115m(java.lang.String str, p071R2.C0602h c0602h) {
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        if (m2212V.contains(str)) {
            return java.lang.Boolean.valueOf(m2212V.getBoolean(str, true));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [f2.F, f2.C] */
    /* renamed from: m0 */
    public void m2234m0(p094Y.InterfaceC0870h interfaceC0870h, android.net.Uri uri, java.util.Map map, long j4, long j5, p179q0.C1977T c1977t) {
        boolean z4;
        boolean z5 = true;
        p215y0.C2400l c2400l = new p215y0.C2400l(interfaceC0870h, j4, j5);
        this.f3863o = c2400l;
        if (((p215y0.InterfaceC2403o) this.f3862n) != null) {
            return;
        }
        p215y0.InterfaceC2403o[] mo4637a = ((p215y0.InterfaceC2406r) this.f3861m).mo4637a(uri, map);
        int length = mo4637a.length;
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.AbstractC1444r.m3226e("expectedSize", length);
        ?? abstractC1387C = new p129f2.AbstractC1387C(length);
        if (mo4637a.length == 1) {
            this.f3862n = mo4637a[0];
        } else {
            int length2 = mo4637a.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                p215y0.InterfaceC2403o interfaceC2403o = mo4637a[i4];
                try {
                } catch (java.io.EOFException unused) {
                    z4 = ((p215y0.InterfaceC2403o) this.f3862n) != null || c2400l.f9450o == j4;
                } catch (java.lang.Throwable th) {
                    if (((p215y0.InterfaceC2403o) this.f3862n) == null && c2400l.f9450o != j4) {
                        z5 = false;
                    }
                    p086W.AbstractC0781a.m1421j(z5);
                    c2400l.f9452q = 0;
                    throw th;
                }
                if (interfaceC2403o.mo36k(c2400l)) {
                    this.f3862n = interfaceC2403o;
                    c2400l.f9452q = 0;
                    break;
                } else {
                    abstractC1387C.m3148d(interfaceC2403o.mo1165j());
                    z4 = ((p215y0.InterfaceC2403o) this.f3862n) != null || c2400l.f9450o == j4;
                    p086W.AbstractC0781a.m1421j(z4);
                    c2400l.f9452q = 0;
                    i4++;
                }
            }
            if (((p215y0.InterfaceC2403o) this.f3862n) == null) {
                java.lang.String str = "None of the available extractors (" + new p124e2.C1358f(", ").m3115b(p129f2.AbstractC1444r.m3243w(p129f2.AbstractC1393I.m3163k(mo4637a), new p107b0.C1169d(16))) + ") could read the stream.";
                uri.getClass();
                p129f2.C1415c0 m3157g = abstractC1387C.m3157g();
                p076T.C0666I c0666i = new p076T.C0666I(str, null, false, 1);
                p129f2.AbstractC1393I.m3162j(m3157g);
                throw c0666i;
            }
        }
        ((p215y0.InterfaceC2403o) this.f3862n).mo35g(c1977t);
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: n */
    public java.lang.String mo1116n(java.lang.String str, p071R2.C0602h c0602h) {
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        if (m2212V.contains(str)) {
            return m2212V.getString(str, "");
        }
        return null;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: o */
    public void mo2235o(p206w0.C2316l c2316l, android.os.Handler handler) {
        ((android.media.MediaCodec) this.f3861m).setOnFrameRenderedListener(new p146j0.C1697a(this, c2316l, 1), handler);
    }

    /* renamed from: o0 */
    public boolean m2236o0() {
        return ((android.support.v4.media.session.C1056o) this.f3861m).f3844a.isActive();
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: p */
    public void mo1117p(java.lang.String str, long j4, p071R2.C0602h c0602h) {
        m2212V(c0602h).edit().putLong(str, j4).apply();
    }

    /* renamed from: p0 */
    public java.lang.String m2237p0() {
        if (!m2233l0()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = (java.lang.String) this.f3863o;
        this.f3863o = null;
        return str;
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: r */
    public void mo2238r(int i4, boolean z4) {
        ((android.media.MediaCodec) this.f3861m).releaseOutputBuffer(i4, z4);
    }

    /* renamed from: r0 */
    public void m2239r0(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection;
        p009B2.InterfaceC0036G interfaceC0036G = (p009B2.InterfaceC0036G) this.f3863o;
        if (interfaceC0036G != null) {
            io.flutter.plugin.editing.C1575k c1575k = ((p009B2.C0064u) interfaceC0036G).f213v;
            boolean z4 = false;
            if (c1575k.f6536b.isAcceptingText() && (inputConnection = c1575k.f6544j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.C1568d) {
                    io.flutter.plugin.editing.C1568d c1568d = (io.flutter.plugin.editing.C1568d) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z4 = c1568d.m3485d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z4 = c1568d.m3485d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z4 = c1568d.m3486e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z4 = c1568d.m3486e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                android.view.inputmethod.EditorInfo editorInfo = c1568d.f6499e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    c1568d.performEditorAction(editorInfo.imeOptions & 255);
                                    z4 = true;
                                }
                            }
                            io.flutter.plugin.editing.C1571g c1571g = c1568d.f6498d;
                            int selectionStart = android.text.Selection.getSelectionStart(c1571g);
                            int selectionEnd = android.text.Selection.getSelectionEnd(c1571g);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = java.lang.Math.min(selectionStart, selectionEnd);
                                int max = java.lang.Math.max(selectionStart, selectionEnd);
                                c1568d.beginBatchEdit();
                                if (min != max) {
                                    c1571g.delete(min, max);
                                }
                                c1571g.insert(min, (java.lang.CharSequence) java.lang.String.valueOf((char) unicodeChar));
                                int i4 = min + 1;
                                c1568d.setSelection(i4, i4);
                                c1568d.endBatchEdit();
                                z4 = true;
                            }
                        }
                    }
                } else {
                    z4 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z4) {
                return;
            }
            java.util.HashSet hashSet = (java.util.HashSet) this.f3862n;
            hashSet.add(keyEvent);
            ((p009B2.C0064u) interfaceC0036G).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                android.util.Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    @Override // p146j0.InterfaceC1706j
    public void release() {
        android.media.MediaCodec mediaCodec = (android.media.MediaCodec) this.f3861m;
        this.f3862n = null;
        this.f3863o = null;
        try {
            int i4 = p086W.AbstractC0805y.f2801a;
            if (i4 >= 30 && i4 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public void mo637s() {
        ((p215y0.InterfaceC2405q) this.f3861m).mo637s();
    }

    /* renamed from: s0 */
    public void m2240s0(android.app.Activity activity, p198u1.C2242j c2242j) {
        p154k3.AbstractC1803h.m3779e(activity, "activity");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) this.f3862n;
        reentrantLock.lock();
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.f3863o;
        try {
            if (c2242j.equals((p198u1.C2242j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            java.util.Iterator it = ((p212x1.C2377j) ((p206w0.C2305a) this.f3861m).f9102l).f9344b.iterator();
            while (it.hasNext()) {
                p212x1.C2376i c2376i = (p212x1.C2376i) it.next();
                if (c2376i.f9338a.equals(activity)) {
                    c2376i.f9340c = c2242j;
                    c2376i.f9339b.accept(c2242j);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
        ((p215y0.InterfaceC2405q) this.f3861m).mo638t(interfaceC2414z);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0069. Please report as an issue. */
    /* renamed from: t0 */
    public java.lang.Boolean m2241t0(java.lang.String str, java.lang.Boolean bool, p075S2.C0652e c0652e, p075S2.C0648a c0648a) {
        android.app.ActivityOptions activityOptions;
        if (((p009B2.AbstractActivityC0047d) this.f3863o) == null) {
            throw new p075S2.C0649b();
        }
        android.os.Bundle m2200c0 = m2200c0(c0652e.f2136c);
        if (bool.booleanValue()) {
            java.util.Iterator it = c0652e.f2136c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.String lowerCase = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.US);
                    lowerCase.getClass();
                    char c4 = 65535;
                    switch (lowerCase.hashCode()) {
                        case -1423461112:
                            if (!lowerCase.equals("accept")) {
                                break;
                            } else {
                                c4 = 0;
                                break;
                            }
                        case -1229727188:
                            if (!lowerCase.equals("content-language")) {
                                break;
                            } else {
                                c4 = 1;
                                break;
                            }
                        case 785670158:
                            if (!lowerCase.equals("content-type")) {
                                break;
                            } else {
                                c4 = 2;
                                break;
                            }
                        case 802785917:
                            if (!lowerCase.equals("accept-language")) {
                                break;
                            } else {
                                c4 = 3;
                                break;
                            }
                    }
                    switch (c4) {
                    }
                } else {
                    android.net.Uri parse = android.net.Uri.parse(str);
                    p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) this.f3863o;
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c0648a.f2129a.booleanValue() ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new android.os.Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i4 = android.os.Build.VERSION.SDK_INT;
                    java.lang.String m3798a = p160m.AbstractC1834b.m3798a();
                    if (!android.text.TextUtils.isEmpty(m3798a)) {
                        android.os.Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
                        if (!bundleExtra.containsKey("Accept-Language")) {
                            bundleExtra.putString("Accept-Language", m3798a);
                            intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
                    if (i4 >= 34) {
                        activityOptions = p160m.AbstractC1833a.m3797a();
                        p160m.AbstractC1835c.m3799a(activityOptions, false);
                    } else {
                        activityOptions = null;
                    }
                    android.os.Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", m2200c0);
                    try {
                        intent.setData(parse);
                        abstractActivityC0047d.startActivity(intent, bundle2);
                        return java.lang.Boolean.TRUE;
                    } catch (android.content.ActivityNotFoundException unused) {
                    }
                }
            }
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d2 = (p009B2.AbstractActivityC0047d) this.f3863o;
        boolean booleanValue = c0652e.f2134a.booleanValue();
        boolean booleanValue2 = c0652e.f2135b.booleanValue();
        int i5 = io.flutter.plugins.urllauncher.WebViewActivity.f6657p;
        try {
            ((p009B2.AbstractActivityC0047d) this.f3863o).startActivity(new android.content.Intent(abstractActivityC0047d2, (java.lang.Class<?>) io.flutter.plugins.urllauncher.WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", m2200c0));
            return java.lang.Boolean.TRUE;
        } catch (android.content.ActivityNotFoundException unused2) {
            return java.lang.Boolean.FALSE;
        }
    }

    public java.lang.String toString() {
        switch (this.f3860l) {
            case 9:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case 24:
                return ((p028G0.C0235c) this.f3862n).toString() + ", hidden list:" + ((java.util.ArrayList) this.f3863o).size();
            default:
                return super.toString();
        }
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: u */
    public java.nio.ByteBuffer mo2242u(int i4) {
        return p086W.AbstractC0805y.f2801a >= 21 ? ((android.media.MediaCodec) this.f3861m).getOutputBuffer(i4) : ((java.nio.ByteBuffer[]) this.f3863o)[i4];
    }

    /* renamed from: u0 */
    public void m2243u0() {
        ((android.content.res.TypedArray) this.f3862n).recycle();
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        p215y0.InterfaceC2405q interfaceC2405q = (p215y0.InterfaceC2405q) this.f3861m;
        if (i5 != 3) {
            return interfaceC2405q.mo640v(i4, i5);
        }
        android.util.SparseArray sparseArray = (android.util.SparseArray) this.f3863o;
        p083V0.C0777o c0777o = (p083V0.C0777o) sparseArray.get(i4);
        if (c0777o != null) {
            return c0777o;
        }
        p083V0.C0777o c0777o2 = new p083V0.C0777o(interfaceC2405q.mo640v(i4, i5), (p083V0.InterfaceC0772j) this.f3862n);
        sparseArray.put(i4, c0777o2);
        return c0777o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f87l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f87l = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2244v0(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            k1.a r2 = (p152k1.AbstractC1762a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f3861m
            B.c r3 = (p006B.C0020c) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            p154k3.AbstractC1803h.m3779e(r2, r4)
            int r4 = r3.f87l
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f88m
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f87l
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f87l = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.C1061t.m2244v0(java.util.ArrayList):void");
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: w */
    public java.util.List mo658w(long j4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i4 = 0;
        while (true) {
            java.util.List list = (java.util.List) this.f3861m;
            if (i4 >= list.size()) {
                break;
            }
            int i5 = i4 * 2;
            long[] jArr = (long[]) this.f3862n;
            if (jArr[i5] <= j4 && j4 < jArr[i5 + 1]) {
                p118d1.C1275d c1275d = (p118d1.C1275d) list.get(i4);
                p082V.C0757b c0757b = c1275d.f5133a;
                if (c0757b.f2657e == -3.4028235E38f) {
                    arrayList2.add(c1275d);
                } else {
                    arrayList.add(c0757b);
                }
            }
            i4++;
        }
        java.util.Collections.sort(arrayList2, new p087W0.C0809d(3));
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            p082V.C0757b c0757b2 = ((p118d1.C1275d) arrayList2.get(i6)).f5133a;
            arrayList.add(new p082V.C0757b(c0757b2.f2653a, c0757b2.f2654b, c0757b2.f2655c, c0757b2.f2656d, (-1) - i6, 1, c0757b2.f2659g, c0757b2.f2660h, c0757b2.f2661i, c0757b2.f2666n, c0757b2.f2667o, c0757b2.f2662j, c0757b2.f2663k, c0757b2.f2664l, c0757b2.f2665m, c0757b2.f2668p, c0757b2.f2669q));
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public void m2245w0(p190s2.C2145e c2145e) {
        if (c2145e == null) {
            throw new java.lang.IllegalArgumentException("callback must not be null");
        }
        if (!((java.util.Set) this.f3863o).add(c2145e)) {
            android.util.Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        android.os.Handler handler = new android.os.Handler();
        c2145e.m4265b(handler);
        android.support.v4.media.session.C1049h c1049h = (android.support.v4.media.session.C1049h) this.f3861m;
        c1049h.f3831a.registerCallback(c2145e.f8553a, handler);
        synchronized (c1049h.f3832b) {
            if (c1049h.f3835e.m2098d() != null) {
                android.support.v4.media.session.BinderC1048g binderC1048g = new android.support.v4.media.session.BinderC1048g(c2145e);
                c1049h.f3834d.put(c2145e, binderC1048g);
                c2145e.f8555c = binderC1048g;
                try {
                    c1049h.f3835e.m2098d().mo2110k(binderC1048g);
                    c2145e.m4264a(13, null, null);
                } catch (android.os.RemoteException e4) {
                    android.util.Log.e("MediaControllerCompat", "Dead object in registerCallback.", e4);
                }
            } else {
                c2145e.f8555c = null;
                c1049h.f3833c.add(c2145e);
            }
        }
    }

    @Override // p071R2.InterfaceC0601g
    /* renamed from: x */
    public java.util.ArrayList mo1118x(java.lang.String str, p071R2.C0602h c0602h) {
        java.util.List list;
        android.content.SharedPreferences m2212V = m2212V(c0602h);
        java.util.ArrayList arrayList = null;
        if (m2212V.contains(str)) {
            java.lang.String string = m2212V.getString(str, "");
            p154k3.AbstractC1803h.m3776b(string);
            if (p182q3.AbstractC2032i.m4082p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !p182q3.AbstractC2032i.m4082p0(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (java.util.List) p071R2.AbstractC0591L.m1121c(m2212V.getString(str, ""), (p025F1.C0215g) this.f3863o)) != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (obj instanceof java.lang.String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public void m2246x0(boolean z4) {
        ((android.support.v4.media.session.C1056o) this.f3861m).f3844a.setActive(z4);
        java.util.Iterator it = ((java.util.ArrayList) this.f3863o).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }

    @Override // p146j0.InterfaceC1706j
    /* renamed from: z */
    public int mo2247z() {
        return ((android.media.MediaCodec) this.f3861m).dequeueInputBuffer(0L);
    }

    /* renamed from: z0 */
    public void m2248z0(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.support.v4.media.session.C1056o c1056o = (android.support.v4.media.session.C1056o) this.f3861m;
        c1056o.f3849f = playbackStateCompat;
        synchronized (c1056o.f3847d) {
            for (int beginBroadcast = c1056o.f3848e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((android.support.v4.media.session.InterfaceC1043b) c1056o.f3848e.getBroadcastItem(beginBroadcast)).mo2101a0(playbackStateCompat);
                } catch (android.os.RemoteException unused) {
                }
            }
            c1056o.f3848e.finishBroadcast();
        }
        android.media.session.MediaSession mediaSession = c1056o.f3844a;
        if (playbackStateCompat.f3819w == null) {
            android.media.session.PlaybackState.Builder m2252d = android.support.v4.media.session.AbstractC1062u.m2252d();
            android.support.v4.media.session.AbstractC1062u.m2272x(m2252d, playbackStateCompat.f3808l, playbackStateCompat.f3809m, playbackStateCompat.f3811o, playbackStateCompat.f3815s);
            android.support.v4.media.session.AbstractC1062u.m2269u(m2252d, playbackStateCompat.f3810n);
            android.support.v4.media.session.AbstractC1062u.m2267s(m2252d, playbackStateCompat.f3812p);
            android.support.v4.media.session.AbstractC1062u.m2270v(m2252d, playbackStateCompat.f3814r);
            for (android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f3816t) {
                android.media.session.PlaybackState.CustomAction customAction2 = customAction.f3824p;
                if (customAction2 == null) {
                    android.media.session.PlaybackState.CustomAction.Builder m2253e = android.support.v4.media.session.AbstractC1062u.m2253e(customAction.f3820l, customAction.f3821m, customAction.f3822n);
                    android.support.v4.media.session.AbstractC1062u.m2271w(m2253e, customAction.f3823o);
                    customAction2 = android.support.v4.media.session.AbstractC1062u.m2250b(m2253e);
                }
                android.support.v4.media.session.AbstractC1062u.m2249a(m2252d, customAction2);
            }
            android.support.v4.media.session.AbstractC1062u.m2268t(m2252d, playbackStateCompat.f3817u);
            android.support.v4.media.session.AbstractC1063v.m2274b(m2252d, playbackStateCompat.f3818v);
            playbackStateCompat.f3819w = android.support.v4.media.session.AbstractC1062u.m2251c(m2252d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f3819w);
    }

    public /* synthetic */ C1061t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i4) {
        this.f3860l = i4;
        this.f3861m = obj;
        this.f3862n = obj2;
        this.f3863o = obj3;
    }

    public C1061t(android.content.Context context, p047L2.InterfaceC0376f interfaceC0376f) {
        this.f3860l = 27;
        this.f3863o = new java.util.HashMap();
        this.f3861m = context;
        this.f3862n = interfaceC0376f;
    }

    public C1061t(java.util.ArrayList arrayList) {
        this.f3860l = 17;
        this.f3861m = java.util.Collections.unmodifiableList(new java.util.ArrayList(arrayList));
        this.f3862n = new long[arrayList.size() * 2];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            p118d1.C1275d c1275d = (p118d1.C1275d) arrayList.get(i4);
            int i5 = i4 * 2;
            long[] jArr = (long[]) this.f3862n;
            jArr[i5] = c1275d.f5134b;
            jArr[i5 + 1] = c1275d.f5135c;
        }
        long[] jArr2 = (long[]) this.f3862n;
        long[] copyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.f3863o = copyOf;
        java.util.Arrays.sort(copyOf);
    }

    public C1061t(java.lang.String str) {
        this.f3860l = 19;
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
        this.f3861m = new p076T.C0702p(c0701o);
    }

    public C1061t(p047L2.InterfaceC0376f interfaceC0376f, java.lang.String str) {
        this.f3860l = 7;
        p047L2.C0392v c0392v = p047L2.C0392v.f1138a;
        this.f3861m = interfaceC0376f;
        this.f3862n = str;
        this.f3863o = c0392v;
    }

    public C1061t(p129f2.C1408Y c1408y) {
        this.f3860l = 24;
        this.f3861m = c1408y;
        this.f3862n = new p028G0.C0235c(5);
        this.f3863o = new java.util.ArrayList();
    }

    public C1061t(p215y0.InterfaceC2405q interfaceC2405q, p083V0.InterfaceC0772j interfaceC0772j) {
        this.f3860l = 14;
        this.f3861m = interfaceC2405q;
        this.f3862n = interfaceC0772j;
        this.f3863o = new android.util.SparseArray();
    }

    public C1061t(android.content.Context context) {
        this.f3860l = 13;
        p009B2.C0067x c0067x = new p009B2.C0067x(8, context);
        this.f3861m = context;
        this.f3862n = c0067x;
    }

    public C1061t(p215y0.InterfaceC2406r interfaceC2406r) {
        this.f3860l = 25;
        this.f3861m = interfaceC2406r;
    }

    public C1061t(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f3860l = 18;
        this.f3863o = arrayList;
        this.f3861m = arrayList2;
        this.f3862n = arrayList3;
    }

    public C1061t(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.f3860l = 21;
        this.f3861m = context;
        this.f3862n = typedArray;
    }

    public C1061t(p183r.C2035c c2035c) {
        android.os.Bundle bundle;
        int i4;
        java.util.ArrayList arrayList;
        android.os.Bundle bundle2;
        int i5;
        this.f3860l = 26;
        new java.util.ArrayList();
        this.f3863o = new android.os.Bundle();
        this.f3862n = c2035c;
        android.content.Context context = c2035c.f8267a;
        android.app.Notification.Builder builder = new android.app.Notification.Builder(context, c2035c.f8283q);
        this.f3861m = builder;
        android.app.Notification notification = c2035c.f8285s;
        android.content.res.Resources resources = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c2035c.f8271e).setContentText(c2035c.f8272f).setContentInfo(null).setContentIntent(c2035c.f8273g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        androidx.core.graphics.drawable.IconCompat iconCompat = c2035c.f8274h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m2334e(context));
        builder.setSubText(c2035c.f8278l).setUsesChronometer(false).setPriority(c2035c.f8275i);
        java.util.Iterator it = c2035c.f8268b.iterator();
        while (it.hasNext()) {
            p183r.C2033a c2033a = (p183r.C2033a) it.next();
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (c2033a.f8260b == null && (i5 = c2033a.f8263e) != 0) {
                c2033a.f8260b = androidx.core.graphics.drawable.IconCompat.m2331b(null, "", i5);
            }
            androidx.core.graphics.drawable.IconCompat iconCompat2 = c2033a.f8260b;
            android.app.Notification.Action.Builder builder2 = new android.app.Notification.Action.Builder(iconCompat2 != null ? iconCompat2.m2334e(null) : null, c2033a.f8264f, c2033a.f8265g);
            android.os.Bundle bundle3 = c2033a.f8259a;
            if (bundle3 != null) {
                bundle2 = new android.os.Bundle(bundle3);
            } else {
                bundle2 = new android.os.Bundle();
            }
            boolean z4 = c2033a.f8261c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            builder2.setAllowGeneratedReplies(z4);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                p011C.AbstractC0113e.m416m(builder2);
            }
            if (i6 >= 29) {
                p183r.AbstractC2036d.m4092d(builder2);
            }
            if (i6 >= 31) {
                p183r.AbstractC2037e.m4095c(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c2033a.f8262d);
            builder2.addExtras(bundle2);
            ((android.app.Notification.Builder) this.f3861m).addAction(builder2.build());
        }
        android.os.Bundle bundle4 = c2035c.f8280n;
        if (bundle4 != null) {
            ((android.os.Bundle) this.f3863o).putAll(bundle4);
        }
        int i7 = android.os.Build.VERSION.SDK_INT;
        ((android.app.Notification.Builder) this.f3861m).setShowWhen(c2035c.f8276j);
        ((android.app.Notification.Builder) this.f3861m).setLocalOnly(c2035c.f8279m);
        ((android.app.Notification.Builder) this.f3861m).setGroup(null);
        ((android.app.Notification.Builder) this.f3861m).setSortKey(null);
        ((android.app.Notification.Builder) this.f3861m).setGroupSummary(false);
        ((android.app.Notification.Builder) this.f3861m).setCategory(null);
        ((android.app.Notification.Builder) this.f3861m).setColor(c2035c.f8281o);
        ((android.app.Notification.Builder) this.f3861m).setVisibility(c2035c.f8282p);
        ((android.app.Notification.Builder) this.f3861m).setPublicVersion(null);
        ((android.app.Notification.Builder) this.f3861m).setSound(notification.sound, notification.audioAttributes);
        java.util.ArrayList arrayList2 = c2035c.f8286t;
        java.util.ArrayList arrayList3 = c2035c.f8269c;
        if (i7 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(arrayList3.size());
                java.util.Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new java.lang.ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    p165n.C1879f c1879f = new p165n.C1879f(arrayList2.size() + arrayList.size());
                    c1879f.addAll(arrayList);
                    c1879f.addAll(arrayList2);
                    arrayList2 = new java.util.ArrayList(c1879f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            java.util.Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((android.app.Notification.Builder) this.f3861m).addPerson((java.lang.String) it3.next());
            }
        }
        java.util.ArrayList arrayList4 = c2035c.f8270d;
        if (arrayList4.size() > 0) {
            if (c2035c.f8280n == null) {
                c2035c.f8280n = new android.os.Bundle();
            }
            android.os.Bundle bundle5 = c2035c.f8280n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new android.os.Bundle() : bundle5;
            android.os.Bundle bundle6 = new android.os.Bundle(bundle5);
            android.os.Bundle bundle7 = new android.os.Bundle();
            int i8 = 0;
            while (i8 < arrayList4.size()) {
                java.lang.String num = java.lang.Integer.toString(i8);
                p183r.C2033a c2033a2 = (p183r.C2033a) arrayList4.get(i8);
                android.os.Bundle bundle8 = new android.os.Bundle();
                if (c2033a2.f8260b == null && (i4 = c2033a2.f8263e) != 0) {
                    c2033a2.f8260b = androidx.core.graphics.drawable.IconCompat.m2331b(resources, "", i4);
                }
                androidx.core.graphics.drawable.IconCompat iconCompat3 = c2033a2.f8260b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.m2332c() : 0);
                bundle8.putCharSequence("title", c2033a2.f8264f);
                bundle8.putParcelable("actionIntent", c2033a2.f8265g);
                android.os.Bundle bundle9 = c2033a2.f8259a;
                if (bundle9 != null) {
                    bundle = new android.os.Bundle(bundle9);
                } else {
                    bundle = new android.os.Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c2033a2.f8261c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c2033a2.f8262d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i8++;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (c2035c.f8280n == null) {
                c2035c.f8280n = new android.os.Bundle();
            }
            c2035c.f8280n.putBundle("android.car.EXTENSIONS", bundle5);
            ((android.os.Bundle) this.f3863o).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = android.os.Build.VERSION.SDK_INT;
        ((android.app.Notification.Builder) this.f3861m).setExtras(c2035c.f8280n);
        ((android.app.Notification.Builder) this.f3861m).setRemoteInputHistory(null);
        ((android.app.Notification.Builder) this.f3861m).setBadgeIconType(0);
        ((android.app.Notification.Builder) this.f3861m).setSettingsText(null);
        ((android.app.Notification.Builder) this.f3861m).setShortcutId(null);
        ((android.app.Notification.Builder) this.f3861m).setTimeoutAfter(0L);
        ((android.app.Notification.Builder) this.f3861m).setGroupAlertBehavior(0);
        if (!android.text.TextUtils.isEmpty(c2035c.f8283q)) {
            ((android.app.Notification.Builder) this.f3861m).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i9 >= 28) {
            java.util.Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        if (i9 >= 29) {
            p183r.AbstractC2036d.m4090b((android.app.Notification.Builder) this.f3861m, c2035c.f8284r);
            p183r.AbstractC2036d.m4091c((android.app.Notification.Builder) this.f3861m);
        }
    }

    public C1061t(p025F1.C0215g c0215g) {
        this.f3860l = 23;
        this.f3861m = new p006B.C0020c(30);
        this.f3863o = new java.util.ArrayList();
        this.f3862n = new java.util.ArrayList();
        new p046L1.C0363g(24, this);
    }

    public C1061t(android.media.MediaCodec mediaCodec) {
        this.f3860l = 22;
        this.f3861m = mediaCodec;
        if (p086W.AbstractC0805y.f2801a < 21) {
            this.f3862n = mediaCodec.getInputBuffers();
            this.f3863o = mediaCodec.getOutputBuffers();
        }
    }

    public C1061t(p018D2.C0176b c0176b, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f3860l = 4;
        p009B2.C0061r c0061r = new p009B2.C0061r(13, this);
        p035I.C0291m c0291m = new p035I.C0291m(c0176b, "flutter/accessibility", p047L2.C0391u.f1135a, null);
        this.f3861m = c0291m;
        c0291m.m701r(c0061r);
        this.f3862n = flutterJNI;
    }

    public C1061t(p009B2.InterfaceC0036G interfaceC0036G) {
        this.f3860l = 2;
        this.f3862n = new java.util.HashSet();
        this.f3863o = interfaceC0036G;
        p009B2.C0064u c0064u = (p009B2.C0064u) interfaceC0036G;
        this.f3861m = new p009B2.InterfaceC0035F[]{new p009B2.C0031B(c0064u.getBinaryMessenger()), new p008B1.C0026d(new p043K2.C0326b(c0064u.getBinaryMessenger()))};
        new p009B2.C0061r(c0064u.getBinaryMessenger()).f188m = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, U.g] */
    public C1061t(p079U.InterfaceC0743d[] interfaceC0743dArr) {
        this.f3860l = 16;
        p112c0.C1216O c1216o = new p112c0.C1216O();
        ?? obj = new java.lang.Object();
        obj.f2588c = 1.0f;
        obj.f2589d = 1.0f;
        p079U.C0741b c0741b = p079U.C0741b.f2552e;
        obj.f2590e = c0741b;
        obj.f2591f = c0741b;
        obj.f2592g = c0741b;
        obj.f2593h = c0741b;
        java.nio.ByteBuffer byteBuffer = p079U.InterfaceC0743d.f2557a;
        obj.f2596k = byteBuffer;
        obj.f2597l = byteBuffer.asShortBuffer();
        obj.f2598m = byteBuffer;
        obj.f2587b = -1;
        p079U.InterfaceC0743d[] interfaceC0743dArr2 = new p079U.InterfaceC0743d[interfaceC0743dArr.length + 2];
        this.f3861m = interfaceC0743dArr2;
        java.lang.System.arraycopy(interfaceC0743dArr, 0, interfaceC0743dArr2, 0, interfaceC0743dArr.length);
        this.f3862n = c1216o;
        this.f3863o = obj;
        interfaceC0743dArr2[interfaceC0743dArr.length] = c1216o;
        interfaceC0743dArr2[interfaceC0743dArr.length + 1] = obj;
    }

    public C1061t(int i4) {
        this.f3860l = i4;
        switch (i4) {
            case 9:
                this.f3863o = new java.util.ArrayList();
                this.f3861m = new p056O.C0479g(0);
                new java.util.ArrayList();
                new p046L1.C0363g(this);
                this.f3862n = new java.util.concurrent.atomic.AtomicInteger();
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                new java.util.ArrayList();
                p154k3.AbstractC1803h.m3779e(this, "fragmentManager");
                new java.util.concurrent.CopyOnWriteArrayList();
                new java.util.concurrent.CopyOnWriteArrayList();
                final int i5 = 0;
                new p006B.InterfaceC0018a(this) { // from class: O.e

                    /* renamed from: b */
                    public final /* synthetic */ android.support.v4.media.session.C1061t f1394b;

                    {
                        this.f1394b = this;
                    }

                    @Override // p006B.InterfaceC0018a
                    public final void accept(java.lang.Object obj) {
                        switch (i5) {
                            case 0:
                                android.support.v4.media.session.C1061t c1061t = this.f1394b;
                                c1061t.getClass();
                                c1061t.m2213W(false);
                                return;
                            case 1:
                                android.support.v4.media.session.C1061t c1061t2 = this.f1394b;
                                c1061t2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    c1061t2.m2214X(false);
                                    return;
                                }
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                        }
                    }
                };
                final int i6 = 1;
                new p006B.InterfaceC0018a(this) { // from class: O.e

                    /* renamed from: b */
                    public final /* synthetic */ android.support.v4.media.session.C1061t f1394b;

                    {
                        this.f1394b = this;
                    }

                    @Override // p006B.InterfaceC0018a
                    public final void accept(java.lang.Object obj) {
                        switch (i6) {
                            case 0:
                                android.support.v4.media.session.C1061t c1061t = this.f1394b;
                                c1061t.getClass();
                                c1061t.m2213W(false);
                                return;
                            case 1:
                                android.support.v4.media.session.C1061t c1061t2 = this.f1394b;
                                c1061t2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    c1061t2.m2214X(false);
                                    return;
                                }
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                        }
                    }
                };
                final int i7 = 2;
                new p006B.InterfaceC0018a(this) { // from class: O.e

                    /* renamed from: b */
                    public final /* synthetic */ android.support.v4.media.session.C1061t f1394b;

                    {
                        this.f1394b = this;
                    }

                    @Override // p006B.InterfaceC0018a
                    public final void accept(java.lang.Object obj) {
                        switch (i7) {
                            case 0:
                                android.support.v4.media.session.C1061t c1061t = this.f1394b;
                                c1061t.getClass();
                                c1061t.m2213W(false);
                                return;
                            case 1:
                                android.support.v4.media.session.C1061t c1061t2 = this.f1394b;
                                c1061t2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    c1061t2.m2214X(false);
                                    return;
                                }
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                        }
                    }
                };
                final int i8 = 3;
                new p006B.InterfaceC0018a(this) { // from class: O.e

                    /* renamed from: b */
                    public final /* synthetic */ android.support.v4.media.session.C1061t f1394b;

                    {
                        this.f1394b = this;
                    }

                    @Override // p006B.InterfaceC0018a
                    public final void accept(java.lang.Object obj) {
                        switch (i8) {
                            case 0:
                                android.support.v4.media.session.C1061t c1061t = this.f1394b;
                                c1061t.getClass();
                                c1061t.m2213W(false);
                                return;
                            case 1:
                                android.support.v4.media.session.C1061t c1061t2 = this.f1394b;
                                c1061t2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    c1061t2.m2214X(false);
                                    return;
                                }
                                return;
                            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f1394b.getClass();
                                throw null;
                        }
                    }
                };
                new java.util.ArrayDeque();
                new p024F.RunnableC0199b(5, this);
                return;
            default:
                this.f3861m = new java.util.concurrent.ConcurrentLinkedQueue();
                return;
        }
    }

    public C1061t(android.support.v4.media.session.C1061t c1061t, p047L2.InterfaceC0379i interfaceC0379i) {
        this.f3860l = 6;
        this.f3863o = c1061t;
        this.f3862n = new java.util.concurrent.atomic.AtomicReference(null);
        this.f3861m = interfaceC0379i;
    }

    public C1061t(android.content.Context context, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3860l = 15;
        if (mediaSessionCompat$Token != null) {
            this.f3863o = java.util.Collections.synchronizedSet(new java.util.HashSet());
            this.f3862n = mediaSessionCompat$Token;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.f3861m = new android.support.v4.media.session.C1049h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f3861m = new android.support.v4.media.session.C1049h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("sessionToken must not be null");
    }

    public C1061t(p047L2.InterfaceC0376f interfaceC0376f, android.content.Context context, p025F1.C0215g c0215g) {
        this.f3860l = 11;
        p154k3.AbstractC1803h.m3779e(interfaceC0376f, "messenger");
        p154k3.AbstractC1803h.m3779e(context, "context");
        this.f3861m = interfaceC0376f;
        this.f3862n = context;
        this.f3863o = c0215g;
        try {
            p071R2.InterfaceC0601g.f1878b.getClass();
            p071R2.C0600f.m1127b(interfaceC0376f, this, "shared_preferences");
        } catch (java.lang.Exception e4) {
            android.util.Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    public C1061t(p206w0.C2305a c2305a) {
        this.f3860l = 28;
        this.f3861m = c2305a;
        this.f3862n = new java.util.concurrent.locks.ReentrantLock();
        this.f3863o = new java.util.WeakHashMap();
    }

    public C1061t(com.ryanheise.audioservice.AudioService audioService) {
        android.content.ComponentName componentName;
        this.f3860l = 0;
        this.f3863o = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty("media-session")) {
            int i4 = com.ryanheise.audioservice.MediaButtonReceiver.f4980a;
            android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(audioService.getPackageName());
            java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers = audioService.getPackageManager().queryBroadcastReceivers(intent, 0);
            android.app.PendingIntent pendingIntent = null;
            if (queryBroadcastReceivers.size() == 1) {
                android.content.pm.ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    android.util.Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                android.util.Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null) {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = android.app.PendingIntent.getBroadcast(audioService, 0, intent2, android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i5 = android.os.Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                this.f3861m = new android.support.v4.media.session.C1056o(audioService);
            } else if (i5 >= 28) {
                this.f3861m = new android.support.v4.media.session.C1056o(audioService);
            } else {
                this.f3861m = new android.support.v4.media.session.C1056o(audioService);
            }
            ((android.support.v4.media.session.C1056o) this.f3861m).m2192e(new android.support.v4.media.session.AbstractC1054m(), new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper()));
            ((android.support.v4.media.session.C1056o) this.f3861m).f3844a.setMediaButtonReceiver(pendingIntent);
            this.f3862n = new android.support.v4.media.session.C1061t(audioService, ((android.support.v4.media.session.C1056o) this.f3861m).f3846c);
            if (f3858p == 0) {
                f3858p = (int) (android.util.TypedValue.applyDimension(1, 320.0f, audioService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("tag must not be null or empty");
    }

    public C1061t(java.util.ArrayDeque arrayDeque, java.io.BufferedReader bufferedReader) {
        this.f3860l = 20;
        this.f3862n = arrayDeque;
        this.f3861m = bufferedReader;
    }
}
