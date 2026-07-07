package p094Y;

/* renamed from: Y.q */
/* loaded from: classes.dex */
public abstract class AbstractC0879q {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m1705b(java.lang.Throwable th) {
        return (th instanceof android.system.ErrnoException) && ((android.system.ErrnoException) th).errno == android.system.OsConstants.EACCES;
    }
}
