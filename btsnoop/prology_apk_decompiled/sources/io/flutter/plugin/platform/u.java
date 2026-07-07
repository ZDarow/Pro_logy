package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes.dex */
public final class u implements io.flutter.view.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6404a;

    public u(v vVar) {
        this.f6404a = vVar;
    }

    @Override // io.flutter.view.n
    public final void onTrimMemory(int i4) {
        if (i4 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f6404a.f6410q = true;
    }
}
