package p004A2;

/* renamed from: A2.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC0016a implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public int f83a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("flutter-worker-");
        int i4 = this.f83a;
        this.f83a = i4 + 1;
        sb.append(i4);
        thread.setName(sb.toString());
        return thread;
    }
}
