package p159l3;

/* renamed from: l3.c */
/* loaded from: classes.dex */
public final class C1830c extends p159l3.AbstractC1828a {

    /* renamed from: n */
    public final p159l3.C1829b f7399n = new java.lang.ThreadLocal();

    @Override // p159l3.AbstractC1828a
    /* renamed from: a */
    public final java.util.Random mo3796a() {
        java.lang.Object obj = this.f7399n.get();
        p154k3.AbstractC1803h.m3778d(obj, "get(...)");
        return (java.util.Random) obj;
    }
}
