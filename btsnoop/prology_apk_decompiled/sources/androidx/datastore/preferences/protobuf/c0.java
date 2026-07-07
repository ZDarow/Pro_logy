package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f4065f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4067b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4068c;

    /* renamed from: d, reason: collision with root package name */
    public int f4069d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4070e;

    public c0(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f4066a = i4;
        this.f4067b = iArr;
        this.f4068c = objArr;
        this.f4070e = z4;
    }

    public final void a(int i4) {
        int[] iArr = this.f4067b;
        if (i4 > iArr.length) {
            int i5 = this.f4066a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f4067b = Arrays.copyOf(iArr, i4);
            this.f4068c = Arrays.copyOf(this.f4068c, i4);
        }
    }

    public final int b() {
        int o02;
        int i4 = this.f4069d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4066a; i6++) {
            int i7 = this.f4067b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                o02 = C0160l.o0(((Long) this.f4068c[i6]).longValue(), i8);
            } else if (i9 == 1) {
                ((Long) this.f4068c[i6]).getClass();
                o02 = C0160l.a0(i8);
            } else if (i9 == 2) {
                o02 = C0160l.W(i8, (C0155g) this.f4068c[i6]);
            } else if (i9 == 3) {
                i5 = ((c0) this.f4068c[i6]).b() + (C0160l.l0(i8) * 2) + i5;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException(C0173z.b());
                }
                ((Integer) this.f4068c[i6]).getClass();
                o02 = C0160l.Z(i8);
            }
            i5 = o02 + i5;
        }
        this.f4069d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f4070e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4066a + 1);
        int[] iArr = this.f4067b;
        int i5 = this.f4066a;
        iArr[i5] = i4;
        this.f4068c[i5] = obj;
        this.f4066a = i5 + 1;
    }

    public final void d(E e4) {
        if (this.f4066a == 0) {
            return;
        }
        e4.getClass();
        for (int i4 = 0; i4 < this.f4066a; i4++) {
            int i5 = this.f4067b[i4];
            Object obj = this.f4068c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                e4.j(((Long) obj).longValue(), i6);
            } else if (i7 == 1) {
                e4.f(((Long) obj).longValue(), i6);
            } else if (i7 == 2) {
                e4.b(i6, (C0155g) obj);
            } else if (i7 == 3) {
                C0160l c0160l = (C0160l) e4.f4004a;
                c0160l.F0(i6, 3);
                ((c0) obj).d(e4);
                c0160l.F0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(C0173z.b());
                }
                e4.e(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i4 = this.f4066a;
        if (i4 == c0Var.f4066a) {
            int[] iArr = this.f4067b;
            int[] iArr2 = c0Var.f4067b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f4068c;
                    Object[] objArr2 = c0Var.f4068c;
                    int i6 = this.f4066a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f4066a;
        int i5 = (527 + i4) * 31;
        int[] iArr = this.f4067b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f4068c;
        int i10 = this.f4066a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
