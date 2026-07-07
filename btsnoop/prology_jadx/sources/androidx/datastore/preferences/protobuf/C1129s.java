package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s */
/* loaded from: classes.dex */
public final class C1129s implements androidx.datastore.preferences.protobuf.InterfaceC1078K {

    /* renamed from: b */
    public static final androidx.datastore.preferences.protobuf.C1129s f4293b = new androidx.datastore.preferences.protobuf.C1129s(0);

    /* renamed from: a */
    public final /* synthetic */ int f4294a;

    public /* synthetic */ C1129s(int i4) {
        this.f4294a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1078K
    /* renamed from: a */
    public final boolean mo2354a(java.lang.Class cls) {
        switch (this.f4294a) {
            case 0:
                return androidx.datastore.preferences.protobuf.AbstractC1132v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1078K
    /* renamed from: b */
    public final androidx.datastore.preferences.protobuf.C1087U mo2355b(java.lang.Class cls) {
        switch (this.f4294a) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.AbstractC1132v.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (androidx.datastore.preferences.protobuf.C1087U) androidx.datastore.preferences.protobuf.AbstractC1132v.m2633f(cls.asSubclass(androidx.datastore.preferences.protobuf.AbstractC1132v.class)).mo774e(3);
                } catch (java.lang.Exception e4) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }
}
