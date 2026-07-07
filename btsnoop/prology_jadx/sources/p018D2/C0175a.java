package p018D2;

/* renamed from: D2.a */
/* loaded from: classes.dex */
public final class C0175a {

    /* renamed from: a */
    public final java.lang.String f474a;

    /* renamed from: b */
    public final java.lang.String f475b;

    /* renamed from: c */
    public final java.lang.String f476c;

    public C0175a(java.lang.String str, java.lang.String str2) {
        this.f474a = str;
        this.f475b = null;
        this.f476c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p018D2.C0175a.class != obj.getClass()) {
            return false;
        }
        p018D2.C0175a c0175a = (p018D2.C0175a) obj;
        if (this.f474a.equals(c0175a.f474a)) {
            return this.f476c.equals(c0175a.f476c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f476c.hashCode() + (this.f474a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f474a);
        sb.append(", function: ");
        return p009B2.AbstractC0051h.m154m(sb, this.f476c, " )");
    }

    public C0175a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f474a = str;
        this.f475b = str2;
        this.f476c = str3;
    }
}
