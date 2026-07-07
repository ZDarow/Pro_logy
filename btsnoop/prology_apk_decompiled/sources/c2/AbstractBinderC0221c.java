package c2;

import L.k;
import N1.A;
import N1.q;
import android.os.Parcel;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0221c extends W1.b {
    @Override // W1.b
    public final boolean l0(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                W1.c.b(parcel);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                W1.c.b(parcel);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                W1.c.b(parcel);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                W1.c.b(parcel);
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                C0224f c0224f = (C0224f) W1.c.a(parcel, C0224f.CREATOR);
                W1.c.b(parcel);
                A a4 = (A) this;
                a4.f1241e.post(new q(2, a4, c0224f));
                break;
            case 9:
                W1.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
