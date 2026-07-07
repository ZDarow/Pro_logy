package B3;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final i f242a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [B3.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f242a = r02;
        String str = l.f250m;
        String property = System.getProperty("java.io.tmpdir");
        k3.h.d(property, "getProperty(\"java.io.tmpdir\")");
        F1.g.u(property, false);
        ClassLoader classLoader = C3.d.class.getClassLoader();
        k3.h.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new C3.d(classLoader);
    }

    public final boolean a(l lVar) {
        k3.h.e(lVar, "path");
        return b(lVar) != null;
    }

    public abstract e b(l lVar);
}
