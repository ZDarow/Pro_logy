package f2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j0 extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final j0 f5586l = new b0();

    @Override // f2.b0
    public final b0 a() {
        return a0.f5544l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
