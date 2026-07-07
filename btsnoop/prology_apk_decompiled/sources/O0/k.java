package O0;

import W.r;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public final long f1393l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1394m;

    public k(long j4, long j5) {
        this.f1393l = j4;
        this.f1394m = j5;
    }

    public static long d(long j4, r rVar) {
        long u4 = rVar.u();
        if ((128 & u4) != 0) {
            return 8589934591L & ((((u4 & 1) << 32) | rVar.w()) + j4);
        }
        return -9223372036854775807L;
    }

    @Override // O0.b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f1393l + ", playbackPositionUs= " + this.f1394m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f1393l);
        parcel.writeLong(this.f1394m);
    }
}
