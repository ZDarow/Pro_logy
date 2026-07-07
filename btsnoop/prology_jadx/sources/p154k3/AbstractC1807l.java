package p154k3;

/* renamed from: k3.l */
/* loaded from: classes.dex */
public abstract class AbstractC1807l extends p154k3.AbstractC1798c implements p173o3.InterfaceC1933c {

    /* renamed from: r */
    public final boolean f7370r;

    public AbstractC1807l(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        super(obj, cls, str, str2, true);
        this.f7370r = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p154k3.AbstractC1807l) {
            p154k3.AbstractC1807l abstractC1807l = (p154k3.AbstractC1807l) obj;
            return m3772d().equals(abstractC1807l.m3772d()) && this.f7360o.equals(abstractC1807l.f7360o) && this.f7361p.equals(abstractC1807l.f7361p) && this.f7358m.equals(abstractC1807l.f7358m);
        }
        if (obj instanceof p173o3.InterfaceC1933c) {
            return obj.equals(m3787f());
        }
        return false;
    }

    /* renamed from: f */
    public final p173o3.InterfaceC1931a m3787f() {
        if (this.f7370r) {
            return this;
        }
        p173o3.InterfaceC1931a interfaceC1931a = this.f7357l;
        if (interfaceC1931a != null) {
            return interfaceC1931a;
        }
        p173o3.InterfaceC1931a mo3771a = mo3771a();
        this.f7357l = mo3771a;
        return mo3771a;
    }

    public final int hashCode() {
        return this.f7361p.hashCode() + ((this.f7360o.hashCode() + (m3772d().hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        p173o3.InterfaceC1931a m3787f = m3787f();
        return m3787f != this ? m3787f.toString() : p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder("property "), this.f7360o, " (Kotlin reflection is not available)");
    }
}
