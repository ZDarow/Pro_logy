package s2;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548e implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.e f8234a = new android.support.v4.media.session.e(this);

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.f f8235b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.g f8236c;

    public final void a(int i4, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.f8235b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i4, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void b(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper());
            this.f8235b = fVar;
            fVar.f3701a = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.f8235b;
            if (fVar2 != null) {
                fVar2.f3701a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f8235b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a(8, null, null);
    }
}
