package p190s2;

/* renamed from: s2.e */
/* loaded from: classes.dex */
public final class C2145e implements android.os.IBinder.DeathRecipient {

    /* renamed from: a */
    public final android.support.v4.media.session.C1046e f8553a = new android.support.v4.media.session.C1046e(this);

    /* renamed from: b */
    public android.support.v4.media.session.HandlerC1047f f8554b;

    /* renamed from: c */
    public android.support.v4.media.session.BinderC1048g f8555c;

    /* renamed from: a */
    public final void m4264a(int i4, java.lang.Object obj, android.os.Bundle bundle) {
        android.support.v4.media.session.HandlerC1047f handlerC1047f = this.f8554b;
        if (handlerC1047f != null) {
            android.os.Message obtainMessage = handlerC1047f.obtainMessage(i4, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: b */
    public final void m4265b(android.os.Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.HandlerC1047f handlerC1047f = new android.support.v4.media.session.HandlerC1047f(this, handler.getLooper());
            this.f8554b = handlerC1047f;
            handlerC1047f.f3828a = true;
        } else {
            android.support.v4.media.session.HandlerC1047f handlerC1047f2 = this.f8554b;
            if (handlerC1047f2 != null) {
                handlerC1047f2.f3828a = false;
                handlerC1047f2.removeCallbacksAndMessages(null);
                this.f8554b = null;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        m4264a(8, null, null);
    }
}
