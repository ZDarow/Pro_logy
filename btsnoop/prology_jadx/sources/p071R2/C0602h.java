package p071R2;

/* renamed from: R2.h */
/* loaded from: classes.dex */
public final class C0602h {

    /* renamed from: a */
    public final java.lang.String f1879a;

    /* renamed from: b */
    public final boolean f1880b;

    public C0602h(java.lang.String str, boolean z4) {
        this.f1879a = str;
        this.f1880b = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p071R2.C0602h)) {
            return false;
        }
        p071R2.C0602h c0602h = (p071R2.C0602h) obj;
        return p154k3.AbstractC1803h.m3775a(this.f1879a, c0602h.f1879a) && this.f1880b == c0602h.f1880b;
    }

    public final int hashCode() {
        java.lang.String str = this.f1879a;
        return java.lang.Boolean.hashCode(this.f1880b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f1879a + ", useDataStore=" + this.f1880b + ")";
    }
}
