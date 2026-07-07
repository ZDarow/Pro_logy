package p219z;

/* renamed from: z.j */
/* loaded from: classes.dex */
public final class ThreadFactoryC2439j implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new p219z.C2438i(runnable);
    }
}
