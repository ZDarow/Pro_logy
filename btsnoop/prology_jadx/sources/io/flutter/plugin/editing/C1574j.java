package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.j */
/* loaded from: classes.dex */
public final class C1574j implements io.flutter.plugin.editing.InterfaceC1566b {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugin.editing.C1575k f6534a;

    public /* synthetic */ C1574j(io.flutter.plugin.editing.C1575k c1575k) {
        this.f6534a = c1575k;
    }

    /* renamed from: a */
    public void m3494a(int i4, p043K2.C0340p c0340p) {
        io.flutter.plugin.editing.C1575k c1575k = this.f6534a;
        c1575k.m3499d();
        c1575k.f6540f = c0340p;
        c1575k.f6539e = new p011C.C0118j(2, i4, 5);
        c1575k.f6542h.m3491e(c1575k);
        p035I.C0291m c0291m = c0340p.f1058j;
        p043K2.C0342r c0342r = c0291m != null ? (p043K2.C0342r) c0291m.f878n : null;
        android.view.View view = c1575k.f6535a;
        c1575k.f6542h = new io.flutter.plugin.editing.C1571g(c0342r, view);
        if (c0291m == null) {
            c1575k.f6541g = null;
        } else {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            c1575k.f6541g = sparseArray;
            p043K2.C0340p[] c0340pArr = c0340p.f1060l;
            if (c0340pArr == null) {
                sparseArray.put(((java.lang.String) c0291m.f876l).hashCode(), c0340p);
            } else {
                for (p043K2.C0340p c0340p2 : c0340pArr) {
                    p035I.C0291m c0291m2 = c0340p2.f1058j;
                    if (c0291m2 != null) {
                        android.util.SparseArray sparseArray2 = c1575k.f6541g;
                        java.lang.String str = (java.lang.String) c0291m2.f876l;
                        sparseArray2.put(str.hashCode(), c0340p2);
                        c1575k.f6537c.notifyValueChanged(view, str.hashCode(), android.view.autofill.AutofillValue.forText(((p043K2.C0342r) c0291m2.f878n).f1065a));
                    }
                }
            }
        }
        c1575k.f6543i = true;
        if (c1575k.f6539e.f326b == 3) {
            c1575k.f6550p = false;
        }
        c1575k.f6547m = null;
        c1575k.f6542h.m3487a(c1575k);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [Y1.a, java.lang.Object] */
    /* renamed from: b */
    public void m3495b(double d4, double d5, double[] dArr) {
        io.flutter.plugin.editing.C1575k c1575k = this.f6534a;
        c1575k.getClass();
        double[] dArr2 = new double[4];
        boolean z4 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d6 = dArr[12];
        double d7 = dArr[15];
        double d8 = d6 / d7;
        dArr2[1] = d8;
        dArr2[0] = d8;
        double d9 = dArr[13] / d7;
        dArr2[3] = d9;
        dArr2[2] = d9;
        ?? obj = new java.lang.Object();
        obj.f3188l = z4;
        obj.f3189m = dArr;
        obj.f3190n = dArr2;
        obj.m1727a(d4, 0.0d);
        obj.m1727a(d4, d5);
        obj.m1727a(0.0d, d5);
        double d10 = c1575k.f6535a.getContext().getResources().getDisplayMetrics().density;
        c1575k.f6547m = new android.graphics.Rect((int) (dArr2[0] * d10), (int) (dArr2[2] * d10), (int) java.lang.Math.ceil(dArr2[1] * d10), (int) java.lang.Math.ceil(dArr2[3] * d10));
    }

    /* renamed from: c */
    public void m3496c(p043K2.C0342r c0342r) {
        p043K2.C0342r c0342r2;
        int i4;
        int i5;
        io.flutter.plugin.editing.C1575k c1575k = this.f6534a;
        android.view.View view = c1575k.f6535a;
        if (!c1575k.f6543i && (c0342r2 = c1575k.f6549o) != null && (i4 = c0342r2.f1068d) >= 0 && (i5 = c0342r2.f1069e) > i4) {
            int i6 = i5 - i4;
            int i7 = c0342r.f1069e;
            int i8 = c0342r.f1068d;
            boolean z4 = true;
            if (i6 == i7 - i8) {
                int i9 = 0;
                while (true) {
                    if (i9 >= i6) {
                        z4 = false;
                        break;
                    } else if (c0342r2.f1065a.charAt(i9 + i4) != c0342r.f1065a.charAt(i9 + i8)) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            c1575k.f6543i = z4;
        }
        c1575k.f6549o = c0342r;
        c1575k.f6542h.m3492f(c0342r);
        if (c1575k.f6543i) {
            c1575k.f6536b.restartInput(view);
            c1575k.f6543i = false;
        }
    }
}
