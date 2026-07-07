package y3;

import B2.AbstractC0007h;
import b3.C0196j;
import b3.InterfaceC0195i;
import java.util.concurrent.Executor;
import r3.AbstractC0531s;
import r3.I;
import w3.w;

/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final c f9164n = new AbstractC0531s();

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC0531s f9165o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r3.s, y3.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [w3.i] */
    static {
        k kVar = k.f9180n;
        int i4 = w.f8951a;
        if (64 >= i4) {
            i4 = 64;
        }
        int k4 = w3.a.k("kotlinx.coroutines.io.parallelism", i4, 0, 0, 12);
        kVar.getClass();
        if (k4 < 1) {
            throw new IllegalArgumentException(AbstractC0007h.k("Expected positive parallelism level, but got ", k4).toString());
        }
        if (k4 < j.f9175d) {
            if (k4 < 1) {
                throw new IllegalArgumentException(AbstractC0007h.k("Expected positive parallelism level, but got ", k4).toString());
            }
            kVar = new w3.i(kVar, k4);
        }
        f9165o = kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        f9165o.e(interfaceC0195i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(C0196j.f4462l, runnable);
    }

    @Override // r3.AbstractC0531s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
