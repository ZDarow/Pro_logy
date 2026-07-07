package com.google.android.gms.common.api;

import B1.d;
import B2.AbstractC0007h;
import F.i;
import L.k;
import O1.s;
import P1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new i(22);

    /* renamed from: l, reason: collision with root package name */
    public final int f4737l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4738m;

    /* renamed from: n, reason: collision with root package name */
    public final PendingIntent f4739n;

    /* renamed from: o, reason: collision with root package name */
    public final L1.a f4740o;

    public Status(int i4, String str, PendingIntent pendingIntent, L1.a aVar) {
        this.f4737l = i4;
        this.f4738m = str;
        this.f4739n = pendingIntent;
        this.f4740o = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4737l == status.f4737l && s.f(this.f4738m, status.f4738m) && s.f(this.f4739n, status.f4739n) && s.f(this.f4740o, status.f4740o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4737l), this.f4738m, this.f4739n, this.f4740o});
    }

    public final String toString() {
        d dVar = new d(this);
        String str = this.f4738m;
        if (str == null) {
            int i4 = this.f4737l;
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
                    str = AbstractC0007h.k("unknown status code: ", i4);
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    str = "SERVICE_DISABLED";
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case k.BYTES_FIELD_NUMBER /* 8 */:
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
        dVar.i(str, "statusCode");
        dVar.i(this.f4739n, "resolution");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4737l);
        AbstractC0462a.T(parcel, 2, this.f4738m);
        AbstractC0462a.S(parcel, 3, this.f4739n, i4);
        AbstractC0462a.S(parcel, 4, this.f4740o, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
