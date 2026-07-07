package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n */
/* loaded from: classes.dex */
public final class C1119n {

    /* renamed from: a */
    public static volatile androidx.datastore.preferences.protobuf.C1119n f4265a;

    /* renamed from: b */
    public static final androidx.datastore.preferences.protobuf.C1119n f4266b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.n, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        java.util.Collections.emptyMap();
        f4266b = obj;
    }

    /* renamed from: a */
    public static androidx.datastore.preferences.protobuf.C1119n m2626a() {
        androidx.datastore.preferences.protobuf.C1085S c1085s = androidx.datastore.preferences.protobuf.C1085S.f4182c;
        androidx.datastore.preferences.protobuf.C1119n c1119n = f4265a;
        if (c1119n == null) {
            synchronized (androidx.datastore.preferences.protobuf.C1119n.class) {
                try {
                    c1119n = f4265a;
                    if (c1119n == null) {
                        java.lang.Class cls = androidx.datastore.preferences.protobuf.AbstractC1117m.f4264a;
                        androidx.datastore.preferences.protobuf.C1119n c1119n2 = null;
                        if (cls != null) {
                            try {
                                c1119n2 = (androidx.datastore.preferences.protobuf.C1119n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        if (c1119n2 == null) {
                            c1119n2 = f4266b;
                        }
                        f4265a = c1119n2;
                        c1119n = c1119n2;
                    }
                } finally {
                }
            }
        }
        return c1119n;
    }
}
