package V0;

import W.r;
import b0.C0177a;
import java.util.HashMap;
import q0.F;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements W.c, W.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2627m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2628n;

    public /* synthetic */ n(o oVar, long j4, int i4) {
        this.f2628n = oVar;
        this.f2627m = j4;
        this.f2626l = i4;
    }

    @Override // W.c
    public void accept(Object obj) {
        a aVar = (a) obj;
        o oVar = (o) this.f2628n;
        W.a.k(oVar.f2636h);
        byte[] t4 = F1.g.t(aVar.f2596a, aVar.f2598c);
        r rVar = oVar.f2631c;
        rVar.getClass();
        rVar.E(t4, t4.length);
        oVar.f2629a.a(rVar, t4.length, 0);
        long j4 = aVar.f2597b;
        long j5 = this.f2627m;
        if (j4 == -9223372036854775807L) {
            W.a.j(oVar.f2636h.f2330r == Long.MAX_VALUE);
        } else {
            long j6 = oVar.f2636h.f2330r;
            j5 = j6 == Long.MAX_VALUE ? j5 + j4 : j4 + j6;
        }
        oVar.f2629a.b(j5, this.f2626l, t4.length, 0, null);
    }

    @Override // W.h
    public void b(Object obj) {
        b0.j jVar = (b0.j) obj;
        jVar.getClass();
        C0177a c0177a = (C0177a) this.f2628n;
        F f4 = c0177a.f4329d;
        if (f4 != null) {
            String c4 = jVar.f4367b.c(c0177a.f4327b, f4);
            HashMap hashMap = jVar.f4373h;
            Long l4 = (Long) hashMap.get(c4);
            HashMap hashMap2 = jVar.f4372g;
            Long l5 = (Long) hashMap2.get(c4);
            hashMap.put(c4, Long.valueOf((l4 == null ? 0L : l4.longValue()) + this.f2627m));
            hashMap2.put(c4, Long.valueOf((l5 != null ? l5.longValue() : 0L) + this.f2626l));
        }
    }

    public /* synthetic */ n(C0177a c0177a, int i4, long j4, long j5) {
        this.f2628n = c0177a;
        this.f2626l = i4;
        this.f2627m = j4;
    }
}
