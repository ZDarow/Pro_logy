package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new F.i(14);

    /* renamed from: m, reason: collision with root package name */
    public final String f1130m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1131n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1132o;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f1130m = str;
        this.f1131n = str2;
        this.f1132o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return y.a(this.f1131n, eVar.f1131n) && y.a(this.f1130m, eVar.f1130m) && y.a(this.f1132o, eVar.f1132o);
    }

    public final int hashCode() {
        String str = this.f1130m;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1131n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1132o;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": language=" + this.f1130m + ", description=" + this.f1131n + ", text=" + this.f1132o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1142l);
        parcel.writeString(this.f1130m);
        parcel.writeString(this.f1132o);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1130m = readString;
        this.f1131n = parcel.readString();
        this.f1132o = parcel.readString();
    }
}
