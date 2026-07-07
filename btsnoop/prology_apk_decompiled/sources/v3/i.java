package v3;

import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class i implements InterfaceC0195i {

    /* renamed from: l, reason: collision with root package name */
    public final Throwable f8729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0195i f8730m;

    public i(InterfaceC0195i interfaceC0195i, Throwable th) {
        this.f8729l = th;
        this.f8730m = interfaceC0195i;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        return this.f8730m.c(interfaceC0195i);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        return this.f8730m.j(interfaceC0194h);
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, j3.p pVar) {
        return this.f8730m.k(obj, pVar);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        return this.f8730m.m(interfaceC0194h);
    }
}
