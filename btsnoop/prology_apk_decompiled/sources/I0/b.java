package I0;

import T.G;
import W.q;
import W.r;
import e2.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class b extends AbstractC0462a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f888a;

    public static J0.a d0(r rVar) {
        String p2 = rVar.p();
        p2.getClass();
        String p4 = rVar.p();
        p4.getClass();
        return new J0.a(p2, p4, rVar.o(), rVar.o(), Arrays.copyOfRange(rVar.f2694a, rVar.f2695b, rVar.f2696c));
    }

    @Override // p1.AbstractC0462a
    public final G v(H0.a aVar, ByteBuffer byteBuffer) {
        switch (this.f888a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    q qVar = new q(byteBuffer.array(), byteBuffer.limit());
                    int i4 = 12;
                    qVar.t(12);
                    int f4 = (qVar.f() + qVar.i(12)) - 4;
                    qVar.t(44);
                    qVar.u(qVar.i(12));
                    qVar.t(16);
                    ArrayList arrayList = new ArrayList();
                    while (qVar.f() < f4) {
                        qVar.t(48);
                        int i5 = qVar.i(8);
                        qVar.t(4);
                        int f5 = qVar.f() + qVar.i(i4);
                        String str = null;
                        String str2 = null;
                        while (qVar.f() < f5) {
                            int i6 = qVar.i(8);
                            int i7 = qVar.i(8);
                            int f6 = qVar.f() + i7;
                            if (i6 == 2) {
                                int i8 = qVar.i(16);
                                qVar.t(8);
                                if (i8 == 3) {
                                    while (qVar.f() < f6) {
                                        int i9 = qVar.i(8);
                                        Charset charset = d.f5434a;
                                        byte[] bArr = new byte[i9];
                                        qVar.l(bArr, i9);
                                        String str3 = new String(bArr, charset);
                                        int i10 = qVar.i(8);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            qVar.u(qVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i6 == 21) {
                                Charset charset2 = d.f5434a;
                                byte[] bArr2 = new byte[i7];
                                qVar.l(bArr2, i7);
                                str2 = new String(bArr2, charset2);
                            }
                            qVar.q(f6 * 8);
                        }
                        qVar.q(f5 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(str.concat(str2), i5));
                        }
                        i4 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new G(arrayList);
                    }
                }
                return null;
            default:
                return new G(d0(new r(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
