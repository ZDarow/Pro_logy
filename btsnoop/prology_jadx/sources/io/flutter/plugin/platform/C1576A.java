package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.A */
/* loaded from: classes.dex */
public final class C1576A {

    /* renamed from: i */
    public static final io.flutter.plugin.platform.C1600w f6551i = new android.hardware.display.VirtualDisplay.Callback();

    /* renamed from: a */
    public io.flutter.plugin.platform.SingleViewPresentation f6552a;

    /* renamed from: b */
    public final android.app.Activity f6553b;

    /* renamed from: c */
    public final io.flutter.plugin.platform.C1578a f6554c;

    /* renamed from: d */
    public final int f6555d;

    /* renamed from: e */
    public final int f6556e;

    /* renamed from: f */
    public final io.flutter.plugin.platform.InterfaceC1584g f6557f;

    /* renamed from: g */
    public final io.flutter.plugin.platform.ViewOnFocusChangeListenerC1588k f6558g;

    /* renamed from: h */
    public android.hardware.display.VirtualDisplay f6559h;

    public C1576A(android.app.Activity activity, io.flutter.plugin.platform.C1578a c1578a, android.hardware.display.VirtualDisplay virtualDisplay, p081U2.C0751a c0751a, io.flutter.plugin.platform.InterfaceC1584g interfaceC1584g, io.flutter.plugin.platform.ViewOnFocusChangeListenerC1588k viewOnFocusChangeListenerC1588k, int i4) {
        this.f6553b = activity;
        this.f6554c = c1578a;
        this.f6557f = interfaceC1584g;
        this.f6558g = viewOnFocusChangeListenerC1588k;
        this.f6556e = i4;
        this.f6559h = virtualDisplay;
        this.f6555d = activity.getResources().getDisplayMetrics().densityDpi;
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = new io.flutter.plugin.platform.SingleViewPresentation(activity, this.f6559h.getDisplay(), c0751a, c1578a, i4, viewOnFocusChangeListenerC1588k);
        this.f6552a = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: a */
    public final android.view.SurfaceView m3500a() {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.f6552a;
        if (singleViewPresentation == null) {
            return null;
        }
        return ((p081U2.C0751a) singleViewPresentation.getView()).f2611a;
    }
}
