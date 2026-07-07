package K0;

import F.i;
import T.D;
import T.F;
import T.H;
import W.r;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import e2.d;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements F {
    public static final Parcelable.Creator<a> CREATOR = new i(4);

    /* renamed from: l, reason: collision with root package name */
    public final int f936l;

    /* renamed from: m, reason: collision with root package name */
    public final String f937m;

    /* renamed from: n, reason: collision with root package name */
    public final String f938n;

    /* renamed from: o, reason: collision with root package name */
    public final int f939o;

    /* renamed from: p, reason: collision with root package name */
    public final int f940p;

    /* renamed from: q, reason: collision with root package name */
    public final int f941q;

    /* renamed from: r, reason: collision with root package name */
    public final int f942r;
    public final byte[] s;

    public a(int i4, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f936l = i4;
        this.f937m = str;
        this.f938n = str2;
        this.f939o = i5;
        this.f940p = i6;
        this.f941q = i7;
        this.f942r = i8;
        this.s = bArr;
    }

    public static a d(r rVar) {
        int h4 = rVar.h();
        String l4 = H.l(rVar.s(rVar.h(), d.f5434a));
        String s = rVar.s(rVar.h(), d.f5436c);
        int h5 = rVar.h();
        int h6 = rVar.h();
        int h7 = rVar.h();
        int h8 = rVar.h();
        int h9 = rVar.h();
        byte[] bArr = new byte[h9];
        rVar.f(bArr, 0, h9);
        return new a(h4, l4, s, h5, h6, h7, h8, bArr);
    }

    @Override // T.F
    public final void c(D d4) {
        d4.a(this.s, this.f936l);
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
        return this.f936l == aVar.f936l && this.f937m.equals(aVar.f937m) && this.f938n.equals(aVar.f938n) && this.f939o == aVar.f939o && this.f940p == aVar.f940p && this.f941q == aVar.f941q && this.f942r == aVar.f942r && Arrays.equals(this.s, aVar.s);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s) + ((((((((((this.f938n.hashCode() + ((this.f937m.hashCode() + ((527 + this.f936l) * 31)) * 31)) * 31) + this.f939o) * 31) + this.f940p) * 31) + this.f941q) * 31) + this.f942r) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f937m + ", description=" + this.f938n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f936l);
        parcel.writeString(this.f937m);
        parcel.writeString(this.f938n);
        parcel.writeInt(this.f939o);
        parcel.writeInt(this.f940p);
        parcel.writeInt(this.f941q);
        parcel.writeInt(this.f942r);
        parcel.writeByteArray(this.s);
    }

    public a(Parcel parcel) {
        this.f936l = parcel.readInt();
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f937m = readString;
        this.f938n = parcel.readString();
        this.f939o = parcel.readInt();
        this.f940p = parcel.readInt();
        this.f941q = parcel.readInt();
        this.f942r = parcel.readInt();
        this.s = parcel.createByteArray();
    }
}
