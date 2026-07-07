package p123e1;

/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C1332f {

    /* renamed from: a */
    public final int f5389a;

    /* renamed from: b */
    public final java.util.List f5390b;

    public C1332f(int i4, java.util.List list) {
        this.f5389a = i4;
        this.f5390b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p123e1.InterfaceC1326H m3095a(int r6, p086W.C0796p r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1332f.m3095a(int, W.p):e1.H");
    }

    /* renamed from: b */
    public java.util.List m3096b(p086W.C0796p c0796p) {
        java.lang.String str;
        int i4;
        boolean m3097c = m3097c(32);
        java.util.List list = this.f5390b;
        if (m3097c) {
            return list;
        }
        p086W.C0798r c0798r = new p086W.C0798r((byte[]) c0796p.f2777d);
        while (c0798r.m1539a() > 0) {
            int m1559u = c0798r.m1559u();
            int m1559u2 = c0798r.f2787b + c0798r.m1559u();
            if (m1559u == 134) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int m1559u3 = c0798r.m1559u() & 31;
                for (int i5 = 0; i5 < m1559u3; i5++) {
                    java.lang.String m1557s = c0798r.m1557s(3, p124e2.AbstractC1356d.f5630c);
                    int m1559u4 = c0798r.m1559u();
                    boolean z4 = (m1559u4 & 128) != 0;
                    if (z4) {
                        i4 = m1559u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte m1559u5 = (byte) c0798r.m1559u();
                    c0798r.m1538H(1);
                    java.util.List singletonList = z4 ? java.util.Collections.singletonList((m1559u5 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    p076T.C0701o c0701o = new p076T.C0701o();
                    c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
                    c0701o.f2362d = m1557s;
                    c0701o.f2354E = i4;
                    c0701o.f2373o = singletonList;
                    arrayList.add(new p076T.C0702p(c0701o));
                }
                list = arrayList;
            }
            c0798r.m1537G(m1559u2);
        }
        return list;
    }

    /* renamed from: c */
    public boolean m3097c(int i4) {
        return (i4 & this.f5389a) != 0;
    }

    public C1332f() {
        this.f5389a = 1;
        this.f5390b = java.util.Collections.singletonList(null);
    }

    public C1332f(java.util.ArrayList arrayList) {
        this.f5389a = 0;
        this.f5390b = arrayList;
    }
}
