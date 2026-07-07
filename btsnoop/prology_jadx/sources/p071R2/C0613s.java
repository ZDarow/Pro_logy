package p071R2;

/* renamed from: R2.s */
/* loaded from: classes.dex */
public final class C0613s extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public p154k3.C1811p f1913p;

    /* renamed from: q */
    public int f1914q;

    /* renamed from: r */
    public final /* synthetic */ java.lang.String f1915r;

    /* renamed from: s */
    public final /* synthetic */ p071R2.C0590K f1916s;

    /* renamed from: t */
    public final /* synthetic */ p154k3.C1811p f1917t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613s(java.lang.String str, p071R2.C0590K c0590k, p154k3.C1811p c1811p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1915r = str;
        this.f1916s = c0590k;
        this.f1917t = c1811p;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p071R2.C0613s(this.f1915r, this.f1916s, this.f1917t, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p071R2.C0613s) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p154k3.C1811p c1811p;
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f1914q;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p048M.C0397d c0397d = new p048M.C0397d(this.f1915r);
            p071R2.C0590K c0590k = this.f1916s;
            android.content.Context context = c0590k.f1854l;
            if (context == null) {
                p154k3.AbstractC1803h.m3783i("context");
                throw null;
            }
            android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(((p035I.InterfaceC0286h) p071R2.AbstractC0591L.m1119a(context).f1048m).mo668d(), c0397d, c0590k, 12);
            p154k3.C1811p c1811p2 = this.f1917t;
            this.f1913p = c1811p2;
            this.f1914q = 1;
            java.lang.Object m4453c = p200u3.AbstractC2264r.m4453c(c1061t, this);
            if (m4453c == enumC1252a) {
                return enumC1252a;
            }
            c1811p = c1811p2;
            obj = m4453c;
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1811p = this.f1913p;
            p176p1.AbstractC1949a.m3913P(obj);
        }
        c1811p.f7374l = obj;
        return p100Z2.C0934g.f3298a;
    }
}
