package p011C;

/* renamed from: C.J */
/* loaded from: classes.dex */
public final class C0100J extends p011C.C0099I {

    /* renamed from: s */
    public static final p011C.C0105O f298s;

    static {
        android.view.WindowInsets windowInsets;
        windowInsets = android.view.WindowInsets.CONSUMED;
        f298s = p011C.C0105O.m396c(null, windowInsets);
    }

    public C0100J(p011C.C0105O c0105o, android.view.WindowInsets windowInsets) {
        super(c0105o, windowInsets);
    }

    @Override // p011C.C0099I, p011C.AbstractC0095E, p011C.C0101K
    /* renamed from: n */
    public boolean mo366n(int i4) {
        boolean isVisible;
        isVisible = this.f287c.isVisible(p011C.AbstractC0104N.m394a(i4));
        return isVisible;
    }
}
