package p215y0;

/* renamed from: y0.E */
/* loaded from: classes.dex */
public final class C2386E {

    /* renamed from: a */
    public final int f9359a;

    /* renamed from: b */
    public final byte[] f9360b;

    /* renamed from: c */
    public final int f9361c;

    /* renamed from: d */
    public final int f9362d;

    public C2386E(int i4, int i5, int i6, byte[] bArr) {
        this.f9359a = i4;
        this.f9360b = bArr;
        this.f9361c = i5;
        this.f9362d = i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p215y0.C2386E.class != obj.getClass()) {
            return false;
        }
        p215y0.C2386E c2386e = (p215y0.C2386E) obj;
        return this.f9359a == c2386e.f9359a && this.f9361c == c2386e.f9361c && this.f9362d == c2386e.f9362d && java.util.Arrays.equals(this.f9360b, c2386e.f9360b);
    }

    public final int hashCode() {
        return ((((java.util.Arrays.hashCode(this.f9360b) + (this.f9359a * 31)) * 31) + this.f9361c) * 31) + this.f9362d;
    }
}
