package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceProducer {
    android.view.Surface getForcedNewSurface();

    int getHeight();

    android.view.Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* renamed from: id */
    /* synthetic */ long mo3441id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(io.flutter.view.InterfaceC1618o interfaceC1618o);

    void setSize(int i4, int i5);
}
