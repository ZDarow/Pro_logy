package e2;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final List f5442l;

    public h(List list) {
        this.f5442l = list;
    }

    @Override // e2.g
    public final boolean apply(Object obj) {
        int i4 = 0;
        while (true) {
            List list = this.f5442l;
            if (i4 >= list.size()) {
                return true;
            }
            if (!((g) list.get(i4)).apply(obj)) {
                return false;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5442l.equals(((h) obj).f5442l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5442l.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f5442l) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
