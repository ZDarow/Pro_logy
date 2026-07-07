package p129f2;

/* renamed from: f2.h0 */
/* loaded from: classes.dex */
public final class C1425h0 implements java.util.Map, java.io.Serializable {

    /* renamed from: r */
    public static final p129f2.C1425h0 f5764r = new p129f2.C1425h0(null, new java.lang.Object[0], 0);

    /* renamed from: l */
    public transient p129f2.C1419e0 f5765l;

    /* renamed from: m */
    public transient p129f2.C1421f0 f5766m;

    /* renamed from: n */
    public transient p129f2.C1423g0 f5767n;

    /* renamed from: o */
    public final transient java.lang.Object f5768o;

    /* renamed from: p */
    public final transient java.lang.Object[] f5769p;

    /* renamed from: q */
    public final transient int f5770q;

    public C1425h0(java.lang.Object obj, java.lang.Object[] objArr, int i4) {
        this.f5768o = obj;
        this.f5769p = objArr;
        this.f5770q = i4;
    }

    /* renamed from: a */
    public static p129f2.C1425h0 m3214a(java.util.Map map) {
        if ((map instanceof p129f2.C1425h0) && !(map instanceof java.util.SortedMap)) {
            p129f2.C1425h0 c1425h0 = (p129f2.C1425h0) map;
            c1425h0.getClass();
            return c1425h0;
        }
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        p063P2.C0528a c0528a = new p063P2.C0528a(entrySet != null ? entrySet.size() : 4, 5);
        if (entrySet != null) {
            int size = entrySet.size() * 2;
            java.lang.Object[] objArr = (java.lang.Object[]) c0528a.f1552m;
            if (size > objArr.length) {
                c0528a.f1552m = java.util.Arrays.copyOf(objArr, p129f2.AbstractC1387C.m3144e(objArr.length, size));
            }
        }
        for (java.util.Map.Entry entry : entrySet) {
            c0528a.m1028i(entry.getKey(), entry.getValue());
        }
        return c0528a.m1024e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p129f2.C1425h0 m3215b(int r16, java.lang.Object[] r17, p063P2.C0528a r18) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p129f2.C1425h0.m3215b(int, java.lang.Object[], P2.a):f2.h0");
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p129f2.AbstractC1397M entrySet() {
        p129f2.C1419e0 c1419e0 = this.f5765l;
        if (c1419e0 != null) {
            return c1419e0;
        }
        p129f2.C1419e0 c1419e02 = new p129f2.C1419e0(this, this.f5769p, this.f5770q);
        this.f5765l = c1419e02;
        return c1419e02;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final p129f2.AbstractC1397M keySet() {
        p129f2.C1421f0 c1421f0 = this.f5766m;
        if (c1421f0 != null) {
            return c1421f0;
        }
        p129f2.C1421f0 c1421f02 = new p129f2.C1421f0(this, new p129f2.C1423g0(this.f5769p, 0, this.f5770q));
        this.f5766m = c1421f02;
        return c1421f02;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p129f2.AbstractC1388D values() {
        p129f2.C1423g0 c1423g0 = this.f5767n;
        if (c1423g0 != null) {
            return c1423g0;
        }
        p129f2.C1423g0 c1423g02 = new p129f2.C1423g0(this.f5769p, 1, this.f5770q);
        this.f5767n = c1423g02;
        return c1423g02;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return p129f2.AbstractC1444r.m3228h(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f5769p
            int r3 = r8.f5770q
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f5768o
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = p129f2.AbstractC1444r.m3239s(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = p129f2.AbstractC1444r.m3239s(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = p129f2.AbstractC1444r.m3239s(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: p129f2.C1425h0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return p129f2.AbstractC1444r.m3233m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5770q;
    }

    public final java.lang.String toString() {
        int i4 = this.f5770q;
        p129f2.AbstractC1444r.m3226e("size", i4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        p129f2.AbstractC1445r0 it = ((p129f2.C1419e0) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            p129f2.C1391G c1391g = (p129f2.C1391G) it;
            if (!c1391g.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) c1391g.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
    }
}
