package p094Y;

/* renamed from: Y.o */
/* loaded from: classes.dex */
public final class C0877o implements java.util.Map {

    /* renamed from: l */
    public final java.util.Map f3155l;

    public C0877o(java.util.Map map) {
        this.f3155l = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f3155l.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && this.f3155l.containsKey(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r0.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r4 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            f2.m0 r0 = (p129f2.C1435m0) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            r1 = 1
            if (r4 != 0) goto L23
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L10
            goto L3b
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L23
            goto L3b
        L3a:
            r1 = 0
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p094Y.C0877o.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return p129f2.AbstractC1444r.m3230j(this.f3155l.entrySet(), new p094Y.C0876n(0));
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && p129f2.AbstractC1444r.m3228h(this, obj);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) this.f3155l.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return p129f2.AbstractC1444r.m3233m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        java.util.Map map = this.f3155l;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return p129f2.AbstractC1444r.m3230j(this.f3155l.keySet(), new p094Y.C0876n(1));
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return this.f3155l.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        this.f3155l.putAll(map);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        return this.f3155l.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        java.util.Map map = this.f3155l;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final java.lang.String toString() {
        return this.f3155l.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.f3155l.values();
    }
}
