package C3;

import j3.p;
import java.io.IOException;
import k3.i;

/* loaded from: classes.dex */
public final class h extends i implements p {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B3.p f404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k3.p f405n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k3.p f406o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k3.p f407p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(B3.p pVar, k3.p pVar2, k3.p pVar3, k3.p pVar4) {
        super(2);
        this.f404m = pVar;
        this.f405n = pVar2;
        this.f406o = pVar3;
        this.f407p = pVar4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            B3.p pVar = this.f404m;
            pVar.f(1L);
            byte e4 = pVar.f258m.e();
            boolean z4 = (e4 & 1) == 1;
            boolean z5 = (e4 & 2) == 2;
            boolean z6 = (e4 & 4) == 4;
            long j4 = z4 ? 5L : 1L;
            if (z5) {
                j4 += 4;
            }
            if (z6) {
                j4 += 4;
            }
            if (longValue < j4) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z4) {
                this.f405n.f7104l = Long.valueOf(pVar.a() * 1000);
            }
            if (z5) {
                this.f406o.f7104l = Long.valueOf(pVar.a() * 1000);
            }
            if (z6) {
                this.f407p.f7104l = Long.valueOf(pVar.a() * 1000);
            }
        }
        return Z2.g.f3186a;
    }
}
