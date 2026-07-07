package a3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static final void e0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, j3.l lVar) {
        k3.h.e(collection, "<this>");
        k3.h.e(charSequence, "separator");
        k3.h.e(charSequence2, "prefix");
        k3.h.e(charSequence3, "postfix");
        k3.h.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.b(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        if (i4 >= 0 && i5 > i4) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String f0(Collection collection, String str, String str2, String str3, j3.l lVar, int i4) {
        String str4 = (i4 & 2) != 0 ? "" : str2;
        String str5 = (i4 & 4) != 0 ? "" : str3;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        k3.h.e(collection, "<this>");
        k3.h.e(str4, "prefix");
        k3.h.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        e0(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static final void g0(Iterable iterable, AbstractCollection abstractCollection) {
        k3.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List h0(Iterable iterable) {
        ArrayList arrayList;
        k3.h.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        l lVar = l.f3631l;
        if (z4) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lVar;
            }
            if (size != 1) {
                return i0(collection);
            }
            return AbstractC0462a.E(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z4) {
            arrayList = i0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            g0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : AbstractC0462a.E(arrayList.get(0)) : lVar;
    }

    public static ArrayList i0(Collection collection) {
        k3.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set j0(Collection collection) {
        k3.h.e(collection, "<this>");
        n nVar = n.f3633l;
        int size = collection.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o.Q(collection.size()));
            g0(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        k3.h.d(singleton, "singleton(...)");
        return singleton;
    }
}
