package Y;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class u extends i {

    /* renamed from: n, reason: collision with root package name */
    public final int f3062n;

    public u() {
        super(2008);
        this.f3062n = 1;
    }

    public static int a(int i4, int i5) {
        if (i4 == 2000 && i5 == 1) {
            return 2001;
        }
        return i4;
    }

    public static u b(IOException iOException, int i4) {
        String message = iOException.getMessage();
        int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !U1.a.I(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i5 == 2007 ? new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new u(iOException, i5, i4);
    }

    public u(String str, int i4) {
        super(str, a(i4, 1));
        this.f3062n = 1;
    }

    public u(IOException iOException, int i4, int i5) {
        super(iOException, a(i4, i5));
        this.f3062n = i5;
    }

    public u(String str, IOException iOException, int i4) {
        super(str, iOException, a(i4, 1));
        this.f3062n = 1;
    }
}
