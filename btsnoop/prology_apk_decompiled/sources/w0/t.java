package w0;

import B2.I;
import T.d0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final C0591a f8871a;

    /* renamed from: b, reason: collision with root package name */
    public final p f8872b;

    /* renamed from: c, reason: collision with root package name */
    public final I f8873c = new I();

    /* renamed from: d, reason: collision with root package name */
    public final S0.g f8874d = new S0.g();

    /* renamed from: e, reason: collision with root package name */
    public final S0.g f8875e = new S0.g();

    /* renamed from: f, reason: collision with root package name */
    public final W.l f8876f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f8877g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f8878h;

    /* renamed from: i, reason: collision with root package name */
    public long f8879i;

    /* renamed from: j, reason: collision with root package name */
    public long f8880j;

    /* JADX WARN: Type inference failed for: r3v4, types: [W.l, java.lang.Object] */
    public t(C0591a c0591a, p pVar) {
        this.f8871a = c0591a;
        this.f8872b = pVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f2673a = 0;
        obj.f2674b = 0;
        obj.f2676d = new long[highestOneBit];
        obj.f2675c = highestOneBit - 1;
        this.f8876f = obj;
        this.f8878h = d0.f2230e;
        this.f8880j = -9223372036854775807L;
    }

    public final void a() {
        W.l lVar = this.f8876f;
        lVar.f2673a = 0;
        lVar.f2674b = 0;
        this.f8880j = -9223372036854775807L;
        S0.g gVar = this.f8875e;
        if (gVar.i() > 0) {
            W.a.e(gVar.i() > 0);
            while (gVar.i() > 1) {
                gVar.f();
            }
            Object f4 = gVar.f();
            f4.getClass();
            gVar.a(0L, (Long) f4);
        }
        d0 d0Var = this.f8877g;
        S0.g gVar2 = this.f8874d;
        if (d0Var != null) {
            gVar2.c();
            return;
        }
        if (gVar2.i() > 0) {
            W.a.e(gVar2.i() > 0);
            while (gVar2.i() > 1) {
                gVar2.f();
            }
            Object f5 = gVar2.f();
            f5.getClass();
            this.f8877g = (d0) f5;
        }
    }
}
