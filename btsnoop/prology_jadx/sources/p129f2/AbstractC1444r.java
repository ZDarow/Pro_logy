package p129f2;

/* renamed from: f2.r */
/* loaded from: classes.dex */
public abstract class AbstractC1444r {
    /* renamed from: b */
    public static int m3223b(int i4) {
        if (i4 < 3) {
            m3226e("expectedSize", i4);
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) java.lang.Math.ceil(i4 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static void m3224c(int i4, java.lang.Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new java.lang.NullPointerException(p009B2.AbstractC0051h.m152k("at index ", i5));
            }
        }
    }

    /* renamed from: d */
    public static void m3225d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: e */
    public static void m3226e(java.lang.String str, int i4) {
        if (i4 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }

    /* renamed from: g */
    public static java.lang.Object m3227g(int i4) {
        if (i4 < 2 || i4 > 1073741824 || java.lang.Integer.highestOneBit(i4) != i4) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("must be power of 2 between 2^1 and 2^30: ", i4));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    /* renamed from: h */
    public static boolean m3228h(java.util.Map map, java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m3229i(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: j */
    public static p129f2.C1435m0 m3230j(java.util.Set set, p124e2.InterfaceC1359g interfaceC1359g) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof p129f2.C1435m0)) {
                set.getClass();
                return new p129f2.C1435m0(set, interfaceC1359g);
            }
            p129f2.C1435m0 c1435m0 = (p129f2.C1435m0) set;
            p124e2.InterfaceC1359g interfaceC1359g2 = c1435m0.f5793m;
            interfaceC1359g2.getClass();
            return new p129f2.C1435m0(c1435m0.f5792l, new p124e2.C1360h(java.util.Arrays.asList(interfaceC1359g2, interfaceC1359g)));
        }
        java.util.Set set2 = (java.util.SortedSet) set;
        if (!(set2 instanceof p129f2.C1435m0)) {
            set2.getClass();
            return new p129f2.C1435m0(set2, interfaceC1359g);
        }
        p129f2.C1435m0 c1435m02 = (p129f2.C1435m0) set2;
        p124e2.InterfaceC1359g interfaceC1359g3 = c1435m02.f5793m;
        interfaceC1359g3.getClass();
        return new p129f2.C1435m0((java.util.SortedSet) c1435m02.f5792l, new p124e2.C1360h(java.util.Arrays.asList(interfaceC1359g3, interfaceC1359g)));
    }

    /* renamed from: k */
    public static java.lang.Object m3231k(java.util.AbstractCollection abstractCollection, java.lang.String str) {
        java.util.Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    /* renamed from: l */
    public static java.lang.Object m3232l(java.lang.Iterable iterable) {
        java.lang.Object next;
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        java.util.Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: m */
    public static int m3233m(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    /* renamed from: n */
    public static p129f2.C1433l0 m3234n(p129f2.AbstractC1397M abstractC1397M, p129f2.AbstractC1397M abstractC1397M2) {
        if (abstractC1397M == null) {
            throw new java.lang.NullPointerException("set1");
        }
        if (abstractC1397M2 != null) {
            return new p129f2.C1433l0(abstractC1397M, abstractC1397M2);
        }
        throw new java.lang.NullPointerException("set2");
    }

    /* renamed from: o */
    public static int m3235o(int i4, int i5, int i6) {
        return (i4 & (~i6)) | (i5 & i6);
    }

    /* renamed from: p */
    public static java.util.ArrayList m3236p(java.lang.Object... objArr) {
        int length = objArr.length;
        m3226e("arraySize", length);
        java.util.ArrayList arrayList = new java.util.ArrayList(p101a.AbstractC0936a.m1780R(length + 5 + (length / 10)));
        java.util.Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        m3242v(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = m3235o(r13[r5], r9, r11);
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3237q(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = m3240t(r9)
            r1 = r0 & r11
            int r2 = m3241u(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = p101a.AbstractC0936a.m1814v(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = p101a.AbstractC0936a.m1814v(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            m3242v(r1, r9, r12)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = m3235o(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: p129f2.AbstractC1444r.m3237q(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    /* renamed from: r */
    public static void m3238r(java.util.List list, p124e2.InterfaceC1359g interfaceC1359g, int i4, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (interfaceC1359g.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            list.remove(i6);
        }
    }

    /* renamed from: s */
    public static int m3239s(int i4) {
        return (int) (java.lang.Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    /* renamed from: t */
    public static int m3240t(java.lang.Object obj) {
        return m3239s(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: u */
    public static int m3241u(int i4, java.lang.Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? ((short[]) obj)[i4] & 65535 : ((int[]) obj)[i4];
    }

    /* renamed from: v */
    public static void m3242v(int i4, int i5, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }

    /* renamed from: w */
    public static java.util.AbstractList m3243w(java.util.List list, p124e2.InterfaceC1357e interfaceC1357e) {
        return list instanceof java.util.RandomAccess ? new p129f2.C1402S(list, interfaceC1357e) : new p129f2.C1403T(list, interfaceC1357e);
    }

    /* renamed from: a */
    public p129f2.C1408Y m3244a() {
        m3226e("expectedValuesPerKey", 2);
        return new p129f2.C1408Y(0, this);
    }

    /* renamed from: f */
    public abstract java.util.Map mo3181f();
}
