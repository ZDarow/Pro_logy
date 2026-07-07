package C3;

import B2.AbstractC0007h;
import B3.l;
import B3.p;
import B3.s;
import a3.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import q3.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f381a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<e> asList;
        String str = l.f250m;
        l u4 = F1.g.u("/", false);
        Z2.b[] bVarArr = {new Z2.b(u4, new e(u4))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.Q(1));
        o.R(linkedHashMap, bVarArr);
        f fVar = new f(0);
        if (arrayList.size() <= 1) {
            asList = a3.d.h0(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            k3.h.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, fVar);
            }
            asList = Arrays.asList(array);
            k3.h.d(asList, "asList(...)");
        }
        for (e eVar : asList) {
            if (((e) linkedHashMap.put(eVar.f391a, eVar)) == null) {
                while (true) {
                    l lVar = eVar.f391a;
                    l c4 = lVar.c();
                    if (c4 != null) {
                        e eVar2 = (e) linkedHashMap.get(c4);
                        if (eVar2 != null) {
                            eVar2.f396f.add(lVar);
                            break;
                        }
                        e eVar3 = new e(c4);
                        linkedHashMap.put(c4, eVar3);
                        eVar3.f396f.add(lVar);
                        eVar = eVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i4) {
        U1.a.e(16);
        String num = Integer.toString(i4, 16);
        k3.h.d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [k3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [k3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [k3.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [k3.o, java.lang.Object] */
    public static final e c(p pVar) {
        Long valueOf;
        int i4;
        long j4;
        int a4 = pVar.a();
        if (a4 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(a4));
        }
        pVar.g(4L);
        short c4 = pVar.c();
        int i5 = c4 & 65535;
        if ((c4 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i5));
        }
        int c5 = pVar.c() & 65535;
        short c6 = pVar.c();
        int i6 = c6 & 65535;
        short c7 = pVar.c();
        int i7 = c7 & 65535;
        if (i6 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i7 >> 9) & 127) + 1980, ((i7 >> 5) & 15) - 1, c7 & 31, (i6 >> 11) & 31, (i6 >> 5) & 63, (c6 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l4 = valueOf;
        pVar.a();
        ?? obj = new Object();
        obj.f7103l = pVar.a() & 4294967295L;
        ?? obj2 = new Object();
        obj2.f7103l = pVar.a() & 4294967295L;
        int c8 = pVar.c() & 65535;
        int c9 = pVar.c() & 65535;
        int c10 = pVar.c() & 65535;
        pVar.g(8L);
        ?? obj3 = new Object();
        obj3.f7103l = pVar.a() & 4294967295L;
        String e4 = pVar.e(c8);
        if (i.k0(e4, (char) 0, false, 2) >= 0) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (obj2.f7103l == 4294967295L) {
            j4 = 8;
            i4 = c5;
        } else {
            i4 = c5;
            j4 = 0;
        }
        if (obj.f7103l == 4294967295L) {
            j4 += 8;
        }
        if (obj3.f7103l == 4294967295L) {
            j4 += 8;
        }
        long j5 = j4;
        ?? obj4 = new Object();
        d(pVar, c9, new g(obj4, j5, obj2, pVar, obj, obj3));
        if (j5 > 0 && !obj4.f7101l) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String e5 = pVar.e(c10);
        String str = l.f250m;
        return new e(F1.g.u("/", false).d(e4), e4.endsWith("/"), e5, obj.f7103l, obj2.f7103l, i4, l4, obj3.f7103l);
    }

    public static final void d(p pVar, int i4, j3.p pVar2) {
        long j4 = i4;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int c4 = pVar.c() & 65535;
            long c5 = pVar.c() & 65535;
            long j5 = j4 - 4;
            if (j5 < c5) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            pVar.f(c5);
            B3.a aVar = pVar.f258m;
            long j6 = aVar.f224m;
            pVar2.h(Integer.valueOf(c4), Long.valueOf(c5));
            long j7 = (aVar.f224m + c5) - j6;
            if (j7 < 0) {
                throw new IOException(AbstractC0007h.k("unsupported zip: too many bytes processed for ", c4));
            }
            if (j7 > 0) {
                aVar.i(j7);
            }
            j4 = j5 - c5;
        }
    }

    public static final int e(s sVar, int i4) {
        int i5;
        k3.h.e(sVar, "<this>");
        int i6 = i4 + 1;
        int length = sVar.f270p.length;
        int[] iArr = sVar.f271q;
        k3.h.e(iArr, "<this>");
        int i7 = length - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i5 = (i8 + i7) >>> 1;
                int i9 = iArr[i5];
                if (i9 >= i6) {
                    if (i9 <= i6) {
                        break;
                    }
                    i7 = i5 - 1;
                } else {
                    i8 = i5 + 1;
                }
            } else {
                i5 = (-i8) - 1;
                break;
            }
        }
        return i5 >= 0 ? i5 : ~i5;
    }
}
