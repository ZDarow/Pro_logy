package O1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class n extends P1.a {
    public static final Parcelable.Creator<n> CREATOR = new O0.g(5);

    /* renamed from: l, reason: collision with root package name */
    public final int f1460l;

    /* renamed from: m, reason: collision with root package name */
    public final Account f1461m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1462n;

    /* renamed from: o, reason: collision with root package name */
    public final GoogleSignInAccount f1463o;

    public n(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f1460l = i4;
        this.f1461m = account;
        this.f1462n = i5;
        this.f1463o = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f1460l);
        AbstractC0462a.S(parcel, 2, this.f1461m, i4);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f1462n);
        AbstractC0462a.S(parcel, 4, this.f1463o, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
