package r3;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8156a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f8156a;
        H h4 = (H) threadLocal.get();
        if (h4 != null) {
            return h4;
        }
        C0517d c0517d = new C0517d(Thread.currentThread());
        threadLocal.set(c0517d);
        return c0517d;
    }
}
