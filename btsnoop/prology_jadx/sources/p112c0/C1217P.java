package p112c0;

/* renamed from: c0.P */
/* loaded from: classes.dex */
public final class C1217P extends p079U.AbstractC0744e {

    /* renamed from: i */
    public static final int f4755i = java.lang.Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    public static void m2895m(int i4, java.nio.ByteBuffer byteBuffer) {
        int floatToIntBits = java.lang.Float.floatToIntBits((float) (i4 * 4.656612875245797E-10d));
        if (floatToIntBits == f4755i) {
            floatToIntBits = java.lang.Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: f */
    public final void mo1342f(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer m1348l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        int i5 = this.f2558b.f2555c;
        if (i5 == 21) {
            m1348l = m1348l((i4 / 3) * 4);
            while (position < limit) {
                m2895m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m1348l);
                position += 3;
            }
        } else if (i5 == 22) {
            m1348l = m1348l(i4);
            while (position < limit) {
                m2895m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m1348l);
                position += 4;
            }
        } else if (i5 == 1342177280) {
            m1348l = m1348l((i4 / 3) * 4);
            while (position < limit) {
                m2895m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m1348l);
                position += 3;
            }
        } else {
            if (i5 != 1610612736) {
                throw new java.lang.IllegalStateException();
            }
            m1348l = m1348l(i4);
            while (position < limit) {
                m2895m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m1348l);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m1348l.flip();
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: h */
    public final p079U.C0741b mo1344h(p079U.C0741b c0741b) {
        int i4 = c0741b.f2555c;
        if (i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4) {
            return i4 != 4 ? new p079U.C0741b(c0741b.f2553a, c0741b.f2554b, 4) : p079U.C0741b.f2552e;
        }
        throw new p079U.C0742c(c0741b);
    }
}
