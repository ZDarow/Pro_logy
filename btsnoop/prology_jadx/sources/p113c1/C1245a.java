package p113c1;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C1245a implements p083V0.InterfaceC0774l {

    /* renamed from: l */
    public final p086W.C0798r f4861l = new p086W.C0798r();

    /* renamed from: m */
    public final boolean f4862m;

    /* renamed from: n */
    public final int f4863n;

    /* renamed from: o */
    public final int f4864o;

    /* renamed from: p */
    public final java.lang.String f4865p;

    /* renamed from: q */
    public final float f4866q;

    /* renamed from: r */
    public final int f4867r;

    public C1245a(java.util.List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f4863n = 0;
            this.f4864o = -1;
            this.f4865p = "sans-serif";
            this.f4862m = false;
            this.f4866q = 0.85f;
            this.f4867r = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f4863n = bArr[24];
        this.f4864o = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f4865p = "Serif".equals(new java.lang.String(bArr, 43, bArr.length - 43, p124e2.AbstractC1356d.f5630c)) ? "serif" : "sans-serif";
        int i4 = bArr[25] * 20;
        this.f4867r = i4;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f4862m = z4;
        if (z4) {
            this.f4866q = p086W.AbstractC0805y.m1614i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i4, 0.0f, 0.95f);
        } else {
            this.f4866q = 0.85f;
        }
    }

    /* renamed from: a */
    public static void m2922a(android.text.SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i4 >>> 8) | ((i4 & 255) << 24)), i6, i7, i8 | 33);
        }
    }

    /* renamed from: c */
    public static void m2923c(android.text.SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            int i9 = i8 | 33;
            boolean z4 = (i4 & 1) != 0;
            boolean z5 = (i4 & 2) != 0;
            if (z4) {
                if (z5) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i6, i7, i9);
                }
            } else if (z5) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i6, i7, i9);
            }
            boolean z6 = (i4 & 4) != 0;
            if (z6) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i6, i7, i9);
            }
            if (z6 || z4 || z5) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i6, i7, i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p083V0.InterfaceC0774l
    /* renamed from: h */
    public final void mo692h(byte[] bArr, int i4, int i5, p083V0.C0773k c0773k, p086W.InterfaceC0783c interfaceC0783c) {
        java.lang.String m1557s;
        int i6 = 1;
        p086W.C0798r c0798r = this.f4861l;
        c0798r.m1535E(bArr, i4 + i5);
        c0798r.m1537G(i4);
        int i7 = 2;
        int i8 = 0;
        p086W.AbstractC0781a.m1416e(c0798r.m1539a() >= 2);
        int m1531A = c0798r.m1531A();
        if (m1531A == 0) {
            m1557s = "";
        } else {
            int i9 = c0798r.f2787b;
            java.nio.charset.Charset m1533C = c0798r.m1533C();
            int i10 = m1531A - (c0798r.f2787b - i9);
            if (m1533C == null) {
                m1533C = p124e2.AbstractC1356d.f5630c;
            }
            m1557s = c0798r.m1557s(i10, m1533C);
        }
        if (m1557s.isEmpty()) {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            interfaceC0783c.accept(new p083V0.C0763a(p129f2.C1415c0.f5744p, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(m1557s);
        m2923c(spannableStringBuilder, this.f4863n, 0, 0, spannableStringBuilder.length(), 16711680);
        m2922a(spannableStringBuilder, this.f4864o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        java.lang.String str = this.f4865p;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), 0, length, 16711713);
        }
        float f4 = this.f4866q;
        while (c0798r.m1539a() >= 8) {
            int i11 = c0798r.f2787b;
            int m1546h = c0798r.m1546h();
            int m1546h2 = c0798r.m1546h();
            if (m1546h2 == 1937013100) {
                p086W.AbstractC0781a.m1416e(c0798r.m1539a() >= i7 ? i6 : i8);
                int m1531A2 = c0798r.m1531A();
                int i12 = i8;
                while (i12 < m1531A2) {
                    p086W.AbstractC0781a.m1416e(c0798r.m1539a() >= 12 ? i6 : i8);
                    int m1531A3 = c0798r.m1531A();
                    int m1531A4 = c0798r.m1531A();
                    c0798r.m1538H(i7);
                    int m1559u = c0798r.m1559u();
                    c0798r.m1538H(i6);
                    int m1546h3 = c0798r.m1546h();
                    if (m1531A4 > spannableStringBuilder.length()) {
                        p086W.AbstractC0781a.m1410A("Tx3gParser", "Truncating styl end (" + m1531A4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        m1531A4 = spannableStringBuilder.length();
                    }
                    if (m1531A3 >= m1531A4) {
                        p086W.AbstractC0781a.m1410A("Tx3gParser", "Ignoring styl with start (" + m1531A3 + ") >= end (" + m1531A4 + ").");
                    } else {
                        int i13 = m1531A4;
                        m2923c(spannableStringBuilder, m1559u, this.f4863n, m1531A3, i13, 0);
                        m2922a(spannableStringBuilder, m1546h3, this.f4864o, m1531A3, i13, 0);
                    }
                    i6 = 1;
                    i12++;
                    i7 = 2;
                    i8 = 0;
                }
            } else if (m1546h2 == 1952608120 && this.f4862m) {
                i7 = 2;
                p086W.AbstractC0781a.m1416e(c0798r.m1539a() >= 2 ? i6 : 0);
                f4 = p086W.AbstractC0805y.m1614i(c0798r.m1531A() / this.f4867r, 0.0f, 0.95f);
            } else {
                i7 = 2;
            }
            c0798r.m1537G(i11 + m1546h);
            i8 = 0;
        }
        interfaceC0783c.accept(new p083V0.C0763a(p129f2.AbstractC1393I.m3166o(new p082V.C0757b(spannableStringBuilder, null, null, null, f4, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p083V0.InterfaceC0774l
    /* renamed from: w */
    public final int mo703w() {
        return 2;
    }
}
