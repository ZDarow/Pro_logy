package p155l;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class C1817c implements java.util.Map.Entry {

    /* renamed from: l */
    public final java.lang.Object f7380l;

    /* renamed from: m */
    public final java.lang.Object f7381m;

    /* renamed from: n */
    public p155l.C1817c f7382n;

    /* renamed from: o */
    public p155l.C1817c f7383o;

    public C1817c(java.lang.Object obj, java.lang.Object obj2) {
        this.f7380l = obj;
        this.f7381m = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p155l.C1817c)) {
            return false;
        }
        p155l.C1817c c1817c = (p155l.C1817c) obj;
        return this.f7380l.equals(c1817c.f7380l) && this.f7381m.equals(c1817c.f7381m);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f7380l;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f7381m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7380l.hashCode() ^ this.f7381m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.f7380l + "=" + this.f7381m;
    }
}
