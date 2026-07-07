package r3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Q extends CancellationException {

    /* renamed from: l, reason: collision with root package name */
    public final transient Z f8127l;

    public Q(String str, Throwable th, Z z4) {
        super(str);
        this.f8127l = z4;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Q) {
                Q q4 = (Q) obj;
                if (!k3.h.a(q4.getMessage(), getMessage()) || !k3.h.a(q4.f8127l, this.f8127l) || !k3.h.a(q4.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        k3.h.b(message);
        int hashCode = (this.f8127l.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8127l;
    }
}
