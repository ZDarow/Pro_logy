package p078T2;

/* renamed from: T2.p */
/* loaded from: classes.dex */
public class C0739p implements p034H2.InterfaceC0248b {

    /* renamed from: m */
    public p034H2.C0247a f2545m;

    /* renamed from: l */
    public final android.util.LongSparseArray f2544l = new android.util.LongSparseArray();

    /* renamed from: n */
    public final p078T2.C0737n f2546n = new java.lang.Object();

    /* renamed from: o */
    public java.lang.Long f2547o = Long.MAX_VALUE;

    /* renamed from: e */
    public static void m1328e(p047L2.InterfaceC0376f interfaceC0376f, final p078T2.C0739p c0739p) {
        p078T2.C0729f c0729f = p078T2.C0729f.f2527d;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", c0729f, null);
        if (c0739p != null) {
            final int i4 = 0;
            c0291m.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i4) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i5 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i5)).mo1323b();
                                i5++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", c0729f, null);
        if (c0739p != null) {
            final int i5 = 3;
            c0291m2.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i5) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m2.m701r(null);
        }
        p035I.C0291m c0291m3 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", c0729f, null);
        if (c0739p != null) {
            final int i6 = 4;
            c0291m3.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i6) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m3.m701r(null);
        }
        p035I.C0291m c0291m4 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", c0729f, null);
        if (c0739p != null) {
            final int i7 = 5;
            c0291m4.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i7) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m4.m701r(null);
        }
        p035I.C0291m c0291m5 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", c0729f, null);
        if (c0739p != null) {
            final int i8 = 6;
            c0291m5.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i8) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m5.m701r(null);
        }
        p035I.C0291m c0291m6 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", c0729f, null);
        if (c0739p != null) {
            final int i9 = 7;
            c0291m6.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i9) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m6.m701r(null);
        }
        p035I.C0291m c0291m7 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", c0729f, null);
        if (c0739p != null) {
            final int i10 = 8;
            c0291m7.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i10) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m7.m701r(null);
        }
        p035I.C0291m c0291m8 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", c0729f, null);
        if (c0739p != null) {
            final int i11 = 9;
            c0291m8.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i11) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m8.m701r(null);
        }
        p035I.C0291m c0291m9 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", c0729f, null);
        if (c0739p != null) {
            final int i12 = 10;
            c0291m9.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i12) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m9.m701r(null);
        }
        p035I.C0291m c0291m10 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", c0729f, null);
        if (c0739p != null) {
            final int i13 = 1;
            c0291m10.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i13) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        } else {
            c0291m10.m701r(null);
        }
        p035I.C0291m c0291m11 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", c0729f, null);
        if (c0739p == null) {
            c0291m11.m701r(null);
        } else {
            final int i14 = 2;
            c0291m11.m701r(new p047L2.InterfaceC0372b(c0739p) { // from class: T2.d

                /* renamed from: m */
                public final /* synthetic */ p078T2.C0739p f2520m;

                {
                    this.f2520m = c0739p;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    android.util.LongSparseArray longSparseArray;
                    switch (i14) {
                        case 0:
                            p078T2.C0739p c0739p2 = this.f2520m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    longSparseArray = c0739p2.f2544l;
                                } catch (java.lang.Throwable th) {
                                    arrayList = p101a.AbstractC0936a.m1796d0(th);
                                }
                                if (i52 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c0026d.mo106e(arrayList);
                                    return;
                                }
                                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i52)).mo1323b();
                                i52++;
                            }
                        case 1:
                            p078T2.C0739p c0739p3 = this.f2520m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.Long l4 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p3.getClass();
                                p021E0.AbstractC0193e abstractC0193e = (p021E0.AbstractC0193e) c0739p3.m1330c(l4.longValue()).f2540c;
                                abstractC0193e.getClass();
                                ((p102a0.C0944H) abstractC0193e).m1837J(false);
                                arrayList2.add(0, null);
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1796d0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p078T2.C0739p c0739p4 = this.f2520m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                c0739p4.f2546n.f2542a = ((java.lang.Boolean) ((java.util.ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p101a.AbstractC0936a.m1796d0(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p078T2.C0739p c0739p5 = this.f2520m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0739p5.m1329a((p078T2.C0728e) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p101a.AbstractC0936a.m1796d0(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p078T2.C0739p c0739p6 = this.f2520m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.Long l5 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p6.getClass();
                                c0739p6.m1330c(l5.longValue()).mo1323b();
                                c0739p6.f2544l.remove(l5.longValue());
                                arrayList5.add(0, null);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p101a.AbstractC0936a.m1796d0(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p078T2.C0739p c0739p7 = this.f2520m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            java.lang.Long l6 = (java.lang.Long) arrayList7.get(0);
                            java.lang.Boolean bool = (java.lang.Boolean) arrayList7.get(1);
                            try {
                                c0739p7.getClass();
                                ((p102a0.C0944H) c0739p7.m1330c(l6.longValue()).f2540c).m1839L(bool.booleanValue() ? 2 : 0);
                                arrayList6.add(0, null);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p101a.AbstractC0936a.m1796d0(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p078T2.C0739p c0739p8 = this.f2520m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.Long l7 = (java.lang.Long) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0739p8.getClass();
                                ((p102a0.C0944H) c0739p8.m1330c(l7.longValue()).f2540c).m1842O((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, d4.doubleValue())));
                                arrayList8.add(0, null);
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p101a.AbstractC0936a.m1796d0(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p078T2.C0739p c0739p9 = this.f2520m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            java.lang.Long l8 = (java.lang.Long) arrayList11.get(0);
                            java.lang.Double d5 = (java.lang.Double) arrayList11.get(1);
                            try {
                                c0739p9.getClass();
                                ((p102a0.C0944H) c0739p9.m1330c(l8.longValue()).f2540c).m1838K(new p076T.C0668K((float) d5.doubleValue()));
                                arrayList10.add(0, null);
                            } catch (java.lang.Throwable th8) {
                                arrayList10 = p101a.AbstractC0936a.m1796d0(th8);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p078T2.C0739p c0739p10 = this.f2520m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.Long l9 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p10.getClass();
                                p021E0.AbstractC0193e abstractC0193e2 = (p021E0.AbstractC0193e) c0739p10.m1330c(l9.longValue()).f2540c;
                                abstractC0193e2.getClass();
                                ((p102a0.C0944H) abstractC0193e2).m1837J(true);
                                arrayList12.add(0, null);
                            } catch (java.lang.Throwable th9) {
                                arrayList12 = p101a.AbstractC0936a.m1796d0(th9);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case 9:
                            p078T2.C0739p c0739p11 = this.f2520m;
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.Long l10 = (java.lang.Long) ((java.util.ArrayList) obj).get(0);
                            try {
                                c0739p11.getClass();
                                p078T2.AbstractC0735l m1330c = c0739p11.m1330c(l10.longValue());
                                p102a0.InterfaceC0994s interfaceC0994s = m1330c.f2540c;
                                long m1855r = ((p102a0.C0944H) interfaceC0994s).m1855r();
                                m1330c.f2538a.m1324a(((p102a0.C0944H) interfaceC0994s).m1850m());
                                arrayList13.add(0, java.lang.Long.valueOf(m1855r));
                            } catch (java.lang.Throwable th10) {
                                arrayList13 = p101a.AbstractC0936a.m1796d0(th10);
                            }
                            c0026d.mo106e(arrayList13);
                            return;
                        default:
                            p078T2.C0739p c0739p12 = this.f2520m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            java.lang.Long l11 = (java.lang.Long) arrayList15.get(0);
                            java.lang.Long l12 = (java.lang.Long) arrayList15.get(1);
                            try {
                                c0739p12.getClass();
                                p078T2.AbstractC0735l m1330c2 = c0739p12.m1330c(l11.longValue());
                                long intValue = l12.intValue();
                                p021E0.AbstractC0193e abstractC0193e3 = (p021E0.AbstractC0193e) m1330c2.f2540c;
                                abstractC0193e3.getClass();
                                abstractC0193e3.mo558k(((p102a0.C0944H) abstractC0193e3).m1854q(), intValue, false);
                                arrayList14.add(0, null);
                            } catch (java.lang.Throwable th11) {
                                arrayList14 = p101a.AbstractC0936a.m1796d0(th11);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [V2.b, T2.l, io.flutter.view.o] */
    /* renamed from: a */
    public final java.lang.Long m1329a(p078T2.C0728e c0728e) {
        p021E0.AbstractC0193e c0725b;
        p078T2.AbstractC0735l abstractC0735l;
        long j4;
        java.lang.String m611a;
        int i4 = 2;
        java.lang.String str = c0728e.f2521a;
        if (str != null) {
            java.lang.String str2 = c0728e.f2523c;
            if (str2 != null) {
                p026F2.C0229f c0229f = ((p078T2.C0738o) this.f2545m.f723p).f2543a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("packages");
                java.lang.String str3 = java.io.File.separator;
                sb.append(str3);
                sb.append(str2);
                sb.append(str3);
                sb.append(str);
                m611a = c0229f.m611a(sb.toString());
            } else {
                m611a = ((p078T2.C0738o) this.f2545m.f722o).f2543a.m611a(str);
            }
            java.lang.String m153l = p009B2.AbstractC0051h.m153l("asset:///", m611a);
            if (!m153l.startsWith("asset:///")) {
                throw new java.lang.IllegalArgumentException("assetUrl must start with 'asset:///'");
            }
            c0725b = new p078T2.C0726c(m153l, 0);
        } else if (c0728e.f2522b.startsWith("rtsp://")) {
            java.lang.String str4 = c0728e.f2522b;
            if (!str4.startsWith("rtsp://")) {
                throw new java.lang.IllegalArgumentException("rtspUrl must start with 'rtsp://'");
            }
            c0725b = new p078T2.C0726c(str4, 1);
        } else {
            java.lang.String str5 = c0728e.f2524d;
            if (str5 != null) {
                char c4 = 65535;
                switch (str5.hashCode()) {
                    case 3680:
                        if (str5.equals("ss")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 103407:
                        if (str5.equals("hls")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 3075986:
                        if (str5.equals("dash")) {
                            c4 = 2;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 1:
                        i4 = 4;
                        break;
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 3;
                        break;
                }
                c0725b = new p078T2.C0725b(c0728e.f2522b, i4, new java.util.HashMap(c0728e.f2525e));
            }
            i4 = 1;
            c0725b = new p078T2.C0725b(c0728e.f2522b, i4, new java.util.HashMap(c0728e.f2525e));
        }
        if (c0728e.f2526f == p078T2.EnumC0731h.f2529m) {
            java.lang.Long l4 = this.f2547o;
            this.f2547o = java.lang.Long.valueOf(l4.longValue() - 1);
            j4 = l4.longValue();
            p034H2.C0247a c0247a = this.f2545m;
            android.content.Context context = (android.content.Context) c0247a.f719l;
            android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t((p047L2.InterfaceC0376f) c0247a.f720m, "flutter.io/videoPlayer/videoEvents" + j4);
            p078T2.C0734k c0734k = new p078T2.C0734k();
            c1061t.m2206B0(new p078T2.C0736m(c0734k));
            abstractC0735l = new p078T2.AbstractC0735l(new p078T2.C0736m(c0734k), c0725b.mo554g(), this.f2546n, null, new p081U2.C0754d(context, c0725b, 0));
        } else {
            io.flutter.embedding.engine.renderer.C1561j c1561j = (io.flutter.embedding.engine.renderer.C1561j) this.f2545m.f721n;
            c1561j.getClass();
            io.flutter.view.TextureRegistry$SurfaceProducer m3446c = c1561j.m3446c(1);
            long mo3441id = m3446c.mo3441id();
            p034H2.C0247a c0247a2 = this.f2545m;
            android.content.Context context2 = (android.content.Context) c0247a2.f719l;
            android.support.v4.media.session.C1061t c1061t2 = new android.support.v4.media.session.C1061t((p047L2.InterfaceC0376f) c0247a2.f720m, "flutter.io/videoPlayer/videoEvents" + mo3441id);
            p078T2.C0734k c0734k2 = new p078T2.C0734k();
            c1061t2.m2206B0(new p078T2.C0736m(c0734k2));
            ?? abstractC0735l2 = new p078T2.AbstractC0735l(new p078T2.C0736m(c0734k2), c0725b.mo554g(), this.f2546n, m3446c, new p081U2.C0754d(context2, c0725b, 1));
            abstractC0735l2.f2731d = true;
            m3446c.setCallback(abstractC0735l2);
            android.view.Surface surface = m3446c.getSurface();
            ((p102a0.C0944H) abstractC0735l2.f2540c).m1841N(surface);
            abstractC0735l2.f2731d = surface == null;
            abstractC0735l = abstractC0735l2;
            j4 = mo3441id;
        }
        this.f2544l.put(j4, abstractC0735l);
        return java.lang.Long.valueOf(j4);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        if (this.f2545m == null) {
            android.util.Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        p034H2.C0247a c0247a2 = this.f2545m;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        c0247a2.getClass();
        m1328e(interfaceC0376f, null);
        this.f2545m = null;
        int i4 = 0;
        while (true) {
            android.util.LongSparseArray longSparseArray = this.f2544l;
            if (i4 >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((p078T2.AbstractC0735l) longSparseArray.valueAt(i4)).mo1323b();
                i4++;
            }
        }
    }

    /* renamed from: c */
    public final p078T2.AbstractC0735l m1330c(long j4) {
        android.util.LongSparseArray longSparseArray = this.f2544l;
        p078T2.AbstractC0735l abstractC0735l = (p078T2.AbstractC0735l) longSparseArray.get(j4);
        if (abstractC0735l != null) {
            return abstractC0735l;
        }
        java.lang.String str = "No player found with playerId <" + j4 + ">";
        if (longSparseArray.size() == 0) {
            str = str + " and no active players created by the plugin.";
        }
        throw new java.lang.IllegalStateException(str);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        android.support.v4.media.session.C1061t m2201n0 = android.support.v4.media.session.C1061t.m2201n0();
        android.content.Context context = (android.content.Context) c0247a.f719l;
        p026F2.C0229f c0229f = (p026F2.C0229f) m2201n0.f3861m;
        p078T2.C0738o c0738o = new p078T2.C0738o(c0229f);
        p078T2.C0738o c0738o2 = new p078T2.C0738o(c0229f);
        io.flutter.embedding.engine.renderer.C1561j c1561j = (io.flutter.embedding.engine.renderer.C1561j) c0247a.f721n;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        this.f2545m = new p034H2.C0247a(context, interfaceC0376f, c0738o, c0738o2, c1561j);
        m1328e(interfaceC0376f, this);
        android.util.LongSparseArray longSparseArray = this.f2544l;
        java.util.Objects.requireNonNull(longSparseArray);
        p081U2.C0752b c0752b = new p081U2.C0752b(new p009B2.C0067x(9, longSparseArray));
        java.util.HashMap hashMap = (java.util.HashMap) ((io.flutter.plugin.platform.C1590m) c0247a.f723p).f6591m;
        if (hashMap.containsKey("plugins.flutter.dev/video_player_android")) {
            return;
        }
        hashMap.put("plugins.flutter.dev/video_player_android", c0752b);
    }
}
