package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new F.i(16);

    /* renamed from: m, reason: collision with root package name */
    public final String f1144m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1145n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1146o;

    public k(String str, String str2, String str3) {
        super("----");
        this.f1144m = str;
        this.f1145n = str2;
        this.f1146o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return y.a(this.f1145n, kVar.f1145n) && y.a(this.f1144m, kVar.f1144m) && y.a(this.f1146o, kVar.f1146o);
    }

    public final int hashCode() {
        String str = this.f1144m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1145n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1146o;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": domain=" + this.f1144m + ", description=" + this.f1145n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1142l);
        parcel.writeString(this.f1144m);
        parcel.writeString(this.f1146o);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1144m = readString;
        this.f1145n = parcel.readString();
        this.f1146o = parcel.readString();
    }
}
