package p073S0;

/* renamed from: S0.t */
/* loaded from: classes.dex */
public abstract class AbstractC0642t {

    /* renamed from: a */
    public static final int[] f2083a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static byte[] m1167a(java.util.UUID uuid, java.util.UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (java.util.UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: b */
    public static boolean m1168b(int i4, boolean z4) {
        if ((i4 >>> 8) == 3368816) {
            return true;
        }
        if (i4 == 1751476579 && z4) {
            return true;
        }
        int[] iArr = f2083a;
        for (int i5 = 0; i5 < 29; i5++) {
            if (iArr[i5] == i4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static p049M0.C0406e m1169c(int i4, p086W.C0798r c0798r) {
        int m1546h = c0798r.m1546h();
        if (c0798r.m1546h() == 1684108385) {
            c0798r.m1538H(8);
            java.lang.String m1555q = c0798r.m1555q(m1546h - 16);
            return new p049M0.C0406e("und", m1555q, m1555q);
        }
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse comment attribute: " + p073S0.AbstractC0625c.m1135b(i4));
        return null;
    }

    /* renamed from: d */
    public static p049M0.C0402a m1170d(p086W.C0798r c0798r) {
        int m1546h = c0798r.m1546h();
        if (c0798r.m1546h() != 1684108385) {
            p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m1546h2 = c0798r.m1546h() & 16777215;
        java.lang.String str = m1546h2 == 13 ? "image/jpeg" : m1546h2 == 14 ? "image/png" : null;
        if (str == null) {
            p009B2.AbstractC0051h.m156o(m1546h2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c0798r.m1538H(4);
        int i4 = m1546h - 16;
        byte[] bArr = new byte[i4];
        c0798r.m1544f(bArr, 0, i4);
        return new p049M0.C0402a(str, null, 3, bArr);
    }

    /* renamed from: e */
    public static p049M0.C0415n m1171e(int i4, p086W.C0798r c0798r, java.lang.String str) {
        int m1546h = c0798r.m1546h();
        if (c0798r.m1546h() == 1684108385 && m1546h >= 22) {
            c0798r.m1538H(10);
            int m1531A = c0798r.m1531A();
            if (m1531A > 0) {
                java.lang.String m152k = p009B2.AbstractC0051h.m152k("", m1531A);
                int m1531A2 = c0798r.m1531A();
                if (m1531A2 > 0) {
                    m152k = m152k + "/" + m1531A2;
                }
                return new p049M0.C0415n(str, null, p129f2.AbstractC1393I.m3166o(m152k));
            }
        }
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse index/count attribute: " + p073S0.AbstractC0625c.m1135b(i4));
        return null;
    }

    /* renamed from: f */
    public static int m1172f(p086W.C0798r c0798r) {
        int m1546h = c0798r.m1546h();
        if (c0798r.m1546h() == 1684108385) {
            c0798r.m1538H(8);
            int i4 = m1546h - 16;
            if (i4 == 1) {
                return c0798r.m1559u();
            }
            if (i4 == 2) {
                return c0798r.m1531A();
            }
            if (i4 == 3) {
                return c0798r.m1562x();
            }
            if (i4 == 4 && (c0798r.m1543e() & 128) == 0) {
                return c0798r.m1563y();
            }
        }
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: g */
    public static p049M0.AbstractC0410i m1173g(int i4, java.lang.String str, p086W.C0798r c0798r, boolean z4, boolean z5) {
        int m1172f = m1172f(c0798r);
        if (z5) {
            m1172f = java.lang.Math.min(1, m1172f);
        }
        if (m1172f >= 0) {
            return z4 ? new p049M0.C0415n(str, null, p129f2.AbstractC1393I.m3166o(java.lang.Integer.toString(m1172f))) : new p049M0.C0406e("und", str, java.lang.Integer.toString(m1172f));
        }
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse uint8 attribute: " + p073S0.AbstractC0625c.m1135b(i4));
        return null;
    }

    /* renamed from: h */
    public static p043K2.C0339o m1174h(byte[] bArr) {
        p086W.C0798r c0798r = new p086W.C0798r(bArr);
        if (c0798r.f2788c < 32) {
            return null;
        }
        c0798r.m1537G(0);
        int m1539a = c0798r.m1539a();
        int m1546h = c0798r.m1546h();
        if (m1546h != m1539a) {
            p086W.AbstractC0781a.m1410A("PsshAtomUtil", "Advertised atom size (" + m1546h + ") does not match buffer size: " + m1539a);
            return null;
        }
        int m1546h2 = c0798r.m1546h();
        if (m1546h2 != 1886614376) {
            p009B2.AbstractC0051h.m156o(m1546h2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int m1136d = p073S0.AbstractC0625c.m1136d(c0798r.m1546h());
        if (m1136d > 1) {
            p009B2.AbstractC0051h.m156o(m1136d, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(c0798r.m1553o(), c0798r.m1553o());
        if (m1136d == 1) {
            int m1563y = c0798r.m1563y();
            java.util.UUID[] uuidArr = new java.util.UUID[m1563y];
            for (int i4 = 0; i4 < m1563y; i4++) {
                uuidArr[i4] = new java.util.UUID(c0798r.m1553o(), c0798r.m1553o());
            }
        }
        int m1563y2 = c0798r.m1563y();
        int m1539a2 = c0798r.m1539a();
        if (m1563y2 == m1539a2) {
            byte[] bArr2 = new byte[m1563y2];
            c0798r.m1544f(bArr2, 0, m1563y2);
            return new p043K2.C0339o(uuid, m1136d, bArr2);
        }
        p086W.AbstractC0781a.m1410A("PsshAtomUtil", "Atom data size (" + m1563y2 + ") does not match the bytes left: " + m1539a2);
        return null;
    }

    /* renamed from: i */
    public static p049M0.C0415n m1175i(int i4, p086W.C0798r c0798r, java.lang.String str) {
        int m1546h = c0798r.m1546h();
        if (c0798r.m1546h() == 1684108385) {
            c0798r.m1538H(8);
            return new p049M0.C0415n(str, null, p129f2.AbstractC1393I.m3166o(c0798r.m1555q(m1546h - 16)));
        }
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse text attribute: " + p073S0.AbstractC0625c.m1135b(i4));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, y0.D] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, y0.D] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, y0.D] */
    /* renamed from: j */
    public static p215y0.InterfaceC2385D m1176j(p215y0.InterfaceC2404p interfaceC2404p, boolean z4, boolean z5) {
        int i4;
        long j4;
        long j5;
        int i5;
        int i6;
        boolean z6;
        int[] iArr;
        long j6;
        boolean z7 = true;
        long mo633n = interfaceC2404p.mo633n();
        long j7 = -1;
        long j8 = 4096;
        if (mo633n != -1 && mo633n <= 4096) {
            j8 = mo633n;
        }
        int i7 = (int) j8;
        p086W.C0798r c0798r = new p086W.C0798r(64);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < i7) {
            c0798r.m1534D(8);
            if (!interfaceC2404p.mo634p(c0798r.f2786a, i8, 8, z7)) {
                break;
            }
            long m1561w = c0798r.m1561w();
            int m1546h = c0798r.m1546h();
            if (m1561w == 1) {
                interfaceC2404p.mo642z(c0798r.f2786a, 8, 8);
                i5 = 16;
                c0798r.m1536F(16);
                j5 = c0798r.m1553o();
                j4 = mo633n;
            } else {
                if (m1561w == 0) {
                    long mo633n2 = interfaceC2404p.mo633n();
                    if (mo633n2 != j7) {
                        m1561w = (mo633n2 - interfaceC2404p.mo641w()) + 8;
                    }
                }
                j4 = mo633n;
                j5 = m1561w;
                i5 = 8;
            }
            long j9 = i5;
            if (j5 < j9) {
                return new java.lang.Object();
            }
            i9 += i5;
            if (m1546h == 1836019574) {
                i7 += (int) j5;
                if (mo633n == -1 || i7 <= j4) {
                    j6 = j4;
                } else {
                    j6 = j4;
                    i7 = (int) j6;
                }
                mo633n = j6;
                z7 = true;
            } else {
                if (m1546h == 1836019558 || m1546h == 1836475768) {
                    i4 = 1;
                    break;
                }
                if (m1546h == 1835295092) {
                    z8 = true;
                }
                if ((i9 + j5) - j9 >= i7) {
                    i4 = 0;
                    break;
                }
                int i10 = (int) (j5 - j9);
                i9 += i10;
                if (m1546h != 1718909296) {
                    i6 = 0;
                    z6 = true;
                    if (i10 != 0) {
                        interfaceC2404p.mo617A(i10);
                    }
                } else {
                    if (i10 < 8) {
                        return new java.lang.Object();
                    }
                    c0798r.m1534D(i10);
                    i6 = 0;
                    interfaceC2404p.mo642z(c0798r.f2786a, 0, i10);
                    if (m1168b(c0798r.m1546h(), z5)) {
                        z8 = true;
                    }
                    c0798r.m1538H(4);
                    int m1539a = c0798r.m1539a() / 4;
                    if (!z8 && m1539a > 0) {
                        iArr = new int[m1539a];
                        int i11 = 0;
                        while (true) {
                            if (i11 >= m1539a) {
                                z6 = true;
                                break;
                            }
                            int m1546h2 = c0798r.m1546h();
                            iArr[i11] = m1546h2;
                            if (m1168b(m1546h2, z5)) {
                                z6 = true;
                                z8 = true;
                                break;
                            }
                            i11++;
                        }
                    } else {
                        z6 = true;
                        iArr = null;
                    }
                    if (!z8) {
                        ?? obj = new java.lang.Object();
                        if (iArr != null) {
                            int i12 = p143i2.C1548a.f6430n;
                            if (iArr.length != 0) {
                                new p143i2.C1548a(java.util.Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i13 = p143i2.C1548a.f6430n;
                        }
                        return obj;
                    }
                }
                i8 = i6;
                z7 = z6;
                mo633n = j4;
            }
            j7 = -1;
        }
        i4 = i8;
        if (!z8) {
            return p073S0.C0637o.f2043c;
        }
        if (z4 != i4) {
            return i4 != 0 ? p073S0.C0637o.f2041a : p073S0.C0637o.f2042b;
        }
        return null;
    }
}
