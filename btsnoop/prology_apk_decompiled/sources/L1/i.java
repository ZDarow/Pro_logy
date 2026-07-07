package L1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i extends W1.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f1075b = dVar;
        this.f1074a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        int i5 = e.f1066a;
        d dVar = this.f1075b;
        Context context = this.f1074a;
        int b4 = dVar.b(context, i5);
        AtomicBoolean atomicBoolean = f.f1067a;
        if (b4 == 1 || b4 == 2 || b4 == 3 || b4 == 9) {
            Intent a4 = dVar.a(context, b4, "n");
            dVar.f(context, b4, a4 == null ? null : PendingIntent.getActivity(context, 0, a4, 201326592));
        }
    }
}
