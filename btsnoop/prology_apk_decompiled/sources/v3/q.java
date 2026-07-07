package v3;

import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import r3.C0532t;
import r3.InterfaceC0522i;
import r3.P;
import r3.Z;

/* loaded from: classes.dex */
public final class q extends k3.i implements j3.p {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f8740m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f8740m = nVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC0193g interfaceC0193g = (InterfaceC0193g) obj2;
        InterfaceC0194h key = interfaceC0193g.getKey();
        InterfaceC0193g j4 = this.f8740m.f8735p.j(key);
        if (key != C0532t.f8178m) {
            return Integer.valueOf(interfaceC0193g != j4 ? Integer.MIN_VALUE : intValue + 1);
        }
        P p2 = (P) j4;
        P p4 = (P) interfaceC0193g;
        while (true) {
            if (p4 != null) {
                if (p4 == p2 || !(p4 instanceof w3.t)) {
                    break;
                }
                InterfaceC0522i interfaceC0522i = (InterfaceC0522i) Z.f8143m.get((Z) p4);
                p4 = interfaceC0522i != null ? interfaceC0522i.getParent() : null;
            } else {
                p4 = null;
                break;
            }
        }
        if (p4 == p2) {
            if (p2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p4 + ", expected child of " + p2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
