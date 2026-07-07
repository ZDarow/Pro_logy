package r1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import k3.q;
import k3.s;
import w1.C0601b;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final k3.e f8074a;

    /* renamed from: b, reason: collision with root package name */
    public final C0601b f8075b;

    public c(k3.e eVar, C0601b c0601b) {
        this.f8074a = eVar;
        this.f8075b = c0601b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String f4;
        k3.h.e(obj, "obj");
        k3.h.e(method, "method");
        boolean a4 = k3.h.a(method.getName(), "accept");
        C0601b c0601b = this.f8075b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str = null;
        if (!a4 || objArr == null || objArr.length != 1) {
            if ((k3.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((k3.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(c0601b.hashCode());
            }
            if (k3.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c0601b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f8074a.f7095a;
        k3.h.e(cls, "jClass");
        Map map = k3.e.f7094b;
        k3.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = s.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? U1.a.q(q.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            k3.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0601b.b(obj2);
            return Z2.g.f3186a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (f4 = k3.h.f(componentType.getName())) != null) {
                    str = f4.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = k3.h.f(cls.getName());
                if (str == null) {
                    str = cls.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
