package com.google.android.gms.location;

import O0.g;
import O1.s;
import P1.a;
import Y1.j;
import Y1.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new g(26);

    /* renamed from: l, reason: collision with root package name */
    public int f4768l;

    /* renamed from: m, reason: collision with root package name */
    public long f4769m;

    /* renamed from: n, reason: collision with root package name */
    public long f4770n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4771o;

    /* renamed from: p, reason: collision with root package name */
    public final long f4772p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4773q;

    /* renamed from: r, reason: collision with root package name */
    public float f4774r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public long f4775t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4776u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4777v;
    public final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final WorkSource f4778x;

    /* renamed from: y, reason: collision with root package name */
    public final j f4779y;

    public LocationRequest(int i4, long j4, long j5, long j6, long j7, long j8, int i5, float f4, boolean z4, long j9, int i6, int i7, boolean z5, WorkSource workSource, j jVar) {
        long j10;
        this.f4768l = i4;
        if (i4 == 105) {
            this.f4769m = Long.MAX_VALUE;
            j10 = j4;
        } else {
            j10 = j4;
            this.f4769m = j10;
        }
        this.f4770n = j5;
        this.f4771o = j6;
        this.f4772p = j7 == Long.MAX_VALUE ? j8 : Math.min(Math.max(1L, j7 - SystemClock.elapsedRealtime()), j8);
        this.f4773q = i5;
        this.f4774r = f4;
        this.s = z4;
        this.f4775t = j9 != -1 ? j9 : j10;
        this.f4776u = i6;
        this.f4777v = i7;
        this.w = z5;
        this.f4778x = workSource;
        this.f4779y = jVar;
    }

    public static String e(long j4) {
        String sb;
        if (j4 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = n.f3113b;
        synchronized (sb2) {
            sb2.setLength(0);
            n.a(j4, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean d() {
        long j4 = this.f4771o;
        return j4 > 0 && (j4 >> 1) >= this.f4769m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i4 = this.f4768l;
            if (i4 == locationRequest.f4768l && ((i4 == 105 || this.f4769m == locationRequest.f4769m) && this.f4770n == locationRequest.f4770n && d() == locationRequest.d() && ((!d() || this.f4771o == locationRequest.f4771o) && this.f4772p == locationRequest.f4772p && this.f4773q == locationRequest.f4773q && this.f4774r == locationRequest.f4774r && this.s == locationRequest.s && this.f4776u == locationRequest.f4776u && this.f4777v == locationRequest.f4777v && this.w == locationRequest.w && this.f4778x.equals(locationRequest.f4778x) && s.f(this.f4779y, locationRequest.f4779y)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4768l), Long.valueOf(this.f4769m), Long.valueOf(this.f4770n), this.f4778x});
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
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        int i5 = this.f4768l;
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(i5);
        long j4 = this.f4769m;
        AbstractC0462a.a0(parcel, 2, 8);
        parcel.writeLong(j4);
        long j5 = this.f4770n;
        AbstractC0462a.a0(parcel, 3, 8);
        parcel.writeLong(j5);
        AbstractC0462a.a0(parcel, 6, 4);
        parcel.writeInt(this.f4773q);
        float f4 = this.f4774r;
        AbstractC0462a.a0(parcel, 7, 4);
        parcel.writeFloat(f4);
        AbstractC0462a.a0(parcel, 8, 8);
        parcel.writeLong(this.f4771o);
        AbstractC0462a.a0(parcel, 9, 4);
        parcel.writeInt(this.s ? 1 : 0);
        AbstractC0462a.a0(parcel, 10, 8);
        parcel.writeLong(this.f4772p);
        long j6 = this.f4775t;
        AbstractC0462a.a0(parcel, 11, 8);
        parcel.writeLong(j6);
        AbstractC0462a.a0(parcel, 12, 4);
        parcel.writeInt(this.f4776u);
        AbstractC0462a.a0(parcel, 13, 4);
        parcel.writeInt(this.f4777v);
        AbstractC0462a.a0(parcel, 15, 4);
        parcel.writeInt(this.w ? 1 : 0);
        AbstractC0462a.S(parcel, 16, this.f4778x, i4);
        AbstractC0462a.S(parcel, 17, this.f4779y, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
