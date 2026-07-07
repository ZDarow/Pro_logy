package y3;

import B2.C;
import r3.AbstractC0534v;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f9171n;

    public i(Runnable runnable, long j4, C c4) {
        super(j4, c4);
        this.f9171n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9171n.run();
        } finally {
            this.f9170m.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f9171n;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0534v.b(runnable));
        sb.append(", ");
        sb.append(this.f9169l);
        sb.append(", ");
        sb.append(this.f9170m);
        sb.append(']');
        return sb.toString();
    }
}
