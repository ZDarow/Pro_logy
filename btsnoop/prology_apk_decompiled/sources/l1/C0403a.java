package l1;

import B2.AbstractC0007h;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import k3.h;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7121a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7122b;

    public /* synthetic */ C0403a(int i4, Object obj) {
        this.f7121a = i4;
        this.f7122b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, l1.d] */
    @Override // androidx.lifecycle.j
    public final void a(k kVar, e eVar) {
        switch (this.f7121a) {
            case 0:
                if (eVar != e.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                m b4 = kVar.b();
                b4.c("removeObserver");
                b4.f4163b.b(this);
                Bundle a4 = this.f7122b.a().a("androidx.savedstate.Restarter");
                if (a4 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a4.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, C0403a.class.getClassLoader()).asSubclass(InterfaceC0405c.class);
                        h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                h.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e4) {
                                throw new RuntimeException(AbstractC0007h.l("Failed to instantiate ", next), e4);
                            }
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException("Class " + next + " wasn't found", e6);
                    }
                }
                return;
            default:
                if (eVar != e.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + eVar).toString());
                }
                m b5 = kVar.b();
                b5.c("removeObserver");
                b5.f4163b.b(this);
                v vVar = (v) this.f7122b;
                if (vVar.f4187b) {
                    return;
                }
                Bundle a5 = vVar.f4186a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = vVar.f4188c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a5 != null) {
                    bundle.putAll(a5);
                }
                vVar.f4188c = bundle;
                vVar.f4187b = true;
                return;
        }
    }
}
