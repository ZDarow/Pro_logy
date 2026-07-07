package f2;

import java.io.Serializable;

/* loaded from: classes.dex */
public class J extends AbstractC0294p implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final transient h0 f5511o;

    public J(h0 h0Var, int i4) {
        this.f5511o = h0Var;
    }

    @Override // f2.AbstractC0293o
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // f2.AbstractC0293o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h0 a() {
        return this.f5511o;
    }

    public final I d(String str) {
        I i4 = (I) this.f5511o.get(str);
        if (i4 != null) {
            return i4;
        }
        G g4 = I.f5510m;
        return c0.f5550p;
    }

    public final M e() {
        return this.f5511o.keySet();
    }
}
