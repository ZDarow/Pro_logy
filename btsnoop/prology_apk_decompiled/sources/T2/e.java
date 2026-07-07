package T2;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f2434a;

    /* renamed from: b, reason: collision with root package name */
    public String f2435b;

    /* renamed from: c, reason: collision with root package name */
    public String f2436c;

    /* renamed from: d, reason: collision with root package name */
    public String f2437d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2438e;

    /* renamed from: f, reason: collision with root package name */
    public h f2439f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f2434a, eVar.f2434a) && Objects.equals(this.f2435b, eVar.f2435b) && Objects.equals(this.f2436c, eVar.f2436c) && Objects.equals(this.f2437d, eVar.f2437d) && this.f2438e.equals(eVar.f2438e) && Objects.equals(this.f2439f, eVar.f2439f);
    }

    public final int hashCode() {
        return Objects.hash(this.f2434a, this.f2435b, this.f2436c, this.f2437d, this.f2438e, this.f2439f);
    }
}
