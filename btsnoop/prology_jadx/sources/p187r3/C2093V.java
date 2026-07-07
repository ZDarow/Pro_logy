package p187r3;

/* renamed from: r3.V */
/* loaded from: classes.dex */
public final class C2093V extends p187r3.C2108f {

    /* renamed from: t */
    public final p187r3.C2120l f8446t;

    public C2093V(p110b3.InterfaceC1190d interfaceC1190d, p187r3.C2120l c2120l) {
        super(1, interfaceC1190d);
        this.f8446t = c2120l;
    }

    @Override // p187r3.C2108f
    /* renamed from: A */
    public final java.lang.String mo4174A() {
        return "AwaitContinuation";
    }

    @Override // p187r3.C2108f
    /* renamed from: t */
    public final java.lang.Throwable mo4175t(p187r3.C2097Z c2097z) {
        java.lang.Throwable m4177c;
        java.lang.Object m4187E = this.f8446t.m4187E();
        return (!(m4187E instanceof p187r3.C2095X) || (m4177c = ((p187r3.C2095X) m4187E).m4177c()) == null) ? m4187E instanceof p187r3.C2123n ? ((p187r3.C2123n) m4187E).f8485a : c2097z.m4185A() : m4177c;
    }
}
