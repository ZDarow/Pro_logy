package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new F.i(18);

    /* renamed from: m, reason: collision with root package name */
    public final String f1152m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f1153n;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f1152m = str;
        this.f1153n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return y.a(this.f1152m, mVar.f1152m) && Arrays.equals(this.f1153n, mVar.f1153n);
    }

    public final int hashCode() {
        String str = this.f1152m;
        return Arrays.hashCode(this.f1153n) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": owner=" + this.f1152m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1152m);
        parcel.writeByteArray(this.f1153n);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i4 = y.f2709a;
        this.f1152m = readString;
        this.f1153n = parcel.createByteArray();
    }
}
