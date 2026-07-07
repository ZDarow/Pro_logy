package p134g3;

/* renamed from: g3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1479a {

    /* renamed from: a */
    public static final java.lang.Integer f6021a;

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
            f6021a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f6021a = num2;
    }
}
