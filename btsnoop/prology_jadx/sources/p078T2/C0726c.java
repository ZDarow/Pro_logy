package p078T2;

/* renamed from: T2.c */
/* loaded from: classes.dex */
public final class C0726c extends p021E0.AbstractC0193e {

    /* renamed from: b */
    public final /* synthetic */ int f2518b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0726c(java.lang.String str, int i4) {
        super(str);
        this.f2518b = i4;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T.u, T.v] */
    @Override // p021E0.AbstractC0193e
    /* renamed from: g */
    public final p076T.C0659B mo554g() {
        switch (this.f2518b) {
            case 0:
                p076T.C0706t c0706t = new p076T.C0706t();
                new p025F1.C0215g();
                java.util.List emptyList = java.util.Collections.emptyList();
                p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
                p076T.C0709w c0709w = new p076T.C0709w();
                p076T.C0712z c0712z = p076T.C0712z.f2455a;
                java.lang.String str = (java.lang.String) this.f537a;
                android.net.Uri parse = str == null ? null : android.net.Uri.parse(str);
                return new p076T.C0659B("", new p076T.C0707u(c0706t), parse != null ? new p076T.C0711y(parse, null, null, emptyList, c1415c0, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z);
            default:
                p076T.C0706t c0706t2 = new p076T.C0706t();
                new p025F1.C0215g();
                java.util.List emptyList2 = java.util.Collections.emptyList();
                p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
                p076T.C0709w c0709w2 = new p076T.C0709w();
                p076T.C0712z c0712z2 = p076T.C0712z.f2455a;
                java.lang.String str2 = (java.lang.String) this.f537a;
                android.net.Uri parse2 = str2 == null ? null : android.net.Uri.parse(str2);
                return new p076T.C0659B("", new p076T.C0707u(c0706t2), parse2 != null ? new p076T.C0711y(parse2, null, null, emptyList2, c1415c02, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w2), p076T.C0662E.f2173y, c0712z2);
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: h */
    public final p179q0.InterfaceC1963E mo555h(android.content.Context context) {
        switch (this.f2518b) {
            case 0:
                return new p179q0.C2015t(context);
            default:
                return new p179q0.InterfaceC1963E() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a */
                    public final javax.net.SocketFactory f4368a = javax.net.SocketFactory.getDefault();

                    @Override // p179q0.InterfaceC1963E
                    /* renamed from: c */
                    public final p179q0.AbstractC1984a mo2673c(p076T.C0659B c0659b) {
                        c0659b.f2143b.getClass();
                        return new p161m0.C1864u(c0659b, new p046L1.C0363g(27, false), this.f4368a);
                    }
                };
        }
    }
}
