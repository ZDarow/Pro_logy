package p207w1;

/* renamed from: w1.d */
/* loaded from: classes.dex */
public final class C2332d implements p203v1.InterfaceC2270a {

    /* renamed from: a */
    public final androidx.window.extensions.layout.WindowLayoutComponent f9252a;

    /* renamed from: b */
    public final java.util.concurrent.locks.ReentrantLock f9253b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: c */
    public final java.util.LinkedHashMap f9254c = new java.util.LinkedHashMap();

    /* renamed from: d */
    public final java.util.LinkedHashMap f9255d = new java.util.LinkedHashMap();

    public C2332d(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent) {
        this.f9252a = windowLayoutComponent;
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: a */
    public final void mo4458a(p009B2.C0060q c0060q) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9253b;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f9255d;
        try {
            android.content.Context context = (android.content.Context) linkedHashMap.get(c0060q);
            if (context == null) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = this.f9254c;
            p207w1.C2334f c2334f = (p207w1.C2334f) linkedHashMap2.get(context);
            if (c2334f == null) {
                return;
            }
            c2334f.m4535d(c0060q);
            linkedHashMap.remove(c0060q);
            if (c2334f.m4534c()) {
                linkedHashMap2.remove(context);
                this.f9252a.removeWindowLayoutInfoListener(c2334f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: b */
    public final void mo4459b(android.content.Context context, p142i1.ExecutorC1537b executorC1537b, p009B2.C0060q c0060q) {
        p100Z2.C0934g c0934g;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9253b;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f9254c;
        try {
            p207w1.C2334f c2334f = (p207w1.C2334f) linkedHashMap.get(context);
            java.util.LinkedHashMap linkedHashMap2 = this.f9255d;
            if (c2334f != null) {
                c2334f.m4533b(c0060q);
                linkedHashMap2.put(c0060q, context);
                c0934g = p100Z2.C0934g.f3298a;
            } else {
                c0934g = null;
            }
            if (c0934g == null) {
                p207w1.C2334f c2334f2 = new p207w1.C2334f(context);
                linkedHashMap.put(context, c2334f2);
                linkedHashMap2.put(c0060q, context);
                c2334f2.m4533b(c0060q);
                this.f9252a.addWindowLayoutInfoListener(context, c2334f2);
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
