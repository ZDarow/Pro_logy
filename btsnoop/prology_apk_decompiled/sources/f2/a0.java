package f2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a0 extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f5544l = new b0();

    @Override // f2.b0
    public final b0 a() {
        return j0.f5586l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
