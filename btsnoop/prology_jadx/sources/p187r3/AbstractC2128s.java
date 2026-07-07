package p187r3;

/* renamed from: r3.s */
/* loaded from: classes.dex */
public abstract class AbstractC2128s extends p110b3.AbstractC1187a implements p110b3.InterfaceC1192f {

    /* renamed from: m */
    public static final p187r3.C2127r f8494m = new p187r3.C2127r(p110b3.C1191e.f4622l, p187r3.C2126q.f8491m);

    public AbstractC2128s() {
        super(p110b3.C1191e.f4622l);
    }

    /* renamed from: e */
    public abstract void mo4159e(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Runnable runnable);

    /* renamed from: f */
    public boolean mo4241f() {
        return !(this instanceof p187r3.AbstractC2115i0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [k3.i, j3.l] */
    @Override // p110b3.AbstractC1187a, p110b3.InterfaceC1195i
    /* renamed from: j */
    public final p110b3.InterfaceC1193g mo678j(p110b3.InterfaceC1194h interfaceC1194h) {
        p110b3.InterfaceC1193g interfaceC1193g;
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        if (!(interfaceC1194h instanceof p187r3.C2127r)) {
            if (p110b3.C1191e.f4622l == interfaceC1194h) {
                return this;
            }
            return null;
        }
        p187r3.C2127r c2127r = (p187r3.C2127r) interfaceC1194h;
        p110b3.InterfaceC1194h interfaceC1194h2 = this.f4618l;
        if ((interfaceC1194h2 == c2127r || c2127r.f8493m == interfaceC1194h2) && (interfaceC1193g = (p110b3.InterfaceC1193g) c2127r.f8492l.mo661b(this)) != null) {
            return interfaceC1193g;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [k3.i, j3.l] */
    @Override // p110b3.AbstractC1187a, p110b3.InterfaceC1195i
    /* renamed from: m */
    public final p110b3.InterfaceC1195i mo680m(p110b3.InterfaceC1194h interfaceC1194h) {
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        boolean z4 = interfaceC1194h instanceof p187r3.C2127r;
        p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
        if (z4) {
            p187r3.C2127r c2127r = (p187r3.C2127r) interfaceC1194h;
            p110b3.InterfaceC1194h interfaceC1194h2 = this.f4618l;
            if ((interfaceC1194h2 == c2127r || c2127r.f8493m == interfaceC1194h2) && ((p110b3.InterfaceC1193g) c2127r.f8492l.mo661b(this)) != null) {
                return c1196j;
            }
        } else if (p110b3.C1191e.f4622l == interfaceC1194h) {
            return c1196j;
        }
        return this;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + p187r3.AbstractC2131v.m4243b(this);
    }
}
