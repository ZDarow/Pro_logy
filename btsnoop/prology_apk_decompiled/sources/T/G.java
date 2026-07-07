package T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new O0.g(14);

    /* renamed from: l, reason: collision with root package name */
    public final F[] f2118l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2119m;

    public G(F... fArr) {
        this(-9223372036854775807L, fArr);
    }

    public final G d(F... fArr) {
        if (fArr.length == 0) {
            return this;
        }
        int i4 = W.y.f2709a;
        F[] fArr2 = this.f2118l;
        Object[] copyOf = Arrays.copyOf(fArr2, fArr2.length + fArr.length);
        System.arraycopy(fArr, 0, copyOf, fArr2.length, fArr.length);
        return new G(this.f2119m, (F[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final G e(G g4) {
        return g4 == null ? this : d(g4.f2118l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g4 = (G) obj;
        return Arrays.equals(this.f2118l, g4.f2118l) && this.f2119m == g4.f2119m;
    }

    public final F f(int i4) {
        return this.f2118l[i4];
    }

    public final int g() {
        return this.f2118l.length;
    }

    public final int hashCode() {
        return AbstractC0462a.z(this.f2119m) + (Arrays.hashCode(this.f2118l) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f2118l));
        long j4 = this.f2119m;
        if (j4 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j4;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        F[] fArr = this.f2118l;
        parcel.writeInt(fArr.length);
        for (F f4 : fArr) {
            parcel.writeParcelable(f4, 0);
        }
        parcel.writeLong(this.f2119m);
    }

    public G(long j4, F... fArr) {
        this.f2119m = j4;
        this.f2118l = fArr;
    }

    public G(List list) {
        this((F[]) list.toArray(new F[0]));
    }

    public G(Parcel parcel) {
        this.f2118l = new F[parcel.readInt()];
        int i4 = 0;
        while (true) {
            F[] fArr = this.f2118l;
            if (i4 < fArr.length) {
                fArr[i4] = (F) parcel.readParcelable(F.class.getClassLoader());
                i4++;
            } else {
                this.f2119m = parcel.readLong();
                return;
            }
        }
    }
}
