package Y1;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class v extends W1.b implements w {
    public v() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    @Override // W1.b
    public final boolean n0(Parcel parcel, int i4) {
        if (i4 == 1) {
            t tVar = (t) c.a(parcel, t.CREATOR);
            c.c(parcel);
            j(tVar);
        } else {
            if (i4 != 2) {
                return false;
            }
            h0();
        }
        return true;
    }
}
