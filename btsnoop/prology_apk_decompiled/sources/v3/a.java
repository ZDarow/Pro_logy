package v3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: l, reason: collision with root package name */
    public final transient u3.e f8712l;

    public a(u3.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f8712l = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
