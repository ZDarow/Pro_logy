package p155l;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C1820f implements java.lang.Iterable {

    /* renamed from: l */
    public p155l.C1817c f7387l;

    /* renamed from: m */
    public p155l.C1817c f7388m;

    /* renamed from: n */
    public final java.util.WeakHashMap f7389n = new java.util.WeakHashMap();

    /* renamed from: o */
    public int f7390o = 0;

    /* renamed from: a */
    public p155l.C1817c mo3792a(java.lang.Object obj) {
        p155l.C1817c c1817c = this.f7387l;
        while (c1817c != null && !c1817c.f7380l.equals(obj)) {
            c1817c = c1817c.f7382n;
        }
        return c1817c;
    }

    /* renamed from: b */
    public java.lang.Object mo3793b(java.lang.Object obj) {
        p155l.C1817c mo3792a = mo3792a(obj);
        if (mo3792a == null) {
            return null;
        }
        this.f7390o--;
        java.util.WeakHashMap weakHashMap = this.f7389n;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((p155l.AbstractC1819e) it.next()).mo3794a(mo3792a);
            }
        }
        p155l.C1817c c1817c = mo3792a.f7383o;
        if (c1817c != null) {
            c1817c.f7382n = mo3792a.f7382n;
        } else {
            this.f7387l = mo3792a.f7382n;
        }
        p155l.C1817c c1817c2 = mo3792a.f7382n;
        if (c1817c2 != null) {
            c1817c2.f7383o = c1817c;
        } else {
            this.f7388m = c1817c;
        }
        mo3792a.f7382n = null;
        mo3792a.f7383o = null;
        return mo3792a.f7381m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p155l.C1816b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p155l.C1820f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.f r7 = (p155l.C1820f) r7
            int r1 = r6.f7390o
            int r3 = r7.f7390o
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.b r3 = (p155l.C1816b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.b r4 = (p155l.C1816b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.b r7 = (p155l.C1816b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155l.C1820f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        java.util.Iterator it = iterator();
        int i4 = 0;
        while (true) {
            p155l.C1816b c1816b = (p155l.C1816b) it;
            if (!c1816b.hasNext()) {
                return i4;
            }
            i4 += ((java.util.Map.Entry) c1816b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        p155l.C1816b c1816b = new p155l.C1816b(this.f7387l, this.f7388m, 0);
        this.f7389n.put(c1816b, java.lang.Boolean.FALSE);
        return c1816b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (true) {
            p155l.C1816b c1816b = (p155l.C1816b) it;
            if (!c1816b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((java.util.Map.Entry) c1816b.next()).toString());
            if (c1816b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
