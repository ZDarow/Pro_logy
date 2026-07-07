package p218y3;

/* renamed from: y3.i */
/* loaded from: classes.dex */
public final class C2426i extends p218y3.AbstractRunnableC2425h {

    /* renamed from: n */
    public final java.lang.Runnable f9535n;

    public C2426i(java.lang.Runnable runnable, long j4, p009B2.C0032C c0032c) {
        super(j4, c0032c);
        this.f9535n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9535n.run();
        } finally {
            this.f9534m.getClass();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.f9535n;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(p187r3.AbstractC2131v.m4243b(runnable));
        sb.append(", ");
        sb.append(this.f9533l);
        sb.append(", ");
        sb.append(this.f9534m);
        sb.append(']');
        return sb.toString();
    }
}
