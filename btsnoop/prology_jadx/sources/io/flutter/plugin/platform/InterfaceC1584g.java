package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.g */
/* loaded from: classes.dex */
public interface InterfaceC1584g {
    /* renamed from: a */
    long mo3501a();

    /* renamed from: b */
    void mo3502b(int i4, int i5);

    int getHeight();

    android.view.Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
