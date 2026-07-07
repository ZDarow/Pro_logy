package p096Y1;

/* renamed from: Y1.t */
/* loaded from: classes.dex */
public final class C0909t extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p096Y1.C0909t> CREATOR = new p057O0.C0488g(23);

    /* renamed from: l */
    public final com.google.android.gms.common.api.Status f3236l;

    public C0909t(com.google.android.gms.common.api.Status status) {
        this.f3236l = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3916S(parcel, 1, this.f3236l, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
