package p180q1;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C2022a {

    /* renamed from: a */
    public final java.lang.ClassLoader f8249a;

    public /* synthetic */ C2022a(java.lang.ClassLoader classLoader) {
        this.f8249a = classLoader;
    }

    /* renamed from: a */
    public p185r1.C2061d m4070a(java.lang.Object obj, p154k3.C1800e c1800e, android.app.Activity activity, p207w1.C2330b c2330b) {
        p185r1.C2060c c2060c = new p185r1.C2060c(c1800e, c2330b);
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.f8249a, new java.lang.Class[]{m4071b()}, c2060c);
        p154k3.AbstractC1803h.m3778d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", android.app.Activity.class, m4071b()).invoke(obj, activity, newProxyInstance);
        return new p185r1.C2061d(obj.getClass().getMethod("removeWindowLayoutInfoListener", m4071b()), obj, newProxyInstance);
    }

    /* renamed from: b */
    public java.lang.Class m4071b() {
        java.lang.Class<?> loadClass = this.f8249a.loadClass("java.util.function.Consumer");
        p154k3.AbstractC1803h.m3778d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
