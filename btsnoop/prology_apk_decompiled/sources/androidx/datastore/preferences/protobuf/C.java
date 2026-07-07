package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final B f4000a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f4001b;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.B, java.lang.Object] */
    static {
        S s = S.f4034c;
        B b4 = null;
        try {
            b4 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4000a = b4;
        f4001b = new Object();
    }
}
