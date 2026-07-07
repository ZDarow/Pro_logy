package r1;

import B2.AbstractC0007h;
import j3.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8084b;

    /* renamed from: c, reason: collision with root package name */
    public final C0507a f8085c;

    public h(Object obj, int i4, C0507a c0507a) {
        k3.h.e(obj, "value");
        AbstractC0007h.s("verificationMode", i4);
        this.f8083a = obj;
        this.f8084b = i4;
        this.f8085c = c0507a;
    }

    @Override // r1.g
    public final Object a() {
        return this.f8083a;
    }

    @Override // r1.g
    public final g d(String str, l lVar) {
        Object obj = this.f8083a;
        return ((Boolean) lVar.b(obj)).booleanValue() ? this : new f(obj, str, this.f8085c, this.f8084b);
    }
}
