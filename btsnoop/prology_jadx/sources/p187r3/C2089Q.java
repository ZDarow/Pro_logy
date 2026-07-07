package p187r3;

/* renamed from: r3.Q */
/* loaded from: classes.dex */
public final class C2089Q extends java.util.concurrent.CancellationException {

    /* renamed from: l */
    public final transient p187r3.C2097Z f8443l;

    public C2089Q(java.lang.String str, java.lang.Throwable th, p187r3.C2097Z c2097z) {
        super(str);
        this.f8443l = c2097z;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof p187r3.C2089Q) {
                p187r3.C2089Q c2089q = (p187r3.C2089Q) obj;
                if (!p154k3.AbstractC1803h.m3775a(c2089q.getMessage(), getMessage()) || !p154k3.AbstractC1803h.m3775a(c2089q.f8443l, this.f8443l) || !p154k3.AbstractC1803h.m3775a(c2089q.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        p154k3.AbstractC1803h.m3776b(message);
        int hashCode = (this.f8443l.hashCode() + (message.hashCode() * 31)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + this.f8443l;
    }
}
