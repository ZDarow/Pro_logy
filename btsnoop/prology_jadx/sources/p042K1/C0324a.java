package p042K1;

/* renamed from: K1.a */
/* loaded from: classes.dex */
public final class C0324a {

    /* renamed from: c */
    public static final java.util.concurrent.locks.ReentrantLock f984c = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d */
    public static p042K1.C0324a f985d;

    /* renamed from: a */
    public final java.util.concurrent.locks.ReentrantLock f986a = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: b */
    public final android.content.SharedPreferences f987b;

    public C0324a(android.content.Context context) {
        this.f987b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final java.lang.String m718a(java.lang.String str) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f986a;
        reentrantLock.lock();
        try {
            return this.f987b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
