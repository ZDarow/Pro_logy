package p071R2;

/* renamed from: R2.O */
/* loaded from: classes.dex */
public final class C0594O {

    /* renamed from: a */
    public final java.lang.String f1865a;

    /* renamed from: b */
    public final p071R2.EnumC0592M f1866b;

    public C0594O(java.lang.String str, p071R2.EnumC0592M enumC0592M) {
        this.f1865a = str;
        this.f1866b = enumC0592M;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p071R2.C0594O)) {
            return false;
        }
        p071R2.C0594O c0594o = (p071R2.C0594O) obj;
        return p154k3.AbstractC1803h.m3775a(this.f1865a, c0594o.f1865a) && this.f1866b == c0594o.f1866b;
    }

    public final int hashCode() {
        java.lang.String str = this.f1865a;
        return this.f1866b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f1865a + ", type=" + this.f1866b + ")";
    }
}
