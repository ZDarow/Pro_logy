package M0;

import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new F.i(20);

    /* renamed from: m, reason: collision with root package name */
    public final String f1156m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1157n;

    public o(String str, String str2, String str3) {
        super(str);
        this.f1156m = str2;
        this.f1157n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1142l.equals(oVar.f1142l) && y.a(this.f1156m, oVar.f1156m) && y.a(this.f1157n, oVar.f1157n);
    }

    public final int hashCode() {
        int hashCode = (this.f1142l.hashCode() + 527) * 31;
        String str = this.f1156m;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1157n;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1142l + ": url=" + this.f1157n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1142l);
        parcel.writeString(this.f1156m);
        parcel.writeString(this.f1157n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = W.y.f2709a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f1156m = r0
            java.lang.String r3 = r3.readString()
            r2.f1157n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.o.<init>(android.os.Parcel):void");
    }
}
