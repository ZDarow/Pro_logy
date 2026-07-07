package p123e1;

/* renamed from: e1.j */
/* loaded from: classes.dex */
public final class C1336j {

    /* renamed from: e */
    public static final byte[] f5414e = {0, 0, 1};

    /* renamed from: a */
    public boolean f5415a;

    /* renamed from: b */
    public int f5416b;

    /* renamed from: c */
    public int f5417c;

    /* renamed from: d */
    public byte[] f5418d;

    /* renamed from: a */
    public final void m3100a(byte[] bArr, int i4, int i5) {
        if (this.f5415a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f5418d;
            int length = bArr2.length;
            int i7 = this.f5416b + i6;
            if (length < i7) {
                this.f5418d = java.util.Arrays.copyOf(bArr2, i7 * 2);
            }
            java.lang.System.arraycopy(bArr, i4, this.f5418d, this.f5416b, i6);
            this.f5416b += i6;
        }
    }
}
