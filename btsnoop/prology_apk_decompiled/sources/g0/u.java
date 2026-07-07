package g0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0098t;
import T.H;
import T.I;
import W.w;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y0.F;

/* loaded from: classes.dex */
public final class u implements y0.o {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f5804i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f5805j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f5806a;

    /* renamed from: b, reason: collision with root package name */
    public final w f5807b;

    /* renamed from: d, reason: collision with root package name */
    public final L1.g f5809d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5810e;

    /* renamed from: f, reason: collision with root package name */
    public y0.q f5811f;

    /* renamed from: h, reason: collision with root package name */
    public int f5813h;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5808c = new W.r();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f5812g = new byte[1024];

    public u(String str, w wVar, L1.g gVar, boolean z4) {
        this.f5806a = str;
        this.f5807b = wVar;
        this.f5809d = gVar;
        this.f5810e = z4;
    }

    public final F a(long j4) {
        F v4 = this.f5811f.v(0, 3);
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l("text/vtt");
        c0094o.f2282d = this.f5806a;
        c0094o.f2295q = j4;
        AbstractC0007h.q(c0094o, v4);
        this.f5811f.s();
        return v4;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        throw new IllegalStateException();
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f5811f = this.f5810e ? new android.support.v4.media.session.t(qVar, this.f5809d) : qVar;
        qVar.t(new A0.b(-9223372036854775807L));
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        y0.l lVar = (y0.l) pVar;
        lVar.p(this.f5812g, 0, 6, false);
        byte[] bArr = this.f5812g;
        W.r rVar = this.f5808c;
        rVar.E(bArr, 6);
        if (d1.j.a(rVar)) {
            return true;
        }
        lVar.p(this.f5812g, 6, 3, false);
        rVar.E(this.f5812g, 9);
        return d1.j.a(rVar);
    }

    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        String i4;
        this.f5811f.getClass();
        int i5 = (int) ((y0.l) pVar).f9088n;
        int i6 = this.f5813h;
        byte[] bArr = this.f5812g;
        if (i6 == bArr.length) {
            this.f5812g = Arrays.copyOf(bArr, ((i5 != -1 ? i5 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f5812g;
        int i7 = this.f5813h;
        int read = ((y0.l) pVar).read(bArr2, i7, bArr2.length - i7);
        if (read != -1) {
            int i8 = this.f5813h + read;
            this.f5813h = i8;
            if (i5 == -1 || i8 != i5) {
                return 0;
            }
        }
        W.r rVar = new W.r(this.f5812g);
        d1.j.d(rVar);
        String i9 = rVar.i(e2.d.f5436c);
        long j4 = 0;
        long j5 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(i9)) {
                while (true) {
                    String i10 = rVar.i(e2.d.f5436c);
                    if (i10 == null) {
                        break;
                    }
                    if (d1.j.f4973a.matcher(i10).matches()) {
                        do {
                            i4 = rVar.i(e2.d.f5436c);
                            if (i4 != null) {
                            }
                        } while (!i4.isEmpty());
                    } else {
                        Matcher matcher2 = d1.i.f4969a.matcher(i10);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c4 = d1.j.c(group);
                long b4 = this.f5807b.b(((((j4 + c4) - j5) * 90000) / 1000000) % 8589934592L);
                F a4 = a(b4 - c4);
                byte[] bArr3 = this.f5812g;
                int i11 = this.f5813h;
                W.r rVar2 = this.f5808c;
                rVar2.E(bArr3, i11);
                a4.a(rVar2, this.f5813h, 0);
                a4.b(b4, 1, this.f5813h, 0, null);
                return -1;
            }
            if (i9.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f5804i.matcher(i9);
                if (!matcher3.find()) {
                    throw I.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i9));
                }
                Matcher matcher4 = f5805j.matcher(i9);
                if (!matcher4.find()) {
                    throw I.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i9));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j5 = d1.j.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j4 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            i9 = rVar.i(e2.d.f5436c);
        }
    }

    @Override // y0.o
    public final void release() {
    }
}
