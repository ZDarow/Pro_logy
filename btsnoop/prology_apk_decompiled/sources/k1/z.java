package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z extends H.c {
    public static final Parcelable.Creator<z> CREATOR = new H.b(3);

    /* renamed from: n, reason: collision with root package name */
    public Parcelable f7038n;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7038n = parcel.readParcelable(classLoader == null ? s.class.getClassLoader() : classLoader);
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f7038n, 0);
    }
}
