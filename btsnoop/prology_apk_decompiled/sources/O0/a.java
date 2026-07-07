package O0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new F.i(27);

    /* renamed from: l, reason: collision with root package name */
    public final long f1358l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1359m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f1360n;

    public a(long j4, byte[] bArr, long j5) {
        this.f1358l = j5;
        this.f1359m = j4;
        this.f1360n = bArr;
    }

    @Override // O0.b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f1358l + ", identifier= " + this.f1359m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1358l);
        parcel.writeLong(this.f1359m);
        parcel.writeByteArray(this.f1360n);
    }

    public a(Parcel parcel) {
        this.f1358l = parcel.readLong();
        this.f1359m = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i4 = y.f2709a;
        this.f1360n = createByteArray;
    }
}
