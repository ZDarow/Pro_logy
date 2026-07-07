package S2;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2058a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f2059b;

    /* renamed from: c, reason: collision with root package name */
    public Map f2060c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2058a.equals(eVar.f2058a) && this.f2059b.equals(eVar.f2059b) && this.f2060c.equals(eVar.f2060c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2058a, this.f2059b, this.f2060c);
    }
}
