package p044L;

/* renamed from: L.h */
/* loaded from: classes.dex */
public final class C0350h extends androidx.datastore.preferences.protobuf.AbstractC1132v {
    private static final p044L.C0350h DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.InterfaceC1084Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.InterfaceC1133w strings_ = androidx.datastore.preferences.protobuf.C1086T.f4185o;

    static {
        p044L.C0350h c0350h = new p044L.C0350h();
        DEFAULT_INSTANCE = c0350h;
        androidx.datastore.preferences.protobuf.AbstractC1132v.m2636l(p044L.C0350h.class, c0350h);
    }

    /* renamed from: n */
    public static void m776n(p044L.C0350h c0350h, java.util.Set set) {
        androidx.datastore.preferences.protobuf.InterfaceC1133w interfaceC1133w = c0350h.strings_;
        if (!((androidx.datastore.preferences.protobuf.AbstractC1095b) interfaceC1133w).f4210l) {
            androidx.datastore.preferences.protobuf.C1086T c1086t = (androidx.datastore.preferences.protobuf.C1086T) interfaceC1133w;
            int i4 = c1086t.f4187n;
            c0350h.strings_ = c1086t.m2424c(i4 == 0 ? 10 : i4 * 2);
        }
        java.util.RandomAccess randomAccess = c0350h.strings_;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1134x.f4297a;
        set.getClass();
        if (randomAccess instanceof java.util.ArrayList) {
            ((java.util.ArrayList) randomAccess).ensureCapacity(set.size() + ((androidx.datastore.preferences.protobuf.C1086T) randomAccess).f4187n);
        }
        androidx.datastore.preferences.protobuf.C1086T c1086t2 = (androidx.datastore.preferences.protobuf.C1086T) randomAccess;
        int i5 = c1086t2.f4187n;
        for (java.lang.Object obj : set) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (c1086t2.f4187n - i5) + " is null.";
                for (int i6 = c1086t2.f4187n - 1; i6 >= i5; i6--) {
                    c1086t2.remove(i6);
                }
                throw new java.lang.NullPointerException(str);
            }
            c1086t2.add(obj);
        }
    }

    /* renamed from: o */
    public static p044L.C0350h m777o() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: q */
    public static p044L.C0349g m778q() {
        return (p044L.C0349g) ((androidx.datastore.preferences.protobuf.AbstractC1130t) DEFAULT_INSTANCE.mo774e(5));
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.datastore.preferences.protobuf.Q, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1132v
    /* renamed from: e */
    public final java.lang.Object mo774e(int i4) {
        switch (p044L.AbstractC0352j.m781b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return new androidx.datastore.preferences.protobuf.C1087U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return new p044L.C0350h();
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return new androidx.datastore.preferences.protobuf.AbstractC1130t(DEFAULT_INSTANCE);
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q = PARSER;
                androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q2 = interfaceC1084Q;
                if (interfaceC1084Q == null) {
                    synchronized (p044L.C0350h.class) {
                        try {
                            androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q3 = PARSER;
                            androidx.datastore.preferences.protobuf.InterfaceC1084Q interfaceC1084Q4 = interfaceC1084Q3;
                            if (interfaceC1084Q3 == null) {
                                ?? obj = new java.lang.Object();
                                PARSER = obj;
                                interfaceC1084Q4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1084Q2;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final androidx.datastore.preferences.protobuf.InterfaceC1133w m779p() {
        return this.strings_;
    }
}
