package p064Q;

/* renamed from: Q.s */
/* loaded from: classes.dex */
public final class HandlerC0547s extends android.os.Handler {

    /* renamed from: a */
    public final /* synthetic */ int f1619a;

    /* renamed from: b */
    public java.lang.Object f1620b;

    public /* synthetic */ HandlerC0547s() {
        this.f1619a = 0;
    }

    /* renamed from: a */
    public void m1055a(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == getLooper().getThread()) {
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
        throw new UnsupportedOperationException("Method not decompiled: p064Q.HandlerC0547s.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j4) {
        switch (this.f1619a) {
            case 0:
                android.os.Bundle data = message.getData();
                data.setClassLoader(android.support.v4.media.C1037e.class.getClassLoader());
                data.putInt("data_calling_uid", android.os.Binder.getCallingUid());
                int callingPid = android.os.Binder.getCallingPid();
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
    public /* synthetic */ HandlerC0547s(java.lang.Object obj, android.os.Looper looper, int i4) {
        super(looper);
        this.f1619a = i4;
        this.f1620b = obj;
    }
}
