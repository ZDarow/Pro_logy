package e1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f5245f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5246a;

    /* renamed from: b, reason: collision with root package name */
    public int f5247b;

    /* renamed from: c, reason: collision with root package name */
    public int f5248c;

    /* renamed from: d, reason: collision with root package name */
    public int f5249d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5250e;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f5246a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f5250e;
            int length = bArr2.length;
            int i7 = this.f5248c + i6;
            if (length < i7) {
                this.f5250e = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i4, this.f5250e, this.f5248c, i6);
            this.f5248c += i6;
        }
    }
}
