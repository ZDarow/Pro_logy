package p048M;

/* renamed from: M.b */
/* loaded from: classes.dex */
public final class C0395b {

    /* renamed from: a */
    public final java.util.Map f1142a;

    /* renamed from: b */
    public final p040K.C0311a f1143b;

    public C0395b(java.util.Map map, boolean z4) {
        p154k3.AbstractC1803h.m3779e(map, "preferencesMap");
        this.f1142a = map;
        this.f1143b = new p040K.C0311a(z4);
    }

    /* renamed from: a */
    public final java.util.Map m854a() {
        p100Z2.C0929b c0929b;
        java.util.Set<java.util.Map.Entry> entrySet = this.f1142a.entrySet();
        p154k3.AbstractC1803h.m3779e(entrySet, "<this>");
        int m2057Q = p105a3.AbstractC1032o.m2057Q(entrySet.size());
        if (m2057Q < 16) {
            m2057Q = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(m2057Q);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, size)");
                c0929b = new p100Z2.C0929b(key, copyOf);
            } else {
                c0929b = new p100Z2.C0929b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c0929b.f3291l, c0929b.f3292m);
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        p154k3.AbstractC1803h.m3778d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    /* renamed from: b */
    public final void m855b() {
        if (this.f1143b.f931a.get()) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* renamed from: c */
    public final java.lang.Object m856c(p048M.C0397d c0397d) {
        p154k3.AbstractC1803h.m3779e(c0397d, "key");
        java.lang.Object obj = this.f1142a.get(c0397d);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: d */
    public final void m857d(p048M.C0397d c0397d, java.lang.Object obj) {
        m855b();
        java.util.Map map = this.f1142a;
        if (obj == null) {
            m855b();
            map.remove(c0397d);
            return;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(p105a3.AbstractC1021d.m2055j0((java.util.Set) obj));
            p154k3.AbstractC1803h.m3778d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(c0397d, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(c0397d, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, size)");
            map.put(c0397d, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p048M.C0395b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            M.b r7 = (p048M.C0395b) r7
            java.util.Map r0 = r7.f1142a
            java.util.Map r2 = r6.f1142a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f1142a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r3
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = r3
            goto L61
        L5b:
            boolean r0 = p154k3.AbstractC1803h.m3775a(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p048M.C0395b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        java.util.Iterator it = this.f1142a.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            i4 += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i4;
    }

    public final java.lang.String toString() {
        return p105a3.AbstractC1021d.m2051f0(this.f1142a.entrySet(), ",\n", "{\n", "\n}", p048M.C0394a.f1141m, 24);
    }

    public /* synthetic */ C0395b(boolean z4) {
        this(new java.util.LinkedHashMap(), z4);
    }
}
