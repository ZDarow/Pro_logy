package p114c2;

/* renamed from: c2.f */
/* loaded from: classes.dex */
public final class C1251f extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p114c2.C1251f> CREATOR = new p104a2.C1009g(9);

    /* renamed from: l */
    public final int f4877l;

    /* renamed from: m */
    public final p046L1.C0357a f4878m;

    /* renamed from: n */
    public final p058O1.C0511o f4879n;

    public C1251f(int i4, p046L1.C0357a c0357a, p058O1.C0511o c0511o) {
        this.f4877l = i4;
        this.f4878m = c0357a;
        this.f4879n = c0511o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f4877l);
        p176p1.AbstractC1949a.m3916S(parcel, 2, this.f4878m, i4);
        p176p1.AbstractC1949a.m3916S(parcel, 3, this.f4879n, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
