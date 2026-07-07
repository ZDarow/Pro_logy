package p207w1;

/* renamed from: w1.c */
/* loaded from: classes.dex */
public final class C2331c implements p203v1.InterfaceC2270a {

    /* renamed from: a */
    public final androidx.window.extensions.layout.WindowLayoutComponent f9246a;

    /* renamed from: b */
    public final p180q1.C2022a f9247b;

    /* renamed from: c */
    public final java.util.concurrent.locks.ReentrantLock f9248c = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d */
    public final java.util.LinkedHashMap f9249d = new java.util.LinkedHashMap();

    /* renamed from: e */
    public final java.util.LinkedHashMap f9250e = new java.util.LinkedHashMap();

    /* renamed from: f */
    public final java.util.LinkedHashMap f9251f = new java.util.LinkedHashMap();

    public C2331c(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, p180q1.C2022a c2022a) {
        this.f9246a = windowLayoutComponent;
        this.f9247b = c2022a;
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: a */
    public final void mo4458a(p009B2.C0060q c0060q) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9248c;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f9250e;
        try {
            android.content.Context context = (android.content.Context) linkedHashMap.get(c0060q);
            if (context == null) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = this.f9249d;
            p207w1.C2334f c2334f = (p207w1.C2334f) linkedHashMap2.get(context);
            if (c2334f == null) {
                return;
            }
            c2334f.m4535d(c0060q);
            linkedHashMap.remove(c0060q);
            if (c2334f.f9259d.isEmpty()) {
                linkedHashMap2.remove(context);
                p185r1.C2061d c2061d = (p185r1.C2061d) this.f9251f.remove(c2334f);
                if (c2061d != null) {
                    c2061d.f8391a.invoke(c2061d.f8392b, c2061d.f8393c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p203v1.InterfaceC2270a
    /* renamed from: b */
    public final void mo4459b(android.content.Context context, p142i1.ExecutorC1537b executorC1537b, p009B2.C0060q c0060q) {
        p100Z2.C0934g c0934g;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9248c;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f9249d;
        try {
            p207w1.C2334f c2334f = (p207w1.C2334f) linkedHashMap.get(context);
            java.util.LinkedHashMap linkedHashMap2 = this.f9250e;
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
                if (!(context instanceof android.app.Activity)) {
                    c2334f2.accept(new androidx.window.extensions.layout.WindowLayoutInfo(p105a3.C1029l.f3755l));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f9251f.put(c2334f2, this.f9247b.m4070a(this.f9246a, p154k3.AbstractC1812q.m3788a(androidx.window.extensions.layout.WindowLayoutInfo.class), (android.app.Activity) context, new p207w1.C2330b(c2334f2)));
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
