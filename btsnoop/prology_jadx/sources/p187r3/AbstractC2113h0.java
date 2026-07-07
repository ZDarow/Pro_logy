package p187r3;

/* renamed from: r3.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC2113h0 {

    /* renamed from: a */
    public static final java.lang.ThreadLocal f8474a = new java.lang.ThreadLocal();

    /* renamed from: a */
    public static p187r3.AbstractC2080H m4236a() {
        java.lang.ThreadLocal threadLocal = f8474a;
        p187r3.AbstractC2080H abstractC2080H = (p187r3.AbstractC2080H) threadLocal.get();
        if (abstractC2080H != null) {
            return abstractC2080H;
        }
        p187r3.C2104d c2104d = new p187r3.C2104d(java.lang.Thread.currentThread());
        threadLocal.set(c2104d);
        return c2104d;
    }
}
