package f2;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: f2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295q extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final e2.e f5605l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f5606m;

    public C0295q(e2.e eVar, b0 b0Var) {
        this.f5605l = eVar;
        b0Var.getClass();
        this.f5606m = b0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e2.e eVar = this.f5605l;
        return this.f5606m.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0295q)) {
            return false;
        }
        C0295q c0295q = (C0295q) obj;
        return this.f5605l.equals(c0295q.f5605l) && this.f5606m.equals(c0295q.f5606m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5605l, this.f5606m});
    }

    public final String toString() {
        return this.f5606m + ".onResultOf(" + this.f5605l + ")";
    }
}
