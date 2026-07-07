package androidx.media3.exoplayer.smoothstreaming;

import K2.o;
import T.B;
import Y.g;
import Y.x;
import Y1.a;
import f0.i;
import f2.Y;
import java.util.List;
import o0.C0457c;
import q0.AbstractC0469a;
import q0.InterfaceC0468E;
import t0.C0560b;
import u0.p;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC0468E {

    /* renamed from: a, reason: collision with root package name */
    public final a f4219a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4220b;

    /* renamed from: c, reason: collision with root package name */
    public final L1.g f4221c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4222d;

    /* renamed from: e, reason: collision with root package name */
    public final C0560b f4223e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4224f;

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [t0.b, java.lang.Object] */
    public SsMediaSource$Factory(g gVar) {
        ?? obj = new Object();
        obj.f3079m = gVar;
        obj.f3080n = new L1.g(15, false);
        this.f4219a = obj;
        this.f4220b = gVar;
        this.f4222d = new o(27);
        this.f4223e = new Object();
        this.f4224f = 30000L;
        this.f4221c = new L1.g(29, false);
        obj.f3078l = true;
    }

    @Override // q0.InterfaceC0468E
    public final void a(L1.g gVar) {
        this.f4219a.f3080n = gVar;
    }

    @Override // q0.InterfaceC0468E
    public final void b(boolean z4) {
        this.f4219a.f3078l = z4;
    }

    @Override // q0.InterfaceC0468E
    public final AbstractC0469a c(B b4) {
        b4.f2067b.getClass();
        p y4 = new Y(22);
        List list = b4.f2067b.f2366c;
        p xVar = !list.isEmpty() ? new x(20, y4, list) : y4;
        i n4 = this.f4222d.n(b4);
        C0560b c0560b = this.f4223e;
        return new C0457c(b4, this.f4220b, xVar, this.f4219a, this.f4221c, n4, c0560b, this.f4224f);
    }
}
