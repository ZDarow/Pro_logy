package p046L1;

/* renamed from: L1.i */
/* loaded from: classes.dex */
public final class HandlerC0365i extends p088W1.HandlerC0820f {

    /* renamed from: a */
    public final android.content.Context f1113a;

    /* renamed from: b */
    public final /* synthetic */ p046L1.C0360d f1114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0365i(p046L1.C0360d c0360d, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper(), 0);
        this.f1114b = c0360d;
        this.f1113a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        int i5 = p046L1.AbstractC0361e.f1105a;
        p046L1.C0360d c0360d = this.f1114b;
        android.content.Context context = this.f1113a;
        int m811b = c0360d.m811b(context, i5);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p046L1.AbstractC0362f.f1106a;
        if (m811b == 1 || m811b == 2 || m811b == 3 || m811b == 9) {
            android.content.Intent m810a = c0360d.m810a(context, m811b, "n");
            c0360d.m808f(context, m811b, m810a == null ? null : android.app.PendingIntent.getActivity(context, 0, m810a, 201326592));
        }
    }
}
