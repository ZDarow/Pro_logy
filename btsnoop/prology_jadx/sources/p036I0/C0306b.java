package p036I0;

/* renamed from: I0.b */
/* loaded from: classes.dex */
public final class C0306b extends p176p1.AbstractC1949a {

    /* renamed from: a */
    public final /* synthetic */ int f921a;

    /* renamed from: d0 */
    public static p039J0.C0310a m708d0(p086W.C0798r c0798r) {
        java.lang.String m1554p = c0798r.m1554p();
        m1554p.getClass();
        java.lang.String m1554p2 = c0798r.m1554p();
        m1554p2.getClass();
        return new p039J0.C0310a(m1554p, m1554p2, c0798r.m1553o(), c0798r.m1553o(), java.util.Arrays.copyOfRange(c0798r.f2786a, c0798r.f2787b, c0798r.f2788c));
    }

    @Override // p176p1.AbstractC1949a
    /* renamed from: v */
    public final p076T.C0664G mo709v(p032H0.C0244a c0244a, java.nio.ByteBuffer byteBuffer) {
        switch (this.f921a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    p086W.C0797q c0797q = new p086W.C0797q(byteBuffer.array(), byteBuffer.limit());
                    int i4 = 12;
                    c0797q.m1529t(12);
                    int m1515f = (c0797q.m1515f() + c0797q.m1518i(12)) - 4;
                    c0797q.m1529t(44);
                    c0797q.m1530u(c0797q.m1518i(12));
                    c0797q.m1529t(16);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (c0797q.m1515f() < m1515f) {
                        c0797q.m1529t(48);
                        int m1518i = c0797q.m1518i(8);
                        c0797q.m1529t(4);
                        int m1515f2 = c0797q.m1515f() + c0797q.m1518i(i4);
                        java.lang.String str = null;
                        java.lang.String str2 = null;
                        while (c0797q.m1515f() < m1515f2) {
                            int m1518i2 = c0797q.m1518i(8);
                            int m1518i3 = c0797q.m1518i(8);
                            int m1515f3 = c0797q.m1515f() + m1518i3;
                            if (m1518i2 == 2) {
                                int m1518i4 = c0797q.m1518i(16);
                                c0797q.m1529t(8);
                                if (m1518i4 == 3) {
                                    while (c0797q.m1515f() < m1515f3) {
                                        int m1518i5 = c0797q.m1518i(8);
                                        java.nio.charset.Charset charset = p124e2.AbstractC1356d.f5628a;
                                        byte[] bArr = new byte[m1518i5];
                                        c0797q.m1521l(bArr, m1518i5);
                                        java.lang.String str3 = new java.lang.String(bArr, charset);
                                        int m1518i6 = c0797q.m1518i(8);
                                        for (int i5 = 0; i5 < m1518i6; i5++) {
                                            c0797q.m1530u(c0797q.m1518i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (m1518i2 == 21) {
                                java.nio.charset.Charset charset2 = p124e2.AbstractC1356d.f5628a;
                                byte[] bArr2 = new byte[m1518i3];
                                c0797q.m1521l(bArr2, m1518i3);
                                str2 = new java.lang.String(bArr2, charset2);
                            }
                            c0797q.m1526q(m1515f3 * 8);
                        }
                        c0797q.m1526q(m1515f2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new p036I0.C0305a(str.concat(str2), m1518i));
                        }
                        i4 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new p076T.C0664G(arrayList);
                    }
                }
                return null;
            default:
                return new p076T.C0664G(m708d0(new p086W.C0798r(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
