package M0;

import T.D;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new F.i(10);

    /* renamed from: m, reason: collision with root package name */
    public final String f1114m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1115n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1116o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f1117p;

    public a(String str, String str2, int i4, byte[] bArr) {
        super("APIC");
        this.f1114m = str;
        this.f1115n = str2;
        this.f1116o = i4;
        this.f1117p = bArr;
    }

    @Override // T.F
    public final void c(D d4) {
        d4.a(this.f1117p, this.f1116o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1116o == aVar.f1116o && y.a(this.f1114m, aVar.f1114m) && y.a(this.f1115n, aVar.f1115n) && Arrays.equals(this.f1117p, aVar.f1117p);
    }

    public final int hashCode() {
        int i4 = (527 + this.f1116o) * 31;
        String str = this.f1114m;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1115n;
        return Arrays.hashCode(this.f1117p) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": mimeType=" + this.f1114m + ", description=" + this.f1115n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1114m);
        parcel.writeString(this.f1115n);
        parcel.writeInt(this.f1116o);
        parcel.writeByteArray(this.f1117p);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1114m = readString;
        this.f1115n = parcel.readString();
        this.f1116o = parcel.readInt();
        this.f1117p = parcel.createByteArray();
    }
}
