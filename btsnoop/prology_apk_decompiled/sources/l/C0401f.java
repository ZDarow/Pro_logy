package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0401f implements Iterable {

    /* renamed from: l, reason: collision with root package name */
    public C0398c f7117l;

    /* renamed from: m, reason: collision with root package name */
    public C0398c f7118m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f7119n = new WeakHashMap();

    /* renamed from: o, reason: collision with root package name */
    public int f7120o = 0;

    public C0398c a(Object obj) {
        C0398c c0398c = this.f7117l;
        while (c0398c != null && !c0398c.f7110l.equals(obj)) {
            c0398c = c0398c.f7112n;
        }
        return c0398c;
    }

    public Object b(Object obj) {
        C0398c a4 = a(obj);
        if (a4 == null) {
            return null;
        }
        this.f7120o--;
        WeakHashMap weakHashMap = this.f7119n;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0400e) it.next()).a(a4);
            }
        }
        C0398c c0398c = a4.f7113o;
        if (c0398c != null) {
            c0398c.f7112n = a4.f7112n;
        } else {
            this.f7117l = a4.f7112n;
        }
        C0398c c0398c2 = a4.f7112n;
        if (c0398c2 != null) {
            c0398c2.f7113o = c0398c;
        } else {
            this.f7118m = c0398c;
        }
        a4.f7112n = null;
        a4.f7113o = null;
        return a4.f7111m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((l.C0397b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof l.C0401f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.f r7 = (l.C0401f) r7
            int r1 = r6.f7120o
            int r3 = r7.f7120o
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.b r3 = (l.C0397b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.b r4 = (l.C0397b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.b r7 = (l.C0397b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0401f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (true) {
            C0397b c0397b = (C0397b) it;
            if (!c0397b.hasNext()) {
                return i4;
            }
            i4 += ((Map.Entry) c0397b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0397b c0397b = new C0397b(this.f7117l, this.f7118m, 0);
        this.f7119n.put(c0397b, Boolean.FALSE);
        return c0397b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0397b c0397b = (C0397b) it;
            if (!c0397b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0397b.next()).toString());
            if (c0397b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
