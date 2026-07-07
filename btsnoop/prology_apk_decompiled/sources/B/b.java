package B;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f83b;

    public b(Object obj, Object obj2) {
        this.f82a = obj;
        this.f83b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f82a, this.f82a) && Objects.equals(bVar.f83b, this.f83b);
    }

    public final int hashCode() {
        Object obj = this.f82a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f83b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f82a + " " + this.f83b + "}";
    }
}
