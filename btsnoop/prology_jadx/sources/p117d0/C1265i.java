package p117d0;

/* renamed from: d0.i */
/* loaded from: classes.dex */
public final class C1265i {

    /* renamed from: a */
    public final p184r0.C2046d f5066a;

    /* renamed from: b */
    public final p122e0.AbstractC1312m f5067b;

    /* renamed from: c */
    public final p122e0.C1301b f5068c;

    /* renamed from: d */
    public final p117d0.InterfaceC1264h f5069d;

    /* renamed from: e */
    public final long f5070e;

    /* renamed from: f */
    public final long f5071f;

    public C1265i(long j4, p122e0.AbstractC1312m abstractC1312m, p122e0.C1301b c1301b, p184r0.C2046d c2046d, long j5, p117d0.InterfaceC1264h interfaceC1264h) {
        this.f5070e = j4;
        this.f5067b = abstractC1312m;
        this.f5068c = c1301b;
        this.f5071f = j5;
        this.f5066a = c2046d;
        this.f5069d = interfaceC1264h;
    }

    /* renamed from: a */
    public final p117d0.C1265i m2985a(long j4, p122e0.AbstractC1312m abstractC1312m) {
        long mo626c;
        p117d0.InterfaceC1264h mo3068d = this.f5067b.mo3068d();
        p117d0.InterfaceC1264h mo3068d2 = abstractC1312m.mo3068d();
        if (mo3068d == null) {
            return new p117d0.C1265i(j4, abstractC1312m, this.f5068c, this.f5066a, this.f5071f, mo3068d);
        }
        if (!mo3068d.mo629f()) {
            return new p117d0.C1265i(j4, abstractC1312m, this.f5068c, this.f5066a, this.f5071f, mo3068d2);
        }
        long mo635q = mo3068d.mo635q(j4);
        if (mo635q == 0) {
            return new p117d0.C1265i(j4, abstractC1312m, this.f5068c, this.f5066a, this.f5071f, mo3068d2);
        }
        p086W.AbstractC0781a.m1422k(mo3068d2);
        long mo632l = mo3068d.mo632l();
        long mo625a = mo3068d.mo625a(mo632l);
        long j5 = mo635q + mo632l;
        long j6 = j5 - 1;
        long mo630i = mo3068d.mo630i(j6, j4) + mo3068d.mo625a(j6);
        long mo632l2 = mo3068d2.mo632l();
        long mo625a2 = mo3068d2.mo625a(mo632l2);
        long j7 = this.f5071f;
        if (mo630i != mo625a2) {
            if (mo630i < mo625a2) {
                throw new java.io.IOException();
            }
            if (mo625a2 < mo625a) {
                mo626c = j7 - (mo3068d2.mo626c(mo625a, j4) - mo632l);
                return new p117d0.C1265i(j4, abstractC1312m, this.f5068c, this.f5066a, mo626c, mo3068d2);
            }
            j5 = mo3068d.mo626c(mo625a2, j4);
        }
        mo626c = (j5 - mo632l2) + j7;
        return new p117d0.C1265i(j4, abstractC1312m, this.f5068c, this.f5066a, mo626c, mo3068d2);
    }

    /* renamed from: b */
    public final long m2986b(long j4) {
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return interfaceC1264h.mo639u(this.f5070e, j4) + this.f5071f;
    }

    /* renamed from: c */
    public final long m2987c(long j4) {
        long m2986b = m2986b(j4);
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return (interfaceC1264h.mo636r(this.f5070e, j4) + m2986b) - 1;
    }

    /* renamed from: d */
    public final long m2988d() {
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return interfaceC1264h.mo635q(this.f5070e);
    }

    /* renamed from: e */
    public final long m2989e(long j4) {
        long m2990f = m2990f(j4);
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return interfaceC1264h.mo630i(j4 - this.f5071f, this.f5070e) + m2990f;
    }

    /* renamed from: f */
    public final long m2990f(long j4) {
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return interfaceC1264h.mo625a(j4 - this.f5071f);
    }

    /* renamed from: g */
    public final boolean m2991g(long j4, long j5) {
        p117d0.InterfaceC1264h interfaceC1264h = this.f5069d;
        p086W.AbstractC0781a.m1422k(interfaceC1264h);
        return interfaceC1264h.mo629f() || j5 == -9223372036854775807L || m2989e(j4) <= j5;
    }
}
