package p083V0;

/* renamed from: V0.h */
/* loaded from: classes.dex */
public final class C0770h implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p083V0.InterfaceC0774l f2700a;

    /* renamed from: b */
    public final p076T.C0702p f2701b;

    /* renamed from: c */
    public final java.util.ArrayList f2702c;

    /* renamed from: f */
    public p215y0.InterfaceC2387F f2705f;

    /* renamed from: g */
    public int f2706g;

    /* renamed from: h */
    public int f2707h;

    /* renamed from: i */
    public long[] f2708i;

    /* renamed from: j */
    public long f2709j;

    /* renamed from: e */
    public byte[] f2704e = p086W.AbstractC0805y.f2806f;

    /* renamed from: d */
    public final p086W.C0798r f2703d = new p086W.C0798r();

    public C0770h(p083V0.InterfaceC0774l interfaceC0774l, p076T.C0702p c0702p) {
        this.f2700a = interfaceC0774l;
        p076T.C0701o m1295a = c0702p.m1295a();
        m1295a.f2370l = p076T.AbstractC0665H.m1201l("application/x-media3-cues");
        m1295a.f2367i = c0702p.f2408m;
        m1295a.f2355F = interfaceC0774l.mo703w();
        this.f2701b = new p076T.C0702p(m1295a);
        this.f2702c = new java.util.ArrayList();
        this.f2707h = 0;
        this.f2708i = p086W.AbstractC0805y.f2807g;
        this.f2709j = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m1401a(p083V0.C0769g c0769g) {
        p086W.AbstractC0781a.m1422k(this.f2705f);
        byte[] bArr = c0769g.f2699m;
        int length = bArr.length;
        p086W.C0798r c0798r = this.f2703d;
        c0798r.getClass();
        c0798r.m1535E(bArr, bArr.length);
        this.f2705f.mo1405a(c0798r, length, 0);
        this.f2705f.mo1406b(c0769g.f2698l, 1, length, 0, null);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        int i4 = this.f2707h;
        p086W.AbstractC0781a.m1421j((i4 == 0 || i4 == 5) ? false : true);
        this.f2709j = j5;
        if (this.f2707h == 2) {
            this.f2707h = 1;
        }
        if (this.f2707h == 4) {
            this.f2707h = 3;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        p086W.AbstractC0781a.m1421j(this.f2707h == 0);
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(0, 3);
        this.f2705f = mo640v;
        mo640v.mo1407c(this.f2701b);
        interfaceC2405q.mo637s();
        interfaceC2405q.mo638t(new p215y0.C2411w(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f2707h = 1;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        return true;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        int i4 = this.f2707h;
        p086W.AbstractC0781a.m1421j((i4 == 0 || i4 == 5) ? false : true);
        if (this.f2707h == 1) {
            int m1804l = ((p215y0.C2400l) interfaceC2404p).f9449n != -1 ? p101a.AbstractC0936a.m1804l(((p215y0.C2400l) interfaceC2404p).f9449n) : 1024;
            if (m1804l > this.f2704e.length) {
                this.f2704e = new byte[m1804l];
            }
            this.f2706g = 0;
            this.f2707h = 2;
        }
        int i5 = this.f2707h;
        java.util.ArrayList arrayList = this.f2702c;
        if (i5 == 2) {
            byte[] bArr = this.f2704e;
            if (bArr.length == this.f2706g) {
                this.f2704e = java.util.Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f2704e;
            int i6 = this.f2706g;
            p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
            int read = c2400l.read(bArr2, i6, bArr2.length - i6);
            if (read != -1) {
                this.f2706g += read;
            }
            long j4 = c2400l.f9449n;
            if ((j4 != -1 && this.f2706g == j4) || read == -1) {
                try {
                    long j5 = this.f2709j;
                    this.f2700a.mo692h(this.f2704e, 0, this.f2706g, j5 != -9223372036854775807L ? new p083V0.C0773k(j5, true) : p083V0.C0773k.f2712c, new p009B2.C0067x(10, this));
                    java.util.Collections.sort(arrayList);
                    this.f2708i = new long[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        this.f2708i[i7] = ((p083V0.C0769g) arrayList.get(i7)).f2698l;
                    }
                    this.f2704e = p086W.AbstractC0805y.f2806f;
                    this.f2707h = 4;
                } catch (java.lang.RuntimeException e4) {
                    throw p076T.C0666I.m1202a(e4, "SubtitleParser failed.");
                }
            }
        }
        if (this.f2707h == 3) {
            if (((p215y0.C2400l) interfaceC2404p).m4635l(((p215y0.C2400l) interfaceC2404p).f9449n != -1 ? p101a.AbstractC0936a.m1804l(((p215y0.C2400l) interfaceC2404p).f9449n) : 1024) == -1) {
                long j6 = this.f2709j;
                for (int m1611f = j6 == -9223372036854775807L ? 0 : p086W.AbstractC0805y.m1611f(this.f2708i, j6, true); m1611f < arrayList.size(); m1611f++) {
                    m1401a((p083V0.C0769g) arrayList.get(m1611f));
                }
                this.f2707h = 4;
            }
        }
        return this.f2707h == 4 ? -1 : 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
        if (this.f2707h == 5) {
            return;
        }
        this.f2700a.mo1403b();
        this.f2707h = 5;
    }
}
