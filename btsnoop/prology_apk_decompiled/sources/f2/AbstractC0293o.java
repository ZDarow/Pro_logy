package f2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293o {

    /* renamed from: l, reason: collision with root package name */
    public transient Set f5601l;

    /* renamed from: m, reason: collision with root package name */
    public transient Collection f5602m;

    /* renamed from: n, reason: collision with root package name */
    public transient Map f5603n;

    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0293o) {
            return a().equals(((AbstractC0293o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
