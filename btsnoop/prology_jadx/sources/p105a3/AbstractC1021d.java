package p105a3;

/* renamed from: a3.d */
/* loaded from: classes.dex */
public abstract class AbstractC1021d extends p105a3.AbstractC1027j {
    /* renamed from: e0 */
    public static final void m2050e0(java.util.Collection collection, java.lang.StringBuilder sb, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i4, java.lang.CharSequence charSequence4, p149j3.InterfaceC1737l interfaceC1737l) {
        p154k3.AbstractC1803h.m3779e(collection, "<this>");
        p154k3.AbstractC1803h.m3779e(charSequence, "separator");
        p154k3.AbstractC1803h.m3779e(charSequence2, "prefix");
        p154k3.AbstractC1803h.m3779e(charSequence3, "postfix");
        p154k3.AbstractC1803h.m3779e(charSequence4, "truncated");
        sb.append(charSequence2);
        java.util.Iterator it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (interfaceC1737l != null) {
                sb.append((java.lang.CharSequence) interfaceC1737l.mo661b(next));
            } else {
                if (next != null ? next instanceof java.lang.CharSequence : true) {
                    sb.append((java.lang.CharSequence) next);
                } else if (next instanceof java.lang.Character) {
                    sb.append(((java.lang.Character) next).charValue());
                } else {
                    sb.append((java.lang.CharSequence) next.toString());
                }
            }
        }
        if (i4 >= 0 && i5 > i4) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* renamed from: f0 */
    public static java.lang.String m2051f0(java.util.Collection collection, java.lang.String str, java.lang.String str2, java.lang.String str3, p149j3.InterfaceC1737l interfaceC1737l, int i4) {
        java.lang.String str4 = (i4 & 2) != 0 ? "" : str2;
        java.lang.String str5 = (i4 & 4) != 0 ? "" : str3;
        if ((i4 & 32) != 0) {
            interfaceC1737l = null;
        }
        p154k3.AbstractC1803h.m3779e(collection, "<this>");
        p154k3.AbstractC1803h.m3779e(str4, "prefix");
        p154k3.AbstractC1803h.m3779e(str5, "postfix");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        m2050e0(collection, sb, str, str4, str5, -1, "...", interfaceC1737l);
        return sb.toString();
    }

    /* renamed from: g0 */
    public static final void m2052g0(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        p154k3.AbstractC1803h.m3779e(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: h0 */
    public static java.util.List m2053h0(java.lang.Iterable iterable) {
        java.util.ArrayList arrayList;
        p154k3.AbstractC1803h.m3779e(iterable, "<this>");
        boolean z4 = iterable instanceof java.util.Collection;
        p105a3.C1029l c1029l = p105a3.C1029l.f3755l;
        if (z4) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c1029l;
            }
            if (size != 1) {
                return m2054i0(collection);
            }
            return p176p1.AbstractC1949a.m3904E(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        }
        if (z4) {
            arrayList = m2054i0((java.util.Collection) iterable);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            m2052g0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : p176p1.AbstractC1949a.m3904E(arrayList.get(0)) : c1029l;
    }

    /* renamed from: i0 */
    public static java.util.ArrayList m2054i0(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    /* renamed from: j0 */
    public static java.util.Set m2055j0(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "<this>");
        p105a3.C1031n c1031n = p105a3.C1031n.f3757l;
        int size = collection.size();
        if (size == 0) {
            return c1031n;
        }
        if (size != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p105a3.AbstractC1032o.m2057Q(collection.size()));
            m2052g0(collection, linkedHashSet);
            return linkedHashSet;
        }
        java.util.Set singleton = java.util.Collections.singleton(collection instanceof java.util.List ? ((java.util.List) collection).get(0) : collection.iterator().next());
        p154k3.AbstractC1803h.m3778d(singleton, "singleton(...)");
        return singleton;
    }
}
