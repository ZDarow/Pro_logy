package g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a2.g(11);

    /* renamed from: l, reason: collision with root package name */
    public final int f5795l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5796m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5797n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5798o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5799p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5800q;

    public s(int i4, int i5, String str, String str2, String str3, String str4) {
        this.f5795l = i4;
        this.f5796m = i5;
        this.f5797n = str;
        this.f5798o = str2;
        this.f5799p = str3;
        this.f5800q = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5795l == sVar.f5795l && this.f5796m == sVar.f5796m && TextUtils.equals(this.f5797n, sVar.f5797n) && TextUtils.equals(this.f5798o, sVar.f5798o) && TextUtils.equals(this.f5799p, sVar.f5799p) && TextUtils.equals(this.f5800q, sVar.f5800q);
    }

    public final int hashCode() {
        int i4 = ((this.f5795l * 31) + this.f5796m) * 31;
        String str = this.f5797n;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5798o;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5799p;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5800q;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f5795l);
        parcel.writeInt(this.f5796m);
        parcel.writeString(this.f5797n);
        parcel.writeString(this.f5798o);
        parcel.writeString(this.f5799p);
        parcel.writeString(this.f5800q);
    }

    public s(Parcel parcel) {
        this.f5795l = parcel.readInt();
        this.f5796m = parcel.readInt();
        this.f5797n = parcel.readString();
        this.f5798o = parcel.readString();
        this.f5799p = parcel.readString();
        this.f5800q = parcel.readString();
    }
}
