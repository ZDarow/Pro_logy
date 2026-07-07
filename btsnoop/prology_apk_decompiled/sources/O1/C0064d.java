package O1;

import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* renamed from: O1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064d extends P1.a {
    public static final Parcelable.Creator<C0064d> CREATOR = new O0.g(9);

    /* renamed from: l, reason: collision with root package name */
    public final i f1416l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1417m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1418n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f1419o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1420p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f1421q;

    public C0064d(i iVar, boolean z4, boolean z5, int[] iArr, int i4, int[] iArr2) {
        this.f1416l = iVar;
        this.f1417m = z4;
        this.f1418n = z5;
        this.f1419o = iArr;
        this.f1420p = i4;
        this.f1421q = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.S(parcel, 1, this.f1416l, i4);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f1417m ? 1 : 0);
        AbstractC0462a.a0(parcel, 3, 4);
        parcel.writeInt(this.f1418n ? 1 : 0);
        int[] iArr = this.f1419o;
        if (iArr != null) {
            int X4 = AbstractC0462a.X(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0462a.Y(parcel, X4);
        }
        AbstractC0462a.a0(parcel, 5, 4);
        parcel.writeInt(this.f1420p);
        int[] iArr2 = this.f1421q;
        if (iArr2 != null) {
            int X5 = AbstractC0462a.X(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0462a.Y(parcel, X5);
        }
        AbstractC0462a.Y(parcel, X3);
    }
}
