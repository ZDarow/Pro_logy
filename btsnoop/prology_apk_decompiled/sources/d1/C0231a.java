package d1;

import C.C0016c;
import T.G;
import V0.k;
import V0.l;
import W.r;
import W.y;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a implements l {

    /* renamed from: l, reason: collision with root package name */
    public final r f4925l;

    public C0231a(int i4) {
        switch (i4) {
            case 1:
                this.f4925l = new r(10);
                return;
            default:
                this.f4925l = new r();
                return;
        }
    }

    public G a(y0.l lVar, C0016c c0016c) {
        r rVar = this.f4925l;
        G g4 = null;
        int i4 = 0;
        while (true) {
            try {
                lVar.p(rVar.f2694a, 0, 10, false);
                rVar.G(0);
                if (rVar.x() != 4801587) {
                    break;
                }
                rVar.H(3);
                int t4 = rVar.t();
                int i5 = t4 + 10;
                if (g4 == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(rVar.f2694a, 0, bArr, 0, 10);
                    lVar.p(bArr, 10, t4, false);
                    g4 = new M0.h(c0016c).d0(bArr, i5);
                } else {
                    lVar.a(t4, false);
                }
                i4 += i5;
            } catch (EOFException unused) {
            }
        }
        lVar.f9091q = 0;
        lVar.a(i4, false);
        return g4;
    }

    @Override // V0.l
    public void h(byte[] bArr, int i4, int i5, k kVar, W.c cVar) {
        V.b a4;
        r rVar = this.f4925l;
        rVar.E(bArr, i4 + i5);
        rVar.G(i4);
        ArrayList arrayList = new ArrayList();
        while (rVar.a() > 0) {
            W.a.d("Incomplete Mp4Webvtt Top Level box header found.", rVar.a() >= 8);
            int h4 = rVar.h();
            if (rVar.h() == 1987343459) {
                int i6 = h4 - 8;
                CharSequence charSequence = null;
                V.a aVar = null;
                while (i6 > 0) {
                    W.a.d("Incomplete vtt cue box header found.", i6 >= 8);
                    int h5 = rVar.h();
                    int h6 = rVar.h();
                    int i7 = h5 - 8;
                    byte[] bArr2 = rVar.f2694a;
                    int i8 = rVar.f2695b;
                    int i9 = y.f2709a;
                    String str = new String(bArr2, i8, i7, e2.d.f5436c);
                    rVar.H(i7);
                    i6 = (i6 - 8) - i7;
                    if (h6 == 1937011815) {
                        h hVar = new h();
                        i.e(str, hVar);
                        aVar = hVar.a();
                    } else if (h6 == 1885436268) {
                        charSequence = i.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f2529a = charSequence;
                    a4 = aVar.a();
                } else {
                    Pattern pattern = i.f4969a;
                    h hVar2 = new h();
                    hVar2.f4960c = charSequence;
                    a4 = hVar2.a().a();
                }
                arrayList.add(a4);
            } else {
                rVar.H(h4 - 8);
            }
        }
        cVar.accept(new V0.a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // V0.l
    public int w() {
        return 2;
    }
}
