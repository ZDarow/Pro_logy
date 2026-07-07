package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T0.j f6337b;

    public e(T0.j jVar, View view) {
        this.f6337b = jVar;
        this.f6336a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i4) {
        this.f6336a.post(new X2.i(i4, 3, this));
    }
}
