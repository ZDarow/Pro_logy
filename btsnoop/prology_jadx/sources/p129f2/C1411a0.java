package p129f2;

/* renamed from: f2.a0 */
/* loaded from: classes.dex */
public final class C1411a0 extends p129f2.AbstractC1413b0 implements java.io.Serializable {

    /* renamed from: l */
    public static final p129f2.C1411a0 f5738l = new p129f2.AbstractC1413b0();

    @Override // p129f2.AbstractC1413b0
    /* renamed from: a */
    public final p129f2.AbstractC1413b0 mo3204a() {
        return p129f2.C1429j0.f5781l;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }
}
