package p078T2;

/* renamed from: T2.k */
/* loaded from: classes.dex */
public final class C0734k implements p047L2.InterfaceC0377g {

    /* renamed from: a */
    public p047L2.C0378h f2535a;

    /* renamed from: b */
    public final java.util.ArrayList f2536b = new java.util.ArrayList();

    /* renamed from: c */
    public final boolean f2537c = false;

    /* renamed from: a */
    public final void m1320a() {
        if (this.f2535a == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f2536b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof p078T2.AbstractC0732i) {
                this.f2535a.m828a();
            } else if (next instanceof p078T2.C0733j) {
                p078T2.C0733j c0733j = (p078T2.C0733j) next;
                this.f2535a.m829b(c0733j.f2532a, c0733j.f2533b, c0733j.f2534c);
            } else {
                this.f2535a.m830c(next);
            }
        }
        arrayList.clear();
    }

    /* renamed from: b */
    public final void m1321b(java.lang.Object obj) {
        if (!this.f2537c) {
            this.f2536b.add(obj);
        }
        m1320a();
    }
}
