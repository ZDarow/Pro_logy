package y0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f9000a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9001b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9003d;

    public E(int i4, int i5, int i6, byte[] bArr) {
        this.f9000a = i4;
        this.f9001b = bArr;
        this.f9002c = i5;
        this.f9003d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        return this.f9000a == e4.f9000a && this.f9002c == e4.f9002c && this.f9003d == e4.f9003d && Arrays.equals(this.f9001b, e4.f9001b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9001b) + (this.f9000a * 31)) * 31) + this.f9002c) * 31) + this.f9003d;
    }
}
