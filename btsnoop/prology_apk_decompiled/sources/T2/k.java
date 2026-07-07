package T2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements L2.g {

    /* renamed from: a, reason: collision with root package name */
    public L2.h f2448a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2449b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2450c = false;

    public final void a() {
        if (this.f2448a == null) {
            return;
        }
        ArrayList arrayList = this.f2449b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof i) {
                this.f2448a.a();
            } else if (next instanceof j) {
                j jVar = (j) next;
                this.f2448a.b(jVar.f2445a, jVar.f2446b, jVar.f2447c);
            } else {
                this.f2448a.c(next);
            }
        }
        arrayList.clear();
    }

    public final void b(Object obj) {
        if (!this.f2450c) {
            this.f2449b.add(obj);
        }
        a();
    }
}
