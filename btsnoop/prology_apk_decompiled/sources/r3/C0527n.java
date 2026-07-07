package r3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: r3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0527n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8166b = AtomicIntegerFieldUpdater.newUpdater(C0527n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f8167a;

    public C0527n(Throwable th, boolean z4) {
        this.f8167a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f8167a + ']';
    }
}
