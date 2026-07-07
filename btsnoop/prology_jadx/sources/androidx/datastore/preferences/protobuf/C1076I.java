package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.I */
/* loaded from: classes.dex */
public final class C1076I {
    /* renamed from: a */
    public static int m2376a(int i4, java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.C1075H c1075h = (androidx.datastore.preferences.protobuf.C1075H) obj;
        androidx.datastore.preferences.protobuf.C1074G c1074g = (androidx.datastore.preferences.protobuf.C1074G) obj2;
        int i5 = 0;
        if (!c1075h.isEmpty()) {
            for (java.util.Map.Entry entry : c1075h.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                c1074g.getClass();
                int m2595l0 = androidx.datastore.preferences.protobuf.C1115l.m2595l0(i4);
                int m2373a = androidx.datastore.preferences.protobuf.C1074G.m2373a(c1074g.f4156a, key, value);
                i5 += androidx.datastore.preferences.protobuf.C1115l.m2597n0(m2373a) + m2373a + m2595l0;
            }
        }
        return i5;
    }

    /* renamed from: b */
    public static androidx.datastore.preferences.protobuf.C1075H m2377b(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.C1075H c1075h = (androidx.datastore.preferences.protobuf.C1075H) obj;
        androidx.datastore.preferences.protobuf.C1075H c1075h2 = (androidx.datastore.preferences.protobuf.C1075H) obj2;
        if (!c1075h2.isEmpty()) {
            if (!c1075h.f4158l) {
                c1075h = c1075h.m2375b();
            }
            c1075h.m2374a();
            if (!c1075h2.isEmpty()) {
                c1075h.putAll(c1075h2);
            }
        }
        return c1075h;
    }

    /* renamed from: c */
    public static void m2378c(java.lang.Object obj) {
        ((androidx.datastore.preferences.protobuf.C1075H) obj).f4158l = false;
    }
}
