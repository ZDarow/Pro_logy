package S0;

import B2.AbstractC0007h;
import f2.I;
import i2.C0343a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import y0.D;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2007a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
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

    public static boolean b(int i4, boolean z4) {
        if ((i4 >>> 8) == 3368816) {
            return true;
        }
        if (i4 == 1751476579 && z4) {
            return true;
        }
        int[] iArr = f2007a;
        for (int i5 = 0; i5 < 29; i5++) {
            if (iArr[i5] == i4) {
                return true;
            }
        }
        return false;
    }

    public static M0.e c(int i4, W.r rVar) {
        int h4 = rVar.h();
        if (rVar.h() == 1684108385) {
            rVar.H(8);
            String q4 = rVar.q(h4 - 16);
            return new M0.e("und", q4, q4);
        }
        W.a.A("MetadataUtil", "Failed to parse comment attribute: " + c.b(i4));
        return null;
    }

    public static M0.a d(W.r rVar) {
        int h4 = rVar.h();
        if (rVar.h() != 1684108385) {
            W.a.A("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int h5 = rVar.h() & 16777215;
        String str = h5 == 13 ? "image/jpeg" : h5 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC0007h.o(h5, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        rVar.H(4);
        int i4 = h4 - 16;
        byte[] bArr = new byte[i4];
        rVar.f(bArr, 0, i4);
        return new M0.a(str, null, 3, bArr);
    }

    public static M0.n e(int i4, W.r rVar, String str) {
        int h4 = rVar.h();
        if (rVar.h() == 1684108385 && h4 >= 22) {
            rVar.H(10);
            int A4 = rVar.A();
            if (A4 > 0) {
                String k4 = AbstractC0007h.k("", A4);
                int A5 = rVar.A();
                if (A5 > 0) {
                    k4 = k4 + "/" + A5;
                }
                return new M0.n(str, null, I.o(k4));
            }
        }
        W.a.A("MetadataUtil", "Failed to parse index/count attribute: " + c.b(i4));
        return null;
    }

    public static int f(W.r rVar) {
        int h4 = rVar.h();
        if (rVar.h() == 1684108385) {
            rVar.H(8);
            int i4 = h4 - 16;
            if (i4 == 1) {
                return rVar.u();
            }
            if (i4 == 2) {
                return rVar.A();
            }
            if (i4 == 3) {
                return rVar.x();
            }
            if (i4 == 4 && (rVar.e() & 128) == 0) {
                return rVar.y();
            }
        }
        W.a.A("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static M0.i g(int i4, String str, W.r rVar, boolean z4, boolean z5) {
        int f4 = f(rVar);
        if (z5) {
            f4 = Math.min(1, f4);
        }
        if (f4 >= 0) {
            return z4 ? new M0.n(str, null, I.o(Integer.toString(f4))) : new M0.e("und", str, Integer.toString(f4));
        }
        W.a.A("MetadataUtil", "Failed to parse uint8 attribute: " + c.b(i4));
        return null;
    }

    public static K2.o h(byte[] bArr) {
        W.r rVar = new W.r(bArr);
        if (rVar.f2696c < 32) {
            return null;
        }
        rVar.G(0);
        int a4 = rVar.a();
        int h4 = rVar.h();
        if (h4 != a4) {
            W.a.A("PsshAtomUtil", "Advertised atom size (" + h4 + ") does not match buffer size: " + a4);
            return null;
        }
        int h5 = rVar.h();
        if (h5 != 1886614376) {
            AbstractC0007h.o(h5, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int d4 = c.d(rVar.h());
        if (d4 > 1) {
            AbstractC0007h.o(d4, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(rVar.o(), rVar.o());
        if (d4 == 1) {
            int y4 = rVar.y();
            UUID[] uuidArr = new UUID[y4];
            for (int i4 = 0; i4 < y4; i4++) {
                uuidArr[i4] = new UUID(rVar.o(), rVar.o());
            }
        }
        int y5 = rVar.y();
        int a5 = rVar.a();
        if (y5 == a5) {
            byte[] bArr2 = new byte[y5];
            rVar.f(bArr2, 0, y5);
            return new K2.o(uuid, d4, bArr2);
        }
        W.a.A("PsshAtomUtil", "Atom data size (" + y5 + ") does not match the bytes left: " + a5);
        return null;
    }

    public static M0.n i(int i4, W.r rVar, String str) {
        int h4 = rVar.h();
        if (rVar.h() == 1684108385) {
            rVar.H(8);
            return new M0.n(str, null, I.o(rVar.q(h4 - 16)));
        }
        W.a.A("MetadataUtil", "Failed to parse text attribute: " + c.b(i4));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, y0.D] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, y0.D] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, y0.D] */
    public static D j(y0.p pVar, boolean z4, boolean z5) {
        int i4;
        long j4;
        long j5;
        int i5;
        int i6;
        boolean z6;
        int[] iArr;
        long j6;
        boolean z7 = true;
        long n4 = pVar.n();
        long j7 = -1;
        long j8 = 4096;
        if (n4 != -1 && n4 <= 4096) {
            j8 = n4;
        }
        int i7 = (int) j8;
        W.r rVar = new W.r(64);
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < i7) {
            rVar.D(8);
            if (!pVar.p(rVar.f2694a, i8, 8, z7)) {
                break;
            }
            long w = rVar.w();
            int h4 = rVar.h();
            if (w == 1) {
                pVar.z(rVar.f2694a, 8, 8);
                i5 = 16;
                rVar.F(16);
                j5 = rVar.o();
                j4 = n4;
            } else {
                if (w == 0) {
                    long n5 = pVar.n();
                    if (n5 != j7) {
                        w = (n5 - pVar.w()) + 8;
                    }
                }
                j4 = n4;
                j5 = w;
                i5 = 8;
            }
            long j9 = i5;
            if (j5 < j9) {
                return new Object();
            }
            i9 += i5;
            if (h4 == 1836019574) {
                i7 += (int) j5;
                if (n4 == -1 || i7 <= j4) {
                    j6 = j4;
                } else {
                    j6 = j4;
                    i7 = (int) j6;
                }
                n4 = j6;
                z7 = true;
            } else {
                if (h4 == 1836019558 || h4 == 1836475768) {
                    i4 = 1;
                    break;
                }
                if (h4 == 1835295092) {
                    z8 = true;
                }
                if ((i9 + j5) - j9 >= i7) {
                    i4 = 0;
                    break;
                }
                int i10 = (int) (j5 - j9);
                i9 += i10;
                if (h4 != 1718909296) {
                    i6 = 0;
                    z6 = true;
                    if (i10 != 0) {
                        pVar.A(i10);
                    }
                } else {
                    if (i10 < 8) {
                        return new Object();
                    }
                    rVar.D(i10);
                    i6 = 0;
                    pVar.z(rVar.f2694a, 0, i10);
                    if (b(rVar.h(), z5)) {
                        z8 = true;
                    }
                    rVar.H(4);
                    int a4 = rVar.a() / 4;
                    if (!z8 && a4 > 0) {
                        iArr = new int[a4];
                        int i11 = 0;
                        while (true) {
                            if (i11 >= a4) {
                                z6 = true;
                                break;
                            }
                            int h5 = rVar.h();
                            iArr[i11] = h5;
                            if (b(h5, z5)) {
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
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i12 = C0343a.f6200n;
                            if (iArr.length != 0) {
                                new C0343a(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i13 = C0343a.f6200n;
                        }
                        return obj;
                    }
                }
                i8 = i6;
                z7 = z6;
                n4 = j4;
            }
            j7 = -1;
        }
        i4 = i8;
        if (!z8) {
            return o.f1969c;
        }
        if (z4 != i4) {
            return i4 != 0 ? o.f1967a : o.f1968b;
        }
        return null;
    }
}
