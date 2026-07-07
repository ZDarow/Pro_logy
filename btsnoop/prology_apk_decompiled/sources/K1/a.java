package K1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f945c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f946d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f947a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f948b;

    public a(Context context) {
        this.f948b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f947a;
        reentrantLock.lock();
        try {
            return this.f948b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
