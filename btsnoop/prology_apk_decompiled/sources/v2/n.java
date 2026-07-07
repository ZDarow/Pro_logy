package v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f8710a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8711b;

    public n(String str, List list) {
        this.f8710a = str;
        this.f8711b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            bArr[i4] = (byte) ((Integer) list.get(i4)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        String str = this.f8710a;
        if (str != null) {
            if (!str.equals(nVar.f8710a)) {
                return false;
            }
        } else if (nVar.f8710a != null) {
            return false;
        }
        List list = this.f8711b;
        if (list.size() != nVar.f8711b.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            boolean z4 = list.get(i4) instanceof byte[];
            List list2 = nVar.f8711b;
            if (z4 && (list2.get(i4) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                    return false;
                }
            } else if (!list.get(i4).equals(list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f8710a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8710a);
        List list = this.f8711b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
