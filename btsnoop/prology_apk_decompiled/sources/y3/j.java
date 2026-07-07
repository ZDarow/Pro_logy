package y3;

import B2.C;
import java.util.concurrent.TimeUnit;
import w3.w;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9172a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9173b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9174c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9175d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f9176e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f9177f;

    /* renamed from: g, reason: collision with root package name */
    public static final C f9178g;

    /* renamed from: h, reason: collision with root package name */
    public static final C f9179h;

    static {
        String str;
        int i4 = w.f8951a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f9172a = str;
        f9173b = w3.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = w.f8951a;
        if (i5 < 2) {
            i5 = 2;
        }
        f9174c = w3.a.k("kotlinx.coroutines.scheduler.core.pool.size", i5, 1, 0, 8);
        f9175d = w3.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f9176e = TimeUnit.SECONDS.toNanos(w3.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f9177f = f.f9167a;
        f9178g = new C(0);
        f9179h = new C(1);
    }
}
