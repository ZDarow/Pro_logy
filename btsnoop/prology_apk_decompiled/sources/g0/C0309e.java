package g0;

import a.AbstractC0110a;
import java.util.Arrays;
import r0.AbstractC0503e;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309e extends AbstractC0503e {

    /* renamed from: u, reason: collision with root package name */
    public byte[] f5648u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f5649v;
    public byte[] w;

    @Override // u0.k
    public final void b() {
        try {
            this.f8027t.b(this.f8021m);
            int i4 = 0;
            int i5 = 0;
            while (i4 != -1 && !this.f5649v) {
                byte[] bArr = this.f5648u;
                if (bArr.length < i5 + 16384) {
                    this.f5648u = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i4 = this.f8027t.read(this.f5648u, i5, 16384);
                if (i4 != -1) {
                    i5 += i4;
                }
            }
            if (!this.f5649v) {
                this.w = Arrays.copyOf(this.f5648u, i5);
            }
            AbstractC0110a.m(this.f8027t);
        } catch (Throwable th) {
            AbstractC0110a.m(this.f8027t);
            throw th;
        }
    }

    @Override // u0.k
    public final void c() {
        this.f5649v = true;
    }
}
