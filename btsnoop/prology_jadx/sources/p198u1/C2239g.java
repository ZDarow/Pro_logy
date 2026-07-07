package p198u1;

/* renamed from: u1.g */
/* loaded from: classes.dex */
public final class C2239g {

    /* renamed from: a */
    public static final /* synthetic */ p198u1.C2239g f8924a = new java.lang.Object();

    /* renamed from: b */
    public static final p100Z2.C0932e f8925b;

    /* renamed from: c */
    public static final p198u1.C2233a f8926c;

    /* JADX WARN: Type inference failed for: r0v0, types: [u1.g, java.lang.Object] */
    static {
        p154k3.AbstractC1812q.m3788a(p198u1.InterfaceC2240h.class).m3774b();
        f8925b = new p100Z2.C0932e(p198u1.C2238f.f8923m);
        f8926c = p198u1.C2233a.f8905a;
    }

    /* renamed from: a */
    public static p198u1.C2234b m4439a(android.content.Context context) {
        p154k3.AbstractC1803h.m3779e(context, "context");
        p203v1.InterfaceC2270a interfaceC2270a = (p203v1.InterfaceC2270a) f8925b.m1762a();
        if (interfaceC2270a == null) {
            p212x1.C2377j c2377j = p212x1.C2377j.f9341c;
            if (p212x1.C2377j.f9341c == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = p212x1.C2377j.f9342d;
                reentrantLock.lock();
                try {
                    if (p212x1.C2377j.f9341c == null) {
                        p212x1.C2375h c2375h = null;
                        try {
                            p185r1.C2066i m4593c = p212x1.AbstractC2374g.m4593c();
                            if (m4593c != null) {
                                p185r1.C2066i c2066i = p185r1.C2066i.f8401q;
                                p154k3.AbstractC1803h.m3779e(c2066i, "other");
                                java.lang.Object m1762a = m4593c.f8406p.m1762a();
                                p154k3.AbstractC1803h.m3778d(m1762a, "<get-bigInteger>(...)");
                                java.lang.Object m1762a2 = c2066i.f8406p.m1762a();
                                p154k3.AbstractC1803h.m3778d(m1762a2, "<get-bigInteger>(...)");
                                if (((java.math.BigInteger) m1762a).compareTo((java.math.BigInteger) m1762a2) >= 0) {
                                    p212x1.C2375h c2375h2 = new p212x1.C2375h(context);
                                    if (c2375h2.m4602i()) {
                                        c2375h = c2375h2;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                        p212x1.C2377j.f9341c = new p212x1.C2377j(c2375h);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC2270a = p212x1.C2377j.f9341c;
            p154k3.AbstractC1803h.m3776b(interfaceC2270a);
        }
        int i4 = p198u1.C2245m.f8936b;
        p198u1.C2234b c2234b = new p198u1.C2234b(interfaceC2270a);
        f8926c.getClass();
        return c2234b;
    }
}
