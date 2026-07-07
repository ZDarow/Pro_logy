package w3;

import b3.InterfaceC0195i;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class e implements InterfaceC0533u {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0195i f8918l;

    public e(InterfaceC0195i interfaceC0195i) {
        this.f8918l = interfaceC0195i;
    }

    @Override // r3.InterfaceC0533u
    public final InterfaceC0195i h() {
        return this.f8918l;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f8918l + ')';
    }
}
