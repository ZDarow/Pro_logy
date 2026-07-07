package L0;

import F.i;
import T.D;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements F {
    public static final Parcelable.Creator<c> CREATOR = new i(7);

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f1050l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1051m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1052n;

    public c(String str, String str2, byte[] bArr) {
        this.f1050l = bArr;
        this.f1051m = str;
        this.f1052n = str2;
    }

    @Override // T.F
    public final void c(D d4) {
        String str = this.f1051m;
        if (str != null) {
            d4.f2074a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1050l, ((c) obj).f1050l);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1050l);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f1051m + "\", url=\"" + this.f1052n + "\", rawMetadata.length=\"" + this.f1050l.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByteArray(this.f1050l);
        parcel.writeString(this.f1051m);
        parcel.writeString(this.f1052n);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f1050l = createByteArray;
        this.f1051m = parcel.readString();
        this.f1052n = parcel.readString();
    }
}
