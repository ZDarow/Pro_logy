package p187r3;

/* renamed from: r3.n */
/* loaded from: classes.dex */
public class C2123n {

    /* renamed from: b */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8484b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p187r3.C2123n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final java.lang.Throwable f8485a;

    public C2123n(java.lang.Throwable th, boolean z4) {
        this.f8485a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.f8485a + ']';
    }
}
