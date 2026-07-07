package p129f2;

/* renamed from: f2.w */
/* loaded from: classes.dex */
public final class C1450w extends p129f2.AbstractC1413b0 implements java.io.Serializable {

    /* renamed from: l */
    public final p087W0.C0809d f5824l;

    public C1450w(p087W0.C0809d c0809d) {
        this.f5824l = c0809d;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f5824l.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p129f2.C1450w) {
            return this.f5824l.equals(((p129f2.C1450w) obj).f5824l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5824l.hashCode();
    }

    public final java.lang.String toString() {
        return this.f5824l.toString();
    }
}
