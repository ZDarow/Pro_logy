package p190s2;

/* renamed from: s2.h */
/* loaded from: classes.dex */
public final class C2148h implements p047L2.InterfaceC0386p {

    /* renamed from: a */
    public final /* synthetic */ int f8561a;

    /* renamed from: b */
    public final /* synthetic */ p064Q.AbstractC0541m f8562b;

    public /* synthetic */ C2148h(p064Q.AbstractC0541m abstractC0541m, int i4) {
        this.f8561a = i4;
        this.f8562b = abstractC0541m;
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: a */
    public final void mo741a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        switch (this.f8561a) {
            case 0:
                this.f8562b.m1053d(new android.os.Bundle());
                throw null;
            case 1:
                this.f8562b.m1053d(new android.os.Bundle());
                throw null;
            default:
                ((p064Q.C0533e) this.f8562b).m1053d(new android.os.Bundle());
                throw null;
        }
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: b */
    public final void mo742b(java.lang.Object obj) {
        switch (this.f8561a) {
            case 0:
                java.util.List list = (java.util.List) ((java.util.Map) obj).get("children");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(p190s2.C2151k.m4268i((java.util.Map) it.next()));
                }
                this.f8562b.m1054e(arrayList);
                return;
            case 1:
                java.util.Map map = (java.util.Map) ((java.util.Map) obj).get("mediaItem");
                p064Q.AbstractC0541m abstractC0541m = this.f8562b;
                if (map != null) {
                    abstractC0541m.m1054e(p190s2.C2151k.m4268i(map));
                    return;
                } else {
                    abstractC0541m.m1054e(null);
                    return;
                }
            default:
                java.util.List list2 = (java.util.List) ((java.util.Map) obj).get("mediaItems");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(p190s2.C2151k.m4268i((java.util.Map) it2.next()));
                }
                ((p064Q.C0533e) this.f8562b).m1054e(arrayList2);
                return;
        }
    }

    @Override // p047L2.InterfaceC0386p
    /* renamed from: c */
    public final void mo743c() {
        switch (this.f8561a) {
            case 0:
                this.f8562b.m1053d(new android.os.Bundle());
                throw null;
            case 1:
                this.f8562b.m1053d(new android.os.Bundle());
                throw null;
            default:
                ((p064Q.C0533e) this.f8562b).m1053d(new android.os.Bundle());
                throw null;
        }
    }
}
