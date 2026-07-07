package c2;

import O1.o;
import a2.g;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* renamed from: c2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224f extends P1.a {
    public static final Parcelable.Creator<C0224f> CREATOR = new g(9);

    /* renamed from: l, reason: collision with root package name */
    public final int f4707l;

    /* renamed from: m, reason: collision with root package name */
    public final L1.a f4708m;

    /* renamed from: n, reason: collision with root package name */
    public final o f4709n;

    public C0224f(int i4, L1.a aVar, o oVar) {
        this.f4707l = i4;
        this.f4708m = aVar;
        this.f4709n = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4707l);
        AbstractC0462a.S(parcel, 2, this.f4708m, i4);
        AbstractC0462a.S(parcel, 3, this.f4709n, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
