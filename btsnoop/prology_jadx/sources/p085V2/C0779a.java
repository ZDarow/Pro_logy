package p085V2;

/* renamed from: V2.a */
/* loaded from: classes.dex */
public final class C0779a extends p078T2.AbstractC0724a {

    /* renamed from: p */
    public boolean f2730p;

    @Override // p078T2.AbstractC0724a
    /* renamed from: a */
    public final void mo1318a() {
        p102a0.C0944H c0944h = (p102a0.C0944H) this.f2514n;
        c0944h.m1848U();
        p076T.C0690d0 c0690d0 = c0944h.f3351c0;
        int i4 = c0690d0.f2311a;
        int i5 = 1;
        int i6 = c0690d0.f2312b;
        if (i4 != 0 && i6 != 0 && !this.f2730p) {
            c0944h.m1848U();
            p076T.C0702p c0702p = c0944h.f3333M;
            java.util.Objects.requireNonNull(c0702p);
            try {
                i5 = p009B2.AbstractC0051h.m142a(c0702p.f2417v);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        this.f2515o.m1325b(i4, i6, c0944h.m1859v(), p009B2.AbstractC0051h.m148g(i5));
    }
}
