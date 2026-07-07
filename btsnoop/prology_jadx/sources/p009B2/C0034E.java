package p009B2;

/* renamed from: B2.E */
/* loaded from: classes.dex */
public final class C0034E {

    /* renamed from: a */
    public final /* synthetic */ int f120a;

    /* renamed from: b */
    public boolean f121b;

    /* renamed from: c */
    public int f122c;

    /* renamed from: d */
    public java.lang.Object f123d;

    /* renamed from: e */
    public java.lang.Object f124e;

    public /* synthetic */ C0034E() {
        this.f120a = 1;
    }

    /* renamed from: a */
    public p009B2.C0034E m121a() {
        p058O1.AbstractC0515s.m1014a("execute parameter required", ((p054N1.InterfaceC0455j) this.f123d) != null);
        return new p009B2.C0034E(this, (p046L1.C0359c[]) this.f124e, this.f121b, this.f122c);
    }

    public java.lang.String toString() {
        switch (this.f120a) {
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
                if (this.f122c >= 0) {
                    sb.append(" #");
                    sb.append(this.f122c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0034E(p009B2.C0034E c0034e, p046L1.C0359c[] c0359cArr, boolean z4, int i4) {
        this.f120a = 2;
        this.f124e = c0034e;
        this.f123d = c0359cArr;
        boolean z5 = false;
        if (c0359cArr != null && z4) {
            z5 = true;
        }
        this.f121b = z5;
        this.f122c = i4;
    }

    public C0034E(android.support.v4.media.session.C1061t c1061t) {
        this.f120a = 3;
        c1061t.getClass();
        this.f123d = new java.util.ArrayList();
        this.f122c = -1;
        this.f124e = c1061t;
    }

    public C0034E(android.support.v4.media.session.C1061t c1061t, android.view.KeyEvent keyEvent) {
        this.f120a = 0;
        this.f124e = c1061t;
        this.f122c = ((p009B2.InterfaceC0035F[]) c1061t.f3861m).length;
        this.f121b = false;
        this.f123d = keyEvent;
    }
}
