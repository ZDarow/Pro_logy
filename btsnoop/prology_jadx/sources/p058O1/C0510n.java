package p058O1;

/* renamed from: O1.n */
/* loaded from: classes.dex */
public final class C0510n extends p062P1.AbstractC0527a {
    public static final android.os.Parcelable.Creator<p058O1.C0510n> CREATOR = new p057O0.C0488g(5);

    /* renamed from: l */
    public final int f1511l;

    /* renamed from: m */
    public final android.accounts.Account f1512m;

    /* renamed from: n */
    public final int f1513n;

    /* renamed from: o */
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount f1514o;

    public C0510n(int i4, android.accounts.Account account, int i5, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.f1511l = i4;
        this.f1512m = account;
        this.f1513n = i5;
        this.f1514o = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i4) {
        int m3921X = p176p1.AbstractC1949a.m3921X(parcel, 20293);
        p176p1.AbstractC1949a.m3925a0(parcel, 1, 4);
        parcel.writeInt(this.f1511l);
        p176p1.AbstractC1949a.m3916S(parcel, 2, this.f1512m, i4);
        p176p1.AbstractC1949a.m3925a0(parcel, 3, 4);
        parcel.writeInt(this.f1513n);
        p176p1.AbstractC1949a.m3916S(parcel, 4, this.f1514o, i4);
        p176p1.AbstractC1949a.m3922Y(parcel, m3921X);
    }
}
