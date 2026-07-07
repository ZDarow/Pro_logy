package Y;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
public abstract class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
