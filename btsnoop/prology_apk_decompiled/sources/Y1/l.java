package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class l extends P1.a {
    public static final Parcelable.Creator<l> CREATOR = new O0.g(20);

    /* renamed from: l, reason: collision with root package name */
    public final LocationRequest f3104l;

    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(com.google.android.gms.location.LocationRequest r33, java.util.ArrayList r34, boolean r35, boolean r36, boolean r37, boolean r38, long r39) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.l.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return O1.s.f(this.f3104l, ((l) obj).f3104l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3104l.hashCode();
    }

    public final String toString() {
        return this.f3104l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.S(parcel, 1, this.f3104l, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
