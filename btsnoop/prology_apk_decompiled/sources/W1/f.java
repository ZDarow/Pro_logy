package W1;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class f extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Looper looper, int i4) {
        super(looper);
        switch (i4) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }
}
