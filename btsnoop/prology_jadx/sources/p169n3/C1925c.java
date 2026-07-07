package p169n3;

/* renamed from: n3.c */
/* loaded from: classes.dex */
public final class C1925c extends p169n3.C1923a {
    static {
        new p169n3.C1923a(1, 0, 1);
    }

    @Override // p169n3.C1923a
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p169n3.C1925c) {
            if (!isEmpty() || !((p169n3.C1925c) obj).isEmpty()) {
                p169n3.C1925c c1925c = (p169n3.C1925c) obj;
                if (this.f7812l == c1925c.f7812l) {
                    if (this.f7813m == c1925c.f7813m) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p169n3.C1923a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7812l * 31) + this.f7813m;
    }

    @Override // p169n3.C1923a
    public final boolean isEmpty() {
        return this.f7812l > this.f7813m;
    }

    @Override // p169n3.C1923a
    public final java.lang.String toString() {
        return this.f7812l + ".." + this.f7813m;
    }
}
