package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new F.i(13);

    /* renamed from: m, reason: collision with root package name */
    public final String f1125m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1126n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1127o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f1128p;

    /* renamed from: q, reason: collision with root package name */
    public final i[] f1129q;

    public d(String str, boolean z4, boolean z5, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f1125m = str;
        this.f1126n = z4;
        this.f1127o = z5;
        this.f1128p = strArr;
        this.f1129q = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1126n == dVar.f1126n && this.f1127o == dVar.f1127o && y.a(this.f1125m, dVar.f1125m) && Arrays.equals(this.f1128p, dVar.f1128p) && Arrays.equals(this.f1129q, dVar.f1129q);
    }

    public final int hashCode() {
        int i4 = (((527 + (this.f1126n ? 1 : 0)) * 31) + (this.f1127o ? 1 : 0)) * 31;
        String str = this.f1125m;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1125m);
        parcel.writeByte(this.f1126n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1127o ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f1128p);
        i[] iVarArr = this.f1129q;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1125m = readString;
        this.f1126n = parcel.readByte() != 0;
        this.f1127o = parcel.readByte() != 0;
        this.f1128p = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f1129q = new i[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f1129q[i5] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
