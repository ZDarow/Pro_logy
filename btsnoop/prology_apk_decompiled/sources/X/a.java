package X;

import T.F;
import W.y;
import a.AbstractC0110a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements F {
    public static final Parcelable.Creator<a> CREATOR = new O0.g(16);

    /* renamed from: l, reason: collision with root package name */
    public final String f2819l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f2820m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2821n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2822o;

    public a(String str, byte[] bArr, int i4, int i5) {
        this.f2819l = str;
        this.f2820m = bArr;
        this.f2821n = i4;
        this.f2822o = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2819l.equals(aVar.f2819l) && Arrays.equals(this.f2820m, aVar.f2820m) && this.f2821n == aVar.f2821n && this.f2822o == aVar.f2822o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2820m) + ((this.f2819l.hashCode() + 527) * 31)) * 31) + this.f2821n) * 31) + this.f2822o;
    }

    public final String toString() {
        byte[] bArr = this.f2820m;
        int i4 = this.f2822o;
        return "mdta: key=" + this.f2819l + ", value=" + (i4 != 1 ? i4 != 23 ? i4 != 67 ? y.Y(bArr) : String.valueOf(AbstractC0110a.x(bArr)) : String.valueOf(Float.intBitsToFloat(AbstractC0110a.x(bArr))) : y.p(bArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f2819l);
        parcel.writeByteArray(this.f2820m);
        parcel.writeInt(this.f2821n);
        parcel.writeInt(this.f2822o);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f2819l = readString;
        this.f2820m = parcel.createByteArray();
        this.f2821n = parcel.readInt();
        this.f2822o = parcel.readInt();
    }
}
