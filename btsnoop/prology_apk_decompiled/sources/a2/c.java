package a2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class c extends P1.a {
    public static final Parcelable.Creator<c> CREATOR = new O0.g(28);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3603l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3604m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3605n;

    public c(ArrayList arrayList, boolean z4, boolean z5) {
        this.f3603l = arrayList;
        this.f3604m = z4;
        this.f3605n = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.V(parcel, 1, Collections.unmodifiableList(this.f3603l));
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f3604m ? 1 : 0);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f3605n ? 1 : 0);
        AbstractC0462a.Y(parcel, X3);
    }
}
