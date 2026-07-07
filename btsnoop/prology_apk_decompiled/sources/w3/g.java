package w3;

import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: l, reason: collision with root package name */
    public final transient InterfaceC0195i f8920l;

    public g(InterfaceC0195i interfaceC0195i) {
        this.f8920l = interfaceC0195i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f8920l.toString();
    }
}
