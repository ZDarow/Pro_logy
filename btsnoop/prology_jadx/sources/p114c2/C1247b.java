package p114c2;

/* renamed from: c2.b */
/* loaded from: classes.dex */
public final class C1247b extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p114c2.C1247b> CREATOR = new p104a2.C1009g(7);

    /* renamed from: l */
    public final int f4872l;

    /* renamed from: m */
    public final int f4873m;

    /* renamed from: n */
    public final android.content.Intent f4874n;

    public C1247b(int i4, int i5, android.content.Intent intent) {
        this.f4872l = i4;
        this.f4873m = i5;
        this.f4874n = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4872l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f4873m);
        p176p1.AbstractC1949a.m3916S(parcel, 3, this.f4874n, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
