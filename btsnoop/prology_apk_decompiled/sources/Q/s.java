package Q;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class s extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1568a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1569b;

    public /* synthetic */ s() {
        this.f1568a = 0;
    }

    public void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.s.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j4) {
        switch (this.f1568a) {
            case 0:
                Bundle data = message.getData();
                data.setClassLoader(android.support.v4.media.e.class.getClassLoader());
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j4);
            default:
                return super.sendMessageAtTime(message, j4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Looper looper, int i4) {
        super(looper);
        this.f1568a = i4;
        this.f1569b = obj;
    }
}
