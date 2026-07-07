package u3;

import b3.InterfaceC0190d;
import f2.Y;

/* loaded from: classes.dex */
public final class a extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public v3.n f8595o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8596p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f8597q;

    /* renamed from: r, reason: collision with root package name */
    public int f8598r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y y4, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8597q = y4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8596p = obj;
        this.f8598r |= Integer.MIN_VALUE;
        return this.f8597q.C(null, this);
    }
}
