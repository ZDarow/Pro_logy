package p129f2;

/* renamed from: f2.k0 */
/* loaded from: classes.dex */
public final class C1431k0 extends p129f2.AbstractC1413b0 implements java.io.Serializable {

    /* renamed from: l */
    public final p129f2.AbstractC1413b0 f5783l;

    public C1431k0(p129f2.AbstractC1413b0 abstractC1413b0) {
        this.f5783l = abstractC1413b0;
    }

    @Override // p129f2.AbstractC1413b0
    /* renamed from: a */
    public final p129f2.AbstractC1413b0 mo3204a() {
        return this.f5783l;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f5783l.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p129f2.C1431k0) {
            return this.f5783l.equals(((p129f2.C1431k0) obj).f5783l);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f5783l.hashCode();
    }

    public final java.lang.String toString() {
        return this.f5783l + ".reverse()";
    }
}
