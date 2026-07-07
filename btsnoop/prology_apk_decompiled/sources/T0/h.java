package T0;

import T.C0094o;
import T.C0095p;
import T.G;
import T.H;
import W.r;
import f2.I;
import java.util.ArrayList;
import java.util.Arrays;
import y0.AbstractC0619b;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f2399o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f2400p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f2401n;

    public static boolean e(r rVar, byte[] bArr) {
        if (rVar.a() < bArr.length) {
            return false;
        }
        int i4 = rVar.f2695b;
        byte[] bArr2 = new byte[bArr.length];
        rVar.f(bArr2, 0, bArr.length);
        rVar.G(i4);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // T0.i
    public final long b(r rVar) {
        byte[] bArr = rVar.f2694a;
        return (this.f2410i * AbstractC0619b.l(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // T0.i
    public final boolean c(r rVar, long j4, B1.d dVar) {
        if (e(rVar, f2399o)) {
            byte[] copyOf = Arrays.copyOf(rVar.f2694a, rVar.f2696c);
            int i4 = copyOf[9] & 255;
            ArrayList c4 = AbstractC0619b.c(copyOf);
            if (((C0095p) dVar.f96m) != null) {
                return true;
            }
            C0094o c0094o = new C0094o();
            c0094o.f2290l = H.l("audio/opus");
            c0094o.f2302z = i4;
            c0094o.f2270A = 48000;
            c0094o.f2293o = c4;
            dVar.f96m = new C0095p(c0094o);
            return true;
        }
        if (!e(rVar, f2400p)) {
            W.a.k((C0095p) dVar.f96m);
            return false;
        }
        W.a.k((C0095p) dVar.f96m);
        if (this.f2401n) {
            return true;
        }
        this.f2401n = true;
        rVar.H(8);
        G s = AbstractC0619b.s(I.k((String[]) AbstractC0619b.v(rVar, false, false).f8747l));
        if (s == null) {
            return true;
        }
        C0094o a4 = ((C0095p) dVar.f96m).a();
        a4.f2288j = s.e(((C0095p) dVar.f96m).f2323k);
        dVar.f96m = new C0095p(a4);
        return true;
    }

    @Override // T0.i
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f2401n = false;
        }
    }
}
