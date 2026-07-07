package z;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public final int f9214l;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f9214l = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f9214l);
        super.run();
    }
}
