package T2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2455a;

    public synchronized void a() {
        this.f2455a = false;
    }

    public synchronized boolean b() {
        if (this.f2455a) {
            return false;
        }
        this.f2455a = true;
        notifyAll();
        return true;
    }
}
