package u1;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8588a;

    public j(List list) {
        this.f8588a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f8588a.equals(((j) obj).f8588a);
    }

    public final int hashCode() {
        return this.f8588a.hashCode();
    }

    public final String toString() {
        return a3.d.f0((Collection) this.f8588a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
