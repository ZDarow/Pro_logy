package N1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f1313a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.d f1314b;

    public t(B1.d dVar) {
        this.f1314b = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((F.b) this.f1314b.f97n).getClass();
            throw null;
        }
    }
}
