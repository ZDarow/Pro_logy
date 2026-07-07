package android.support.v4.media;

import android.media.Rating;

/* loaded from: classes.dex */
public abstract class h {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z4) {
        return Rating.newHeartRating(z4);
    }

    public static Rating h(float f4) {
        return Rating.newPercentageRating(f4);
    }

    public static Rating i(int i4, float f4) {
        return Rating.newStarRating(i4, f4);
    }

    public static Rating j(boolean z4) {
        return Rating.newThumbRating(z4);
    }

    public static Rating k(int i4) {
        return Rating.newUnratedRating(i4);
    }
}
