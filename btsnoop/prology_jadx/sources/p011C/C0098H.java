package p011C;

/* renamed from: C.H */
/* loaded from: classes.dex */
public class C0098H extends p011C.C0097G {

    /* renamed from: o */
    public p196u.C2207b f294o;

    /* renamed from: p */
    public p196u.C2207b f295p;

    /* renamed from: q */
    public p196u.C2207b f296q;

    public C0098H(p011C.C0105O c0105o, android.view.WindowInsets windowInsets) {
        super(c0105o, windowInsets);
        this.f294o = null;
        this.f295p = null;
        this.f296q = null;
    }

    @Override // p011C.C0101K
    /* renamed from: f */
    public p196u.C2207b mo380f() {
        android.graphics.Insets mandatorySystemGestureInsets;
        if (this.f295p == null) {
            mandatorySystemGestureInsets = this.f287c.getMandatorySystemGestureInsets();
            this.f295p = p196u.C2207b.m4387b(mandatorySystemGestureInsets);
        }
        return this.f295p;
    }

    @Override // p011C.C0101K
    /* renamed from: h */
    public p196u.C2207b mo381h() {
        android.graphics.Insets systemGestureInsets;
        if (this.f294o == null) {
            systemGestureInsets = this.f287c.getSystemGestureInsets();
            this.f294o = p196u.C2207b.m4387b(systemGestureInsets);
        }
        return this.f294o;
    }

    @Override // p011C.C0101K
    /* renamed from: j */
    public p196u.C2207b mo382j() {
        android.graphics.Insets tappableElementInsets;
        if (this.f296q == null) {
            tappableElementInsets = this.f287c.getTappableElementInsets();
            this.f296q = p196u.C2207b.m4387b(tappableElementInsets);
        }
        return this.f296q;
    }

    @Override // p011C.AbstractC0095E, p011C.C0101K
    /* renamed from: k */
    public p011C.C0105O mo364k(int i4, int i5, int i6, int i7) {
        android.view.WindowInsets inset;
        inset = this.f287c.inset(i4, i5, i6, i7);
        return p011C.C0105O.m396c(null, inset);
    }

    @Override // p011C.C0096F, p011C.C0101K
    /* renamed from: q */
    public void mo377q(p196u.C2207b c2207b) {
    }
}
