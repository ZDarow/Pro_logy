package com.google.android.gms.location;

/* loaded from: classes.dex */
public final class LocationResult extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* renamed from: l */
    public final java.util.List f4958l;

    /* renamed from: m */
    public static final java.util.List f4957m = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationResult> CREATOR = new p057O0.C0488g(27);

    public LocationResult(java.util.List list) {
        this.f4958l = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationResult)) {
            return false;
        }
        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) obj;
        int i4 = android.os.Build.VERSION.SDK_INT;
        java.util.List<android.location.Location> list = this.f4958l;
        if (i4 >= 31) {
            return list.equals(locationResult.f4958l);
        }
        if (list.size() != locationResult.f4958l.size()) {
            return false;
        }
        java.util.Iterator it = locationResult.f4958l.iterator();
        for (android.location.Location location : list) {
            android.location.Location location2 = (android.location.Location) it.next();
            if (java.lang.Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || java.lang.Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !p058O1.AbstractC0515s.m1019f(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f4958l});
    }

    public final java.lang.String toString() {
        java.lang.String l4;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationResult");
        java.text.DecimalFormat decimalFormat = p104a2.AbstractC1010h.f3740a;
        java.util.List<android.location.Location> list = this.f4958l;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z4 = false;
        for (android.location.Location location : list) {
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((java.lang.String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (android.os.Build.VERSION.SDK_INT >= 31 ? p183r.AbstractC2037e.m4093a(location) : location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                java.text.DecimalFormat decimalFormat2 = p104a2.AbstractC1010h.f3740a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean hasAccuracy = location.hasAccuracy();
                java.text.DecimalFormat decimalFormat3 = p104a2.AbstractC1010h.f3741b;
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
                android.os.Bundle extras = location.getExtras();
                java.lang.String string = extras != null ? extras.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                android.os.Bundle extras2 = location.getExtras();
                java.lang.String string2 = extras2 != null ? extras2.getString("levelId") : null;
                if (string2 != null) {
                    sb.append(", lv=");
                    sb.append(string2);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    l4 = p096Y1.AbstractC0903n.f3223a.format(new java.util.Date(millis));
                } else {
                    java.text.SimpleDateFormat simpleDateFormat = p096Y1.AbstractC0903n.f3223a;
                    l4 = java.lang.Long.toString(millis);
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
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3919V(parcel, 1, this.f4958l);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
