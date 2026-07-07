package w0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public abstract class k {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
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
