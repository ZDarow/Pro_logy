package f0;

import T.C0095p;
import W.y;
import X2.o;
import a0.V;
import a0.b0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.C0491x;
import q0.F;
import q0.H;
import q0.I;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f5454a;

    /* renamed from: b, reason: collision with root package name */
    public final F f5455b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f5456c;

    public /* synthetic */ e(CopyOnWriteArrayList copyOnWriteArrayList, int i4, F f4) {
        this.f5456c = copyOnWriteArrayList;
        this.f5454a = i4;
        this.f5455b = f4;
    }

    public void a(int i4, C0095p c0095p, int i5, Object obj, long j4) {
        b(new n0.g(1, i4, c0095p, i5, obj, y.Z(j4), -9223372036854775807L));
    }

    public void b(n0.g gVar) {
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new V(this, i4.f7679b, gVar, 3));
        }
    }

    public void c(C0491x c0491x, int i4, int i5, C0095p c0095p, int i6, Object obj, long j4, long j5) {
        d(c0491x, new n0.g(i4, i5, c0095p, i6, obj, y.Z(j4), y.Z(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, q0.J] */
    public void d(C0491x c0491x, n0.g gVar) {
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new H(this, i4.f7679b, c0491x, gVar, 2));
        }
    }

    public void e(C0491x c0491x, int i4) {
        f(c0491x, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void f(C0491x c0491x, int i4, int i5, C0095p c0095p, int i6, Object obj, long j4, long j5) {
        g(c0491x, new n0.g(i4, i5, c0095p, i6, obj, y.Z(j4), y.Z(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, q0.J] */
    public void g(C0491x c0491x, n0.g gVar) {
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new H(this, i4.f7679b, c0491x, gVar, 1));
        }
    }

    public void h(C0491x c0491x, int i4, int i5, C0095p c0095p, int i6, Object obj, long j4, long j5, IOException iOException, boolean z4) {
        j(c0491x, new n0.g(i4, i5, c0095p, i6, obj, y.Z(j4), y.Z(j5)), iOException, z4);
    }

    public void i(C0491x c0491x, int i4, IOException iOException, boolean z4) {
        h(c0491x, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    public void j(C0491x c0491x, n0.g gVar, IOException iOException, boolean z4) {
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new b0(this, i4.f7679b, c0491x, gVar, iOException, z4, 1));
        }
    }

    public void k(C0491x c0491x, int i4, int i5, C0095p c0095p, int i6, Object obj, long j4, long j5) {
        l(c0491x, new n0.g(i4, i5, c0095p, i6, obj, y.Z(j4), y.Z(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, q0.J] */
    public void l(C0491x c0491x, n0.g gVar) {
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new H(this, i4.f7679b, c0491x, gVar, 0));
        }
    }

    public void m(n0.g gVar) {
        F f4 = this.f5455b;
        f4.getClass();
        Iterator it = this.f5456c.iterator();
        while (it.hasNext()) {
            I i4 = (I) it.next();
            y.Q(i4.f7678a, new o(this, i4.f7679b, f4, gVar, 2));
        }
    }
}
