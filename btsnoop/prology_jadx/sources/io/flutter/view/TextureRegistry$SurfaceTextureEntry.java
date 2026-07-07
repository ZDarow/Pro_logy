package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* renamed from: id */
    /* synthetic */ long mo3443id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(io.flutter.view.InterfaceC1616m interfaceC1616m) {
    }

    default void setOnTrimMemoryListener(io.flutter.view.InterfaceC1617n interfaceC1617n) {
    }

    android.graphics.SurfaceTexture surfaceTexture();
}
