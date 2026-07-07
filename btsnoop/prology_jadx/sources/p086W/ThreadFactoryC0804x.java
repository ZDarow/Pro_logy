package p086W;

/* renamed from: W.x */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0804x implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f2800a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.f2800a);
    }
}
