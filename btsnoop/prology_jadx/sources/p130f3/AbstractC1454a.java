package p130f3;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1454a {

    /* renamed from: a */
    public static final java.lang.Integer f5829a;

    static {
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Integer num2 = null;
        try {
            obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Throwable unused) {
        }
        if (obj instanceof java.lang.Integer) {
            num = (java.lang.Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f5829a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f5829a = num2;
    }
}
