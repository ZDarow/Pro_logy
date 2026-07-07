package W;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f2702b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2703a;

    public v(Handler handler) {
        this.f2703a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u b() {
        u obj;
        ArrayList arrayList = f2702b;
        synchronized (arrayList) {
            try {
                obj = arrayList.isEmpty() ? new Object() : (u) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final u a(int i4, Object obj) {
        u b4 = b();
        b4.f2701a = this.f2703a.obtainMessage(i4, obj);
        return b4;
    }

    public final boolean c(Runnable runnable) {
        return this.f2703a.post(runnable);
    }

    public final void d(int i4) {
        a.e(i4 != 0);
        this.f2703a.removeMessages(i4);
    }

    public final boolean e(int i4) {
        return this.f2703a.sendEmptyMessage(i4);
    }
}
