package G0;

import L.k;
import W.y;
import android.os.SystemClock;
import d0.h;
import e0.j;
import y0.F;
import y0.l;
import y0.p;
import y0.q;
import y0.z;

/* loaded from: classes.dex */
public final class c implements p, q, h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f673l;

    /* renamed from: m, reason: collision with root package name */
    public long f674m;

    /* renamed from: n, reason: collision with root package name */
    public Object f675n;

    public /* synthetic */ c(long j4, Object obj, int i4) {
        this.f673l = i4;
        this.f674m = j4;
        this.f675n = obj;
    }

    @Override // y0.p
    public void A(int i4) {
        ((l) this.f675n).a(i4, false);
    }

    @Override // y0.p
    public long B() {
        return ((l) this.f675n).f9089o - this.f674m;
    }

    public int C(int i4) {
        c cVar = (c) this.f675n;
        if (cVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f674m) : Long.bitCount(this.f674m & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f674m & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f674m) + cVar.C(i4 - 64);
    }

    @Override // d0.h
    public long D(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // d0.h
    public j E(long j4) {
        return new j(((y0.j) this.f675n).f9075c[(int) j4], r0.f9074b[r8], null);
    }

    public boolean F(int i4) {
        if (i4 < 64) {
            return (this.f674m & (1 << i4)) != 0;
        }
        if (((c) this.f675n) == null) {
            this.f675n = new c(5);
        }
        return ((c) this.f675n).F(i4 - 64);
    }

    public void G() {
        this.f674m = 0L;
        c cVar = (c) this.f675n;
        if (cVar != null) {
            cVar.G();
        }
    }

    public void H(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f675n) == null) {
            this.f675n = exc;
            this.f674m = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f674m) {
            Exception exc2 = (Exception) this.f675n;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f675n;
            this.f675n = null;
            throw exc3;
        }
    }

    @Override // d0.h
    public long a(long j4) {
        return ((y0.j) this.f675n).f9077e[(int) j4] - this.f674m;
    }

    @Override // d0.h
    public long c(long j4, long j5) {
        return y.f(((y0.j) this.f675n).f9077e, j4 + this.f674m, true);
    }

    @Override // y0.p
    public void d() {
        ((l) this.f675n).f9091q = 0;
    }

    @Override // y0.p
    public void e(int i4) {
        ((l) this.f675n).e(i4);
    }

    @Override // d0.h
    public boolean f() {
        return true;
    }

    @Override // d0.h
    public long i(long j4, long j5) {
        return ((y0.j) this.f675n).f9076d[(int) j4];
    }

    @Override // y0.p
    public boolean k(byte[] bArr, int i4, int i5, boolean z4) {
        return ((l) this.f675n).k(bArr, 0, i5, z4);
    }

    @Override // d0.h
    public long l() {
        return 0L;
    }

    @Override // y0.p
    public long n() {
        return ((l) this.f675n).f9088n - this.f674m;
    }

    @Override // y0.p
    public boolean p(byte[] bArr, int i4, int i5, boolean z4) {
        return ((l) this.f675n).p(bArr, i4, i5, z4);
    }

    @Override // d0.h
    public long q(long j4) {
        return ((y0.j) this.f675n).f9073a;
    }

    @Override // d0.h
    public long r(long j4, long j5) {
        return ((y0.j) this.f675n).f9073a;
    }

    @Override // T.InterfaceC0089j
    public int read(byte[] bArr, int i4, int i5) {
        return ((l) this.f675n).read(bArr, i4, i5);
    }

    @Override // y0.p
    public void readFully(byte[] bArr, int i4, int i5) {
        ((l) this.f675n).k(bArr, i4, i5, false);
    }

    @Override // y0.q
    public void s() {
        ((q) this.f675n).s();
    }

    @Override // y0.q
    public void t(z zVar) {
        ((q) this.f675n).t(new d(this, zVar, zVar));
    }

    public String toString() {
        switch (this.f673l) {
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (((c) this.f675n) == null) {
                    return Long.toBinaryString(this.f674m);
                }
                return ((c) this.f675n).toString() + "xx" + Long.toBinaryString(this.f674m);
            default:
                return super.toString();
        }
    }

    @Override // d0.h
    public long u(long j4, long j5) {
        return 0L;
    }

    @Override // y0.q
    public F v(int i4, int i5) {
        return ((q) this.f675n).v(i4, i5);
    }

    @Override // y0.p
    public long w() {
        return ((l) this.f675n).w() - this.f674m;
    }

    @Override // y0.p
    public void z(byte[] bArr, int i4, int i5) {
        ((l) this.f675n).p(bArr, i4, i5, false);
    }

    public /* synthetic */ c(Object obj, long j4, int i4) {
        this.f673l = i4;
        this.f675n = obj;
        this.f674m = j4;
    }

    public c(l lVar, long j4) {
        this.f673l = 1;
        this.f675n = lVar;
        W.a.e(lVar.f9089o >= j4);
        this.f674m = j4;
    }

    public c(int i4) {
        this.f673l = i4;
        switch (i4) {
            case k.STRING_FIELD_NUMBER /* 5 */:
                this.f674m = 0L;
                return;
            default:
                return;
        }
    }
}
