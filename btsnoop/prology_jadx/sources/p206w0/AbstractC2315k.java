package p206w0;

/* renamed from: w0.k */
/* loaded from: classes.dex */
public abstract class AbstractC2315k {
    /* renamed from: a */
    public static boolean m4497a(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i4 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i4 == 1) {
                return true;
            }
        }
        return false;
    }
}
