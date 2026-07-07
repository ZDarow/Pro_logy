package p058O1;

/* renamed from: O1.g */
/* loaded from: classes.dex */
public final class C0503g extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0503g> CREATOR = new p057O0.C0488g(4);

    /* renamed from: l */
    public final int f1486l;

    /* renamed from: m */
    public final int f1487m;

    /* renamed from: n */
    public final int f1488n;

    /* renamed from: o */
    public final long f1489o;

    /* renamed from: p */
    public final long f1490p;

    /* renamed from: q */
    public final java.lang.String f1491q;

    /* renamed from: r */
    public final java.lang.String f1492r;

    /* renamed from: s */
    public final int f1493s;

    /* renamed from: t */
    public final int f1494t;

    public C0503g(int i4, int i5, int i6, long j4, long j5, java.lang.String str, java.lang.String str2, int i7, int i8) {
        this.f1486l = i4;
        this.f1487m = i5;
        this.f1488n = i6;
        this.f1489o = j4;
        this.f1490p = j5;
        this.f1491q = str;
        this.f1492r = str2;
        this.f1493s = i7;
        this.f1494t = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1486l);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f1487m);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f1488n);
        p176p1.AbstractC1949a.m3925a0(parcel, 4, 8);
        parcel.writeLong(this.f1489o);
        p176p1.AbstractC1949a.m3925a0(parcel, 5, 8);
        parcel.writeLong(this.f1490p);
        p176p1.AbstractC1949a.m3917T(parcel, 6, this.f1491q);
        p176p1.AbstractC1949a.m3917T(parcel, 7, this.f1492r);
        p176p1.AbstractC1949a.m3925a0(parcel, 8, 4);
        parcel.writeInt(this.f1493s);
        p176p1.AbstractC1949a.m3925a0(parcel, 9, 4);
        parcel.writeInt(this.f1494t);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
