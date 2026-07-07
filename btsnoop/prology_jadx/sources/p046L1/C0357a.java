package p046L1;

/* renamed from: L1.a */
/* loaded from: classes.dex */
public final class C0357a extends p062P1.AbstractC0527a {

    /* renamed from: l */
    public final int f1093l;

    /* renamed from: m */
    public final int f1094m;

    /* renamed from: n */
    public final android.app.PendingIntent f1095n;

    /* renamed from: o */
    public final java.lang.String f1096o;

    /* renamed from: p */
    public static final p046L1.C0357a f1092p = new p046L1.C0357a(0);
    public static final android.os.Parcelable.Creator<p046L1.C0357a> CREATOR = new p024F.C0206i(8);

    public C0357a(int i4, int i5, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.f1093l = i4;
        this.f1094m = i5;
        this.f1095n = pendingIntent;
        this.f1096o = str;
    }

    /* renamed from: d */
    public static java.lang.String m803d(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return p009B2.AbstractC0051h.m151j(i4, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p046L1.C0357a)) {
            return false;
        }
        p046L1.C0357a c0357a = (p046L1.C0357a) obj;
        return this.f1094m == c0357a.f1094m && p058O1.AbstractC0515s.m1019f(this.f1095n, c0357a.f1095n) && p058O1.AbstractC0515s.m1019f(this.f1096o, c0357a.f1096o);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f1094m), this.f1095n, this.f1096o});
    }

    public final java.lang.String toString() {
        p008B1.C0026d c0026d = new p008B1.C0026d(this);
        c0026d.m108i(m803d(this.f1094m), "statusCode");
        c0026d.m108i(this.f1095n, "resolution");
        c0026d.m108i(this.f1096o, "message");
        return c0026d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1093l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f1094m);
        p176p1.AbstractC1949a.m3916S(parcel, 3, this.f1095n, i4);
        p176p1.AbstractC1949a.m3917T(parcel, 4, this.f1096o);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }

    public C0357a(int i4) {
        this(1, i4, null, null);
    }

    public C0357a(int i4, android.app.PendingIntent pendingIntent) {
        this(1, i4, pendingIntent, null);
    }
}
