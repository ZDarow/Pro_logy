package I0;

import B2.AbstractC0007h;
import F.i;
import T.F;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements F {
    public static final Parcelable.Creator<a> CREATOR = new i(1);

    /* renamed from: l, reason: collision with root package name */
    public final int f886l;

    /* renamed from: m, reason: collision with root package name */
    public final String f887m;

    public a(String str, int i4) {
        this.f886l = i4;
        this.f887m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f886l);
        sb.append(",url=");
        return AbstractC0007h.m(sb, this.f887m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f887m);
        parcel.writeInt(this.f886l);
    }
}
