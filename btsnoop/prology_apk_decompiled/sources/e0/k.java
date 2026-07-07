package e0;

import T.C0095p;
import f2.I;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends m implements d0.h {

    /* renamed from: q, reason: collision with root package name */
    public final n f5074q;

    public k(long j4, C0095p c0095p, I i4, n nVar, ArrayList arrayList) {
        super(c0095p, i4, nVar, arrayList);
        this.f5074q = nVar;
    }

    @Override // d0.h
    public final long D(long j4, long j5) {
        n nVar = this.f5074q;
        if (nVar.f5084f != null) {
            return -9223372036854775807L;
        }
        long b4 = nVar.b(j4, j5) + nVar.c(j4, j5);
        return (nVar.e(b4, j4) + nVar.g(b4)) - nVar.f5087i;
    }

    @Override // d0.h
    public final j E(long j4) {
        return this.f5074q.h(this, j4);
    }

    @Override // d0.h
    public final long a(long j4) {
        return this.f5074q.g(j4);
    }

    @Override // e0.m
    public final String b() {
        return null;
    }

    @Override // d0.h
    public final long c(long j4, long j5) {
        return this.f5074q.f(j4, j5);
    }

    @Override // e0.m
    public final d0.h d() {
        return this;
    }

    @Override // e0.m
    public final j e() {
        return null;
    }

    @Override // d0.h
    public final boolean f() {
        return this.f5074q.i();
    }

    @Override // d0.h
    public final long i(long j4, long j5) {
        return this.f5074q.e(j4, j5);
    }

    @Override // d0.h
    public final long l() {
        return this.f5074q.f5082d;
    }

    @Override // d0.h
    public final long q(long j4) {
        return this.f5074q.d(j4);
    }

    @Override // d0.h
    public final long r(long j4, long j5) {
        return this.f5074q.b(j4, j5);
    }

    @Override // d0.h
    public final long u(long j4, long j5) {
        return this.f5074q.c(j4, j5);
    }
}
