package p057O0;

/* renamed from: O0.k */
/* loaded from: classes.dex */
public final class C0492k extends p057O0.AbstractC0483b {
    public static final android.os.Parcelable.Creator<p057O0.C0492k> CREATOR = new p057O0.C0488g(1);

    /* renamed from: l */
    public final long f1441l;

    /* renamed from: m */
    public final long f1442m;

    public C0492k(long j4, long j5) {
        this.f1441l = j4;
        this.f1442m = j5;
    }

    /* renamed from: d */
    public static long m998d(long j4, p086W.C0798r c0798r) {
        long m1559u = c0798r.m1559u();
        if ((128 & m1559u) != 0) {
            return 8589934591L & ((((m1559u & 1) << 32) | c0798r.m1561w()) + j4);
        }
        return -9223372036854775807L;
    }

    @Override // p057O0.AbstractC0483b
    public final java.lang.String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f1441l + ", playbackPositionUs= " + this.f1442m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        parcel.writeLong(this.f1441l);
        parcel.writeLong(this.f1442m);
    }
}
