package R2;

import I.C0050t;
import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class A extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1758o;

    /* renamed from: p, reason: collision with root package name */
    public int f1759p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0050t f1760q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0050t c0050t, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f1760q = c0050t;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1758o = obj;
        this.f1759p |= Integer.MIN_VALUE;
        return this.f1760q.a(null, this);
    }
}
