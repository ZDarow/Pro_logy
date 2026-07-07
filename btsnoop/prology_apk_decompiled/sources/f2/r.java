package f2;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class r {
    public static int b(int i4) {
        if (i4 < 3) {
            e("expectedSize", i4);
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) Math.ceil(i4 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(int i4, Object[] objArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC0007h.k("at index ", i5));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void e(String str, int i4) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }

    public static Object g(int i4) {
        if (i4 < 2 || i4 > 1073741824 || Integer.highestOneBit(i4) != i4) {
            throw new IllegalArgumentException(AbstractC0007h.k("must be power of 2 between 2^1 and 2^30: ", i4));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static m0 j(Set set, e2.g gVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof m0)) {
                set.getClass();
                return new m0(set, gVar);
            }
            m0 m0Var = (m0) set;
            e2.g gVar2 = m0Var.f5598m;
            gVar2.getClass();
            return new m0(m0Var.f5597l, new e2.h(Arrays.asList(gVar2, gVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof m0)) {
            set2.getClass();
            return new m0(set2, gVar);
        }
        m0 m0Var2 = (m0) set2;
        e2.g gVar3 = m0Var2.f5598m;
        gVar3.getClass();
        return new m0((SortedSet) m0Var2.f5597l, new e2.h(Arrays.asList(gVar3, gVar)));
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    public static l0 n(M m4, M m5) {
        if (m4 == null) {
            throw new NullPointerException("set1");
        }
        if (m5 != null) {
            return new l0(m4, m5);
        }
        throw new NullPointerException("set2");
    }

    public static int o(int i4, int i5, int i6) {
        return (i4 & (~i6)) | (i5 & i6);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e("arraySize", length);
        ArrayList arrayList = new ArrayList(AbstractC0110a.R(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        v(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = o(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = t(r9)
            r1 = r0 & r11
            int r2 = u(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = a.AbstractC0110a.v(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = a.AbstractC0110a.v(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            v(r1, r9, r12)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = o(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.r.q(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void r(List list, e2.g gVar, int i4, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            list.remove(i6);
        }
    }

    public static int s(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static int t(Object obj) {
        return s(obj == null ? 0 : obj.hashCode());
    }

    public static int u(int i4, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? ((short[]) obj)[i4] & 65535 : ((int[]) obj)[i4];
    }

    public static void v(int i4, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i5;
        } else {
            ((int[]) obj)[i4] = i5;
        }
    }

    public static AbstractList w(List list, e2.e eVar) {
        return list instanceof RandomAccess ? new S(list, eVar) : new T(list, eVar);
    }

    public Y a() {
        e("expectedValuesPerKey", 2);
        return new Y(0, this);
    }

    public abstract Map f();
}
