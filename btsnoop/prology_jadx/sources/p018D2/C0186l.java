package p018D2;

/* renamed from: D2.l */
/* loaded from: classes.dex */
public final class C0186l implements p018D2.InterfaceC0179e {

    /* renamed from: a */
    public final android.os.Handler f512a;

    public C0186l() {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.f512a = android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(mainLooper) : new android.os.Handler(mainLooper);
    }

    @Override // p018D2.InterfaceC0179e
    /* renamed from: a */
    public final void mo539a(p018D2.RunnableC0177c runnableC0177c) {
        this.f512a.post(runnableC0177c);
    }
}
