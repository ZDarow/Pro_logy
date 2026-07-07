package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.f */
/* loaded from: classes.dex */
public final class HandlerC1047f extends android.os.Handler {

    /* renamed from: a */
    public boolean f3828a;

    /* renamed from: b */
    public final /* synthetic */ p190s2.C2145e f3829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1047f(p190s2.C2145e c2145e, android.os.Looper looper) {
        super(looper);
        this.f3829b = c2145e;
        this.f3828a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.f3828a) {
            int i4 = message.what;
            p190s2.C2145e c2145e = this.f3829b;
            switch (i4) {
                case 1:
                    android.support.v4.media.session.C1061t.m2199b0(message.getData());
                    c2145e.getClass();
                    return;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    c2145e.getClass();
                    return;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    c2145e.getClass();
                    return;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    c2145e.getClass();
                    return;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    c2145e.getClass();
                    return;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    c2145e.getClass();
                    return;
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    android.support.v4.media.session.C1061t.m2199b0((android.os.Bundle) message.obj);
                    c2145e.getClass();
                    return;
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    c2145e.getClass();
                    return;
                case 9:
                    ((java.lang.Integer) message.obj).getClass();
                    c2145e.getClass();
                    return;
                case 10:
                default:
                    return;
                case 11:
                    ((java.lang.Boolean) message.obj).getClass();
                    c2145e.getClass();
                    return;
                case 12:
                    ((java.lang.Integer) message.obj).getClass();
                    c2145e.getClass();
                    return;
                case 13:
                    c2145e.getClass();
                    return;
            }
        }
    }
}
