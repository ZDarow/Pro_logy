package I1;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public a(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
