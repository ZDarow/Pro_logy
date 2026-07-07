package m0;

import T.C0098t;
import android.os.SystemClock;
import java.util.TreeSet;
import n0.C0447a;
import n0.C0448b;
import n0.C0449c;
import n0.C0450d;
import p1.AbstractC0462a;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426g implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final n0.i f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final W.r f7210b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f7211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7212d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7213e;

    /* renamed from: f, reason: collision with root package name */
    public final K2.c f7214f;

    /* renamed from: g, reason: collision with root package name */
    public y0.q f7215g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7216h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f7217i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f7218j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7219k;

    /* renamed from: l, reason: collision with root package name */
    public long f7220l;

    /* renamed from: m, reason: collision with root package name */
    public long f7221m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0426g(C0430k c0430k, int i4) {
        char c4;
        n0.i c0450d;
        n0.i iVar;
        this.f7212d = i4;
        String str = c0430k.f7239c.f2325m;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                c0450d = new C0450d(c0430k, 0);
                iVar = c0450d;
                break;
            case 1:
                c0450d = new n0.e(c0430k, 1);
                iVar = c0450d;
                break;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                c0450d = new C0449c(c0430k);
                iVar = c0450d;
                break;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0450d = c0430k.f7241e.equals("MP4A-LATM") ? new n0.f(c0430k) : new C0447a(c0430k);
                iVar = c0450d;
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                c0450d = new C0448b(c0430k);
                iVar = c0450d;
                break;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
            case '\f':
            case '\r':
                c0450d = new N1.v(c0430k);
                iVar = c0450d;
                break;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0450d = new n0.g(c0430k);
                iVar = c0450d;
                break;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0450d = new n0.e(c0430k, 0);
                iVar = c0450d;
                break;
            case '\t':
                c0450d = new n0.h(c0430k);
                iVar = c0450d;
                break;
            case '\n':
                c0450d = new n0.j(c0430k);
                iVar = c0450d;
                break;
            case 11:
                c0450d = new C0450d(c0430k, 1);
                iVar = c0450d;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f7209a = iVar;
        this.f7210b = new W.r(65507);
        this.f7211c = new W.r();
        this.f7213e = new Object();
        this.f7214f = new K2.c();
        this.f7217i = -9223372036854775807L;
        this.f7218j = -1;
        this.f7220l = -9223372036854775807L;
        this.f7221m = -9223372036854775807L;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        synchronized (this.f7213e) {
            try {
                if (!this.f7219k) {
                    this.f7219k = true;
                }
                this.f7220l = j4;
                this.f7221m = j5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f7209a.d(qVar, this.f7212d);
        qVar.s();
        qVar.t(new A0.b(-9223372036854775807L));
        this.f7215g = qVar;
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, m0.h] */
    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        this.f7215g.getClass();
        int read = pVar.read(this.f7210b.f2694a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f7210b.G(0);
        this.f7210b.F(read);
        W.r rVar = this.f7210b;
        C0428i c0428i = null;
        if (rVar.a() >= 12) {
            int u4 = rVar.u();
            byte b4 = (byte) (u4 >> 6);
            byte b5 = (byte) (u4 & 15);
            if (b4 == 2) {
                int u5 = rVar.u();
                boolean z4 = ((u5 >> 7) & 1) == 1;
                byte b6 = (byte) (u5 & 127);
                int A4 = rVar.A();
                long w = rVar.w();
                int h4 = rVar.h();
                byte[] bArr = C0428i.f7228g;
                if (b5 > 0) {
                    byte[] bArr2 = new byte[b5 * 4];
                    for (int i4 = 0; i4 < b5; i4++) {
                        rVar.f(bArr2, i4 * 4, 4);
                    }
                }
                byte[] bArr3 = new byte[rVar.a()];
                rVar.f(bArr3, 0, rVar.a());
                ?? obj = new Object();
                obj.f7227f = bArr;
                obj.f7222a = z4;
                obj.f7223b = b6;
                W.a.e(A4 >= 0 && A4 <= 65535);
                obj.f7224c = 65535 & A4;
                obj.f7225d = w;
                obj.f7226e = h4;
                obj.f7227f = bArr3;
                c0428i = new C0428i(obj);
            }
        }
        if (c0428i == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - 30;
        K2.c cVar = this.f7214f;
        synchronized (cVar) {
            if (((TreeSet) cVar.f954d).size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i5 = c0428i.f7231c;
            if (!cVar.f953c) {
                cVar.d();
                cVar.f952b = AbstractC0462a.F(i5 - 1);
                cVar.f953c = true;
                cVar.a(new C0429j(c0428i, elapsedRealtime));
            } else if (Math.abs(K2.c.b(i5, C0428i.a(cVar.f951a))) >= 1000) {
                cVar.f952b = AbstractC0462a.F(i5 - 1);
                ((TreeSet) cVar.f954d).clear();
                cVar.a(new C0429j(c0428i, elapsedRealtime));
            } else if (K2.c.b(i5, cVar.f952b) > 0) {
                cVar.a(new C0429j(c0428i, elapsedRealtime));
            }
        }
        C0428i c4 = this.f7214f.c(j4);
        if (c4 == null) {
            return 0;
        }
        if (!this.f7216h) {
            if (this.f7217i == -9223372036854775807L) {
                this.f7217i = c4.f7232d;
            }
            if (this.f7218j == -1) {
                this.f7218j = c4.f7231c;
            }
            this.f7209a.e(this.f7217i);
            this.f7216h = true;
        }
        synchronized (this.f7213e) {
            try {
                if (this.f7219k) {
                    if (this.f7220l != -9223372036854775807L && this.f7221m != -9223372036854775807L) {
                        this.f7214f.d();
                        this.f7209a.b(this.f7220l, this.f7221m);
                        this.f7219k = false;
                        this.f7220l = -9223372036854775807L;
                        this.f7221m = -9223372036854775807L;
                    }
                }
                do {
                    W.r rVar2 = this.f7211c;
                    byte[] bArr4 = c4.f7234f;
                    rVar2.getClass();
                    rVar2.E(bArr4, bArr4.length);
                    this.f7209a.c(this.f7211c, c4.f7232d, c4.f7231c, c4.f7229a);
                    c4 = this.f7214f.c(j4);
                } while (c4 != null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
