package p058O1;

/* renamed from: O1.d */
/* loaded from: classes.dex */
public final class C0500d extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0500d> CREATOR = new p057O0.C0488g(9);

    /* renamed from: l */
    public final p058O1.C0505i f1464l;

    /* renamed from: m */
    public final boolean f1465m;

    /* renamed from: n */
    public final boolean f1466n;

    /* renamed from: o */
    public final int[] f1467o;

    /* renamed from: p */
    public final int f1468p;

    /* renamed from: q */
    public final int[] f1469q;

    public C0500d(p058O1.C0505i c0505i, boolean z4, boolean z5, int[] iArr, int i4, int[] iArr2) {
        this.f1464l = c0505i;
        this.f1465m = z4;
        this.f1466n = z5;
        this.f1467o = iArr;
        this.f1468p = i4;
        this.f1469q = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3916S(parcel, 1, this.f1464l, i4);
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f1465m ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f1466n ? 1 : 0);
        int[] iArr = this.f1467o;
        if (iArr != null) {
            int m3921X2 = p176p1.AbstractC1949a.m3921X(parcel, 4);
            parcel.writeIntArray(iArr);
            p176p1.AbstractC1949a.m3922Y(parcel, m3921X2);
        }
        p176p1.AbstractC1949a.m3925a0(parcel, 5, 4);
        parcel.writeInt(this.f1468p);
        int[] iArr2 = this.f1469q;
        if (iArr2 != null) {
            int m3921X3 = p176p1.AbstractC1949a.m3921X(parcel, 6);
            parcel.writeIntArray(iArr2);
            p176p1.AbstractC1949a.m3922Y(parcel, m3921X3);
        }
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
