package p206w0;

/* renamed from: w0.q */
/* loaded from: classes.dex */
public abstract class AbstractC2321q {
    /* renamed from: a */
    public static void m4523a(android.view.Surface surface, float f4) {
        try {
            surface.setFrameRate(f4, f4 == 0.0f ? 0 : 1);
        } catch (java.lang.IllegalStateException e4) {
            p086W.AbstractC0781a.m1426o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }
}
