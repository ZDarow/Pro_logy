package z;

import android.util.Base64;
import java.util.List;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9192b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9193c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9194d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9195e;

    public C0630c(String str, String str2, String str3, List list) {
        this.f9191a = str;
        this.f9192b = str2;
        this.f9193c = str3;
        list.getClass();
        this.f9194d = list;
        this.f9195e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f9191a + ", mProviderPackage: " + this.f9192b + ", mQuery: " + this.f9193c + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.f9194d;
            if (i4 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i4++;
        }
    }
}
