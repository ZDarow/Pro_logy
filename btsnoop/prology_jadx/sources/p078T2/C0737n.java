package p078T2;

/* renamed from: T2.n */
/* loaded from: classes.dex */
public final class C0737n {

    /* renamed from: a */
    public boolean f2542a;

    /* renamed from: a */
    public synchronized void m1326a() {
        this.f2542a = false;
    }

    /* renamed from: b */
    public synchronized boolean m1327b() {
        if (this.f2542a) {
            return false;
        }
        this.f2542a = true;
        notifyAll();
        return true;
    }
}
