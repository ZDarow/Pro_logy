package p104a2;

/* renamed from: a2.e */
/* loaded from: classes.dex */
public final class C1007e extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p104a2.C1007e> CREATOR = new p057O0.C0488g(29);

    /* renamed from: l */
    public final com.google.android.gms.common.api.Status f3731l;

    /* renamed from: m */
    public final p104a2.C1008f f3732m;

    public C1007e(com.google.android.gms.common.api.Status status, p104a2.C1008f c1008f) {
        this.f3731l = status;
        this.f3732m = c1008f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3916S(parcel, 1, this.f3731l, i4);
        p176p1.AbstractC1949a.m3916S(parcel, 2, this.f3732m, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
