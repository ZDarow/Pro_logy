package p104a2;

/* renamed from: a2.f */
/* loaded from: classes.dex */
public final class C1008f extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p104a2.C1008f> CREATOR = new p104a2.C1009g(0);

    /* renamed from: l */
    public final boolean f3733l;

    /* renamed from: m */
    public final boolean f3734m;

    /* renamed from: n */
    public final boolean f3735n;

    /* renamed from: o */
    public final boolean f3736o;

    /* renamed from: p */
    public final boolean f3737p;

    /* renamed from: q */
    public final boolean f3738q;

    public C1008f(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f3733l = z4;
        this.f3734m = z5;
        this.f3735n = z6;
        this.f3736o = z7;
        this.f3737p = z8;
        this.f3738q = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f3733l ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f3734m ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f3735n ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 4);
        parcel.writeInt(this.f3736o ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 5, 4);
        parcel.writeInt(this.f3737p ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 6, 4);
        parcel.writeInt(this.f3738q ? 1 : 0);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
