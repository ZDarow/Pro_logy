package com.google.android.gms.location;

/* loaded from: classes.dex */
public final class LocationRequest extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationRequest> CREATOR = new p057O0.C0488g(26);

    /* renamed from: l */
    public int f4943l;

    /* renamed from: m */
    public long f4944m;

    /* renamed from: n */
    public long f4945n;

    /* renamed from: o */
    public final long f4946o;

    /* renamed from: p */
    public final long f4947p;

    /* renamed from: q */
    public final int f4948q;

    /* renamed from: r */
    public float f4949r;

    /* renamed from: s */
    public final boolean f4950s;

    /* renamed from: t */
    public long f4951t;

    /* renamed from: u */
    public final int f4952u;

    /* renamed from: v */
    public final int f4953v;

    /* renamed from: w */
    public final boolean f4954w;

    /* renamed from: x */
    public final android.os.WorkSource f4955x;

    /* renamed from: y */
    public final p096Y1.C0899j f4956y;

    public LocationRequest(int i4, long j4, long j5, long j6, long j7, long j8, int i5, float f4, boolean z4, long j9, int i6, int i7, boolean z5, android.os.WorkSource workSource, p096Y1.C0899j c0899j) {
        long j10;
        this.f4943l = i4;
        if (i4 == 105) {
            this.f4944m = Long.MAX_VALUE;
            j10 = j4;
        } else {
            j10 = j4;
            this.f4944m = j10;
        }
        this.f4945n = j5;
        this.f4946o = j6;
        this.f4947p = j7 == Long.MAX_VALUE ? j8 : java.lang.Math.min(java.lang.Math.max(1L, j7 - android.os.SystemClock.elapsedRealtime()), j8);
        this.f4948q = i5;
        this.f4949r = f4;
        this.f4950s = z4;
        this.f4951t = j9 != -1 ? j9 : j10;
        this.f4952u = i6;
        this.f4953v = i7;
        this.f4954w = z5;
        this.f4955x = workSource;
        this.f4956y = c0899j;
    }

    /* renamed from: e */
    public static java.lang.String m2937e(long j4) {
        java.lang.String sb;
        if (j4 == Long.MAX_VALUE) {
            return "∞";
        }
        java.lang.StringBuilder sb2 = p096Y1.AbstractC0903n.f3224b;
        synchronized (sb2) {
            sb2.setLength(0);
            p096Y1.AbstractC0903n.m1741a(j4, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: d */
    public final boolean m2938d() {
        long j4 = this.f4946o;
        return j4 > 0 && (j4 >> 1) >= this.f4944m;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.LocationRequest) {
            com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
            int i4 = this.f4943l;
            if (i4 == locationRequest.f4943l && ((i4 == 105 || this.f4944m == locationRequest.f4944m) && this.f4945n == locationRequest.f4945n && m2938d() == locationRequest.m2938d() && ((!m2938d() || this.f4946o == locationRequest.f4946o) && this.f4947p == locationRequest.f4947p && this.f4948q == locationRequest.f4948q && this.f4949r == locationRequest.f4949r && this.f4950s == locationRequest.f4950s && this.f4952u == locationRequest.f4952u && this.f4953v == locationRequest.f4953v && this.f4954w == locationRequest.f4954w && this.f4955x.equals(locationRequest.f4955x) && p058O1.AbstractC0515s.m1019f(this.f4956y, locationRequest.f4956y)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f4943l), java.lang.Long.valueOf(this.f4944m), java.lang.Long.valueOf(this.f4945n), this.f4955x});
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        int i5 = this.f4943l;
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(i5);
        long j4 = this.f4944m;
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 8);
        parcel.writeLong(j4);
        long j5 = this.f4945n;
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 8);
        parcel.writeLong(j5);
        p176p1.AbstractC1949a.m3925a0(parcel, 6, 4);
        parcel.writeInt(this.f4948q);
        float f4 = this.f4949r;
        p176p1.AbstractC1949a.m3925a0(parcel, 7, 4);
        parcel.writeFloat(f4);
        p176p1.AbstractC1949a.m3925a0(parcel, 8, 8);
        parcel.writeLong(this.f4946o);
        p176p1.AbstractC1949a.m3925a0(parcel, 9, 4);
        parcel.writeInt(this.f4950s ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 10, 8);
        parcel.writeLong(this.f4947p);
        long j6 = this.f4951t;
        p176p1.AbstractC1949a.m3925a0(parcel, 11, 8);
        parcel.writeLong(j6);
        p176p1.AbstractC1949a.m3925a0(parcel, 12, 4);
        parcel.writeInt(this.f4952u);
        p176p1.AbstractC1949a.m3925a0(parcel, 13, 4);
        parcel.writeInt(this.f4953v);
        p176p1.AbstractC1949a.m3925a0(parcel, 15, 4);
        parcel.writeInt(this.f4954w ? 1 : 0);
        p176p1.AbstractC1949a.m3916S(parcel, 16, this.f4955x, i4);
        p176p1.AbstractC1949a.m3916S(parcel, 17, this.f4956y, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
