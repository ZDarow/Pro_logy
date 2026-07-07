package p185r1;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public final class C2060c implements java.lang.reflect.InvocationHandler {

    /* renamed from: a */
    public final p154k3.C1800e f8389a;

    /* renamed from: b */
    public final p207w1.C2330b f8390b;

    public C2060c(p154k3.C1800e c1800e, p207w1.C2330b c2330b) {
        this.f8389a = c1800e;
        this.f8390b = c2330b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean isInstance;
        java.lang.String m3780f;
        p154k3.AbstractC1803h.m3779e(obj, "obj");
        p154k3.AbstractC1803h.m3779e(method, "method");
        boolean m3775a = p154k3.AbstractC1803h.m3775a(method.getName(), "accept");
        p207w1.C2330b c2330b = this.f8390b;
        r2 = null;
        r2 = null;
        r2 = null;
        java.lang.String str = null;
        if (!m3775a || objArr == null || objArr.length != 1) {
            if ((p154k3.AbstractC1803h.m3775a(method.getName(), "equals") && method.getReturnType().equals(java.lang.Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return java.lang.Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((p154k3.AbstractC1803h.m3775a(method.getName(), "hashCode") && method.getReturnType().equals(java.lang.Integer.TYPE) && objArr == null) == true) {
                return java.lang.Integer.valueOf(c2330b.hashCode());
            }
            if (p154k3.AbstractC1803h.m3775a(method.getName(), "toString") && method.getReturnType().equals(java.lang.String.class) && objArr == null) {
                return c2330b.toString();
            }
            throw new java.lang.UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        java.lang.Object obj2 = objArr[0];
        java.lang.Class cls = this.f8389a.f7364a;
        p154k3.AbstractC1803h.m3779e(cls, "jClass");
        java.util.Map map = p154k3.C1800e.f7363b;
        p154k3.AbstractC1803h.m3777c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        java.lang.Integer num = (java.lang.Integer) map.get(cls);
        if (num != null) {
            isInstance = p154k3.AbstractC1814s.m3790b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? p080U1.AbstractC0748a.m1382q(p154k3.AbstractC1812q.m3788a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c2330b.mo661b(obj2);
            return p100Z2.C0934g.f3298a;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                java.lang.Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (m3780f = p154k3.AbstractC1803h.m3780f(componentType.getName())) != null) {
                    str = m3780f.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = p154k3.AbstractC1803h.m3780f(cls.getName());
                if (str == null) {
                    str = cls.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new java.lang.ClassCastException(sb.toString());
    }
}
