package N0;

import F.i;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements F {
    public static final Parcelable.Creator<c> CREATOR = new i(24);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1236l;

    public c(ArrayList arrayList) {
        this.f1236l = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j4 = ((b) arrayList.get(0)).f1234m;
            int i4 = 1;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i4)).f1233l < j4) {
                    z4 = true;
                    break;
                } else {
                    j4 = ((b) arrayList.get(i4)).f1234m;
                    i4++;
                }
            }
        }
        W.a.e(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f1236l.equals(((c) obj).f1236l);
    }

    public final int hashCode() {
        return this.f1236l.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f1236l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeList(this.f1236l);
    }
}
