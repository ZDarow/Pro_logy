package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class t extends P1.a {
    public static final Parcelable.Creator<t> CREATOR = new O0.g(23);

    /* renamed from: l, reason: collision with root package name */
    public final Status f3125l;

    public t(Status status) {
        this.f3125l = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.S(parcel, 1, this.f3125l, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
