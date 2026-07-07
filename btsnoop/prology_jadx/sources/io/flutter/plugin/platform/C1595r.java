package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.r */
/* loaded from: classes.dex */
public final class C1595r extends android.content.ContextWrapper {

    /* renamed from: a */
    public final android.view.inputmethod.InputMethodManager f6636a;

    public C1595r(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
        super(context);
        this.f6636a = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.Context createDisplayContext(android.view.Display display) {
        return new io.flutter.plugin.platform.C1595r(super.createDisplayContext(display), this.f6636a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return "input_method".equals(str) ? this.f6636a : super.getSystemService(str);
    }
}
