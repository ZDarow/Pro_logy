package p058O1;

/* renamed from: O1.i */
/* loaded from: classes.dex */
public final class C0505i extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0505i> CREATOR = new p057O0.C0488g(7);

    /* renamed from: l */
    public final int f1498l;

    /* renamed from: m */
    public final boolean f1499m;

    /* renamed from: n */
    public final boolean f1500n;

    /* renamed from: o */
    public final int f1501o;

    /* renamed from: p */
    public final int f1502p;

    public C0505i(int i4, boolean z4, boolean z5, int i5, int i6) {
        this.f1498l = i4;
        this.f1499m = z4;
        this.f1500n = z5;
        this.f1501o = i5;
        this.f1502p = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1498l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f1499m ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f1500n ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 4);
        parcel.writeInt(this.f1501o);
        p176p1.AbstractC1949a.m3925a0(parcel, 5, 4);
        parcel.writeInt(this.f1502p);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
