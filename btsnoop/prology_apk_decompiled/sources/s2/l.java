package s2;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f8265a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8266b;

    public l(String str, Map map) {
        this.f8265a = str;
        this.f8266b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f8265a.equals(lVar.f8265a) && Objects.equals(this.f8266b, lVar.f8266b);
    }

    public final int hashCode() {
        return Objects.hash(this.f8265a, this.f8266b);
    }
}
