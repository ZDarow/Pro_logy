package p002A0;

/* renamed from: A0.h */
/* loaded from: classes.dex */
public final class C0010h implements p002A0.InterfaceC0003a {

    /* renamed from: a */
    public final p129f2.C1415c0 f46a;

    /* renamed from: b */
    public final int f47b;

    public C0010h(int i4, p129f2.C1415c0 c1415c0) {
        this.f47b = i4;
        this.f46a = c1415c0;
    }

    /* renamed from: c */
    public static p002A0.C0010h m40c(int i4, p086W.C0798r c0798r) {
        java.lang.String str;
        p002A0.InterfaceC0003a c0007e;
        int i5;
        int i6 = 4;
        p129f2.AbstractC1444r.m3226e("initialCapacity", 4);
        java.lang.Object[] objArr = new java.lang.Object[4];
        int i7 = c0798r.f2788c;
        int i8 = 0;
        int i9 = -2;
        int i10 = 0;
        while (c0798r.m1539a() > 8) {
            int m1548j = c0798r.m1548j();
            int m1548j2 = c0798r.f2787b + c0798r.m1548j();
            c0798r.m1536F(m1548j2);
            if (m1548j == 1414744396) {
                c0007e = m40c(c0798r.m1548j(), c0798r);
            } else {
                p002A0.C0011i c0011i = null;
                switch (m1548j) {
                    case 1718776947:
                        if (i9 != 2) {
                            if (i9 != 1) {
                                p086W.AbstractC0781a.m1410A("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + p086W.AbstractC0805y.m1585F(i9));
                                break;
                            } else {
                                int m1552n = c0798r.m1552n();
                                java.lang.String str2 = m1552n != 1 ? m1552n != 85 ? m1552n != 255 ? m1552n != 8192 ? m1552n != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int m1552n2 = c0798r.m1552n();
                                    int m1548j3 = c0798r.m1548j();
                                    c0798r.m1538H(6);
                                    int m1580A = p086W.AbstractC0805y.m1580A(c0798r.m1552n());
                                    int m1552n3 = c0798r.m1539a() > 0 ? c0798r.m1552n() : i8;
                                    byte[] bArr = new byte[m1552n3];
                                    c0798r.m1544f(bArr, i8, m1552n3);
                                    p076T.C0701o c0701o = new p076T.C0701o();
                                    c0701o.f2370l = p076T.AbstractC0665H.m1201l(str2);
                                    c0701o.f2384z = m1552n2;
                                    c0701o.f2350A = m1548j3;
                                    if ("audio/raw".equals(str2) && m1580A != 0) {
                                        c0701o.f2351B = m1580A;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && m1552n3 > 0) {
                                        c0701o.f2373o = p129f2.AbstractC1393I.m3166o(bArr);
                                    }
                                    c0011i = new p002A0.C0011i(new p076T.C0702p(c0701o));
                                    break;
                                } else {
                                    p009B2.AbstractC0051h.m156o(m1552n, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            c0798r.m1538H(i6);
                            int m1548j4 = c0798r.m1548j();
                            int m1548j5 = c0798r.m1548j();
                            c0798r.m1538H(i6);
                            int m1548j6 = c0798r.m1548j();
                            switch (m1548j6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                p076T.C0701o c0701o2 = new p076T.C0701o();
                                c0701o2.f2376r = m1548j4;
                                c0701o2.f2377s = m1548j5;
                                c0701o2.m1293g(str);
                                c0011i = new p002A0.C0011i(new p076T.C0702p(c0701o2));
                                break;
                            } else {
                                p009B2.AbstractC0051h.m156o(m1548j6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        int m1548j7 = c0798r.m1548j();
                        c0798r.m1538H(8);
                        int m1548j8 = c0798r.m1548j();
                        int m1548j9 = c0798r.m1548j();
                        c0798r.m1538H(i6);
                        c0798r.m1548j();
                        c0798r.m1538H(12);
                        c0007e = new p002A0.C0007e(m1548j7, m1548j8, m1548j9);
                        break;
                    case 1752331379:
                        int m1548j10 = c0798r.m1548j();
                        c0798r.m1538H(12);
                        c0798r.m1548j();
                        int m1548j11 = c0798r.m1548j();
                        int m1548j12 = c0798r.m1548j();
                        c0798r.m1538H(i6);
                        int m1548j13 = c0798r.m1548j();
                        int m1548j14 = c0798r.m1548j();
                        c0798r.m1538H(8);
                        c0007e = new p002A0.C0008f(m1548j10, m1548j11, m1548j12, m1548j13, m1548j14);
                        break;
                    case 1852994675:
                        c0007e = new p002A0.C0012j(c0798r.m1557s(c0798r.m1539a(), p124e2.AbstractC1356d.f5630c));
                        break;
                }
                c0007e = c0011i;
            }
            if (c0007e != null) {
                if (c0007e.mo30a() == 1752331379) {
                    int i11 = ((p002A0.C0008f) c0007e).f29a;
                    if (i11 == 1935960438) {
                        i9 = 2;
                    } else if (i11 != 1935963489) {
                        if (i11 != 1937012852) {
                            p086W.AbstractC0781a.m1410A("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + java.lang.Integer.toHexString(i11));
                            i5 = -1;
                        } else {
                            i5 = 3;
                        }
                        i9 = i5;
                    } else {
                        i9 = 1;
                    }
                }
                int i12 = i10 + 1;
                if (objArr.length < i12) {
                    objArr = java.util.Arrays.copyOf(objArr, p129f2.AbstractC1387C.m3144e(objArr.length, i12));
                }
                objArr[i10] = c0007e;
                i10 = i12;
            }
            c0798r.m1537G(m1548j2);
            c0798r.m1536F(i7);
            i6 = 4;
            i8 = 0;
        }
        return new p002A0.C0010h(i4, p129f2.AbstractC1393I.m3160h(i10, objArr));
    }

    @Override // p002A0.InterfaceC0003a
    /* renamed from: a */
    public final int mo30a() {
        return this.f47b;
    }

    /* renamed from: b */
    public final p002A0.InterfaceC0003a m41b(java.lang.Class cls) {
        p129f2.C1391G listIterator = this.f46a.listIterator(0);
        while (listIterator.hasNext()) {
            p002A0.InterfaceC0003a interfaceC0003a = (p002A0.InterfaceC0003a) listIterator.next();
            if (interfaceC0003a.getClass() == cls) {
                return interfaceC0003a;
            }
        }
        return null;
    }
}
