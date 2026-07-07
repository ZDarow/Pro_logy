package a0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public int f3269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3270b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3271c;

    /* renamed from: d, reason: collision with root package name */
    public int f3272d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3273e;

    public K(int i4) {
        this.f3269a = i4;
        byte[] bArr = new byte[131];
        this.f3273e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i4, int i5) {
        if (this.f3270b) {
            int i6 = i5 - i4;
            byte[] bArr2 = (byte[]) this.f3273e;
            int length = bArr2.length;
            int i7 = this.f3272d;
            if (length < i7 + i6) {
                this.f3273e = Arrays.copyOf(bArr2, (i7 + i6) * 2);
            }
            System.arraycopy(bArr, i4, (byte[]) this.f3273e, this.f3272d, i6);
            this.f3272d += i6;
        }
    }

    public boolean b(int i4) {
        if (!this.f3270b) {
            return false;
        }
        this.f3272d -= i4;
        this.f3270b = false;
        this.f3271c = true;
        return true;
    }

    public void c(int i4) {
        this.f3270b |= i4 > 0;
        this.f3269a += i4;
    }

    public void d() {
        this.f3270b = false;
        this.f3271c = false;
    }

    public void e(int i4) {
        W.a.j(!this.f3270b);
        boolean z4 = i4 == this.f3269a;
        this.f3270b = z4;
        if (z4) {
            this.f3272d = 3;
            this.f3271c = false;
        }
    }

    public K(f0 f0Var) {
        this.f3273e = f0Var;
    }
}
