package androidx.media3.exoplayer.smoothstreaming;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements p179q0.InterfaceC1963E {

    /* renamed from: a */
    public final p096Y1.C0890a f4369a;

    /* renamed from: b */
    public final p094Y.InterfaceC0869g f4370b;

    /* renamed from: c */
    public final p046L1.C0363g f4371c;

    /* renamed from: d */
    public final p043K2.C0339o f4372d;

    /* renamed from: e */
    public final p193t0.C2164b f4373e;

    /* renamed from: f */
    public final long f4374f;

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [t0.b, java.lang.Object] */
    public SsMediaSource$Factory(p094Y.InterfaceC0869g interfaceC0869g) {
        ?? obj = new java.lang.Object();
        obj.f3189m = interfaceC0869g;
        obj.f3190n = new p046L1.C0363g(15, false);
        this.f4369a = obj;
        this.f4370b = interfaceC0869g;
        this.f4372d = new p043K2.C0339o(27);
        this.f4373e = new java.lang.Object();
        this.f4374f = 30000L;
        this.f4371c = new p046L1.C0363g(29, false);
        obj.f3188l = true;
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: a */
    public final void mo2671a(p046L1.C0363g c0363g) {
        this.f4369a.f3190n = c0363g;
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: b */
    public final void mo2672b(boolean z4) {
        this.f4369a.f3188l = z4;
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: c */
    public final p179q0.AbstractC1984a mo2673c(p076T.C0659B c0659b) {
        c0659b.f2143b.getClass();
        p197u0.InterfaceC2229p c1408y = new p129f2.C1408Y(22);
        java.util.List list = c0659b.f2143b.f2451c;
        p197u0.InterfaceC2229p c0886x = !list.isEmpty() ? new p094Y.C0886x(20, c1408y, list) : c1408y;
        p127f0.InterfaceC1376i m761n = this.f4372d.m761n(c0659b);
        p193t0.C2164b c2164b = this.f4373e;
        return new p171o0.C1929c(c0659b, this.f4370b, c0886x, this.f4369a, this.f4371c, m761n, c2164b, this.f4374f);
    }
}
