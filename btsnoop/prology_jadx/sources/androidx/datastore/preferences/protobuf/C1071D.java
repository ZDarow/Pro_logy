package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.D */
/* loaded from: classes.dex */
public final class C1071D implements androidx.datastore.preferences.protobuf.InterfaceC1078K {

    /* renamed from: a */
    public androidx.datastore.preferences.protobuf.InterfaceC1078K[] f4150a;

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1078K
    /* renamed from: a */
    public final boolean mo2354a(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.InterfaceC1078K interfaceC1078K : this.f4150a) {
            if (interfaceC1078K.mo2354a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1078K
    /* renamed from: b */
    public final androidx.datastore.preferences.protobuf.C1087U mo2355b(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.InterfaceC1078K interfaceC1078K : this.f4150a) {
            if (interfaceC1078K.mo2354a(cls)) {
                return interfaceC1078K.mo2355b(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
