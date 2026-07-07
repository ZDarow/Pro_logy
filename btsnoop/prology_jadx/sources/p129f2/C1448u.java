package p129f2;

/* renamed from: f2.u */
/* loaded from: classes.dex */
public final class C1448u extends p129f2.AbstractC1434m {

    /* renamed from: l */
    public final java.lang.Object f5811l;

    /* renamed from: m */
    public int f5812m;

    /* renamed from: n */
    public final /* synthetic */ p129f2.C1449v f5813n;

    public C1448u(p129f2.C1449v c1449v, int i4) {
        this.f5813n = c1449v;
        java.lang.Object obj = p129f2.C1449v.f5814u;
        this.f5811l = c1449v.m3255j()[i4];
        this.f5812m = i4;
    }

    /* renamed from: a */
    public final void m3245a() {
        int i4 = this.f5812m;
        java.lang.Object obj = this.f5811l;
        p129f2.C1449v c1449v = this.f5813n;
        if (i4 != -1 && i4 < c1449v.size()) {
            if (p101a.AbstractC0936a.m1814v(obj, c1449v.m3255j()[this.f5812m])) {
                return;
            }
        }
        java.lang.Object obj2 = p129f2.C1449v.f5814u;
        this.f5812m = c1449v.m3250e(obj);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f5811l;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        p129f2.C1449v c1449v = this.f5813n;
        java.util.Map m3248c = c1449v.m3248c();
        if (m3248c != null) {
            return m3248c.get(this.f5811l);
        }
        m3245a();
        int i4 = this.f5812m;
        if (i4 == -1) {
            return null;
        }
        return c1449v.m3256k()[i4];
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        p129f2.C1449v c1449v = this.f5813n;
        java.util.Map m3248c = c1449v.m3248c();
        java.lang.Object obj2 = this.f5811l;
        if (m3248c != null) {
            return m3248c.put(obj2, obj);
        }
        m3245a();
        int i4 = this.f5812m;
        if (i4 == -1) {
            c1449v.put(obj2, obj);
            return null;
        }
        java.lang.Object obj3 = c1449v.m3256k()[i4];
        c1449v.m3256k()[this.f5812m] = obj;
        return obj3;
    }
}
