package p209w3;

/* renamed from: w3.x */
/* loaded from: classes.dex */
public final class C2362x extends p154k3.AbstractC1804i implements p149j3.InterfaceC1741p {

    /* renamed from: n */
    public static final p209w3.C2362x f9311n = new p209w3.C2362x(2, 0);

    /* renamed from: o */
    public static final p209w3.C2362x f9312o = new p209w3.C2362x(2, 1);

    /* renamed from: p */
    public static final p209w3.C2362x f9313p = new p209w3.C2362x(2, 2);

    /* renamed from: m */
    public final /* synthetic */ int f9314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2362x(int i4, int i5) {
        super(i4);
        this.f9314m = i5;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f9314m) {
            case 0:
                p110b3.InterfaceC1193g interfaceC1193g = (p110b3.InterfaceC1193g) obj2;
                if (!(interfaceC1193g instanceof p187r3.InterfaceC2111g0)) {
                    return obj;
                }
                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC1193g : java.lang.Integer.valueOf(intValue + 1);
            case 1:
                p187r3.InterfaceC2111g0 interfaceC2111g0 = (p187r3.InterfaceC2111g0) obj;
                p110b3.InterfaceC1193g interfaceC1193g2 = (p110b3.InterfaceC1193g) obj2;
                if (interfaceC2111g0 != null) {
                    return interfaceC2111g0;
                }
                if (interfaceC1193g2 instanceof p187r3.InterfaceC2111g0) {
                    return (p187r3.InterfaceC2111g0) interfaceC1193g2;
                }
                return null;
            default:
                return (p209w3.C2364z) obj;
        }
    }
}
