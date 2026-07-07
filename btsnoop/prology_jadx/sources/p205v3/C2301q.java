package p205v3;

/* renamed from: v3.q */
/* loaded from: classes.dex */
public final class C2301q extends p154k3.AbstractC1804i implements p149j3.InterfaceC1741p {

    /* renamed from: m */
    public final /* synthetic */ p205v3.C2298n f9095m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301q(p205v3.C2298n c2298n) {
        super(2);
        this.f9095m = c2298n;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        p110b3.InterfaceC1193g interfaceC1193g = (p110b3.InterfaceC1193g) obj2;
        p110b3.InterfaceC1194h key = interfaceC1193g.getKey();
        p110b3.InterfaceC1193g mo678j = this.f9095m.f9089p.mo678j(key);
        if (key != p187r3.C2129t.f8496m) {
            return java.lang.Integer.valueOf(interfaceC1193g != mo678j ? Integer.MIN_VALUE : intValue + 1);
        }
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) mo678j;
        p187r3.InterfaceC2088P interfaceC2088P2 = (p187r3.InterfaceC2088P) interfaceC1193g;
        while (true) {
            if (interfaceC2088P2 != null) {
                if (interfaceC2088P2 == interfaceC2088P || !(interfaceC2088P2 instanceof p209w3.C2358t)) {
                    break;
                }
                p187r3.InterfaceC2114i interfaceC2114i = (p187r3.InterfaceC2114i) p187r3.C2097Z.f8460m.get((p187r3.C2097Z) interfaceC2088P2);
                interfaceC2088P2 = interfaceC2114i != null ? interfaceC2114i.getParent() : null;
            } else {
                interfaceC2088P2 = null;
                break;
            }
        }
        if (interfaceC2088P2 == interfaceC2088P) {
            if (interfaceC2088P != null) {
                intValue++;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC2088P2 + ", expected child of " + interfaceC2088P + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
