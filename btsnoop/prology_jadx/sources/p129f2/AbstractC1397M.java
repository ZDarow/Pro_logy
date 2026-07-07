package p129f2;

/* renamed from: f2.M */
/* loaded from: classes.dex */
public abstract class AbstractC1397M extends p129f2.AbstractC1388D implements java.util.Set {

    /* renamed from: n */
    public static final /* synthetic */ int f5709n = 0;

    /* renamed from: m */
    public transient p129f2.AbstractC1393I f5710m;

    /* renamed from: h */
    public static int m3176h(int i4) {
        int max = java.lang.Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int highestOneBit = java.lang.Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: i */
    public static p129f2.AbstractC1397M m3177i(int i4, java.lang.Object... objArr) {
        if (i4 == 0) {
            return p129f2.C1427i0.f5774u;
        }
        if (i4 == 1) {
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            return new p129f2.C1441p0(obj);
        }
        int m3176h = m3176h(i4);
        java.lang.Object[] objArr2 = new java.lang.Object[m3176h];
        int i5 = m3176h - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            java.lang.Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new java.lang.NullPointerException(p009B2.AbstractC0051h.m152k("at index ", i8));
            }
            int hashCode = obj2.hashCode();
            int m3239s = p129f2.AbstractC1444r.m3239s(hashCode);
            while (true) {
                int i9 = m3239s & i5;
                java.lang.Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                m3239s++;
            }
        }
        java.util.Arrays.fill(objArr, i7, i4, (java.lang.Object) null);
        if (i7 == 1) {
            java.lang.Object obj4 = objArr[0];
            java.util.Objects.requireNonNull(obj4);
            return new p129f2.C1441p0(obj4);
        }
        if (m3176h(i7) < m3176h / 2) {
            return m3177i(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = java.util.Arrays.copyOf(objArr, i7);
        }
        return new p129f2.C1427i0(i6, i5, i7, objArr, objArr2);
    }

    /* renamed from: j */
    public static p129f2.AbstractC1397M m3178j(java.util.Collection collection) {
        if ((collection instanceof p129f2.AbstractC1397M) && !(collection instanceof java.util.SortedSet)) {
            p129f2.AbstractC1397M abstractC1397M = (p129f2.AbstractC1397M) collection;
            if (!abstractC1397M.mo3155f()) {
                return abstractC1397M;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return m3177i(array.length, array);
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: a */
    public p129f2.AbstractC1393I mo3150a() {
        p129f2.AbstractC1393I abstractC1393I = this.f5710m;
        if (abstractC1393I != null) {
            return abstractC1393I;
        }
        p129f2.AbstractC1393I mo3179k = mo3179k();
        this.f5710m = mo3179k;
        return mo3179k;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p129f2.AbstractC1397M) && (this instanceof p129f2.C1427i0)) {
            p129f2.AbstractC1397M abstractC1397M = (p129f2.AbstractC1397M) obj;
            abstractC1397M.getClass();
            if ((abstractC1397M instanceof p129f2.C1427i0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return p129f2.AbstractC1444r.m3229i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p129f2.AbstractC1444r.m3233m(this);
    }

    /* renamed from: k */
    public p129f2.AbstractC1393I mo3179k() {
        java.lang.Object[] array = toArray(p129f2.AbstractC1388D.f5695l);
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        return p129f2.AbstractC1393I.m3160h(array.length, array);
    }
}
