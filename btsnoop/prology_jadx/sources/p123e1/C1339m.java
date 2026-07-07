package p123e1;

/* renamed from: e1.m */
/* loaded from: classes.dex */
public final class C1339m {

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f5442a;

    /* renamed from: b */
    public boolean f5443b;

    /* renamed from: c */
    public boolean f5444c;

    /* renamed from: d */
    public boolean f5445d;

    /* renamed from: e */
    public int f5446e;

    /* renamed from: f */
    public int f5447f;

    /* renamed from: g */
    public long f5448g;

    /* renamed from: h */
    public long f5449h;

    public C1339m(p215y0.InterfaceC2387F interfaceC2387F) {
        this.f5442a = interfaceC2387F;
    }

    /* renamed from: a */
    public final void m3102a(byte[] bArr, int i4, int i5) {
        if (this.f5444c) {
            int i6 = this.f5447f;
            int i7 = (i4 + 1) - i6;
            if (i7 >= i5) {
                this.f5447f = (i5 - i4) + i6;
            } else {
                this.f5445d = ((bArr[i7] & 192) >> 6) == 0;
                this.f5444c = false;
            }
        }
    }

    /* renamed from: b */
    public final void m3103b(int i4, long j4, boolean z4) {
        p086W.AbstractC0781a.m1421j(this.f5449h != -9223372036854775807L);
        if (this.f5446e == 182 && z4 && this.f5443b) {
            this.f5442a.mo1406b(this.f5449h, this.f5445d ? 1 : 0, (int) (j4 - this.f5448g), i4, null);
        }
        if (this.f5446e != 179) {
            this.f5448g = j4;
        }
    }
}
