package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166s implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final C0166s f4144b = new C0166s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4145a;

    public /* synthetic */ C0166s(int i4) {
        this.f4145a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        switch (this.f4145a) {
            case 0:
                return AbstractC0169v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        switch (this.f4145a) {
            case 0:
                if (!AbstractC0169v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0169v.f(cls.asSubclass(AbstractC0169v.class)).e(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
