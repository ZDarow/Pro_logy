package w0;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(Surface surface, float f4) {
        try {
            surface.setFrameRate(f4, f4 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e4) {
            W.a.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }
}
