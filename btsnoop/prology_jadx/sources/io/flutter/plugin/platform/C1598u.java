package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.u */
/* loaded from: classes.dex */
public final class C1598u implements io.flutter.view.InterfaceC1617n {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugin.platform.C1599v f6643a;

    public C1598u(io.flutter.plugin.platform.C1599v c1599v) {
        this.f6643a = c1599v;
    }

    @Override // io.flutter.view.InterfaceC1617n
    public final void onTrimMemory(int i4) {
        if (i4 != 80 || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f6643a.f6649q = true;
    }
}
