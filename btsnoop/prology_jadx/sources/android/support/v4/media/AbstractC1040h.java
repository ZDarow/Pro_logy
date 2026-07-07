package android.support.v4.media;

/* renamed from: android.support.v4.media.h */
/* loaded from: classes.dex */
public abstract class AbstractC1040h {
    /* renamed from: a */
    public static float m2087a(android.media.Rating rating) {
        return rating.getPercentRating();
    }

    /* renamed from: b */
    public static int m2088b(android.media.Rating rating) {
        return rating.getRatingStyle();
    }

    /* renamed from: c */
    public static float m2089c(android.media.Rating rating) {
        return rating.getStarRating();
    }

    /* renamed from: d */
    public static boolean m2090d(android.media.Rating rating) {
        return rating.hasHeart();
    }

    /* renamed from: e */
    public static boolean m2091e(android.media.Rating rating) {
        return rating.isRated();
    }

    /* renamed from: f */
    public static boolean m2092f(android.media.Rating rating) {
        return rating.isThumbUp();
    }

    /* renamed from: g */
    public static android.media.Rating m2093g(boolean z4) {
        return android.media.Rating.newHeartRating(z4);
    }

    /* renamed from: h */
    public static android.media.Rating m2094h(float f4) {
        return android.media.Rating.newPercentageRating(f4);
    }

    /* renamed from: i */
    public static android.media.Rating m2095i(int i4, float f4) {
        return android.media.Rating.newStarRating(i4, f4);
    }

    /* renamed from: j */
    public static android.media.Rating m2096j(boolean z4) {
        return android.media.Rating.newThumbRating(z4);
    }

    /* renamed from: k */
    public static android.media.Rating m2097k(int i4) {
        return android.media.Rating.newUnratedRating(i4);
    }
}
