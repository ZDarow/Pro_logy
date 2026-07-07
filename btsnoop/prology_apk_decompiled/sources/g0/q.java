package g0;

import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.F;
import T.G;
import java.util.Map;
import q0.Z;

/* loaded from: classes.dex */
public final class q extends Z {

    /* renamed from: H, reason: collision with root package name */
    public final Map f5745H;

    /* renamed from: I, reason: collision with root package name */
    public C0092m f5746I;

    public q(u0.e eVar, f0.i iVar, f0.e eVar2, Map map) {
        super(eVar, iVar, eVar2);
        this.f5745H = map;
    }

    @Override // q0.Z
    public final C0095p k(C0095p c0095p) {
        C0092m c0092m;
        C0092m c0092m2 = this.f5746I;
        if (c0092m2 == null) {
            c0092m2 = c0095p.f2329q;
        }
        if (c0092m2 != null && (c0092m = (C0092m) this.f5745H.get(c0092m2.f2267n)) != null) {
            c0092m2 = c0092m;
        }
        G g4 = c0095p.f2323k;
        G g5 = null;
        if (g4 != null) {
            F[] fArr = g4.f2118l;
            int length = fArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                F f4 = fArr[i5];
                if ((f4 instanceof M0.m) && "com.apple.streaming.transportStreamTimestamp".equals(((M0.m) f4).f1152m)) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                if (length != 1) {
                    F[] fArr2 = new F[length - 1];
                    while (i4 < length) {
                        if (i4 != i5) {
                            fArr2[i4 < i5 ? i4 : i4 - 1] = fArr[i4];
                        }
                        i4++;
                    }
                    g5 = new G(fArr2);
                }
            }
            if (c0092m2 == c0095p.f2329q || g4 != c0095p.f2323k) {
                C0094o a4 = c0095p.a();
                a4.f2294p = c0092m2;
                a4.f2288j = g4;
                c0095p = new C0095p(a4);
            }
            return super.k(c0095p);
        }
        g4 = g5;
        if (c0092m2 == c0095p.f2329q) {
        }
        C0094o a42 = c0095p.a();
        a42.f2294p = c0092m2;
        a42.f2288j = g4;
        c0095p = new C0095p(a42);
        return super.k(c0095p);
    }
}
