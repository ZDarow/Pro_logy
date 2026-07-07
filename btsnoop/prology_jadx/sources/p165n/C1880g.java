package p165n;

/* renamed from: n.g */
/* loaded from: classes.dex */
public final class C1880g implements java.lang.Cloneable {

    /* renamed from: l */
    public /* synthetic */ boolean f7632l;

    /* renamed from: m */
    public /* synthetic */ long[] f7633m;

    /* renamed from: n */
    public /* synthetic */ java.lang.Object[] f7634n;

    /* renamed from: o */
    public /* synthetic */ int f7635o;

    public C1880g() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f7633m = new long[i7];
        this.f7634n = new java.lang.Object[i7];
    }

    /* renamed from: a */
    public final void m3859a(long j4, java.lang.Object obj) {
        int m3884b = p170o.AbstractC1926a.m3884b(this.f7633m, this.f7635o, j4);
        if (m3884b >= 0) {
            this.f7634n[m3884b] = obj;
            return;
        }
        int i4 = ~m3884b;
        int i5 = this.f7635o;
        java.lang.Object obj2 = p165n.AbstractC1881h.f7636a;
        if (i4 < i5) {
            java.lang.Object[] objArr = this.f7634n;
            if (objArr[i4] == obj2) {
                this.f7633m[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f7632l) {
            long[] jArr = this.f7633m;
            if (i5 >= jArr.length) {
                java.lang.Object[] objArr2 = this.f7634n;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    java.lang.Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f7632l = false;
                this.f7635o = i6;
                i4 = ~p170o.AbstractC1926a.m3884b(this.f7633m, i6, j4);
            }
        }
        int i8 = this.f7635o;
        if (i8 >= this.f7633m.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] copyOf = java.util.Arrays.copyOf(this.f7633m, i12);
            p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, newSize)");
            this.f7633m = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f7634n, i12);
            p154k3.AbstractC1803h.m3778d(copyOf2, "copyOf(this, newSize)");
            this.f7634n = copyOf2;
        }
        int i13 = this.f7635o - i4;
        if (i13 != 0) {
            long[] jArr2 = this.f7633m;
            int i14 = i4 + 1;
            p154k3.AbstractC1803h.m3779e(jArr2, "<this>");
            java.lang.System.arraycopy(jArr2, i4, jArr2, i14, i13);
            java.lang.Object[] objArr3 = this.f7634n;
            p105a3.AbstractC1020c.m2047i0(i14, i4, this.f7635o, objArr3, objArr3);
        }
        this.f7633m[i4] = j4;
        this.f7634n[i4] = obj;
        this.f7635o++;
    }

    public final java.lang.Object clone() {
        java.lang.Object clone = super.clone();
        p154k3.AbstractC1803h.m3777c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        p165n.C1880g c1880g = (p165n.C1880g) clone;
        c1880g.f7633m = (long[]) this.f7633m.clone();
        c1880g.f7634n = (java.lang.Object[]) this.f7634n.clone();
        return c1880g;
    }

    public final java.lang.String toString() {
        int i4;
        int i5;
        if (this.f7632l) {
            int i6 = this.f7635o;
            long[] jArr = this.f7633m;
            java.lang.Object[] objArr = this.f7634n;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                java.lang.Object obj = objArr[i8];
                if (obj != p165n.AbstractC1881h.f7636a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f7632l = false;
            this.f7635o = i7;
        }
        if (this.f7635o <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f7635o * 28);
        sb.append('{');
        int i9 = this.f7635o;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (i10 < 0 || i10 >= (i4 = this.f7635o)) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i10).toString());
            }
            if (this.f7632l) {
                long[] jArr2 = this.f7633m;
                java.lang.Object[] objArr2 = this.f7634n;
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    java.lang.Object obj2 = objArr2[i12];
                    if (obj2 != p165n.AbstractC1881h.f7636a) {
                        if (i12 != i11) {
                            jArr2[i11] = jArr2[i12];
                            objArr2[i11] = obj2;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f7632l = false;
                this.f7635o = i11;
            }
            sb.append(this.f7633m[i10]);
            sb.append('=');
            if (i10 < 0 || i10 >= (i5 = this.f7635o)) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Expected index to be within 0..size()-1, but was ", i10).toString());
            }
            if (this.f7632l) {
                long[] jArr3 = this.f7633m;
                java.lang.Object[] objArr3 = this.f7634n;
                int i13 = 0;
                for (int i14 = 0; i14 < i5; i14++) {
                    java.lang.Object obj3 = objArr3[i14];
                    if (obj3 != p165n.AbstractC1881h.f7636a) {
                        if (i14 != i13) {
                            jArr3[i13] = jArr3[i14];
                            objArr3[i13] = obj3;
                            objArr3[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f7632l = false;
                this.f7635o = i13;
            }
            java.lang.Object obj4 = this.f7634n[i10];
            if (obj4 != sb) {
                sb.append(obj4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
