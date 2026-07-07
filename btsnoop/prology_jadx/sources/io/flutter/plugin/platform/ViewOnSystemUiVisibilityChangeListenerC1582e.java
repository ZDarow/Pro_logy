package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.e */
/* loaded from: classes.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1582e implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f6571a;

    /* renamed from: b */
    public final /* synthetic */ p077T0.C0722j f6572b;

    public ViewOnSystemUiVisibilityChangeListenerC1582e(p077T0.C0722j c0722j, android.view.View view) {
        this.f6572b = c0722j;
        this.f6571a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i4) {
        this.f6571a.post(new p093X2.RunnableC0848i(i4, 3, this));
    }
}
