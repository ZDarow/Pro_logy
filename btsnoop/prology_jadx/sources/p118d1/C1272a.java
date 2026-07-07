package p118d1;

/* renamed from: d1.a */
/* loaded from: classes.dex */
public final class C1272a implements p083V0.InterfaceC0774l {

    /* renamed from: l */
    public final p086W.C0798r f5112l;

    public C1272a(int i4) {
        switch (i4) {
            case 1:
                this.f5112l = new p086W.C0798r(10);
                return;
            default:
                this.f5112l = new p086W.C0798r();
                return;
        }
    }

    /* renamed from: a */
    public p076T.C0664G m3004a(p215y0.C2400l c2400l, p011C.C0111c c0111c) {
        p086W.C0798r c0798r = this.f5112l;
        p076T.C0664G c0664g = null;
        int i4 = 0;
        while (true) {
            try {
                c2400l.mo634p(c0798r.f2786a, 0, 10, false);
                c0798r.m1537G(0);
                if (c0798r.m1562x() != 4801587) {
                    break;
                }
                c0798r.m1538H(3);
                int m1558t = c0798r.m1558t();
                int i5 = m1558t + 10;
                if (c0664g == null) {
                    byte[] bArr = new byte[i5];
                    java.lang.System.arraycopy(c0798r.f2786a, 0, bArr, 0, 10);
                    c2400l.mo634p(bArr, 10, m1558t, false);
                    c0664g = new p049M0.C0409h(c0111c).m881d0(bArr, i5);
                } else {
                    c2400l.m4631a(m1558t, false);
                }
                i4 += i5;
            } catch (java.io.EOFException unused) {
            }
        }
        c2400l.f9452q = 0;
        c2400l.m4631a(i4, false);
        return c0664g;
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        p082V.C0757b m1396a;
        p086W.C0798r c0798r = this.f5112l;
        c0798r.m1535E(bArr, i4 + i5);
        c0798r.m1537G(i4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (c0798r.m1539a() > 0) {
            p086W.AbstractC0781a.m1415d("Incomplete Mp4Webvtt Top Level box header found.", c0798r.m1539a() >= 8);
            int m1546h = c0798r.m1546h();
            if (c0798r.m1546h() == 1987343459) {
                int i6 = m1546h - 8;
                java.lang.CharSequence charSequence = null;
                p082V.C0756a c0756a = null;
                while (i6 > 0) {
                    p086W.AbstractC0781a.m1415d("Incomplete vtt cue box header found.", i6 >= 8);
                    int m1546h2 = c0798r.m1546h();
                    int m1546h3 = c0798r.m1546h();
                    int i7 = m1546h2 - 8;
                    byte[] bArr2 = c0798r.f2786a;
                    int i8 = c0798r.f2787b;
                    int i9 = p086W.AbstractC0805y.f2801a;
                    java.lang.String str = new java.lang.String(bArr2, i8, i7, p124e2.AbstractC1356d.f5630c);
                    c0798r.m1538H(i7);
                    i6 = (i6 - 8) - i7;
                    if (m1546h3 == 1937011815) {
                        p118d1.C1279h c1279h = new p118d1.C1279h();
                        p118d1.AbstractC1280i.m3014e(str, c1279h);
                        c0756a = c1279h.m3009a();
                    } else if (m1546h3 == 1885436268) {
                        charSequence = p118d1.AbstractC1280i.m3015f(null, str.trim(), java.util.Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c0756a != null) {
                    c0756a.f2617a = charSequence;
                    m1396a = c0756a.m1396a();
                } else {
                    java.util.regex.Pattern pattern = p118d1.AbstractC1280i.f5156a;
                    p118d1.C1279h c1279h2 = new p118d1.C1279h();
                    c1279h2.f5147c = charSequence;
                    m1396a = c1279h2.m3009a().m1396a();
                }
                arrayList.add(m1396a);
            } else {
                c0798r.m1538H(m1546h - 8);
            }
        }
        interfaceC0783c.accept(new p083V0.C0763a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public int mo703w() {
        return 2;
    }
}
