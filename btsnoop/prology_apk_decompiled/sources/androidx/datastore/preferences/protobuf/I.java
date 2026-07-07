package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class I {
    public static int a(int i4, Object obj, Object obj2) {
        H h4 = (H) obj;
        G g4 = (G) obj2;
        int i5 = 0;
        if (!h4.isEmpty()) {
            for (Map.Entry entry : h4.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                g4.getClass();
                int l02 = C0160l.l0(i4);
                int a4 = G.a(g4.f4008a, key, value);
                i5 += C0160l.n0(a4) + a4 + l02;
            }
        }
        return i5;
    }

    public static H b(Object obj, Object obj2) {
        H h4 = (H) obj;
        H h5 = (H) obj2;
        if (!h5.isEmpty()) {
            if (!h4.f4010l) {
                h4 = h4.b();
            }
            h4.a();
            if (!h5.isEmpty()) {
                h4.putAll(h5);
            }
        }
        return h4;
    }

    public static void c(Object obj) {
        ((H) obj).f4010l = false;
    }
}
