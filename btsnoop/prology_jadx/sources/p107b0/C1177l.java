package p107b0;

/* renamed from: b0.l */
/* loaded from: classes.dex */
public final class C1177l {

    /* renamed from: a */
    public final java.lang.String f4551a;

    /* renamed from: b */
    public final p107b0.C1176k f4552b;

    /* renamed from: c */
    public final java.lang.Object f4553c;

    static {
        if (p086W.AbstractC0805y.f2801a < 31) {
            new p107b0.C1177l("");
        } else {
            new p107b0.C1177l(p107b0.C1176k.f4549b, "");
        }
    }

    public C1177l(java.lang.String str) {
        p086W.AbstractC0781a.m1421j(p086W.AbstractC0805y.f2801a < 31);
        this.f4551a = str;
        this.f4552b = null;
        this.f4553c = new java.lang.Object();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p107b0.C1177l)) {
            return false;
        }
        p107b0.C1177l c1177l = (p107b0.C1177l) obj;
        return java.util.Objects.equals(this.f4551a, c1177l.f4551a) && java.util.Objects.equals(this.f4552b, c1177l.f4552b) && java.util.Objects.equals(this.f4553c, c1177l.f4553c);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f4551a, this.f4552b, this.f4553c);
    }

    public C1177l(android.media.metrics.LogSessionId logSessionId, java.lang.String str) {
        this(new p107b0.C1176k(logSessionId), str);
    }

    public C1177l(p107b0.C1176k c1176k, java.lang.String str) {
        this.f4552b = c1176k;
        this.f4551a = str;
        this.f4553c = new java.lang.Object();
    }
}
