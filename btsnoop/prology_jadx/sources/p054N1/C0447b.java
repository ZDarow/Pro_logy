package p054N1;

/* renamed from: N1.b */
/* loaded from: classes.dex */
public final class C0447b {

    /* renamed from: a */
    public final int f1296a;

    /* renamed from: b */
    public final p008B1.C0026d f1297b;

    /* renamed from: c */
    public final p050M1.InterfaceC0418b f1298c;

    /* renamed from: d */
    public final java.lang.String f1299d;

    public C0447b(p008B1.C0026d c0026d, p050M1.InterfaceC0418b interfaceC0418b, java.lang.String str) {
        this.f1297b = c0026d;
        this.f1298c = interfaceC0418b;
        this.f1299d = str;
        this.f1296a = java.util.Arrays.hashCode(new java.lang.Object[]{c0026d, interfaceC0418b, str});
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p054N1.C0447b)) {
            return false;
        }
        p054N1.C0447b c0447b = (p054N1.C0447b) obj;
        return p058O1.AbstractC0515s.m1019f(this.f1297b, c0447b.f1297b) && p058O1.AbstractC0515s.m1019f(this.f1298c, c0447b.f1298c) && p058O1.AbstractC0515s.m1019f(this.f1299d, c0447b.f1299d);
    }

    public final int hashCode() {
        return this.f1296a;
    }
}
