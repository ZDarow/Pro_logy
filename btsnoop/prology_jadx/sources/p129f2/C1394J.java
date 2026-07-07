package p129f2;

/* renamed from: f2.J */
/* loaded from: classes.dex */
public class C1394J extends p129f2.AbstractC1440p implements java.io.Serializable {

    /* renamed from: o */
    public final transient p129f2.C1425h0 f5705o;

    public C1394J(p129f2.C1425h0 c1425h0, int i4) {
        this.f5705o = c1425h0;
    }

    @Override // p129f2.AbstractC1438o
    /* renamed from: b */
    public final boolean mo3171b(java.lang.Object obj) {
        return obj != null && super.mo3171b(obj);
    }

    @Override // p129f2.AbstractC1438o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public p129f2.C1425h0 mo3142a() {
        return this.f5705o;
    }

    /* renamed from: d */
    public final p129f2.AbstractC1393I m3172d(java.lang.String str) {
        p129f2.AbstractC1393I abstractC1393I = (p129f2.AbstractC1393I) this.f5705o.get(str);
        if (abstractC1393I != null) {
            return abstractC1393I;
        }
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        return p129f2.C1415c0.f5744p;
    }

    /* renamed from: e */
    public final p129f2.AbstractC1397M m3173e() {
        return this.f5705o.keySet();
    }
}
