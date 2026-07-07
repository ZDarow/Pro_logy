package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.S */
/* loaded from: classes.dex */
public final class C1085S {

    /* renamed from: c */
    public static final androidx.datastore.preferences.protobuf.C1085S f4182c = new androidx.datastore.preferences.protobuf.C1085S();

    /* renamed from: b */
    public final java.util.concurrent.ConcurrentHashMap f4184b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.C1072E f4183a = new androidx.datastore.preferences.protobuf.C1072E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.N] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.N] */
    /* renamed from: a */
    public final androidx.datastore.preferences.protobuf.InterfaceC1088V m2422a(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.C1121o c1121o;
        androidx.datastore.preferences.protobuf.C1080M m2386x;
        androidx.datastore.preferences.protobuf.C1080M c1080m;
        java.lang.Class cls2;
        androidx.datastore.preferences.protobuf.AbstractC1134x.m2643a(cls, "messageType");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f4184b;
        androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V = (androidx.datastore.preferences.protobuf.InterfaceC1088V) concurrentHashMap.get(cls);
        if (interfaceC1088V != null) {
            return interfaceC1088V;
        }
        androidx.datastore.preferences.protobuf.C1072E c1072e = this.f4183a;
        c1072e.getClass();
        java.lang.Class cls3 = androidx.datastore.preferences.protobuf.AbstractC1089W.f4192a;
        if (!androidx.datastore.preferences.protobuf.AbstractC1132v.class.isAssignableFrom(cls) && (cls2 = androidx.datastore.preferences.protobuf.AbstractC1089W.f4192a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        androidx.datastore.preferences.protobuf.C1087U mo2355b = ((androidx.datastore.preferences.protobuf.C1071D) c1072e.f4152a).mo2355b(cls);
        if ((mo2355b.f4191d & 2) == 2) {
            boolean isAssignableFrom = androidx.datastore.preferences.protobuf.AbstractC1132v.class.isAssignableFrom(cls);
            androidx.datastore.preferences.protobuf.AbstractC1132v abstractC1132v = mo2355b.f4188a;
            if (isAssignableFrom) {
                c1080m = new androidx.datastore.preferences.protobuf.C1081N(androidx.datastore.preferences.protobuf.AbstractC1089W.f4194c, androidx.datastore.preferences.protobuf.AbstractC1123p.f4267a, abstractC1132v);
            } else {
                androidx.datastore.preferences.protobuf.C1100d0 c1100d0 = androidx.datastore.preferences.protobuf.AbstractC1089W.f4193b;
                androidx.datastore.preferences.protobuf.C1121o c1121o2 = androidx.datastore.preferences.protobuf.AbstractC1123p.f4268b;
                if (c1121o2 == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c1080m = new androidx.datastore.preferences.protobuf.C1081N(c1100d0, c1121o2, abstractC1132v);
            }
            m2386x = c1080m;
        } else if (androidx.datastore.preferences.protobuf.AbstractC1132v.class.isAssignableFrom(cls)) {
            androidx.datastore.preferences.protobuf.C1082O c1082o = androidx.datastore.preferences.protobuf.AbstractC1083P.f4181b;
            androidx.datastore.preferences.protobuf.C1069B c1069b = androidx.datastore.preferences.protobuf.AbstractC1070C.f4149b;
            androidx.datastore.preferences.protobuf.C1100d0 c1100d02 = androidx.datastore.preferences.protobuf.AbstractC1089W.f4194c;
            androidx.datastore.preferences.protobuf.C1121o c1121o3 = p044L.AbstractC0352j.m781b(mo2355b.m2428d()) != 1 ? androidx.datastore.preferences.protobuf.AbstractC1123p.f4267a : null;
            androidx.datastore.preferences.protobuf.C1076I c1076i = androidx.datastore.preferences.protobuf.AbstractC1077J.f4160b;
            int[] iArr = androidx.datastore.preferences.protobuf.C1080M.f4162n;
            if (!(mo2355b instanceof androidx.datastore.preferences.protobuf.C1087U)) {
                mo2355b.getClass();
                throw new java.lang.ClassCastException();
            }
            m2386x = androidx.datastore.preferences.protobuf.C1080M.m2386x(mo2355b, c1082o, c1069b, c1100d02, c1121o3, c1076i);
        } else {
            androidx.datastore.preferences.protobuf.C1082O c1082o2 = androidx.datastore.preferences.protobuf.AbstractC1083P.f4180a;
            androidx.datastore.preferences.protobuf.C1069B c1069b2 = androidx.datastore.preferences.protobuf.AbstractC1070C.f4148a;
            androidx.datastore.preferences.protobuf.C1100d0 c1100d03 = androidx.datastore.preferences.protobuf.AbstractC1089W.f4193b;
            if (p044L.AbstractC0352j.m781b(mo2355b.m2428d()) != 1) {
                c1121o = androidx.datastore.preferences.protobuf.AbstractC1123p.f4268b;
                if (c1121o == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c1121o = null;
            }
            androidx.datastore.preferences.protobuf.C1076I c1076i2 = androidx.datastore.preferences.protobuf.AbstractC1077J.f4159a;
            int[] iArr2 = androidx.datastore.preferences.protobuf.C1080M.f4162n;
            if (!(mo2355b instanceof androidx.datastore.preferences.protobuf.C1087U)) {
                mo2355b.getClass();
                throw new java.lang.ClassCastException();
            }
            m2386x = androidx.datastore.preferences.protobuf.C1080M.m2386x(mo2355b, c1082o2, c1069b2, c1100d03, c1121o, c1076i2);
        }
        androidx.datastore.preferences.protobuf.InterfaceC1088V interfaceC1088V2 = (androidx.datastore.preferences.protobuf.InterfaceC1088V) concurrentHashMap.putIfAbsent(cls, m2386x);
        return interfaceC1088V2 != null ? interfaceC1088V2 : m2386x;
    }
}
