package T0;

import B2.AbstractActivityC0003d;
import C.P;
import C.Q;
import T2.n;
import W.p;
import W.r;
import W.w;
import W.y;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Window;
import e1.C0262f;
import e1.E;
import e1.F;
import e1.G;
import e1.H;
import e1.InterfaceC0256B;
import io.flutter.plugin.platform.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w0.C0591a;
import y0.q;
import y0.x;

/* loaded from: classes.dex */
public final class j implements InterfaceC0256B {

    /* renamed from: l, reason: collision with root package name */
    public int f2415l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2416m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2417n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f2418o;

    /* renamed from: p, reason: collision with root package name */
    public Object f2419p;

    public j(AbstractActivityC0003d abstractActivityC0003d, B1.d dVar, AbstractActivityC0003d abstractActivityC0003d2) {
        m mVar = new m(1, this);
        this.f2416m = abstractActivityC0003d;
        this.f2417n = dVar;
        dVar.f97n = mVar;
        this.f2418o = abstractActivityC0003d2;
        this.f2415l = 1280;
    }

    @Override // e1.InterfaceC0256B
    public void a(w wVar, q qVar, G g4) {
    }

    public void b(K2.e eVar) {
        Window window = ((AbstractActivityC0003d) this.f2416m).getWindow();
        window.getDecorView();
        int i4 = Build.VERSION.SDK_INT;
        U1.a q4 = i4 >= 35 ? new Q(window) : i4 >= 30 ? new Q(window) : new P(window);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i6 = eVar.f957l;
        if (i6 != 0) {
            int b4 = L.j.b(i6);
            if (b4 == 0) {
                q4.B(false);
            } else if (b4 == 1) {
                q4.B(true);
            }
        }
        Integer num = (Integer) eVar.f959n;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) eVar.f962q;
        if (bool != null && i5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        int i7 = eVar.f958m;
        if (i7 != 0) {
            int b5 = L.j.b(i7);
            if (b5 == 0) {
                q4.A(false);
            } else if (b5 == 1) {
                q4.A(true);
            }
        }
        Integer num2 = (Integer) eVar.f960o;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        Integer num3 = (Integer) eVar.f961p;
        if (num3 != null && i5 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) eVar.f963r;
        if (bool2 != null && i5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2419p = eVar;
    }

    public void c() {
        ((AbstractActivityC0003d) this.f2416m).getWindow().getDecorView().setSystemUiVisibility(this.f2415l);
        K2.e eVar = (K2.e) this.f2419p;
        if (eVar != null) {
            b(eVar);
        }
    }

    @Override // e1.InterfaceC0256B
    public void d(r rVar) {
        w wVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        w wVar2;
        int i4;
        char c4;
        int i5;
        SparseArray sparseArray2;
        int i6;
        int i7;
        if (rVar.u() != 2) {
            return;
        }
        E e4 = (E) this.f2419p;
        int i8 = e4.f5119a;
        int i9 = 0;
        List list = e4.f5121c;
        if (i8 == 1 || i8 == 2 || e4.f5132n == 1) {
            wVar = (w) list.get(0);
        } else {
            wVar = new w(((w) list.get(0)).d());
            list.add(wVar);
        }
        if ((rVar.u() & 128) == 0) {
            return;
        }
        rVar.H(1);
        int A4 = rVar.A();
        int i10 = 3;
        rVar.H(3);
        W.q qVar = (W.q) this.f2416m;
        rVar.f(qVar.f2689d, 0, 2);
        qVar.q(0);
        qVar.t(3);
        e4.f5137t = qVar.i(13);
        rVar.f(qVar.f2689d, 0, 2);
        qVar.q(0);
        qVar.t(4);
        rVar.H(qVar.i(12));
        C0262f c0262f = e4.f5124f;
        int i11 = e4.f5119a;
        if (i11 == 2 && e4.f5136r == null) {
            H a4 = c0262f.a(21, new p(21, null, 0, null, y.f2714f));
            e4.f5136r = a4;
            if (a4 != null) {
                a4.a(wVar, e4.f5131m, new G(A4, 21, 8192));
            }
        }
        SparseArray sparseArray3 = (SparseArray) this.f2417n;
        sparseArray3.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2418o;
        sparseIntArray.clear();
        int a5 = rVar.a();
        while (true) {
            sparseBooleanArray = e4.f5127i;
            if (a5 <= 0) {
                break;
            }
            rVar.f(qVar.f2689d, i9, 5);
            qVar.q(i9);
            int i12 = qVar.i(8);
            qVar.t(i10);
            int i13 = qVar.i(13);
            qVar.t(4);
            int i14 = qVar.i(12);
            int i15 = rVar.f2695b;
            int i16 = i15 + i14;
            int i17 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i18 = 0;
            W.q qVar2 = qVar;
            while (rVar.f2695b < i16) {
                int u4 = rVar.u();
                int u5 = rVar.f2695b + rVar.u();
                if (u5 > i16) {
                    break;
                }
                w wVar3 = wVar;
                if (u4 == 5) {
                    long w = rVar.w();
                    if (w == 1094921523) {
                        i17 = 129;
                    } else if (w == 1161904947) {
                        i17 = 135;
                    } else {
                        if (w != 1094921524) {
                            if (w == 1212503619) {
                                i17 = 36;
                            }
                        }
                        i17 = 172;
                    }
                    sparseArray2 = sparseArray3;
                    i6 = A4;
                    i7 = i13;
                } else if (u4 == 106) {
                    sparseArray2 = sparseArray3;
                    i6 = A4;
                    i7 = i13;
                    i17 = 129;
                } else if (u4 == 122) {
                    sparseArray2 = sparseArray3;
                    i6 = A4;
                    i7 = i13;
                    i17 = 135;
                } else if (u4 == 127) {
                    int u6 = rVar.u();
                    if (u6 != 21) {
                        if (u6 == 14) {
                            i17 = 136;
                        } else if (u6 == 33) {
                            i17 = 139;
                        }
                        sparseArray2 = sparseArray3;
                        i6 = A4;
                        i7 = i13;
                    }
                    i17 = 172;
                    sparseArray2 = sparseArray3;
                    i6 = A4;
                    i7 = i13;
                } else {
                    if (u4 == 123) {
                        sparseArray2 = sparseArray3;
                        i17 = 138;
                    } else if (u4 == 10) {
                        String trim = rVar.s(3, e2.d.f5436c).trim();
                        i18 = rVar.u();
                        sparseArray2 = sparseArray3;
                        str = trim;
                    } else {
                        if (u4 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (rVar.f2695b < u5) {
                                String trim2 = rVar.s(3, e2.d.f5436c).trim();
                                rVar.u();
                                SparseArray sparseArray4 = sparseArray3;
                                byte[] bArr = new byte[4];
                                rVar.f(bArr, 0, 4);
                                arrayList2.add(new F(trim2, bArr));
                                sparseArray3 = sparseArray4;
                                A4 = A4;
                                i13 = i13;
                            }
                            sparseArray2 = sparseArray3;
                            i6 = A4;
                            i7 = i13;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            sparseArray2 = sparseArray3;
                            i6 = A4;
                            i7 = i13;
                            if (u4 == 111) {
                                i17 = 257;
                            }
                        }
                        rVar.H(u5 - rVar.f2695b);
                        sparseArray3 = sparseArray2;
                        wVar = wVar3;
                        A4 = i6;
                        i13 = i7;
                    }
                    i6 = A4;
                    i7 = i13;
                }
                rVar.H(u5 - rVar.f2695b);
                sparseArray3 = sparseArray2;
                wVar = wVar3;
                A4 = i6;
                i13 = i7;
            }
            SparseArray sparseArray5 = sparseArray3;
            w wVar4 = wVar;
            int i19 = A4;
            int i20 = i13;
            rVar.G(i16);
            p pVar = new p(i17, str, i18, arrayList, Arrays.copyOfRange(rVar.f2694a, i15, i16));
            if (i12 == 6 || i12 == 5) {
                i12 = i17;
            }
            a5 -= i14 + 5;
            int i21 = i11 == 2 ? i12 : i20;
            if (sparseBooleanArray.get(i21)) {
                sparseArray3 = sparseArray5;
                c4 = 21;
            } else {
                c4 = 21;
                H a6 = (i11 == 2 && i12 == 21) ? e4.f5136r : c0262f.a(i12, pVar);
                if (i11 == 2) {
                    i5 = i20;
                    if (i5 >= sparseIntArray.get(i21, 8192)) {
                        sparseArray3 = sparseArray5;
                    }
                } else {
                    i5 = i20;
                }
                sparseIntArray.put(i21, i5);
                sparseArray3 = sparseArray5;
                sparseArray3.put(i21, a6);
            }
            qVar = qVar2;
            wVar = wVar4;
            A4 = i19;
            i9 = 0;
            i10 = 3;
        }
        w wVar5 = wVar;
        int i22 = A4;
        int size = sparseIntArray.size();
        int i23 = 0;
        while (true) {
            sparseArray = e4.f5126h;
            if (i23 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i23);
            int valueAt = sparseIntArray.valueAt(i23);
            sparseBooleanArray.put(keyAt, true);
            e4.f5128j.put(valueAt, true);
            H h4 = (H) sparseArray3.valueAt(i23);
            if (h4 != null) {
                if (h4 != e4.f5136r) {
                    q qVar3 = e4.f5131m;
                    i4 = i22;
                    G g4 = new G(i4, keyAt, 8192);
                    wVar2 = wVar5;
                    h4.a(wVar2, qVar3, g4);
                } else {
                    wVar2 = wVar5;
                    i4 = i22;
                }
                sparseArray.put(valueAt, h4);
            } else {
                wVar2 = wVar5;
                i4 = i22;
            }
            i23++;
            wVar5 = wVar2;
            i22 = i4;
        }
        if (i11 == 2) {
            if (!e4.f5133o) {
                e4.f5131m.s();
                e4.f5132n = 0;
                e4.f5133o = true;
            }
            return;
        }
        sparseArray.remove(this.f2415l);
        int i24 = i11 == 1 ? 0 : e4.f5132n - 1;
        e4.f5132n = i24;
        if (i24 == 0) {
            e4.f5131m.s();
            e4.f5133o = true;
        }
    }

    public j(x xVar, C0591a c0591a, byte[] bArr, n[] nVarArr, int i4) {
        this.f2416m = xVar;
        this.f2417n = c0591a;
        this.f2418o = bArr;
        this.f2419p = nVarArr;
        this.f2415l = i4;
    }

    public j(E e4, int i4) {
        this.f2419p = e4;
        this.f2416m = new W.q(new byte[5], 5);
        this.f2417n = new SparseArray();
        this.f2418o = new SparseIntArray();
        this.f2415l = i4;
    }
}
