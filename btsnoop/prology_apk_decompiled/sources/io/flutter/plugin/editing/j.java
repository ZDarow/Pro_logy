package io.flutter.plugin.editing;

import C.C0023j;
import I.C0044m;
import K2.p;
import K2.r;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6299a;

    public /* synthetic */ j(k kVar) {
        this.f6299a = kVar;
    }

    public void a(int i4, p pVar) {
        k kVar = this.f6299a;
        kVar.d();
        kVar.f6305f = pVar;
        kVar.f6304e = new C0023j(2, i4, 5);
        kVar.f6307h.e(kVar);
        C0044m c0044m = pVar.f1019j;
        r rVar = c0044m != null ? (r) c0044m.f849n : null;
        View view = kVar.f6300a;
        kVar.f6307h = new g(rVar, view);
        if (c0044m == null) {
            kVar.f6306g = null;
        } else {
            SparseArray sparseArray = new SparseArray();
            kVar.f6306g = sparseArray;
            p[] pVarArr = pVar.f1021l;
            if (pVarArr == null) {
                sparseArray.put(((String) c0044m.f847l).hashCode(), pVar);
            } else {
                for (p pVar2 : pVarArr) {
                    C0044m c0044m2 = pVar2.f1019j;
                    if (c0044m2 != null) {
                        SparseArray sparseArray2 = kVar.f6306g;
                        String str = (String) c0044m2.f847l;
                        sparseArray2.put(str.hashCode(), pVar2);
                        kVar.f6302c.notifyValueChanged(view, str.hashCode(), AutofillValue.forText(((r) c0044m2.f849n).f1026a));
                    }
                }
            }
        }
        kVar.f6308i = true;
        if (kVar.f6304e.f320b == 3) {
            kVar.f6315p = false;
        }
        kVar.f6312m = null;
        kVar.f6307h.a(kVar);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [Y1.a, java.lang.Object] */
    public void b(double d4, double d5, double[] dArr) {
        k kVar = this.f6299a;
        kVar.getClass();
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
        ?? obj = new Object();
        obj.f3078l = z4;
        obj.f3079m = dArr;
        obj.f3080n = dArr2;
        obj.a(d4, 0.0d);
        obj.a(d4, d5);
        obj.a(0.0d, d5);
        double d10 = kVar.f6300a.getContext().getResources().getDisplayMetrics().density;
        kVar.f6312m = new Rect((int) (dArr2[0] * d10), (int) (dArr2[2] * d10), (int) Math.ceil(dArr2[1] * d10), (int) Math.ceil(dArr2[3] * d10));
    }

    public void c(r rVar) {
        r rVar2;
        int i4;
        int i5;
        k kVar = this.f6299a;
        View view = kVar.f6300a;
        if (!kVar.f6308i && (rVar2 = kVar.f6314o) != null && (i4 = rVar2.f1029d) >= 0 && (i5 = rVar2.f1030e) > i4) {
            int i6 = i5 - i4;
            int i7 = rVar.f1030e;
            int i8 = rVar.f1029d;
            boolean z4 = true;
            if (i6 == i7 - i8) {
                int i9 = 0;
                while (true) {
                    if (i9 >= i6) {
                        z4 = false;
                        break;
                    } else if (rVar2.f1026a.charAt(i9 + i4) != rVar.f1026a.charAt(i9 + i8)) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            kVar.f6308i = z4;
        }
        kVar.f6314o = rVar;
        kVar.f6307h.f(rVar);
        if (kVar.f6308i) {
            kVar.f6301b.restartInput(view);
            kVar.f6308i = false;
        }
    }
}
