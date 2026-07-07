package u;

import android.graphics.Color;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0573a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8470a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i6, b(Color.red(i4), alpha2, Color.red(i5), alpha, i6), b(Color.green(i4), alpha2, Color.green(i5), alpha, i6), b(Color.blue(i4), alpha2, Color.blue(i5), alpha, i6));
    }

    public static int b(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i4 * 255) * i5)) / (i8 * 255);
    }
}
