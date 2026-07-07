package k3;

import j3.t;
import j3.u;
import j3.v;
import j3.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements o3.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7094b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f7095a;

    static {
        List d02 = a3.e.d0(j3.a.class, j3.l.class, j3.p.class, j3.q.class, j3.r.class, j3.s.class, t.class, u.class, v.class, w.class, j3.b.class, j3.c.class, j3.d.class, j3.e.class, j3.f.class, j3.g.class, j3.h.class, j3.i.class, j3.j.class, j3.k.class, j3.m.class, j3.n.class, j3.o.class);
        ArrayList arrayList = new ArrayList(d02.size());
        int i4 = 0;
        for (Object obj : d02) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new Z2.b((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        Map map = a3.m.f3632l;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(a3.o.Q(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Z2.b bVar = (Z2.b) it.next();
                    map.put(bVar.f3179l, bVar.f3180m);
                }
            } else {
                Z2.b bVar2 = (Z2.b) arrayList.get(0);
                h.e(bVar2, "pair");
                map = Collections.singletonMap(bVar2.f3179l, bVar2.f3180m);
                h.d(map, "singletonMap(...)");
            }
        }
        f7094b = map;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f7095a = cls;
    }

    @Override // k3.d
    public final Class a() {
        return this.f7095a;
    }

    public final String b() {
        String h4;
        Class cls = this.f7095a;
        h.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String h5 = h.h(cls.getName());
                return h5 == null ? cls.getSimpleName() : h5;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (h4 = h.h(componentType.getName())) != null) {
                str = h4.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return q3.i.q0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return q3.i.q0(simpleName, enclosingConstructor.getName() + '$');
        }
        int k02 = q3.i.k0(simpleName, '$', false, 6);
        if (k02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(k02 + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && U1.a.q(this).equals(U1.a.q((o3.b) obj));
    }

    public final int hashCode() {
        return U1.a.q(this).hashCode();
    }

    public final String toString() {
        return this.f7095a + " (Kotlin reflection is not available)";
    }
}
