package j;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 extends H.c {
    public static final Parcelable.Creator<e0> CREATOR = new H.b(1);

    /* renamed from: n, reason: collision with root package name */
    public boolean f6643n;

    public e0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6643n = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f6643n + "}";
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Boolean.valueOf(this.f6643n));
    }
}
