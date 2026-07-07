package p208w2;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public final class C2335a extends p196u.AbstractC2212g {

    /* renamed from: m */
    public final java.util.Map f9260m;

    /* renamed from: n */
    public final p035I.C0291m f9261n;

    /* renamed from: o */
    public final boolean f9262o;

    /* JADX WARN: Type inference failed for: r0v1, types: [I.m, java.lang.Object] */
    public C2335a(java.util.Map map, boolean z4) {
        super(1);
        this.f9261n = new java.lang.Object();
        this.f9260m = map;
        this.f9262o = z4;
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: i */
    public final java.lang.Object mo4412i(java.lang.String str) {
        return this.f9260m.get(str);
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: j */
    public final java.lang.String mo4413j() {
        return (java.lang.String) this.f9260m.get("method");
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: k */
    public final boolean mo4414k() {
        return this.f9262o;
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: l */
    public final p208w2.InterfaceC2337c mo4415l() {
        return this.f9261n;
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: m */
    public final boolean mo4416m() {
        return this.f9260m.containsKey("transactionId");
    }

    /* renamed from: p */
    public final void m4536p(java.util.ArrayList arrayList) {
        if (this.f9262o) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        p035I.C0291m c0291m = this.f9261n;
        hashMap2.put("code", (java.lang.String) c0291m.f877m);
        hashMap2.put("message", (java.lang.String) c0291m.f878n);
        hashMap2.put("data", (java.util.HashMap) c0291m.f879o);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    /* renamed from: q */
    public final void m4537q(java.util.ArrayList arrayList) {
        if (this.f9262o) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", (java.io.Serializable) this.f9261n.f876l);
        arrayList.add(hashMap);
    }
}
