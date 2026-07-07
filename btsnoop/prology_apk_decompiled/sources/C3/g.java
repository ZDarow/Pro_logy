package C3;

import j3.p;
import java.io.IOException;
import k3.i;
import k3.m;
import k3.o;

/* loaded from: classes.dex */
public final class g extends i implements p {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f399n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f400o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B3.p f401p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f402q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f403r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, long j4, o oVar, B3.p pVar, o oVar2, o oVar3) {
        super(2);
        this.f398m = mVar;
        this.f399n = j4;
        this.f400o = oVar;
        this.f401p = pVar;
        this.f402q = oVar2;
        this.f403r = oVar3;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            m mVar = this.f398m;
            if (mVar.f7101l) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            mVar.f7101l = true;
            if (longValue < this.f399n) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            o oVar = this.f400o;
            long j4 = oVar.f7103l;
            B3.p pVar = this.f401p;
            if (j4 == 4294967295L) {
                j4 = pVar.b();
            }
            oVar.f7103l = j4;
            o oVar2 = this.f402q;
            oVar2.f7103l = oVar2.f7103l == 4294967295L ? pVar.b() : 0L;
            o oVar3 = this.f403r;
            oVar3.f7103l = oVar3.f7103l == 4294967295L ? pVar.b() : 0L;
        }
        return Z2.g.f3186a;
    }
}
