package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.H */
/* loaded from: classes.dex */
public final class C1075H extends java.util.LinkedHashMap {

    /* renamed from: m */
    public static final androidx.datastore.preferences.protobuf.C1075H f4157m;

    /* renamed from: l */
    public boolean f4158l = true;

    static {
        androidx.datastore.preferences.protobuf.C1075H c1075h = new androidx.datastore.preferences.protobuf.C1075H();
        f4157m = c1075h;
        c1075h.f4158l = false;
    }

    /* renamed from: a */
    public final void m2374a() {
        if (!this.f4158l) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, androidx.datastore.preferences.protobuf.H] */
    /* renamed from: b */
    public final androidx.datastore.preferences.protobuf.C1075H m2375b() {
        if (isEmpty()) {
            return new androidx.datastore.preferences.protobuf.C1075H();
        }
        ?? linkedHashMap = new java.util.LinkedHashMap(this);
        linkedHashMap.f4158l = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2374a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            r1 = r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1075H.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
                hashCode = bArr.length;
                for (byte b4 : bArr) {
                    hashCode = (hashCode * 31) + b4;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                java.nio.charset.Charset charset2 = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
                hashCode2 = bArr2.length;
                for (byte b5 : bArr2) {
                    hashCode2 = (hashCode2 * 31) + b5;
                }
                if (hashCode2 == 0) {
                    hashCode2 = 1;
                }
            } else {
                hashCode2 = value.hashCode();
            }
            i4 += hashCode ^ hashCode2;
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        m2374a();
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        m2374a();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        m2374a();
        return super.remove(obj);
    }
}
