package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.X */
/* loaded from: classes.dex */
public final class C1090X extends java.util.AbstractMap {

    /* renamed from: q */
    public static final /* synthetic */ int f4195q = 0;

    /* renamed from: l */
    public java.util.List f4196l;

    /* renamed from: m */
    public java.util.Map f4197m;

    /* renamed from: n */
    public boolean f4198n;

    /* renamed from: o */
    public volatile androidx.datastore.preferences.protobuf.C1094a0 f4199o;

    /* renamed from: p */
    public java.util.Map f4200p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.X] */
    /* renamed from: f */
    public static androidx.datastore.preferences.protobuf.C1090X m2475f() {
        ?? abstractMap = new java.util.AbstractMap();
        abstractMap.f4196l = java.util.Collections.emptyList();
        abstractMap.f4197m = java.util.Collections.emptyMap();
        abstractMap.f4200p = java.util.Collections.emptyMap();
        return abstractMap;
    }

    /* renamed from: a */
    public final int m2476a(java.lang.Comparable comparable) {
        int i4;
        int size = this.f4196l.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.get(i5)).f4201l);
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.get(i7)).f4201l);
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    /* renamed from: b */
    public final void m2477b() {
        if (this.f4198n) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final java.util.Map.Entry m2478c(int i4) {
        return (java.util.Map.Entry) this.f4196l.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2477b();
        if (!this.f4196l.isEmpty()) {
            this.f4196l.clear();
        }
        if (this.f4197m.isEmpty()) {
            return;
        }
        this.f4197m.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return m2476a(comparable) >= 0 || this.f4197m.containsKey(comparable);
    }

    /* renamed from: d */
    public final java.util.Set m2479d() {
        return this.f4197m.isEmpty() ? java.util.Collections.emptySet() : this.f4197m.entrySet();
    }

    /* renamed from: e */
    public final java.util.SortedMap m2480e() {
        m2477b();
        if (this.f4197m.isEmpty() && !(this.f4197m instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f4197m = treeMap;
            this.f4200p = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f4197m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.f4199o == null) {
            this.f4199o = new androidx.datastore.preferences.protobuf.C1094a0(this, 0);
        }
        return this.f4199o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C1090X)) {
            return super.equals(obj);
        }
        androidx.datastore.preferences.protobuf.C1090X c1090x = (androidx.datastore.preferences.protobuf.C1090X) obj;
        int size = size();
        if (size != c1090x.size()) {
            return false;
        }
        int size2 = this.f4196l.size();
        if (size2 != c1090x.f4196l.size()) {
            return ((java.util.AbstractSet) entrySet()).equals(c1090x.entrySet());
        }
        for (int i4 = 0; i4 < size2; i4++) {
            if (!m2478c(i4).equals(c1090x.m2478c(i4))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4197m.equals(c1090x.f4197m);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        m2477b();
        int m2476a = m2476a(comparable);
        if (m2476a >= 0) {
            return ((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.get(m2476a)).setValue(obj);
        }
        m2477b();
        if (this.f4196l.isEmpty() && !(this.f4196l instanceof java.util.ArrayList)) {
            this.f4196l = new java.util.ArrayList(16);
        }
        int i4 = -(m2476a + 1);
        if (i4 >= 16) {
            return m2480e().put(comparable, obj);
        }
        if (this.f4196l.size() == 16) {
            androidx.datastore.preferences.protobuf.C1091Y c1091y = (androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.remove(15);
            m2480e().put(c1091y.f4201l, c1091y.f4202m);
        }
        this.f4196l.add(i4, new androidx.datastore.preferences.protobuf.C1091Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int m2476a = m2476a(comparable);
        return m2476a >= 0 ? ((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.get(m2476a)).f4202m : this.f4197m.get(comparable);
    }

    /* renamed from: h */
    public final java.lang.Object m2482h(int i4) {
        m2477b();
        java.lang.Object obj = ((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.remove(i4)).f4202m;
        if (!this.f4197m.isEmpty()) {
            java.util.Iterator it = m2480e().entrySet().iterator();
            java.util.List list = this.f4196l;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new androidx.datastore.preferences.protobuf.C1091Y(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4196l.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((androidx.datastore.preferences.protobuf.C1091Y) this.f4196l.get(i5)).hashCode();
        }
        return this.f4197m.size() > 0 ? i4 + this.f4197m.hashCode() : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        m2477b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int m2476a = m2476a(comparable);
        if (m2476a >= 0) {
            return m2482h(m2476a);
        }
        if (this.f4197m.isEmpty()) {
            return null;
        }
        return this.f4197m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4197m.size() + this.f4196l.size();
    }
}
