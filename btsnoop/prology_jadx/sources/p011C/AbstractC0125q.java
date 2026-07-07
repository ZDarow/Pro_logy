package p011C;

/* renamed from: C.q */
/* loaded from: classes.dex */
public abstract class AbstractC0125q {
    /* renamed from: a */
    public static android.view.WindowInsets m442a(android.view.View view, android.view.WindowInsets windowInsets) {
        int i4 = p011C.AbstractC0133y.f338a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static void m443b(android.view.View view) {
        view.requestApplyInsets();
    }
}
