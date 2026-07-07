package H;

import L.k;
import android.os.Parcel;
import android.os.Parcelable;
import j.e0;
import j.r0;
import k1.z;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f696a;

    public /* synthetic */ b(int i4) {
        this.f696a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f696a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f697m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e0(parcel, classLoader);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new r0(parcel, classLoader);
            default:
                return new z(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f696a) {
            case 0:
                return new c[i4];
            case 1:
                return new e0[i4];
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new r0[i4];
            default:
                return new z[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f696a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f697m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e0(parcel, null);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new r0(parcel, null);
            default:
                return new z(parcel, null);
        }
    }
}
