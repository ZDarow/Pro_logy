package android.support.v4.media;

import L.k;
import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a2.g(5);

    /* renamed from: l, reason: collision with root package name */
    public final int f3651l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3652m;

    /* renamed from: n, reason: collision with root package name */
    public Object f3653n;

    public RatingCompat(float f4, int i4) {
        this.f3651l = i4;
        this.f3652m = f4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    public static RatingCompat d(Object obj) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b4 = h.b(rating);
            if (!h.e(rating)) {
                switch (b4) {
                    case 1:
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                    case k.LONG_FIELD_NUMBER /* 4 */:
                    case k.STRING_FIELD_NUMBER /* 5 */:
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = new RatingCompat(-1.0f, b4);
                        break;
                }
            } else {
                switch (b4) {
                    case 1:
                        ratingCompat = new RatingCompat(h.d(rating) ? 1.0f : 0.0f, 1);
                        ratingCompat2 = ratingCompat;
                        break;
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        ratingCompat = new RatingCompat(h.f(rating) ? 1.0f : 0.0f, 2);
                        ratingCompat2 = ratingCompat;
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                    case k.LONG_FIELD_NUMBER /* 4 */:
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        ratingCompat2 = g(h.c(rating), b4);
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = f(h.a(rating));
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f3653n = obj;
        }
        return ratingCompat2;
    }

    public static RatingCompat f(float f4) {
        if (f4 >= 0.0f && f4 <= 100.0f) {
            return new RatingCompat(f4, 6);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat g(float f4, int i4) {
        float f5;
        if (i4 == 3) {
            f5 = 3.0f;
        } else if (i4 == 4) {
            f5 = 4.0f;
        } else {
            if (i4 != 5) {
                Log.e("Rating", "Invalid rating style (" + i4 + ") for a star rating");
                return null;
            }
            f5 = 5.0f;
        }
        if (f4 >= 0.0f && f4 <= f5) {
            return new RatingCompat(f4, i4);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3651l;
    }

    public final boolean e() {
        return this.f3652m >= 0.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3651l);
        sb.append(" rating=");
        float f4 = this.f3652m;
        sb.append(f4 < 0.0f ? "unrated" : String.valueOf(f4));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f3651l);
        parcel.writeFloat(this.f3652m);
    }
}
