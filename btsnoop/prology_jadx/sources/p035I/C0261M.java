package p035I;

/* renamed from: I.M */
/* loaded from: classes.dex */
public final class C0261M extends p154k3.AbstractC1804i implements p149j3.InterfaceC1741p {

    /* renamed from: m */
    public static final p035I.C0261M f776m = new p154k3.AbstractC1804i(2);

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p035I.C0267T c0267t = (p035I.C0267T) obj;
        java.lang.Throwable th = (java.lang.Throwable) obj2;
        p154k3.AbstractC1803h.m3779e(c0267t, "msg");
        if (th == null) {
            th = new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        c0267t.f805b.m4193K(new p187r3.C2123n(th, false));
        return p100Z2.C0934g.f3298a;
    }
}
