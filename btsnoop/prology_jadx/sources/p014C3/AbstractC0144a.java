package p014C3;

/* renamed from: C3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0144a {

    /* renamed from: a */
    public static final char[] f389a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final java.util.LinkedHashMap m490a(java.util.ArrayList arrayList) {
        java.util.List<p014C3.C0148e> asList;
        java.lang.String str = p010B3.C0081l.f255m;
        p010B3.C0081l m584u = p025F1.C0215g.m584u("/", false);
        p100Z2.C0929b[] c0929bArr = {new p100Z2.C0929b(m584u, new p014C3.C0148e(m584u))};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p105a3.AbstractC1032o.m2057Q(1));
        p105a3.AbstractC1032o.m2058R(linkedHashMap, c0929bArr);
        p014C3.C0149f c0149f = new p014C3.C0149f(0);
        if (arrayList.size() <= 1) {
            asList = p105a3.AbstractC1021d.m2053h0(arrayList);
        } else {
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
            p154k3.AbstractC1803h.m3779e(array, "<this>");
            if (array.length > 1) {
                java.util.Arrays.sort(array, c0149f);
            }
            asList = java.util.Arrays.asList(array);
            p154k3.AbstractC1803h.m3778d(asList, "asList(...)");
        }
        for (p014C3.C0148e c0148e : asList) {
            if (((p014C3.C0148e) linkedHashMap.put(c0148e.f399a, c0148e)) == null) {
                while (true) {
                    p010B3.C0081l c0081l = c0148e.f399a;
                    p010B3.C0081l m335c = c0081l.m335c();
                    if (m335c != null) {
                        p014C3.C0148e c0148e2 = (p014C3.C0148e) linkedHashMap.get(m335c);
                        if (c0148e2 != null) {
                            c0148e2.f404f.add(c0081l);
                            break;
                        }
                        p014C3.C0148e c0148e3 = new p014C3.C0148e(m335c);
                        linkedHashMap.put(m335c, c0148e3);
                        c0148e3.f404f.add(c0081l);
                        c0148e = c0148e3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static final java.lang.String m491b(int i4) {
        p080U1.AbstractC0748a.m1372e(16);
        java.lang.String num = java.lang.Integer.toString(i4, 16);
        p154k3.AbstractC1803h.m3778d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [k3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [k3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [k3.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [k3.o, java.lang.Object] */
    /* renamed from: c */
    public static final p014C3.C0148e m492c(p010B3.C0085p c0085p) {
        java.lang.Long valueOf;
        int i4;
        long j4;
        int m341a = c0085p.m341a();
        if (m341a != 33639248) {
            throw new java.io.IOException("bad zip: expected " + m491b(33639248) + " but was " + m491b(m341a));
        }
        c0085p.m346g(4L);
        short m343c = c0085p.m343c();
        int i5 = m343c & 65535;
        if ((m343c & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + m491b(i5));
        }
        int m343c2 = c0085p.m343c() & 65535;
        short m343c3 = c0085p.m343c();
        int i6 = m343c3 & 65535;
        short m343c4 = c0085p.m343c();
        int i7 = m343c4 & 65535;
        if (i6 == -1) {
            valueOf = null;
        } else {
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i7 >> 9) & 127) + 1980, ((i7 >> 5) & 15) - 1, m343c4 & 31, (i6 >> 11) & 31, (i6 >> 5) & 63, (m343c3 & 31) << 1);
            valueOf = java.lang.Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        java.lang.Long l4 = valueOf;
        c0085p.m341a();
        ?? obj = new java.lang.Object();
        obj.f7373l = c0085p.m341a() & 4294967295L;
        ?? obj2 = new java.lang.Object();
        obj2.f7373l = c0085p.m341a() & 4294967295L;
        int m343c5 = c0085p.m343c() & 65535;
        int m343c6 = c0085p.m343c() & 65535;
        int m343c7 = c0085p.m343c() & 65535;
        c0085p.m346g(8L);
        ?? obj3 = new java.lang.Object();
        obj3.f7373l = c0085p.m341a() & 4294967295L;
        java.lang.String m344e = c0085p.m344e(m343c5);
        if (p182q3.AbstractC2032i.m4077k0(m344e, (char) 0, false, 2) >= 0) {
            throw new java.io.IOException("bad zip: filename contains 0x00");
        }
        if (obj2.f7373l == 4294967295L) {
            j4 = 8;
            i4 = m343c2;
        } else {
            i4 = m343c2;
            j4 = 0;
        }
        if (obj.f7373l == 4294967295L) {
            j4 += 8;
        }
        if (obj3.f7373l == 4294967295L) {
            j4 += 8;
        }
        long j5 = j4;
        ?? obj4 = new java.lang.Object();
        m493d(c0085p, m343c6, new p014C3.C0150g(obj4, j5, obj2, c0085p, obj, obj3));
        if (j5 > 0 && !obj4.f7371l) {
            throw new java.io.IOException("bad zip: zip64 extra required but absent");
        }
        java.lang.String m344e2 = c0085p.m344e(m343c7);
        java.lang.String str = p010B3.C0081l.f255m;
        return new p014C3.C0148e(p025F1.C0215g.m584u("/", false).m336d(m344e), m344e.endsWith("/"), m344e2, obj.f7373l, obj2.f7373l, i4, l4, obj3.f7373l);
    }

    /* renamed from: d */
    public static final void m493d(p010B3.C0085p c0085p, int i4, p149j3.InterfaceC1741p interfaceC1741p) {
        long j4 = i4;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            int m343c = c0085p.m343c() & 65535;
            long m343c2 = c0085p.m343c() & 65535;
            long j5 = j4 - 4;
            if (j5 < m343c2) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            c0085p.m345f(m343c2);
            p010B3.C0070a c0070a = c0085p.f263m;
            long j6 = c0070a.f229m;
            interfaceC1741p.mo502h(java.lang.Integer.valueOf(m343c), java.lang.Long.valueOf(m343c2));
            long j7 = (c0070a.f229m + m343c2) - j6;
            if (j7 < 0) {
                throw new java.io.IOException(p009B2.AbstractC0051h.m152k("unsupported zip: too many bytes processed for ", m343c));
            }
            if (j7 > 0) {
                c0070a.m298i(j7);
            }
            j4 = j5 - m343c2;
        }
    }

    /* renamed from: e */
    public static final int m494e(p010B3.C0088s c0088s, int i4) {
        int i5;
        p154k3.AbstractC1803h.m3779e(c0088s, "<this>");
        int i6 = i4 + 1;
        int length = c0088s.f275p.length;
        int[] iArr = c0088s.f276q;
        p154k3.AbstractC1803h.m3779e(iArr, "<this>");
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
