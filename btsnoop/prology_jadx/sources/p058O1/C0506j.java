package p058O1;

/* renamed from: O1.j */
/* loaded from: classes.dex */
public final class C0506j extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0506j> CREATOR = new p057O0.C0488g(3);

    /* renamed from: l */
    public final int f1503l;

    /* renamed from: m */
    public java.util.List f1504m;

    public C0506j(int i4, java.util.List list) {
        this.f1503l = i4;
        this.f1504m = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1503l);
        p176p1.AbstractC1949a.m3919V(parcel, 2, this.f1504m);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
