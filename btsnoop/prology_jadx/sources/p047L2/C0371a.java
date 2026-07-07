package p047L2;

/* renamed from: L2.a */
/* loaded from: classes.dex */
public final class C0371a implements p047L2.InterfaceC0375e {

    /* renamed from: a */
    public final /* synthetic */ int f1124a;

    /* renamed from: b */
    public final java.lang.Object f1125b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f1126c;

    public /* synthetic */ C0371a(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f1124a = i4;
        this.f1126c = obj;
        this.f1125b = obj2;
    }

    @Override // p047L2.InterfaceC0375e
    /* renamed from: a */
    public final void mo289a(java.nio.ByteBuffer byteBuffer) {
        switch (this.f1124a) {
            case 0:
                p035I.C0291m c0291m = (p035I.C0291m) this.f1126c;
                try {
                    ((p047L2.InterfaceC0373c) this.f1125b).mo106e(((p047L2.InterfaceC0383m) c0291m.f878n).mo831a(byteBuffer));
                    return;
                } catch (java.lang.RuntimeException e4) {
                    android.util.Log.e("BasicMessageChannel#" + ((java.lang.String) c0291m.f877m), "Failed to handle message reply", e4);
                    return;
                }
            default:
                p035I.C0291m c0291m2 = (p035I.C0291m) this.f1126c;
                p047L2.InterfaceC0386p interfaceC0386p = (p047L2.InterfaceC0386p) this.f1125b;
                try {
                    if (byteBuffer == null) {
                        interfaceC0386p.mo743c();
                    } else {
                        try {
                            interfaceC0386p.mo742b(((p047L2.InterfaceC0387q) c0291m2.f878n).mo836d(byteBuffer));
                        } catch (p047L2.C0380j e5) {
                            interfaceC0386p.mo741a(e5.f1129l, e5.getMessage(), e5.f1130m);
                        }
                    }
                    return;
                } catch (java.lang.RuntimeException e6) {
                    android.util.Log.e("MethodChannel#" + ((java.lang.String) c0291m2.f877m), "Failed to handle method call result", e6);
                    return;
                }
        }
    }
}
