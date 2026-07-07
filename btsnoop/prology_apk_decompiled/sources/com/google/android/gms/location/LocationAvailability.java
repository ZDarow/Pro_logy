package com.google.android.gms.location;

import O0.g;
import P1.a;
import a2.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new g(25);

    /* renamed from: l, reason: collision with root package name */
    public final int f4763l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4764m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4765n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4766o;

    /* renamed from: p, reason: collision with root package name */
    public final i[] f4767p;

    public LocationAvailability(int i4, int i5, int i6, long j4, i[] iVarArr) {
        this.f4766o = i4 < 1000 ? 0 : 1000;
        this.f4763l = i5;
        this.f4764m = i6;
        this.f4765n = j4;
        this.f4767p = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f4763l == locationAvailability.f4763l && this.f4764m == locationAvailability.f4764m && this.f4765n == locationAvailability.f4765n && this.f4766o == locationAvailability.f4766o && Arrays.equals(this.f4767p, locationAvailability.f4767p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4766o)});
    }

    public final String toString() {
        boolean z4 = this.f4766o < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z4).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z4);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4763l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f4764m);
        AbstractC0462a.a0(parcel, 3, 8);
        parcel.writeLong(this.f4765n);
        AbstractC0462a.a0(parcel, 4, 4);
        int i5 = this.f4766o;
        parcel.writeInt(i5);
        AbstractC0462a.U(parcel, 5, this.f4767p, i4);
        int i6 = i5 >= 1000 ? 0 : 1;
        AbstractC0462a.a0(parcel, 6, 4);
        parcel.writeInt(i6);
        AbstractC0462a.Y(parcel, X3);
    }
}
