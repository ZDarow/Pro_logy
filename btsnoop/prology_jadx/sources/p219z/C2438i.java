package p219z;

/* renamed from: z.i */
/* loaded from: classes.dex */
public final class C2438i extends java.lang.Thread {

    /* renamed from: l */
    public final int f9578l;

    public C2438i(java.lang.Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f9578l = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.f9578l);
        super.run();
    }
}
