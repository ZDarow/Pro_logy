package p219z;

/* renamed from: z.c */
/* loaded from: classes.dex */
public final class C2432c {

    /* renamed from: a */
    public final java.lang.String f9555a;

    /* renamed from: b */
    public final java.lang.String f9556b;

    /* renamed from: c */
    public final java.lang.String f9557c;

    /* renamed from: d */
    public final java.util.List f9558d;

    /* renamed from: e */
    public final java.lang.String f9559e;

    public C2432c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f9555a = str;
        this.f9556b = str2;
        this.f9557c = str3;
        list.getClass();
        this.f9558d = list;
        this.f9559e = str + "-" + str2 + "-" + str3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f9555a + ", mProviderPackage: " + this.f9556b + ", mQuery: " + this.f9557c + ", mCertificates:");
        int i4 = 0;
        while (true) {
            java.util.List list = this.f9558d;
            if (i4 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            java.util.List list2 = (java.util.List) list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i4++;
        }
    }
}
