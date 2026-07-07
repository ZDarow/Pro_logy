package p129f2;

/* renamed from: f2.o */
/* loaded from: classes.dex */
public abstract class AbstractC1438o {

    /* renamed from: l */
    public transient java.util.Set f5796l;

    /* renamed from: m */
    public transient java.util.Collection f5797m;

    /* renamed from: n */
    public transient java.util.Map f5798n;

    /* renamed from: a */
    public abstract java.util.Map mo3142a();

    /* renamed from: b */
    public boolean mo3171b(java.lang.Object obj) {
        java.util.Iterator it = mo3142a().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p129f2.AbstractC1438o) {
            return mo3142a().equals(((p129f2.AbstractC1438o) obj).mo3142a());
        }
        return false;
    }

    public final int hashCode() {
        return mo3142a().hashCode();
    }

    public final java.lang.String toString() {
        return mo3142a().toString();
    }
}
