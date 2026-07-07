package com.google.android.gms.location;

import O0.g;
import O1.s;
import P1.a;
import Y1.n;
import a2.h;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p1.AbstractC0462a;
import r.e;

/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: l, reason: collision with root package name */
    public final List f4781l;

    /* renamed from: m, reason: collision with root package name */
    public static final List f4780m = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new g(27);

    public LocationResult(List list) {
        this.f4781l = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i4 = Build.VERSION.SDK_INT;
        List<Location> list = this.f4781l;
        if (i4 >= 31) {
            return list.equals(locationResult.f4781l);
        }
        if (list.size() != locationResult.f4781l.size()) {
            return false;
        }
        Iterator it = locationResult.f4781l.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !s.f(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4781l});
    }

    public final String toString() {
        String l4;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = h.f3616a;
        List<Location> list = this.f4781l;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z4 = false;
        for (Location location : list) {
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (Build.VERSION.SDK_INT >= 31 ? e.a(location) : location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = h.f3616a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean hasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = h.f3617b;
                if (hasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string = extras != null ? extras.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                Bundle extras2 = location.getExtras();
                String string2 = extras2 != null ? extras2.getString("levelId") : null;
                if (string2 != null) {
                    sb.append(", lv=");
                    sb.append(string2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    l4 = n.f3112a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = n.f3112a;
                    l4 = Long.toString(millis);
                }
                sb.append(l4);
                sb.append('}');
            }
            sb.append(", ");
            z4 = true;
        }
        if (z4) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.V(parcel, 1, this.f4781l);
        AbstractC0462a.Y(parcel, X3);
    }
}
