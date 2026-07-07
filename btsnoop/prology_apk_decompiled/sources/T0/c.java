package T0;

import T.C0095p;
import W.r;
import java.util.Arrays;
import u3.m;
import y0.AbstractC0619b;
import y0.s;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: n, reason: collision with root package name */
    public s f2382n;

    /* renamed from: o, reason: collision with root package name */
    public S0.e f2383o;

    @Override // T0.i
    public final long b(r rVar) {
        byte[] bArr = rVar.f2694a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            rVar.H(4);
            rVar.B();
        }
        int t4 = AbstractC0619b.t(i4, rVar);
        rVar.G(0);
        return t4;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [S0.e, java.lang.Object] */
    @Override // T0.i
    public final boolean c(r rVar, long j4, B1.d dVar) {
        byte[] bArr = rVar.f2694a;
        s sVar = this.f2382n;
        if (sVar == null) {
            s sVar2 = new s(bArr, 17);
            this.f2382n = sVar2;
            dVar.f96m = sVar2.c(Arrays.copyOfRange(bArr, 9, rVar.f2696c), null);
            return true;
        }
        byte b4 = bArr[0];
        if ((b4 & Byte.MAX_VALUE) != 3) {
            if (b4 != -1) {
                return true;
            }
            S0.e eVar = this.f2383o;
            if (eVar != null) {
                eVar.f1896l = j4;
                dVar.f97n = eVar;
            }
            ((C0095p) dVar.f96m).getClass();
            return false;
        }
        m u4 = AbstractC0619b.u(rVar);
        s sVar3 = new s(sVar.f9104a, sVar.f9105b, sVar.f9106c, sVar.f9107d, sVar.f9108e, sVar.f9110g, sVar.f9111h, sVar.f9113j, u4, sVar.f9115l);
        this.f2382n = sVar3;
        ?? obj = new Object();
        obj.f1898n = sVar3;
        obj.f1899o = u4;
        obj.f1896l = -1L;
        obj.f1897m = -1L;
        this.f2383o = obj;
        return true;
    }

    @Override // T0.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f2382n = null;
            this.f2383o = null;
        }
    }
}
