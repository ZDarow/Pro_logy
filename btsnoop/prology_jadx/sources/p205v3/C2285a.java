package p205v3;

/* renamed from: v3.a */
/* loaded from: classes.dex */
public final class C2285a extends java.util.concurrent.CancellationException {

    /* renamed from: l */
    public final transient p200u3.InterfaceC2251e f9065l;

    public C2285a(p200u3.InterfaceC2251e interfaceC2251e) {
        super("Flow was aborted, no more elements needed");
        this.f9065l = interfaceC2251e;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
