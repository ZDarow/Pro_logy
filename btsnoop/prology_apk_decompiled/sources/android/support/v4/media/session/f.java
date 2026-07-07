package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import s2.C0548e;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0548e f3702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0548e c0548e, Looper looper) {
        super(looper);
        this.f3702b = c0548e;
        this.f3701a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f3701a) {
            int i4 = message.what;
            C0548e c0548e = this.f3702b;
            switch (i4) {
                case 1:
                    t.b0(message.getData());
                    c0548e.getClass();
                    return;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    c0548e.getClass();
                    return;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    c0548e.getClass();
                    return;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    c0548e.getClass();
                    return;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    c0548e.getClass();
                    return;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    c0548e.getClass();
                    return;
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    t.b0((Bundle) message.obj);
                    c0548e.getClass();
                    return;
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    c0548e.getClass();
                    return;
                case 9:
                    ((Integer) message.obj).getClass();
                    c0548e.getClass();
                    return;
                case 10:
                default:
                    return;
                case 11:
                    ((Boolean) message.obj).getClass();
                    c0548e.getClass();
                    return;
                case 12:
                    ((Integer) message.obj).getClass();
                    c0548e.getClass();
                    return;
                case 13:
                    c0548e.getClass();
                    return;
            }
        }
    }
}
