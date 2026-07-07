package p123e1;

/* renamed from: e1.D */
/* loaded from: classes.dex */
public final class C1322D {

    /* renamed from: a */
    public final /* synthetic */ int f5304a;

    /* renamed from: b */
    public final java.util.List f5305b;

    /* renamed from: c */
    public final p215y0.InterfaceC2387F[] f5306c;

    public C1322D(int i4, java.util.List list) {
        this.f5304a = i4;
        switch (i4) {
            case 1:
                this.f5305b = list;
                this.f5306c = new p215y0.InterfaceC2387F[list.size()];
                return;
            default:
                this.f5305b = list;
                this.f5306c = new p215y0.InterfaceC2387F[list.size()];
                return;
        }
    }

    /* renamed from: a */
    public void m3082a(long j4, p086W.C0798r c0798r) {
        if (c0798r.m1539a() < 9) {
            return;
        }
        int m1546h = c0798r.m1546h();
        int m1546h2 = c0798r.m1546h();
        int m1559u = c0798r.m1559u();
        if (m1546h == 434 && m1546h2 == 1195456820 && m1559u == 3) {
            p215y0.AbstractC2390b.m4612g(j4, c0798r, this.f5306c);
        }
    }

    /* renamed from: b */
    public final void m3083b(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        switch (this.f5304a) {
            case 0:
                int i4 = 0;
                while (true) {
                    p215y0.InterfaceC2387F[] interfaceC2387FArr = this.f5306c;
                    if (i4 >= interfaceC2387FArr.length) {
                        return;
                    }
                    c1325g.m3084a();
                    c1325g.m3086c();
                    p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 3);
                    p076T.C0702p c0702p = (p076T.C0702p) this.f5305b.get(i4);
                    java.lang.String str = c0702p.f2408m;
                    p086W.AbstractC0781a.m1415d("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                    java.lang.String str2 = c0702p.f2396a;
                    if (str2 == null) {
                        c1325g.m3086c();
                        str2 = (java.lang.String) c1325g.f5333e;
                    }
                    p076T.C0701o c0701o = new p076T.C0701o();
                    c0701o.f2359a = str2;
                    c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
                    c0701o.f2363e = c0702p.f2400e;
                    c0701o.f2362d = c0702p.f2399d;
                    c0701o.f2354E = c0702p.f2390F;
                    c0701o.f2373o = c0702p.f2411p;
                    p009B2.AbstractC0051h.m158q(c0701o, mo640v);
                    interfaceC2387FArr[i4] = mo640v;
                    i4++;
                }
                break;
            default:
                int i5 = 0;
                while (true) {
                    p215y0.InterfaceC2387F[] interfaceC2387FArr2 = this.f5306c;
                    if (i5 >= interfaceC2387FArr2.length) {
                        return;
                    }
                    c1325g.m3084a();
                    c1325g.m3086c();
                    p215y0.InterfaceC2387F mo640v2 = interfaceC2405q.mo640v(c1325g.f5331c, 3);
                    p076T.C0702p c0702p2 = (p076T.C0702p) this.f5305b.get(i5);
                    java.lang.String str3 = c0702p2.f2408m;
                    p086W.AbstractC0781a.m1415d("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                    p076T.C0701o c0701o2 = new p076T.C0701o();
                    c1325g.m3086c();
                    c0701o2.f2359a = (java.lang.String) c1325g.f5333e;
                    c0701o2.f2370l = p076T.AbstractC0665H.m1201l(str3);
                    c0701o2.f2363e = c0702p2.f2400e;
                    c0701o2.f2362d = c0702p2.f2399d;
                    c0701o2.f2354E = c0702p2.f2390F;
                    c0701o2.f2373o = c0702p2.f2411p;
                    p009B2.AbstractC0051h.m158q(c0701o2, mo640v2);
                    interfaceC2387FArr2[i5] = mo640v2;
                    i5++;
                }
                break;
        }
    }
}
