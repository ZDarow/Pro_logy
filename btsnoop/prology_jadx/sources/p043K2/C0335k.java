package p043K2;

/* renamed from: K2.k */
/* loaded from: classes.dex */
public final class C0335k implements p047L2.InterfaceC0386p {

    /* renamed from: a */
    public final /* synthetic */ int f1035a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f1036b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f1037c;

    public /* synthetic */ C0335k(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f1035a = i4;
        this.f1037c = obj;
        this.f1036b = obj2;
    }

    /* renamed from: d */
    private final void m740d() {
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: a */
    public final void mo741a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        switch (this.f1035a) {
            case 0:
                android.util.Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((p018D2.C0181g) this.f1036b).mo289a(((p047L2.InterfaceC0387q) ((p035I.C0291m) ((p008B1.C0026d) this.f1037c).f100n).f878n).mo838f(str, str2, obj));
                return;
        }
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: b */
    public final void mo742b(java.lang.Object obj) {
        switch (this.f1035a) {
            case 0:
                ((p043K2.C0336l) this.f1037c).f1039b = (byte[]) this.f1036b;
                return;
            default:
                ((p018D2.C0181g) this.f1036b).mo289a(((p047L2.InterfaceC0387q) ((p035I.C0291m) ((p008B1.C0026d) this.f1037c).f100n).f878n).mo834b(obj));
                return;
        }
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: c */
    public final void mo743c() {
        switch (this.f1035a) {
            case 0:
                return;
            default:
                ((p018D2.C0181g) this.f1036b).mo289a(null);
                return;
        }
    }
}
