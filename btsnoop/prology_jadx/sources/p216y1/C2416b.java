package p216y1;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C2416b {

    /* renamed from: a */
    public static final p216y1.C2416b f9505a = new java.lang.Object();

    /* renamed from: a */
    public final p011C.C0105O m4653a(android.content.Context context) {
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowInsets windowInsets;
        p154k3.AbstractC1803h.m3779e(context, "context");
        currentWindowMetrics = ((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        p154k3.AbstractC1803h.m3778d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return p011C.C0105O.m396c(null, windowInsets);
    }
}
