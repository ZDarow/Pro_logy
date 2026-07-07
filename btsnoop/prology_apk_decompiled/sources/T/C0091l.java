package T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: T.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091l implements Parcelable {
    public static final Parcelable.Creator<C0091l> CREATOR = new O0.g(13);

    /* renamed from: l, reason: collision with root package name */
    public int f2260l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f2261m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2262n;

    /* renamed from: o, reason: collision with root package name */
    public final String f2263o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f2264p;

    public C0091l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2261m = uuid;
        this.f2262n = str;
        str2.getClass();
        this.f2263o = H.l(str2);
        this.f2264p = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0091l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0091l c0091l = (C0091l) obj;
        return W.y.a(this.f2262n, c0091l.f2262n) && W.y.a(this.f2263o, c0091l.f2263o) && W.y.a(this.f2261m, c0091l.f2261m) && Arrays.equals(this.f2264p, c0091l.f2264p);
    }

    public final int hashCode() {
        if (this.f2260l == 0) {
            int hashCode = this.f2261m.hashCode() * 31;
            String str = this.f2262n;
            this.f2260l = Arrays.hashCode(this.f2264p) + ((this.f2263o.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }
        return this.f2260l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        UUID uuid = this.f2261m;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2262n);
        parcel.writeString(this.f2263o);
        parcel.writeByteArray(this.f2264p);
    }

    public C0091l(Parcel parcel) {
        this.f2261m = new UUID(parcel.readLong(), parcel.readLong());
        this.f2262n = parcel.readString();
        String readString = parcel.readString();
        int i4 = W.y.f2709a;
        this.f2263o = readString;
        this.f2264p = parcel.createByteArray();
    }
}
