package K0;

import F.i;
import L.k;
import T.D;
import T.F;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class b implements F {
    public static final Parcelable.Creator<b> CREATOR = new i(5);

    /* renamed from: l, reason: collision with root package name */
    public final String f943l;

    /* renamed from: m, reason: collision with root package name */
    public final String f944m;

    public b(String str, String str2) {
        this.f943l = U1.a.L(str);
        this.f944m = str2;
    }

    @Override // T.F
    public final void c(D d4) {
        String str = this.f943l;
        str.getClass();
        String str2 = this.f944m;
        char c4 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c4 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c4 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c4 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                d4.f2076c = str2;
                return;
            case 1:
                d4.f2074a = str2;
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                d4.f2078e = str2;
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                d4.f2077d = str2;
                return;
            case k.LONG_FIELD_NUMBER /* 4 */:
                d4.f2075b = str2;
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f943l.equals(bVar.f943l) && this.f944m.equals(bVar.f944m);
    }

    public final int hashCode() {
        return this.f944m.hashCode() + ((this.f943l.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f943l + "=" + this.f944m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f943l);
        parcel.writeString(this.f944m);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f943l = readString;
        this.f944m = parcel.readString();
    }
}
