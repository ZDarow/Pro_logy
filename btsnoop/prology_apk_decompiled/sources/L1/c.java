package L1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class c extends P1.a {
    public static final Parcelable.Creator<c> CREATOR = new F.i(9);

    /* renamed from: l, reason: collision with root package name */
    public final String f1061l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1062m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1063n;

    public c(long j4, String str, int i4) {
        this.f1061l = str;
        this.f1062m = i4;
        this.f1063n = j4;
    }

    public final long d() {
        long j4 = this.f1063n;
        return j4 == -1 ? this.f1062m : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f1061l;
            if (((str != null && str.equals(cVar.f1061l)) || (str == null && cVar.f1061l == null)) && d() == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1061l, Long.valueOf(d())});
    }

    public final String toString() {
        B1.d dVar = new B1.d(this);
        dVar.i(this.f1061l, "name");
        dVar.i(Long.valueOf(d()), "version");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.T(parcel, 1, this.f1061l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f1062m);
        long d4 = d();
        AbstractC0462a.a0(parcel, 3, 8);
        parcel.writeLong(d4);
        AbstractC0462a.Y(parcel, X3);
    }

    public c(String str, long j4) {
        this.f1061l = str;
        this.f1063n = j4;
        this.f1062m = -1;
    }
}
