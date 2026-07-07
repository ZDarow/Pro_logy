package p011C;

/* renamed from: C.N */
/* loaded from: classes.dex */
public abstract class AbstractC0104N {
    /* renamed from: a */
    public static int m394a(int i4) {
        int statusBars;
        int i5 = 0;
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i4 & i6) != 0) {
                if (i6 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i6 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i6 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i6 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i6 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i6 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i6 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i6 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                } else if (i6 == 512) {
                    statusBars = android.view.WindowInsets.Type.systemOverlays();
                }
                i5 |= statusBars;
            }
        }
        return i5;
    }
}
