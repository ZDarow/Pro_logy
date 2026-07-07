package p010B3;

/* renamed from: B3.f */
/* loaded from: classes.dex */
public abstract class AbstractC0075f {

    /* renamed from: a */
    public static final p010B3.C0078i f247a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [B3.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            java.lang.Class.forName("java.nio.file.Files");
            r02 = new java.lang.Object();
        } catch (java.lang.ClassNotFoundException unused) {
            r02 = new java.lang.Object();
        }
        f247a = r02;
        java.lang.String str = p010B3.C0081l.f255m;
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        p154k3.AbstractC1803h.m3778d(property, "getProperty(\"java.io.tmpdir\")");
        p025F1.C0215g.m584u(property, false);
        java.lang.ClassLoader classLoader = p014C3.C0147d.class.getClassLoader();
        p154k3.AbstractC1803h.m3778d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new p014C3.C0147d(classLoader);
    }

    /* renamed from: a */
    public final boolean m322a(p010B3.C0081l c0081l) {
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        return mo323b(c0081l) != null;
    }

    /* renamed from: b */
    public abstract p010B3.C0074e mo323b(p010B3.C0081l c0081l);
}
