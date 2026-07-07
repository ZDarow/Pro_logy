package com.google.android.gms.location;

/* loaded from: classes.dex */
public final class LocationAvailability extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationAvailability> CREATOR = new p057O0.C0488g(25);

    /* renamed from: l */
    public final int f4938l;

    /* renamed from: m */
    public final int f4939m;

    /* renamed from: n */
    public final long f4940n;

    /* renamed from: o */
    public final int f4941o;

    /* renamed from: p */
    public final p104a2.C1011i[] f4942p;

    public LocationAvailability(int i4, int i5, int i6, long j4, p104a2.C1011i[] c1011iArr) {
        this.f4941o = i4 < 1000 ? 0 : 1000;
        this.f4938l = i5;
        this.f4939m = i6;
        this.f4940n = j4;
        this.f4942p = c1011iArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.LocationAvailability) {
            com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) obj;
            if (this.f4938l == locationAvailability.f4938l && this.f4939m == locationAvailability.f4939m && this.f4940n == locationAvailability.f4940n && this.f4941o == locationAvailability.f4941o && java.util.Arrays.equals(this.f4942p, locationAvailability.f4942p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f4941o)});
    }

    public final java.lang.String toString() {
        boolean z4 = this.f4941o < 1000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(z4).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z4);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4938l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f4939m);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 8);
        parcel.writeLong(this.f4940n);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 4);
        int i5 = this.f4941o;
        parcel.writeInt(i5);
        p176p1.AbstractC1949a.m3918U(parcel, 5, this.f4942p, i4);
        int i6 = i5 >= 1000 ? 0 : 1;
        p176p1.AbstractC1949a.m3925a0(parcel, 6, 4);
        parcel.writeInt(i6);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
