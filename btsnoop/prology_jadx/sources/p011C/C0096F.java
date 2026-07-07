package p011C;

/* renamed from: C.F */
/* loaded from: classes.dex */
public class C0096F extends p011C.AbstractC0095E {

    /* renamed from: n */
    public p196u.C2207b f293n;

    public C0096F(p011C.C0105O c0105o, android.view.WindowInsets windowInsets) {
        super(c0105o, windowInsets);
        this.f293n = null;
    }

    @Override // p011C.C0101K
    /* renamed from: b */
    public p011C.C0105O mo373b() {
        return p011C.C0105O.m396c(null, this.f287c.consumeStableInsets());
    }

    @Override // p011C.C0101K
    /* renamed from: c */
    public p011C.C0105O mo374c() {
        return p011C.C0105O.m396c(null, this.f287c.consumeSystemWindowInsets());
    }

    @Override // p011C.C0101K
    /* renamed from: g */
    public final p196u.C2207b mo375g() {
        if (this.f293n == null) {
            android.view.WindowInsets windowInsets = this.f287c;
            this.f293n = p196u.C2207b.m4386a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f293n;
    }

    @Override // p011C.C0101K
    /* renamed from: l */
    public boolean mo376l() {
        return this.f287c.isConsumed();
    }

    @Override // p011C.C0101K
    /* renamed from: q */
    public void mo377q(p196u.C2207b c2207b) {
        this.f293n = c2207b;
    }
}
