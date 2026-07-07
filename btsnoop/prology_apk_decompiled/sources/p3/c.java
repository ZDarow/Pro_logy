package p3;

import a3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List d0(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f3631l;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0462a.E(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
