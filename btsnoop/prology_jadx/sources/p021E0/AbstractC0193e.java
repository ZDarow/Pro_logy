package p021E0;

/* renamed from: E0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0193e implements p076T.InterfaceC0672O {

    /* renamed from: a */
    public java.lang.Object f537a;

    /* renamed from: b */
    public static p021E0.AbstractC0193e m548b(p152k1.AbstractC1780s abstractC1780s, int i4) {
        if (i4 == 0) {
            return new p152k1.C1773l(abstractC1780s, 0);
        }
        if (i4 == 1) {
            return new p152k1.C1773l(abstractC1780s, 1);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    /* renamed from: a */
    public abstract void mo549a(android.support.v4.media.session.C1061t c1061t);

    /* renamed from: c */
    public java.lang.String mo550c() {
        return null;
    }

    /* renamed from: d */
    public abstract int mo551d(android.view.View view);

    /* renamed from: e */
    public abstract int mo552e(android.view.View view);

    /* renamed from: f */
    public abstract int mo553f();

    /* renamed from: g */
    public abstract p076T.C0659B mo554g();

    /* renamed from: h */
    public abstract p179q0.InterfaceC1963E mo555h(android.content.Context context);

    /* renamed from: i */
    public abstract int mo556i();

    /* renamed from: j */
    public abstract int mo557j();

    /* renamed from: k */
    public abstract void mo558k(int i4, long j4, boolean z4);

    public AbstractC0193e(int i4) {
        switch (i4) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f537a = new p076T.C0676T();
                return;
            default:
                this.f537a = new java.util.LinkedHashMap();
                return;
        }
    }
}
