package p094Y;

/* renamed from: Y.u */
/* loaded from: classes.dex */
public class C0883u extends p094Y.C0871i {

    /* renamed from: n */
    public final int f3172n;

    public C0883u() {
        super(2008);
        this.f3172n = 1;
    }

    /* renamed from: a */
    public static int m1706a(int i4, int i5) {
        if (i4 == 2000 && i5 == 1) {
            return 2001;
        }
        return i4;
    }

    /* renamed from: b */
    public static p094Y.C0883u m1707b(java.io.IOException iOException, int i4) {
        java.lang.String message = iOException.getMessage();
        int i5 = iOException instanceof java.net.SocketTimeoutException ? 2002 : iOException instanceof java.io.InterruptedIOException ? 1004 : (message == null || !p080U1.AbstractC0748a.m1361I(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i5 == 2007 ? new p094Y.C0883u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new p094Y.C0883u(iOException, i5, i4);
    }

    public C0883u(java.lang.String str, int i4) {
        super(str, m1706a(i4, 1));
        this.f3172n = 1;
    }

    public C0883u(java.io.IOException iOException, int i4, int i5) {
        super(iOException, m1706a(i4, i5));
        this.f3172n = i5;
    }

    public C0883u(java.lang.String str, java.io.IOException iOException, int i4) {
        super(str, iOException, m1706a(i4, 1));
        this.f3172n = 1;
    }
}
