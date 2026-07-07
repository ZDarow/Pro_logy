package f2;

import a.AbstractC0110a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: f2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299v extends AbstractMap implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f5619u = new Object();

    /* renamed from: l, reason: collision with root package name */
    public transient Object f5620l;

    /* renamed from: m, reason: collision with root package name */
    public transient int[] f5621m;

    /* renamed from: n, reason: collision with root package name */
    public transient Object[] f5622n;

    /* renamed from: o, reason: collision with root package name */
    public transient Object[] f5623o;

    /* renamed from: p, reason: collision with root package name */
    public transient int f5624p;

    /* renamed from: q, reason: collision with root package name */
    public transient int f5625q;

    /* renamed from: r, reason: collision with root package name */
    public transient C0297t f5626r;
    public transient C0297t s;

    /* renamed from: t, reason: collision with root package name */
    public transient C0292n f5627t;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, f2.v] */
    public static C0299v a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f5624p = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, f2.v] */
    public static C0299v b(int i4) {
        ?? abstractMap = new AbstractMap();
        if (i4 < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        abstractMap.f5624p = Math.min(Math.max(i4, 1), 1073741823);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f5620l;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f5624p += 32;
        Map c4 = c();
        if (c4 != null) {
            this.f5624p = Math.min(Math.max(size(), 3), 1073741823);
            c4.clear();
            this.f5620l = null;
            this.f5625q = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f5625q, (Object) null);
        Arrays.fill(k(), 0, this.f5625q, (Object) null);
        Object obj = this.f5620l;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f5625q, 0);
        this.f5625q = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c4 = c();
        return c4 != null ? c4.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.containsValue(obj);
        }
        for (int i4 = 0; i4 < this.f5625q; i4++) {
            if (AbstractC0110a.v(obj, k()[i4])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f5624p & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int t4 = r.t(obj);
        int d4 = d();
        Object obj2 = this.f5620l;
        Objects.requireNonNull(obj2);
        int u4 = r.u(t4 & d4, obj2);
        if (u4 == 0) {
            return -1;
        }
        int i4 = ~d4;
        int i5 = t4 & i4;
        do {
            int i6 = u4 - 1;
            int i7 = i()[i6];
            if ((i7 & i4) == i5 && AbstractC0110a.v(obj, j()[i6])) {
                return i6;
            }
            u4 = i7 & d4;
        } while (u4 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0297t c0297t = this.s;
        if (c0297t != null) {
            return c0297t;
        }
        C0297t c0297t2 = new C0297t(this, 0);
        this.s = c0297t2;
        return c0297t2;
    }

    public final void f(int i4, int i5) {
        Object obj = this.f5620l;
        Objects.requireNonNull(obj);
        int[] i6 = i();
        Object[] j4 = j();
        Object[] k4 = k();
        int size = size();
        int i7 = size - 1;
        if (i4 >= i7) {
            j4[i4] = null;
            k4[i4] = null;
            i6[i4] = 0;
            return;
        }
        Object obj2 = j4[i7];
        j4[i4] = obj2;
        k4[i4] = k4[i7];
        j4[i7] = null;
        k4[i7] = null;
        i6[i4] = i6[i7];
        i6[i7] = 0;
        int t4 = r.t(obj2) & i5;
        int u4 = r.u(t4, obj);
        if (u4 == size) {
            r.v(t4, i4 + 1, obj);
            return;
        }
        while (true) {
            int i8 = u4 - 1;
            int i9 = i6[i8];
            int i10 = i9 & i5;
            if (i10 == size) {
                i6[i8] = r.o(i9, i4 + 1, i5);
                return;
            }
            u4 = i10;
        }
    }

    public final boolean g() {
        return this.f5620l == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.get(obj);
        }
        int e4 = e(obj);
        if (e4 == -1) {
            return null;
        }
        return k()[e4];
    }

    public final Object h(Object obj) {
        boolean g4 = g();
        Object obj2 = f5619u;
        if (g4) {
            return obj2;
        }
        int d4 = d();
        Object obj3 = this.f5620l;
        Objects.requireNonNull(obj3);
        int q4 = r.q(obj, null, d4, obj3, i(), j(), null);
        if (q4 == -1) {
            return obj2;
        }
        Object obj4 = k()[q4];
        f(q4, d4);
        this.f5625q--;
        this.f5624p += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f5621m;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f5622n;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f5623o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0297t c0297t = this.f5626r;
        if (c0297t != null) {
            return c0297t;
        }
        C0297t c0297t2 = new C0297t(this, 1);
        this.f5626r = c0297t2;
        return c0297t2;
    }

    public final int l(int i4, int i5, int i6, int i7) {
        Object g4 = r.g(i5);
        int i8 = i5 - 1;
        if (i7 != 0) {
            r.v(i6 & i8, i7 + 1, g4);
        }
        Object obj = this.f5620l;
        Objects.requireNonNull(obj);
        int[] i9 = i();
        for (int i10 = 0; i10 <= i4; i10++) {
            int u4 = r.u(i10, obj);
            while (u4 != 0) {
                int i11 = u4 - 1;
                int i12 = i9[i11];
                int i13 = ((~i4) & i12) | i10;
                int i14 = i13 & i8;
                int u5 = r.u(i14, g4);
                r.v(i14, u4, g4);
                i9[i11] = r.o(i13, u5, i8);
                u4 = i12 & i4;
            }
        }
        this.f5620l = g4;
        this.f5624p = r.o(this.f5624p, 32 - Integer.numberOfLeadingZeros(i8), 31);
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0102 -> B:47:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C0299v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c4 = c();
        if (c4 != null) {
            return c4.remove(obj);
        }
        Object h4 = h(obj);
        if (h4 == f5619u) {
            return null;
        }
        return h4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c4 = c();
        return c4 != null ? c4.size() : this.f5625q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0292n c0292n = this.f5627t;
        if (c0292n != null) {
            return c0292n;
        }
        C0292n c0292n2 = new C0292n(1, this);
        this.f5627t = c0292n2;
        return c0292n2;
    }
}
