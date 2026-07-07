package p011C;

/* renamed from: C.s */
/* loaded from: classes.dex */
public abstract class AbstractC0127s {
    /* renamed from: a */
    public static p011C.C0105O m450a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        p011C.C0105O m396c = p011C.C0105O.m396c(null, rootWindowInsets);
        p011C.C0101K c0101k = m396c.f302a;
        c0101k.mo368p(m396c);
        c0101k.mo362d(view.getRootView());
        return m396c;
    }
}
