package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: i, reason: collision with root package name */
    public static final w f6316i = new VirtualDisplay.Callback();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f6317a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f6318b;

    /* renamed from: c, reason: collision with root package name */
    public final C0344a f6319c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6321e;

    /* renamed from: f, reason: collision with root package name */
    public final g f6322f;

    /* renamed from: g, reason: collision with root package name */
    public final k f6323g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f6324h;

    public A(Activity activity, C0344a c0344a, VirtualDisplay virtualDisplay, U2.a aVar, g gVar, k kVar, int i4) {
        this.f6318b = activity;
        this.f6319c = c0344a;
        this.f6322f = gVar;
        this.f6323g = kVar;
        this.f6321e = i4;
        this.f6324h = virtualDisplay;
        this.f6320d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f6324h.getDisplay(), aVar, c0344a, i4, kVar);
        this.f6317a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final SurfaceView a() {
        SingleViewPresentation singleViewPresentation = this.f6317a;
        if (singleViewPresentation == null) {
            return null;
        }
        return ((U2.a) singleViewPresentation.getView()).f2523a;
    }
}
