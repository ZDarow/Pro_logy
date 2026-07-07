package u1;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import k3.q;
import v1.InterfaceC0588a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f8581a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Z2.e f8582b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0581a f8583c;

    /* JADX WARN: Type inference failed for: r0v0, types: [u1.g, java.lang.Object] */
    static {
        q.a(h.class).b();
        f8582b = new Z2.e(f.f8580m);
        f8583c = C0581a.f8563a;
    }

    public static C0582b a(Context context) {
        k3.h.e(context, "context");
        InterfaceC0588a interfaceC0588a = (InterfaceC0588a) f8582b.a();
        if (interfaceC0588a == null) {
            x1.j jVar = x1.j.f8982c;
            if (x1.j.f8982c == null) {
                ReentrantLock reentrantLock = x1.j.f8983d;
                reentrantLock.lock();
                try {
                    if (x1.j.f8982c == null) {
                        x1.h hVar = null;
                        try {
                            r1.i c4 = x1.g.c();
                            if (c4 != null) {
                                r1.i iVar = r1.i.f8086q;
                                k3.h.e(iVar, "other");
                                Object a4 = c4.f8091p.a();
                                k3.h.d(a4, "<get-bigInteger>(...)");
                                Object a5 = iVar.f8091p.a();
                                k3.h.d(a5, "<get-bigInteger>(...)");
                                if (((BigInteger) a4).compareTo((BigInteger) a5) >= 0) {
                                    x1.h hVar2 = new x1.h(context);
                                    if (hVar2.i()) {
                                        hVar = hVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        x1.j.f8982c = new x1.j(hVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0588a = x1.j.f8982c;
            k3.h.b(interfaceC0588a);
        }
        int i4 = m.f8592b;
        C0582b c0582b = new C0582b(interfaceC0588a);
        f8583c.getClass();
        return c0582b;
    }
}
