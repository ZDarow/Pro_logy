package w3;

import b3.InterfaceC0193g;
import r3.g0;

/* loaded from: classes.dex */
public final class x extends k3.i implements j3.p {

    /* renamed from: n, reason: collision with root package name */
    public static final x f8952n = new x(2, 0);

    /* renamed from: o, reason: collision with root package name */
    public static final x f8953o = new x(2, 1);

    /* renamed from: p, reason: collision with root package name */
    public static final x f8954p = new x(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i4, int i5) {
        super(i4);
        this.f8955m = i5;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f8955m) {
            case 0:
                InterfaceC0193g interfaceC0193g = (InterfaceC0193g) obj2;
                if (!(interfaceC0193g instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0193g : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                InterfaceC0193g interfaceC0193g2 = (InterfaceC0193g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (interfaceC0193g2 instanceof g0) {
                    return (g0) interfaceC0193g2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
