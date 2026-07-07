package p100Z2;

/* renamed from: Z2.e */
/* loaded from: classes.dex */
public final class C0932e implements java.io.Serializable {

    /* renamed from: l */
    public p149j3.InterfaceC1726a f3294l;

    /* renamed from: m */
    public volatile java.lang.Object f3295m = p100Z2.C0933f.f3297a;

    /* renamed from: n */
    public final java.lang.Object f3296n = this;

    public C0932e(p149j3.InterfaceC1726a interfaceC1726a) {
        this.f3294l = interfaceC1726a;
    }

    /* renamed from: a */
    public final java.lang.Object m1762a() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f3295m;
        p100Z2.C0933f c0933f = p100Z2.C0933f.f3297a;
        if (obj2 != c0933f) {
            return obj2;
        }
        synchronized (this.f3296n) {
            obj = this.f3295m;
            if (obj == c0933f) {
                p149j3.InterfaceC1726a interfaceC1726a = this.f3294l;
                p154k3.AbstractC1803h.m3776b(interfaceC1726a);
                obj = interfaceC1726a.mo501c();
                this.f3295m = obj;
                this.f3294l = null;
            }
        }
        return obj;
    }

    public final java.lang.String toString() {
        return this.f3295m != p100Z2.C0933f.f3297a ? java.lang.String.valueOf(m1762a()) : "Lazy value not initialized yet.";
    }
}
