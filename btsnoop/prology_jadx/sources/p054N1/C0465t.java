package p054N1;

/* renamed from: N1.t */
/* loaded from: classes.dex */
public final class C0465t extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public android.content.Context f1357a;

    /* renamed from: b */
    public final p008B1.C0026d f1358b;

    public C0465t(p008B1.C0026d c0026d) {
        this.f1358b = c0026d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((p024F.RunnableC0199b) this.f1358b.f100n).getClass();
            throw null;
        }
    }
}
