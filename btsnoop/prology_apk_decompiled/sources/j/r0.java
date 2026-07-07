package j;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 extends H.c {
    public static final Parcelable.Creator<r0> CREATOR = new H.b(2);

    /* renamed from: n, reason: collision with root package name */
    public int f6735n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6736o;

    public r0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6735n = parcel.readInt();
        this.f6736o = parcel.readInt() != 0;
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f6735n);
        parcel.writeInt(this.f6736o ? 1 : 0);
    }
}
