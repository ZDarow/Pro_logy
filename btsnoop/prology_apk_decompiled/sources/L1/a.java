package L1;

import B2.AbstractC0007h;
import O1.s;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class a extends P1.a {

    /* renamed from: l, reason: collision with root package name */
    public final int f1054l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1055m;

    /* renamed from: n, reason: collision with root package name */
    public final PendingIntent f1056n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1057o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f1053p = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new F.i(8);

    public a(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f1054l = i4;
        this.f1055m = i5;
        this.f1056n = pendingIntent;
        this.f1057o = str;
    }

    public static String d(int i4) {
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
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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
                        return AbstractC0007h.j(i4, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1055m == aVar.f1055m && s.f(this.f1056n, aVar.f1056n) && s.f(this.f1057o, aVar.f1057o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1055m), this.f1056n, this.f1057o});
    }

    public final String toString() {
        B1.d dVar = new B1.d(this);
        dVar.i(d(this.f1055m), "statusCode");
        dVar.i(this.f1056n, "resolution");
        dVar.i(this.f1057o, "message");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1054l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f1055m);
        AbstractC0462a.S(parcel, 3, this.f1056n, i4);
        AbstractC0462a.T(parcel, 4, this.f1057o);
        AbstractC0462a.Y(parcel, X3);
    }

    public a(int i4) {
        this(1, i4, null, null);
    }

    public a(int i4, PendingIntent pendingIntent) {
        this(1, i4, pendingIntent, null);
    }
}
