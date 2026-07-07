package p129f2;

/* renamed from: f2.v */
/* loaded from: classes.dex */
public final class C1449v extends java.util.AbstractMap implements java.io.Serializable {

    /* renamed from: u */
    public static final java.lang.Object f5814u = new java.lang.Object();

    /* renamed from: l */
    public transient java.lang.Object f5815l;

    /* renamed from: m */
    public transient int[] f5816m;

    /* renamed from: n */
    public transient java.lang.Object[] f5817n;

    /* renamed from: o */
    public transient java.lang.Object[] f5818o;

    /* renamed from: p */
    public transient int f5819p;

    /* renamed from: q */
    public transient int f5820q;

    /* renamed from: r */
    public transient p129f2.C1447t f5821r;

    /* renamed from: s */
    public transient p129f2.C1447t f5822s;

    /* renamed from: t */
    public transient p129f2.C1436n f5823t;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, f2.v] */
    /* renamed from: a */
    public static p129f2.C1449v m3246a() {
        ?? abstractMap = new java.util.AbstractMap();
        abstractMap.f5819p = java.lang.Math.min(java.lang.Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, f2.v] */
    /* renamed from: b */
    public static p129f2.C1449v m3247b(int i4) {
        ?? abstractMap = new java.util.AbstractMap();
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("Expected size must be >= 0");
        }
        abstractMap.f5819p = java.lang.Math.min(java.lang.Math.max(i4, 1), 1073741823);
        return abstractMap;
    }

    /* renamed from: c */
    public final java.util.Map m3248c() {
        java.lang.Object obj = this.f5815l;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m3252g()) {
            return;
        }
        this.f5819p += 32;
        java.util.Map m3248c = m3248c();
        if (m3248c != null) {
            this.f5819p = java.lang.Math.min(java.lang.Math.max(size(), 3), 1073741823);
            m3248c.clear();
            this.f5815l = null;
            this.f5820q = 0;
            return;
        }
        java.util.Arrays.fill(m3255j(), 0, this.f5820q, (java.lang.Object) null);
        java.util.Arrays.fill(m3256k(), 0, this.f5820q, (java.lang.Object) null);
        java.lang.Object obj = this.f5815l;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
        java.util.Arrays.fill(m3254i(), 0, this.f5820q, 0);
        this.f5820q = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map m3248c = m3248c();
        return m3248c != null ? m3248c.containsKey(obj) : m3250e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map m3248c = m3248c();
        if (m3248c != null) {
            return m3248c.containsValue(obj);
        }
        for (int i4 = 0; i4 < this.f5820q; i4++) {
            if (p101a.AbstractC0936a.m1814v(obj, m3256k()[i4])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int m3249d() {
        return (1 << (this.f5819p & 31)) - 1;
    }

    /* renamed from: e */
    public final int m3250e(java.lang.Object obj) {
        if (m3252g()) {
            return -1;
        }
        int m3240t = p129f2.AbstractC1444r.m3240t(obj);
        int m3249d = m3249d();
        java.lang.Object obj2 = this.f5815l;
        java.util.Objects.requireNonNull(obj2);
        int m3241u = p129f2.AbstractC1444r.m3241u(m3240t & m3249d, obj2);
        if (m3241u == 0) {
            return -1;
        }
        int i4 = ~m3249d;
        int i5 = m3240t & i4;
        do {
            int i6 = m3241u - 1;
            int i7 = m3254i()[i6];
            if ((i7 & i4) == i5 && p101a.AbstractC0936a.m1814v(obj, m3255j()[i6])) {
                return i6;
            }
            m3241u = i7 & m3249d;
        } while (m3241u != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        p129f2.C1447t c1447t = this.f5822s;
        if (c1447t != null) {
            return c1447t;
        }
        p129f2.C1447t c1447t2 = new p129f2.C1447t(this, 0);
        this.f5822s = c1447t2;
        return c1447t2;
    }

    /* renamed from: f */
    public final void m3251f(int i4, int i5) {
        java.lang.Object obj = this.f5815l;
        java.util.Objects.requireNonNull(obj);
        int[] m3254i = m3254i();
        java.lang.Object[] m3255j = m3255j();
        java.lang.Object[] m3256k = m3256k();
        int size = size();
        int i6 = size - 1;
        if (i4 >= i6) {
            m3255j[i4] = null;
            m3256k[i4] = null;
            m3254i[i4] = 0;
            return;
        }
        java.lang.Object obj2 = m3255j[i6];
        m3255j[i4] = obj2;
        m3256k[i4] = m3256k[i6];
        m3255j[i6] = null;
        m3256k[i6] = null;
        m3254i[i4] = m3254i[i6];
        m3254i[i6] = 0;
        int m3240t = p129f2.AbstractC1444r.m3240t(obj2) & i5;
        int m3241u = p129f2.AbstractC1444r.m3241u(m3240t, obj);
        if (m3241u == size) {
            p129f2.AbstractC1444r.m3242v(m3240t, i4 + 1, obj);
            return;
        }
        while (true) {
            int i7 = m3241u - 1;
            int i8 = m3254i[i7];
            int i9 = i8 & i5;
            if (i9 == size) {
                m3254i[i7] = p129f2.AbstractC1444r.m3235o(i8, i4 + 1, i5);
                return;
            }
            m3241u = i9;
        }
    }

    /* renamed from: g */
    public final boolean m3252g() {
        return this.f5815l == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map m3248c = m3248c();
        if (m3248c != null) {
            return m3248c.get(obj);
        }
        int m3250e = m3250e(obj);
        if (m3250e == -1) {
            return null;
        }
        return m3256k()[m3250e];
    }

    /* renamed from: h */
    public final java.lang.Object m3253h(java.lang.Object obj) {
        boolean m3252g = m3252g();
        java.lang.Object obj2 = f5814u;
        if (m3252g) {
            return obj2;
        }
        int m3249d = m3249d();
        java.lang.Object obj3 = this.f5815l;
        java.util.Objects.requireNonNull(obj3);
        int m3237q = p129f2.AbstractC1444r.m3237q(obj, null, m3249d, obj3, m3254i(), m3255j(), null);
        if (m3237q == -1) {
            return obj2;
        }
        java.lang.Object obj4 = m3256k()[m3237q];
        m3251f(m3237q, m3249d);
        this.f5820q--;
        this.f5819p += 32;
        return obj4;
    }

    /* renamed from: i */
    public final int[] m3254i() {
        int[] iArr = this.f5816m;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final java.lang.Object[] m3255j() {
        java.lang.Object[] objArr = this.f5817n;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: k */
    public final java.lang.Object[] m3256k() {
        java.lang.Object[] objArr = this.f5818o;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        p129f2.C1447t c1447t = this.f5821r;
        if (c1447t != null) {
            return c1447t;
        }
        p129f2.C1447t c1447t2 = new p129f2.C1447t(this, 1);
        this.f5821r = c1447t2;
        return c1447t2;
    }

    /* renamed from: l */
    public final int m3257l(int i4, int i5, int i6, int i7) {
        java.lang.Object m3227g = p129f2.AbstractC1444r.m3227g(i5);
        int i8 = i5 - 1;
        if (i7 != 0) {
            p129f2.AbstractC1444r.m3242v(i6 & i8, i7 + 1, m3227g);
        }
        java.lang.Object obj = this.f5815l;
        java.util.Objects.requireNonNull(obj);
        int[] m3254i = m3254i();
        for (int i9 = 0; i9 <= i4; i9++) {
            int m3241u = p129f2.AbstractC1444r.m3241u(i9, obj);
            while (m3241u != 0) {
                int i10 = m3241u - 1;
                int i11 = m3254i[i10];
                int i12 = ((~i4) & i11) | i9;
                int i13 = i12 & i8;
                int m3241u2 = p129f2.AbstractC1444r.m3241u(i13, m3227g);
                p129f2.AbstractC1444r.m3242v(i13, m3241u, m3227g);
                m3254i[i10] = p129f2.AbstractC1444r.m3235o(i12, m3241u2, i8);
                m3241u = i11 & i4;
            }
        }
        this.f5815l = m3227g;
        this.f5819p = p129f2.AbstractC1444r.m3235o(this.f5819p, 32 - java.lang.Integer.numberOfLeadingZeros(i8), 31);
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
        throw new UnsupportedOperationException("Method not decompiled: p129f2.C1449v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map m3248c = m3248c();
        if (m3248c != null) {
            return m3248c.remove(obj);
        }
        java.lang.Object m3253h = m3253h(obj);
        if (m3253h == f5814u) {
            return null;
        }
        return m3253h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map m3248c = m3248c();
        return m3248c != null ? m3248c.size() : this.f5820q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        p129f2.C1436n c1436n = this.f5823t;
        if (c1436n != null) {
            return c1436n;
        }
        p129f2.C1436n c1436n2 = new p129f2.C1436n(1, this);
        this.f5823t = c1436n2;
        return c1436n2;
    }
}
