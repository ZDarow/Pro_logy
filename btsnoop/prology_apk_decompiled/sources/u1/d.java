package u1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import k3.q;
import u.AbstractC0579g;

/* loaded from: classes.dex */
public final class d extends k3.i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f8576n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i4) {
        super(0);
        this.f8575m = i4;
        this.f8576n = eVar;
    }

    @Override // j3.a
    public final Object c() {
        boolean z4;
        Class cls;
        boolean z5;
        boolean z6;
        switch (this.f8575m) {
            case 0:
                Class<?> loadClass = this.f8576n.f8577a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                k3.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                k3.h.d(method, "getBoundsMethod");
                if (AbstractC0579g.g(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    k3.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0579g.g(method2, q.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        k3.h.d(method3, "getStateMethod");
                        if (AbstractC0579g.g(method3, q.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z4 = true;
                            return Boolean.valueOf(z4);
                        }
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 1:
                e eVar = this.f8576n;
                try {
                    cls = eVar.f8578b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f8577a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                k3.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                k3.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    k3.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z5 = true;
                        return Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Class<?> loadClass3 = this.f8576n.f8577a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                k3.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                k3.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    k3.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z6 = true;
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            default:
                e eVar2 = this.f8576n;
                Class<?> loadClass4 = eVar2.f8579c.f7941a.loadClass("androidx.window.extensions.WindowExtensions");
                k3.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f8577a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                k3.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                k3.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
