package android.support.v4.media;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = new p104a2.C1009g(5);

    /* renamed from: l */
    public final int f3776l;

    /* renamed from: m */
    public final float f3777m;

    /* renamed from: n */
    public java.lang.Object f3778n;

    public RatingCompat(float f4, int i4) {
        this.f3776l = i4;
        this.f3777m = f4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    /* renamed from: d */
    public static android.support.v4.media.RatingCompat m2064d(java.lang.Object obj) {
        android.support.v4.media.RatingCompat ratingCompat;
        android.support.v4.media.RatingCompat ratingCompat2 = null;
        if (obj != null) {
            android.media.Rating rating = (android.media.Rating) obj;
            int m2088b = android.support.v4.media.AbstractC1040h.m2088b(rating);
            if (!android.support.v4.media.AbstractC1040h.m2091e(rating)) {
                switch (m2088b) {
                    case 1:
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = new android.support.v4.media.RatingCompat(-1.0f, m2088b);
                        break;
                }
            } else {
                switch (m2088b) {
                    case 1:
                        ratingCompat = new android.support.v4.media.RatingCompat(android.support.v4.media.AbstractC1040h.m2090d(rating) ? 1.0f : 0.0f, 1);
                        ratingCompat2 = ratingCompat;
                        break;
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        ratingCompat = new android.support.v4.media.RatingCompat(android.support.v4.media.AbstractC1040h.m2092f(rating) ? 1.0f : 0.0f, 2);
                        ratingCompat2 = ratingCompat;
                        break;
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                        ratingCompat2 = m2066g(android.support.v4.media.AbstractC1040h.m2089c(rating), m2088b);
                        break;
                    case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = m2065f(android.support.v4.media.AbstractC1040h.m2087a(rating));
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f3778n = obj;
        }
        return ratingCompat2;
    }

    /* renamed from: f */
    public static android.support.v4.media.RatingCompat m2065f(float f4) {
        if (f4 >= 0.0f && f4 <= 100.0f) {
            return new android.support.v4.media.RatingCompat(f4, 6);
        }
        android.util.Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: g */
    public static android.support.v4.media.RatingCompat m2066g(float f4, int i4) {
        float f5;
        if (i4 == 3) {
            f5 = 3.0f;
        } else if (i4 == 4) {
            f5 = 4.0f;
        } else {
            if (i4 != 5) {
                android.util.Log.e("Rating", "Invalid rating style (" + i4 + ") for a star rating");
                return null;
            }
            f5 = 5.0f;
        }
        if (f4 >= 0.0f && f4 <= f5) {
            return new android.support.v4.media.RatingCompat(f4, i4);
        }
        android.util.Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3776l;
    }

    /* renamed from: e */
    public final boolean m2067e() {
        return this.f3777m >= 0.0f;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rating:style=");
        sb.append(this.f3776l);
        sb.append(" rating=");
        float f4 = this.f3777m;
        sb.append(f4 < 0.0f ? "unrated" : java.lang.String.valueOf(f4));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeInt(this.f3776l);
        parcel.writeFloat(this.f3777m);
    }
}
