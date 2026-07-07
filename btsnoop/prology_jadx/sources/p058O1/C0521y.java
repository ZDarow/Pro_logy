package p058O1;

/* renamed from: O1.y */
/* loaded from: classes.dex */
public final class C0521y extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0521y> CREATOR = new p057O0.C0488g(8);

    /* renamed from: l */
    public android.os.Bundle f1538l;

    /* renamed from: m */
    public p046L1.C0359c[] f1539m;

    /* renamed from: n */
    public int f1540n;

    /* renamed from: o */
    public p058O1.C0500d f1541o;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        android.os.Bundle bundle = this.f1538l;
        if (bundle != null) {
            int m3921X2 = p176p1.AbstractC1949a.m3921X(parcel, 1);
            parcel.writeBundle(bundle);
            p176p1.AbstractC1949a.m3922Y(parcel, m3921X2);
        }
        p176p1.AbstractC1949a.m3918U(parcel, 2, this.f1539m, i4);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f1540n);
        p176p1.AbstractC1949a.m3916S(parcel, 4, this.f1541o, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
