package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class P extends U.e {

    /* renamed from: i, reason: collision with root package name */
    public static final int f4589i = Float.floatToIntBits(Float.NaN);

    public static void m(int i4, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i4 * 4.656612875245797E-10d));
        if (floatToIntBits == f4589i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // U.d
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer l4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        int i5 = this.f2471b.f2468c;
        if (i5 == 21) {
            l4 = l((i4 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l4);
                position += 3;
            }
        } else if (i5 == 22) {
            l4 = l(i4);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l4);
                position += 4;
            }
        } else if (i5 == 1342177280) {
            l4 = l((i4 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 3;
            }
        } else {
            if (i5 != 1610612736) {
                throw new IllegalStateException();
            }
            l4 = l(i4);
            while (position < limit) {
                m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l4.flip();
    }

    @Override // U.e
    public final U.b h(U.b bVar) {
        int i4 = bVar.f2468c;
        if (i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4) {
            return i4 != 4 ? new U.b(bVar.f2466a, bVar.f2467b, 4) : U.b.f2465e;
        }
        throw new U.c(bVar);
    }
}
