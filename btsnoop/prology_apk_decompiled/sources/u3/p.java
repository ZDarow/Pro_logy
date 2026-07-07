package u3;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import r3.P;

/* loaded from: classes.dex */
public final class p extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public q f8642o;

    /* renamed from: p, reason: collision with root package name */
    public e f8643p;

    /* renamed from: q, reason: collision with root package name */
    public s f8644q;

    /* renamed from: r, reason: collision with root package name */
    public P f8645r;
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8646t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f8647u;

    /* renamed from: v, reason: collision with root package name */
    public int f8648v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8647u = qVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8646t = obj;
        this.f8648v |= Integer.MIN_VALUE;
        this.f8647u.C(null, this);
        return EnumC0225a.f4710l;
    }
}
