package d0;

import e0.C0250b;
import java.io.IOException;
import r0.C0502d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C0502d f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.m f4882b;

    /* renamed from: c, reason: collision with root package name */
    public final C0250b f4883c;

    /* renamed from: d, reason: collision with root package name */
    public final h f4884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4886f;

    public i(long j4, e0.m mVar, C0250b c0250b, C0502d c0502d, long j5, h hVar) {
        this.f4885e = j4;
        this.f4882b = mVar;
        this.f4883c = c0250b;
        this.f4886f = j5;
        this.f4881a = c0502d;
        this.f4884d = hVar;
    }

    public final i a(long j4, e0.m mVar) {
        long c4;
        h d4 = this.f4882b.d();
        h d5 = mVar.d();
        if (d4 == null) {
            return new i(j4, mVar, this.f4883c, this.f4881a, this.f4886f, d4);
        }
        if (!d4.f()) {
            return new i(j4, mVar, this.f4883c, this.f4881a, this.f4886f, d5);
        }
        long q4 = d4.q(j4);
        if (q4 == 0) {
            return new i(j4, mVar, this.f4883c, this.f4881a, this.f4886f, d5);
        }
        W.a.k(d5);
        long l4 = d4.l();
        long a4 = d4.a(l4);
        long j5 = q4 + l4;
        long j6 = j5 - 1;
        long i4 = d4.i(j6, j4) + d4.a(j6);
        long l5 = d5.l();
        long a5 = d5.a(l5);
        long j7 = this.f4886f;
        if (i4 != a5) {
            if (i4 < a5) {
                throw new IOException();
            }
            if (a5 < a4) {
                c4 = j7 - (d5.c(a4, j4) - l4);
                return new i(j4, mVar, this.f4883c, this.f4881a, c4, d5);
            }
            j5 = d4.c(a5, j4);
        }
        c4 = (j5 - l5) + j7;
        return new i(j4, mVar, this.f4883c, this.f4881a, c4, d5);
    }

    public final long b(long j4) {
        h hVar = this.f4884d;
        W.a.k(hVar);
        return hVar.u(this.f4885e, j4) + this.f4886f;
    }

    public final long c(long j4) {
        long b4 = b(j4);
        h hVar = this.f4884d;
        W.a.k(hVar);
        return (hVar.r(this.f4885e, j4) + b4) - 1;
    }

    public final long d() {
        h hVar = this.f4884d;
        W.a.k(hVar);
        return hVar.q(this.f4885e);
    }

    public final long e(long j4) {
        long f4 = f(j4);
        h hVar = this.f4884d;
        W.a.k(hVar);
        return hVar.i(j4 - this.f4886f, this.f4885e) + f4;
    }

    public final long f(long j4) {
        h hVar = this.f4884d;
        W.a.k(hVar);
        return hVar.a(j4 - this.f4886f);
    }

    public final boolean g(long j4, long j5) {
        h hVar = this.f4884d;
        W.a.k(hVar);
        return hVar.f() || j5 == -9223372036854775807L || e(j4) <= j5;
    }
}
