package e0;

import W.y;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5069e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f5065a = str;
        this.f5066b = str2;
        this.f5067c = str3;
        this.f5068d = str4;
        this.f5069e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return y.a(this.f5065a, iVar.f5065a) && y.a(this.f5066b, iVar.f5066b) && y.a(this.f5067c, iVar.f5067c) && y.a(this.f5068d, iVar.f5068d) && y.a(this.f5069e, iVar.f5069e);
    }

    public final int hashCode() {
        String str = this.f5065a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5066b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5067c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5068d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5069e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
