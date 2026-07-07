package p087W0;

/* renamed from: W0.g */
/* loaded from: classes.dex */
public final class C0812g extends p087W0.AbstractC0814i {

    /* renamed from: h */
    public final p086W.C0798r f2889h = new p086W.C0798r();

    /* renamed from: i */
    public final p086W.C0797q f2890i = new p086W.C0797q();

    /* renamed from: j */
    public int f2891j = -1;

    /* renamed from: k */
    public final int f2892k;

    /* renamed from: l */
    public final p087W0.C0811f[] f2893l;

    /* renamed from: m */
    public p087W0.C0811f f2894m;

    /* renamed from: n */
    public java.util.List f2895n;

    /* renamed from: o */
    public java.util.List f2896o;

    /* renamed from: p */
    public p086W.C0797q f2897p;

    /* renamed from: q */
    public int f2898q;

    public C0812g(int i4, java.util.List list) {
        this.f2892k = i4 == -1 ? 1 : i4;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b4 = ((byte[]) list.get(0))[0];
        }
        this.f2893l = new p087W0.C0811f[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f2893l[i5] = new p087W0.C0811f();
        }
        this.f2894m = this.f2893l[0];
    }

    @Override // p087W0.AbstractC0814i
    /* renamed from: f */
    public final p043K2.C0339o mo1638f() {
        java.util.List list = this.f2895n;
        this.f2896o = list;
        list.getClass();
        return new p043K2.C0339o(16, list);
    }

    @Override // p087W0.AbstractC0814i, p098Z.InterfaceC0918c
    public final void flush() {
        super.flush();
        this.f2895n = null;
        this.f2896o = null;
        this.f2898q = 0;
        this.f2894m = this.f2893l[0];
        m1653l();
        this.f2897p = null;
    }

    @Override // p087W0.AbstractC0814i
    /* renamed from: g */
    public final void mo1639g(p087W0.C0813h c0813h) {
        java.nio.ByteBuffer byteBuffer = c0813h.f3251p;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        p086W.C0798r c0798r = this.f2889h;
        c0798r.m1535E(array, limit);
        while (c0798r.m1539a() >= 3) {
            int m1559u = c0798r.m1559u();
            int i4 = m1559u & 3;
            boolean z4 = (m1559u & 4) == 4;
            byte m1559u2 = (byte) c0798r.m1559u();
            byte m1559u3 = (byte) c0798r.m1559u();
            if (i4 == 2 || i4 == 3) {
                if (z4) {
                    if (i4 == 3) {
                        m1651j();
                        int i5 = (m1559u2 & 192) >> 6;
                        int i6 = this.f2891j;
                        if (i6 != -1 && i5 != (i6 + 1) % 4) {
                            m1653l();
                            p086W.AbstractC0781a.m1410A("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2891j + " current=" + i5);
                        }
                        this.f2891j = i5;
                        int i7 = m1559u2 & 63;
                        if (i7 == 0) {
                            i7 = 64;
                        }
                        p086W.C0797q c0797q = new p086W.C0797q(i5, i7);
                        this.f2897p = c0797q;
                        c0797q.f2782e = 1;
                        c0797q.f2781d[0] = m1559u3;
                    } else {
                        p086W.AbstractC0781a.m1416e(i4 == 2);
                        p086W.C0797q c0797q2 = this.f2897p;
                        if (c0797q2 == null) {
                            p086W.AbstractC0781a.m1425n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c0797q2.f2781d;
                            int i8 = c0797q2.f2782e;
                            int i9 = i8 + 1;
                            c0797q2.f2782e = i9;
                            bArr[i8] = m1559u2;
                            c0797q2.f2782e = i8 + 2;
                            bArr[i9] = m1559u3;
                        }
                    }
                    p086W.C0797q c0797q3 = this.f2897p;
                    if (c0797q3.f2782e == (c0797q3.f2780c * 2) - 1) {
                        m1651j();
                    }
                }
            }
        }
    }

    @Override // p087W0.AbstractC0814i
    /* renamed from: i */
    public final boolean mo1641i() {
        return this.f2895n != this.f2896o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x014a. Please report as an issue. */
    /* renamed from: j */
    public final void m1651j() {
        int i4;
        int i5;
        boolean z4;
        char c4;
        int i6;
        p086W.C0797q c0797q = this.f2897p;
        if (c0797q == null) {
            return;
        }
        int i7 = 2;
        if (c0797q.f2782e != (c0797q.f2780c * 2) - 1) {
            p086W.AbstractC0781a.m1424m("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f2897p.f2780c * 2) - 1) + ", but current index is " + this.f2897p.f2782e + " (sequence number " + this.f2897p.f2779b + ");");
        }
        p086W.C0797q c0797q2 = this.f2897p;
        byte[] bArr = c0797q2.f2781d;
        int i8 = c0797q2.f2782e;
        p086W.C0797q c0797q3 = this.f2890i;
        c0797q3.m1525p(bArr, i8);
        boolean z5 = false;
        while (true) {
            if (c0797q3.m1511b() > 0) {
                int i9 = 3;
                int m1518i = c0797q3.m1518i(3);
                int m1518i2 = c0797q3.m1518i(5);
                if (m1518i == 7) {
                    c0797q3.m1529t(i7);
                    m1518i = c0797q3.m1518i(6);
                    if (m1518i < 7) {
                        p009B2.AbstractC0051h.m156o(m1518i, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (m1518i2 == 0) {
                    if (m1518i != 0) {
                        p086W.AbstractC0781a.m1410A("Cea708Decoder", "serviceNumber is non-zero (" + m1518i + ") when blockSize is 0");
                    }
                } else if (m1518i != this.f2892k) {
                    c0797q3.m1530u(m1518i2);
                } else {
                    int m1516g = (m1518i2 * 8) + c0797q3.m1516g();
                    while (c0797q3.m1516g() < m1516g) {
                        int m1518i3 = c0797q3.m1518i(8);
                        if (m1518i3 != 16) {
                            if (m1518i3 <= 31) {
                                if (m1518i3 != 0) {
                                    if (m1518i3 == i9) {
                                        this.f2895n = m1652k();
                                    } else if (m1518i3 != 8) {
                                        switch (m1518i3) {
                                            case 12:
                                                m1653l();
                                                break;
                                            case 13:
                                                this.f2894m.m1646a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (m1518i3 < 17 || m1518i3 > 23) {
                                                    if (m1518i3 < 24 || m1518i3 > 31) {
                                                        p009B2.AbstractC0051h.m156o(m1518i3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        p086W.AbstractC0781a.m1410A("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + m1518i3);
                                                        c0797q3.m1529t(16);
                                                        break;
                                                    }
                                                } else {
                                                    p086W.AbstractC0781a.m1410A("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + m1518i3);
                                                    c0797q3.m1529t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        android.text.SpannableStringBuilder spannableStringBuilder = this.f2894m.f2869b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i6 = i7;
                                i4 = i9;
                                i5 = m1516g;
                            } else if (m1518i3 <= 127) {
                                if (m1518i3 == 127) {
                                    this.f2894m.m1646a((char) 9835);
                                } else {
                                    this.f2894m.m1646a((char) (m1518i3 & 255));
                                }
                                i6 = i7;
                                i4 = i9;
                                i5 = m1516g;
                                z5 = true;
                            } else {
                                if (m1518i3 <= 159) {
                                    p087W0.C0811f[] c0811fArr = this.f2893l;
                                    switch (m1518i3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i4 = i9;
                                            i5 = m1516g;
                                            z4 = true;
                                            int i10 = m1518i3 - 128;
                                            if (this.f2898q != i10) {
                                                this.f2898q = i10;
                                                this.f2894m = c0811fArr[i10];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i4 = i9;
                                            i5 = m1516g;
                                            z4 = true;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (c0797q3.m1517h()) {
                                                    p087W0.C0811f c0811f = c0811fArr[8 - i11];
                                                    c0811f.f2868a.clear();
                                                    c0811f.f2869b.clear();
                                                    c0811f.f2882o = -1;
                                                    c0811f.f2883p = -1;
                                                    c0811f.f2884q = -1;
                                                    c0811f.f2886s = -1;
                                                    c0811f.f2888u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i4 = i9;
                                            i5 = m1516g;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (c0797q3.m1517h()) {
                                                    c0811fArr[8 - i12].f2871d = true;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 138:
                                            i4 = i9;
                                            i5 = m1516g;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (c0797q3.m1517h()) {
                                                    c0811fArr[8 - i13].f2871d = false;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 139:
                                            i4 = i9;
                                            i5 = m1516g;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (c0797q3.m1517h()) {
                                                    c0811fArr[8 - i14].f2871d = !r1.f2871d;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 140:
                                            i4 = i9;
                                            i5 = m1516g;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (c0797q3.m1517h()) {
                                                    c0811fArr[8 - i15].m1648d();
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 141:
                                            i4 = i9;
                                            i5 = m1516g;
                                            c0797q3.m1529t(8);
                                            z4 = true;
                                            break;
                                        case 142:
                                            i4 = i9;
                                            i5 = m1516g;
                                            z4 = true;
                                            break;
                                        case 143:
                                            i4 = i9;
                                            i5 = m1516g;
                                            m1653l();
                                            z4 = true;
                                            break;
                                        case 144:
                                            i5 = m1516g;
                                            if (!this.f2894m.f2870c) {
                                                c0797q3.m1529t(16);
                                                i4 = 3;
                                                z4 = true;
                                                break;
                                            } else {
                                                c0797q3.m1518i(4);
                                                c0797q3.m1518i(2);
                                                c0797q3.m1518i(2);
                                                boolean m1517h = c0797q3.m1517h();
                                                boolean m1517h2 = c0797q3.m1517h();
                                                i4 = 3;
                                                c0797q3.m1518i(3);
                                                c0797q3.m1518i(3);
                                                this.f2894m.m1649e(m1517h, m1517h2);
                                                z4 = true;
                                            }
                                        case 145:
                                            i5 = m1516g;
                                            if (this.f2894m.f2870c) {
                                                int m1645c = p087W0.C0811f.m1645c(c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2));
                                                int m1645c2 = p087W0.C0811f.m1645c(c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2));
                                                c0797q3.m1529t(2);
                                                p087W0.C0811f.m1645c(c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2), 0);
                                                this.f2894m.m1650f(m1645c, m1645c2);
                                            } else {
                                                c0797q3.m1529t(24);
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                        case 146:
                                            i5 = m1516g;
                                            if (this.f2894m.f2870c) {
                                                c0797q3.m1529t(4);
                                                int m1518i4 = c0797q3.m1518i(4);
                                                c0797q3.m1529t(2);
                                                c0797q3.m1518i(6);
                                                p087W0.C0811f c0811f2 = this.f2894m;
                                                if (c0811f2.f2888u != m1518i4) {
                                                    c0811f2.m1646a('\n');
                                                }
                                                c0811f2.f2888u = m1518i4;
                                            } else {
                                                c0797q3.m1529t(16);
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            p009B2.AbstractC0051h.m156o(m1518i3, "Invalid C1 command: ", "Cea708Decoder");
                                            i4 = i9;
                                            i5 = m1516g;
                                            z4 = true;
                                            break;
                                        case 151:
                                            i5 = m1516g;
                                            if (this.f2894m.f2870c) {
                                                int m1645c3 = p087W0.C0811f.m1645c(c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2));
                                                c0797q3.m1518i(2);
                                                p087W0.C0811f.m1645c(c0797q3.m1518i(2), c0797q3.m1518i(2), c0797q3.m1518i(2), 0);
                                                c0797q3.m1517h();
                                                c0797q3.m1517h();
                                                c0797q3.m1518i(2);
                                                c0797q3.m1518i(2);
                                                int m1518i5 = c0797q3.m1518i(2);
                                                c0797q3.m1529t(8);
                                                p087W0.C0811f c0811f3 = this.f2894m;
                                                c0811f3.f2881n = m1645c3;
                                                c0811f3.f2878k = m1518i5;
                                            } else {
                                                c0797q3.m1529t(32);
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i16 = m1518i3 - 152;
                                            p087W0.C0811f c0811f4 = c0811fArr[i16];
                                            c0797q3.m1529t(i7);
                                            boolean m1517h3 = c0797q3.m1517h();
                                            c0797q3.m1529t(i7);
                                            int m1518i6 = c0797q3.m1518i(i9);
                                            boolean m1517h4 = c0797q3.m1517h();
                                            int m1518i7 = c0797q3.m1518i(7);
                                            int m1518i8 = c0797q3.m1518i(8);
                                            int m1518i9 = c0797q3.m1518i(4);
                                            int m1518i10 = c0797q3.m1518i(4);
                                            c0797q3.m1529t(i7);
                                            c0797q3.m1529t(6);
                                            c0797q3.m1529t(i7);
                                            int m1518i11 = c0797q3.m1518i(3);
                                            i5 = m1516g;
                                            int m1518i12 = c0797q3.m1518i(3);
                                            c0811f4.f2870c = true;
                                            c0811f4.f2871d = m1517h3;
                                            c0811f4.f2872e = m1518i6;
                                            c0811f4.f2873f = m1517h4;
                                            c0811f4.f2874g = m1518i7;
                                            c0811f4.f2875h = m1518i8;
                                            c0811f4.f2876i = m1518i9;
                                            int i17 = m1518i10 + 1;
                                            if (c0811f4.f2877j != i17) {
                                                c0811f4.f2877j = i17;
                                                while (true) {
                                                    java.util.ArrayList arrayList = c0811f4.f2868a;
                                                    if (arrayList.size() >= c0811f4.f2877j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (m1518i11 != 0 && c0811f4.f2879l != m1518i11) {
                                                c0811f4.f2879l = m1518i11;
                                                int i18 = m1518i11 - 1;
                                                int i19 = p087W0.C0811f.f2859B[i18];
                                                boolean z6 = p087W0.C0811f.f2858A[i18];
                                                int i20 = p087W0.C0811f.f2866y[i18];
                                                int i21 = p087W0.C0811f.f2867z[i18];
                                                int i22 = p087W0.C0811f.f2865x[i18];
                                                c0811f4.f2881n = i19;
                                                c0811f4.f2878k = i22;
                                            }
                                            if (m1518i12 != 0 && c0811f4.f2880m != m1518i12) {
                                                c0811f4.f2880m = m1518i12;
                                                int i23 = m1518i12 - 1;
                                                int i24 = p087W0.C0811f.f2861D[i23];
                                                int i25 = p087W0.C0811f.f2860C[i23];
                                                c0811f4.m1649e(false, false);
                                                c0811f4.m1650f(p087W0.C0811f.f2863v, p087W0.C0811f.f2862E[i23]);
                                            }
                                            if (this.f2898q != i16) {
                                                this.f2898q = i16;
                                                this.f2894m = c0811fArr[i16];
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                    }
                                } else {
                                    i4 = i9;
                                    i5 = m1516g;
                                    z4 = true;
                                    if (m1518i3 <= 255) {
                                        this.f2894m.m1646a((char) (m1518i3 & 255));
                                    } else {
                                        p009B2.AbstractC0051h.m156o(m1518i3, "Invalid base command: ", "Cea708Decoder");
                                        i6 = 2;
                                        c4 = 7;
                                    }
                                }
                                z5 = z4;
                                i6 = 2;
                                c4 = 7;
                            }
                            z4 = true;
                            c4 = 7;
                        } else {
                            i4 = i9;
                            i5 = m1516g;
                            z4 = true;
                            int m1518i13 = c0797q3.m1518i(8);
                            if (m1518i13 <= 31) {
                                c4 = 7;
                                if (m1518i13 > 7) {
                                    if (m1518i13 <= 15) {
                                        c0797q3.m1529t(8);
                                    } else if (m1518i13 <= 23) {
                                        c0797q3.m1529t(16);
                                    } else if (m1518i13 <= 31) {
                                        c0797q3.m1529t(24);
                                    }
                                }
                            } else {
                                c4 = 7;
                                if (m1518i13 <= 127) {
                                    if (m1518i13 == 32) {
                                        this.f2894m.m1646a(' ');
                                    } else if (m1518i13 == 33) {
                                        this.f2894m.m1646a((char) 160);
                                    } else if (m1518i13 == 37) {
                                        this.f2894m.m1646a((char) 8230);
                                    } else if (m1518i13 == 42) {
                                        this.f2894m.m1646a((char) 352);
                                    } else if (m1518i13 == 44) {
                                        this.f2894m.m1646a((char) 338);
                                    } else if (m1518i13 == 63) {
                                        this.f2894m.m1646a((char) 376);
                                    } else if (m1518i13 == 57) {
                                        this.f2894m.m1646a((char) 8482);
                                    } else if (m1518i13 == 58) {
                                        this.f2894m.m1646a((char) 353);
                                    } else if (m1518i13 == 60) {
                                        this.f2894m.m1646a((char) 339);
                                    } else if (m1518i13 != 61) {
                                        switch (m1518i13) {
                                            case 48:
                                                this.f2894m.m1646a((char) 9608);
                                                break;
                                            case 49:
                                                this.f2894m.m1646a((char) 8216);
                                                break;
                                            case 50:
                                                this.f2894m.m1646a((char) 8217);
                                                break;
                                            case 51:
                                                this.f2894m.m1646a((char) 8220);
                                                break;
                                            case 52:
                                                this.f2894m.m1646a((char) 8221);
                                                break;
                                            case 53:
                                                this.f2894m.m1646a((char) 8226);
                                                break;
                                            default:
                                                switch (m1518i13) {
                                                    case 118:
                                                        this.f2894m.m1646a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f2894m.m1646a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f2894m.m1646a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f2894m.m1646a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f2894m.m1646a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f2894m.m1646a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f2894m.m1646a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f2894m.m1646a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f2894m.m1646a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f2894m.m1646a((char) 9484);
                                                        break;
                                                    default:
                                                        p009B2.AbstractC0051h.m156o(m1518i13, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f2894m.m1646a((char) 8480);
                                    }
                                    z5 = true;
                                } else if (m1518i13 > 159) {
                                    i6 = 2;
                                    if (m1518i13 <= 255) {
                                        if (m1518i13 == 160) {
                                            this.f2894m.m1646a((char) 13252);
                                        } else {
                                            p009B2.AbstractC0051h.m156o(m1518i13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f2894m.m1646a('_');
                                        }
                                        z5 = true;
                                    } else {
                                        p009B2.AbstractC0051h.m156o(m1518i13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (m1518i13 <= 135) {
                                    c0797q3.m1529t(32);
                                } else if (m1518i13 <= 143) {
                                    c0797q3.m1529t(40);
                                } else if (m1518i13 <= 159) {
                                    i6 = 2;
                                    c0797q3.m1529t(2);
                                    c0797q3.m1529t(c0797q3.m1518i(6) * 8);
                                }
                            }
                            i6 = 2;
                        }
                        i9 = i4;
                        m1516g = i5;
                        i7 = i6;
                    }
                }
            }
        }
        if (z5) {
            this.f2895n = m1652k();
        }
        this.f2897p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m1652k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p087W0.C0812g.m1652k():java.util.List");
    }

    /* renamed from: l */
    public final void m1653l() {
        for (int i4 = 0; i4 < 8; i4++) {
            this.f2893l[i4].m1648d();
        }
    }
}
