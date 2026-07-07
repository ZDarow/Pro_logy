package p129f2;

/* renamed from: f2.q */
/* loaded from: classes.dex */
public final class C1442q extends p129f2.AbstractC1413b0 implements java.io.Serializable {

    /* renamed from: l */
    public final p124e2.InterfaceC1357e f5800l;

    /* renamed from: m */
    public final p129f2.AbstractC1413b0 f5801m;

    public C1442q(p124e2.InterfaceC1357e interfaceC1357e, p129f2.AbstractC1413b0 abstractC1413b0) {
        this.f5800l = interfaceC1357e;
        abstractC1413b0.getClass();
        this.f5801m = abstractC1413b0;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        p124e2.InterfaceC1357e interfaceC1357e = this.f5800l;
        return this.f5801m.compare(interfaceC1357e.apply(obj), interfaceC1357e.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p129f2.C1442q)) {
            return false;
        }
        p129f2.C1442q c1442q = (p129f2.C1442q) obj;
        return this.f5800l.equals(c1442q.f5800l) && this.f5801m.equals(c1442q.f5801m);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f5800l, this.f5801m});
    }

    public final java.lang.String toString() {
        return this.f5801m + ".onResultOf(" + this.f5800l + ")";
    }
}
