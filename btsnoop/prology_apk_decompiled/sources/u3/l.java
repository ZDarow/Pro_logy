package u3;

import R2.C0078n;
import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class l extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8628o;

    /* renamed from: p, reason: collision with root package name */
    public int f8629p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f8630q;

    /* renamed from: r, reason: collision with root package name */
    public C0078n f8631r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8630q = mVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8628o = obj;
        this.f8629p |= Integer.MIN_VALUE;
        return this.f8630q.C(null, this);
    }
}
