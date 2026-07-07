package t0;

import T.C0095p;
import T.V;
import W.y;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0562d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final V f8304a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8305b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f8306c;

    /* renamed from: d, reason: collision with root package name */
    public final C0095p[] f8307d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f8308e;

    /* renamed from: f, reason: collision with root package name */
    public int f8309f;

    public AbstractC0562d(V v4, int[] iArr) {
        int i4 = 0;
        W.a.j(iArr.length > 0);
        v4.getClass();
        this.f8304a = v4;
        int length = iArr.length;
        this.f8305b = length;
        this.f8307d = new C0095p[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f8307d[i5] = v4.f2172d[iArr[i5]];
        }
        Arrays.sort(this.f8307d, new W0.d(5));
        this.f8306c = new int[this.f8305b];
        while (true) {
            int i6 = this.f8305b;
            if (i4 >= i6) {
                this.f8308e = new long[i6];
                return;
            } else {
                this.f8306c[i4] = v4.b(this.f8307d[i4]);
                i4++;
            }
        }
    }

    @Override // t0.s
    public final int a() {
        return this.f8306c[g()];
    }

    @Override // t0.s
    public final V b() {
        return this.f8304a;
    }

    @Override // t0.s
    public final C0095p d() {
        return this.f8307d[g()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0562d abstractC0562d = (AbstractC0562d) obj;
        return this.f8304a.equals(abstractC0562d.f8304a) && Arrays.equals(this.f8306c, abstractC0562d.f8306c);
    }

    @Override // t0.s
    public final C0095p h(int i4) {
        return this.f8307d[i4];
    }

    public final int hashCode() {
        if (this.f8309f == 0) {
            this.f8309f = Arrays.hashCode(this.f8306c) + (System.identityHashCode(this.f8304a) * 31);
        }
        return this.f8309f;
    }

    @Override // t0.s
    public void i() {
    }

    @Override // t0.s
    public void j(float f4) {
    }

    @Override // t0.s
    public final int k(int i4) {
        return this.f8306c[i4];
    }

    @Override // t0.s
    public final int length() {
        return this.f8306c.length;
    }

    @Override // t0.s
    public int n(long j4, List list) {
        return list.size();
    }

    @Override // t0.s
    public final boolean o(long j4, int i4) {
        return this.f8308e[i4] > j4;
    }

    @Override // t0.s
    public final int p(C0095p c0095p) {
        for (int i4 = 0; i4 < this.f8305b; i4++) {
            if (this.f8307d[i4] == c0095p) {
                return i4;
            }
        }
        return -1;
    }

    @Override // t0.s
    public final boolean q(long j4, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean o2 = o(elapsedRealtime, i4);
        int i5 = 0;
        while (i5 < this.f8305b && !o2) {
            o2 = (i5 == i4 || o(elapsedRealtime, i5)) ? false : true;
            i5++;
        }
        if (!o2) {
            return false;
        }
        long[] jArr = this.f8308e;
        long j5 = jArr[i4];
        int i6 = y.f2709a;
        long j6 = elapsedRealtime + j4;
        if (((j4 ^ j6) & (elapsedRealtime ^ j6)) < 0) {
            j6 = Long.MAX_VALUE;
        }
        jArr[i4] = Math.max(j5, j6);
        return true;
    }

    @Override // t0.s
    public void r() {
    }

    @Override // t0.s
    public final int u(int i4) {
        for (int i5 = 0; i5 < this.f8305b; i5++) {
            if (this.f8306c[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }
}
