package p122e0;

/* renamed from: e0.l */
/* loaded from: classes.dex */
public final class C1311l extends p122e0.AbstractC1312m {

    /* renamed from: q */
    public final p122e0.C1309j f5263q;

    /* renamed from: r */
    public final p043K2.C0339o f5264r;

    public C1311l(long j4, p076T.C0702p c0702p, p129f2.AbstractC1393I abstractC1393I, p122e0.C1317r c1317r, java.util.ArrayList arrayList) {
        super(c0702p, abstractC1393I, c1317r, arrayList);
        android.net.Uri.parse(((p122e0.C1301b) abstractC1393I.get(0)).f5213a);
        long j5 = c1317r.f5283e;
        p122e0.C1309j c1309j = j5 <= 0 ? null : new p122e0.C1309j(c1317r.f5282d, j5, null);
        this.f5263q = c1309j;
        this.f5264r = c1309j == null ? new p043K2.C0339o(25, new p122e0.C1309j(0L, -1L, null)) : null;
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: b */
    public final java.lang.String mo3067b() {
        return null;
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: d */
    public final p117d0.InterfaceC1264h mo3068d() {
        return this.f5264r;
    }

    @Override // p122e0.AbstractC1312m
    /* renamed from: e */
    public final p122e0.C1309j mo3069e() {
        return this.f5263q;
    }
}
