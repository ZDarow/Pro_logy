package p218y3;

/* renamed from: y3.j */
/* loaded from: classes.dex */
public abstract class AbstractC2427j {

    /* renamed from: a */
    public static final java.lang.String f9536a;

    /* renamed from: b */
    public static final long f9537b;

    /* renamed from: c */
    public static final int f9538c;

    /* renamed from: d */
    public static final int f9539d;

    /* renamed from: e */
    public static final long f9540e;

    /* renamed from: f */
    public static final p218y3.C2423f f9541f;

    /* renamed from: g */
    public static final p009B2.C0032C f9542g;

    /* renamed from: h */
    public static final p009B2.C0032C f9543h;

    static {
        java.lang.String str;
        int i4 = p209w3.AbstractC2361w.f9310a;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9536a = str;
        f9537b = p209w3.AbstractC2339a.m4547j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = p209w3.AbstractC2361w.f9310a;
        if (i5 < 2) {
            i5 = 2;
        }
        f9538c = p209w3.AbstractC2339a.m4548k("kotlinx.coroutines.scheduler.core.pool.size", i5, 1, 0, 8);
        f9539d = p209w3.AbstractC2339a.m4548k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f9540e = java.util.concurrent.TimeUnit.SECONDS.toNanos(p209w3.AbstractC2339a.m4547j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9541f = p218y3.C2423f.f9531a;
        f9542g = new p009B2.C0032C(0);
        f9543h = new p009B2.C0032C(1);
    }
}
