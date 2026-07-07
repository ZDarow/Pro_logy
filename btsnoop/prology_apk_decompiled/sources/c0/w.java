package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class w extends U.e {

    /* renamed from: i, reason: collision with root package name */
    public int[] f4685i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4686j;

    @Override // U.d
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f4686j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l4 = l(((limit - position) / this.f2471b.f2469d) * this.f2472c.f2469d);
        while (position < limit) {
            for (int i4 : iArr) {
                l4.putShort(byteBuffer.getShort((i4 * 2) + position));
            }
            position += this.f2471b.f2469d;
        }
        byteBuffer.position(limit);
        l4.flip();
    }

    @Override // U.e
    public final U.b h(U.b bVar) {
        int[] iArr = this.f4685i;
        if (iArr == null) {
            return U.b.f2465e;
        }
        if (bVar.f2468c != 2) {
            throw new U.c(bVar);
        }
        int length = iArr.length;
        int i4 = bVar.f2467b;
        boolean z4 = i4 != length;
        int i5 = 0;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            if (i6 >= i4) {
                throw new U.c(bVar);
            }
            z4 |= i6 != i5;
            i5++;
        }
        return z4 ? new U.b(bVar.f2466a, iArr.length, 2) : U.b.f2465e;
    }

    @Override // U.e
    public final void i() {
        this.f4686j = this.f4685i;
    }

    @Override // U.e
    public final void k() {
        this.f4686j = null;
        this.f4685i = null;
    }
}
