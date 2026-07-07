package V0;

import B2.x;
import f2.C0278F;
import f2.I;

/* loaded from: classes.dex */
public interface l {
    default d F(byte[] bArr, int i4, int i5) {
        C0278F i6 = I.i();
        h(bArr, 0, i5, k.f2620c, new x(11, i6));
        return new b(i6.g());
    }

    default void b() {
    }

    void h(byte[] bArr, int i4, int i5, k kVar, W.c cVar);

    int w();
}
