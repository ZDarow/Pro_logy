package p114c2;

/* renamed from: c2.e */
/* loaded from: classes.dex */
public final class C1250e extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p114c2.C1250e> CREATOR = new p104a2.C1009g(8);

    /* renamed from: l */
    public final java.util.ArrayList f4875l;

    /* renamed from: m */
    public final java.lang.String f4876m;

    public C1250e(java.lang.String str, java.util.ArrayList arrayList) {
        this.f4875l = arrayList;
        this.f4876m = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        java.util.ArrayList arrayList = this.f4875l;
        if (arrayList != null) {
            int m3921X2 = p176p1.AbstractC1949a.m3921X(parcel, 1);
            parcel.writeStringList(arrayList);
            p176p1.AbstractC1949a.m3922Y(parcel, m3921X2);
        }
        p176p1.AbstractC1949a.m3917T(parcel, 2, this.f4876m);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
