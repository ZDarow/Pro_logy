package p165n;

/* renamed from: n.j */
/* loaded from: classes.dex */
public class C1883j {

    /* renamed from: l */
    public int[] f7644l;

    /* renamed from: m */
    public java.lang.Object[] f7645m;

    /* renamed from: n */
    public int f7646n;

    public C1883j(int i4) {
        this.f7644l = i4 == 0 ? p170o.AbstractC1926a.f7819a : new int[i4];
        this.f7645m = i4 == 0 ? p170o.AbstractC1926a.f7820b : new java.lang.Object[i4 << 1];
    }

    /* renamed from: a */
    public final int m3864a(java.lang.Object obj) {
        int i4 = this.f7646n * 2;
        java.lang.Object[] objArr = this.f7645m;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m3865b(int i4, java.lang.Object obj) {
        int i5 = this.f7646n;
        if (i5 == 0) {
            return -1;
        }
        int m3883a = p170o.AbstractC1926a.m3883a(i5, i4, this.f7644l);
        if (m3883a < 0 || p154k3.AbstractC1803h.m3775a(obj, this.f7645m[m3883a << 1])) {
            return m3883a;
        }
        int i6 = m3883a + 1;
        while (i6 < i5 && this.f7644l[i6] == i4) {
            if (p154k3.AbstractC1803h.m3775a(obj, this.f7645m[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = m3883a - 1; i7 >= 0 && this.f7644l[i7] == i4; i7--) {
            if (p154k3.AbstractC1803h.m3775a(obj, this.f7645m[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    /* renamed from: c */
    public final int m3866c(java.lang.Object obj) {
        return obj == null ? m3867d() : m3865b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f7646n > 0) {
            this.f7644l = p170o.AbstractC1926a.f7819a;
            this.f7645m = p170o.AbstractC1926a.f7820b;
            this.f7646n = 0;
        }
        if (this.f7646n > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return m3866c(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return m3864a(obj) >= 0;
    }

    /* renamed from: d */
    public final int m3867d() {
        int i4 = this.f7646n;
        if (i4 == 0) {
            return -1;
        }
        int m3883a = p170o.AbstractC1926a.m3883a(i4, 0, this.f7644l);
        if (m3883a < 0 || this.f7645m[m3883a << 1] == null) {
            return m3883a;
        }
        int i5 = m3883a + 1;
        while (i5 < i4 && this.f7644l[i5] == 0) {
            if (this.f7645m[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = m3883a - 1; i6 >= 0 && this.f7644l[i6] == 0; i6--) {
            if (this.f7645m[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    /* renamed from: e */
    public final java.lang.Object m3868e(int i4) {
        if (i4 < 0 || i4 >= this.f7646n) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        return this.f7645m[i4 << 1];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof p165n.C1883j) {
                int i4 = this.f7646n;
                if (i4 != ((p165n.C1883j) obj).f7646n) {
                    return false;
                }
                p165n.C1883j c1883j = (p165n.C1883j) obj;
                for (int i5 = 0; i5 < i4; i5++) {
                    java.lang.Object m3868e = m3868e(i5);
                    java.lang.Object m3871h = m3871h(i5);
                    java.lang.Object obj2 = c1883j.get(m3868e);
                    if (m3871h == null) {
                        if (obj2 != null || !c1883j.containsKey(m3868e)) {
                            return false;
                        }
                    } else if (!m3871h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.f7646n != ((java.util.Map) obj).size()) {
                return false;
            }
            int i6 = this.f7646n;
            for (int i7 = 0; i7 < i6; i7++) {
                java.lang.Object m3868e2 = m3868e(i7);
                java.lang.Object m3871h2 = m3871h(i7);
                java.lang.Object obj3 = ((java.util.Map) obj).get(m3868e2);
                if (m3871h2 == null) {
                    if (obj3 != null || !((java.util.Map) obj).containsKey(m3868e2)) {
                        return false;
                    }
                } else if (!m3871h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final java.lang.Object m3869f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f7646n)) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        java.lang.Object[] objArr = this.f7645m;
        int i6 = i4 << 1;
        java.lang.Object obj = objArr[i6 + 1];
        if (i5 <= 1) {
            clear();
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f7644l;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    p105a3.AbstractC1020c.m2046h0(i4, i8, i5, iArr, iArr);
                    java.lang.Object[] objArr2 = this.f7645m;
                    p105a3.AbstractC1020c.m2047i0(i6, i8 << 1, i5 << 1, objArr2, objArr2);
                }
                java.lang.Object[] objArr3 = this.f7645m;
                int i9 = i7 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                int i10 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] copyOf = java.util.Arrays.copyOf(iArr, i10);
                p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, newSize)");
                this.f7644l = copyOf;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f7645m, i10 << 1);
                p154k3.AbstractC1803h.m3778d(copyOf2, "copyOf(this, newSize)");
                this.f7645m = copyOf2;
                if (i5 != this.f7646n) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i4 > 0) {
                    p105a3.AbstractC1020c.m2046h0(0, 0, i4, iArr, this.f7644l);
                    p105a3.AbstractC1020c.m2047i0(0, 0, i6, objArr, this.f7645m);
                }
                if (i4 < i7) {
                    int i11 = i4 + 1;
                    p105a3.AbstractC1020c.m2046h0(i4, i11, i5, iArr, this.f7644l);
                    p105a3.AbstractC1020c.m2047i0(i6, i11 << 1, i5 << 1, objArr, this.f7645m);
                }
            }
            if (i5 != this.f7646n) {
                throw new java.util.ConcurrentModificationException();
            }
            this.f7646n = i7;
        }
        return obj;
    }

    /* renamed from: g */
    public final java.lang.Object m3870g(int i4, java.lang.Object obj) {
        if (i4 < 0 || i4 >= this.f7646n) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        int i5 = (i4 << 1) + 1;
        java.lang.Object[] objArr = this.f7645m;
        java.lang.Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public java.lang.Object get(java.lang.Object obj) {
        int m3866c = m3866c(obj);
        if (m3866c >= 0) {
            return this.f7645m[(m3866c << 1) + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int m3866c = m3866c(obj);
        return m3866c >= 0 ? this.f7645m[(m3866c << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final java.lang.Object m3871h(int i4) {
        if (i4 < 0 || i4 >= this.f7646n) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        return this.f7645m[(i4 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f7644l;
        java.lang.Object[] objArr = this.f7645m;
        int i4 = this.f7646n;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            java.lang.Object obj = objArr[i5];
            i7 += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final boolean isEmpty() {
        return this.f7646n <= 0;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i4 = this.f7646n;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int m3865b = obj != null ? m3865b(hashCode, obj) : m3867d();
        if (m3865b >= 0) {
            int i5 = (m3865b << 1) + 1;
            java.lang.Object[] objArr = this.f7645m;
            java.lang.Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~m3865b;
        int[] iArr = this.f7644l;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] copyOf = java.util.Arrays.copyOf(iArr, i7);
            p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, newSize)");
            this.f7644l = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f7645m, i7 << 1);
            p154k3.AbstractC1803h.m3778d(copyOf2, "copyOf(this, newSize)");
            this.f7645m = copyOf2;
            if (i4 != this.f7646n) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.f7644l;
            int i8 = i6 + 1;
            p105a3.AbstractC1020c.m2046h0(i8, i6, i4, iArr2, iArr2);
            java.lang.Object[] objArr2 = this.f7645m;
            p105a3.AbstractC1020c.m2047i0(i8 << 1, i6 << 1, this.f7646n << 1, objArr2, objArr2);
        }
        int i9 = this.f7646n;
        if (i4 == i9) {
            int[] iArr3 = this.f7644l;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                java.lang.Object[] objArr3 = this.f7645m;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f7646n = i9 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int m3866c = m3866c(obj);
        if (m3866c >= 0) {
            return m3869f(m3866c);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int m3866c = m3866c(obj);
        if (m3866c >= 0) {
            return m3870g(m3866c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f7646n;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f7646n * 28);
        sb.append('{');
        int i4 = this.f7646n;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            java.lang.Object m3868e = m3868e(i5);
            if (m3868e != sb) {
                sb.append(m3868e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object m3871h = m3871h(i5);
            if (m3871h != sb) {
                sb.append(m3871h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int m3866c = m3866c(obj);
        if (m3866c < 0 || !p154k3.AbstractC1803h.m3775a(obj2, m3871h(m3866c))) {
            return false;
        }
        m3869f(m3866c);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int m3866c = m3866c(obj);
        if (m3866c < 0 || !p154k3.AbstractC1803h.m3775a(obj2, m3871h(m3866c))) {
            return false;
        }
        m3870g(m3866c, obj3);
        return true;
    }
}
