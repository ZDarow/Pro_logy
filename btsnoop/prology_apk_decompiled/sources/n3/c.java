package n3;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new a(1, 0, 1);
    }

    @Override // n3.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f7526l == cVar.f7526l) {
                    if (this.f7527m == cVar.f7527m) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // n3.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7526l * 31) + this.f7527m;
    }

    @Override // n3.a
    public final boolean isEmpty() {
        return this.f7526l > this.f7527m;
    }

    @Override // n3.a
    public final String toString() {
        return this.f7526l + ".." + this.f7527m;
    }
}
