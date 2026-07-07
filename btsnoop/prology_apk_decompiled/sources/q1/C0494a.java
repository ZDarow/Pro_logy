package q1;

import android.app.Activity;
import java.lang.reflect.Proxy;
import k3.e;
import k3.h;
import r1.c;
import r1.d;
import w1.C0601b;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f7941a;

    public /* synthetic */ C0494a(ClassLoader classLoader) {
        this.f7941a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, C0601b c0601b) {
        c cVar = new c(eVar, c0601b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f7941a, new Class[]{b()}, cVar);
        h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f7941a.loadClass("java.util.function.Consumer");
        h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
