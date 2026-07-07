package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    public K[] f4002a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        for (K k4 : this.f4002a) {
            if (k4.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        for (K k4 : this.f4002a) {
            if (k4.a(cls)) {
                return k4.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
