package r3;

import b3.InterfaceC0193g;
import b3.InterfaceC0195i;

/* renamed from: r3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529p extends k3.i implements j3.p {

    /* renamed from: n, reason: collision with root package name */
    public static final C0529p f8170n = new C0529p(2, 0);

    /* renamed from: o, reason: collision with root package name */
    public static final C0529p f8171o = new C0529p(2, 1);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0529p(int i4, int i5) {
        super(i4);
        this.f8172m = i5;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f8172m) {
            case 0:
                return ((InterfaceC0195i) obj).c((InterfaceC0193g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC0195i) obj).c((InterfaceC0193g) obj2);
        }
    }
}
