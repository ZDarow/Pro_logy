package p185r1;

/* renamed from: r1.h */
/* loaded from: classes.dex */
public final class C2065h extends p185r1.AbstractC2064g {

    /* renamed from: a */
    public final java.lang.Object f8398a;

    /* renamed from: b */
    public final int f8399b;

    /* renamed from: c */
    public final p185r1.C2058a f8400c;

    public C2065h(java.lang.Object obj, int i4, p185r1.C2058a c2058a) {
        p154k3.AbstractC1803h.m3779e(obj, "value");
        p009B2.AbstractC0051h.m160s("verificationMode", i4);
        this.f8398a = obj;
        this.f8399b = i4;
        this.f8400c = c2058a;
    }

    @Override // p185r1.AbstractC2064g
    /* renamed from: a */
    public final java.lang.Object mo4122a() {
        return this.f8398a;
    }

    @Override // p185r1.AbstractC2064g
    /* renamed from: d */
    public final p185r1.AbstractC2064g mo4123d(java.lang.String str, p149j3.InterfaceC1737l interfaceC1737l) {
        java.lang.Object obj = this.f8398a;
        return ((java.lang.Boolean) interfaceC1737l.mo661b(obj)).booleanValue() ? this : new p185r1.C2063f(obj, str, this.f8400c, this.f8399b);
    }
}
