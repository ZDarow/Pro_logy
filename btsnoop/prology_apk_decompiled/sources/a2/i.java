package a2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class i extends P1.a {
    public static final Parcelable.Creator<i> CREATOR = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public final int f3618l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3619m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3620n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3621o;

    public i(int i4, int i5, long j4, long j5) {
        this.f3618l = i4;
        this.f3619m = i5;
        this.f3620n = j4;
        this.f3621o = j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3618l == iVar.f3618l && this.f3619m == iVar.f3619m && this.f3620n == iVar.f3620n && this.f3621o == iVar.f3621o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3619m), Integer.valueOf(this.f3618l), Long.valueOf(this.f3621o), Long.valueOf(this.f3620n)});
    }

    public final String toString() {
        int i4 = this.f3618l;
        int length = String.valueOf(i4).length();
        int i5 = this.f3619m;
        int length2 = String.valueOf(i5).length();
        long j4 = this.f3621o;
        int length3 = String.valueOf(j4).length();
        long j5 = this.f3620n;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j5).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i4);
        sb.append(" Cell status: ");
        sb.append(i5);
        sb.append(" elapsed time NS: ");
        sb.append(j4);
        sb.append(" system time ms: ");
        sb.append(j5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f3618l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f3619m);
        AbstractC0462a.a0(parcel, 3, 8);
        parcel.writeLong(this.f3620n);
        AbstractC0462a.a0(parcel, 4, 8);
        parcel.writeLong(this.f3621o);
        AbstractC0462a.Y(parcel, X3);
    }
}
