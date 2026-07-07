package p219z;

/* renamed from: z.e */
/* loaded from: classes.dex */
public final class C2434e implements p006B.InterfaceC0018a {

    /* renamed from: a */
    public final /* synthetic */ int f9565a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f9566b;

    public /* synthetic */ C2434e(int i4, java.lang.Object obj) {
        this.f9565a = i4;
        this.f9566b = obj;
    }

    @Override // p006B.InterfaceC0018a
    public final void accept(java.lang.Object obj) {
        switch (this.f9565a) {
            case 0:
                p219z.C2435f c2435f = (p219z.C2435f) obj;
                if (c2435f == null) {
                    c2435f = new p219z.C2435f(-3);
                }
                ((p200u3.C2259m) this.f9566b).m4448b(c2435f);
                return;
            default:
                p219z.C2435f c2435f2 = (p219z.C2435f) obj;
                synchronized (p219z.AbstractC2436g.f9571c) {
                    try {
                        p165n.C1883j c1883j = p219z.AbstractC2436g.f9572d;
                        java.util.ArrayList arrayList = (java.util.ArrayList) c1883j.get((java.lang.String) this.f9566b);
                        if (arrayList == null) {
                            return;
                        }
                        c1883j.remove((java.lang.String) this.f9566b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((p006B.InterfaceC0018a) arrayList.get(i4)).accept(c2435f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
