package b3;

import j3.p;
import java.io.Serializable;

/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196j implements InterfaceC0195i, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final C0196j f4462l = new Object();

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        k3.h.e(interfaceC0195i, "context");
        return interfaceC0195i;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        k3.h.e(interfaceC0194h, "key");
        return null;
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, p pVar) {
        return obj;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        k3.h.e(interfaceC0194h, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
