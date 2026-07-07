package W;

import B2.D;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2660a;

    /* renamed from: b, reason: collision with root package name */
    public D f2661b = new D();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2662c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2663d;

    public j(Object obj) {
        this.f2660a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f2660a.equals(((j) obj).f2660a);
    }

    public final int hashCode() {
        return this.f2660a.hashCode();
    }
}
