package androidx.lifecycle;

import b3.InterfaceC0195i;
import java.io.Closeable;
import r3.C0532t;
import r3.InterfaceC0533u;
import r3.P;

/* loaded from: classes.dex */
public final class a implements Closeable, InterfaceC0533u {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0195i f4151l;

    public a(InterfaceC0195i interfaceC0195i) {
        this.f4151l = interfaceC0195i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        P p2 = (P) this.f4151l.j(C0532t.f8178m);
        if (p2 != null) {
            p2.b(null);
        }
    }

    @Override // r3.InterfaceC0533u
    public final InterfaceC0195i h() {
        return this.f4151l;
    }
}
