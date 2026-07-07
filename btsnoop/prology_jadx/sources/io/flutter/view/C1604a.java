package io.flutter.view;

/* renamed from: io.flutter.view.a */
/* loaded from: classes.dex */
public final class C1604a implements p013C2.InterfaceC0142g, p013C2.InterfaceC0143h {

    /* renamed from: a */
    public final /* synthetic */ java.lang.Object f6662a;

    public /* synthetic */ C1604a(java.lang.Object obj) {
        this.f6662a = obj;
    }

    /* renamed from: a */
    public void m3520a(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        int i4;
        io.flutter.plugin.platform.InterfaceC1586i interfaceC1586i;
        java.util.ArrayList arrayList;
        int i5;
        io.flutter.view.C1609f c1609f;
        int i6;
        int i7;
        io.flutter.view.C1609f c1609f2;
        java.lang.String str;
        float f4;
        float f5;
        android.view.SurfaceView mo1708K;
        java.lang.Integer num;
        io.flutter.view.C1610g c1610g;
        android.view.SurfaceView mo1708K2;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        io.flutter.view.C1610g c1610g2 = (io.flutter.view.C1610g) this.f6662a;
        c1610g2.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i4 = 14;
            interfaceC1586i = c1610g2.f6756e;
            if (!hasRemaining) {
                break;
            }
            io.flutter.view.C1609f m3561c = c1610g2.m3561c(byteBuffer.getInt());
            m3561c.f6701E = true;
            m3561c.f6707K = m3561c.f6742r;
            m3561c.f6708L = m3561c.f6740p;
            m3561c.f6702F = m3561c.f6727c;
            m3561c.f6703G = m3561c.f6728d;
            m3561c.f6704H = m3561c.f6731g;
            m3561c.f6705I = m3561c.f6732h;
            m3561c.f6706J = m3561c.f6736l;
            m3561c.f6727c = byteBuffer.getLong();
            m3561c.f6728d = byteBuffer.getInt();
            m3561c.f6729e = byteBuffer.getInt();
            m3561c.f6730f = byteBuffer.getInt();
            m3561c.f6731g = byteBuffer.getInt();
            m3561c.f6732h = byteBuffer.getInt();
            m3561c.f6733i = byteBuffer.getInt();
            m3561c.f6734j = byteBuffer.getInt();
            m3561c.f6735k = byteBuffer.getInt();
            m3561c.f6736l = byteBuffer.getFloat();
            m3561c.f6737m = byteBuffer.getFloat();
            m3561c.f6738n = byteBuffer.getFloat();
            m3561c.f6739o = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6740p = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6741q = io.flutter.view.C1609f.m3524C(byteBuffer, byteBufferArr);
            m3561c.f6742r = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6743s = io.flutter.view.C1609f.m3524C(byteBuffer, byteBufferArr);
            m3561c.f6744t = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6745u = io.flutter.view.C1609f.m3524C(byteBuffer, byteBufferArr);
            m3561c.f6746v = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6747w = io.flutter.view.C1609f.m3524C(byteBuffer, byteBufferArr);
            m3561c.f6748x = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6749y = io.flutter.view.C1609f.m3524C(byteBuffer, byteBufferArr);
            m3561c.f6750z = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6697A = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6698B = io.flutter.view.C1610g.m3558d(byteBuffer, strArr);
            m3561c.f6699C = byteBuffer.getInt();
            byteBuffer.getInt();
            m3561c.f6709M = byteBuffer.getFloat();
            m3561c.f6710N = byteBuffer.getFloat();
            m3561c.f6711O = byteBuffer.getFloat();
            m3561c.f6712P = byteBuffer.getFloat();
            if (m3561c.f6713Q == null) {
                m3561c.f6713Q = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                m3561c.f6713Q[i8] = byteBuffer.getFloat();
            }
            m3561c.f6720X = true;
            m3561c.f6722Z = true;
            int i9 = byteBuffer.getInt();
            java.util.ArrayList arrayList3 = m3561c.f6715S;
            arrayList3.clear();
            java.util.ArrayList arrayList4 = m3561c.f6716T;
            arrayList4.clear();
            int i10 = 0;
            while (true) {
                c1610g = m3561c.f6723a;
                if (i10 >= i9) {
                    break;
                }
                io.flutter.view.C1609f m3561c2 = c1610g.m3561c(byteBuffer.getInt());
                m3561c2.f6714R = m3561c;
                arrayList3.add(m3561c2);
                i10++;
            }
            for (int i11 = 0; i11 < i9; i11++) {
                io.flutter.view.C1609f m3561c3 = c1610g.m3561c(byteBuffer.getInt());
                m3561c3.f6714R = m3561c;
                arrayList4.add(m3561c3);
            }
            int i12 = byteBuffer.getInt();
            if (i12 == 0) {
                m3561c.f6717U = null;
            } else {
                java.util.ArrayList arrayList5 = m3561c.f6717U;
                if (arrayList5 == null) {
                    m3561c.f6717U = new java.util.ArrayList(i12);
                } else {
                    arrayList5.clear();
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    io.flutter.view.C1608e m3560b = c1610g.m3560b(byteBuffer.getInt());
                    int i14 = m3560b.f6694c;
                    if (i14 == 1) {
                        m3561c.f6718V = m3560b;
                    } else if (i14 == 2) {
                        m3561c.f6719W = m3560b;
                    } else {
                        m3561c.f6717U.add(m3560b);
                    }
                    m3561c.f6717U.add(m3560b);
                }
            }
            if (!m3561c.m3553D(14)) {
                if (m3561c.m3553D(6)) {
                    c1610g2.f6765n = m3561c;
                }
                if (m3561c.f6701E) {
                    arrayList2.add(m3561c);
                }
                int i15 = m3561c.f6733i;
                if (i15 != -1 && !interfaceC1586i.mo1726r(i15) && (mo1708K2 = interfaceC1586i.mo1708K(m3561c.f6733i)) != null) {
                    mo1708K2.setImportantForAccessibility(0);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = c1610g2.f6758g;
        io.flutter.view.C1609f c1609f3 = (io.flutter.view.C1609f) hashMap.get(0);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        if (c1609f3 != null) {
            float[] fArr = new float[16];
            android.opengl.Matrix.setIdentityM(fArr, 0);
            c1609f3.m3556H(fArr, hashSet, false);
            c1609f3.m3557z(arrayList6);
        }
        java.util.Iterator it = arrayList6.iterator();
        io.flutter.view.C1609f c1609f4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = c1610g2.f6768q;
            if (!hasNext) {
                break;
            }
            io.flutter.view.C1609f c1609f5 = (io.flutter.view.C1609f) it.next();
            if (!arrayList.contains(java.lang.Integer.valueOf(c1609f5.f6725b))) {
                c1609f4 = c1609f5;
            }
        }
        if (c1609f4 == null && !arrayList6.isEmpty()) {
            c1609f4 = (io.flutter.view.C1609f) arrayList6.get(arrayList6.size() - 1);
        }
        if (c1609f4 != null && (c1609f4.f6725b != c1610g2.f6769r || arrayList6.size() != arrayList.size())) {
            c1610g2.f6769r = c1609f4.f6725b;
            java.lang.String m3552B = c1609f4.m3552B();
            if (m3552B == null) {
                m3552B = " ";
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                c1610g2.f6752a.setAccessibilityPaneTitle(m3552B);
            } else {
                android.view.accessibility.AccessibilityEvent m3562e = c1610g2.m3562e(c1609f4.f6725b, 32);
                m3562e.getText().add(m3552B);
                c1610g2.m3566i(m3562e);
            }
        }
        arrayList.clear();
        java.util.Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((io.flutter.view.C1609f) it2.next()).f6725b));
        }
        java.util.Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i5 = 4;
            if (!it3.hasNext()) {
                break;
            }
            io.flutter.view.C1609f c1609f6 = (io.flutter.view.C1609f) ((java.util.Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(c1609f6)) {
                c1609f6.f6714R = null;
                if (c1609f6.f6733i != -1 && (num = c1610g2.f6761j) != null && c1610g2.f6755d.platformViewOfNode(num.intValue()) == interfaceC1586i.mo1708K(c1609f6.f6733i)) {
                    c1610g2.m3565h(c1610g2.f6761j.intValue(), 65536);
                    c1610g2.f6761j = null;
                }
                int i16 = c1609f6.f6733i;
                if (i16 != -1 && (mo1708K = interfaceC1586i.mo1708K(i16)) != null) {
                    mo1708K.setImportantForAccessibility(4);
                }
                io.flutter.view.C1609f c1609f7 = c1610g2.f6760i;
                if (c1609f7 == c1609f6) {
                    c1610g2.m3565h(c1609f7.f6725b, 65536);
                    c1610g2.f6760i = null;
                }
                if (c1610g2.f6765n == c1609f6) {
                    c1610g2.f6765n = null;
                }
                if (c1610g2.f6767p == c1609f6) {
                    c1610g2.f6767p = null;
                }
                it3.remove();
            }
        }
        int i17 = 2048;
        int i18 = 0;
        android.view.accessibility.AccessibilityEvent m3562e2 = c1610g2.m3562e(0, 2048);
        m3562e2.setContentChangeTypes(1);
        c1610g2.m3566i(m3562e2);
        java.util.Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            io.flutter.view.C1609f c1609f8 = (io.flutter.view.C1609f) it4.next();
            if (!java.lang.Float.isNaN(c1609f8.f6736l) && !java.lang.Float.isNaN(c1609f8.f6706J) && c1609f8.f6706J != c1609f8.f6736l) {
                android.view.accessibility.AccessibilityEvent m3562e3 = c1610g2.m3562e(c1609f8.f6725b, 4096);
                float f6 = c1609f8.f6736l;
                float f7 = c1609f8.f6737m;
                if (java.lang.Float.isInfinite(f7)) {
                    if (f6 > 70000.0f) {
                        f6 = 70000.0f;
                    }
                    f7 = 100000.0f;
                }
                if (java.lang.Float.isInfinite(c1609f8.f6738n)) {
                    f4 = f7 + 100000.0f;
                    if (f6 < -70000.0f) {
                        f6 = -70000.0f;
                    }
                    f5 = f6 + 100000.0f;
                } else {
                    float f8 = c1609f8.f6738n;
                    f4 = f7 - f8;
                    f5 = f6 - f8;
                }
                if (io.flutter.view.C1609f.m3550y(c1609f8, io.flutter.view.EnumC1607d.f6681q) || io.flutter.view.C1609f.m3550y(c1609f8, io.flutter.view.EnumC1607d.f6682r)) {
                    m3562e3.setScrollY((int) f5);
                    m3562e3.setMaxScrollY((int) f4);
                } else if (io.flutter.view.C1609f.m3550y(c1609f8, io.flutter.view.EnumC1607d.f6679o) || io.flutter.view.C1609f.m3550y(c1609f8, io.flutter.view.EnumC1607d.f6680p)) {
                    m3562e3.setScrollX((int) f5);
                    m3562e3.setMaxScrollX((int) f4);
                }
                int i19 = c1609f8.f6734j;
                if (i19 > 0) {
                    m3562e3.setItemCount(i19);
                    m3562e3.setFromIndex(c1609f8.f6735k);
                    java.util.Iterator it5 = c1609f8.f6716T.iterator();
                    int i20 = i18;
                    while (it5.hasNext()) {
                        if (!((io.flutter.view.C1609f) it5.next()).m3553D(i4)) {
                            i20++;
                        }
                    }
                    m3562e3.setToIndex((c1609f8.f6735k + i20) - 1);
                }
                c1610g2.m3566i(m3562e3);
            }
            if (c1609f8.m3553D(16) && (((str = c1609f8.f6740p) != null || c1609f8.f6708L != null) && (str == null || !str.equals(c1609f8.f6708L)))) {
                android.view.accessibility.AccessibilityEvent m3562e4 = c1610g2.m3562e(c1609f8.f6725b, i17);
                m3562e4.setContentChangeTypes(1);
                c1610g2.m3566i(m3562e4);
            }
            io.flutter.view.C1609f c1609f9 = c1610g2.f6760i;
            if (c1609f9 != null && c1609f9.f6725b == c1609f8.f6725b && (c1609f8.f6702F & p009B2.AbstractC0051h.m149h(3)) == 0 && c1609f8.m3553D(3)) {
                android.view.accessibility.AccessibilityEvent m3562e5 = c1610g2.m3562e(c1609f8.f6725b, i5);
                m3562e5.getText().add(c1609f8.f6740p);
                c1610g2.m3566i(m3562e5);
            }
            io.flutter.view.C1609f c1609f10 = c1610g2.f6765n;
            if (c1609f10 != null && (i6 = c1609f10.f6725b) == (i7 = c1609f8.f6725b) && ((c1609f2 = c1610g2.f6766o) == null || c1609f2.f6725b != i6)) {
                c1610g2.f6766o = c1609f10;
                c1610g2.m3566i(c1610g2.m3562e(i7, 8));
            } else if (c1609f10 == null) {
                c1610g2.f6766o = null;
            }
            io.flutter.view.C1609f c1609f11 = c1610g2.f6765n;
            if (c1609f11 != null && c1609f11.f6725b == c1609f8.f6725b && (c1609f8.f6702F & p009B2.AbstractC0051h.m149h(5)) != 0 && c1609f8.m3553D(5) && ((c1609f = c1610g2.f6760i) == null || c1609f.f6725b == c1610g2.f6765n.f6725b)) {
                java.lang.String str2 = c1609f8.f6707K;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = c1609f8.f6742r;
                java.lang.String str4 = str3 != null ? str3 : "";
                android.view.accessibility.AccessibilityEvent m3562e6 = c1610g2.m3562e(c1609f8.f6725b, 16);
                m3562e6.setBeforeText(str2);
                m3562e6.getText().add(str4);
                int i21 = 0;
                while (i21 < str2.length() && i21 < str4.length() && str2.charAt(i21) == str4.charAt(i21)) {
                    i21++;
                }
                if (i21 < str2.length() || i21 < str4.length()) {
                    m3562e6.setFromIndex(i21);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i21 && length2 >= i21 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    m3562e6.setRemovedCount((length - i21) + 1);
                    m3562e6.setAddedCount((length2 - i21) + 1);
                } else {
                    m3562e6 = null;
                }
                if (m3562e6 != null) {
                    c1610g2.m3566i(m3562e6);
                }
                if (c1609f8.f6704H != c1609f8.f6731g || c1609f8.f6705I != c1609f8.f6732h) {
                    android.view.accessibility.AccessibilityEvent m3562e7 = c1610g2.m3562e(c1609f8.f6725b, 8192);
                    m3562e7.getText().add(str4);
                    m3562e7.setFromIndex(c1609f8.f6731g);
                    m3562e7.setToIndex(c1609f8.f6732h);
                    m3562e7.setItemCount(str4.length());
                    c1610g2.m3566i(m3562e7);
                }
            }
            i17 = 2048;
            i18 = 0;
            i5 = 4;
            i4 = 14;
        }
    }
}
