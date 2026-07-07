package p120d3;

/* renamed from: d3.b */
/* loaded from: classes.dex */
public abstract class AbstractC1292b implements p110b3.InterfaceC1190d, p120d3.InterfaceC1293c, java.io.Serializable {

    /* renamed from: l */
    public final p110b3.InterfaceC1190d f5175l;

    /* renamed from: m */
    public final p110b3.InterfaceC1195i f5176m;

    /* renamed from: n */
    public transient p110b3.InterfaceC1190d f5177n;

    public AbstractC1292b(p110b3.InterfaceC1190d interfaceC1190d, p110b3.InterfaceC1195i interfaceC1195i) {
        this.f5175l = interfaceC1190d;
        this.f5176m = interfaceC1195i;
    }

    @Override // p120d3.InterfaceC1293c
    /* renamed from: d */
    public p120d3.InterfaceC1293c mo3030d() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f5175l;
        if (interfaceC1190d instanceof p120d3.InterfaceC1293c) {
            return (p120d3.InterfaceC1293c) interfaceC1190d;
        }
        return null;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public p110b3.InterfaceC1195i mo2835f() {
        p110b3.InterfaceC1195i interfaceC1195i = this.f5176m;
        p154k3.AbstractC1803h.m3776b(interfaceC1195i);
        return interfaceC1195i;
    }

    /* renamed from: g */
    public p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        p110b3.InterfaceC1190d interfaceC1190d = this;
        while (true) {
            p120d3.AbstractC1292b abstractC1292b = (p120d3.AbstractC1292b) interfaceC1190d;
            p110b3.InterfaceC1190d interfaceC1190d2 = abstractC1292b.f5175l;
            p154k3.AbstractC1803h.m3776b(interfaceC1190d2);
            try {
                obj = abstractC1292b.mo660k(obj);
                if (obj == p115c3.EnumC1252a.f4880l) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = p176p1.AbstractC1949a.m3942s(th);
            }
            abstractC1292b.m3032m();
            if (!(interfaceC1190d2 instanceof p120d3.AbstractC1292b)) {
                interfaceC1190d2.mo2836i(obj);
                return;
            }
            interfaceC1190d = interfaceC1190d2;
        }
    }

    /* renamed from: j */
    public java.lang.StackTraceElement mo3031j() {
        int i4;
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.Object invoke;
        java.lang.reflect.Method method2;
        java.lang.Object invoke2;
        p120d3.InterfaceC1294d interfaceC1294d = (p120d3.InterfaceC1294d) getClass().getAnnotation(p120d3.InterfaceC1294d.class);
        java.lang.String str2 = null;
        if (interfaceC1294d == null) {
            return null;
        }
        int m3037v = interfaceC1294d.m3037v();
        if (m3037v > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + m3037v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i4 = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i4 = -1;
        }
        int i5 = i4 >= 0 ? interfaceC1294d.m3035l()[i4] : -1;
        p120d3.C1295e c1295e = p120d3.AbstractC1296f.f5182b;
        p120d3.C1295e c1295e2 = p120d3.AbstractC1296f.f5181a;
        if (c1295e == null) {
            try {
                p120d3.C1295e c1295e3 = new p120d3.C1295e(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                p120d3.AbstractC1296f.f5182b = c1295e3;
                c1295e = c1295e3;
            } catch (java.lang.Exception unused2) {
                p120d3.AbstractC1296f.f5182b = c1295e2;
                c1295e = c1295e2;
            }
        }
        if (c1295e != c1295e2 && (method = c1295e.f5178a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = c1295e.f5179b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            java.lang.reflect.Method method3 = c1295e.f5180c;
            java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof java.lang.String) {
                str2 = (java.lang.String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC1294d.m3033c();
        } else {
            str = str2 + '/' + interfaceC1294d.m3033c();
        }
        return new java.lang.StackTraceElement(str, interfaceC1294d.m3036m(), interfaceC1294d.m3034f(), i5);
    }

    /* renamed from: k */
    public abstract java.lang.Object mo660k(java.lang.Object obj);

    /* renamed from: m */
    public void m3032m() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p110b3.InterfaceC1190d interfaceC1190d = this.f5177n;
        if (interfaceC1190d != null && interfaceC1190d != this) {
            p110b3.InterfaceC1193g mo678j = mo2835f().mo678j(p110b3.C1191e.f4622l);
            p154k3.AbstractC1803h.m3776b(mo678j);
            p209w3.C2346h c2346h = (p209w3.C2346h) interfaceC1190d;
            do {
                atomicReferenceFieldUpdater = p209w3.C2346h.f9279s;
            } while (atomicReferenceFieldUpdater.get(c2346h) == p209w3.AbstractC2339a.f9269d);
            java.lang.Object obj = atomicReferenceFieldUpdater.get(c2346h);
            p187r3.C2108f c2108f = obj instanceof p187r3.C2108f ? (p187r3.C2108f) obj : null;
            if (c2108f != null) {
                c2108f.m4229r();
            }
        }
        this.f5177n = p120d3.C1291a.f5174l;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object mo3031j = mo3031j();
        if (mo3031j == null) {
            mo3031j = getClass().getName();
        }
        sb.append(mo3031j);
        return sb.toString();
    }

    public AbstractC1292b(p110b3.InterfaceC1190d interfaceC1190d) {
        this(interfaceC1190d, interfaceC1190d != null ? interfaceC1190d.mo2835f() : null);
    }
}
