package p123e1;

/* renamed from: e1.l */
/* loaded from: classes.dex */
public final class C1338l {

    /* renamed from: f */
    public static final byte[] f5436f = {0, 0, 1};

    /* renamed from: a */
    public boolean f5437a;

    /* renamed from: b */
    public int f5438b;

    /* renamed from: c */
    public int f5439c;

    /* renamed from: d */
    public int f5440d;

    /* renamed from: e */
    public byte[] f5441e;

    /* renamed from: a */
    public final void m3101a(byte[] bArr, int i4, int i5) {
        if (this.f5437a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f5441e;
            int length = bArr2.length;
            int i7 = this.f5439c + i6;
            if (length < i7) {
                this.f5441e = java.util.Arrays.copyOf(bArr2, i7 * 2);
            }
            java.lang.System.arraycopy(bArr, i4, this.f5441e, this.f5439c, i6);
            this.f5439c += i6;
        }
    }
}
