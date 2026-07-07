package e1;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import java.util.List;
import y0.AbstractC0619b;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5116a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5117b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.F[] f5118c;

    public D(int i4, List list) {
        this.f5116a = i4;
        switch (i4) {
            case 1:
                this.f5117b = list;
                this.f5118c = new y0.F[list.size()];
                return;
            default:
                this.f5117b = list;
                this.f5118c = new y0.F[list.size()];
                return;
        }
    }

    public void a(long j4, W.r rVar) {
        if (rVar.a() < 9) {
            return;
        }
        int h4 = rVar.h();
        int h5 = rVar.h();
        int u4 = rVar.u();
        if (h4 == 434 && h5 == 1195456820 && u4 == 3) {
            AbstractC0619b.g(j4, rVar, this.f5118c);
        }
    }

    public final void b(y0.q qVar, G g4) {
        switch (this.f5116a) {
            case 0:
                int i4 = 0;
                while (true) {
                    y0.F[] fArr = this.f5118c;
                    if (i4 >= fArr.length) {
                        return;
                    }
                    g4.a();
                    g4.c();
                    y0.F v4 = qVar.v(g4.f5142c, 3);
                    C0095p c0095p = (C0095p) this.f5117b.get(i4);
                    String str = c0095p.f2325m;
                    W.a.d("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                    String str2 = c0095p.f2313a;
                    if (str2 == null) {
                        g4.c();
                        str2 = (String) g4.f5144e;
                    }
                    C0094o c0094o = new C0094o();
                    c0094o.f2279a = str2;
                    c0094o.f2290l = T.H.l(str);
                    c0094o.f2283e = c0095p.f2317e;
                    c0094o.f2282d = c0095p.f2316d;
                    c0094o.f2274E = c0095p.f2308F;
                    c0094o.f2293o = c0095p.f2328p;
                    AbstractC0007h.q(c0094o, v4);
                    fArr[i4] = v4;
                    i4++;
                }
                break;
            default:
                int i5 = 0;
                while (true) {
                    y0.F[] fArr2 = this.f5118c;
                    if (i5 >= fArr2.length) {
                        return;
                    }
                    g4.a();
                    g4.c();
                    y0.F v5 = qVar.v(g4.f5142c, 3);
                    C0095p c0095p2 = (C0095p) this.f5117b.get(i5);
                    String str3 = c0095p2.f2325m;
                    W.a.d("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                    C0094o c0094o2 = new C0094o();
                    g4.c();
                    c0094o2.f2279a = (String) g4.f5144e;
                    c0094o2.f2290l = T.H.l(str3);
                    c0094o2.f2283e = c0095p2.f2317e;
                    c0094o2.f2282d = c0095p2.f2316d;
                    c0094o2.f2274E = c0095p2.f2308F;
                    c0094o2.f2293o = c0095p2.f2328p;
                    AbstractC0007h.q(c0094o2, v5);
                    fArr2[i5] = v5;
                    i5++;
                }
                break;
        }
    }
}
