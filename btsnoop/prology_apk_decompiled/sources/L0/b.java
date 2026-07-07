package L0;

import F.i;
import T.D;
import T.F;
import W.y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements F {
    public static final Parcelable.Creator<b> CREATOR = new i(6);

    /* renamed from: l, reason: collision with root package name */
    public final int f1044l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1045m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1046n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1047o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1048p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1049q;

    public b(int i4, String str, String str2, String str3, boolean z4, int i5) {
        W.a.e(i5 == -1 || i5 > 0);
        this.f1044l = i4;
        this.f1045m = str;
        this.f1046n = str2;
        this.f1047o = str3;
        this.f1048p = z4;
        this.f1049q = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static L0.b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.b.d(java.util.Map):L0.b");
    }

    @Override // T.F
    public final void c(D d4) {
        String str = this.f1046n;
        if (str != null) {
            d4.f2094v = str;
        }
        String str2 = this.f1045m;
        if (str2 != null) {
            d4.f2093u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1044l == bVar.f1044l && y.a(this.f1045m, bVar.f1045m) && y.a(this.f1046n, bVar.f1046n) && y.a(this.f1047o, bVar.f1047o) && this.f1048p == bVar.f1048p && this.f1049q == bVar.f1049q;
    }

    public final int hashCode() {
        int i4 = (527 + this.f1044l) * 31;
        String str = this.f1045m;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1046n;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1047o;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1048p ? 1 : 0)) * 31) + this.f1049q;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f1046n + "\", genre=\"" + this.f1045m + "\", bitrate=" + this.f1044l + ", metadataInterval=" + this.f1049q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1044l);
        parcel.writeString(this.f1045m);
        parcel.writeString(this.f1046n);
        parcel.writeString(this.f1047o);
        int i5 = y.f2709a;
        parcel.writeInt(this.f1048p ? 1 : 0);
        parcel.writeInt(this.f1049q);
    }

    public b(Parcel parcel) {
        this.f1044l = parcel.readInt();
        this.f1045m = parcel.readString();
        this.f1046n = parcel.readString();
        this.f1047o = parcel.readString();
        int i4 = y.f2709a;
        this.f1048p = parcel.readInt() != 0;
        this.f1049q = parcel.readInt();
    }
}
