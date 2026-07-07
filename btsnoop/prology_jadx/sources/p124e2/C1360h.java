package p124e2;

/* renamed from: e2.h */
/* loaded from: classes.dex */
public final class C1360h implements p124e2.InterfaceC1359g, java.io.Serializable {

    /* renamed from: l */
    public final java.util.List f5636l;

    public C1360h(java.util.List list) {
        this.f5636l = list;
    }

    @Override // p124e2.InterfaceC1359g
    public final boolean apply(java.lang.Object obj) {
        int i4 = 0;
        while (true) {
            java.util.List list = this.f5636l;
            if (i4 >= list.size()) {
                return true;
            }
            if (!((p124e2.InterfaceC1359g) list.get(i4)).apply(obj)) {
                return false;
            }
            i4++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p124e2.C1360h) {
            return this.f5636l.equals(((p124e2.C1360h) obj).f5636l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5636l.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (java.lang.Object obj : this.f5636l) {
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
