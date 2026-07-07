package f2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k0 extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final b0 f5588l;

    public k0(b0 b0Var) {
        this.f5588l = b0Var;
    }

    @Override // f2.b0
    public final b0 a() {
        return this.f5588l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f5588l.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            return this.f5588l.equals(((k0) obj).f5588l);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f5588l.hashCode();
    }

    public final String toString() {
        return this.f5588l + ".reverse()";
    }
}
