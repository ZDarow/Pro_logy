package p209w3;

/* renamed from: w3.g */
/* loaded from: classes.dex */
public final class C2345g extends java.lang.RuntimeException {

    /* renamed from: l */
    public final transient p110b3.InterfaceC1195i f9278l;

    public C2345g(p110b3.InterfaceC1195i interfaceC1195i) {
        this.f9278l = interfaceC1195i;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return this.f9278l.toString();
    }
}
