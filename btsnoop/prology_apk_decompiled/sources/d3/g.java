package d3;

import b3.InterfaceC0190d;
import k3.h;
import k3.q;

/* loaded from: classes.dex */
public abstract class g extends b implements k3.f {

    /* renamed from: o, reason: collision with root package name */
    public final int f4996o;

    public g(int i4, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f4996o = i4;
    }

    @Override // k3.f
    public final int e() {
        return this.f4996o;
    }

    @Override // d3.b
    public final String toString() {
        if (this.f4988l != null) {
            return super.toString();
        }
        q.f7105a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
