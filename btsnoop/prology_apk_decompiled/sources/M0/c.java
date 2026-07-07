package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new F.i(12);

    /* renamed from: m, reason: collision with root package name */
    public final String f1119m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1120n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1121o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1122p;

    /* renamed from: q, reason: collision with root package name */
    public final long f1123q;

    /* renamed from: r, reason: collision with root package name */
    public final i[] f1124r;

    public c(String str, int i4, int i5, long j4, long j5, i[] iVarArr) {
        super("CHAP");
        this.f1119m = str;
        this.f1120n = i4;
        this.f1121o = i5;
        this.f1122p = j4;
        this.f1123q = j5;
        this.f1124r = iVarArr;
    }

    @Override // M0.i, android.os.Parcelable
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
        c cVar = (c) obj;
        return this.f1120n == cVar.f1120n && this.f1121o == cVar.f1121o && this.f1122p == cVar.f1122p && this.f1123q == cVar.f1123q && y.a(this.f1119m, cVar.f1119m) && Arrays.equals(this.f1124r, cVar.f1124r);
    }

    public final int hashCode() {
        int i4 = (((((((527 + this.f1120n) * 31) + this.f1121o) * 31) + ((int) this.f1122p)) * 31) + ((int) this.f1123q)) * 31;
        String str = this.f1119m;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1119m);
        parcel.writeInt(this.f1120n);
        parcel.writeInt(this.f1121o);
        parcel.writeLong(this.f1122p);
        parcel.writeLong(this.f1123q);
        i[] iVarArr = this.f1124r;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1119m = readString;
        this.f1120n = parcel.readInt();
        this.f1121o = parcel.readInt();
        this.f1122p = parcel.readLong();
        this.f1123q = parcel.readLong();
        int readInt = parcel.readInt();
        this.f1124r = new i[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f1124r[i5] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
