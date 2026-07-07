package p154k3;

/* renamed from: k3.e */
/* loaded from: classes.dex */
public final class C1800e implements p173o3.InterfaceC1932b, p154k3.InterfaceC1799d {

    /* renamed from: b */
    public static final java.util.Map f7363b;

    /* renamed from: a */
    public final java.lang.Class f7364a;

    static {
        java.util.List m2056d0 = p105a3.AbstractC1022e.m2056d0(p149j3.InterfaceC1726a.class, p149j3.InterfaceC1737l.class, p149j3.InterfaceC1741p.class, p149j3.InterfaceC1742q.class, p149j3.InterfaceC1743r.class, p149j3.InterfaceC1744s.class, p149j3.InterfaceC1745t.class, p149j3.InterfaceC1746u.class, p149j3.InterfaceC1747v.class, p149j3.InterfaceC1748w.class, p149j3.InterfaceC1727b.class, p149j3.InterfaceC1728c.class, p149j3.InterfaceC1729d.class, p149j3.InterfaceC1730e.class, p149j3.InterfaceC1731f.class, p149j3.InterfaceC1732g.class, p149j3.InterfaceC1733h.class, p149j3.InterfaceC1734i.class, p149j3.InterfaceC1735j.class, p149j3.InterfaceC1736k.class, p149j3.InterfaceC1738m.class, p149j3.InterfaceC1739n.class, p149j3.InterfaceC1740o.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(m2056d0.size());
        int i4 = 0;
        for (java.lang.Object obj : m2056d0) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new java.lang.ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new p100Z2.C0929b((java.lang.Class) obj, java.lang.Integer.valueOf(i4)));
            i4 = i5;
        }
        java.util.Map map = p105a3.C1030m.f3756l;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new java.util.LinkedHashMap(p105a3.AbstractC1032o.m2057Q(arrayList.size()));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p100Z2.C0929b c0929b = (p100Z2.C0929b) it.next();
                    map.put(c0929b.f3291l, c0929b.f3292m);
                }
            } else {
                p100Z2.C0929b c0929b2 = (p100Z2.C0929b) arrayList.get(0);
                p154k3.AbstractC1803h.m3779e(c0929b2, "pair");
                map = java.util.Collections.singletonMap(c0929b2.f3291l, c0929b2.f3292m);
                p154k3.AbstractC1803h.m3778d(map, "singletonMap(...)");
            }
        }
        f7363b = map;
    }

    public C1800e(java.lang.Class cls) {
        p154k3.AbstractC1803h.m3779e(cls, "jClass");
        this.f7364a = cls;
    }

    @Override // p154k3.InterfaceC1799d
    /* renamed from: a */
    public final java.lang.Class mo3773a() {
        return this.f7364a;
    }

    /* renamed from: b */
    public final java.lang.String m3774b() {
        java.lang.String m3782h;
        java.lang.Class cls = this.f7364a;
        p154k3.AbstractC1803h.m3779e(cls, "jClass");
        java.lang.String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                java.lang.String m3782h2 = p154k3.AbstractC1803h.m3782h(cls.getName());
                return m3782h2 == null ? cls.getSimpleName() : m3782h2;
            }
            java.lang.Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (m3782h = p154k3.AbstractC1803h.m3782h(componentType.getName())) != null) {
                str = m3782h.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return p182q3.AbstractC2032i.m4083q0(simpleName, enclosingMethod.getName() + '$');
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return p182q3.AbstractC2032i.m4083q0(simpleName, enclosingConstructor.getName() + '$');
        }
        int m4077k0 = p182q3.AbstractC2032i.m4077k0(simpleName, '$', false, 6);
        if (m4077k0 == -1) {
            return simpleName;
        }
        java.lang.String substring = simpleName.substring(m4077k0 + 1, simpleName.length());
        p154k3.AbstractC1803h.m3778d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p154k3.C1800e) && p080U1.AbstractC0748a.m1382q(this).equals(p080U1.AbstractC0748a.m1382q((p173o3.InterfaceC1932b) obj));
    }

    public final int hashCode() {
        return p080U1.AbstractC0748a.m1382q(this).hashCode();
    }

    public final java.lang.String toString() {
        return this.f7364a + " (Kotlin reflection is not available)";
    }
}
