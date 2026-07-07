package p157l1;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C1822a implements androidx.lifecycle.InterfaceC1146j {

    /* renamed from: a */
    public final /* synthetic */ int f7391a;

    /* renamed from: b */
    public final java.lang.Object f7392b;

    public /* synthetic */ C1822a(int i4, java.lang.Object obj) {
        this.f7391a = i4;
        this.f7392b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, l1.d] */
    @Override // androidx.lifecycle.InterfaceC1146j
    /* renamed from: a */
    public final void mo2655a(androidx.lifecycle.InterfaceC1147k interfaceC1147k, androidx.lifecycle.EnumC1141e enumC1141e) {
        switch (this.f7391a) {
            case 0:
                if (enumC1141e != androidx.lifecycle.EnumC1141e.ON_CREATE) {
                    throw new java.lang.AssertionError("Next event must be ON_CREATE");
                }
                androidx.lifecycle.C1149m mo127b = interfaceC1147k.mo127b();
                mo127b.m2659c("removeObserver");
                mo127b.f4312b.mo3793b(this);
                android.os.Bundle m3611a = this.f7392b.mo986a().m3611a("androidx.savedstate.Restarter");
                if (m3611a == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = m3611a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new java.lang.IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    java.lang.String next = it.next();
                    try {
                        java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(next, false, p157l1.C1822a.class.getClassLoader()).asSubclass(p157l1.InterfaceC1824c.class);
                        p154k3.AbstractC1803h.m3778d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                p154k3.AbstractC1803h.m3778d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new java.lang.ClassCastException();
                            } catch (java.lang.Exception e4) {
                                throw new java.lang.RuntimeException(p009B2.AbstractC0051h.m153l("Failed to instantiate ", next), e4);
                            }
                        } catch (java.lang.NoSuchMethodException e5) {
                            throw new java.lang.IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (java.lang.ClassNotFoundException e6) {
                        throw new java.lang.RuntimeException("Class " + next + " wasn't found", e6);
                    }
                }
                return;
            default:
                if (enumC1141e != androidx.lifecycle.EnumC1141e.ON_CREATE) {
                    throw new java.lang.IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1141e).toString());
                }
                androidx.lifecycle.C1149m mo127b2 = interfaceC1147k.mo127b();
                mo127b2.m2659c("removeObserver");
                mo127b2.f4312b.mo3793b(this);
                androidx.lifecycle.C1158v c1158v = (androidx.lifecycle.C1158v) this.f7392b;
                if (c1158v.f4337b) {
                    return;
                }
                android.os.Bundle m3611a2 = c1158v.f4336a.m3611a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                android.os.Bundle bundle = new android.os.Bundle();
                android.os.Bundle bundle2 = c1158v.f4338c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (m3611a2 != null) {
                    bundle.putAll(m3611a2);
                }
                c1158v.f4338c = bundle;
                c1158v.f4337b = true;
                return;
        }
    }
}
