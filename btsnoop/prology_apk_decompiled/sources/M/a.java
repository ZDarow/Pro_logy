package M;

import j3.l;
import java.util.Map;
import k3.i;

/* loaded from: classes.dex */
public final class a extends i implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final a f1102m = new i(1);

    @Override // j3.l
    public final Object b(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        k3.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            k3.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i4 = 0;
            for (byte b4 : bArr) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b4));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f1108a + " = " + valueOf;
    }
}
