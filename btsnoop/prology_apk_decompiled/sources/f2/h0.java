package f2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class h0 implements Map, Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final h0 f5570r = new h0(null, new Object[0], 0);

    /* renamed from: l, reason: collision with root package name */
    public transient e0 f5571l;

    /* renamed from: m, reason: collision with root package name */
    public transient f0 f5572m;

    /* renamed from: n, reason: collision with root package name */
    public transient g0 f5573n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object f5574o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Object[] f5575p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int f5576q;

    public h0(Object obj, Object[] objArr, int i4) {
        this.f5574o = obj;
        this.f5575p = objArr;
        this.f5576q = i4;
    }

    public static h0 a(Map map) {
        if ((map instanceof h0) && !(map instanceof SortedMap)) {
            h0 h0Var = (h0) map;
            h0Var.getClass();
            return h0Var;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        P2.a aVar = new P2.a(entrySet != null ? entrySet.size() : 4, 5);
        if (entrySet != null) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) aVar.f1501m;
            if (size > objArr.length) {
                aVar.f1501m = Arrays.copyOf(objArr, AbstractC0275C.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            aVar.i(entry.getKey(), entry.getValue());
        }
        return aVar.e();
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f2.h0 b(int r16, java.lang.Object[] r17, P2.a r18) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h0.b(int, java.lang.Object[], P2.a):f2.h0");
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final M entrySet() {
        e0 e0Var = this.f5571l;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, this.f5575p, this.f5576q);
        this.f5571l = e0Var2;
        return e0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final M keySet() {
        f0 f0Var = this.f5572m;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this, new g0(this.f5575p, 0, this.f5576q));
        this.f5572m = f0Var2;
        return f0Var2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC0276D values() {
        g0 g0Var = this.f5573n;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this.f5575p, 1, this.f5576q);
        this.f5573n = g0Var2;
        return g0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.h(this, obj);
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
            java.lang.Object[] r2 = r8.f5575p
            int r3 = r8.f5576q
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
            java.lang.Object r3 = r8.f5574o
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
            int r3 = f2.r.s(r3)
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
            int r3 = f2.r.s(r3)
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
            int r5 = f2.r.s(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: f2.h0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5576q;
    }

    public final String toString() {
        int i4 = this.f5576q;
        r.e("size", i4);
        StringBuilder sb = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        r0 it = ((e0) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            G g4 = (G) it;
            if (!g4.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) g4.next();
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
