package p145j;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class C1657f extends p140i.C1521m {

    /* renamed from: l */
    public final /* synthetic */ int f6898l = 1;

    /* renamed from: m */
    public final /* synthetic */ p145j.C1663i f6899m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657f(p145j.C1663i c1663i, android.content.Context context, p140i.MenuC1517i menuC1517i, android.view.View view) {
        super(com.prology.R.attr.actionOverflowMenuStyle, context, view, menuC1517i, true);
        this.f6899m = c1663i;
        this.f6327f = 8388613;
        p129f2.C1408Y c1408y = c1663i.f6936G;
        this.f6329h = c1408y;
        p140i.AbstractC1519k abstractC1519k = this.f6330i;
        if (abstractC1519k != null) {
            abstractC1519k.mo3343f(c1408y);
        }
    }

    @Override // p140i.C1521m
    /* renamed from: c */
    public final void mo3392c() {
        switch (this.f6898l) {
            case 0:
                p145j.C1663i c1663i = this.f6899m;
                c1663i.f6933D = null;
                c1663i.getClass();
                super.mo3392c();
                return;
            default:
                p145j.C1663i c1663i2 = this.f6899m;
                p140i.MenuC1517i menuC1517i = c1663i2.f6939n;
                if (menuC1517i != null) {
                    menuC1517i.m3361c(true);
                }
                c1663i2.f6932C = null;
                super.mo3392c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657f(p145j.C1663i c1663i, android.content.Context context, p140i.SubMenuC1527s subMenuC1527s, android.view.View view) {
        super(com.prology.R.attr.actionOverflowMenuStyle, context, view, subMenuC1527s, false);
        this.f6899m = c1663i;
        if (!subMenuC1527s.f6353w.m3381d()) {
            android.view.View view2 = c1663i.f6944s;
            this.f6326e = view2 == null ? c1663i.f6943r : view2;
        }
        p129f2.C1408Y c1408y = c1663i.f6936G;
        this.f6329h = c1408y;
        p140i.AbstractC1519k abstractC1519k = this.f6330i;
        if (abstractC1519k != null) {
            abstractC1519k.mo3343f(c1408y);
        }
    }
}
