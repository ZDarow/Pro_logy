package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new F.i(15);

    /* renamed from: m, reason: collision with root package name */
    public final String f1133m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1134n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1135o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f1136p;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1133m = str;
        this.f1134n = str2;
        this.f1135o = str3;
        this.f1136p = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return y.a(this.f1133m, fVar.f1133m) && y.a(this.f1134n, fVar.f1134n) && y.a(this.f1135o, fVar.f1135o) && Arrays.equals(this.f1136p, fVar.f1136p);
    }

    public final int hashCode() {
        String str = this.f1133m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1134n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1135o;
        return Arrays.hashCode(this.f1136p) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": mimeType=" + this.f1133m + ", filename=" + this.f1134n + ", description=" + this.f1135o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1133m);
        parcel.writeString(this.f1134n);
        parcel.writeString(this.f1135o);
        parcel.writeByteArray(this.f1136p);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1133m = readString;
        this.f1134n = parcel.readString();
        this.f1135o = parcel.readString();
        this.f1136p = parcel.createByteArray();
    }
}
