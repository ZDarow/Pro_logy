package e1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f5223e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5224a;

    /* renamed from: b, reason: collision with root package name */
    public int f5225b;

    /* renamed from: c, reason: collision with root package name */
    public int f5226c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5227d;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f5224a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f5227d;
            int length = bArr2.length;
            int i7 = this.f5225b + i6;
            if (length < i7) {
                this.f5227d = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i4, this.f5227d, this.f5225b, i6);
            this.f5225b += i6;
        }
    }
}
