package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Q extends U.e {

    /* renamed from: i, reason: collision with root package name */
    public int f4590i;

    /* renamed from: j, reason: collision with root package name */
    public int f4591j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4592k;

    /* renamed from: l, reason: collision with root package name */
    public int f4593l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f4594m;

    /* renamed from: n, reason: collision with root package name */
    public int f4595n;

    /* renamed from: o, reason: collision with root package name */
    public long f4596o;

    @Override // U.e, U.d
    public final ByteBuffer c() {
        int i4;
        if (super.e() && (i4 = this.f4595n) > 0) {
            l(i4).put(this.f4594m, 0, this.f4595n).flip();
            this.f4595n = 0;
        }
        return super.c();
    }

    @Override // U.e, U.d
    public final boolean e() {
        return super.e() && this.f4595n == 0;
    }

    @Override // U.d
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        if (i4 == 0) {
            return;
        }
        int min = Math.min(i4, this.f4593l);
        this.f4596o += min / this.f2471b.f2469d;
        this.f4593l -= min;
        byteBuffer.position(position + min);
        if (this.f4593l > 0) {
            return;
        }
        int i5 = i4 - min;
        int length = (this.f4595n + i5) - this.f4594m.length;
        ByteBuffer l4 = l(length);
        int j4 = W.y.j(length, 0, this.f4595n);
        l4.put(this.f4594m, 0, j4);
        int j5 = W.y.j(length - j4, 0, i5);
        byteBuffer.limit(byteBuffer.position() + j5);
        l4.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i5 - j5;
        int i7 = this.f4595n - j4;
        this.f4595n = i7;
        byte[] bArr = this.f4594m;
        System.arraycopy(bArr, j4, bArr, 0, i7);
        byteBuffer.get(this.f4594m, this.f4595n, i6);
        this.f4595n += i6;
        l4.flip();
    }

    @Override // U.e
    public final U.b h(U.b bVar) {
        if (bVar.f2468c != 2) {
            throw new U.c(bVar);
        }
        this.f4592k = true;
        return (this.f4590i == 0 && this.f4591j == 0) ? U.b.f2465e : bVar;
    }

    @Override // U.e
    public final void i() {
        if (this.f4592k) {
            this.f4592k = false;
            int i4 = this.f4591j;
            int i5 = this.f2471b.f2469d;
            this.f4594m = new byte[i4 * i5];
            this.f4593l = this.f4590i * i5;
        }
        this.f4595n = 0;
    }

    @Override // U.e
    public final void j() {
        if (this.f4592k) {
            if (this.f4595n > 0) {
                this.f4596o += r0 / this.f2471b.f2469d;
            }
            this.f4595n = 0;
        }
    }

    @Override // U.e
    public final void k() {
        this.f4594m = W.y.f2714f;
    }
}
