package p011C;

/* renamed from: C.G */
/* loaded from: classes.dex */
public class C0097G extends p011C.C0096F {
    public C0097G(p011C.C0105O c0105o, android.view.WindowInsets windowInsets) {
        super(c0105o, windowInsets);
    }

    @Override // p011C.C0101K
    /* renamed from: a */
    public p011C.C0105O mo378a() {
        android.view.WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f287c.consumeDisplayCutout();
        return p011C.C0105O.m396c(null, consumeDisplayCutout);
    }

    @Override // p011C.C0101K
    /* renamed from: e */
    public p011C.C0114f mo379e() {
        android.view.DisplayCutout displayCutout;
        displayCutout = this.f287c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new p011C.C0114f(displayCutout);
    }

    @Override // p011C.AbstractC0095E, p011C.C0101K
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011C.C0097G)) {
            return false;
        }
        p011C.C0097G c0097g = (p011C.C0097G) obj;
        return java.util.Objects.equals(this.f287c, c0097g.f287c) && java.util.Objects.equals(this.f291g, c0097g.f291g) && p011C.AbstractC0095E.m361y(this.f292h, c0097g.f292h);
    }

    @Override // p011C.C0101K
    public int hashCode() {
        return this.f287c.hashCode();
    }
}
