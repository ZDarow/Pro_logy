package T2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Long f2441a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return this.f2441a.equals(((g) obj).f2441a);
    }

    public final int hashCode() {
        return Objects.hash(this.f2441a);
    }
}
