package p177p3;

/* renamed from: p3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1955c extends p177p3.AbstractC1956d {
    /* renamed from: d0 */
    public static java.util.List m3961d0(p177p3.InterfaceC1954b interfaceC1954b) {
        java.util.Iterator it = interfaceC1954b.iterator();
        if (!it.hasNext()) {
            return p105a3.C1029l.f3755l;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return p176p1.AbstractC1949a.m3904E(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
