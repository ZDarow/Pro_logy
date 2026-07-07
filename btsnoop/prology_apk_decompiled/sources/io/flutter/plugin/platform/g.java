package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: classes.dex */
public interface g {
    long a();

    void b(int i4, int i5);

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
