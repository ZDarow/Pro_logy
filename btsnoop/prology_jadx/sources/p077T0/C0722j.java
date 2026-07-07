package p077T0;

/* renamed from: T0.j */
/* loaded from: classes.dex */
public final class C0722j implements p123e1.InterfaceC1320B {

    /* renamed from: l */
    public int f2502l;

    /* renamed from: m */
    public final java.lang.Object f2503m;

    /* renamed from: n */
    public final java.lang.Object f2504n;

    /* renamed from: o */
    public final java.lang.Object f2505o;

    /* renamed from: p */
    public java.lang.Object f2506p;

    public C0722j(p009B2.AbstractActivityC0047d abstractActivityC0047d, p008B1.C0026d c0026d, p009B2.AbstractActivityC0047d abstractActivityC0047d2) {
        io.flutter.plugin.platform.C1590m c1590m = new io.flutter.plugin.platform.C1590m(1, this);
        this.f2503m = abstractActivityC0047d;
        this.f2504n = c0026d;
        c0026d.f100n = c1590m;
        this.f2505o = abstractActivityC0047d2;
        this.f2502l = 1280;
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: a */
    public void mo1314a(p086W.C0803w c0803w, p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
    }

    /* renamed from: b */
    public void m1315b(p043K2.C0329e c0329e) {
        android.view.Window window = ((p009B2.AbstractActivityC0047d) this.f2503m).getWindow();
        window.getDecorView();
        int i4 = android.os.Build.VERSION.SDK_INT;
        p080U1.AbstractC0748a c0107q = i4 >= 35 ? new p011C.C0107Q(window) : i4 >= 30 ? new p011C.C0107Q(window) : new p011C.C0106P(window);
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (i5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i6 = c0329e.f996l;
        if (i6 != 0) {
            int m781b = p044L.AbstractC0352j.m781b(i6);
            if (m781b == 0) {
                c0107q.mo399B(false);
            } else if (m781b == 1) {
                c0107q.mo399B(true);
            }
        }
        java.lang.Integer num = (java.lang.Integer) c0329e.f998n;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        java.lang.Boolean bool = (java.lang.Boolean) c0329e.f1001q;
        if (bool != null && i5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        int i7 = c0329e.f997m;
        if (i7 != 0) {
            int m781b2 = p044L.AbstractC0352j.m781b(i7);
            if (m781b2 == 0) {
                c0107q.mo398A(false);
            } else if (m781b2 == 1) {
                c0107q.mo398A(true);
            }
        }
        java.lang.Integer num2 = (java.lang.Integer) c0329e.f999o;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        java.lang.Integer num3 = (java.lang.Integer) c0329e.f1000p;
        if (num3 != null && i5 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) c0329e.f1002r;
        if (bool2 != null && i5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2506p = c0329e;
    }

    /* renamed from: c */
    public void m1316c() {
        ((p009B2.AbstractActivityC0047d) this.f2503m).getWindow().getDecorView().setSystemUiVisibility(this.f2502l);
        p043K2.C0329e c0329e = (p043K2.C0329e) this.f2506p;
        if (c0329e != null) {
            m1315b(c0329e);
        }
    }

    @Override // p123e1.InterfaceC1320B
    /* renamed from: d */
    public void mo1317d(p086W.C0798r c0798r) {
        p086W.C0803w c0803w;
        android.util.SparseBooleanArray sparseBooleanArray;
        android.util.SparseArray sparseArray;
        p086W.C0803w c0803w2;
        int i4;
        char c4;
        int i5;
        android.util.SparseArray sparseArray2;
        int i6;
        int i7;
        if (c0798r.m1559u() != 2) {
            return;
        }
        p123e1.C1323E c1323e = (p123e1.C1323E) this.f2506p;
        int i8 = c1323e.f5307a;
        int i9 = 0;
        java.util.List list = c1323e.f5309c;
        if (i8 == 1 || i8 == 2 || c1323e.f5320n == 1) {
            c0803w = (p086W.C0803w) list.get(0);
        } else {
            c0803w = new p086W.C0803w(((p086W.C0803w) list.get(0)).m1576d());
            list.add(c0803w);
        }
        if ((c0798r.m1559u() & 128) == 0) {
            return;
        }
        c0798r.m1538H(1);
        int m1531A = c0798r.m1531A();
        int i10 = 3;
        c0798r.m1538H(3);
        p086W.C0797q c0797q = (p086W.C0797q) this.f2503m;
        c0798r.m1544f(c0797q.f2781d, 0, 2);
        c0797q.m1526q(0);
        c0797q.m1529t(3);
        c1323e.f5326t = c0797q.m1518i(13);
        c0798r.m1544f(c0797q.f2781d, 0, 2);
        c0797q.m1526q(0);
        c0797q.m1529t(4);
        c0798r.m1538H(c0797q.m1518i(12));
        p123e1.C1332f c1332f = c1323e.f5312f;
        int i11 = c1323e.f5307a;
        if (i11 == 2 && c1323e.f5324r == null) {
            p123e1.InterfaceC1326H m3095a = c1332f.m3095a(21, new p086W.C0796p(21, null, 0, null, p086W.AbstractC0805y.f2806f));
            c1323e.f5324r = m3095a;
            if (m3095a != null) {
                m3095a.mo3079a(c0803w, c1323e.f5319m, new p123e1.C1325G(m1531A, 21, 8192));
            }
        }
        android.util.SparseArray sparseArray3 = (android.util.SparseArray) this.f2504n;
        sparseArray3.clear();
        android.util.SparseIntArray sparseIntArray = (android.util.SparseIntArray) this.f2505o;
        sparseIntArray.clear();
        int m1539a = c0798r.m1539a();
        while (true) {
            sparseBooleanArray = c1323e.f5315i;
            if (m1539a <= 0) {
                break;
            }
            c0798r.m1544f(c0797q.f2781d, i9, 5);
            c0797q.m1526q(i9);
            int m1518i = c0797q.m1518i(8);
            c0797q.m1529t(i10);
            int m1518i2 = c0797q.m1518i(13);
            c0797q.m1529t(4);
            int m1518i3 = c0797q.m1518i(12);
            int i12 = c0798r.f2787b;
            int i13 = i12 + m1518i3;
            int i14 = -1;
            java.lang.String str = null;
            java.util.ArrayList arrayList = null;
            int i15 = 0;
            p086W.C0797q c0797q2 = c0797q;
            while (c0798r.f2787b < i13) {
                int m1559u = c0798r.m1559u();
                int m1559u2 = c0798r.f2787b + c0798r.m1559u();
                if (m1559u2 > i13) {
                    break;
                }
                p086W.C0803w c0803w3 = c0803w;
                if (m1559u == 5) {
                    long m1561w = c0798r.m1561w();
                    if (m1561w == 1094921523) {
                        i14 = 129;
                    } else if (m1561w == 1161904947) {
                        i14 = 135;
                    } else {
                        if (m1561w != 1094921524) {
                            if (m1561w == 1212503619) {
                                i14 = 36;
                            }
                        }
                        i14 = 172;
                    }
                    sparseArray2 = sparseArray3;
                    i6 = m1531A;
                    i7 = m1518i2;
                } else if (m1559u == 106) {
                    sparseArray2 = sparseArray3;
                    i6 = m1531A;
                    i7 = m1518i2;
                    i14 = 129;
                } else if (m1559u == 122) {
                    sparseArray2 = sparseArray3;
                    i6 = m1531A;
                    i7 = m1518i2;
                    i14 = 135;
                } else if (m1559u == 127) {
                    int m1559u3 = c0798r.m1559u();
                    if (m1559u3 != 21) {
                        if (m1559u3 == 14) {
                            i14 = 136;
                        } else if (m1559u3 == 33) {
                            i14 = 139;
                        }
                        sparseArray2 = sparseArray3;
                        i6 = m1531A;
                        i7 = m1518i2;
                    }
                    i14 = 172;
                    sparseArray2 = sparseArray3;
                    i6 = m1531A;
                    i7 = m1518i2;
                } else {
                    if (m1559u == 123) {
                        sparseArray2 = sparseArray3;
                        i14 = 138;
                    } else if (m1559u == 10) {
                        java.lang.String trim = c0798r.m1557s(3, p124e2.AbstractC1356d.f5630c).trim();
                        i15 = c0798r.m1559u();
                        sparseArray2 = sparseArray3;
                        str = trim;
                    } else {
                        if (m1559u == 89) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (c0798r.f2787b < m1559u2) {
                                java.lang.String trim2 = c0798r.m1557s(3, p124e2.AbstractC1356d.f5630c).trim();
                                c0798r.m1559u();
                                android.util.SparseArray sparseArray4 = sparseArray3;
                                byte[] bArr = new byte[4];
                                c0798r.m1544f(bArr, 0, 4);
                                arrayList2.add(new p123e1.C1324F(trim2, bArr));
                                sparseArray3 = sparseArray4;
                                m1531A = m1531A;
                                m1518i2 = m1518i2;
                            }
                            sparseArray2 = sparseArray3;
                            i6 = m1531A;
                            i7 = m1518i2;
                            arrayList = arrayList2;
                            i14 = 89;
                        } else {
                            sparseArray2 = sparseArray3;
                            i6 = m1531A;
                            i7 = m1518i2;
                            if (m1559u == 111) {
                                i14 = 257;
                            }
                        }
                        c0798r.m1538H(m1559u2 - c0798r.f2787b);
                        sparseArray3 = sparseArray2;
                        c0803w = c0803w3;
                        m1531A = i6;
                        m1518i2 = i7;
                    }
                    i6 = m1531A;
                    i7 = m1518i2;
                }
                c0798r.m1538H(m1559u2 - c0798r.f2787b);
                sparseArray3 = sparseArray2;
                c0803w = c0803w3;
                m1531A = i6;
                m1518i2 = i7;
            }
            android.util.SparseArray sparseArray5 = sparseArray3;
            p086W.C0803w c0803w4 = c0803w;
            int i16 = m1531A;
            int i17 = m1518i2;
            c0798r.m1537G(i13);
            p086W.C0796p c0796p = new p086W.C0796p(i14, str, i15, arrayList, java.util.Arrays.copyOfRange(c0798r.f2786a, i12, i13));
            if (m1518i == 6 || m1518i == 5) {
                m1518i = i14;
            }
            m1539a -= m1518i3 + 5;
            int i18 = i11 == 2 ? m1518i : i17;
            if (sparseBooleanArray.get(i18)) {
                sparseArray3 = sparseArray5;
                c4 = 21;
            } else {
                c4 = 21;
                p123e1.InterfaceC1326H m3095a2 = (i11 == 2 && m1518i == 21) ? c1323e.f5324r : c1332f.m3095a(m1518i, c0796p);
                if (i11 == 2) {
                    i5 = i17;
                    if (i5 >= sparseIntArray.get(i18, 8192)) {
                        sparseArray3 = sparseArray5;
                    }
                } else {
                    i5 = i17;
                }
                sparseIntArray.put(i18, i5);
                sparseArray3 = sparseArray5;
                sparseArray3.put(i18, m3095a2);
            }
            c0797q = c0797q2;
            c0803w = c0803w4;
            m1531A = i16;
            i9 = 0;
            i10 = 3;
        }
        p086W.C0803w c0803w5 = c0803w;
        int i19 = m1531A;
        int size = sparseIntArray.size();
        int i20 = 0;
        while (true) {
            sparseArray = c1323e.f5314h;
            if (i20 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i20);
            int valueAt = sparseIntArray.valueAt(i20);
            sparseBooleanArray.put(keyAt, true);
            c1323e.f5316j.put(valueAt, true);
            p123e1.InterfaceC1326H interfaceC1326H = (p123e1.InterfaceC1326H) sparseArray3.valueAt(i20);
            if (interfaceC1326H != null) {
                if (interfaceC1326H != c1323e.f5324r) {
                    p215y0.InterfaceC2405q interfaceC2405q = c1323e.f5319m;
                    i4 = i19;
                    p123e1.C1325G c1325g = new p123e1.C1325G(i4, keyAt, 8192);
                    c0803w2 = c0803w5;
                    interfaceC1326H.mo3079a(c0803w2, interfaceC2405q, c1325g);
                } else {
                    c0803w2 = c0803w5;
                    i4 = i19;
                }
                sparseArray.put(valueAt, interfaceC1326H);
            } else {
                c0803w2 = c0803w5;
                i4 = i19;
            }
            i20++;
            c0803w5 = c0803w2;
            i19 = i4;
        }
        if (i11 == 2) {
            if (!c1323e.f5321o) {
                c1323e.f5319m.mo637s();
                c1323e.f5320n = 0;
                c1323e.f5321o = true;
            }
            return;
        }
        sparseArray.remove(this.f2502l);
        int i21 = i11 == 1 ? 0 : c1323e.f5320n - 1;
        c1323e.f5320n = i21;
        if (i21 == 0) {
            c1323e.f5319m.mo637s();
            c1323e.f5321o = true;
        }
    }

    public C0722j(p215y0.C2412x c2412x, p206w0.C2305a c2305a, byte[] bArr, p078T2.C0737n[] c0737nArr, int i4) {
        this.f2503m = c2412x;
        this.f2504n = c2305a;
        this.f2505o = bArr;
        this.f2506p = c0737nArr;
        this.f2502l = i4;
    }

    public C0722j(p123e1.C1323E c1323e, int i4) {
        this.f2506p = c1323e;
        this.f2503m = new p086W.C0797q(new byte[5], 5);
        this.f2504n = new android.util.SparseArray();
        this.f2505o = new android.util.SparseIntArray();
        this.f2502l = i4;
    }
}
