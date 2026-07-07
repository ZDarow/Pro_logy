package p107b0;

/* renamed from: b0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1169d implements p086W.InterfaceC0788h, p124e2.InterfaceC1357e, p215y0.InterfaceC2406r, p086W.InterfaceC0783c {

    /* renamed from: l */
    public final /* synthetic */ int f4496l;

    public /* synthetic */ C1169d(int i4) {
        this.f4496l = i4;
    }

    /* renamed from: d */
    public static android.graphics.Bitmap m2736d(byte[] bArr, int i4) {
        try {
            return p080U1.AbstractC0748a.m1376i(bArr, i4);
        } catch (p076T.C0666I e4) {
            throw new java.lang.Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i4 + ")", e4);
        } catch (java.io.IOException e5) {
            throw new java.lang.Exception(e5);
        }
    }

    @Override // p086W.InterfaceC0783c
    public void accept(java.lang.Object obj) {
        ((p179q0.C1981X) obj).f8077b.getClass();
    }

    @Override // p124e2.InterfaceC1357e
    public java.lang.Object apply(java.lang.Object obj) {
        switch (this.f4496l) {
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return p129f2.AbstractC1393I.m3166o(java.lang.Integer.valueOf(((p184r0.C2050h) obj).f8353l));
            case 12:
                p132g0.C1473r c1473r = (p132g0.C1473r) obj;
                c1473r.m3300a();
                p179q0.C2005k0 c2005k0 = c1473r.f5971T;
                return p129f2.AbstractC1393I.m3162j(p129f2.AbstractC1444r.m3243w(c2005k0.f8185b, new p107b0.C1169d(19)));
            case 15:
                return p129f2.AbstractC1393I.m3166o(java.lang.Integer.valueOf(((p184r0.C2050h) obj).f8353l));
            case 16:
                return ((p215y0.InterfaceC2403o) obj).mo1404d().getClass().getSimpleName();
            case 17:
                p179q0.C2005k0 mo2956e = ((p179q0.InterfaceC1962D) obj).mo2956e();
                return p129f2.AbstractC1393I.m3162j(p129f2.AbstractC1444r.m3243w(mo2956e.f8185b, new p107b0.C1169d(19)));
            case 19:
                return java.lang.Integer.valueOf(((p076T.C0678V) obj).f2251c);
            case 20:
                return java.lang.Long.valueOf(((p083V0.C0763a) obj).f2688b);
            default:
                return java.lang.Long.valueOf(((p083V0.C0763a) obj).f2689c);
        }
    }

    @Override // p086W.InterfaceC0788h
    /* renamed from: b */
    public void mo285b(java.lang.Object obj) {
        p107b0.C1175j c1175j = (p107b0.C1175j) obj;
        switch (this.f4496l) {
            case 0:
                c1175j.getClass();
                return;
            case 1:
                c1175j.getClass();
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                c1175j.getClass();
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                c1175j.getClass();
                return;
            default:
                c1175j.getClass();
                return;
        }
    }

    @Override // p215y0.InterfaceC2406r
    /* renamed from: c */
    public p215y0.InterfaceC2403o[] mo403c() {
        switch (this.f4496l) {
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new p215y0.InterfaceC2403o[]{new p123e1.C1327a()};
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p215y0.InterfaceC2403o[]{new p123e1.C1329c()};
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return new p215y0.InterfaceC2403o[]{new p123e1.C1330d(0)};
            case 9:
                return new p215y0.InterfaceC2403o[]{new p123e1.C1319A()};
            case 10:
                p025F1.C0215g c0215g = p083V0.InterfaceC0772j.f2711c;
                p086W.C0803w c0803w = new p086W.C0803w(0L);
                p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                return new p215y0.InterfaceC2403o[]{new p123e1.C1323E(1, 1, c0215g, c0803w, new p123e1.C1332f(0, p129f2.C1415c0.f5744p))};
            default:
                return new p215y0.InterfaceC2403o[]{new p128f1.C1382d()};
        }
    }

    /* renamed from: e */
    public java.lang.reflect.Constructor m2737e() {
        switch (this.f4496l) {
            case 22:
                if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p215y0.InterfaceC2403o.class).getConstructor(java.lang.Integer.TYPE);
                }
                return null;
            default:
                return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p215y0.InterfaceC2403o.class).getConstructor(null);
        }
    }

    public /* synthetic */ C1169d(p107b0.C1166a c1166a, p193t0.C2173k c2173k) {
        this.f4496l = 0;
    }
}
