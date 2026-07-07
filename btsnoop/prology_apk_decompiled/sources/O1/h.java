package O1;

import c2.C0219a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0062b {

    /* renamed from: b, reason: collision with root package name */
    public static h f1444b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f1445c = new i(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f1446a;

    public /* synthetic */ h(Object obj) {
        this.f1446a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [O1.h, java.lang.Object] */
    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f1444b == null) {
                    f1444b = new Object();
                }
                hVar = f1444b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // O1.InterfaceC0062b
    public void a(L1.a aVar) {
        boolean z4 = aVar.f1055m == 0;
        C0219a c0219a = (C0219a) this.f1446a;
        if (z4) {
            c0219a.g(null, c0219a.f4749H);
            return;
        }
        h hVar = c0219a.f4762z;
        if (hVar != null) {
            ((M1.h) hVar.f1446a).f0(aVar);
        }
    }
}
