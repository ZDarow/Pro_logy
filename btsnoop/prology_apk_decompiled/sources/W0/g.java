package W0;

import B2.AbstractC0007h;
import K2.o;
import W.q;
import W.r;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: h, reason: collision with root package name */
    public final r f2793h = new r();

    /* renamed from: i, reason: collision with root package name */
    public final q f2794i = new q();

    /* renamed from: j, reason: collision with root package name */
    public int f2795j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f2796k;

    /* renamed from: l, reason: collision with root package name */
    public final f[] f2797l;

    /* renamed from: m, reason: collision with root package name */
    public f f2798m;

    /* renamed from: n, reason: collision with root package name */
    public List f2799n;

    /* renamed from: o, reason: collision with root package name */
    public List f2800o;

    /* renamed from: p, reason: collision with root package name */
    public q f2801p;

    /* renamed from: q, reason: collision with root package name */
    public int f2802q;

    public g(int i4, List list) {
        this.f2796k = i4 == -1 ? 1 : i4;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b4 = ((byte[]) list.get(0))[0];
        }
        this.f2797l = new f[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f2797l[i5] = new f();
        }
        this.f2798m = this.f2797l[0];
    }

    @Override // W0.i
    public final o f() {
        List list = this.f2799n;
        this.f2800o = list;
        list.getClass();
        return new o(16, list);
    }

    @Override // W0.i, Z.c
    public final void flush() {
        super.flush();
        this.f2799n = null;
        this.f2800o = null;
        this.f2802q = 0;
        this.f2798m = this.f2797l[0];
        l();
        this.f2801p = null;
    }

    @Override // W0.i
    public final void g(h hVar) {
        ByteBuffer byteBuffer = hVar.f3140p;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r rVar = this.f2793h;
        rVar.E(array, limit);
        while (rVar.a() >= 3) {
            int u4 = rVar.u();
            int i4 = u4 & 3;
            boolean z4 = (u4 & 4) == 4;
            byte u5 = (byte) rVar.u();
            byte u6 = (byte) rVar.u();
            if (i4 == 2 || i4 == 3) {
                if (z4) {
                    if (i4 == 3) {
                        j();
                        int i5 = (u5 & 192) >> 6;
                        int i6 = this.f2795j;
                        if (i6 != -1 && i5 != (i6 + 1) % 4) {
                            l();
                            W.a.A("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2795j + " current=" + i5);
                        }
                        this.f2795j = i5;
                        int i7 = u5 & 63;
                        if (i7 == 0) {
                            i7 = 64;
                        }
                        q qVar = new q(i5, i7);
                        this.f2801p = qVar;
                        qVar.f2690e = 1;
                        qVar.f2689d[0] = u6;
                    } else {
                        W.a.e(i4 == 2);
                        q qVar2 = this.f2801p;
                        if (qVar2 == null) {
                            W.a.n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = qVar2.f2689d;
                            int i8 = qVar2.f2690e;
                            int i9 = i8 + 1;
                            qVar2.f2690e = i9;
                            bArr[i8] = u5;
                            qVar2.f2690e = i8 + 2;
                            bArr[i9] = u6;
                        }
                    }
                    q qVar3 = this.f2801p;
                    if (qVar3.f2690e == (qVar3.f2688c * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // W0.i
    public final boolean i() {
        return this.f2799n != this.f2800o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x014a. Please report as an issue. */
    public final void j() {
        int i4;
        int i5;
        boolean z4;
        char c4;
        int i6;
        q qVar = this.f2801p;
        if (qVar == null) {
            return;
        }
        int i7 = 2;
        if (qVar.f2690e != (qVar.f2688c * 2) - 1) {
            W.a.m("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f2801p.f2688c * 2) - 1) + ", but current index is " + this.f2801p.f2690e + " (sequence number " + this.f2801p.f2687b + ");");
        }
        q qVar2 = this.f2801p;
        byte[] bArr = qVar2.f2689d;
        int i8 = qVar2.f2690e;
        q qVar3 = this.f2794i;
        qVar3.p(bArr, i8);
        boolean z5 = false;
        while (true) {
            if (qVar3.b() > 0) {
                int i9 = 3;
                int i10 = qVar3.i(3);
                int i11 = qVar3.i(5);
                if (i10 == 7) {
                    qVar3.t(i7);
                    i10 = qVar3.i(6);
                    if (i10 < 7) {
                        AbstractC0007h.o(i10, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i11 == 0) {
                    if (i10 != 0) {
                        W.a.A("Cea708Decoder", "serviceNumber is non-zero (" + i10 + ") when blockSize is 0");
                    }
                } else if (i10 != this.f2796k) {
                    qVar3.u(i11);
                } else {
                    int g4 = (i11 * 8) + qVar3.g();
                    while (qVar3.g() < g4) {
                        int i12 = qVar3.i(8);
                        if (i12 != 16) {
                            if (i12 <= 31) {
                                if (i12 != 0) {
                                    if (i12 == i9) {
                                        this.f2799n = k();
                                    } else if (i12 != 8) {
                                        switch (i12) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.f2798m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i12 < 17 || i12 > 23) {
                                                    if (i12 < 24 || i12 > 31) {
                                                        AbstractC0007h.o(i12, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        W.a.A("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i12);
                                                        qVar3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    W.a.A("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i12);
                                                    qVar3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f2798m.f2774b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i6 = i7;
                                i4 = i9;
                                i5 = g4;
                            } else if (i12 <= 127) {
                                if (i12 == 127) {
                                    this.f2798m.a((char) 9835);
                                } else {
                                    this.f2798m.a((char) (i12 & 255));
                                }
                                i6 = i7;
                                i4 = i9;
                                i5 = g4;
                                z5 = true;
                            } else {
                                if (i12 <= 159) {
                                    f[] fVarArr = this.f2797l;
                                    switch (i12) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i4 = i9;
                                            i5 = g4;
                                            z4 = true;
                                            int i13 = i12 - 128;
                                            if (this.f2802q != i13) {
                                                this.f2802q = i13;
                                                this.f2798m = fVarArr[i13];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i4 = i9;
                                            i5 = g4;
                                            z4 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (qVar3.h()) {
                                                    f fVar = fVarArr[8 - i14];
                                                    fVar.f2773a.clear();
                                                    fVar.f2774b.clear();
                                                    fVar.f2787o = -1;
                                                    fVar.f2788p = -1;
                                                    fVar.f2789q = -1;
                                                    fVar.s = -1;
                                                    fVar.f2792u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i4 = i9;
                                            i5 = g4;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (qVar3.h()) {
                                                    fVarArr[8 - i15].f2776d = true;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 138:
                                            i4 = i9;
                                            i5 = g4;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (qVar3.h()) {
                                                    fVarArr[8 - i16].f2776d = false;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 139:
                                            i4 = i9;
                                            i5 = g4;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (qVar3.h()) {
                                                    fVarArr[8 - i17].f2776d = !r1.f2776d;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 140:
                                            i4 = i9;
                                            i5 = g4;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (qVar3.h()) {
                                                    fVarArr[8 - i18].d();
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 141:
                                            i4 = i9;
                                            i5 = g4;
                                            qVar3.t(8);
                                            z4 = true;
                                            break;
                                        case 142:
                                            i4 = i9;
                                            i5 = g4;
                                            z4 = true;
                                            break;
                                        case 143:
                                            i4 = i9;
                                            i5 = g4;
                                            l();
                                            z4 = true;
                                            break;
                                        case 144:
                                            i5 = g4;
                                            if (!this.f2798m.f2775c) {
                                                qVar3.t(16);
                                                i4 = 3;
                                                z4 = true;
                                                break;
                                            } else {
                                                qVar3.i(4);
                                                qVar3.i(2);
                                                qVar3.i(2);
                                                boolean h4 = qVar3.h();
                                                boolean h5 = qVar3.h();
                                                i4 = 3;
                                                qVar3.i(3);
                                                qVar3.i(3);
                                                this.f2798m.e(h4, h5);
                                                z4 = true;
                                            }
                                        case 145:
                                            i5 = g4;
                                            if (this.f2798m.f2775c) {
                                                int c5 = f.c(qVar3.i(2), qVar3.i(2), qVar3.i(2), qVar3.i(2));
                                                int c6 = f.c(qVar3.i(2), qVar3.i(2), qVar3.i(2), qVar3.i(2));
                                                qVar3.t(2);
                                                f.c(qVar3.i(2), qVar3.i(2), qVar3.i(2), 0);
                                                this.f2798m.f(c5, c6);
                                            } else {
                                                qVar3.t(24);
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                        case 146:
                                            i5 = g4;
                                            if (this.f2798m.f2775c) {
                                                qVar3.t(4);
                                                int i19 = qVar3.i(4);
                                                qVar3.t(2);
                                                qVar3.i(6);
                                                f fVar2 = this.f2798m;
                                                if (fVar2.f2792u != i19) {
                                                    fVar2.a('\n');
                                                }
                                                fVar2.f2792u = i19;
                                            } else {
                                                qVar3.t(16);
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0007h.o(i12, "Invalid C1 command: ", "Cea708Decoder");
                                            i4 = i9;
                                            i5 = g4;
                                            z4 = true;
                                            break;
                                        case 151:
                                            i5 = g4;
                                            if (this.f2798m.f2775c) {
                                                int c7 = f.c(qVar3.i(2), qVar3.i(2), qVar3.i(2), qVar3.i(2));
                                                qVar3.i(2);
                                                f.c(qVar3.i(2), qVar3.i(2), qVar3.i(2), 0);
                                                qVar3.h();
                                                qVar3.h();
                                                qVar3.i(2);
                                                qVar3.i(2);
                                                int i20 = qVar3.i(2);
                                                qVar3.t(8);
                                                f fVar3 = this.f2798m;
                                                fVar3.f2786n = c7;
                                                fVar3.f2783k = i20;
                                            } else {
                                                qVar3.t(32);
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
                                            int i21 = i12 - 152;
                                            f fVar4 = fVarArr[i21];
                                            qVar3.t(i7);
                                            boolean h6 = qVar3.h();
                                            qVar3.t(i7);
                                            int i22 = qVar3.i(i9);
                                            boolean h7 = qVar3.h();
                                            int i23 = qVar3.i(7);
                                            int i24 = qVar3.i(8);
                                            int i25 = qVar3.i(4);
                                            int i26 = qVar3.i(4);
                                            qVar3.t(i7);
                                            qVar3.t(6);
                                            qVar3.t(i7);
                                            int i27 = qVar3.i(3);
                                            i5 = g4;
                                            int i28 = qVar3.i(3);
                                            fVar4.f2775c = true;
                                            fVar4.f2776d = h6;
                                            fVar4.f2777e = i22;
                                            fVar4.f2778f = h7;
                                            fVar4.f2779g = i23;
                                            fVar4.f2780h = i24;
                                            fVar4.f2781i = i25;
                                            int i29 = i26 + 1;
                                            if (fVar4.f2782j != i29) {
                                                fVar4.f2782j = i29;
                                                while (true) {
                                                    ArrayList arrayList = fVar4.f2773a;
                                                    if (arrayList.size() >= fVar4.f2782j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i27 != 0 && fVar4.f2784l != i27) {
                                                fVar4.f2784l = i27;
                                                int i30 = i27 - 1;
                                                int i31 = f.f2765B[i30];
                                                boolean z6 = f.f2764A[i30];
                                                int i32 = f.f2771y[i30];
                                                int i33 = f.f2772z[i30];
                                                int i34 = f.f2770x[i30];
                                                fVar4.f2786n = i31;
                                                fVar4.f2783k = i34;
                                            }
                                            if (i28 != 0 && fVar4.f2785m != i28) {
                                                fVar4.f2785m = i28;
                                                int i35 = i28 - 1;
                                                int i36 = f.f2767D[i35];
                                                int i37 = f.f2766C[i35];
                                                fVar4.e(false, false);
                                                fVar4.f(f.f2769v, f.f2768E[i35]);
                                            }
                                            if (this.f2802q != i21) {
                                                this.f2802q = i21;
                                                this.f2798m = fVarArr[i21];
                                            }
                                            i4 = 3;
                                            z4 = true;
                                            break;
                                    }
                                } else {
                                    i4 = i9;
                                    i5 = g4;
                                    z4 = true;
                                    if (i12 <= 255) {
                                        this.f2798m.a((char) (i12 & 255));
                                    } else {
                                        AbstractC0007h.o(i12, "Invalid base command: ", "Cea708Decoder");
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
                            i5 = g4;
                            z4 = true;
                            int i38 = qVar3.i(8);
                            if (i38 <= 31) {
                                c4 = 7;
                                if (i38 > 7) {
                                    if (i38 <= 15) {
                                        qVar3.t(8);
                                    } else if (i38 <= 23) {
                                        qVar3.t(16);
                                    } else if (i38 <= 31) {
                                        qVar3.t(24);
                                    }
                                }
                            } else {
                                c4 = 7;
                                if (i38 <= 127) {
                                    if (i38 == 32) {
                                        this.f2798m.a(' ');
                                    } else if (i38 == 33) {
                                        this.f2798m.a((char) 160);
                                    } else if (i38 == 37) {
                                        this.f2798m.a((char) 8230);
                                    } else if (i38 == 42) {
                                        this.f2798m.a((char) 352);
                                    } else if (i38 == 44) {
                                        this.f2798m.a((char) 338);
                                    } else if (i38 == 63) {
                                        this.f2798m.a((char) 376);
                                    } else if (i38 == 57) {
                                        this.f2798m.a((char) 8482);
                                    } else if (i38 == 58) {
                                        this.f2798m.a((char) 353);
                                    } else if (i38 == 60) {
                                        this.f2798m.a((char) 339);
                                    } else if (i38 != 61) {
                                        switch (i38) {
                                            case 48:
                                                this.f2798m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f2798m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f2798m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f2798m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f2798m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f2798m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i38) {
                                                    case 118:
                                                        this.f2798m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f2798m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f2798m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f2798m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f2798m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f2798m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f2798m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f2798m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f2798m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f2798m.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC0007h.o(i38, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f2798m.a((char) 8480);
                                    }
                                    z5 = true;
                                } else if (i38 > 159) {
                                    i6 = 2;
                                    if (i38 <= 255) {
                                        if (i38 == 160) {
                                            this.f2798m.a((char) 13252);
                                        } else {
                                            AbstractC0007h.o(i38, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f2798m.a('_');
                                        }
                                        z5 = true;
                                    } else {
                                        AbstractC0007h.o(i38, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i38 <= 135) {
                                    qVar3.t(32);
                                } else if (i38 <= 143) {
                                    qVar3.t(40);
                                } else if (i38 <= 159) {
                                    i6 = 2;
                                    qVar3.t(2);
                                    qVar3.t(qVar3.i(6) * 8);
                                }
                            }
                            i6 = 2;
                        }
                        i9 = i4;
                        g4 = i5;
                        i7 = i6;
                    }
                }
            }
        }
        if (z5) {
            this.f2799n = k();
        }
        this.f2801p = null;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.g.k():java.util.List");
    }

    public final void l() {
        for (int i4 = 0; i4 < 8; i4++) {
            this.f2797l[i4].d();
        }
    }
}
