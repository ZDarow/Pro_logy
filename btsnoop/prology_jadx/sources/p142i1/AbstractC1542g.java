package p142i1;

/* renamed from: i1.g */
/* loaded from: classes.dex */
public abstract class AbstractC1542g {
    /* renamed from: a */
    public static void m3430a(final java.lang.Runnable runnable) {
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: i1.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                runnable.run();
            }
        });
    }
}
