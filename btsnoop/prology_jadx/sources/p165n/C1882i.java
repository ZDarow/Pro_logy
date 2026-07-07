package p165n;

/* renamed from: n.i */
/* loaded from: classes.dex */
public class C1882i {

    /* renamed from: a */
    public final int f7638a;

    /* renamed from: b */
    public final p129f2.C1408Y f7639b;

    /* renamed from: c */
    public final p046L1.C0363g f7640c;

    /* renamed from: d */
    public int f7641d;

    /* renamed from: e */
    public int f7642e;

    /* renamed from: f */
    public int f7643f;

    public C1882i(int i4) {
        this.f7638a = i4;
        if (i4 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f7639b = new p129f2.C1408Y(21);
        this.f7640c = new p046L1.C0363g(28, false);
    }

    /* renamed from: a */
    public final java.lang.Object m3862a(java.lang.Object obj) {
        p154k3.AbstractC1803h.m3779e(obj, "key");
        synchronized (this.f7640c) {
            p129f2.C1408Y c1408y = this.f7639b;
            c1408y.getClass();
            java.lang.Object obj2 = ((java.util.LinkedHashMap) c1408y.f5729m).get(obj);
            if (obj2 != null) {
                this.f7642e++;
                return obj2;
            }
            this.f7643f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        return r6;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3863b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            p154k3.AbstractC1803h.m3779e(r6, r0)
            L1.g r0 = r5.f7640c
            monitor-enter(r0)
            int r1 = r5.f7641d     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + 1
            r5.f7641d = r1     // Catch: java.lang.Throwable -> L24
            f2.Y r1 = r5.f7639b     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.f5729m     // Catch: java.lang.Throwable -> L24
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L27
            int r7 = r5.f7641d     // Catch: java.lang.Throwable -> L24
            int r7 = r7 + (-1)
            r5.f7641d = r7     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r6 = move-exception
            goto Lc1
        L27:
            monitor-exit(r0)
            int r7 = r5.f7638a
        L2a:
            L1.g r0 = r5.f7640c
            monitor-enter(r0)
            int r1 = r5.f7641d     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb7
            f2.Y r1 = r5.f7639b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f5729m     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r5.f7641d     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb7
            goto L45
        L42:
            r6 = move-exception
            goto Lbf
        L45:
            int r1 = r5.f7641d     // Catch: java.lang.Throwable -> L42
            if (r1 <= r7) goto Lb5
            f2.Y r1 = r5.f7639b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f5729m     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L56
            goto Lb5
        L56:
            f2.Y r1 = r5.f7639b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f5729m     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "map.entries"
            p154k3.AbstractC1803h.m3778d(r1, r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L79
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L73
            goto L88
        L73:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L88
        L79:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L84
            goto L88
        L84:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L88:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L8e
            monitor-exit(r0)
            goto Lb6
        L8e:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            f2.Y r3 = r5.f7639b     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "key"
            p154k3.AbstractC1803h.m3779e(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.f5729m     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r5.f7641d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "value"
            p154k3.AbstractC1803h.m3779e(r2, r3)     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r5.f7641d = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L2a
        Lb5:
            monitor-exit(r0)
        Lb6:
            return r6
        Lb7:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L42
        Lbf:
            monitor-exit(r0)
            throw r6
        Lc1:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p165n.C1882i.m3863b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.f7640c) {
            try {
                int i4 = this.f7642e;
                int i5 = this.f7643f + i4;
                str = "LruCache[maxSize=" + this.f7638a + ",hits=" + this.f7642e + ",misses=" + this.f7643f + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
