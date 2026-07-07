package Y1;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
public final class h extends W1.b implements a2.l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3089e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final a f3090d;

    public h(a aVar) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.f3090d = aVar;
    }

    @Override // W1.b
    public final boolean n0(Parcel parcel, int i4) {
        a aVar = this.f3090d;
        if (i4 == 1) {
            LocationResult locationResult = (LocationResult) c.a(parcel, LocationResult.CREATOR);
            c.c(parcel);
            aVar.d().a(new K2.o(18, locationResult));
        } else if (i4 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) c.a(parcel, LocationAvailability.CREATOR);
            c.c(parcel);
            aVar.d().a(new K2.o(19, locationAvailability));
        } else {
            if (i4 != 3) {
                return false;
            }
            o0();
        }
        return true;
    }

    public final void o0() {
        this.f3090d.d().a(new K2.o(20, this));
    }
}
