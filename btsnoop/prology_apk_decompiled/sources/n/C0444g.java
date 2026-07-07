package n;

import B2.AbstractC0007h;
import java.util.Arrays;
import o.AbstractC0454a;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444g implements Cloneable {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ boolean f7353l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long[] f7354m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object[] f7355n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f7356o;

    public C0444g() {
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
        this.f7354m = new long[i7];
        this.f7355n = new Object[i7];
    }

    public final void a(long j4, Object obj) {
        int b4 = AbstractC0454a.b(this.f7354m, this.f7356o, j4);
        if (b4 >= 0) {
            this.f7355n[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f7356o;
        Object obj2 = AbstractC0445h.f7357a;
        if (i4 < i5) {
            Object[] objArr = this.f7355n;
            if (objArr[i4] == obj2) {
                this.f7354m[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f7353l) {
            long[] jArr = this.f7354m;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f7355n;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f7353l = false;
                this.f7356o = i6;
                i4 = ~AbstractC0454a.b(this.f7354m, i6, j4);
            }
        }
        int i8 = this.f7356o;
        if (i8 >= this.f7354m.length) {
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
            long[] copyOf = Arrays.copyOf(this.f7354m, i12);
            k3.h.d(copyOf, "copyOf(this, newSize)");
            this.f7354m = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7355n, i12);
            k3.h.d(copyOf2, "copyOf(this, newSize)");
            this.f7355n = copyOf2;
        }
        int i13 = this.f7356o - i4;
        if (i13 != 0) {
            long[] jArr2 = this.f7354m;
            int i14 = i4 + 1;
            k3.h.e(jArr2, "<this>");
            System.arraycopy(jArr2, i4, jArr2, i14, i13);
            Object[] objArr3 = this.f7355n;
            a3.c.i0(i14, i4, this.f7356o, objArr3, objArr3);
        }
        this.f7354m[i4] = j4;
        this.f7355n[i4] = obj;
        this.f7356o++;
    }

    public final Object clone() {
        Object clone = super.clone();
        k3.h.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0444g c0444g = (C0444g) clone;
        c0444g.f7354m = (long[]) this.f7354m.clone();
        c0444g.f7355n = (Object[]) this.f7355n.clone();
        return c0444g;
    }

    public final String toString() {
        int i4;
        int i5;
        if (this.f7353l) {
            int i6 = this.f7356o;
            long[] jArr = this.f7354m;
            Object[] objArr = this.f7355n;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC0445h.f7357a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f7353l = false;
            this.f7356o = i7;
        }
        if (this.f7356o <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7356o * 28);
        sb.append('{');
        int i9 = this.f7356o;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (i10 < 0 || i10 >= (i4 = this.f7356o)) {
                throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i10).toString());
            }
            if (this.f7353l) {
                long[] jArr2 = this.f7354m;
                Object[] objArr2 = this.f7355n;
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    Object obj2 = objArr2[i12];
                    if (obj2 != AbstractC0445h.f7357a) {
                        if (i12 != i11) {
                            jArr2[i11] = jArr2[i12];
                            objArr2[i11] = obj2;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f7353l = false;
                this.f7356o = i11;
            }
            sb.append(this.f7354m[i10]);
            sb.append('=');
            if (i10 < 0 || i10 >= (i5 = this.f7356o)) {
                throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i10).toString());
            }
            if (this.f7353l) {
                long[] jArr3 = this.f7354m;
                Object[] objArr3 = this.f7355n;
                int i13 = 0;
                for (int i14 = 0; i14 < i5; i14++) {
                    Object obj3 = objArr3[i14];
                    if (obj3 != AbstractC0445h.f7357a) {
                        if (i14 != i13) {
                            jArr3[i13] = jArr3[i14];
                            objArr3[i13] = obj3;
                            objArr3[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f7353l = false;
                this.f7356o = i13;
            }
            Object obj4 = this.f7355n[i10];
            if (obj4 != sb) {
                sb.append(obj4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        k3.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
