package d3;

import b3.C0191e;
import b3.InterfaceC0190d;
import b3.InterfaceC0193g;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.h;
import p1.AbstractC0462a;
import r3.C0519f;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0190d, c, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0190d f4988l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0195i f4989m;

    /* renamed from: n, reason: collision with root package name */
    public transient InterfaceC0190d f4990n;

    public b(InterfaceC0190d interfaceC0190d, InterfaceC0195i interfaceC0195i) {
        this.f4988l = interfaceC0190d;
        this.f4989m = interfaceC0195i;
    }

    @Override // d3.c
    public c d() {
        InterfaceC0190d interfaceC0190d = this.f4988l;
        if (interfaceC0190d instanceof c) {
            return (c) interfaceC0190d;
        }
        return null;
    }

    @Override // b3.InterfaceC0190d
    public InterfaceC0195i f() {
        InterfaceC0195i interfaceC0195i = this.f4989m;
        h.b(interfaceC0195i);
        return interfaceC0195i;
    }

    public InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        InterfaceC0190d interfaceC0190d = this;
        while (true) {
            b bVar = (b) interfaceC0190d;
            InterfaceC0190d interfaceC0190d2 = bVar.f4988l;
            h.b(interfaceC0190d2);
            try {
                obj = bVar.k(obj);
                if (obj == EnumC0225a.f4710l) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0462a.s(th);
            }
            bVar.m();
            if (!(interfaceC0190d2 instanceof b)) {
                interfaceC0190d2.i(obj);
                return;
            }
            interfaceC0190d = interfaceC0190d2;
        }
    }

    public StackTraceElement j() {
        int i4;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v4 = dVar.v();
        if (v4 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i4 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i4 = -1;
        }
        int i5 = i4 >= 0 ? dVar.l()[i4] : -1;
        e eVar = f.f4995b;
        e eVar2 = f.f4994a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f4995b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f4995b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2 && (method = eVar.f4991a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = eVar.f4992b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = eVar.f4993c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i5);
    }

    public abstract Object k(Object obj);

    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0190d interfaceC0190d = this.f4990n;
        if (interfaceC0190d != null && interfaceC0190d != this) {
            InterfaceC0193g j4 = f().j(C0191e.f4461l);
            h.b(j4);
            w3.h hVar = (w3.h) interfaceC0190d;
            do {
                atomicReferenceFieldUpdater = w3.h.s;
            } while (atomicReferenceFieldUpdater.get(hVar) == w3.a.f8911d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0519f c0519f = obj instanceof C0519f ? (C0519f) obj : null;
            if (c0519f != null) {
                c0519f.r();
            }
        }
        this.f4990n = C0247a.f4987l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j4 = j();
        if (j4 == null) {
            j4 = getClass().getName();
        }
        sb.append(j4);
        return sb.toString();
    }

    public b(InterfaceC0190d interfaceC0190d) {
        this(interfaceC0190d, interfaceC0190d != null ? interfaceC0190d.f() : null);
    }
}
