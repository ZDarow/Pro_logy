package I;

import java.util.LinkedHashSet;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045n extends k3.i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f852n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0045n(Q q4, int i4) {
        super(0);
        this.f851m = i4;
        this.f852n = q4;
    }

    @Override // j3.a
    public final Object c() {
        switch (this.f851m) {
            case 0:
                return ((K.i) this.f852n.f779u.a()).f927c;
            default:
                K.f fVar = this.f852n.f771l;
                String n4 = ((B3.l) fVar.f913d.a()).f251l.n();
                synchronized (K.f.f909f) {
                    LinkedHashSet linkedHashSet = K.f.f908e;
                    if (linkedHashSet.contains(n4)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + n4 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(n4);
                }
                return new K.i(fVar.f910a, (B3.l) fVar.f913d.a(), (a0) fVar.f911b.h((B3.l) fVar.f913d.a(), fVar.f910a), new K.e(fVar, 1));
        }
    }
}
