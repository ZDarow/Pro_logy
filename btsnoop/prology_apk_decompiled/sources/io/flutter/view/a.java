package io.flutter.view;

import B2.AbstractC0007h;
import android.opengl.Matrix;
import android.os.Build;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements C2.g, C2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6423a;

    public /* synthetic */ a(Object obj) {
        this.f6423a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i4;
        io.flutter.plugin.platform.i iVar;
        ArrayList arrayList;
        int i5;
        f fVar;
        int i6;
        int i7;
        f fVar2;
        String str;
        float f4;
        float f5;
        SurfaceView K3;
        Integer num;
        g gVar;
        SurfaceView K4;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        g gVar2 = (g) this.f6423a;
        gVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i4 = 14;
            iVar = gVar2.f6511e;
            if (!hasRemaining) {
                break;
            }
            f c4 = gVar2.c(byteBuffer.getInt());
            c4.f6459E = true;
            c4.f6464K = c4.f6499r;
            c4.f6465L = c4.f6497p;
            c4.f6460F = c4.f6484c;
            c4.f6461G = c4.f6485d;
            c4.f6462H = c4.f6488g;
            c4.f6463I = c4.f6489h;
            c4.J = c4.f6493l;
            c4.f6484c = byteBuffer.getLong();
            c4.f6485d = byteBuffer.getInt();
            c4.f6486e = byteBuffer.getInt();
            c4.f6487f = byteBuffer.getInt();
            c4.f6488g = byteBuffer.getInt();
            c4.f6489h = byteBuffer.getInt();
            c4.f6490i = byteBuffer.getInt();
            c4.f6491j = byteBuffer.getInt();
            c4.f6492k = byteBuffer.getInt();
            c4.f6493l = byteBuffer.getFloat();
            c4.f6494m = byteBuffer.getFloat();
            c4.f6495n = byteBuffer.getFloat();
            c4.f6496o = g.d(byteBuffer, strArr);
            c4.f6497p = g.d(byteBuffer, strArr);
            c4.f6498q = f.C(byteBuffer, byteBufferArr);
            c4.f6499r = g.d(byteBuffer, strArr);
            c4.s = f.C(byteBuffer, byteBufferArr);
            c4.f6500t = g.d(byteBuffer, strArr);
            c4.f6501u = f.C(byteBuffer, byteBufferArr);
            c4.f6502v = g.d(byteBuffer, strArr);
            c4.w = f.C(byteBuffer, byteBufferArr);
            c4.f6503x = g.d(byteBuffer, strArr);
            c4.f6504y = f.C(byteBuffer, byteBufferArr);
            c4.f6505z = g.d(byteBuffer, strArr);
            c4.f6455A = g.d(byteBuffer, strArr);
            c4.f6456B = g.d(byteBuffer, strArr);
            c4.f6457C = byteBuffer.getInt();
            byteBuffer.getInt();
            c4.f6466M = byteBuffer.getFloat();
            c4.f6467N = byteBuffer.getFloat();
            c4.f6468O = byteBuffer.getFloat();
            c4.f6469P = byteBuffer.getFloat();
            if (c4.f6470Q == null) {
                c4.f6470Q = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                c4.f6470Q[i8] = byteBuffer.getFloat();
            }
            c4.f6477X = true;
            c4.f6479Z = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList3 = c4.f6472S;
            arrayList3.clear();
            ArrayList arrayList4 = c4.f6473T;
            arrayList4.clear();
            int i10 = 0;
            while (true) {
                gVar = c4.f6480a;
                if (i10 >= i9) {
                    break;
                }
                f c5 = gVar.c(byteBuffer.getInt());
                c5.f6471R = c4;
                arrayList3.add(c5);
                i10++;
            }
            for (int i11 = 0; i11 < i9; i11++) {
                f c6 = gVar.c(byteBuffer.getInt());
                c6.f6471R = c4;
                arrayList4.add(c6);
            }
            int i12 = byteBuffer.getInt();
            if (i12 == 0) {
                c4.f6474U = null;
            } else {
                ArrayList arrayList5 = c4.f6474U;
                if (arrayList5 == null) {
                    c4.f6474U = new ArrayList(i12);
                } else {
                    arrayList5.clear();
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    e b4 = gVar.b(byteBuffer.getInt());
                    int i14 = b4.f6452c;
                    if (i14 == 1) {
                        c4.f6475V = b4;
                    } else if (i14 == 2) {
                        c4.f6476W = b4;
                    } else {
                        c4.f6474U.add(b4);
                    }
                    c4.f6474U.add(b4);
                }
            }
            if (!c4.D(14)) {
                if (c4.D(6)) {
                    gVar2.f6520n = c4;
                }
                if (c4.f6459E) {
                    arrayList2.add(c4);
                }
                int i15 = c4.f6490i;
                if (i15 != -1 && !iVar.r(i15) && (K4 = iVar.K(c4.f6490i)) != null) {
                    K4.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = gVar2.f6513g;
        f fVar3 = (f) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (fVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            fVar3.H(fArr, hashSet, false);
            fVar3.z(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        f fVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = gVar2.f6523q;
            if (!hasNext) {
                break;
            }
            f fVar5 = (f) it.next();
            if (!arrayList.contains(Integer.valueOf(fVar5.f6482b))) {
                fVar4 = fVar5;
            }
        }
        if (fVar4 == null && !arrayList6.isEmpty()) {
            fVar4 = (f) arrayList6.get(arrayList6.size() - 1);
        }
        if (fVar4 != null && (fVar4.f6482b != gVar2.f6524r || arrayList6.size() != arrayList.size())) {
            gVar2.f6524r = fVar4.f6482b;
            String B4 = fVar4.B();
            if (B4 == null) {
                B4 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                gVar2.f6507a.setAccessibilityPaneTitle(B4);
            } else {
                AccessibilityEvent e4 = gVar2.e(fVar4.f6482b, 32);
                e4.getText().add(B4);
                gVar2.i(e4);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((f) it2.next()).f6482b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i5 = 4;
            if (!it3.hasNext()) {
                break;
            }
            f fVar6 = (f) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(fVar6)) {
                fVar6.f6471R = null;
                if (fVar6.f6490i != -1 && (num = gVar2.f6516j) != null && gVar2.f6510d.platformViewOfNode(num.intValue()) == iVar.K(fVar6.f6490i)) {
                    gVar2.h(gVar2.f6516j.intValue(), 65536);
                    gVar2.f6516j = null;
                }
                int i16 = fVar6.f6490i;
                if (i16 != -1 && (K3 = iVar.K(i16)) != null) {
                    K3.setImportantForAccessibility(4);
                }
                f fVar7 = gVar2.f6515i;
                if (fVar7 == fVar6) {
                    gVar2.h(fVar7.f6482b, 65536);
                    gVar2.f6515i = null;
                }
                if (gVar2.f6520n == fVar6) {
                    gVar2.f6520n = null;
                }
                if (gVar2.f6522p == fVar6) {
                    gVar2.f6522p = null;
                }
                it3.remove();
            }
        }
        int i17 = 2048;
        int i18 = 0;
        AccessibilityEvent e5 = gVar2.e(0, 2048);
        e5.setContentChangeTypes(1);
        gVar2.i(e5);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            f fVar8 = (f) it4.next();
            if (!Float.isNaN(fVar8.f6493l) && !Float.isNaN(fVar8.J) && fVar8.J != fVar8.f6493l) {
                AccessibilityEvent e6 = gVar2.e(fVar8.f6482b, 4096);
                float f6 = fVar8.f6493l;
                float f7 = fVar8.f6494m;
                if (Float.isInfinite(f7)) {
                    if (f6 > 70000.0f) {
                        f6 = 70000.0f;
                    }
                    f7 = 100000.0f;
                }
                if (Float.isInfinite(fVar8.f6495n)) {
                    f4 = f7 + 100000.0f;
                    if (f6 < -70000.0f) {
                        f6 = -70000.0f;
                    }
                    f5 = f6 + 100000.0f;
                } else {
                    float f8 = fVar8.f6495n;
                    f4 = f7 - f8;
                    f5 = f6 - f8;
                }
                if (f.y(fVar8, d.f6441q) || f.y(fVar8, d.f6442r)) {
                    e6.setScrollY((int) f5);
                    e6.setMaxScrollY((int) f4);
                } else if (f.y(fVar8, d.f6439o) || f.y(fVar8, d.f6440p)) {
                    e6.setScrollX((int) f5);
                    e6.setMaxScrollX((int) f4);
                }
                int i19 = fVar8.f6491j;
                if (i19 > 0) {
                    e6.setItemCount(i19);
                    e6.setFromIndex(fVar8.f6492k);
                    Iterator it5 = fVar8.f6473T.iterator();
                    int i20 = i18;
                    while (it5.hasNext()) {
                        if (!((f) it5.next()).D(i4)) {
                            i20++;
                        }
                    }
                    e6.setToIndex((fVar8.f6492k + i20) - 1);
                }
                gVar2.i(e6);
            }
            if (fVar8.D(16) && (((str = fVar8.f6497p) != null || fVar8.f6465L != null) && (str == null || !str.equals(fVar8.f6465L)))) {
                AccessibilityEvent e7 = gVar2.e(fVar8.f6482b, i17);
                e7.setContentChangeTypes(1);
                gVar2.i(e7);
            }
            f fVar9 = gVar2.f6515i;
            if (fVar9 != null && fVar9.f6482b == fVar8.f6482b && (fVar8.f6460F & AbstractC0007h.h(3)) == 0 && fVar8.D(3)) {
                AccessibilityEvent e8 = gVar2.e(fVar8.f6482b, i5);
                e8.getText().add(fVar8.f6497p);
                gVar2.i(e8);
            }
            f fVar10 = gVar2.f6520n;
            if (fVar10 != null && (i6 = fVar10.f6482b) == (i7 = fVar8.f6482b) && ((fVar2 = gVar2.f6521o) == null || fVar2.f6482b != i6)) {
                gVar2.f6521o = fVar10;
                gVar2.i(gVar2.e(i7, 8));
            } else if (fVar10 == null) {
                gVar2.f6521o = null;
            }
            f fVar11 = gVar2.f6520n;
            if (fVar11 != null && fVar11.f6482b == fVar8.f6482b && (fVar8.f6460F & AbstractC0007h.h(5)) != 0 && fVar8.D(5) && ((fVar = gVar2.f6515i) == null || fVar.f6482b == gVar2.f6520n.f6482b)) {
                String str2 = fVar8.f6464K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fVar8.f6499r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent e9 = gVar2.e(fVar8.f6482b, 16);
                e9.setBeforeText(str2);
                e9.getText().add(str4);
                int i21 = 0;
                while (i21 < str2.length() && i21 < str4.length() && str2.charAt(i21) == str4.charAt(i21)) {
                    i21++;
                }
                if (i21 < str2.length() || i21 < str4.length()) {
                    e9.setFromIndex(i21);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i21 && length2 >= i21 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    e9.setRemovedCount((length - i21) + 1);
                    e9.setAddedCount((length2 - i21) + 1);
                } else {
                    e9 = null;
                }
                if (e9 != null) {
                    gVar2.i(e9);
                }
                if (fVar8.f6462H != fVar8.f6488g || fVar8.f6463I != fVar8.f6489h) {
                    AccessibilityEvent e10 = gVar2.e(fVar8.f6482b, 8192);
                    e10.getText().add(str4);
                    e10.setFromIndex(fVar8.f6488g);
                    e10.setToIndex(fVar8.f6489h);
                    e10.setItemCount(str4.length());
                    gVar2.i(e10);
                }
            }
            i17 = 2048;
            i18 = 0;
            i5 = 4;
            i4 = 14;
        }
    }
}
