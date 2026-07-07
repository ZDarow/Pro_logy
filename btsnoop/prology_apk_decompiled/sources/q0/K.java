package q0;

import T.C0095p;
import java.util.List;
import r0.AbstractC0503e;

/* loaded from: classes.dex */
public final class K implements t0.s {

    /* renamed from: a, reason: collision with root package name */
    public final t0.s f7680a;

    /* renamed from: b, reason: collision with root package name */
    public final T.V f7681b;

    public K(t0.s sVar, T.V v4) {
        this.f7680a = sVar;
        this.f7681b = v4;
    }

    @Override // t0.s
    public final int a() {
        return this.f7680a.a();
    }

    @Override // t0.s
    public final T.V b() {
        return this.f7681b;
    }

    @Override // t0.s
    public final void c(boolean z4) {
        this.f7680a.c(z4);
    }

    @Override // t0.s
    public final C0095p d() {
        return this.f7681b.f2172d[this.f7680a.a()];
    }

    @Override // t0.s
    public final int e() {
        return this.f7680a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k4 = (K) obj;
        return this.f7680a.equals(k4.f7680a) && this.f7681b.equals(k4.f7681b);
    }

    @Override // t0.s
    public final boolean f(long j4, AbstractC0503e abstractC0503e, List list) {
        return this.f7680a.f(j4, abstractC0503e, list);
    }

    @Override // t0.s
    public final int g() {
        return this.f7680a.g();
    }

    @Override // t0.s
    public final C0095p h(int i4) {
        return this.f7681b.f2172d[this.f7680a.k(i4)];
    }

    public final int hashCode() {
        return this.f7680a.hashCode() + ((this.f7681b.hashCode() + 527) * 31);
    }

    @Override // t0.s
    public final void i() {
        this.f7680a.i();
    }

    @Override // t0.s
    public final void j(float f4) {
        this.f7680a.j(f4);
    }

    @Override // t0.s
    public final int k(int i4) {
        return this.f7680a.k(i4);
    }

    @Override // t0.s
    public final Object l() {
        return this.f7680a.l();
    }

    @Override // t0.s
    public final int length() {
        return this.f7680a.length();
    }

    @Override // t0.s
    public final void m() {
        this.f7680a.m();
    }

    @Override // t0.s
    public final int n(long j4, List list) {
        return this.f7680a.n(j4, list);
    }

    @Override // t0.s
    public final boolean o(long j4, int i4) {
        return this.f7680a.o(j4, i4);
    }

    @Override // t0.s
    public final int p(C0095p c0095p) {
        return this.f7680a.u(this.f7681b.b(c0095p));
    }

    @Override // t0.s
    public final boolean q(long j4, int i4) {
        return this.f7680a.q(j4, i4);
    }

    @Override // t0.s
    public final void r() {
        this.f7680a.r();
    }

    @Override // t0.s
    public final void s(long j4, long j5, long j6, List list, r0.n[] nVarArr) {
        this.f7680a.s(j4, j5, j6, list, nVarArr);
    }

    @Override // t0.s
    public final void t() {
        this.f7680a.t();
    }

    @Override // t0.s
    public final int u(int i4) {
        return this.f7680a.u(i4);
    }
}
