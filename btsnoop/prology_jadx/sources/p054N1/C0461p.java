package p054N1;

/* renamed from: N1.p */
/* loaded from: classes.dex */
public final class C0461p {

    /* renamed from: a */
    public final p054N1.C0447b f1346a;

    /* renamed from: b */
    public final p046L1.C0359c f1347b;

    public /* synthetic */ C0461p(p054N1.C0447b c0447b, p046L1.C0359c c0359c) {
        this.f1346a = c0447b;
        this.f1347b = c0359c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof p054N1.C0461p)) {
            p054N1.C0461p c0461p = (p054N1.C0461p) obj;
            if (p058O1.AbstractC0515s.m1019f(this.f1346a, c0461p.f1346a) && p058O1.AbstractC0515s.m1019f(this.f1347b, c0461p.f1347b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f1346a, this.f1347b});
    }

    public final java.lang.String toString() {
        p008B1.C0026d c0026d = new p008B1.C0026d(this);
        c0026d.m108i(this.f1346a, "key");
        c0026d.m108i(this.f1347b, "feature");
        return c0026d.toString();
    }
}
