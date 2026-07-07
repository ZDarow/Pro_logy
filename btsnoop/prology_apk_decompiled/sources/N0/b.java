package N0;

import F.i;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i(25);

    /* renamed from: l, reason: collision with root package name */
    public final long f1233l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1234m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1235n;

    public b(int i4, long j4, long j5) {
        W.a.e(j4 < j5);
        this.f1233l = j4;
        this.f1234m = j5;
        this.f1235n = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1233l == bVar.f1233l && this.f1234m == bVar.f1234m && this.f1235n == bVar.f1235n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1233l), Long.valueOf(this.f1234m), Integer.valueOf(this.f1235n)});
    }

    public final String toString() {
        int i4 = y.f2709a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f1233l + ", endTimeMs=" + this.f1234m + ", speedDivisor=" + this.f1235n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1233l);
        parcel.writeLong(this.f1234m);
        parcel.writeInt(this.f1235n);
    }
}
