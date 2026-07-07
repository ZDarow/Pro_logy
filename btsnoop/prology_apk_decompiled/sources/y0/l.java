package y0;

import T.InterfaceC0089j;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0089j f9087m;

    /* renamed from: n, reason: collision with root package name */
    public final long f9088n;

    /* renamed from: o, reason: collision with root package name */
    public long f9089o;

    /* renamed from: q, reason: collision with root package name */
    public int f9091q;

    /* renamed from: r, reason: collision with root package name */
    public int f9092r;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f9090p = new byte[65536];

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f9086l = new byte[4096];

    static {
        T.C.a("media3.extractor");
    }

    public l(InterfaceC0089j interfaceC0089j, long j4, long j5) {
        this.f9087m = interfaceC0089j;
        this.f9089o = j4;
        this.f9088n = j5;
    }

    @Override // y0.p
    public final void A(int i4) {
        a(i4, false);
    }

    @Override // y0.p
    public final long B() {
        return this.f9089o;
    }

    public final boolean a(int i4, boolean z4) {
        c(i4);
        int i5 = this.f9092r - this.f9091q;
        while (i5 < i4) {
            i5 = i(this.f9090p, this.f9091q, i4, i5, z4);
            if (i5 == -1) {
                return false;
            }
            this.f9092r = this.f9091q + i5;
        }
        this.f9091q += i4;
        return true;
    }

    public final void c(int i4) {
        int i5 = this.f9091q + i4;
        byte[] bArr = this.f9090p;
        if (i5 > bArr.length) {
            this.f9090p = Arrays.copyOf(this.f9090p, W.y.j(bArr.length * 2, 65536 + i5, i5 + 524288));
        }
    }

    @Override // y0.p
    public final void d() {
        this.f9091q = 0;
    }

    @Override // y0.p
    public final void e(int i4) {
        int min = Math.min(this.f9092r, i4);
        q(min);
        int i5 = min;
        while (i5 < i4 && i5 != -1) {
            byte[] bArr = this.f9086l;
            i5 = i(bArr, -i5, Math.min(i4, bArr.length + i5), i5, false);
        }
        if (i5 != -1) {
            this.f9089o += i5;
        }
    }

    public final int f(byte[] bArr, int i4, int i5) {
        int min;
        c(i5);
        int i6 = this.f9092r;
        int i7 = this.f9091q;
        int i8 = i6 - i7;
        if (i8 == 0) {
            min = i(this.f9090p, i7, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f9092r += min;
        } else {
            min = Math.min(i5, i8);
        }
        System.arraycopy(this.f9090p, this.f9091q, bArr, i4, min);
        this.f9091q += min;
        return min;
    }

    public final int i(byte[] bArr, int i4, int i5, int i6, boolean z4) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f9087m.read(bArr, i4 + i6, i5 - i6);
        if (read != -1) {
            return i6 + read;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // y0.p
    public final boolean k(byte[] bArr, int i4, int i5, boolean z4) {
        int min;
        int i6 = this.f9092r;
        if (i6 == 0) {
            min = 0;
        } else {
            min = Math.min(i6, i5);
            System.arraycopy(this.f9090p, 0, bArr, i4, min);
            q(min);
        }
        int i7 = min;
        while (i7 < i5 && i7 != -1) {
            i7 = i(bArr, i4, i5, i7, z4);
        }
        if (i7 != -1) {
            this.f9089o += i7;
        }
        return i7 != -1;
    }

    public final int l(int i4) {
        int min = Math.min(this.f9092r, i4);
        q(min);
        if (min == 0) {
            byte[] bArr = this.f9086l;
            min = i(bArr, 0, Math.min(i4, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f9089o += min;
        }
        return min;
    }

    @Override // y0.p
    public final long n() {
        return this.f9088n;
    }

    @Override // y0.p
    public final boolean p(byte[] bArr, int i4, int i5, boolean z4) {
        if (!a(i5, z4)) {
            return false;
        }
        System.arraycopy(this.f9090p, this.f9091q - i5, bArr, i4, i5);
        return true;
    }

    public final void q(int i4) {
        int i5 = this.f9092r - i4;
        this.f9092r = i5;
        this.f9091q = 0;
        byte[] bArr = this.f9090p;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        this.f9090p = bArr2;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = this.f9092r;
        int i7 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i5);
            System.arraycopy(this.f9090p, 0, bArr, i4, min);
            q(min);
            i7 = min;
        }
        if (i7 == 0) {
            i7 = i(bArr, i4, i5, 0, true);
        }
        if (i7 != -1) {
            this.f9089o += i7;
        }
        return i7;
    }

    @Override // y0.p
    public final void readFully(byte[] bArr, int i4, int i5) {
        k(bArr, i4, i5, false);
    }

    @Override // y0.p
    public final long w() {
        return this.f9089o + this.f9091q;
    }

    @Override // y0.p
    public final void z(byte[] bArr, int i4, int i5) {
        p(bArr, i4, i5, false);
    }
}
