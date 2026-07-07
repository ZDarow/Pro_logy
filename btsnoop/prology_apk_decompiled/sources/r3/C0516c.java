package r3;

import b3.InterfaceC0195i;
import java.util.concurrent.locks.LockSupport;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516c extends AbstractC0514a {

    /* renamed from: o, reason: collision with root package name */
    public final Thread f8147o;

    /* renamed from: p, reason: collision with root package name */
    public final H f8148p;

    public C0516c(InterfaceC0195i interfaceC0195i, Thread thread, H h4) {
        super(interfaceC0195i, true);
        this.f8147o = thread;
        this.f8148p = h4;
    }

    @Override // r3.Z
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f8147o;
        if (k3.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
