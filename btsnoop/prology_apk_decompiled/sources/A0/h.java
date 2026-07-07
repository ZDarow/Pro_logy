package A0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import T.H;
import W.r;
import W.y;
import f2.AbstractC0275C;
import f2.G;
import f2.I;
import f2.c0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f46a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47b;

    public h(int i4, c0 c0Var) {
        this.f47b = i4;
        this.f46a = c0Var;
    }

    public static h c(int i4, r rVar) {
        String str;
        a eVar;
        int i5;
        int i6 = 4;
        f2.r.e("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i7 = rVar.f2696c;
        int i8 = 0;
        int i9 = -2;
        int i10 = 0;
        while (rVar.a() > 8) {
            int j4 = rVar.j();
            int j5 = rVar.f2695b + rVar.j();
            rVar.F(j5);
            if (j4 == 1414744396) {
                eVar = c(rVar.j(), rVar);
            } else {
                i iVar = null;
                switch (j4) {
                    case 1718776947:
                        if (i9 != 2) {
                            if (i9 != 1) {
                                W.a.A("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + y.F(i9));
                                break;
                            } else {
                                int n4 = rVar.n();
                                String str2 = n4 != 1 ? n4 != 85 ? n4 != 255 ? n4 != 8192 ? n4 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int n5 = rVar.n();
                                    int j6 = rVar.j();
                                    rVar.H(6);
                                    int A4 = y.A(rVar.n());
                                    int n6 = rVar.a() > 0 ? rVar.n() : i8;
                                    byte[] bArr = new byte[n6];
                                    rVar.f(bArr, i8, n6);
                                    C0094o c0094o = new C0094o();
                                    c0094o.f2290l = H.l(str2);
                                    c0094o.f2302z = n5;
                                    c0094o.f2270A = j6;
                                    if ("audio/raw".equals(str2) && A4 != 0) {
                                        c0094o.f2271B = A4;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && n6 > 0) {
                                        c0094o.f2293o = I.o(bArr);
                                    }
                                    iVar = new i(new C0095p(c0094o));
                                    break;
                                } else {
                                    AbstractC0007h.o(n4, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            rVar.H(i6);
                            int j7 = rVar.j();
                            int j8 = rVar.j();
                            rVar.H(i6);
                            int j9 = rVar.j();
                            switch (j9) {
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
                                C0094o c0094o2 = new C0094o();
                                c0094o2.f2296r = j7;
                                c0094o2.s = j8;
                                c0094o2.g(str);
                                iVar = new i(new C0095p(c0094o2));
                                break;
                            } else {
                                AbstractC0007h.o(j9, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        int j10 = rVar.j();
                        rVar.H(8);
                        int j11 = rVar.j();
                        int j12 = rVar.j();
                        rVar.H(i6);
                        rVar.j();
                        rVar.H(12);
                        eVar = new e(j10, j11, j12);
                        break;
                    case 1752331379:
                        int j13 = rVar.j();
                        rVar.H(12);
                        rVar.j();
                        int j14 = rVar.j();
                        int j15 = rVar.j();
                        rVar.H(i6);
                        int j16 = rVar.j();
                        int j17 = rVar.j();
                        rVar.H(8);
                        eVar = new f(j13, j14, j15, j16, j17);
                        break;
                    case 1852994675:
                        eVar = new j(rVar.s(rVar.a(), e2.d.f5436c));
                        break;
                }
                eVar = iVar;
            }
            if (eVar != null) {
                if (eVar.a() == 1752331379) {
                    int i11 = ((f) eVar).f29a;
                    if (i11 == 1935960438) {
                        i9 = 2;
                    } else if (i11 != 1935963489) {
                        if (i11 != 1937012852) {
                            W.a.A("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i11));
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
                    objArr = Arrays.copyOf(objArr, AbstractC0275C.e(objArr.length, i12));
                }
                objArr[i10] = eVar;
                i10 = i12;
            }
            rVar.G(j5);
            rVar.F(i7);
            i6 = 4;
            i8 = 0;
        }
        return new h(i4, I.h(i10, objArr));
    }

    @Override // A0.a
    public final int a() {
        return this.f47b;
    }

    public final a b(Class cls) {
        G listIterator = this.f46a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
