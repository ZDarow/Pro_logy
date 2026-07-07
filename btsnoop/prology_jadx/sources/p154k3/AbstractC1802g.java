package p154k3;

/* renamed from: k3.g */
/* loaded from: classes.dex */
public abstract class AbstractC1802g extends p154k3.AbstractC1798c implements p154k3.InterfaceC1801f, p173o3.InterfaceC1931a, p100Z2.InterfaceC0928a {

    /* renamed from: r */
    public final int f7365r;

    /* renamed from: s */
    public final int f7366s;

    public AbstractC1802g(int i4, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i5) {
        this(i4, p154k3.C1797b.f7356l, cls, str, str2, i5);
    }

    @Override // p154k3.AbstractC1798c
    /* renamed from: a */
    public final p173o3.InterfaceC1931a mo3771a() {
        p154k3.AbstractC1812q.f7375a.getClass();
        return this;
    }

    @Override // p154k3.InterfaceC1801f
    /* renamed from: e */
    public final int mo3039e() {
        return this.f7365r;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p154k3.AbstractC1802g) {
            p154k3.AbstractC1802g abstractC1802g = (p154k3.AbstractC1802g) obj;
            return this.f7360o.equals(abstractC1802g.f7360o) && this.f7361p.equals(abstractC1802g.f7361p) && this.f7366s == abstractC1802g.f7366s && this.f7365r == abstractC1802g.f7365r && this.f7358m.equals(abstractC1802g.f7358m) && m3772d().equals(abstractC1802g.m3772d());
        }
        if (!(obj instanceof p154k3.AbstractC1802g)) {
            return false;
        }
        p173o3.InterfaceC1931a interfaceC1931a = this.f7357l;
        if (interfaceC1931a == null) {
            mo3771a();
            this.f7357l = this;
            interfaceC1931a = this;
        }
        return obj.equals(interfaceC1931a);
    }

    public final int hashCode() {
        m3772d();
        return this.f7361p.hashCode() + ((this.f7360o.hashCode() + (m3772d().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        p173o3.InterfaceC1931a interfaceC1931a = this.f7357l;
        if (interfaceC1931a == null) {
            mo3771a();
            this.f7357l = this;
            interfaceC1931a = this;
        }
        if (interfaceC1931a != this) {
            return interfaceC1931a.toString();
        }
        java.lang.String str = this.f7360o;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public AbstractC1802g(int i4, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f7365r = i4;
        this.f7366s = 0;
    }
}
