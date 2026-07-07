package M0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new F.i(11);

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f1118m;

    public b(String str, byte[] bArr) {
        super(str);
        this.f1118m = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1142l.equals(bVar.f1142l) && Arrays.equals(this.f1118m, bVar.f1118m);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1118m) + ((this.f1142l.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1142l);
        parcel.writeByteArray(this.f1118m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = W.y.f2709a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f1118m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.b.<init>(android.os.Parcel):void");
    }
}
