package p196u;

/* renamed from: u.a */
/* loaded from: classes.dex */
public abstract class AbstractC2206a {

    /* renamed from: a */
    public static final /* synthetic */ int f8808a = 0;

    static {
        new java.lang.ThreadLocal();
    }

    /* renamed from: a */
    public static int m4384a(int i4, int i5) {
        int alpha = android.graphics.Color.alpha(i5);
        int alpha2 = android.graphics.Color.alpha(i4);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return android.graphics.Color.argb(i6, m4385b(android.graphics.Color.red(i4), alpha2, android.graphics.Color.red(i5), alpha, i6), m4385b(android.graphics.Color.green(i4), alpha2, android.graphics.Color.green(i5), alpha, i6), m4385b(android.graphics.Color.blue(i4), alpha2, android.graphics.Color.blue(i5), alpha, i6));
    }

    /* renamed from: b */
    public static int m4385b(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i4 * 255) * i5)) / (i8 * 255);
    }
}
