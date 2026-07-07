package p198u1;

/* renamed from: u1.f */
/* loaded from: classes.dex */
public final class C2238f extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public static final p198u1.C2238f f8923m = new p154k3.AbstractC1804i(0);

    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        androidx.window.extensions.layout.WindowLayoutComponent m4437a;
        try {
            java.lang.ClassLoader classLoader = p198u1.InterfaceC2240h.class.getClassLoader();
            p198u1.C2237e c2237e = classLoader != null ? new p198u1.C2237e(classLoader, new p180q1.C2022a(classLoader)) : null;
            if (c2237e == null || (m4437a = c2237e.m4437a()) == null) {
                return null;
            }
            p154k3.AbstractC1803h.m3778d(classLoader, "loader");
            p180q1.C2022a c2022a = new p180q1.C2022a(classLoader);
            int m4121a = p185r1.AbstractC2062e.m4121a();
            return m4121a >= 2 ? new p207w1.C2332d(m4437a) : m4121a == 1 ? new p207w1.C2331c(m4437a, c2022a) : new java.lang.Object();
        } catch (java.lang.Throwable unused) {
            p198u1.C2239g c2239g = p198u1.C2239g.f8924a;
            return null;
        }
    }
}
