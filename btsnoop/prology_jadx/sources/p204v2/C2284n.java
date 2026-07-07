package p204v2;

/* renamed from: v2.n */
/* loaded from: classes.dex */
public final class C2284n {

    /* renamed from: a */
    public final java.lang.String f9063a;

    /* renamed from: b */
    public final java.util.List f9064b;

    public C2284n(java.lang.String str, java.util.List list) {
        this.f9063a = str;
        this.f9064b = list == null ? new java.util.ArrayList() : list;
    }

    /* renamed from: a */
    public static java.lang.Object m4482a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof java.util.List)) {
            return obj;
        }
        java.util.List list = (java.util.List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bArr[i4] = (byte) ((java.lang.Integer) list.get(i4)).intValue();
        }
        return bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p204v2.C2284n)) {
            return false;
        }
        p204v2.C2284n c2284n = (p204v2.C2284n) obj;
        java.lang.String str = this.f9063a;
        if (str != null) {
            if (!str.equals(c2284n.f9063a)) {
                return false;
            }
        } else if (c2284n.f9063a != null) {
            return false;
        }
        java.util.List list = this.f9064b;
        if (list.size() != c2284n.f9064b.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            boolean z4 = list.get(i4) instanceof byte[];
            java.util.List list2 = c2284n.f9064b;
            if (z4 && (list2.get(i4) instanceof byte[])) {
                if (!java.util.Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                    return false;
                }
            } else if (!list.get(i4).equals(list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.f9063a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f9063a);
        java.util.List list = this.f9064b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
