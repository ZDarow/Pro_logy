package a2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class e extends P1.a {
    public static final Parcelable.Creator<e> CREATOR = new O0.g(29);

    /* renamed from: l, reason: collision with root package name */
    public final Status f3607l;

    /* renamed from: m, reason: collision with root package name */
    public final f f3608m;

    public e(Status status, f fVar) {
        this.f3607l = status;
        this.f3608m = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.S(parcel, 1, this.f3607l, i4);
        AbstractC0462a.S(parcel, 2, this.f3608m, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
