package p165n;

/* renamed from: n.k */
/* loaded from: classes.dex */
public final class C1884k implements java.lang.Cloneable {

    /* renamed from: l */
    public /* synthetic */ int[] f7647l;

    /* renamed from: m */
    public /* synthetic */ java.lang.Object[] f7648m;

    /* renamed from: n */
    public /* synthetic */ int f7649n;

    /* renamed from: a */
    public final void m3872a(int i4, java.lang.Object obj) {
        int i5 = this.f7649n;
        if (i5 == 0 || i4 > this.f7647l[i5 - 1]) {
            if (i5 >= this.f7647l.length) {
                int i6 = (i5 + 1) * 4;
                int i7 = 4;
                while (true) {
                    if (i7 >= 32) {
                        break;
                    }
                    int i8 = (1 << i7) - 12;
                    if (i6 <= i8) {
                        i6 = i8;
                        break;
                    }
                    i7++;
                }
                int i9 = i6 / 4;
                int[] copyOf = java.util.Arrays.copyOf(this.f7647l, i9);
                p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(this, newSize)");
                this.f7647l = copyOf;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f7648m, i9);
                p154k3.AbstractC1803h.m3778d(copyOf2, "copyOf(this, newSize)");
                this.f7648m = copyOf2;
            }
            this.f7647l[i5] = i4;
            this.f7648m[i5] = obj;
            this.f7649n = i5 + 1;
            return;
        }
        int m3883a = p170o.AbstractC1926a.m3883a(this.f7649n, i4, this.f7647l);
        if (m3883a >= 0) {
            this.f7648m[m3883a] = obj;
            return;
        }
        int i10 = ~m3883a;
        int i11 = this.f7649n;
        if (i10 < i11) {
            java.lang.Object[] objArr = this.f7648m;
            if (objArr[i10] == p165n.AbstractC1881h.f7637b) {
                this.f7647l[i10] = i4;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f7647l.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf3 = java.util.Arrays.copyOf(this.f7647l, i15);
            p154k3.AbstractC1803h.m3778d(copyOf3, "copyOf(this, newSize)");
            this.f7647l = copyOf3;
            java.lang.Object[] copyOf4 = java.util.Arrays.copyOf(this.f7648m, i15);
            p154k3.AbstractC1803h.m3778d(copyOf4, "copyOf(this, newSize)");
            this.f7648m = copyOf4;
        }
        int i16 = this.f7649n;
        if (i16 - i10 != 0) {
            int[] iArr = this.f7647l;
            int i17 = i10 + 1;
            p105a3.AbstractC1020c.m2046h0(i17, i10, i16, iArr, iArr);
            java.lang.Object[] objArr2 = this.f7648m;
            p105a3.AbstractC1020c.m2047i0(i17, i10, this.f7649n, objArr2, objArr2);
        }
        this.f7647l[i10] = i4;
        this.f7648m[i10] = obj;
        this.f7649n++;
    }

    public final java.lang.Object clone() {
        java.lang.Object clone = super.clone();
        p154k3.AbstractC1803h.m3777c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        p165n.C1884k c1884k = (p165n.C1884k) clone;
        c1884k.f7647l = (int[]) this.f7647l.clone();
        c1884k.f7648m = (java.lang.Object[]) this.f7648m.clone();
        return c1884k;
    }

    public final java.lang.String toString() {
        int i4 = this.f7649n;
        if (i4 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i4 * 28);
        sb.append('{');
        int i5 = this.f7649n;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7647l[i6]);
            sb.append('=');
            java.lang.Object obj = this.f7648m[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "buffer.toString()");
        return sb2;
    }
}
