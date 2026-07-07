package p207w1;

/* renamed from: w1.f */
/* loaded from: classes.dex */
public final class C2334f implements p006B.InterfaceC0018a, androidx.window.extensions.core.util.function.Consumer {

    /* renamed from: a */
    public final android.content.Context f9256a;

    /* renamed from: c */
    public p198u1.C2242j f9258c;

    /* renamed from: b */
    public final java.util.concurrent.locks.ReentrantLock f9257b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d */
    public final java.util.LinkedHashSet f9259d = new java.util.LinkedHashSet();

    public C2334f(android.content.Context context) {
        this.f9256a = context;
    }

    @Override // p006B.InterfaceC0018a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        p154k3.AbstractC1803h.m3779e(windowLayoutInfo, "value");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9257b;
        reentrantLock.lock();
        try {
            this.f9258c = p207w1.AbstractC2333e.m4530b(this.f9256a, windowLayoutInfo);
            java.util.Iterator it = this.f9259d.iterator();
            while (it.hasNext()) {
                ((p006B.InterfaceC0018a) it.next()).accept(this.f9258c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void m4533b(p009B2.C0060q c0060q) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9257b;
        reentrantLock.lock();
        try {
            p198u1.C2242j c2242j = this.f9258c;
            if (c2242j != null) {
                c0060q.accept(c2242j);
            }
            this.f9259d.add(c0060q);
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean m4534c() {
        return this.f9259d.isEmpty();
    }

    /* renamed from: d */
    public final void m4535d(p009B2.C0060q c0060q) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f9257b;
        reentrantLock.lock();
        try {
            this.f9259d.remove(c0060q);
        } finally {
            reentrantLock.unlock();
        }
    }
}
