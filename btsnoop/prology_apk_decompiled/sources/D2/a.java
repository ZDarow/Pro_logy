package D2;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f466b;

    /* renamed from: c, reason: collision with root package name */
    public final String f467c;

    public a(String str, String str2) {
        this.f465a = str;
        this.f466b = null;
        this.f467c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f465a.equals(aVar.f465a)) {
            return this.f467c.equals(aVar.f467c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f467c.hashCode() + (this.f465a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f465a);
        sb.append(", function: ");
        return AbstractC0007h.m(sb, this.f467c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f465a = str;
        this.f466b = str2;
        this.f467c = str3;
    }
}
