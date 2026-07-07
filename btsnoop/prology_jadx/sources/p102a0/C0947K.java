package p102a0;

/* renamed from: a0.K */
/* loaded from: classes.dex */
public final class C0947K {

    /* renamed from: a */
    public int f3384a;

    /* renamed from: b */
    public boolean f3385b;

    /* renamed from: c */
    public boolean f3386c;

    /* renamed from: d */
    public int f3387d;

    /* renamed from: e */
    public java.lang.Object f3388e;

    public C0947K(int i4) {
        this.f3384a = i4;
        byte[] bArr = new byte[131];
        this.f3388e = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m1864a(byte[] bArr, int i4, int i5) {
        if (this.f3385b) {
            int i6 = i5 - i4;
            byte[] bArr2 = (byte[]) this.f3388e;
            int length = bArr2.length;
            int i7 = this.f3387d;
            if (length < i7 + i6) {
                this.f3388e = java.util.Arrays.copyOf(bArr2, (i7 + i6) * 2);
            }
            java.lang.System.arraycopy(bArr, i4, (byte[]) this.f3388e, this.f3387d, i6);
            this.f3387d += i6;
        }
    }

    /* renamed from: b */
    public boolean m1865b(int i4) {
        if (!this.f3385b) {
            return false;
        }
        this.f3387d -= i4;
        this.f3385b = false;
        this.f3386c = true;
        return true;
    }

    /* renamed from: c */
    public void m1866c(int i4) {
        this.f3385b |= i4 > 0;
        this.f3384a += i4;
    }

    /* renamed from: d */
    public void m1867d() {
        this.f3385b = false;
        this.f3386c = false;
    }

    /* renamed from: e */
    public void m1868e(int i4) {
        p086W.AbstractC0781a.m1421j(!this.f3385b);
        boolean z4 = i4 == this.f3384a;
        this.f3385b = z4;
        if (z4) {
            this.f3387d = 3;
            this.f3386c = false;
        }
    }

    public C0947K(p102a0.C0973f0 c0973f0) {
        this.f3388e = c0973f0;
    }
}
