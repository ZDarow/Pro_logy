package p152k1;

/* renamed from: k1.l */
/* loaded from: classes.dex */
public final class C1773l extends p021E0.AbstractC0193e {

    /* renamed from: b */
    public final /* synthetic */ int f7286b;

    public C1773l(p152k1.AbstractC1780s abstractC1780s, int i4) {
        this.f7286b = i4;
        new android.graphics.Rect();
        this.f537a = abstractC1780s;
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: d */
    public final int mo551d(android.view.View view) {
        switch (this.f7286b) {
            case 0:
                p152k1.C1781t c1781t = (p152k1.C1781t) view.getLayoutParams();
                ((p152k1.AbstractC1780s) this.f537a).getClass();
                return view.getRight() + ((p152k1.C1781t) view.getLayoutParams()).f7300a.right + ((android.view.ViewGroup.MarginLayoutParams) c1781t).rightMargin;
            default:
                p152k1.C1781t c1781t2 = (p152k1.C1781t) view.getLayoutParams();
                ((p152k1.AbstractC1780s) this.f537a).getClass();
                return view.getBottom() + ((p152k1.C1781t) view.getLayoutParams()).f7300a.bottom + ((android.view.ViewGroup.MarginLayoutParams) c1781t2).bottomMargin;
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: e */
    public final int mo552e(android.view.View view) {
        switch (this.f7286b) {
            case 0:
                p152k1.C1781t c1781t = (p152k1.C1781t) view.getLayoutParams();
                ((p152k1.AbstractC1780s) this.f537a).getClass();
                return (view.getLeft() - ((p152k1.C1781t) view.getLayoutParams()).f7300a.left) - ((android.view.ViewGroup.MarginLayoutParams) c1781t).leftMargin;
            default:
                p152k1.C1781t c1781t2 = (p152k1.C1781t) view.getLayoutParams();
                ((p152k1.AbstractC1780s) this.f537a).getClass();
                return (view.getTop() - ((p152k1.C1781t) view.getLayoutParams()).f7300a.top) - ((android.view.ViewGroup.MarginLayoutParams) c1781t2).topMargin;
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: f */
    public final int mo553f() {
        switch (this.f7286b) {
            case 0:
                p152k1.AbstractC1780s abstractC1780s = (p152k1.AbstractC1780s) this.f537a;
                return abstractC1780s.f7298f - abstractC1780s.m3743t();
            default:
                p152k1.AbstractC1780s abstractC1780s2 = (p152k1.AbstractC1780s) this.f537a;
                return abstractC1780s2.f7299g - abstractC1780s2.m3741r();
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: i */
    public final int mo556i() {
        switch (this.f7286b) {
            case 0:
                return ((p152k1.AbstractC1780s) this.f537a).m3742s();
            default:
                return ((p152k1.AbstractC1780s) this.f537a).m3744u();
        }
    }

    @Override // p021E0.AbstractC0193e
    /* renamed from: j */
    public final int mo557j() {
        switch (this.f7286b) {
            case 0:
                p152k1.AbstractC1780s abstractC1780s = (p152k1.AbstractC1780s) this.f537a;
                return (abstractC1780s.f7298f - abstractC1780s.m3742s()) - abstractC1780s.m3743t();
            default:
                p152k1.AbstractC1780s abstractC1780s2 = (p152k1.AbstractC1780s) this.f537a;
                return (abstractC1780s2.f7299g - abstractC1780s2.m3744u()) - abstractC1780s2.m3741r();
        }
    }
}
