package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new F.i(17);

    /* renamed from: m, reason: collision with root package name */
    public final int f1147m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1148n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1149o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f1150p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f1151q;

    public l(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1147m = i4;
        this.f1148n = i5;
        this.f1149o = i6;
        this.f1150p = iArr;
        this.f1151q = iArr2;
    }

    @Override // M0.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1147m == lVar.f1147m && this.f1148n == lVar.f1148n && this.f1149o == lVar.f1149o && Arrays.equals(this.f1150p, lVar.f1150p) && Arrays.equals(this.f1151q, lVar.f1151q);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1151q) + ((Arrays.hashCode(this.f1150p) + ((((((527 + this.f1147m) * 31) + this.f1148n) * 31) + this.f1149o) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1147m);
        parcel.writeInt(this.f1148n);
        parcel.writeInt(this.f1149o);
        parcel.writeIntArray(this.f1150p);
        parcel.writeIntArray(this.f1151q);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f1147m = parcel.readInt();
        this.f1148n = parcel.readInt();
        this.f1149o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i4 = y.f2709a;
        this.f1150p = createIntArray;
        this.f1151q = parcel.createIntArray();
    }
}
