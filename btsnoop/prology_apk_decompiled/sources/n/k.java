package n;

import java.util.Arrays;
import o.AbstractC0454a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ int[] f7368l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f7369m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f7370n;

    public final void a(int i4, Object obj) {
        int i5 = this.f7370n;
        if (i5 == 0 || i4 > this.f7368l[i5 - 1]) {
            if (i5 >= this.f7368l.length) {
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
                int[] copyOf = Arrays.copyOf(this.f7368l, i9);
                k3.h.d(copyOf, "copyOf(this, newSize)");
                this.f7368l = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f7369m, i9);
                k3.h.d(copyOf2, "copyOf(this, newSize)");
                this.f7369m = copyOf2;
            }
            this.f7368l[i5] = i4;
            this.f7369m[i5] = obj;
            this.f7370n = i5 + 1;
            return;
        }
        int a4 = AbstractC0454a.a(this.f7370n, i4, this.f7368l);
        if (a4 >= 0) {
            this.f7369m[a4] = obj;
            return;
        }
        int i10 = ~a4;
        int i11 = this.f7370n;
        if (i10 < i11) {
            Object[] objArr = this.f7369m;
            if (objArr[i10] == AbstractC0445h.f7358b) {
                this.f7368l[i10] = i4;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f7368l.length) {
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
            int[] copyOf3 = Arrays.copyOf(this.f7368l, i15);
            k3.h.d(copyOf3, "copyOf(this, newSize)");
            this.f7368l = copyOf3;
            Object[] copyOf4 = Arrays.copyOf(this.f7369m, i15);
            k3.h.d(copyOf4, "copyOf(this, newSize)");
            this.f7369m = copyOf4;
        }
        int i16 = this.f7370n;
        if (i16 - i10 != 0) {
            int[] iArr = this.f7368l;
            int i17 = i10 + 1;
            a3.c.h0(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f7369m;
            a3.c.i0(i17, i10, this.f7370n, objArr2, objArr2);
        }
        this.f7368l[i10] = i4;
        this.f7369m[i10] = obj;
        this.f7370n++;
    }

    public final Object clone() {
        Object clone = super.clone();
        k3.h.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f7368l = (int[]) this.f7368l.clone();
        kVar.f7369m = (Object[]) this.f7369m.clone();
        return kVar;
    }

    public final String toString() {
        int i4 = this.f7370n;
        if (i4 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i4 * 28);
        sb.append('{');
        int i5 = this.f7370n;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7368l[i6]);
            sb.append('=');
            Object obj = this.f7369m[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        k3.h.d(sb2, "buffer.toString()");
        return sb2;
    }
}
