package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Status extends p062P1.AbstractC0527a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new p024F.C0206i(22);

    /* renamed from: l */
    public final int f4910l;

    /* renamed from: m */
    public final java.lang.String f4911m;

    /* renamed from: n */
    public final android.app.PendingIntent f4912n;

    /* renamed from: o */
    public final p046L1.C0357a f4913o;

    public Status(int i4, java.lang.String str, android.app.PendingIntent pendingIntent, p046L1.C0357a c0357a) {
        this.f4910l = i4;
        this.f4911m = str;
        this.f4912n = pendingIntent;
        this.f4913o = c0357a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f4910l == status.f4910l && p058O1.AbstractC0515s.m1019f(this.f4911m, status.f4911m) && p058O1.AbstractC0515s.m1019f(this.f4912n, status.f4912n) && p058O1.AbstractC0515s.m1019f(this.f4913o, status.f4913o);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f4910l), this.f4911m, this.f4912n, this.f4913o});
    }

    public final java.lang.String toString() {
        p008B1.C0026d c0026d = new p008B1.C0026d(this);
        java.lang.String str = this.f4911m;
        if (str == null) {
            int i4 = this.f4910l;
            switch (i4) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = p009B2.AbstractC0051h.m152k("unknown status code: ", i4);
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    str = "SERVICE_DISABLED";
                    break;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c0026d.m108i(str, "statusCode");
        c0026d.m108i(this.f4912n, "resolution");
        return c0026d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4910l);
        p176p1.AbstractC1949a.m3917T(parcel, 2, this.f4911m);
        p176p1.AbstractC1949a.m3916S(parcel, 3, this.f4912n, i4);
        p176p1.AbstractC1949a.m3916S(parcel, 4, this.f4913o, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
