package p215y0;

/* renamed from: y0.G */
/* loaded from: classes.dex */
public final class C2388G {

    /* renamed from: a */
    public final byte[] f9363a = new byte[10];

    /* renamed from: b */
    public boolean f9364b;

    /* renamed from: c */
    public int f9365c;

    /* renamed from: d */
    public long f9366d;

    /* renamed from: e */
    public int f9367e;

    /* renamed from: f */
    public int f9368f;

    /* renamed from: g */
    public int f9369g;

    /* renamed from: a */
    public final void m4603a(p215y0.InterfaceC2387F interfaceC2387F, p215y0.C2386E c2386e) {
        if (this.f9365c > 0) {
            interfaceC2387F.mo1406b(this.f9366d, this.f9367e, this.f9368f, this.f9369g, c2386e);
            this.f9365c = 0;
        }
    }

    /* renamed from: b */
    public final void m4604b(p215y0.InterfaceC2387F interfaceC2387F, long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
        p086W.AbstractC0781a.m1420i("TrueHD chunk samples must be contiguous in the sample queue.", this.f9369g <= i5 + i6);
        if (this.f9364b) {
            int i7 = this.f9365c;
            int i8 = i7 + 1;
            this.f9365c = i8;
            if (i7 == 0) {
                this.f9366d = j4;
                this.f9367e = i4;
                this.f9368f = 0;
            }
            this.f9368f += i5;
            this.f9369g = i6;
            if (i8 >= 16) {
                m4603a(interfaceC2387F, c2386e);
            }
        }
    }

    /* renamed from: c */
    public final void m4605c(p215y0.InterfaceC2404p interfaceC2404p) {
        if (this.f9364b) {
            return;
        }
        byte[] bArr = this.f9363a;
        int i4 = 0;
        interfaceC2404p.mo642z(bArr, 0, 10);
        interfaceC2404p.mo627d();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                i4 = 40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i4 == 0) {
            return;
        }
        this.f9364b = true;
    }
}
