package p025F1;

/* renamed from: F1.f */
/* loaded from: classes.dex */
public final class C0214f implements p047L2.InterfaceC0388r {

    /* renamed from: m */
    public static p025F1.C0214f f607m;

    /* renamed from: l */
    public final java.util.concurrent.CopyOnWriteArrayList f608l = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b */
    public static p025F1.InterfaceC0216h m577b(android.content.Context context, boolean z4, p025F1.C0218j c0218j) {
        if (z4) {
            return new p025F1.C0217i(context, c0218j);
        }
        try {
            if (p046L1.C0360d.f1104c.m811b(context, p046L1.AbstractC0361e.f1105a) == 0) {
                return new p025F1.C0213e(context, c0218j);
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        return new p025F1.C0217i(context, c0218j);
    }

    @Override // p047L2.InterfaceC0388r
    /* renamed from: a */
    public final boolean mo578a(int i4, int i5, android.content.Intent intent) {
        java.util.Iterator it = this.f608l.iterator();
        while (it.hasNext()) {
            if (((p025F1.InterfaceC0216h) it.next()).mo573c(i4, i5)) {
                return true;
            }
        }
        return false;
    }
}
