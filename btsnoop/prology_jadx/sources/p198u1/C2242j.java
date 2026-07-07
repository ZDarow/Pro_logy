package p198u1;

/* renamed from: u1.j */
/* loaded from: classes.dex */
public final class C2242j {

    /* renamed from: a */
    public final java.lang.Object f8932a;

    public C2242j(java.util.List list) {
        this.f8932a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p198u1.C2242j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f8932a.equals(((p198u1.C2242j) obj).f8932a);
    }

    public final int hashCode() {
        return this.f8932a.hashCode();
    }

    public final java.lang.String toString() {
        return p105a3.AbstractC1021d.m2051f0((java.util.Collection) this.f8932a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
