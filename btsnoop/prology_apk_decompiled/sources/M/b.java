package M;

import a3.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final K.a f1104b;

    public b(Map map, boolean z4) {
        k3.h.e(map, "preferencesMap");
        this.f1103a = map;
        this.f1104b = new K.a(z4);
    }

    public final Map a() {
        Z2.b bVar;
        Set<Map.Entry> entrySet = this.f1103a.entrySet();
        k3.h.e(entrySet, "<this>");
        int Q3 = o.Q(entrySet.size());
        if (Q3 < 16) {
            Q3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q3);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                k3.h.d(copyOf, "copyOf(this, size)");
                bVar = new Z2.b(key, copyOf);
            } else {
                bVar = new Z2.b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(bVar.f3179l, bVar.f3180m);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k3.h.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f1104b.f897a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        k3.h.e(dVar, "key");
        Object obj = this.f1103a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        k3.h.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f1103a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(a3.d.j0((Set) obj));
            k3.h.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            k3.h.d(copyOf, "copyOf(this, size)");
            map.put(dVar, copyOf);
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
            boolean r0 = r7 instanceof M.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            M.b r7 = (M.b) r7
            java.util.Map r0 = r7.f1103a
            java.util.Map r2 = r6.f1103a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f1103a
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
            boolean r0 = k3.h.a(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f1103a.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i4 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i4;
    }

    public final String toString() {
        return a3.d.f0(this.f1103a.entrySet(), ",\n", "{\n", "\n}", a.f1102m, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
