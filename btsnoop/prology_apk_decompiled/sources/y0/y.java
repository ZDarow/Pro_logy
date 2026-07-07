package y0;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0617A f9141a;

    /* renamed from: b, reason: collision with root package name */
    public final C0617A f9142b;

    public y(C0617A c0617a, C0617A c0617a2) {
        this.f9141a = c0617a;
        this.f9142b = c0617a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f9141a.equals(yVar.f9141a) && this.f9142b.equals(yVar.f9142b);
    }

    public final int hashCode() {
        return this.f9142b.hashCode() + (this.f9141a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C0617A c0617a = this.f9141a;
        sb.append(c0617a);
        C0617A c0617a2 = this.f9142b;
        if (c0617a.equals(c0617a2)) {
            str = "";
        } else {
            str = ", " + c0617a2;
        }
        return AbstractC0007h.m(sb, str, "]");
    }
}
