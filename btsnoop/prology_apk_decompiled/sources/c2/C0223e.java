package c2;

import a2.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1.AbstractC0462a;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223e extends P1.a {
    public static final Parcelable.Creator<C0223e> CREATOR = new g(8);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4705l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4706m;

    public C0223e(String str, ArrayList arrayList) {
        this.f4705l = arrayList;
        this.f4706m = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        ArrayList arrayList = this.f4705l;
        if (arrayList != null) {
            int X4 = AbstractC0462a.X(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC0462a.Y(parcel, X4);
        }
        AbstractC0462a.T(parcel, 2, this.f4706m);
        AbstractC0462a.Y(parcel, X3);
    }
}
