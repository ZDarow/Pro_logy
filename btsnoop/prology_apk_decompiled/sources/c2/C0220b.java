package c2;

import a2.g;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC0462a;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220b extends P1.a {
    public static final Parcelable.Creator<C0220b> CREATOR = new g(7);

    /* renamed from: l, reason: collision with root package name */
    public final int f4702l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4703m;

    /* renamed from: n, reason: collision with root package name */
    public final Intent f4704n;

    public C0220b(int i4, int i5, Intent intent) {
        this.f4702l = i4;
        this.f4703m = i5;
        this.f4704n = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int X3 = AbstractC0462a.X(parcel, 20293);
        AbstractC0462a.a0(parcel, 1, 4);
        parcel.writeInt(this.f4702l);
        AbstractC0462a.a0(parcel, 2, 4);
        parcel.writeInt(this.f4703m);
        AbstractC0462a.S(parcel, 3, this.f4704n, i4);
        AbstractC0462a.Y(parcel, X3);
    }
}
