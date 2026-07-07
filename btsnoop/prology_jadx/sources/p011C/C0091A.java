package p011C;

/* renamed from: C.A */
/* loaded from: classes.dex */
public class C0091A extends p011C.AbstractC0094D {

    /* renamed from: a */
    public final android.view.WindowInsets.Builder f281a;

    public C0091A() {
        this.f281a = p009B2.AbstractC0052i.m172g();
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: b */
    public p011C.C0105O mo354b() {
        android.view.WindowInsets build;
        m357a();
        build = this.f281a.build();
        p011C.C0105O m396c = p011C.C0105O.m396c(null, build);
        m396c.f302a.mo367o(null);
        return m396c;
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: c */
    public void mo355c(p196u.C2207b c2207b) {
        this.f281a.setStableInsets(c2207b.m4388c());
    }

    @Override // p011C.AbstractC0094D
    /* renamed from: d */
    public void mo356d(p196u.C2207b c2207b) {
        this.f281a.setSystemWindowInsets(c2207b.m4388c());
    }

    public C0091A(p011C.C0105O c0105o) {
        super(c0105o);
        android.view.WindowInsets.Builder m172g;
        android.view.WindowInsets m397b = c0105o.m397b();
        if (m397b != null) {
            m172g = p009B2.AbstractC0052i.m173h(m397b);
        } else {
            m172g = p009B2.AbstractC0052i.m172g();
        }
        this.f281a = m172g;
    }
}
