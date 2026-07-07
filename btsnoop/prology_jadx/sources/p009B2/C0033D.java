package p009B2;

/* renamed from: B2.D */
/* loaded from: classes.dex */
public final class C0033D {

    /* renamed from: a */
    public boolean f118a;

    /* renamed from: b */
    public java.lang.Object f119b = new android.util.SparseBooleanArray();

    /* renamed from: a */
    public void m118a(int i4) {
        p086W.AbstractC0781a.m1421j(!this.f118a);
        ((android.util.SparseBooleanArray) this.f119b).append(i4, true);
    }

    /* renamed from: b */
    public p076T.C0700n m119b() {
        p086W.AbstractC0781a.m1421j(!this.f118a);
        this.f118a = true;
        return new p076T.C0700n((android.util.SparseBooleanArray) this.f119b);
    }

    /* renamed from: c */
    public void m120c(boolean z4) {
        if (this.f118a) {
            throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f118a = true;
        p009B2.C0034E c0034e = (p009B2.C0034E) this.f119b;
        int i4 = c0034e.f122c - 1;
        c0034e.f122c = i4;
        boolean z5 = z4 | c0034e.f121b;
        c0034e.f121b = z5;
        if (i4 != 0 || z5) {
            return;
        }
        ((android.support.v4.media.session.C1061t) c0034e.f124e).m2239r0((android.view.KeyEvent) c0034e.f123d);
    }
}
