package w3;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.AbstractC0462a;
import r3.AbstractC0531s;
import r3.AbstractC0534v;
import r3.C0527n;
import r3.C0528o;
import r3.C0532t;
import r3.H;
import r3.P;
import r3.Z;
import r3.g0;
import r3.h0;
import r3.j0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e2.f f8908a = new e2.f("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final e2.f f8909b = new e2.f("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e2.f f8910c = new e2.f("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final e2.f f8911d = new e2.f("REUSABLE_CLAIMED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final e2.f f8912e = new e2.f("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final e2.f f8913f = new e2.f("NO_THREAD_ELEMENTS", 1);

    public static final void a(j3.l lVar, Object obj, InterfaceC0195i interfaceC0195i) {
        I1.a b4 = b(lVar, obj, null);
        if (b4 != null) {
            AbstractC0534v.d(interfaceC0195i, b4);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [I1.a, java.lang.RuntimeException] */
    public static final I1.a b(j3.l lVar, Object obj, I1.a aVar) {
        try {
            lVar.b(obj);
        } catch (Throwable th) {
            if (aVar == null || aVar.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0110a.c(aVar, th);
        }
        return aVar;
    }

    public static final Object c(u uVar, long j4, j3.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f8949n >= j4 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f8916l.get(uVar);
            e2.f fVar = f8909b;
            if (obj == fVar) {
                return fVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.h(Long.valueOf(uVar.f8949n + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f8916l;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u d(Object obj) {
        if (obj != f8909b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(InterfaceC0195i interfaceC0195i, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f8919a.iterator();
        while (it.hasNext()) {
            try {
                ((s3.b) it.next()).e(interfaceC0195i, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0110a.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0110a.c(th, new g(interfaceC0195i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f8909b;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(InterfaceC0195i interfaceC0195i, Object obj) {
        if (obj == f8913f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object k4 = interfaceC0195i.k(null, x.f8953o);
            k3.h.c(k4, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0007h.r(k4);
            throw null;
        }
        z zVar = (z) obj;
        g0[] g0VarArr = zVar.f8958b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        k3.h.b(null);
        Object obj2 = zVar.f8957a[length];
        throw null;
    }

    public static final void i(InterfaceC0190d interfaceC0190d, Object obj, j3.l lVar) {
        if (!(interfaceC0190d instanceof h)) {
            interfaceC0190d.i(obj);
            return;
        }
        h hVar = (h) interfaceC0190d;
        Throwable a4 = Z2.d.a(obj);
        Object c0528o = a4 == null ? lVar != null ? new C0528o(obj, lVar) : obj : new C0527n(a4, false);
        AbstractC0531s abstractC0531s = hVar.f8921o;
        d3.b bVar = hVar.f8922p;
        bVar.f();
        if (abstractC0531s.f()) {
            hVar.f8923q = c0528o;
            hVar.f8109n = 1;
            hVar.f8921o.e(bVar.f(), hVar);
            return;
        }
        H a5 = h0.a();
        if (a5.f8117n >= 4294967296L) {
            hVar.f8923q = c0528o;
            hVar.f8109n = 1;
            a3.b bVar2 = a5.f8119p;
            if (bVar2 == null) {
                bVar2 = new a3.b();
                a5.f8119p = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a5.i(true);
        try {
            P p2 = (P) bVar.f().j(C0532t.f8178m);
            if (p2 == null || p2.a()) {
                Object obj2 = hVar.f8924r;
                InterfaceC0195i f4 = bVar.f();
                Object m4 = m(f4, obj2);
                j0 m5 = m4 != f8913f ? AbstractC0534v.m(bVar, f4, m4) : null;
                try {
                    bVar.i(obj);
                } finally {
                    if (m5 == null || m5.X()) {
                        h(f4, m4);
                    }
                }
            } else {
                CancellationException A4 = ((Z) p2).A();
                hVar.b(c0528o, A4);
                hVar.i(AbstractC0462a.s(A4));
            }
            do {
            } while (a5.n());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.a.j(java.lang.String, long, long, long):long");
    }

    public static int k(String str, int i4, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return (int) j(str, i4, i5, i6);
    }

    public static final Object l(InterfaceC0195i interfaceC0195i) {
        Object k4 = interfaceC0195i.k(0, x.f8952n);
        k3.h.b(k4);
        return k4;
    }

    public static final Object m(InterfaceC0195i interfaceC0195i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC0195i);
        }
        if (obj == 0) {
            return f8913f;
        }
        if (obj instanceof Integer) {
            return interfaceC0195i.k(new z(((Number) obj).intValue(), interfaceC0195i), x.f8954p);
        }
        AbstractC0007h.r(obj);
        throw null;
    }
}
