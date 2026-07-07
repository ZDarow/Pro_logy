package p104a2;

/* renamed from: a2.c */
/* loaded from: classes.dex */
public final class C1005c extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p104a2.C1005c> CREATOR = new p057O0.C0488g(28);

    /* renamed from: l */
    public final java.util.ArrayList f3727l;

    /* renamed from: m */
    public final boolean f3728m;

    /* renamed from: n */
    public final boolean f3729n;

    public C1005c(java.util.ArrayList arrayList, boolean z4, boolean z5) {
        this.f3727l = arrayList;
        this.f3728m = z4;
        this.f3729n = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3919V(parcel, 1, java.util.Collections.unmodifiableList(this.f3727l));
        p176p1.AbstractC1949a.m3925a0(parcel, 2, 4);
        parcel.writeInt(this.f3728m ? 1 : 0);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f3729n ? 1 : 0);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
