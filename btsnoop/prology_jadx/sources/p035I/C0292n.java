package p035I;

/* renamed from: I.n */
/* loaded from: classes.dex */
public final class C0292n extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public final /* synthetic */ int f880m;

    /* renamed from: n */
    public final /* synthetic */ p035I.C0265Q f881n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0292n(p035I.C0265Q c0265q, int i4) {
        super(0);
        this.f880m = i4;
        this.f881n = c0265q;
    }

    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        switch (this.f880m) {
            case 0:
                return ((p040K.C0319i) this.f881n.f800u.m1762a()).f964c;
            default:
                p040K.C0316f c0316f = this.f881n.f791l;
                java.lang.String m319n = ((p010B3.C0081l) c0316f.f948d.m1762a()).f256l.m319n();
                synchronized (p040K.C0316f.f944f) {
                    java.util.LinkedHashSet linkedHashSet = p040K.C0316f.f943e;
                    if (linkedHashSet.contains(m319n)) {
                        throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + m319n + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(m319n);
                }
                return new p040K.C0319i(c0316f.f945a, (p010B3.C0081l) c0316f.f948d.m1762a(), (p035I.C0275a0) c0316f.f946b.mo502h((p010B3.C0081l) c0316f.f948d.m1762a(), c0316f.f945a), new p040K.C0315e(c0316f, 1));
        }
    }
}
